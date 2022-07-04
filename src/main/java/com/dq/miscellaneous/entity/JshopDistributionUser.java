package com.dq.miscellaneous.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "jshop_distribution_user")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JshopDistributionUser implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    @Column(name="phone")
    private String phone;

    @Column(name="user_name")
    private String userName;

    @Column(name="level_name")
    private String levelName;

    @NaturalId
    @Column(name="utoken")
    private String utoken;

    @Column(name="parent_utoken")
    private String parentUtoken;

    @Column(name="level")
    private int level;

    @Column(name="status")
    private int status;

    @Column(name="is_delete")
    private int isDelete;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="utoken")
//    private List<JshopDistributionRakeBack> jshopDistributionRakeBackList;

}
