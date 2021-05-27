package  com.calculadora ;
import  java.util.Scanner ;
public  class  Calculadora {
    public  static  void  main ( String [] args ) {
     int main_question;
     Pergunta do scanner =  novo  scanner ( sistema . In);
     Sistema . para fora . println ( " Selecione a tarefa: 1 = Calculadora, 2 = sair " );
      main_question = question . nextInt ();
        switch (main_question) {
             caso  1 :
                int operacao;
                Scanner escolha =  novo  Scanner ( System . In );
                Sistema . para fora . println ( " INSIRA O TIPO DE OPERAÇÃO: 1-adição, 2-subtração, 3-multiplicação, 4-divisão " );
                operacao = escolha . nextInt ();
                switch (operação) {
                    caso  1 :
                    int   a, b, soma;
                        Scanner numb =  novo  Scanner ( Sistema . In);
                        Sistema . para fora . println ( " Insira numeros da operação " );
                        a = entorpecido . nextInt ();
                        b = entorpecido . nextInt ();
                        soma = a + b;
                        Sistema . para fora . println ( " O resultado da operação é "  + soma);

                    pausa ;
                        caso  2 :
                        int a1, b1, subt;
                        Scanner numb1 =  novo  Scanner ( Sistema . In );
                        Sistema . para fora . println ( " Insira numeros da operação " );
                        a1 = numb1 . nextInt ();
                        b1 = numb1 . nextInt ();
                        subt = a1 - b1;
                        Sistema . para fora . println ( " O resultado da operação é "  + subt);
                    pausa ;
                    caso  3 :
                    int a2, b2, mult;
                        Scanner numb2 =  novo  Scanner ( Sistema . In );
                        Sistema . para fora . println ( " Insira numeros da operação " );
                        a2 = numb2 . nextInt ();
                        b2 = numb2 . nextInt ();
                        mult = a2 * b2;
                        Sistema . para fora . println ( " O resultado da operação é "  + mult);
                    pausa ;
                    caso  4 :
                    int a3, b3, divs;
                        Scanner numb3 =  novo  Scanner ( Sistema . In );
                        Sistema . para fora . println ( " Insira numeros da operação " );
                        a3 = numb3 . nextInt ();
                        b3 = numb3 . nextInt ();
                        divs = a3 / b3;
                        Sistema . para fora . println ( " O resultado da operação é "  + divs);
                    pausa ;
                    padrão :
                        lance  novo  IllegalArgumentException ();
                    
                     }
            caso  2 :
            Sistema . para fora . println ( " volte sempre !! " );
            pausa ;

            }
    
}}