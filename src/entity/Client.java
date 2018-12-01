package entity;

public class Client extends Base {
    static private String TB = "clients";
    
    private int clientId;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String email;
    private String phone;

    public Client() {
        super();
    }

    public Client(int clientId, String firstName, String lastName, String birthDate, String email, String phone) {
        super();

        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
    }

    public int getClientId() {
        return clientId;
    }
    
    public void setClientId(int id) {
        clientId = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthDate() {
	return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    protected void configure() {
        tableName = TB;
        
        fields.put("clientId", "Int:id:deletable");
        fields.put("firstName", "String:first_name");
        fields.put("lastName", "String:last_name");
        fields.put("email", "String:email");
        fields.put("birthDate", "String:birth_date");
        fields.put("phone", "String:phone");
    }

    

}
