#!/bin/bash

# API endpoint URL
API_URL="https://ai-blog-data-service-2902779ebc41.herokuapp.com/blog-posts"

# Request data
REQUEST_DATA='{
  "title": "how-to-create-functions-in-kotlin",
  "content": "In Kotlin, functions are declared with the `fun` keyword. Here'\''s a simple function that adds two integers:\n\n```kotlin\nfun add(a: Int, b: Int): Int {\n    return a + b\n}\n```\nThis function takes two integers as parameters and returns their sum.",
  "description": "Demonstrates how to create a simple function in Kotlin that adds two integers.",
  "keywords": ["kotlin", "functions", "fun", "parameters", "return"]
}'

# Make the POST request and capture the response
response=$(curl -s -X POST -H "Content-Type: application/json" -d "$REQUEST_DATA" "$API_URL")

# Extract the HTTP status code using jq
http_status=$(echo "$response" | jq -r '.id // empty')

if [[ -n "$http_status" ]]; then
  echo "Request successful"
  echo "$response"
else
  echo "Request failed with response:"
  echo "$response"
fi