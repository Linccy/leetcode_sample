package leetcode_simple;

import java.util.ArrayList;
import java.util.List;

import leetcode_simple.LFUCache.Cache;

public class LFUCache {
	public static void main(String[] args) {
		LFUCache cache = new LFUCache(2 /* capacity */ );

		cache.put(1, 1);
		cache.put(2, 2);
		System.out.println(cache.get(1)); // returns 1
		cache.put(3, 3); // evicts key 2
		System.out.println(cache.get(2)); // returns -1 (not found)
		System.out.println(cache.get(3)); // returns 3.
		cache.put(4, 4); // evicts key 1.
		System.out.println(cache.get(1)); // returns -1 (not found)
		System.out.println(cache.get(3)); // returns 3
		System.out.println(cache.get(4)); // returns 4
	}

	class Cache {
		int key;
		int value;
		int times = 1;

		public Cache(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	List<Cache> caches = new ArrayList<Cache>();
	int capacity;

	public LFUCache(int capacity) {
		this.capacity = capacity;
	}

	public int get(int key) {
		for (Cache cache : caches) {
			if (key == cache.key) {
				caches.remove(cache);
				caches.add(cache);
				cache.times++;
				return cache.value;
			}
		}
		return -1;
	}

	public void put(int key, int value) {
		caches.add(new Cache(key, value));
		if (coinstans(caches, key)) {
			Cache cache = getCache(key);
			cache.value = value;
			cache.times++;
		} else {
			caches.add(new Cache(key, value));
		}
		if (caches.size() > capacity) {
			caches.remove(0);
		}
	}

	public boolean coinstans(List<Cache> caches, int key) {
		for (Cache cache : caches) {
			if (key == cache.key) {
				return true;
			}
		}
		return false;
	}

	public Cache getCache(int key) {
		for (Cache cache : caches) {
			if (key == cache.key) {
				return cache;
			}
		}
		return null;
	}
}
