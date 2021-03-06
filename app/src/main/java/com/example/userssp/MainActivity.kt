package com.example.userssp

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cursosant.android.userssp.User
import com.example.userssp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var userAdapter: UserAdapter
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userAdapter = UserAdapter(getUsers())
        linearLayoutManager = LinearLayoutManager(this)

        binding.recyclerView.apply {
            layoutManager = linearLayoutManager
            adapter = userAdapter
        }
    }

    private fun getUsers() : MutableList<User>{
        val users = mutableListOf<User>()

        val alain = User(1, "Alain", "Nicoñas", "https://frogames.es/wp-content/uploads/2020/09/alain-1.jpg")
        val samanta = User(2, "Samanta", "Meza", "https://th.bing.com/th/id/OIP.3-J22sQnrvvu8fWUTkF_HwHaHe?pid=ImgDet&rs=1")
        val javier = User(3, "javier", "Gómez", "https://th.bing.com/th/id/R.0490dc500a5a4452453835af5fd63caa?rik=LzpNekjmDVr6Aw&pid=ImgRaw&r=0")
        val emma = User(4, "Emma", "Cruz", "https://th.bing.com/th/id/R.94892876995acd02699805b5fda8cf6a?rik=GbiS1yjDvGdkVA&pid=ImgRaw&r=0")

        users.add(alain)
        users.add(samanta)
        users.add(javier)
        users.add(emma)
        users.add(alain)
        users.add(samanta)
        users.add(javier)
        users.add(emma)
        users.add(alain)
        users.add(samanta)
        users.add(javier)
        users.add(emma)

        return users
    }
}