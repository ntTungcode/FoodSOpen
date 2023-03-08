package com.sopen.food_sopen.entity.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sopen.food_sopen.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
public class User extends BaseEntity {
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "password")
    private String password;

    @Basic
    @Column(name = "is_actived")
    private Boolean isActived;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "user_role_id", referencedColumnName = "id")
    private Role user_role;
}
