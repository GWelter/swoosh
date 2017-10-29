package com.example.guilherme.swoosh.Controller

import android.os.Bundle
import com.example.guilherme.swoosh.Model.Player
import com.example.guilherme.swoosh.R
import com.example.guilherme.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        search_text.text = "Looking for a ${player.league} ${player.skill} league near you"
    }
}
