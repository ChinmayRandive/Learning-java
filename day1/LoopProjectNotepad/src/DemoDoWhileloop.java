
public class DemoDoWhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				int i = 2;
				int choice = -1;
				boolean isPrime = true;
				do
				{
					switch(choice)
					{
						
						case 1:
							System.out.println("Register");
							break;
						case 2:
							System.out.println("Find");
							break;
						case 3:
							System.out.println("FindAll");
							break;
						case 4:
							System.out.println("Delete");
							break;
						case -1:
							System.out.println("Update");
							break;
						default:
							System.out.println("No Choice taken");
					}
				}while(choice != -1);

			}

		
	}


