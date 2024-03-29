class MathFunction {
    final static Integer One=1;
    final static int Two=2;
public static void main (String[] args){
    double x=Math.E;
    double fx=Math.log(x);
    System.out.print("One or no?");
    System.out.println(fx);

    x= Math.PI/15.0;
    fx=Math.sin(x)*Math.sin(x)+Math.cos(x)*Math.cos(x);
    System.out.print("Test for pythagorean identity?");
    System.out.println(fx);


    int Three= One+Two;
    System.out.println(Three);          //outputs 3

    int One=2;
    int Three2= One+Two;
    System.out.println(Three2);         // outputs 4
}
}
