package College;

class Finally{

public static void main(String args[]){

try{

int d=25/0;

System.out.println(d);

}

catch(NullPointerException e){

System.out.println(e);

}

finally {

System.out.println("Finally block is executed");

}

System.out.println("Rest of the code");

}

}