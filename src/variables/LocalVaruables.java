package variables;

public class LocalVaruables {

    /*Lokal dəyişənlər metod daxilində yaradılmış dəyişənlərdir. Lokal dəyişənlərin varsayılan
            (default) dəyəri olmur, ona görə də onları istifadə etməzdən əvvəl mütləq dəyər
    mənimsədilməlidir.
*/

    public void testLocalInitialization() {
        int count = 5;
        int number;
        if (count > 5) number = 1;
        else if (count <= 5) number = 2;
        System.out.println(number); // doesn`t compile
    }

        // number dəyişəninə dəyər mənimsədilməmiş istifadə edildiyinə görə kompayl xətası verir.

/*        number dəyişəninə dəyər mənimsədilməmiş istifadə edildiyinə görə kompayl xətası verir. Biz
        fikirləşə bilərik ki, axı if şərtinin içərisində dəyər mənimsədilib, count ya 5-dən böyükdür, ya
        bərabərdir, ya da kiçikdir. Axı istənilən halda bu iki şərtdən biri ödənəcək. Bəs onda niyə
        kompilyator number`i dəyəri mənimsədilməmiş kimi görür?! Çünki kompayl zamanı (compile
        time) kompilyator bunu təyin edə bilmir, ancaq icra vaxtı (runtime) bilir. Amma əgər biz
        count dəyişənini final elan etsək o zaman kod kompayl olunacaq. Və yaxud da sona else
        ifadəsi əlavə etsək, kompayl olunacaq. Çünki if-else strukturunda dəyər mənimsədildikdə
        kompilyator başa düşür ki, heç bir şərtdən asılı olmayaraq istənilən halda if şərti ödənməsə,
else blokuna müraciət olunacaq və dəyər mənimsədiləcək.*/

        public void testLocalInitialization1() {
            int count = 5;
            int number;
            if (count > 5) number = 1;
            else if (count <= 5) number = 2;
            else number = 3;
            System.out.println(number); // does compile
        }

        /*
        * Dəyişən final elan edildikdə isə kompilyator başa düşür ki, həmin dəyişənin dəyəri heç vaxt
dəyişə bilməz və ona görə də kompilyator həmin dəyişənin dəyərini birbaşa şərtə qoyub
yoxlayır.
*/
        public void testLocalInitialization2() {
            final int count = 5;
            int number ;
            if (count > 8) number = 1;
            else if (count <= 4) number = 2;
            else number =3;
                System.out.println(number);
        }


    }
