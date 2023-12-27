package week1_day2;

public class FindIntersection {

	public static void main(String[] args) {
		int [] n={3,2,11,4,6,7};
		int [] r={1,2,8,4,9,7};
		
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<r.length;j++) {
				if(n[i]==r[j]) {
					System.out.println(n[i]+",");
				}
			}
		}

	}

}
