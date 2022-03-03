package com.example.domains.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import java.sql.Timestamp;


/**
 * The persistent class for the payment database table.
 * 
 */
@Entity
@Table(name="payment")
@NamedQuery(name="Payment.findAll", query="SELECT p FROM Payment p")
public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="payment_id")
	private int paymentId;

	private BigDecimal amount;

	@Column(name="last_update")
	private Timestamp lastUpdate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="payment_date")
	private Date paymentDate;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;

	//bi-directional many-to-one association to Rental
	@ManyToOne
	@JoinColumn(name="rental_id")
	private Rental rental;

	//bi-directional many-to-one association to Staff
	@ManyToOne
	@JoinColumn(name="staff_id")
	private Staff staff;

	public Payment() {
	}
	
	
	public Payment(int paymentId) {
		super();
		this.paymentId = paymentId;
	}


	public Payment(int paymentId, BigDecimal amount, Timestamp lastUpdate, Date paymentDate, Customer customer,
			Rental rental, Staff staff) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.lastUpdate = lastUpdate;
		this.paymentDate = paymentDate;
		this.customer = customer;
		this.rental = rental;
		this.staff = staff;
	}


	public int getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Rental getRental() {
		return this.rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}


	@Override
	public int hashCode() {
		return Objects.hash(amount, customer, lastUpdate, paymentDate, paymentId, rental, staff);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(amount, other.amount) && Objects.equals(customer, other.customer)
				&& Objects.equals(lastUpdate, other.lastUpdate) && Objects.equals(paymentDate, other.paymentDate)
				&& paymentId == other.paymentId && Objects.equals(rental, other.rental)
				&& Objects.equals(staff, other.staff);
	}


	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + ", lastUpdate=" + lastUpdate
				+ ", paymentDate=" + paymentDate + ", customer=" + customer + ", rental=" + rental + ", staff=" + staff
				+ "]";
	}
	
	

}