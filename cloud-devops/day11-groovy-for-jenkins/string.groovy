class GroovyStringTut{

  static void main(String[] args){
    //String operation

    def name = "Derek";

    //single quote : will be taken literally
    println('I am ${name}. \n');
    println("I am ${name}. \n");


    //''' for mutline strings
    def multString = '''
    I am a string 
    goes on 
    form many lines'''

    println(multString)


    println("3rd index of name " + name[3]);
    println("Index of r " + name.indexOf('r'));
    println("first 3 chars of name " + name[0..2]);


    println("every other chars of name : " + name[0,2,4]);

    println("substring at 1 : " + name.substring(1));

    println("substring at 1 to 4 :" + name.substring(1, 4));

    println("My name " + name);
    println("My name".concat(name));


    println("What i said " * 2);

    println("Derek == Derek " + 'Derek'.equals('Derek'));
    println("Derek == derek " + 'Derek'.equals('derek'));
    println("Derek == derek " + 'Derek'.equalsIgnoreCase('derek'));


    println("Length: " + name.length());

    def repeatStr = "What I said is " * 2;

    println(repeatStr - "What");

    println(repeatStr.split(' '));
    println(repeatStr.toList());


    println(repeatStr.replaceAll('I', 'she'));

    println("Uppercase : " + name.toUpperCase());
    println("Lowercase : " + name.toLowerCase());


    println("Ant <=> Banana " + ('Ant' <=> 'Banana')); // -1 if first string comes before second
    println("Banana <=> Ant " + ('Banana' <=> 'Ant')); // 1  if second string comes before first
    println("Ant <=> Ant " + ('Ant' <=> 'Ant')); // 0 if they are equal


  }
}