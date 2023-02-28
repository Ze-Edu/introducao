import javax.swing.JOptionPane;

public class Variaveis {
    //Método orincipal
    public static void main (String [] args){
        //Declarar 2 variáveis inteiras
        int n1, n2;

        //Declarar 3 variáveis double
        double pUnitario, peso;
        double pTotal;

        //Atribuição de valores
        n1 = 34;
        n2 = -75;

        pUnitario = 2.75;
        peso = 2.4;
        pTotal = pUnitario * peso;

        //Exibir valores usando println
        System.out.println (n1);

        //Concatenando uma string a um valor
        System.out.println ("O Numero 2: " + n2);

        //Criando uma váriavel de soma
        int soma = n1 + n2;
        System.out.println("Soma: " + soma);

        //Exibindo a operação no print:
        System.out.println("Subtracao: " + (n1 - n2));

        //Usando outros valores usando a interface gráfica
        JOptionPane.showMessageDialog(null,"Preco unitario: " + pUnitario);
        JOptionPane.showMessageDialog(null,"Total a pagar: " + pTotal);

        //Declarar duas variáveis tipo string
        String nome, sobreNome;
        //Ler a variável nome
        nome = JOptionPane.showInputDialog ("Digite seu primeiro nome");
        //Ler a variável sobreNome
        sobreNome = JOptionPane.showInputDialog ("Digite seu sobre nome");
        //Exibir nome completo
        JOptionPane.showMessageDialog(null,"eai " + nome + " " + sobreNome + " bem vindo!");
    }
}