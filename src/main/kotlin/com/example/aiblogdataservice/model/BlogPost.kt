package com.example.aiblogdataservice.model

import jakarta.persistence.*

@Entity
@Table(name = "blog_post")
class BlogPost(
        @Id @GeneratedValue val id: Int? = null,
        var title: String = "",
        @Column(length = 1000)
        var content: String = ""
)
