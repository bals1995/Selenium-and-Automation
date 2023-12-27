package week1_day1;

public class Mobile {
	
	public void makeCall() {
		
		String  mobileModel = "Mi";
		float mobileWeight = 5.7f;
		
		System.out.println("mobileModel:"+mobileModel+",  mobileWeight:"+mobileWeight);
	}

	public void sendMsg() {
		boolean  isFullCharged = true;
		int mobileCost = 30000;
		
		System.out.println("isFullCharged:"+isFullCharged+",  mobileCost:"+mobileCost);
	}
	
	public static void main(String[] args) {
		
		Mobile call=new Mobile();
		
		System.out.println("This is my mobile");
		call.makeCall();
	    call.sendMsg();
		
	}

}
