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

        @OneToMany(mappedBy = "blogPost",
                cascade = [CascadeType.ALL],
                orphanRemoval = true,
                fetch = FetchType.LAZY)
        var keywords: Set<Keywords> = emptySet()
)
