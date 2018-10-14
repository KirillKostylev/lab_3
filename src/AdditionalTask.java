public class AdditionalTask {
    public static void addTask() {
        int ans = InputData.inputIntegerData("Input size string \"game over\" (1-3): ");
        switch (ans) {
            case 1:
                OutputData.outputData("game over");
                break;
            case 2:
                OutputData.outputData("GAME OVER");
                break;
            case 3:
                OutputData.outputData("\n" +
                        " $$$$   $$$$  $$   $$ $$$$$\n" +
                        "$$     $$  $$ $$$ $$$ $$\n" +
                        "$$ $$$ $$$$$$ $$ $ $$ $$$$\n" +
                        "$$  $$ $$  $$ $$   $$ $$\n" +
                        " $$$$  $$  $$ $$   $$ $$$$$\n" +
                        "\n" +
                        " $$$$  $$  $$ $$$$$  $$$$$\n" +
                        "$$  $$ $$  $$ $$     $$  $$\n" +
                        "$$  $$ $$  $$ $$$$   $$$$$\n" +
                        "$$  $$  $$$$  $$     $$ $$\n" +
                        " $$$$    $$   $$$$$  $$  $$");
                break;
        }
    }
}
