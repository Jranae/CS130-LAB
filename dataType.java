package Lab;

public class dataType {

	private int dMonth;
	private int dDay;
	private int dYear;
	
	public void setName(int dMonth, int dDay, int dYear) {
		this.dMonth= dMonth;
		this.dDay= dDay;
		this.dYear= dYear;
		
	}
	public final int getDay() {
		return dDay;
	}
	public final int getMonth() {
		return dMonth;
	}
	public final int getYear() {
		return dYear;
	}
	public void printDate(){
		System.out.println(this.dMonth+"/"+this.dDay+"/"+this.dYear);
	}
	public dataType(int dMonth, int dDay, int dYear) {
		this.dMonth=11;
		this.dDay=10;
		this.dYear=2022;
	}
}
