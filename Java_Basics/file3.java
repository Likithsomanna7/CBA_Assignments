class Calculator {   //Class 
    int num1;
    int num2;
    Calculator(int n1,int n2)  //constructor
    {
         num1=n1;
         num2=n2;
    }
    public int add() {
        return num1 + num2;
    }
    public int add(int temp ) //function overloading
    {
        return num1+num2+temp;
    }
    public int diff() {
        return num1 - num2;
    }
    public int multi() {
        return num1 * num2;
    }
    public int div() {
        return num1 / num2;
    }
};

class file3 {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 2;

        Calculator obj = new Calculator(n1,n2);  //Object

        System.out.println(obj.add());
        System.out.println(obj.add(1));
        System.out.println(obj.diff());
        System.out.println(obj.multi());
        System.out.println(obj.div());
    }
}
