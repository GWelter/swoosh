package com.example.guilherme.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.guilherme.swoosh.R
import com.example.guilherme.swoosh.Utilities.EXTRA_LEAGUE
import com.example.guilherme.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE) as String
    }

    fun onBegginerClick(view: View) {
        begginer_skill_button.isChecked = true
        baller_skill_button.isChecked = false

        skill = "begginer"
    }

    fun onBallerClick(view: View) {
        begginer_skill_button.isChecked = false
        baller_skill_button.isChecked = true

        skill = "baller"
    }

    fun onSkillFinishClick(view: View) {
        if(skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show()
        }
    }
}
