package com.example.stackapp.api.models


import com.squareup.moshi.Json

data class Item(
    @field:Json(name = "accepted_answer_id")
    val acceptedAnswerId: Int,
    @field:Json(name = "answer_count")
    val answerCount: Int,
    @field:Json(name = "bounty_amount")
    val bountyAmount: Int,
    @field:Json(name = "bounty_closes_date")
    val bountyClosesDate: Int,
    @field:Json(name = "closed_date")
    val closedDate: Int,
    @field:Json(name = "closed_reason")
    val closedReason: String,
    @field:Json(name = "creation_date")
    val creationDate: Int,
    @field:Json(name = "is_answered")
    val isAnswered: Boolean,
    @field:Json(name = "last_activity_date")
    val lastActivityDate: Int,
    @field:Json(name = "last_edit_date")
    val lastEditDate: Int,
    val link: String,
    val owner: Owner,
    @field:Json(name = "question_id")
    val questionId: Int,
    val score: Int,
    val tags: List<String>,
    val title: String,
    @field:Json(name = "view_count")
    val viewCount: Int
)