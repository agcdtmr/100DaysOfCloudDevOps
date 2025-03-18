class GroovyClosureTut{

    static void main(String[] args){

        def getFactorial = {num -> (num <= 1 ? 1 : num * call(num - 1))}

        println("Factorial 4: " +  getFactorial(4));


        def greeting = "Goodbye";

        def sayGoodby = {theName -> println("$greeting $theName")};

        sayGoodby("Chen");  


        def numList = [1,2,3,4];
        numList.each {println(it)};

        def employees = [
        'Paul' : 34,
        'Sally': 35,
        'Sam' : 36


        ] ;

        employees.each{println("$it.key : $it.value");}

        def randNums = [1,2,3,4,5,6]

        randNums.each {num -> if(num % 2 == 0) println(num)};


        def nameList = ['Chen', 'Sally', 'List'];

        def matchEle = nameList.find{item -> item == 'Chen'}

        println(matchEle)


        def randNumList = [1,2,3,4,5, 6];

        def numMatches = randNumList.findAll{item -> item > 4};
        println(numMatches);


        println("> 5: " + randNumList.any{item -> item > 5});

        println("> 1: " + randNumList.every{item -> item > 1});

        println("> 1: " + randNumList.every{item -> item > 1});


        def getEven = {num -> return(num %2 == 0)}

        def evenNums = listEdit(randNumList, getEven);
        println("Evens: " + evenNums);
    }


    static def listEdit(list, clo){
        return list.findAll(clo);
    }

}