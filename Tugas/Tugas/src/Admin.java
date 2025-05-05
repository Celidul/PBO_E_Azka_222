public class Admin {
    private String username;
    private String password;

    // Constructor: mengisi data admin
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Method login: memverifikasi username dan password
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }
}