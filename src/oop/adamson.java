package oop;

public class adamson {

	public static void main(String[] args) {
		
			  System.out.println("*****Adamson Computers Ltd*****");
			  System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City * Tel. No:123-4567");
			  System.out.println("\t\tVAT REG. TIN 098-765-4321-0000\t\t\t\t");
			  System.out.println("\t\t\tSALES INVOICE");
			  String[] invoiceDetails= {"Sold to","Date","Address","Contact Number","Qty","Item Description","Unit Price","Amount","Sub total","VAT(16%)","Total Amount"};
			  String regNO="C026-01-0975/2022";
			  String fullName="Nonga Shaldon Omondi";
			   System.out.print(invoiceDetails[0]+":"+regNO);
			   System.out.println("\t\t\t\t"+invoiceDetails[1]+":28/04/2020");
			   System.out.print(invoiceDetails[2]+":"+fullName);
			   System.out.println("\t\t\t\t"+invoiceDetails[3]+":0100100100");
			   System.out.println("");
			   System.out.println("====================================================================================");
			   System.out.print(invoiceDetails[4]+"\t|");
			   System.out.print("\t"+invoiceDetails[5]+"\t|");
			   System.out.print("\t"+invoiceDetails[6]+"\t|");
			   System.out.println(invoiceDetails[7]);
			   System.out.println("=====================================================================================");
			   int[] nums= {4,10,9,10};
			    System.out.print(nums[0]+"\t|\t");
			   System.out.print("Pencil\t\t\t|\t20\t\t|");
			   double[] price={80.0,500.00,270.00,800.00};
			   System.out.println(price[0]);
			   System.out.println("-------------------------------------------------------------------------------------");
			       System.out.println(nums[1]+"\t|\tDuster\t\t\t|\t50\t\t|"+price[1]);
			   System.out.println("-------------------------------------------------------------------------------------");
			       System.out.println(nums[2]+"\t|\tPens\t\t\t|\t30\t\t|"+price[2]);
			   System.out.println("-------------------------------------------------------------------------------------");
			       System.out.println(nums[3]+"\t|\tcrayon\t\t\t|\t80\t\t|"+price[3]);
			   System.out.println("=====================================================================================");
			  double totals=price[0]+price[1]+price[2]+price[3];
			  double vat=totals*0.16;
			  double amounts=totals+vat;
			     System.out.println("\t\t\t\t\t\t|"+invoiceDetails[8]+"\t|"+totals);
			     System.out.println("\t\t\t\t\t\t======================================");
			     System.out.println("\t\t\t\t\t\t|"+invoiceDetails[9]+"\t|"+vat);
			     System.out.println("\t\t\t\t\t\t======================================");
			     System.out.println("\t\t\t\t\t\t|"+invoiceDetails[10]+"\t|"+amounts);
			     System.out.println("\t\t\t\t\t\t======================================");
			   
			   }
			   
			   
	}

