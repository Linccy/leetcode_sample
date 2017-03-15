package short_simple;

public class Power {
	
	/**
	 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η�
	 * @param base
	 * @param exponent
	 * @return
	 */
	 public double Power(double base, int exponent) {
	        double result = 1;
	        if (exponent == 0) {
	            return 1;
	        } else if (exponent > 0) {
	            for (int i = 0; i < exponent; i++) {
	                result = result * base;
	            }
	        } else if (exponent < 0) {
	            int et = -exponent;
	            for (int i = 0; i < et; i++) {
	                result = result * base;
	            }
	            result = 1 / result;
	        }
	        return result;
	    }
}
