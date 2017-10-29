package com.example.guilherme.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.guilherme.swoosh.Utilities.EXTRA_LEAGUE
import com.example.guilherme.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMenClicked(view: View) {
        men_league_button.isChecked = true
        women_league_button.isChecked = false
        coed_league_button.isChecked = false

        selectedLeague = "men"
    }

    fun onWomenClicked(view: View) {
        women_league_button.isChecked = true
        men_league_button.isChecked = false
        coed_league_button.isChecked = false

        selectedLeague = "women"
    }

    fun onCoEdClicked(view: View) {
        coed_league_button.isChecked = true
        women_league_button.isChecked = false
        men_league_button.isChecked = false

        selectedLeague = "co-ed"
    }
}
