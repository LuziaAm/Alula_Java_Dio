package br.com.aulajava.aulainicio;

public class Lacos {

    public static void main(String[] args){

        var n1 = 1;
        var n2 = 10;
        final var condicao = false;

        if (condicao) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        final var ternario = condicao? "Verdade" : "Falsidade";

        System.out.println(ternario);
        
        for(int i = 0; i<= 10; i=i+1){
            System.out.print(" I= " + i);
        }
        for(int i = 0; i<= 5; i++){
            System.out.print(" I= " + i);
        }
        var x = 0;
        var y = 0;

        while (y < 1){
            System.out.print("\n Numero " + y);
            y++;
        }
        do{
            System.out.print("\n Numerodo  " + x);
        }while (x++ < 1);
    }
}
