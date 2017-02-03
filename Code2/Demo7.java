import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bb = new BigInteger("11111111111");
		BigDecimal b1 = new BigDecimal("100000000000.200");
		BigDecimal b2 = new BigDecimal("100000000000.300");
		BigDecimal b3 = b1.add(b2);
		System.out.println(b3);

	}

}
