package practice3;

import java.math.BigDecimal;
import java.util.List;

public class PriceCalculator {
    private List<OrderLineItem> orderLineItemList;
    private List<BigDecimal> discounts;
    private BigDecimal tax;

    public PriceCalculator(List<OrderLineItem> orderLineItemList, List<BigDecimal> discounts, BigDecimal tax) {
        this.orderLineItemList = orderLineItemList;
        this.discounts = discounts;
        this.tax = tax;
    }

    public BigDecimal calculate() {
        BigDecimal subTotal = calculateSubTotal();
        subTotal = subtractDiscount(subTotal);
        return addTax(subTotal);
    }

    public BigDecimal calculateSubTotal() {
        BigDecimal subTotal = new BigDecimal(0);
        for (OrderLineItem lineItem : orderLineItemList) {
            subTotal = subTotal.add(lineItem.getPrice());
        }
        return subTotal;
    }

    public BigDecimal subtractDiscount(BigDecimal subTotal) {
        for (BigDecimal discount : discounts) {
            subTotal = subTotal.subtract(discount);
        }
        return subTotal;
    }

    public BigDecimal addTax(BigDecimal subTotal) {
        BigDecimal tax = subTotal.multiply(this.tax);
        return subTotal.add(tax);
    }

}
