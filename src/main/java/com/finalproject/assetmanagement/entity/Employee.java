package com.finalproject.assetmanagement.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(generator = "uuid-hibernate-generator")
    @GenericGenerator(name = "uuid-hibernate-generator", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "varchar(36)")
    private String id;

    @Column(name = "username" , nullable = false)
    private String username;

    @Column(name = "password" , nullable = false)
    private String password;

    @Column(name = "email" , nullable = false)
    private String email;

    @Column(name = "mobilePhone" , nullable = false)
    private String mobilePhone;

    @ManyToOne
    @Column(name = "asset_id")
    private Asset assetId;


}
