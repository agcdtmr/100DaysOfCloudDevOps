class GroovyNumTut{

  static void main(String[] args){

    println("Hello");

    //define var for fields: dynamic type
    // every instance inside groovy is an object
    def  age = "Dog";
    age = 40;

    println(" 5 + 4 = " + (5+4));
    println(" 5 - 4 = " + (5-4));
    println(" 5 * 4 = " + (5*4));
    println(" 5 / 4 = " + (5.intdiv(4)));
    println(" 5 % 4 = " + (5%4));


    println(" 5.2 + 4.4 = " + (5.2.plus(4.4)));
    println(" 5.2 + 4.4 = " + (5.2.minus(4.4)));
    println(" 5.2 + 4.4 = " + (5.2.multiply(4.4)));
    println(" 5.2 + 4.4 = " + (5.2 / 4.4));


    println("3 + 2 * 5 = " + (3 + 2 * 5));
    println("3 + 2 * 5 = " + ((3 + 2) * 5));


    println("age++ = " + (age++));
    println("++age = " + (++age));
    println("age-- = " + (age--));
    println("--age = " + (--age));


    //groovy could do very small calculation
    println("Biggest Int " + Integer.MAX_VALUE);
    println("Smallest Int " + Integer.MIN_VALUE);

    println("Biggest Float " + Float.MAX_VALUE);
    println("Smallest Float " + Float.MIN_VALUE);

    println("Biggest Double " + Double.MAX_VALUE);
    println("Smallest Double " + Double.MIN_VALUE);



    // Math operations
    def randNum = 2.0;
    println("Math.abs(-2.45) = " + Math.abs(-2.45));
    println("Math.round(2.45) = " + Math.round(2.45));
    println("Math.ceil(2.45) = " + Math.ceil(2.45));
    println("Math.floor(2.45) = " + Math.floor(2.45));
    println("Math.min(2, 3) = " + Math.min(3, 2));
    println("Math.max(2, 3) = " + Math.max(3, 2));
    println("randNum.pow(3) = " + randNum.pow(3));
    println("3.0.equals(2.0) = " + 3.0.equals(2.0));
    println("randNum.equals(Float.NaN) = " +randNum.equals(Float.NaN));
    println("Math.sqrt(9) = "+ Math.sqrt(9));
    println("Math.cbrt(27) = "+ Math.cbrt(27));

    println("Math.log(2) = " + Math.log(2));
    println("Math.log10(2) = " + Math.log10(2));

    println("Math.toDegrees(Math.PI) = " + Math.toDegrees(Math.PI));
    println("Math.toRadians(90) = " + Math.toRadians(90));


    //sin, cos, tan, asin, acos, atan,sinh, cosh, tanh
    println("Math.sin(0.5 * Math.PI) = " + Math.sin(0.5 * Math.PI))

    println("Math.abs(new Random().nextInt() % 100) + 1 = " + (Math.abs(new Random().nextInt() % 100) + 1))
  }
}