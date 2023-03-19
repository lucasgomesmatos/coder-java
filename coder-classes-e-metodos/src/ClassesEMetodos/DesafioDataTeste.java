package ClassesEMetodos;

public class DesafioDataTeste {
    public static void main(String[] args) {



        var data1 = new DesafioData();
        System.out.println(data1.obterDataFormatada());


        var data2 = new DesafioData(10, 10, 2023);
        System.out.println(data2.obterDataFormatada());

    }
}
