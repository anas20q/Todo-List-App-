package Todo_finalProject;

import java.util.Date;

import Todo_finalProject.TaskManager.Mark;

class Task {
  private String Taskname;
  private String state;
  private Date creationTime; 

 
  public String getTasknamee() {
    return this.Taskname;
  }

  public void setTaskname(String name) {
    this.Taskname = name;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Date getCreationTime() {
    return this.creationTime;
  } 
  // constractor 
  Task(String name, String state) {
    this.Taskname = name;
    this.state = state;
    this.creationTime = new Date();
  }

  @Override  
  public String toString() {
    return "Task Name: " + this.Taskname + ", Task State: " + this.state + ", Creation Time: " + this.creationTime;
  }

  public void setState(Mark done) { 
    
  }
}
