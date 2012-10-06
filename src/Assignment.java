import java.util.Date;
// Yuemin Ding, 10/6/2012
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date toDay = new Date();
		Task aTask = new Task("Homework", "Do BMA5", toDay);
		System.out.println(aTask);
		Task aTask2 = new Task();
		System.out.println(aTask2);
	} //end of main()
	
// getElement() has not been used yet
    public static String getElement(String values[], int index) {
    	if(index >=0 && index<=values.length) {
    		return values[index];
    	} 
    	else {
    	    return null;	
    	}
    } // end of getElement()
} // end of class Assignment

class Task {
	String title;
	String desc;
	Date date = new Date();
	Task(String title, String desc, Date date){
		this.title = title;
	    this.desc = desc;
		this.date = date;
	}
	Task(){
		//Date toDay = new Date();
		this.title = "No title";
	    this.desc = "No description";
	    //this.date = toDay;
	}
	public String toString(){
			return "Task(\nTitle: "+ title + ". \nDescription: "+desc +". \nCreated at: " +date.toString()+"\n)\n";
	}
} //end of Task
