import java.util.Scanner;
public class biblioAreas
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        double baseT, heightT, baseR, heightR, side, ray, area;
        int op;
        System.out.println("\f qual a operaço a ser realizada?");
        System.out.println("1 - Area do Triangulo");
        System.out.println("2 - Area do Retangulo");
        op = in.nextInt();
        switch(op){
            case 1:
                System.out.println("Qual a altura do triangulo?");
                heightT = in.nextDouble();
                System.out.println("Qual a base do triangulo?");
                baseT = in.nextDouble();
                area = triangulo(baseT, heightT);
                System.out.println(area);
                break;

            case 2:
                System.out.println("Qual a base do Retangulo?");
                heightR = in.nextDouble();
                System.out.println("Qual a base do Retangulo?");
                baseR = in.nextDouble();
                area = retangulo(baseR, heightR);
                System.out.println(area);
                break;
            
        }
    }

    public static double triangulo (double base, double height){
        double area;
        area = (base * height) / 2;
        return area;
        //...
    }

    public static double retangulo (double base, double height){
        double area;
        area = (base * height);
        return area;
        //...
    }
}