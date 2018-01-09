
/**
 * Write a description of class Lawyer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lawyer extends Employee
{
    public int getVacationDays()
    {
        // initialise instance variables
        return 15;
    }
    public String getVacationForm()
    {
        return "pink";
    }
    public void sue()
    {
        System.out.println("I'll see you in court!");
    }
    public void extraPages()
    {
        System.out.println("Extra Pages: 2");
    }
}
