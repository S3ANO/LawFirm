
/**
 * Write a description of class EmployeeMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeMain
{
    public static void main(String[] args) {
        System.out.print("Employee: ");
        Employee han = new Employee();
        System.out.print(han.getHours() + ", ");
        System.out.printf("$%.2f, ", han.getSalary());
        System.out.print(han.getVacationDays() + ", ");
        System.out.println(han.getVacationForm());
        
        System.out.print("Secretary: ");
        Secretary luke = new Secretary();
        System.out.print(luke.getHours() + ", ");
        System.out.printf("$%.2f, ", luke.getSalary());
        System.out.print(luke.getVacationDays() + ", ");
        System.out.println(luke.getVacationForm());
        luke.takeDictation("Hello there!");
        luke.extraPages();
        
        System.out.print("Lawyer: ");
        Lawyer leia = new Lawyer();
        System.out.print(leia.getHours() + ", ");
        System.out.printf("$%.2f, ", leia.getSalary());
        System.out.print(leia.getVacationDays() + ", ");
        System.out.println(leia.getVacationForm());
        leia.sue();
        leia.extraPages();
        
        System.out.print("Marketer: ");
        Marketer finn = new Marketer();
        System.out.print(finn.getHours() + ", ");
        System.out.printf("$%.2f, ", finn.getSalary());
        System.out.print(finn.getVacationDays() + ", ");
        System.out.println(finn.getVacationForm());
        finn.advertise();
        finn.extraPages();
        
        System.out.print("Legal Secretary: ");
        LegalSecretary lucy = new LegalSecretary();
        System.out.print(lucy.getHours() + ", ");
        System.out.printf("$%.2f, ", lucy.getSalary());
        System.out.print(lucy.getVacationDays() + ", ");
        System.out.println(lucy.getVacationForm());
        lucy.takeDictation("That's neat.");
        lucy.fileLegalBriefs();
        lucy.extraPages();
    }
}
