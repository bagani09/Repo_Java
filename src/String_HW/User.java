package String_HW;

public class User {
        private String name;
        private int age;
        private double income;
        private double expense;
        public void printSummary() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Income: " + income);
            System.out.println("Expense: " + expense);
        }
        public double getAccountBalance() {
            return income - expense;
        }
        public void setDetails(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void setExpense(double expense) {
            this.expense += expense;
        }
        public void setIncome(double income) {
            this.income += income;
        }
        public void resetBalance(){
            income = 0;
            expense = 0;
        }
    }

