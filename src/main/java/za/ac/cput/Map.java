package za.ac.cput;

import java.util.Objects;

/*Author: Phindiwe Bambata 217180833
 * 10/05/2021
 *This class test Map
 */
public class Map {
private String product, productId;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Map)) return false;
        Map map = (Map) o;
        return getProductId().equals(map.getProductId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductId());
    }
}
