package com.example.aiblogdataservice.repo

import com.example.aiblogdataservice.model.BlogPost
import org.springframework.data.repository.CrudRepository

interface BlogPostRepo : CrudRepository<BlogPost, Long> {
    fun findByTitle(title: String): BlogPost?
}