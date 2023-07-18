package com.example.aiblogdataservice.service


import com.example.aiblogdataservice.model.BlogPost
import com.example.aiblogdataservice.repo.BlogPostRepo
import org.springframework.stereotype.Service

@Service
class AIBlogService(
        val blogPostRepo: BlogPostRepo
) {
    fun saveBlogPost(blogPost: BlogPost): BlogPost {
        return blogPostRepo.save(blogPost)
    }

    fun getBlogPost(title: String): BlogPost? {
        return blogPostRepo.findByTitle(title)
    }

    fun getAllBlogPosts(): List<BlogPost> {
        return blogPostRepo.findAll().toList()
    }
}