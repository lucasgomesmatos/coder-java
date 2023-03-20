package ClassesEMetodos;

public class ValorVSReferencia {

    public static void main(String[] args) {
        int a = 2;
        int b = a; // atribuição de valor;

        a++;
        b--;

        System.out.println(a + " " + b);

        DesafioData d1 = new DesafioData(1,2,2023);
        DesafioData d2 = d1; // atribuição de referência (Objeto)

        d2.dia = 31;
        d1.mes = 12;


        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaPadrao(d1);

        System.out.println(d2.obterDataFormatada());
        System.out.println(d1.obterDataFormatada());
    }

    static void voltarDataParaPadrao(DesafioData d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
}
