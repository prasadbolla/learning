package com.learning.designPatterns.abstractFactory;
class TD implements Bank{  
         private final String BNAME;  
         public TD(){  
                BNAME="TD BANK";  
        }  
        public String getBankName() {  
                  return BNAME;  
        }  
}  