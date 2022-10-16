package com.example.gdscace.data

import com.example.gdscace.R
import com.example.gdscace.model.TeamDataModel

class TeamDataSource {
    fun loadDataModels(): List<TeamDataModel> {
        return listOf<TeamDataModel>(
            TeamDataModel(R.drawable.amey, R.string.leadname1, R.string.leadrole1),
            TeamDataModel(R.drawable.mahendra, R.string.leadname2, R.string.leadrole2),
            TeamDataModel(R.drawable.aarnav, R.string.leadname3, R.string.leadrole3),
            TeamDataModel(R.drawable.hitanshu, R.string.leadname4, R.string.leadrole4),
            TeamDataModel(R.drawable.ria, R.string.leadname5, R.string.leadrole5),
            TeamDataModel(R.drawable.ritik, R.string.leadname6, R.string.leadrole6),
            TeamDataModel(R.drawable.anjan, R.string.leadname7, R.string.leadrole7),
            TeamDataModel(R.drawable.bhagyadeep, R.string.leadname8, R.string.leadrole8),
            TeamDataModel(R.drawable.dhairya, R.string.leadname9, R.string.leadrole9),
            TeamDataModel(R.drawable.gautams, R.string.leadname10, R.string.leadrole10),
            TeamDataModel(R.drawable.manan, R.string.leadname11, R.string.leadrole11),
            TeamDataModel(R.drawable.sahil, R.string.leadname12, R.string.leadrole12),
            TeamDataModel(R.drawable.gaurav, R.string.leadname13, R.string.leadrole13),
            TeamDataModel(R.drawable.hrigved, R.string.leadname14, R.string.leadrole14),
            TeamDataModel(R.drawable.atharva, R.string.leadname15, R.string.leadrole15),
            TeamDataModel(R.drawable.shubham, R.string.leadname16, R.string.leadrole16),
            TeamDataModel(R.drawable.avishkar, R.string.leadname17, R.string.leadrole17),
            TeamDataModel(R.drawable.gautamm, R.string.leadname18, R.string.leadrole18),
            TeamDataModel(R.drawable.vedant, R.string.leadname19, R.string.leadrole19),
        )
    }
}