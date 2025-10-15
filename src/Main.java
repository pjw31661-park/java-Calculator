//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Calculator calc_add = new Calculator();
        calc_add.setNumbers(5, 3);
        calc_add.add();
        calc_add.displayResult("+");

        AdvancedCalculator calc_mul = new AdvancedCalculator();
        calc_mul.setNumbers(10, 2);
        calc_mul.multiply();
        calc_mul.displayResult("*");
    }
}