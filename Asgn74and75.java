 class encpsuse
{
	 private String email="TEST@gm.com";

	public  String getEmail() 
	{
		return email;
	}

	public void setEmail(String email)
	{
		
		this.email = email;
	}
	 
	
}
public class Asgn74and75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encpsuse e2=new encpsuse();
		e2.setEmail("TEST1@g.com");
		System.out.println(e2.getEmail());

	}

}
