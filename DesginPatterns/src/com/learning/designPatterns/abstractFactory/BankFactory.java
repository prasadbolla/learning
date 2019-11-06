package com.learning.designPatterns.abstractFactory;
class BankFactory extends AbstractFactory{  
   public Bank getBank(String bank){  
      if(bank == null){  
         return null;  
      }  
      if(bank.equalsIgnoreCase("TD")){  
         return new TD();  
      } else if(bank.equalsIgnoreCase("CIBC")){  
         return new CIBC();  
      } else if(bank.equalsIgnoreCase("BMO")){  
         return new BMO();  
      }  
      return null;  
   }  
  public Loan getLoan(String loan) {  
      return null;  
   }  
}