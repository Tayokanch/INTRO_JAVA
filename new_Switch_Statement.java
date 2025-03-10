public class new_Switch_Statement
{
    String day = "";
    String AlarmTime = "";
    new_Switch_Statement()
    {
        AlarmTime = switch(day)
        {
            case "Saturday", "Sunday" -> "8am";
            case  "Friday" -> "10am";
            default -> "6:30am";
        };
    }
}
