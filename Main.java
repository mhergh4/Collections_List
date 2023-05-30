package practice;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static  TodoList todoList = new TodoList();

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        while(true) {
            System.out.println("Your operation:");
            String text = new Scanner(System.in).next();
            String[] arrOfText = text.split(" ");
            if(Character.isDigit(Integer.parseInt(arrOfText[1]))) {
                if(Objects.equals(arrOfText[0], "ADD")) {
                    StringBuilder addedText = new StringBuilder();
                    for(int i = 2; i < arrOfText.length; i++) {
                        addedText.append(arrOfText[i]).append(" ");
                    }
                    todoList.add(Integer.parseInt(arrOfText[1]) , addedText.toString());
                }  else if(Objects.equals(arrOfText[0], "EDIT")) {
                    StringBuilder addedText = new StringBuilder();
                    for(int i = 2; i < arrOfText.length; i++) {
                        addedText.append(arrOfText[i]).append(" ");
                    }
                    todoList.edit(Integer.parseInt(arrOfText[1]) , addedText.toString());
                } else if(Objects.equals(arrOfText[0], "DELETE")) {
                    todoList.delete(Integer.parseInt(arrOfText[1]));
                }
            } else {
                if(Objects.equals(arrOfText[0], "ADD")) {
                    StringBuilder addedText = new StringBuilder();
                    for(int i = 1; i < arrOfText.length; i++) {
                        addedText.append(arrOfText[i]).append(" ");
                    }
                    todoList.add(addedText.toString());
                }

            }
            if (Objects.equals(arrOfText[0], "LIST")) {
                todoList.getTodos();
            }
            if(Objects.equals(arrOfText[0], "EXIT")) {
                break;
            }
        }
    }}
