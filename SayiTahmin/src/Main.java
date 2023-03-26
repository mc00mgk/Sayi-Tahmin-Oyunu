import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(100);
		
		try (Scanner input = new Scanner(System.in)) {
			int right = 0;
			int selected;
			int[] wrong = new int[5];
			Boolean isWin = true;
			
			while(right<5) {
				System.out.print("Lutfen bir sayi degeri giriniz : ");
				selected = input.nextInt();
				
				if(selected<0 || selected>99) {
					System.out.println("Lutfen 0-100 arasinda bir deger giriniz : ");
					continue;
				}
				
				if(selected == number) {
					System.out.println("tebrikler , dogru tahmin.");
					isWin = true;
					break;
				}else {
					System.out.println("Yanlis tahmin tekrar deneyiniz:");
					if(selected>number) {
						System.out.println(selected + " "+"sayisi gizli sayidan buyuktur. ");
					}else {
						System.out.println(selected +  " " +"sayisi gizli sayidan kucuktur");
					}
					wrong[right++] = selected;
					System.out.println("kalan hakkiniz : " + (5-right));
					
				}
				if(isWin) {
					System.out.println(" Kaybettiniz ! ");
					System.out.println("Girdiginiz sayilar : "+ Arrays.toString(wrong));
				}
			}
			
		}
		
		System.out.println(number);

	}

}
