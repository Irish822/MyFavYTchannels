package com.example.myfavouriteyoutubechannels.models

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
class Channel(var id: String? = "", var name: String? = "", var link: String? = "", var rank: Int = 0, var reason: String? = "") {
    override fun toString(): String {
        return "Top $rank: $name"
    }
}