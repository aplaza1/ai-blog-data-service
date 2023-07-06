package com.example.aiblogdataservice.web

import com.example.aiblogdataservice.model.BlogPost
import com.example.aiblogdataservice.service.AIBlogService
import mu.two.KotlinLogging
import org.springframework.web.bind.annotation.*

val logger = KotlinLogging.logger {}

@RestController
class AIBlogController (
        val aiBlogService: AIBlogService
){
    @PostMapping("/blog-posts")
    fun createNewBlogPost(@RequestBody blogPost: BlogPost): BlogPost{
        return aiBlogService.saveBlogPost(blogPost)
    }

    @CrossOrigin(origins = arrayOf("http://localhost:3000"))
    @GetMapping("/blog-posts")
    fun getBlogPost(@RequestParam title: String): BlogPost? {
            return aiBlogService.getBlogPost(title)
    }
}