public class pojo {
    private String name;
    private String Address;
    private String Language;
    private String Hobby;

    public pojo(String name, String address, String language, String hobby) {
        this.name = name;
        Address = address;
        Language = language;
        Hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getHobby() {
        return Hobby;
    }

    public void setHobby(String hobby) {
        Hobby = hobby;
    }
}
