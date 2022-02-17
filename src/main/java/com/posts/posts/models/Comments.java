package com.posts.posts.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table (name = "comments")
@Getter
@Setter

public class Comments extends AuditModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Lob
    private String text;

    @ManyToOne (fetch = FetchType.LAZY , optional = false)
    @JoinColumn (name = "Id_post",nullable = false)
    @OnDelete (action = OnDeleteAction.CASCADE)
    private Posts post;
}
