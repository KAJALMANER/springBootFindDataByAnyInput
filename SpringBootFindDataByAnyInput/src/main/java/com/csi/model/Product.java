package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue
    private int prodId;

    private String prodName;
    private long prodCode;
    private double prodPrice;

    @JsonFormat(pattern="dd-MM-yyyy")
    private Date prodlunchDate;
}
