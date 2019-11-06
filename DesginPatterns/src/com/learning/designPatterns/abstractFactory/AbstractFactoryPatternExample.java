package com.learning.designPatterns.abstractFactory;
import java.io.*;  
import static java.lang.System.*;
class AbstractFactoryPatternExample {  
      public static void main(String args[])throws IOException {  
       
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
      out.print("Enter the name of Bank from where you want to take loan amount: ");  
      String bankName=br.readLine();  
  
out.print("\n");  
out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");  
  
String loanName=br.readLine();  
AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");  
Bank b=bankFactory.getBank(bankName);  
  
out.print("\n");  
out.print("Enter the interest rate for "+b.getBankName()+ ": ");  
  
double rate=Double.parseDouble(br.readLine());  
out.print("\n");  
out.print("Enter the loan amount you want to take: ");  
  
double loanAmount=Double.parseDouble(br.readLine());  
out.print("\n");  
out.print("Enter the number of years to pay your entire loan amount: ");  
int years=Integer.parseInt(br.readLine());  
  
out.print("\n");  
out.println("you are taking the loan from "+ b.getBankName());  
  
AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");  
           Loan l=loanFactory.getLoan(loanName);  
           l.getInterestRate(rate);  
           l.calculateLoanPayment(loanAmount,years);  
  }  
}