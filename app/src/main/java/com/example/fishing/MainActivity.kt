package com.example.fishing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.*
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import java.lang.RuntimeException



class MainActivity : AppCompatActivity() {
    lateinit var  mDataBase:DatabaseReference
    private lateinit var fishList:ArrayList<FishData>
    private lateinit var mAdapter: FishAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fishList = ArrayList()
        mAdapter = FishAdapter(this,fishList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = mAdapter
        getFishData()
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