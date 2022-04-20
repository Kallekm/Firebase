package com.example.fishing

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.system.Os.bind
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.fishing.databinding.ActivityMainBinding.bind
import com.example.fishing.databinding.ViewHolderFishItemBinding
import com.example.fishing.SecondActivity
import com.google.android.gms.actions.ItemListIntents
import com.google.firebase.crashlytics.internal.common.Utils
import com.example.fishing.R


class FishAdapter(
    var c:Context,var fishList:ArrayList<FishData>
):RecyclerView.Adapter<FishAdapter.FishViewHolder>()
{
    inner class FishViewHolder(var v:ViewHolderFishItemBinding): RecyclerView.ViewHolder(v.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FishViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = DataBindingUtil.inflate<ViewHolderFishItemBinding>(inflater,R.layout.view_holder_fish_item,parent,
        false)
        return FishViewHolder(v)
    }

    override fun onBindViewHolder(holder: FishViewHolder, position: Int) {
        val newList = fishList[position]
        holder.v.isFish = fishList[position]
        holder.v.root.setOnClickListener(){
            val imageReal = newList.imageReal
            val title = newList.title
            val imageMap = newList.imageMap
            val mIntent = Intent(c,SecondActivity::class.java)
            mIntent.putExtra("imageReal", imageReal)
            mIntent.putExtra("imageMap",imageMap)
            mIntent.putExtra("title", title)
            c.startActivity(mIntent)

        }
    }

    override fun getItemCount(): Int {
        return fishList.size
    }


}