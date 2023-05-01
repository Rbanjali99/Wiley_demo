package RandomConcepts;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Currency usd = Currency.getInstance("USD");
		NumberFormat frm = NumberFormat.getCurrencyInstance(Locale.US);
		String Val = frm.format(108.5);
		
		System.out.println(Val);
		
		NumberFormat frm1 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		String Val1 = frm1.format(108.5);
		
		System.out.println(Val1);
		
		double price = 2000.54;
		Locale local = new Locale("en","US");
		NumberFormat currency = NumberFormat.getCurrencyInstance(local);
		String finalprice = currency.format(price);
		System.out.println(finalprice);
		
		DecimalFormat decimalFormatter = new DecimalFormat("#,##0.00");
		decimalFormatter.setPositivePrefix("$");
		String resVal = decimalFormatter.format(price);
		
		System.out.println("Custom Format : " + resVal);
		
		Currency cur = Currency.getInstance("USD");
		String symbol = cur.getSymbol();
		String code = cur.getCurrencyCode();
		System.out.println(symbol);
		System.out.println(code);
		
	}

}
