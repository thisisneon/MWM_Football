package com.example.mwmfootball.model.Teams

import com.google.gson.annotations.SerializedName

data class Team(
    @SerializedName("address")
    val address: String,
    @SerializedName("area")
    val area: AreaX,
    @SerializedName("clubColors")
    val clubColors: String,
    @SerializedName("cresUrl")
    val crestUrl: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("founded")
    val founded: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("lastUpdated")
    val lastUpdated: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("shortName")
    val shortName: String,
    @SerializedName("tla")
    val tla: String,
    @SerializedName("venue")
    val venue: String,
    @SerializedName("website")
    val website: String
)