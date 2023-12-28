public class Employe {
    String name;
    double salary;
    int workHours;
    int hireYear;

    double vergiMiktari;
    double bonusMiktari;
    double maasArtisi;
    double toplamMaas;
    double eskiMaas;
    Employe(String name, double salary, int workHours, int hireYear){
        this.salary = salary;
        this.name = name;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax(Employe vergi){
        if(vergi.salary >=1000){
            vergi.vergiMiktari = (vergi.salary * 3)/100;

        }
        else{
            vergi.vergiMiktari = 0;
        }
        return vergi.vergiMiktari;
    }

    public double bonus(Employe Bonus){
        if(Bonus.workHours >40){
            Bonus.bonusMiktari = (Bonus.workHours - 40)*30;
        }else{
            Bonus.bonusMiktari =0;
        }
        return Bonus.bonusMiktari;
    }

    public double raiseSalary(Employe maasArtis){
        if(2021-maasArtis.hireYear <10){
            maasArtis.maasArtisi = (maasArtis.salary*5)/100;
        }else if (2021-maasArtis.hireYear >=10 && 2021-maasArtis.hireYear <20){
            maasArtis.maasArtisi = (maasArtis.salary*10)/100;
        }else if(2021-maasArtis.hireYear >=20){
            maasArtis.maasArtisi = (maasArtis.salary*15)/100;
        }
        return maasArtis.maasArtisi;
    }
    public void plusC(Employe Maas) {
    Maas.eskiMaas =  Maas.salary-Maas.vergiMiktari+Maas.bonusMiktari;
    Maas.toplamMaas = Maas.eskiMaas + Maas.maasArtisi;
    }
    public void verilerGoruntuleme(Employe kisi) {

        tax(kisi);
        bonus(kisi);
        raiseSalary(kisi);
        plusC(kisi);
        System.out.println("------------");
        System.out.println("Adı \t: "+kisi.name);
        System.out.println("Maaşı \t: "+kisi.salary);
        System.out.println("Çalışma Saati \t: "+kisi.workHours);
        System.out.println("Başlangıç Yılı \t: "+kisi.hireYear);
        System.out.println("Vergi \t: "+kisi.vergiMiktari);
        System.out.println("Bonus \t: "+kisi.bonusMiktari);
        System.out.println("Maaş Artisi \t: "+kisi.maasArtisi);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş \t: "+kisi.eskiMaas);
        System.out.println("Toplam Maaş \t: "+kisi.toplamMaas);
        System.out.println("------------");
    }
}
