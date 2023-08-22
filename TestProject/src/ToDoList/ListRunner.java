package ToDoList;

import java.util.Scanner;

public class ListRunner {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        ToDoList list = new ToDoList();
        printOut();
        int param = scanner.nextInt();
        while (param != 0) {
            switch (param) {
                case 1:
                    System.out.println("Please enter a task to add");
                    scanner.nextLine();
                    String task = scanner.nextLine();
                    list.addToList(task);
                    System.out.println("Choose an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("to print out the list");
                    scanner.nextLine();
                    list.printToDoList();
                    System.out.println("Choose an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("to update an existing item");
                    scanner.nextLine();
                    int index = scanner.nextInt();
                    System.out.println("please enter a new task");
                    scanner.nextLine();
                    String taskUpdate = scanner.nextLine();
                    list.changeTask(index,taskUpdate);
                    System.out.println("Choose an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("to remove item form the list");
                    scanner.nextLine();
                    String taskRemove = scanner.nextLine();
                    list.removeTask(taskRemove);
                    System.out.println("Choose an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("to get task priority or number in the list");
                    scanner.nextLine();
                    String taskPriority = scanner.nextLine();
                    list.getTaskPriority(taskPriority);
                    System.out.println("Choose an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 6:
                    System.out.println("to add a new item at specific position");
                    scanner.nextLine();
                    int index2 = scanner.nextInt();
                    scanner.nextLine();
                    String task2 = scanner.nextLine();
                    list.addToListAtPosition(index2, task2);
                    System.out.println("Choose an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                default:
                    param = 0;
            }

        }
    }

    private static void printOut(){
        System.out.println("Please choose an action. Press :\n"
                        + "1 to add a new item into ToDoList\n"
                        + "2 to print out the list\n"
                        + "3 to update an existing item\n"
                        + "4 to remove item form the list\n"
                        + "5 to get task priority or number in the list\n"
                        + "6 to add a new item at specific position\n"
                        + "press 0 for exit\n\n"
                        + "AFTER CHOOSING AN OPTION PLEASE PRESS ENTER\n"
        );
    }
}
