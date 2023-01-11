//Tarefa 1
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in); //STDIN
        String frase = scan.nextLine(); //STDIN
        System.out.println("Hello, World."); //STDOUT
        System.out.println(frase); //STDOUT
    }
}
//Tarefa 2
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    int i = 4;
    double d = 4.0;
    String s = "HackerRank";
    
    Scanner scan = new Scanner(System.in);
    int inteiro = scan.nextInt();
    double decimal = scan.nextDouble();
    scan.nextLine();
    String texto = scan.nextLine();
    
    System.out.println(i + inteiro);
    System.out.println(d + decimal);
    System.out.println(s + " " + texto);
    }
}
//Tarefa 3
public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
        double custo_ref = meal_cost, gorjeta = tip_percent, imposto = tax_percent;
        int custo_total = (int)Math.round((custo_ref*gorjeta)/100.00 + (custo_ref*imposto)/100.00 + custo_ref);
        System.out.println(custo_total);
    }
//Tarefa 4.1
        if (N%2 == 1){
            System.out.println("Weird");
        }
        else if (N%2 == 0 && N >= 2 && N <= 5){
            System.out.println("Not Weird");
        }
        else if (N%2 == 0 && N >= 6 && N <= 20){
            System.out.println("Weird");
        }
        else if (N%2 == 0 && N > 20){
            System.out.println("Not Weird");
        }
//Tarefa 4.2
        String saida = "";
        int r = N%2;
        switch (r) {
            case 0 :
                if(N >= 2 && N <=5)
                    saida = "Not Weird";
                
                else if(N >= 6 && N <=20)
                    saida = "Weird";
                
                else if(N > 20)
                    saida = "Not Weird";
            
                break;
            case 1 :
                saida = "Weird";
                break;
        }
        System.out.println(saida);
