//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    {
        double purchasePrice = 100.00; //simulating input
        final double TAX_RATE = .05;
        double salesTax = 0;
        double totalPrice=0;
        salesTax = purchasePrice*TAX_RATE;
        totalPrice = purchasePrice + salesTax;
        System.out.println("The sales tax is " + salesTax + " dollars and the total price is " + totalPrice + " dollars.");
    }
}
