package com.example.wojtek.nauka_pa;


/**
 * Created by Wojtek on 12.01.2018.
 */

public class pytaniawbazie {



    public void kreacja(bazadanych object){


    Pytanie pytanie1 = new Pytanie();
        pytanie1.setPytanie( "Co oznacza słowo CALLBACK w prototypie funkcji?");
        pytanie1.setOdp_A("A: Służy do zawołania prowadzącego, aby pomógł w pisaniu kodu");
        pytanie1.setOdp_B("B: Jest to wywołanie zwrotne - odwrotność wywołania funkcji");
        pytanie1.setOdp_C("C: Służy do bezpośredniego wywołania funkcji");
        pytanie1.setOdp_D("D: Nic nie oznacza, jest to błędna komenda");
        pytanie1.setPoprawna("OdpB");
        pytanie1.setLiczba_poprawnych(1);



    Pytanie pytanie2 = new Pytanie();
        pytanie2.setPytanie( "Obfuskacja:");
        pytanie2.setOdp_A("A: Polepsza czytelność kodu źródłowego");
        pytanie2.setOdp_B("B: Przekształca kod programu, aby utrudnić jego zrozumienie");
        pytanie2.setOdp_C("C: Jest stosowana przez dra Urbańskiego, aby lepiej wyjaśnić działanie programu");
        pytanie2.setOdp_D("D: Utrudnia inżynierię wsteczną programu");
        pytanie2.setPoprawna("OdpB");
        pytanie2.setPoprawna2("OdpD");
        pytanie2.setLiczba_poprawnych(2);



    Pytanie pytanie3 = new Pytanie();
        pytanie3.setPytanie("Odebrano z sieci liczbę p, którą jest adres IPv4. Aby prawidłowo odczytać jej wartość w języku C, powinniśmy użyć:");
        pytanie3.setOdp_A("A: ntohs()");
        pytanie3.setOdp_B("B: htons()");
        pytanie3.setOdp_C("C: ntohl()");
        pytanie3.setOdp_D("D: htonl()");
        pytanie3.setPoprawna("OdpC");
        pytanie3.setLiczba_poprawnych(1);



    Pytanie pytanie4=new Pytanie();
        pytanie4.setPytanie("Złożoność obliczeniowa sortowania bąbelkowego to");
        pytanie4.setOdp_A("A: O(log(n))");
        pytanie4.setOdp_B("B: O(nlog(n))");
        pytanie4.setOdp_C("C: O(n)");
        pytanie4.setOdp_D("D: O(n^2)");
        pytanie4.setPoprawna("OdpD");
        pytanie4.setLiczba_poprawnych(1);




     Pytanie pytanie5 = new Pytanie();
        pytanie5.setPytanie("Delegat jest to:");
        pytanie5.setOdp_A("A: Mechanizm wspomagający obsługę zdarzeń w języku C#");
        pytanie5.setOdp_B("B: Mechanizm wspomagający operacje wielowątkowe w C#");
        pytanie5.setOdp_C("C: Mechanizm wspomagający obsługę zdarzeń w języku Java");
        pytanie5.setOdp_D("D: Mechanizm wspomagający operacje wielowątkowe w Javie");
        pytanie5.setPoprawna("OdpB");
        pytanie5.setLiczba_poprawnych(1);



        Pytanie pytanie6 = new Pytanie();
        pytanie6.setPytanie("Serializacja");
        pytanie6.setOdp_A("A: Ułatwia wymianę danych między apliacjami");
        pytanie6.setOdp_B("B: Jest wbudowana w język C");
        pytanie6.setOdp_C("C: Jest wbudowana w język Java");
        pytanie6.setOdp_D("D: Jest realizowana przy użyciu języka XML");
        pytanie6.setPoprawna("OdpA");
        pytanie6.setPoprawna2("OdpC");
        pytanie6.setPoprawna3("OdpD");
        pytanie6.setLiczba_poprawnych(3);

        Pytanie pytanie7 = new Pytanie();
        pytanie7.setPytanie("Masz gotowe biblioteki x.dll oraz y.dll i aplikację napisaną w C (WINApi). Użytkownik aplikacji ma sam decydować, z której biblioteki chce wywołać funkcję f(). W aplikacji posłużysz się:");
        pytanie7.setOdp_A("A: Mechanizmem DLL typu 'load-time' ");
        pytanie7.setOdp_B("B: Mechanizmem DLL typu 'run-time' ");
        pytanie7.setOdp_C("C: Funkcją LoadLibrary(...)");
        pytanie7.setOdp_D("D: Funkcją GetProcAddress(...)");
        pytanie7.setPoprawna("OdpB");
        pytanie7.setPoprawna2("OdpC");
        pytanie7.setPoprawna3("OdpD");
        pytanie7.setLiczba_poprawnych(3);


        Pytanie pytanie8 = new Pytanie();
        pytanie8.setPytanie("Jaka jest złożoność obliczeniowa sortowania qsort?");
        pytanie8.setOdp_A("A: O(nlog(n))");
        pytanie8.setOdp_B("B: O(log(n))");
        pytanie8.setOdp_C("C: O(n^2)");
        pytanie8.setOdp_D("D: O(n^2(log(n)))");
        pytanie8.setPoprawna("OdpA");
        pytanie8.setLiczba_poprawnych(1);

        Pytanie pytanie9 = new Pytanie();
        pytanie9.setPytanie("Antywzorcem projektowym jest:");
        pytanie9.setOdp_A("A: U mnie działa");
        pytanie9.setOdp_B("B: Obserwator");
        pytanie9.setOdp_C("C: Spaghetti code");
        pytanie9.setOdp_D("D: Anizotropia");
        pytanie9.setPoprawna("OdpA");
        pytanie9.setPoprawna2("OdpC");
        pytanie9.setLiczba_poprawnych(2);

        Pytanie pytanie10 = new Pytanie();
        pytanie10.setPytanie("Wzorcem projektowym jest:");
        pytanie10.setOdp_A("A: Singleton");
        pytanie10.setOdp_B("B: Obserwator");
        pytanie10.setOdp_C("C: Copypasteryzm");
        pytanie10.setOdp_D("D: Prototyp");
        pytanie10.setPoprawna("OdpA");
        pytanie10.setPoprawna2("OdpB");
        pytanie10.setPoprawna3("OdpD");
        pytanie10.setLiczba_poprawnych(3);



        object.dodajPytanie(pytanie1);
        object.dodajPytanie(pytanie2);
        object.dodajPytanie(pytanie3);
        object.dodajPytanie(pytanie4);
        object.dodajPytanie(pytanie5);
        object.dodajPytanie(pytanie6);
        object.dodajPytanie(pytanie7);
        object.dodajPytanie(pytanie8);
        object.dodajPytanie(pytanie9);
        object.dodajPytanie(pytanie10);

    }
}
