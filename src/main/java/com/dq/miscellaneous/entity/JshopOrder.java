package com.dq.miscellaneous.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "jshop_order")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JshopOrder  implements Serializable {
    @Id
    @Column(name="order_id")
    private String id;

    @Column(name="payed")
    private float payed;

    @Column(name="status")
    private int status;

    @Column(name="pay_status")
    private int payStatus;

    @Column(name="goods_show_type")
    private int goodsShowType;

    @Column(name="distribution_id")
    private int distributiond;





}
