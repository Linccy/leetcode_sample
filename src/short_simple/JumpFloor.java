package short_simple;

public class JumpFloor {
	/**
	 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
	 * @param target
	 * @return
	 */
	public int JumpFloor(int target) {
        if(target <=2){
            return target;
        }
		int[] arr = new int[target+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for(int i=3;i<=target;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[target];
    }
}
