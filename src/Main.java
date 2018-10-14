public class Main {
    public static void main(String[] args) {
        int day, month, year;
        day = InputData.inputIntegerData("Input your day of birth: ");
        month = InputData.inputIntegerData("Input your month of birth: ");
        year = InputData.inputIntegerData("Input your year of birth: ");

        OutputData.outputData("What is My Age in …");
        Calculate calc = new Calculate();
        OutputData.outputData("\tYear: " + calc.calculateLifeInYear(day, month, year));
        OutputData.outputData("\tMonths: " + calc.calculateLifeInMonth(day, month, year));
        OutputData.outputData("\tWeeks: " + calc.calculateLifeInWeeks(day, month, year));
        OutputData.outputData("\tDays: " + calc.calculateLifeInDays(day, month, year));
        OutputData.outputData("\tHours: " + calc.calculateLifeInHours(day, month, year));
        OutputData.outputData("\tMinutes: " + calc.calculateLifeInMinut(day, month, year));
        OutputData.outputData("\tSeconds: " + calc.calculateLifeInSecond(day, month, year));
    }
}
