package com.example.presentationproject.Fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.presentationproject.Meals.MealList
import com.example.presentationproject.AdapterPopular.PopularItemAdapter
import com.example.presentationproject.AdapterPopular.PopularItems
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


        mList.add(PopularItems(R.drawable.slide_image2_salad_8_piezonis, "Bacon Double Cheeseburger", R.string.price, R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(PopularItems(R.drawable.slide_image1_rice_bowl_grilled_chicken_supreme, "Bacon Double Cheeseburger", R.string.price, R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(PopularItems(R.drawable.slide_image3_pizza_5_cyprus, "Bacon Double Cheeseburger", R.string.price, R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(PopularItems(R.drawable.slide_image4_sub_10_steak_bomb, "Bacon Double Cheeseburger", R.string.price, R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(PopularItems(R.drawable.slide_image5_appetizer_7_buffalo_wings, "Bacon Double Cheeseburger", R.string.price, R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(PopularItems(R.drawable.slide_image6_burger_3_ultimate, "Bacon Double Cheeseburger", R.string.price, R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(PopularItems(R.drawable.slide_image7_calzone_2_bbq_chicken, "Bacon Double Cheeseburger", R.string.price, R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))


        val popularAdapter = PopularItemAdapter(mList)
        binding.popularRecyclerView.adapter = popularAdapter

//        popularAdapter.onItemClick = {
//            val intent = Intent(this@PizzasMenu, ItemDetails::class.java)
//            intent.putExtra("itemImage", it.itemImage)
//            intent.putExtra("itemName", it.itemName)
//            intent.putExtra("ingredient", it.ingredient)
//            intent.putExtra("details", it.details)
//            startActivity(intent)
//        }


    }
}

