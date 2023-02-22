package Todo_finalProject;

import java.util.ArrayList;


import java.util.*;
public class TaskManager { 

  public List<Task> tasks = new ArrayList<>();

  enum Mark {
    Done , Doing ,Todo 
  }

 /*  TaskManager() {
    tasks = new ArrayList<>();
  }*/

  public void addTask(Task task) { //  This method receives a value of type task from the user and then adds it to the array.
    
    tasks.add(task);  
    System.out.println("Task added successfully!");
  }

  public void modifyTask(int index, Task task) { // In this method we can modify the tasks and add them back to the array using the setter key
    index--; 
    if (index >= 0 && index < tasks.size()) { // if  statement to verify user input
      
      tasks.set(index, task); 
      System.out.println("Task modified successfully!");
    } else {
      System.out.println("Invalid index! Task not found.");
    }
  } 


  public void printTasks() { //In this method, we print all tasks using LOOP to the array.
    System.out.println("Tasks:");
    for (int i = 0; i < tasks.size(); i++) {
      System.out.println((i + 1) + ". " + tasks.get(i));
    }
  }

  public void deleteTask(int index) { 
    index--; // ل تطابق ال id في التيرمنال 
    if (index >= 0 && index < tasks.size()) {
      
      tasks.remove(index);
      System.out.println("Task deleted successfully!");
    } else {
      System.out.println("Invalid index! Task not found.");
    }
  }

  public void markAsDone(int index) {
    index-- ;// ل تطابق ال id في التيرمنال 
    if (index >= 0 && index < tasks.size()) {
      
      tasks.get(index).setState("Done ");
      System.out.println("Task marked as Done successfully!");
    } else {
      System.out.println("Invalid index! Task not found.");
    } 
  }  

}

    

