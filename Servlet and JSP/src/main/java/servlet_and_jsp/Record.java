package servlet_and_jsp;

public class Record {
    private int id;
    private String name;
    private String contact;
    private String address;
    private String email;
    private String checkin;
    private String checkout;
    private String numPeople;


    
    public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getCheck_in() {
		return checkin;
	}



	public void setCheck_in(String checkin) {
		this.checkin = checkin;
	}



	public String getCheck_out() {
		return checkout;
	}



	public void setCheck_out(String checkout) {
		this.checkout = checkout;
	}



	public String getNumPeople() {
		return numPeople;
	}



	public void setNumPeople(String numPeople) {
		this.numPeople = numPeople;
	}



	@Override
    public String toString() {
        return "Record [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + ", email=" + email + ", checkin=" + checkin +", checkout=" +checkout+", numPeople=" + numPeople+"]";
    }

}

