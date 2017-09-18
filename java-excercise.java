class java-excercise
{
  public static int add(int, int);

  public static void main(String[] Args)
  {
    int num1 = 45;
    int num2 = 800;
    int result;
    result = add(num1, num2);
    System.out.println(num1 + " + " + num2 + " = " + result);
  }

  public static int add(int num1, int num2)
  {
    return num1+num2;
  }
}
