package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task> {  // Comparable<Task>を継承
	  private String task;
	  private LocalDate date;
	  public Task(String task, LocalDate date){
	    this.task = task;
	    this.date = date;
	  }

	  // compareToメソッドをオーバーライドする
	  // 日付で並び替えるため、LocalDateのcompareToを使う
	  @Override
	  public int compareTo(Task t){
	    return date.compareTo(t.date);
	    
	    
	  }
	  
	  @Override
	    public String toString() {
		  return date.toString() + ":" + task;
		  
	        
	    }
	}
