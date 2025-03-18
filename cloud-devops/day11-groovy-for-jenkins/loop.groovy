class GroovyLoopTut{

  static void main(String[] args){

    def i = 0;

    while( i < 10){
        if( i % 2){
            i++;
            continue;
        }

        if(i == 8){
            break;
        }

        println(i);
        i++
    }


    for(i = 0; i < 5; i++){
        println(i);
    }

    for(j in 2..6){
        println(j);
    }


    def randList= [10,11,12,13,15];

    for (j in randList){
        println(j);
    }


  }

}