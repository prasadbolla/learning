package com.learning.designPatterns.abstractFactory;
class BMO implements Bank{  
      private final String BNAME;  
      public BMO(){  
                BNAME="BMO BANK";  
        }  
       public String getBankName(){  
                  return BNAME;  
       }  
}  