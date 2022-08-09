package Store;

public class WebStore extends Store{
    private String iPAddress;
    private String programmingLanguage;

    public WebStore(String name,String iPAddress,String programmingLanguage) {
        super(name);
        this.iPAddress=iPAddress;
        this.programmingLanguage=programmingLanguage;
    }
    public String getiPAddress() {
        return iPAddress;
    }
    public void setiPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public String toString() {
        return "WebStore{" +
                "iPAddress='" + iPAddress + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
