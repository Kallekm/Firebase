package com.example.fishing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import android.view.MenuItem
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.navigation.NavigationView
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.nav_drawar.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener  {


    lateinit var  mDataBase:DatabaseReference
    private lateinit var fishList:ArrayList<FishData>
    private lateinit var mAdapter: FishAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawarLayout = findViewById<DrawerLayout>(R.id.drawarLayout)
        //val imgMenu = findViewById<ImageView>(R.id.imgMenu)
        val navView = findViewById<NavigationView>(R.id.nawDrawar)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(this, drawarLayout, toolbar, 0, 0)


        drawarLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)



       // navView.itemIconTintList = null
        //imgMenu.setOnClickListener{
        //    drawarLayout.openDrawer(GravityCompat.START)
       // }

        fishList = ArrayList()
        mAdapter = FishAdapter(this,fishList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = mAdapter
        getFishData()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.nav_weather -> {
                val intent = Intent(this, WeatherActivity::class.java)
                startActivity(intent)
            }
        }
        drawarLayout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun getFishData() {
        mDataBase = FirebaseDatabase.getInstance().getReference("fishes")
        mDataBase.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                Log.i("toimiiko","toimii")
                if(snapshot.exists()){
                    for(fishSnapshot in snapshot.children){
                        val fish = fishSnapshot.getValue(FishData::class.java)
                        fishList.add(fish!!)

                    }
                    recyclerView.adapter = mAdapter


                }
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@MainActivity,
                error.message,Toast.LENGTH_SHORT).show()
            }

        })
    }

}