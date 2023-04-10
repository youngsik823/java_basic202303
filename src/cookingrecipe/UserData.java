package cookingrecipe;

public class UserData {
    String userAccount;
    String userPassword;
    String userName;

    public UserData() {
    }

    public UserData(String userAccount, String userPassword, String userName) {
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "userAccount='" + userAccount + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
