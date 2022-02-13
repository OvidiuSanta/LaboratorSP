import Models.*;
import Services.*;

public class Main {
    public static void main(String[] args) throws Exception {
        OpenCommand openCommand = new OpenCommand("Restanta "); // instantiem cartea
        Section NewSection = new Section("Cap1"); //cream sectiune
        NewSection.add(new Paragraph("paragraph")); // adaugam continut in sectiune
        SaveCommand saveCommand = new SaveCommand(NewSection);
        StatisticsCommand statisticsCommand = new StatisticsCommand();

        openCommand.execute();
        saveCommand.execute();
        statisticsCommand.execute();
    }
}
