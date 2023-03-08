package com.sopen.food_sopen.entity.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sopen.food_sopen.entity.BaseEntity;
import com.sopen.food_sopen.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_role")
@EntityListeners(AuditingEntityListener.class)
public class Role extends BaseEntity {
    @Basic
    @Column(name = "role_name")
    private String roleName;

    @OneToOne(mappedBy = "user_role", cascade = CascadeType.ALL)
    @JsonIgnore
    private User user;
}
