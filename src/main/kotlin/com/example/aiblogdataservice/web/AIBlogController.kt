package com.example.aiblogdataservice.web

import com.example.aiblogdataservice.model.BlogPost
import com.example.aiblogdataservice.service.AIBlogService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class AIBlogController (
        val aiBlogService: AIBlogService
){
    @PostMapping("/blog-post")
    fun createNewBlogPost(@RequestBody blogPost: BlogPost): BlogPost{
        return aiBlogService.saveBlogPost(blogPost)
    }

    @GetMapping("/blog-post")
    fun getBlogPost(@RequestParam title: String): BlogPost? {
        return aiBlogService.getBlogPost(title)
    }
}