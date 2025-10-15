public class Calculator {
    protected int num1;
    protected int num2;
    protected int result;

    public void setNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        result = num1 + num2;
        return result;
    }

    public void subtract() {
        result = num1 - num2;
    }

    // 곱셈: 덧셈 반복(루프 기반)
    public void multiply() {
        int a = num1;
        int b = num2;
        int absB = Math.abs(b);

        int temp = 0;
        for (int i = 0; i < absB; i++) {
            temp += a;
        }
        // 부호 처리
        result = (b < 0) ? -temp : temp;
    }

    // 나눗셈: 뺄셈 반복(루프 기반, 정수 몫)
    public void divide() {
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
            // result는 이전 값 유지 또는 0으로 초기화
            result = 0;
            return;
        }

        int a = Math.abs(num1);
        int b = Math.abs(num2);
        int q = 0;

        while (a >= b) {
            a -= b;
            q++;
        }
        // 부호 처리 (둘 중 하나만 음수면 음수 몫)
        result = ((num1 < 0) ^ (num2 < 0)) ? -q : q;
    }

    public void displayResult(String operator) {
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
