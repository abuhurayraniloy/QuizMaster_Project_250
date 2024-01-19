package com.example.quizmaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizmaster.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding;
    lateinit var quiModelList: MutableList<QuizModel>
    lateinit var adapter: QuizListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        quiModelList = mutableListOf()
        getDataFromFirebase()
    }

    private fun setupRecyclerView(){
        adapter = QuizListAdapter(quiModelList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }

    private fun getDataFromFirebase(){
        quiModelList.add(QuizModel("1","Programming","All the basic progarmming","10"))
        quiModelList.add(QuizModel("2","Computer","All the basic computer question","20"))
        quiModelList.add(QuizModel("3","Programming","All the ger question","15"))
        setupRecyclerView()
    }
}