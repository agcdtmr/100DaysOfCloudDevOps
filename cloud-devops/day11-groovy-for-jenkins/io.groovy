class GroovyIOTut{

    static void main(String[] args){


        def randString = "Random";

        println("A $randString string");

        printf(" A %s string \n", randString);

        printf(" %-10s %d  %.2f %10s \n", ['Stuff', 10, 1.234, 'Random']);


        println("Whats your name ");
        def fName = System.console().readLine();
        println("Hello " + fName);


        println("Enter a number ");
        def num1 = System.console().readLine().toDouble();
        println("Enter a number ");
        def num2 = System.console().readLine().toDouble();

        printf("%.2f  + %.2f = %.2f \n", num1, num2, (num1 + num2))



        //file IO

        new File("test.txt").eachLine {
            line -> println "$line";
        }

        new File("test.txt").withWriter('utf-8'){
            writer -> writer.writeLine("Line 4");
        }


        File file = new File("test.txt");
        file.append('Line 5');

        println(file.text);


        println("File size :   ${file.length()} bytes");


        println("File:  ${file.isFile()}");
        println("Dir:  ${file.isDirectory()}");


        def newFile = new File("test2.txt");
        newFile << file.text;


        newFile.delete();


        def dirFiles = new File("").listRoots();

        dirFiles.each {
            item -> println item.absolutePath;
        }


    }

}