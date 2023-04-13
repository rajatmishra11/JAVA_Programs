//Multiple Inheritence Through Interfaces->

interface A {
  public void myMethod();
}

interface B {
  public void myOtherMethod();
}

class C implements A, B {
  public void myMethod() {
    System.out.println("Class A method");
  }
  public void myOtherMethod() {
    System.out.println("Class B method");
  }
}

class interfaces{
  public static void main(String[] args) {
    C myObj = new C();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}