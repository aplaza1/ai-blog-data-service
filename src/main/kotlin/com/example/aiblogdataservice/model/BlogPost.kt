package com.example.aiblogdataservice.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "blog_post")
class BlogPost(
        @Id @GeneratedValue val id: Int? = null,
        var title: String = "",
        var content: String = ""
)
