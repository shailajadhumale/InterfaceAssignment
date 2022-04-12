
public class Menu {
	public class Menu<S,E> 
	{
		S a;
		E x;


		public Menu(S a, E x) {
			super();
			this.a = a;
			this.x = x;
		}

		@Override
		public String toString() {
			return "Menu [a=" + a + ", x=" + x + "]";
		}

		/*class SMS
		{
			String phnNumber;
			String Message;
			@Override
			public String toString() {
				return "SMS [phnNumber=" + phnNumber + ", Message=" + Message + "]";
			}
			public SMS(String phnNumber, String message) {
				super();
				this.phnNumber = phnNumber;
				Message = message;
			}
		
		
		
		}
		class Email
		{
			String EmailId;
			String Message;
		
		@Override
			public String toString() {
				return "Email [EmailId=" + EmailId + ", Message=" + Message + "]";
			}
		public Email(String emailId, String message) {
			super();
			EmailId = emailId;
			Message = message;
		}*/


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Menu<String, String> obj1=new Menu<>("9989955012","welcome");
			Menu<String,String> obj2=new Menu<>("abc@gmail.com","How are you");
			System.out.println(obj1);
			System.out.println(obj2);
			

		}

	}
}
