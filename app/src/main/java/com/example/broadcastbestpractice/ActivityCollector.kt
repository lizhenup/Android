package com.example.broadcastbestpractice

import android.app.Activity

object ActivityCollector {
    private val activits = ArrayList<Activity>()

    fun addActivity(activity: Activity) {
        activits.add(activity)
    }
    fun removeActivity(activity: Activity) {
        activits.remove(activity)
    }

    fun finishAll() {
        for (activity in activits) {
            if(!activity.isFinishing) activity.finish()
        }
        activits.clear()
    }
}