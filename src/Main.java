//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        // 더하기
        Calculator calc_add = new Calculator();
        calc_add.setNumbers(10, 3);
        calc_add.add();
        calc_add.displayResult("+");

        // 빼기
        Calculator calc_sub = new Calculator();
        calc_sub.setNumbers(10, 3);
        calc_sub.subtract();
        calc_sub.displayResult("-");

        // 곱하기 (루프 기반)
        Calculator calc_mul = new Calculator();
        calc_mul.setNumbers(10, 3);
        calc_mul.multiply();
        calc_mul.displayResult("*");

        // 나누기 (루프 기반)
        Calculator calc_div = new Calculator();
        calc_div.setNumbers(10, 3);
        calc_div.divide();
        calc_div.displayResult("/");
    }
}
