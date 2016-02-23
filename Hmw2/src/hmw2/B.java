package hmw2;

class B extends A{
		   private Integer i = new Integer(0);
		   public void printValue() { // the return type of the method is not mentioned -> I set void 
		     System.out.println("Default value for I in B is:" + i.intValue());//+ i.intValue()
		   }
}
