package ru.netology.coroutines.dto

data class PostWithComments(
    val post: Post,
    val comments: List<Comment>,
)

data class AuthorPostsWithComments(
    val post: Post,
    val author: Author,
    val comments: List<Comment>,
)

data class DetailedPosts(
    val post: Post,
    val author: Author,
    val authorComments: List<AuthorComment>,
)