public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double tax=0;
        if (this.salary>1000){
            tax = this.salary*0.03;
        }
        return tax;
    }
    public double bonus(){
        double bonus = 0;
        if (this.workHours>40){
            bonus = (this.workHours-40)*30;
        }
        return bonus;
    }
    public double raiseSalary(){
        double raiseSalary = 0;
        int year = 2022;
        if (year - this.hireYear > 9 && year - this.hireYear <= 19){
            raiseSalary = this.salary*0.1;
        } else if (year - this.hireYear > 19) {
            raiseSalary = this.salary*0.15;
        } else {
            raiseSalary = this.salary*0.05;
        }
        return raiseSalary;
    }
    public void details(){
        System.out.println("İsim : " + this.name);
        System.out.println("Maaş : " + this.salary);
        System.out.println("Haftalık Çalışma Saati : " + this.workHours);
        System.out.println("İşe Başlama Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Zam : " + raiseSalary());
        System.out.println("Net Maaş : " + (this.salary-tax()+bonus()+raiseSalary()));
    }
}
