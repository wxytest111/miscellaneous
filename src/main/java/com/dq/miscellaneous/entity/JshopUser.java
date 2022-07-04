package com.dq.miscellaneous.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "jshop_user")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JshopUser  implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    @Column(name="username")
    private String username;

    @Column(name="mobile")
    private String mobile;


}
