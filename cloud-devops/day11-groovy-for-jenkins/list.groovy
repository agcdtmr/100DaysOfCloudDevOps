class GroovyListTut{

  static void main(String[] args){


    def primes = [2, 3, 5, 7, 11, 13];

    println("2nd prime " + primes[2]);
    println("2nd prime " + primes.get(2));
    println("Length: " + primes.size());

    primes.add(17);  //add 17 to list
    primes <<19;   // add 19 to list
    primes.add(23); //add 23 to list

    
    primes + [29, 31]; // add two list to form a new list, primes not changed

    primes - [31]; //substract the list from primes to form a new list, primes not changed


    println("1st 3 " + primes[0..2])
    println("Matches " + primes.intersect([2, 3, 7]));

    println("Reverse " + primes.reverse());

    println("Sort " + primes.sort());

    println("Last " + primes.pop())

    def employee = ['List', 10, 6.25, [1,2,3]];

    println("2nd number " + employee[3][1])



  }

}