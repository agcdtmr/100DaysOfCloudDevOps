class GroovyMapTut{

  static void main(String[] args){

    def paulMap = [
        'name': 'Paul',
        'age' : 35,
        'address' :" 123 Main St",
        'list': [1,2,3]
    ]


    println("Name " + paulMap['name']);
    println("age " + paulMap['age']);
    println("list " + paulMap['list']);


    paulMap.put('city', 'Pittsburg');

    println("Has city" + paulMap.containsKey('city'));
    println("Size " + paulMap.size());


    for(ele in paulMap){
        println("$ele.value : $ele.key")
    }


  }

}