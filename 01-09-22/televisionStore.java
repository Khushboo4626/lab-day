
package firstproject.bankapp;
import java.util.ArrayList;
public class televisionStore{
	public  static void main(String args[]) {
		// TODO Auto-generated method stub
		
		television t1=new television(801,2020,"OnePlus","ONEPLUS",31000);
		television t2=new television(322,2022,"Redmi","XIOMI",15000);
		television t3=new television(191,2015,"Samsung","SAMSUNG",36000);
		television t4=new television(672,2017,"Nacson","NACSON",10000);
		
		ArrayList<television> i1=new ArrayList<television>();

		i1.add(t4);
		i1.add(t3);
		i1.add(t2);
		i1.add(t1);
		
		i1.stream()
		.filter(tele->{
			return tele.tPrice>30000;
		})
		.forEach(tele->{
			System.out.println(tele.tCompany+" "+tele.tName+" Rs: "+tele.tPrice);
		});
	}
}
