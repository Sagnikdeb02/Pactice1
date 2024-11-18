package com.example.pactice.ui.theme

import com.example.pactice.R

data class CompanyBlock(
    val image : Int,
    val name : String,
    val type: String
)

val company = listOf(
    CompanyBlock(R.drawable.google, "Google", "Tech Company"),
    CompanyBlock(R.drawable.microsoft, "Microsoft", "Tech Company"),
    CompanyBlock(R.drawable.tesla, "Tesla", "Car Company"),
    CompanyBlock(R.drawable.nvidia, "NVIDIA", "Tech Company"),
    CompanyBlock(R.drawable.hdfc, "HDFC", "Bank"),
    CompanyBlock(R.drawable.samsung, "Samsung", "Electronic Company")
)