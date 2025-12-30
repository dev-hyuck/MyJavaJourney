package day04_study02;

public class User {

    String id; // 필수값
    String password; // 필수값
    String email; // 선택값

    public User(String id, String password, String email) {
        this.id = id;
        this.password = password;
        this.email = email;
    }

    public User(String id, String password) {
        this.id = id;
        this.password = password;

    }
}
