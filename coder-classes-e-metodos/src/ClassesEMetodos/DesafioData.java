package ClassesEMetodos;

public class DesafioData {
    int dia;
    int mes;
    int ano;


    DesafioData() {
//       this.dia = 1;
//       this.mes = 1;
//       this.ano= 1970;

        this(1,1,1970);
    }

    public DesafioData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
    }
}
