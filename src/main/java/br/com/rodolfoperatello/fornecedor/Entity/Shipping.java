package br.com.rodolfoperatello.fornecedor.Entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "SHIPPING")
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SHIPPING_ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "FEE")
    private BigDecimal fee;
    @Column(name = "DELIVERY_DATE")
    private String deliveryDate;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ADDRESS_ID")
    private Address address;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_ID")
    private List<Product> productList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Shipping{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fee=" + fee +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", address=" + address +
                ", productList=" + productList +
                '}';
    }
}
