package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {

		LocalDate d1 = LocalDate.of(2021, 10, 23);
		LocalDate d2 = LocalDate.of(2021, 9, 15);
		LocalDate d3 = LocalDate.of(2021, 12, 4);
		LocalDate d4 = LocalDate.of(2021, 8, 10);
		LocalDate d5 = LocalDate.of(2021, 11, 9);

		Task task1 = new Task("牛乳を買う", d1);
		Task task2 = new Task("○○社面談", d2);
		Task task3 = new Task("手帳を買う", d3);
		Task task4 = new Task("散髪に行く", d4);
		Task task5 = new Task("スクールの課題を解く", d5);
		

		List<Task> list = new ArrayList<>();

		list.add(task1);
		list.add(task2);
		list.add(task3);
		list.add(task4);
		list.add(task5);

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}