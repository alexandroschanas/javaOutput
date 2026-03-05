//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        printInformation("kokokooko");

    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length =%d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));

    }

}