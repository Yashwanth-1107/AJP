package _AJP_;

public class FeeDetails {
	
	int TutionFee;
	long JntuhFee;
	int CrtFee;
	long MinorprojectFee;
	void FeeDetail() {
		System.out.println("FeeDetails:\n"+TutionFee+"\n"+JntuhFee+"\n"+CrtFee+"\n"+MinorprojectFee+"");
	}



public static void main(String[] args) {
	
	FeeDetails fee1 =new FeeDetails();
	fee1.TutionFee=12500;
	fee1.JntuhFee=2500;
	fee1.CrtFee=4000;
	fee1.MinorprojectFee=2000;
	fee1.FeeDetail();
		
		
	}
}
	


