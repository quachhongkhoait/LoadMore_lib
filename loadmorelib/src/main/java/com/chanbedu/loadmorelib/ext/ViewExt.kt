package com.chanbedu.loadmorelib.ext

import android.os.SystemClock
import android.view.View

fun View.isVisible() = visibility == View.VISIBLE
fun View.isGone() = visibility == View.GONE
fun View.isInvisible() = visibility == View.INVISIBLE

fun View.visible() {
    if (!isVisible()) visibility = View.VISIBLE
}

fun View.gone() {
    if (!isGone()) visibility = View.GONE
}

fun View.invisible() {
    if (!isInvisible()) visibility = View.INVISIBLE
}


/**
 * Prevent fast click on a [View].
 */
fun View.safeClick(
    blockInMillis: Long = 1000L,
    onClick: (View) -> Unit
) {
    var lastClickTime: Long = 0
    setOnClickListener {
        if (SystemClock.elapsedRealtime() - lastClickTime < blockInMillis) return@setOnClickListener
        lastClickTime = SystemClock.elapsedRealtime()
        onClick(this)
    }
}
