import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int [] dizi = {10,20,20,10,10,20,5,20};
        int [] diziT = new int[dizi.length];
        int start = 0;
        int sayac =0;
	    for (int i = 0;i < dizi.length;i++){
	        if (dizi[i] != diziT[sayac]) {
                for (int j = 0; j < dizi.length; j++) {
                    if ((i != j) && (dizi[i] == dizi[j])) {
                        start++;
                        diziT[sayac] = dizi[i];
                    }
                }
                System.out.println("Dizinin " + dizi[i] + " elemanı " + (start + 1) + " Tekrar Etmiştir...");
                start = 0;
            }
        }
    }
}
