
public class Punter1 {
// added conflict
public int hashCode()
		{
			return 143;
		}
		
		public static void main(String[] args) 
		{
			Punter1 p=new Punter1();
			System.out.println(p.hashCode());
		}


	

}
