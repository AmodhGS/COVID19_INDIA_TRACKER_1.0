package com.example.covid19_india_tracker


import okhttp3.OkHttpClient
import okhttp3.Request


object Client {
    private  val ok_client = OkHttpClient()
    private val req=Request.Builder().url("https://api.covid19india.org/data.json").build()
    val api= ok_client.newCall(req)


}