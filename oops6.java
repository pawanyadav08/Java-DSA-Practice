class oops6 {
  int add(int a, int b){
    return a + b;
  }  

  double add(double a, double b){
    return a + b;
  }

  public static void main(String[] args) {
    oops6 m = new oops6();

    System.out.println(m.add(2, 3));
    System.out.println(m.add(2.5, 3.5));
  }
}
