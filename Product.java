/*
 * Copyright (C) 2011,2015 Karl R. Wurst, Aparna Mahadev
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA
 */

import java.text.*;     // for NumberFormat
import java.util.*;     // for Locale

/**
 * Represents a Product with a name, price.
 *
 * @author Karl R. Wurst
 * @author Aparna Mahadev
 * @version 1
 */
public class Product   {
    private String name;
    private double price;
    
    /**
     * Creates a Product.
     *
     * @param name the name for this product.
     * @param price the price for this product.
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
   
    /**
     * Sets the name for this product.
     *
     * @param name the name for this product.
     */
    public void setName(String name)   {
        this.name = name;
    }

    /**
     * Returns the name for this product.
     *
     * @return the name for this product.
     */
    public String getName()  {
        return name;
    }

    /**
     * Sets the price for this product.
     *
     * @param price the price for this product.
     */
    public void setPrice(double price)  {
        this.price = price;
    }

    /**
     * Returns the price for this product.
     *
     * @return the price for this product.
     */
    public double getPrice()  {
        return price;
    }

    /**
     * Returns a printable representation of a Product
     *
     * @return a printable representation of a Product
     */
    public String toString()  {
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        return "Product: " + name + "\tPrice: " + n.format(price) + " each";
    }
}