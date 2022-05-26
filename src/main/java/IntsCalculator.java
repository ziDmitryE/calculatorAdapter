public class IntsCalculator implements Ints {
    private Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        int result = (int) this.target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.SUM).result();
        return result;
    }

    @Override
    public int mult(int arg0, int arg1) {
        int result = (int) this.target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.MULT).result();
        return result;
    }

    @Override
    public int pow(int a, int b) {
        int result = (int) this.target.newFormula().addOperand(a).addOperand(b).calculate(Calculator.Operation.POW).result();
        return result;
    }
}