package com.example.aiblogdataservice.model

import jakarta.persistence.*

@Entity
@Table(name = "keyword")
class Keywords(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0,

        var keyword: String = "",

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "blogpost_title")
        var blogPost: BlogPost? = null
)
