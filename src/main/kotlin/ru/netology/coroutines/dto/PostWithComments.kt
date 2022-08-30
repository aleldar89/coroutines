package ru.netology.coroutines.dto

data class PostWithComments(
    val post: Post,
    val comments: List<Comment>,
)

data class AuthorPostWithComments(
    val post: Post,
    val author: Author,
    val comments: List<Comment>,
)

data class DetailedPost(
    val post: Post,
    val author: Author,
    val authorComments: List<AuthorComment>,
)