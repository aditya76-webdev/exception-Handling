package College;

class Test1{

public static void main(String args[])

{

try{

System.out.println(20/0);

}

catch(ArithmeticException e)

{

e.printStackTrace();

System.out.println(e);

System.out.println(e.getMessage());}

}

}