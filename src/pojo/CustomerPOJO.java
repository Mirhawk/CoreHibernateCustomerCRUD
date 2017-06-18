package pojo;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="customerstab")
public class CustomerPOJO {

	int custID;
	String custName , custEmail , custPass, custRole ;
	Date custRegDate;
	double custRegAmt;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	
	@Column(name="name")
	public String getCustName() {
		return custName;
	}
	
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	@Column(name="email")
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	
	@Column(name="password")
	public String getCustPass() {
		return custPass;
	}
	public void setCustPass(String custPass) {
		this.custPass = custPass;
	}
	
	@Column(name="role")
	public String getCustRole() {
		return custRole;
	}
	public void setCustRole(String custRole) {
		this.custRole = custRole;
	}
	
	@Column(name="regdate")
	public Date getCustRegDate() {
		return custRegDate;
	}
	public void setCustRegDate(Date custRegDate) {
		this.custRegDate = custRegDate;
	}
	
	@Column(name="regAmt")
	public double getCustRegAmt() {
		return custRegAmt;
	}
	public void setCustRegAmt(double custRegAmt) {
		this.custRegAmt = custRegAmt;
	}
	
	public CustomerPOJO() {}

	public CustomerPOJO(String custName, String custEmail, String custPass, String custRole,double custRegAmt, Date custRegDate) {
		this.custName = custName;
		this.custEmail = custEmail;
		this.custPass = custPass;
		this.custRole = custRole;
		this.custRegAmt = custRegAmt;
		this.custRegDate = custRegDate;
	}
	
	
	public CustomerPOJO(int custID, String custName, String custEmail, String custRole,
			Date custRegDate, double custRegAmt) {
		this.custID = custID;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custRole = custRole;
		this.custRegDate = custRegDate;
		System.out.println("from pojo constr: "+custRegDate);
		this.custRegAmt = custRegAmt;
	}
	
	@Override
	public String toString() {
		return "CustomerPOJO [custID=" + custID + ", custName=" + custName + ", custEmail=" + custEmail + ", custRole="
				+ custRole + ", custRegDate=" + custRegDate + ", custRegAmt=" + custRegAmt + "]";
	}
	
}
