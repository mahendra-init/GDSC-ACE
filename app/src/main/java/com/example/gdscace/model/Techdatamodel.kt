package com.example.gdscace.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Techdatamodel(
    @DrawableRes val imageResourceId: Int,
    @StringRes val titlestringResourceId: Int,
    @StringRes val descstringResourceId: Int,
)
