public class Main {
    public static void main(String[] args) {
       Dog doggo=new Dog("doggo");
       Cat anubis=new Cat("anubis");

       Animal[] array= new Animal[2];
       array[0]= doggo;
       array[1]= anubis;
        System.out.println(array[0].name);
        System.out.println(array[1].name);

    }
}