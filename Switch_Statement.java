public class Switch_Statement
{
    public Switch_Statement()
    {
        int dayNumber = 1;
        switch (dayNumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
            System.out.println("Invalid Number");
                break;
        }
    }
}
