import java.util.Scanner;
public class listaMet
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        double height, base, side, ray, area, depth, vol, surf;
        int op;
        System.out.println("\f qual a operaço a ser realizada?");
        System.out.println("1 - Area do Triangulo");
        System.out.println("2 - Area do Retangulo");
        System.out.println("3 - Area do Círculo");
        System.out.println("4 - Area do Quadrado");
        System.out.println("5 - Vol. do Paralelepipedo");
        System.out.println("6 - Vol. da Piramide");
        System.out.println("7 - Vol. do Cilindro");
        System.out.println("8 - Sup. Paralelepipedo");
        System.out.println("9 - Sup. Piramide");
        System.out.println("10 - Sup. Cilindro");
        System.out.println("11 - Sup. Esfera");
        
        op = in.nextInt();
        switch(op){
            case 1:
                System.out.println("Qual a altura do triangulo?");
                height = in.nextDouble();
                System.out.println("Qual a base do triangulo?");
                base = in.nextDouble();
                area = triangulo(base, height);
                System.out.println(area);
                break;

            case 2:
                System.out.println("Qual a base do Retangulo?");
                height = in.nextDouble();
                System.out.println("Qual a base do Retangulo?");
                base = in.nextDouble();
                area = retangulo(base, height);
                System.out.println(area);
                break;
            case 3:
                System.out.println("Qual o Raio");
                ray = in.nextDouble();
                area = circulo(ray);
                System.out.println(area);
                break;
            case 4:
                System.out.println("Qual o lado");
                side = in.nextDouble();
                area = sqr(side);
                System.out.println(area);
                break;
            case 5:
                System.out.println("Qual a altura do paralelepipedo?");
                height = in.nextDouble();
                System.out.println("Qual o comprimento do paralelepipedo?");
                base = in.nextDouble();
                System.out.println("Qual a profundidade do paralelepipedo?");
                depth = in.nextDouble();
                vol = prlpdVol(depth, base, height);
                System.out.println(vol);
                break;
            case 6:
                System.out.println("Qual a altura da Piramide?");
                height = in.nextDouble();
                System.out.println("Qual a base da Piramide?");
                base = in.nextDouble();
                vol = pirmVol(height, base);
                System.out.println(vol);
                break;
            case 7:
                System.out.println("Qual o raio da base?");
                ray = in.nextDouble();
                System.out.println("Qual a altura do Cilindro?");
                height = in.nextDouble();
                vol = cilinVol(ray, height);
                System.out.println(vol);
                break;
            case 8:
                System.out.println("Qual a altura do paralelepipedo?");
                height = in.nextDouble();
                System.out.println("Qual o comprimento do paralelepipedo?");
                base = in.nextDouble();
                System.out.println("Qual a profundidade do paralelepipedo?");
                depth = in.nextDouble();
                surf = prlpSurf(height, base, depth);
                System.out.println(surf);
                break;
            case 9:
                System.out.println("Qual a altura da Piramide?");
                height = in.nextDouble();
                System.out.println("Qual a base da Piramide?");
                base = in.nextDouble();
                surf = pirmSurf(height, base);
                System.out.println(surf);
                break;
            case 10:
                System.out.println("Qual o raio da base?");
                ray = in.nextDouble();
                System.out.println("Qual a altura do Cilindro?");
                height = in.nextDouble();
                vol = cilinSurf(ray, height);
                System.out.println(vol);
                break;
            case 11:
                System.out.println("Qual o Raio");
                ray = in.nextDouble();
                surf = circulo(ray);
                System.out.println(surf);
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
    
    public static double circulo (double ray){
        double area;
        area = Math.pow(ray, 2) * Math.PI;
        return area;
        //...
    }
    
    public static double sqr (double side){
        double area;
        area = Math.pow(side, 2) * Math.PI;
        return area;
        //...
    }
    
    public static double prlpdVol (double d, double b, double h){
        double vol;
        vol = d*b*h;
        return vol;
        //...
    }
    
    public static double pirmVol (double h, double b){
        double vol;
        vol = (Math.pow(b,2) * h) / 3;
        return vol;
        //...
    }
    
    public static double cilinVol (double r, double h){
        double vol;
        vol = (Math.pow(r,2) * Math.PI) * h;
        return vol;
        //...
    }
    
    public static double prlpSurf (double h, double b, double d){
        double surf;
        surf = ((h*b)*2) + ((d*b)*2) + ((d*h)*2);
        return surf;
        //...
    }
    
    public static double pirmSurf (double h, double b){
        double surf, tri, base;
        tri = Math.sqrt(Math.pow(h,2) + Math.pow(b,2));
        base = Math.pow(b,2);
        surf = tri * 4 + base;
        return surf;
        //...
    }
    
    public static double cilinSurf (double r, double h){
        double surf, base, side;
        base = (Math.pow(r,2) * Math.PI);
        side = (Math.PI*2*r) * h;
        surf = side + 2 * base;
        return surf;
        //...
    }
    
     public static double sphereSurf (double ray){
        double surf;
        surf = Math.pow(ray, 2) * Math.PI * 4;
        return surf;
        //...
    }
}
