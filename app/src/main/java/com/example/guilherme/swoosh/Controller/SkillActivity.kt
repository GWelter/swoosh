package com.example.guilherme.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.guilherme.swoosh.Model.Player
import com.example.guilherme.swoosh.R
import com.example.guilherme.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBegginerClick(view: View) {
        begginer_skill_button.isChecked = true
        baller_skill_button.isChecked = false

        player.skill = "begginer"
    }

    fun onBallerClick(view: View) {
        begginer_skill_button.isChecked = false
        baller_skill_button.isChecked = true

        player.skill = "baller"
    }

    fun onSkillFinishClick(view: View) {
        if(player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show()
        }
    }
}
