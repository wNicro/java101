public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name, int damage, int health, int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if(dodge >= 0 && dodge<=100){
            this.dodge = dodge;
        }else {
            this.dodge = 0;
        }
    }

    int hit(Fighter atack) {
        System.out.println(this.name + "  =>" + atack.name + " "+ this.damage + " hasar vurdu.");
        if(atack.isDodge()){
            System.out.println( atack.name + " gelen hasarı blokladı !");
            return atack.health;
        }
        if(atack.health - this.damage <0){
            return 0;
        }
        return atack.health-this.damage;
    }

    boolean isDodge(){
        double randomValue = Math.random()*100; //0 ile 1 arası random sayı üretiyoruzz.
        return randomValue <= this.dodge;
    }

}
