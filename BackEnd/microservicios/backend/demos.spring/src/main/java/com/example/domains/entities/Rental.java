package com.example.domains.entities;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;

import com.example.domains.core.entities.EntityBase;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

/**
 * The persistent class for the rental database table.
 * 
 */
@Entity
@Table(name = "rental")
@NamedQuery(name = "Rental.findAll", query = "SELECT r FROM Rental r")
public class Rental extends EntityBase<Rental> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rental_id")
	private int rentalId;

	@Column(name = "last_update")
	@NotNull
	@PastOrPresent
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Timestamp lastUpdate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rental_date")
	@NotNull
	private Date rentalDate;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	@Column(name = "return_date")
	private Date returnDate;

	// bi-directional many-to-one association to Payment
	@OneToMany(mappedBy = "rental", cascade = CascadeType.ALL, orphanRemoval = true)
	@Valid
	private List<Payment> payments;

	// bi-directional many-to-one association to Customer
	@ManyToOne
	@Positive
	@NotNull
	@JoinColumn(name = "customer_id")
	private Customer customer;

	// bi-directional many-to-one association to Inventory
	@ManyToOne
	@Positive
	@NotNull
	@JoinColumn(name = "inventory_id")
	private Inventory inventory;

	// bi-directional many-to-one association to Staff
	@ManyToOne
	@Positive
	@NotNull
	@JoinColumn(name = "staff_id")
	private Staff staff;

	public Rental() {
		super();
		payments = new ArrayList<Payment>();
	}

	public Rental(int rentalId) {
		this();
		this.rentalId = rentalId;
	}

	public Rental(int rentalId, @NotNull Date rentalDate, Date returnDate, @Positive @NotNull Customer customer,
			@Positive @NotNull Inventory inventory, @Positive @NotNull Staff staff) {
		this();
		this.rentalId = rentalId;
		this.rentalDate = rentalDate;
		this.returnDate = returnDate;
		this.customer = customer;
		this.inventory = inventory;
		this.staff = staff;
	}

	public Rental(int rentalId, @NotNull Date rentalDate, @Positive @NotNull Customer customer,
			@Positive @NotNull Inventory inventory) {
		super();
		this.rentalId = rentalId;
		this.rentalDate = rentalDate;
		this.customer = customer;
		this.inventory = inventory;
	}

	public Rental(int rentalId, @NotNull Date rentalDate) {
		super();
		this.rentalId = rentalId;
		this.rentalDate = rentalDate;
	}

	public int getRentalId() {
		return this.rentalId;
	}

	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getRentalDate() {
		return this.rentalDate;
	}

	public void setRentalDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}

	public Date getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public List<Payment> getPayments() {
		return this.payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public Payment addPayment(Payment payment) {
		getPayments().add(payment);
		payment.setRental(this);

		return payment;
	}

	public Payment removePayment(Payment payment) {
		getPayments().remove(payment);
		payment.setRental(null);

		return payment;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Inventory getInventory() {
		return this.inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customer, inventory, lastUpdate, payments, rentalDate, rentalId, returnDate, staff);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Rental))
			return false;
		Rental other = (Rental) obj;
		return Objects.equals(customer, other.customer) && Objects.equals(inventory, other.inventory)
				&& Objects.equals(lastUpdate, other.lastUpdate) && Objects.equals(payments, other.payments)
				&& Objects.equals(rentalDate, other.rentalDate) && rentalId == other.rentalId
				&& Objects.equals(returnDate, other.returnDate) && Objects.equals(staff, other.staff);
	}

}