public class Main {
    public static void main(String[] args) {
    
        Pessoa obj1 = new Pessoa();
        Pessoa obj2 = new Pessoa("Dj Scar", 0);
        Pessoa obj3 = new Pessoa("Dj Zigão da 2", 2, 78945612310);

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
    }
}