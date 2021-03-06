package br.com.nglauber.tdcapp.presentation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SessionBinding(
        val id: Long,
        val slot: Int,
        val order: Int,
        val activated: Boolean,
        val title: String,
        val description: String,
        val type: Int,
        val time: String,
        val eventId: Long,
        val modalityId: Long,
        var bookmarked: Boolean
) : Parcelable