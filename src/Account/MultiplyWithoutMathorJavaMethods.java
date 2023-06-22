package Account;

public class MultiplyWithoutMathorJavaMethods {
    private int firstNum;
    private int secondNum;
    int product = 0;
    public void multiplyWithout(int firstNum, int secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;

        for (int index = 0; index < secondNum; index++) {
            product += firstNum;
        }

        System.out.println(product);

    }

    public int getMultiplyWithout(){
        return product;
    }

    public static void main(String[] args) {
        MultiplyWithoutMathorJavaMethods newMul = new MultiplyWithoutMathorJavaMethods();
        newMul.multiplyWithout(30,2);

    }
}
