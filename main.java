import java.util.Scanner;
public class main{
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        asteriscos();
        escrever("Seja bem vindo usuario!");

    
        escrever("digite um  tipo, e os 3 inteiros subsequentes");
        String respostaTipo = teclado.next();
        String argumento1 =  teclado.next();
        String argumento2 =  teclado.next();
        String argumento3 =  teclado.next();
        
        if(verificarTipoCorreto(respostaTipo)) {
            tempo tempo = criarObjeto(respostaTipo, argumento1, argumento2, argumento3);
            dadosTempo(tempo);

        }

    }

    public static void asteriscos(){
        System.out.println("******************************");
    }

    public static void escrever(String  texto){
        System.out.println(texto);
    }

    public static boolean verificarTipoCorreto(String respostaTipo) {
        switch (respostaTipo) {
            case "horario":
                return true;

            case "data":
                return true;

            default:
                escrever("DEU ERRO NO TIPO");
                escrever("falha ao criar objeto");
                return false;
        }

    }

    public static void dadosTempo(tempo tempo) {
        escrever(tempo.retornaTempoString());
        escrever(Long.toString(tempo.retornaTempoLong()) );


    }


    public static tempo criarObjeto(String tipo, String argumento1, String argumento2, String argumento3) {
        Integer argumento1Int =  Integer.parseInt(argumento1);
        Integer  argumento2Int =  Integer.parseInt(argumento2);
        Integer  argumento3Int =  Integer.parseInt(argumento3);
        switch (tipo) {
            case "horario":
                return new horario(argumento1Int, argumento2Int, argumento3Int);
            case "data":
                return new data(argumento1Int, argumento2Int, argumento3Int);
            case "tempo":
            return new tempo();
            default:
                return null;
        }
    }
}

class tempo{

    public long retornaTempoLong() {
        return 0;
    }

    public String retornaTempoString() {
        return null;
    }
}

class horario extends tempo{
    Integer hora;
    Integer minuto;
    Integer  segundo;

    public horario(){

    }

    public horario(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

 
    public Integer getHora() {
        return hora;
    }


    public void setHora(Integer hora) {
        this.hora = hora;
    }


    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }


    public Integer getSegundo() {
        return segundo;
    }


    public void setSegundo(Integer segundo) {
        this.segundo = segundo;
    }

    public long retornaTempoLong() {
      return hora * 3600 + minuto * 60 + segundo;
    }

    public String  retornaTempoString() {
        return this.hora + ":"  + this.minuto + ":" + this.segundo;
     }
}

class data extends tempo {
    Integer dia;
    Integer  mes;
    Integer  ano;

    public data() {

    }


    public data(Integer dia, Integer mes, Integer ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }


    public Integer getDia() {
        return dia;
    }


    public void setDia(Integer dia) {
        this.dia = dia;
    }


    public Integer getMes() {
        return mes;
    }


    public void setMes(Integer mes) {
        this.mes = mes;
    }


    public Integer getAno() {
        return ano;
    }


    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public long retornaTempoLong() {
        return ano * 31104000 + mes * 2592000 + dia * 86400;
    }

    public String retornaTempoString() {
        return dia + "/" + mes + "/" + ano;
    }
}