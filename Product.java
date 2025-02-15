public class Product{
int pcode,price;
String pname;

  public static void main(String[] args) {
    Product myObj = new Product();
    Product myObj1 = new Product();
    Product myObj2 = new Product();
    myObj.price=2;
    myObj1.price=4;
    myObj2.price=1;
     System.out.println("product code:201");
    System.out.println("product 1");
    System.out.println(myObj.price);
     System.out.println("product code:202");
    System.out.println("product 2");
    System.out.println(myObj1.price);
     System.out.println("product code:203");
    System.out.println("product 3");
    System.out.println(myObj2.price);
    if(myObj.price < myObj1.price &&  myObj.price < myObj2.price){
    System.out.println("product 1 price is lowest");
    }
    else if(myObj1.price < myObj.price && myObj1.price < myObj2.price){
     System.out.println("product 2 price is lowest");
    }
    else{
    System.out.println("product 3 price is lowest");
    }
    
  }
}