package com.chanbedu.loadmorelib

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.StaggeredGridLayoutManager

internal object LoadMoreHelper {

    fun inflate(parent: ViewGroup, @LayoutRes resource: Int): View {
        return LayoutInflater.from(parent.context).inflate(resource, parent, false)
    }

    fun setItemViewFullSpan(itemView: View) {
        val layoutParams = itemView.layoutParams
        if (layoutParams is StaggeredGridLayoutManager.LayoutParams) {
            layoutParams.isFullSpan = true
        }
    }
}
