class GroovyRangeTut{

  static void main(String[] args){

    def oneTo10 = 1..10;
    def aToZ = 'a'..'z';
    def zToA = 'z'..'a';


    println('Size ' + oneTo10.size());
    println('2nd item: ' + oneTo10.get(1));

    println('Contains 11 ' + oneTo10.contains(11));

    println('Get Last ' + oneTo10.getTo());

    println('Get Last ' + oneTo10.getFrom());

  }

}