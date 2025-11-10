@FunctionalInterface
public interface Taxable {
 double calculateTax(double income);
 
 //bigger to write
 //Taxable t = (double income) -> {return income * 0.20;};

 //shorter to write
 //Taxable t = (income) -> {return income * 0.20;};
}