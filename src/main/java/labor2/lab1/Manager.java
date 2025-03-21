package labor2.lab1;

public class Manager extends Approver {
    @Override
    protected boolean canSolve(Problem amount) {
        return amount.getDifficulty() <= 50;
    }

    @Override
    protected void solve(Problem amount) {
        System.out.println("Менеджер решил проблему");
    }
}