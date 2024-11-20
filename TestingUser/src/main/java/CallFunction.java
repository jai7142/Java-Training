import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import entity.User;
import exception.UserIdNotFoundException;
import service.UserService;
import service.UserServiceImpl;

public class CallFunction {

	public static void main(String[] args) {
		
		UserService userService = UserServiceImpl.getInstance();
		User user = null;
		Scanner scanner = null;
		try {
			String userId = null;
			scanner = new Scanner(System.in);
			System.out.println("welcome to the User app please enter the options you want");
			System.out.println("1.add,2.get,3.getall,4.delete,5.update");
			String input = scanner.nextLine();;
			
			if(input.equals("get")||input.equals("delete")||input.equals("update")) {
				System.out.println("Please Enter the User ID");
				 userId = scanner.nextLine();;
			}
			
			switch(input) {
			
			case "add":
			//User adding 
			user = new User("jaya", "Kumar", "Welcome123", "test123@gmail.com", 8870454545L);
			User user2 = userService.addUser(user);
			if (user2 != null) {
				System.out.println("User Added Successfully");
			}
			break;
			
			case "get":
			// get by id
			Optional<User> userObj = userService.getUserById(userId);
			if (userId.isEmpty()) {
				System.out.println("User Id not exist in the Record");
				throw new UserIdNotFoundException("UserId not found.");
			} else {
				System.out.println("User found and user Name is : "+userObj.get().getUserName());
			}
			break;
			
			case "getall":
			// User List
			Optional<List<User>> users = userService.getUsers();
			if (users.isPresent()) {
				for (User userList : users.get()) {
					System.out.println("User name is : " + userList.getUserName());
				}
			}
			break;
			
			case "update":
			// update
			User updateUser = new User("jai", "Sam", "Welcome123", "test123@gmail.com", 8870454545L);
			User updateUser1 = userService.updateUser(userId, updateUser);
			if (updateUser1 != null) {
				System.out.println("User Updated Successfully");
				System.out.println("User name is : " + updateUser1.getUserName());
			}
			break;
			
			case "delete":
			// delete
			Optional<User> deleteId = userService.getUserById(userId);
			if (deleteId.isPresent()) {
				userService.deleteUser(deleteId.get().getId().toString());
			}
			break;
			
			default:
				System.out.println("given inputs are not matched with the all cases");
			}
			
			//HashSet<E>

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
