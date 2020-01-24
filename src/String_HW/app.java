package String_HW;

public class app {

    public static void main(String[] args) {
        User user = new User();
        // user.printSummary();
        // System.out.println(user.getAccountBalance());
        user.setDetails("Mohammad", 33);
        // user.printSummary();
        user.setIncome(100);
        user.setIncome(300);
        user.setExpense(5);
        user.setExpense(2);
        //System.out.println(user.getAccountBalance());
        user.printSummary();
        user.resetBalance();
        user.printSummary();
    }

}
