package com.example.hello_h

import com.google.gson.annotations.SerializedName

data class RegistrationResponse(
    @SerializedName("message") var message: String,
    @SerializedName("student") var student: Student
)
