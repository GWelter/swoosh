package com.example.guilherme.swoosh.Controller

import android.os.Bundle
import com.example.guilherme.swoosh.Utilities.EXTRA_LEAGUE
import com.example.guilherme.swoosh.R

class SkillActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE) as String
    }
}
