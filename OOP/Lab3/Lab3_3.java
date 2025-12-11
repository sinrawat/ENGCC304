class User3 {
    
    private String password;
    
    public User3(String initialPassword) {
        
        this.password = initialPassword;
    }
    
    public String getPassword() {
        
        return password;
    }
    
    public void setPassword(String newPassword) {
        
        boolean isLengthValid = newPassword.length() >= 8;
        boolean isLongerThanCurrent = newPassword.length() > this.password.length();
        
        if (isLengthValid && isLongerThanCurrent) {
            
            this.password = newPassword;
            
            System.out.println("Password updated.");
        } 
        else {
            
            if (newPassword.length() < 8) {
                
                System.out.println("Password is too short.");
            } 
            else if (newPassword.length() <= this.password.length()) {
                
                System.out.println("New password must be longer than the current password.");
            }
        }
    }
}

public class Lab3_3 {
    
    public static void main(String[] args) {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        String initialPassword = scanner.nextLine();
        
        String newPassword = scanner.nextLine();
        
        User3 user = new User3(initialPassword);
        
        user.setPassword(newPassword);
        
        System.out.println(user.getPassword());
        
        scanner.close();
    }
}