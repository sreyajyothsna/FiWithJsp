package com.deloitte;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;



@Entity
@Table(name="Hire_table")

public class hire_table implements Serializable  {

	
	/* @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name="id")
	 protected int id;
	 */
	
	
	 @Id
	@Column(name="p1")
	private int p1;
	
	@Column(name = "Hire_category")
	private String Hire_category;
	
	
	@Column(name="p2")
	private int p2;
	@Column(name="p3")
	private int p3;
	@Column(name="p4")
	private int p4;
	@Column(name="p5")
	private int p5;
	@Column(name="p6")
	private int p6;
	@Column(name="p7")
	private int p7;
	@Column(name="p8")
	private int p8;
	@Column(name="p9")
	private int p9;
	@Column(name="p10")
	private int p10;
	
	@Column(name = "Comments")
	private String Comments;
	
	public int getp1()
	{
return p1;
	}
	
	public void setp1(int p1) {
		this.p1=p1;
	}
	
	public int getp2()
	{
return p2;
	}
	
	public void setp2(int p2) {
		this.p2=p2;
	}
	public int getp3()
	{
return p3;
	}
	
	public void setp3(int p3) {
		this.p3=p3;
	}
	public int getp4()
	{
return p4;
	}
	
	public void setp4(int p4) {
		this.p4=p4;
	}
	public int getp5()
	{
return p5;
	}
	
	public void setp5(int p5) {
		this.p5=p5;
	}
	public int getp6()
	{
return p6;
	}
	
	public void setp6(int p6) {
		this.p6=p6;
	}
	public int getp7()
	{
return p7;
	}
	
	public void setp7(int p7) {
		this.p7=p7;
	}
	public int getp8()
	{
return p8;
	}
	
	public void setp8(int p8) {
		this.p8=p8;
	}
	public int getp9()
	{
return p9;
	}
	
	public void setp9(int p9) {
		this.p9=p9;
	}
	public int getp10()
	{
return p10;
	}
	
	public void setp10(int p10) {
		this.p10=p10;
	}
	public String getComments() {
		return Comments;
	}

	public void setComments(String Comments) {
		this.Comments=Comments;
	}
	public String getHireCategory() {
		return Hire_category;
	}

	public void setHireCategory(String Hire_category) {
		this.Hire_category =Hire_category;
	}
	 public hire_table() {
	    }
	 
	 public hire_table(String hire_category, int p1, int p2, int p3)
	 {
		 Hire_category = hire_category;
			this.p1 = p1;
			this.p2 = p2;
			this.p3 = p3;
	 }
	 
	 
	 

	public hire_table(String hire_category, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10,
			String comments) {
		
		Hire_category = hire_category;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
		this.p6 = p6;
		this.p7 = p7;
		this.p8 = p8;
		this.p9 = p9;
		this.p10 = p10;
		Comments = comments;
	}	
}