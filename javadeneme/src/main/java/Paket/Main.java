package Paket;
import org.apache.commons.lang3.StringUtils;
public class Main {

	public static void main(String[] args) {
		
		String metin ="m e di p   o   l";
		
		System.out.println(metin);
		 System.out.println();
		metin=StringUtils.deleteWhitespace(metin);
		System.out.println(metin);

	}

}
