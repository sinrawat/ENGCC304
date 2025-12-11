import java.util.Scanner;

class User9 {
    private String username;
    private String password;
    private static int minPasswordLength = 8;
    public static void setMinLength(int length) {
        if (length < 4) {
            System.out.println("Invalid length.");
        } else {
            minPasswordLength = length;
            System.out.println("New min length set to " + length);
        }
    }
    public static int getMinLength() {
        return minPasswordLength;
    }
    public User9(String username, String password) {
        this.setUsername(username);
        
        if (password.length() >= minPasswordLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            this.password = "invalid";
            System.out.println("Creation failed.");
        }
    }
    public void setPassword(String newPassword) {
        if (newPassword.length() >= minPasswordLength) {
            this.password = newPassword;
            System.out.println("Update successful.");
        } else {
            System.out.println("Update failed.");
        }
    }
    public String getPassword() {
        return this.password;
    }
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
public class Lab3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minLength1 = Integer.parseInt(scanner.nextLine());
        String user1_name = scanner.nextLine();
        String user1_pass = scanner.nextLine();
        String user2_name = scanner.nextLine();
        String user2_pass = scanner.nextLine();
        int minLength2 = Integer.parseInt(scanner.nextLine());
        String user2_newPass = scanner.nextLine();
        User9.setMinLength(minLength1);
        User9 user1 = new User9(user1_name, user1_pass);
        User9 user2 = new User9(user2_name, user2_pass);
        User9.setMinLength(minLength2);
        user2.setPassword(user2_newPass);
        System.out.println(user1.getPassword());
        System.out.println(user2.getPassword());
        scanner.close();
    }
}