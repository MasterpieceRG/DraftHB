package com.example.presentationproject.Fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.presentationproject.Activitys.ActivityItemDetails
import com.example.presentationproject.AdapterPopular.PopularItemAdapter
import com.example.presentationproject.AdapterPopular.PopularItems
import com.example.presentationproject.RandomMeals.MealList
import com.example.presentationproject.R
import com.example.presentationproject.Retrofit.RetrofitInstance
import com.example.presentationproject.databinding.FragmentHomeBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Home : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        RetrofitInstance.api.getRandomMeal().enqueue(object : Callback<MealList> {
            override fun onResponse(call: Call<MealList>, response: Response<MealList>) {
                if (response.body() != null) {
                    val randomMeal = response.body()!!.meals[0]
                    Glide.with(this@Home)
                        .load(randomMeal.strMealThumb)
                        .into(binding.randomImage)
                    binding.randomItemName.text = randomMeal.strMeal
                }else {
                    return
                }
            }

            override fun onFailure(call: Call<MealList>, t: Throwable) {
                Log.d("TEST", t.message.toString())
            }
        })


        binding.popularRecyclerView.setHasFixedSize(true)
        binding.popularRecyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        var mList = ArrayList<PopularItems>()


        mList.add(PopularItems(R.drawable.popular1_sub_3_greek_pocket, "Greek Pocket Sub", "$2.53","Subs","5 min", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(PopularItems(R.drawable.popular2_burger_2_double_bacon_cheeseburger, "Double Bacon Cheeseburger", "$5.43","Burger","10 min", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(PopularItems(R.drawable.popular3pizza_15_ultimate, "PeZones Ultimate Pizza", "$6.82","Pizza","15 min", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(PopularItems(R.drawable.popular4_appetizer_4_fries, "Fries Appetizer", "$0.85","Appetizer","5 min", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(PopularItems(R.drawable.popular5_salad_6_grilled_chicken_madeira, "Grilled Chicken Madeira", "$1.50","Salad","5 min", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(PopularItems(R.drawable.popular6_sub_1_buffalo_chicken, "Buffalo Chicken Sub", "$3.43","Subs","10 min", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(PopularItems(R.drawable.popular7_sub_4_grilled_chicken_caesar_wrap, "Grilled Chicken Caesar Wrap", "$3.95","Subs","10 min", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(PopularItems(R.drawable.popular8_penne_meatballs, "Penne Meatballs Pastas", "$2.33","Pastas","10 min", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(PopularItems(R.drawable.popular9_calzone_4_cyprus, "Cyprus Calzone", "$3.53","Calzone","10 min", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(PopularItems(R.drawable.popular10_appetizer_6_mozzarella_sticks, "Mozzarella Sticks Appetizer", "$2.75","Appetizer","5 min", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(PopularItems(R.drawable.popular11_rice_bowl_grilled_chicken_supreme_wraporito, "Grilled Chicken Supreme Wraporito", "$3.20","Rice Bowl","5 min", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))


        val popularAdapter = PopularItemAdapter(mList)
        binding.popularRecyclerView.adapter = popularAdapter

        popularAdapter.onItemClick = {
            val intent = Intent(context, ActivityItemDetails::class.java)
            intent.putExtra("image", it.image)
            intent.putExtra("name", it.name)
            intent.putExtra("price", it.price)
            intent.putExtra("category", it.category)
            intent.putExtra("time", it.time)
            intent.putExtra("ingredient", it.ingredient)
            intent.putExtra("details", it.details)
            startActivity(intent)
        }


    }
}

