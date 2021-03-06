package java7;

public class TestStringFormat {
public static void main(String[] args) {
	/**
	 * 转  换  符	说    明 	示    例
			%s	字符串类型	"mingrisoft"
			%c	字符类型	'm'
			%b	布尔类型	true
			%d	整数类型（十进制）	99
			%x	整数类型（十六进制）	FF
			%o	整数类型（八进制）	77
			%f	浮点类型	99.99
			%a	十六进制浮点类型	FF.35AE
			%e	指数类型	9.38e+5
			%g	通用浮点类型（f和e类型中较短的）	 
			%h	散列码	 
			%%	百分比类型	％
			%n	换行符	 
			%tx	日期与时间类型（x代表不同的日期与时间转换符	 

	 */
	System.out.println(String.format("%s is %s ", "1","2"));
	System.out.println(String.format("%n is %n ", 1,2));
	String i = "11111";
	System.out.println(i.hashCode());

}
}
