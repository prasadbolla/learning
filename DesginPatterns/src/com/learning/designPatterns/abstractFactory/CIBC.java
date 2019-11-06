package com.learning.designPatterns.abstractFactory;
class CIBC implements Bank{  
       private final String BNAME;  
       CIBC(){  
                BNAME="CIBC BANK";  
        }  
        public String getBankName() {  
                  return BNAME;  
       }  
} 