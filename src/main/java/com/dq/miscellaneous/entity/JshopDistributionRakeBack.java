package com.dq.miscellaneous.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "jshop_distribution_rake_back")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JshopDistributionRakeBack implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="nick_name")
    private String nickName;

    @Column(name="phone")
    private String phone;

    @Column(name="utoken")
    private String utoken;

    @Column(name="user_id")
    private int userId;

    @Column(name="order_main_no")
    private String orderMainNo;

    @Column(name="rake_back_user_utoken")
    private String rakeBackUserUtoken;

    @Column(name="total_price")
    private int totalPrice;

    @Column(name="status")
    private int status;

    @Column(name="real_price")
    private int realPrice;

    @Column(name="rake_back_percentage")
    private float rakeBackPercentage;

    @Column(name="rake_back_price")
    private int rakeBackPrice;

    @Column(name="rake_back_hierarchy")
    private int rakeBackHierarchy;

    @Column(name="pay_time")
    private int payTime;

    @Column(name="rake_back_protect_time")
    private int rakeBackProtectTime;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="utoken", referencedColumnName="utoken")
//    private JshopDistributionUser jshopDistributionUser;
}
