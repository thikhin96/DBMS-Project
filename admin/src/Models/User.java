package Models;

import javafx.beans.property.SimpleStringProperty;

public class User {
	private final SimpleStringProperty userID;
	private final SimpleStringProperty userName;
	private final SimpleStringProperty userDOB;
	private final SimpleStringProperty userTel;
	private final SimpleStringProperty userAdd;
	private final SimpleStringProperty userEmail;
	
	public User(String id, String uName, String dob, String tel, String add, String email){
		
		this.userID = new SimpleStringProperty(id);
		this.userName = new SimpleStringProperty(uName);
		this.userDOB = new SimpleStringProperty(dob);
		this.userTel = new SimpleStringProperty(tel);
		this.userAdd = new SimpleStringProperty(add);
		this.userEmail = new SimpleStringProperty(email);
	}
	
    public String getUserID() {
        return userID.get();
    }
 
    public void setUserID(String id) {
        userID.set(id);
    }
    
    public String getUserName() {
        return userName.get();
     }
     
        
    public void setUserName(String uName) {
       userName.set(uName);
    }
    
    public String getUserDOB() {
        return userDOB.get();
    }
    
    public void setUserDOB(String dob) {
        userDOB.set(dob);
    }
    
    public String getUserTel() {
        return userTel.get();
    }
    
    public void setUserAdd(String uAdd) {
        userAdd.set(uAdd);
    }

    public String getUserAdd() {
       return userAdd.get();
    }
    
    public void setUserEmail(String uEm) {
        userEmail.set(uEm);
    }

    public String getUserEmail() {
       return userEmail.get();
    }
}
