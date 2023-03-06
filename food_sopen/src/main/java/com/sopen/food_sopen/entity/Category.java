package com.sopen.food_sopen.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
@EntityListeners(AuditingEntityListener.class)
public class Category extends BaseEntity{
    @Basic
    @Column(name = "category_name")
    private String categoryName;
}
