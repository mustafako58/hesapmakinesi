package hesapmakinesi;

import java.util.Scanner;

public class hesapmakinesi {
        
	public static void main (String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println( "Hesap Makinesine Ho�geldiniz!");
		
		double sayi1,sayi2,secim;
		System.out.println("L�tfen 1.say�y� giriniz");
		sayi1=sc.nextDouble();
		//System.out.println(sayi1);
		System.out.println("L�tfen 2.say�y� giriniz");
		sayi2=sc.nextDouble();
		//System.out.println(sayi2);
		System.out.println("yap�lacak i�lemi se�iniz: 1=+,2=-,3=*,4=/");
		System.out.println("Secim:"  );
		secim=sc.nextDouble();
			if(secim==1) {
				System.out.println("sonu�="+ (sayi1+sayi2))	;
				
			} 
			if(secim==2) {
				System.out.println("sonuc="+(sayi1-sayi2));
				
			}
			if(secim==3) {
				System.out.println("sonuc="+(sayi1*sayi2));
				
			}
			if(secim==4) {
				System.out.println("sonuc="+(sayi1/sayi2));
				
			}
	}

}
