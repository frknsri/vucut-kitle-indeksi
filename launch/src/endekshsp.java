import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

    public class endekshsp {
        public static void main(String[] args) {
            double boy, kilo;

            Scanner inp = new Scanner(System.in);

            System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :  ");
            boy = inp.nextDouble();
            System.out.print("Lütfen kilonuzu giriniz :  ");
            kilo = inp.nextDouble();

            double kitle = (kilo / (boy * boy));

            boolean olcu = kitle <= 30;

            System.out.println("Vucut Kitle İndeksiniz  : " + kitle);
            String inpi =  olcu ?  "obez değil"  : " obez hayvan kadar yemiş" ;
            System.out.println(inpi);
            








        }




    }
