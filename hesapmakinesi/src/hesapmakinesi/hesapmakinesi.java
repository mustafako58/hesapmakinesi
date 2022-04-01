package hesapmakinesi;

import java.util.Scanner;

public class hesapmakinesi {
        
	public static void main (String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println( "Hesap Makinesine Hoþgeldiniz!");
		
		double sayi1,sayi2,secim;
		System.out.println("Lütfen 1.sayýyý giriniz");
		sayi1=sc.nextDouble();
		//System.out.println(sayi1);
		System.out.println("Lütfen 2.sayýyý giriniz");
		sayi2=sc.nextDouble();
		//System.out.println(sayi2);
		System.out.println("yapýlacak iþlemi seçiniz: 1=+,2=-,3=*,4=/");
		System.out.println("Secim:"  );
		secim=sc.nextDouble();
			if(secim==1) {
				System.out.println("sonuç="+ (sayi1+sayi2))	;
				
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
