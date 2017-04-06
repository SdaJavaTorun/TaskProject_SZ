package com.sdajava.taskproject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code

        List<Task> tasks = getTasks();
        List<String> titles = taskTitles(tasks);
        titles.forEach(System.out::println);
    }
    
    public static List<String> taskTitles(List<Task> tasks){
        List<String> readingTitles = new ArrayList<>();
        for (Task task : tasks){
            if(task.getType() == TaskType.READING){
                readingTitles.add(task.getTitle());
            }
        }
        return readingTitles;
    }
    public static List<Task> getTasks() {

        Task task1 = new Task("1", "title1", TaskType.READING);
        Task task2 = new Task("2", "title2", TaskType.NOREADING);
        Task task3 = new Task("3", "title3", TaskType.READING);
        Task task4 = new Task("4", "title4", TaskType.NOREADING);

        return Stream.of(task1, task2, task3, task4).collect(Collectors.toList());
    }

}
