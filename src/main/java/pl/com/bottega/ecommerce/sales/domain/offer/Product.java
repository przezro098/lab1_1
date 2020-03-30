package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class Product
{

    private String id;
    private String name;
    private String type;
    private Money price;
    private Date snapshot;

    public Product(String id, String name, String type, BigDecimal price, String currency,  Date snapshot)
    {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = new Money(price, currency);
        this.snapshot = snapshot;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }


    public Money getPrice()
    {
        return price;
    }


    public Date getSnapshot()
    {
        return snapshot;
    }

    @Override public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(id, product.id)
                && Objects.equals(price, product.price)
                && Objects.equals(name, product.name)
                && Objects.equals(type, product.type)
                && Objects.equals(snapshot, product.snapshot);
    }

    @Override public int hashCode()
    {
        return Objects.hash(id, price, name, type, snapshot);
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setPrice(Money price)
    {
        this.price = price;
    }

    public void setSnapshot(Date snapshot)
    {
        this.snapshot = snapshot;
    }
}