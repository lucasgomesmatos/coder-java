package ArraysECollections;

public class EqualsAndHashCode {

    public static void main(String[] args) {
        Usuario u1 = new Usuario("Pedro Silva", "pedro.silva@gmail.com");
        Usuario u2 = new Usuario("Pedro Silva", "pedro.silva@gmail.com");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
    }
}
