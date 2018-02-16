/*Yonathan Mekonnen
  Date Structures and Object Programming (CMSC 256)
  Eclipse
  Program 4
  Purpose: To write a program to simulate forms processing by an office clerk
  Input: a text file with requests 
  Output: the average weight times in the input queue and the pending requests stack
   */

public class Request implements Comparable<Request> {
    
	//create instance variables 
	private int idNum = 0;
	private int execTime = 0;
	private int entryTime = 0;
	private int priority = 0;
	private int enterinputQTime = 0;
	private int exitinputQTime = 0;
	private int doneTime = 0;
	
	// Create Parameterized Constructor
	public Request(int idNum, int execTime, int entryTime, int priority) {
		setIdNum(idNum);
		setExecTime(execTime);
		setEntryTime(entryTime);
		setPriority(priority);
	}
	// Use get method to return what you set the parameter in the set method
	public int getIdNum() {
		return idNum;
	}
	// set the global variable type to the parameter in the set method
	public void setIdNum(int IdNum) {
		this.idNum = IdNum;
	}
	// Use get method to return what you set the parameter in the set metho
	public int getExecTime() {
		return execTime;
	}
	// set the global variable type to the parameter in the set method
	public void setExecTime(int ExecTime) {
		this.execTime = ExecTime;
	}
	// Use get method to return what you set the parameter in the set metho
	public int getEntryTime() {
		return entryTime;
	}
	// set the global variable type to the parameter in the set method
	public void setEntryTime(int EntryTime) {
		this.entryTime = EntryTime;
	}
	// Use get method to return what you set the parameter in the set metho
	public int getPriority() { 
		return priority;
	}
	// set the global variable type to the parameter in the set method
	public void setPriority(int priority) {

		this.priority = priority;
	}
	// Use get method to return what you set the parameter in the set metho
	public int getEnterinputQTime() {
		return enterinputQTime;
	}
	// set the global variable type to the parameter in the set method
	public void setEnterinputQTime(int EnterinputQTime) {
		this.enterinputQTime = enterinputQTime;
	}
	// Use get method to return what you set the parameter in the set metho
	public int getExitinputQTime() {
		return exitinputQTime;
	}
	// set the global variable type to the parameter in the set method
	public void setExitinputQTime(int ExitinputQTime) {
		this.exitinputQTime = exitinputQTime;
	}
	// Use get method to return what you set the parameter in the set metho
	public int getDoneTime() {
		return doneTime;
	}
	// set the global variable type to the parameter in the set method
	public void setDoneTime(int DoneTime) {
		this.doneTime = doneTime;
	}

	
	//creating equals method
public boolean equals (Object obj) {
	if (obj == this) {
		return true;
	}
	if (obj == null) {
		return true;
	}
	if (obj instanceof Request) {
		Request next = (Request) obj;
		if (this.idNum == (next.getIdNum())) {
        if (this.execTime == (next.getExecTime())) {
        if (this.entryTime == (next.getEntryTime())) {
        if (this.priority == (next.getPriority())){
        	return true;
        }
        }
        }
		}
		}
	return false;
	
}
    //creating compareTo method
@Override
public int compareTo(Request other) {
	if (this.getPriority() == other.getPriority()) {
		return 0;
	} else if (this.getPriority() < other.getPriority()) {
		return 1;
	} else
        return -1;	
}
     //creating toString method
@Override
	public String toString() {
		return "Request [idNum=" + idNum + ", execTime=" + execTime + ", entryTime=" + entryTime + ", priority="
				+ priority + "]";
	}
}
