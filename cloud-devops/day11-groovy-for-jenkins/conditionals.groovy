class GroovyConditionalTut{

  static void main(String[] args){

    // ==  !=. >  <. >=  <=

    // && || !

    def ageOld = 6;
    if(ageOld == 5){
        println("Got to Kindergarten");
    }else if ( (ageOld > 5) && (ageOld < 18)){
        printf("Go to grade %d \n", (ageOld - 5));
    }else{
        println("Go to college");
    }


    def canVote = true;


    println(canVote ? " Can Vote" : "Can't Vote");


    switch(ageOld) {
        case 16: println("You can dirve");
            
        case 18:
            println("You can vote");
            break;
        default : println("Have fun");
    }


     switch(ageOld) {
        case 0..6: println("Child");break;    
        case 7..12: println("Teenager"); break;
        case 13..18: println("Young adult"); break;
        default : println("Adult");
    }



  }

}