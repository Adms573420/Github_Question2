public class Methods {
    public static void main(String[] args) {
        /*
		 Soru : Verilen bir fiyat icin %10 indirim yapan bir method olusturun.
		 - Method’da indirim uygulanan fiyati yazdirin
		 - Method Call sonrasi original fiyati yazdirin ve method’da yapilan degisikligin
		   orginal degeri degistirip degistirmedigini kontrol edin.
		 */


        System.out.println(indirim(100));
    }

    static double indirim(double fiyat){
        fiyat*=0.9;
        return fiyat;
    }
}
