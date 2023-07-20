package com.example.aiblogdataservice.model

import jakarta.persistence.*


@Entity
@Table(name = "blog_post")
class BlogPost(
        @Id
        var title: String = "",

        @Column(length = 1000)
        var content: String = "",

        var description: String = "",

        @ElementCollection
        @CollectionTable(name = "keywords", joinColumns = [JoinColumn(name = "blogpost_title")])
        @Column(name = "keyword")
        val keywords: MutableSet<String> = mutableSetOf()
)
