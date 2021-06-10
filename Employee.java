
public class Employee {
	String name;
	int empid;
	String address;
	String company;
	Employee(){
		company="dell";
	}
	Employee(String name, int empid, String address){
		this();
		this.name=name;
		this.empid=empid;
		this.address=address;
		
	}
	void printt() {
		System.out.println(company);
		System.out.println(name+empid+address);
	}
}
class parttimeemployee extends Employee{
	int hoursworking;
	int timeperiod;
	parttimeemployee(String name, int empid, String address , int hoursworking, int timeperiod){
		super(name,empid,address);
		this.hoursworking= hoursworking;
		this.timeperiod=timeperiod;
	}
	@Override
	void printt(){
		super.printt();
		System.out.println( hoursworking + timeperiod);
	}
}
class fulltimeemployee extends Employee{
	int ns;
	int hra;
	
	fulltimeemployee(String name, int empid, String address, int ns ,int pf){
		super(name,empid,address);
		this.ns=ns;
		this.hra=pf;
		}
	@Override
	void printt() {
		super.printt();
		System.out.println(ns+hra);
		}
}
class customer extends fulltimeemployee{
	String Customername;
	int cusid;
	customer(String name, int empid, String address, int ns, int pf, String Customername, int cusid) {
		super(name, empid, address, ns, pf);
		this.Customername= Customername;
		this.cusid=cusid;
		//TODO Auto-generated constructor stub
	}

	@Override
	void printt() {
		super.printt();
		System.out.println(Customername+cusid);
	}
}
class Employee1{

	public static void main(String[] args) {
		
	
		fulltimeemployee ft= new fulltimeemployee("utkarsh",101,"abc",54,45);
		ft.printt();
		customer ct= new customer("ramesh",101,"abc",54,45,"Suresh",458);
		ct.printt();
		
		
}	
}
