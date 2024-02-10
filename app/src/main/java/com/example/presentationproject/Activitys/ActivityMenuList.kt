package com.example.presentationproject.Activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.presentationproject.AdapterMenu.MealTypes
import com.example.presentationproject.AdapterMenu.MenuAdapter
import com.example.presentationproject.R
import com.example.presentationproject.databinding.ActivityMenuListBinding
import com.example.presentationproject.databinding.FragmentCategoriesBinding

class ActivityMenuList : AppCompatActivity() {
    private lateinit var binding: ActivityMenuListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMenuListBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.menuList.setHasFixedSize(true)
        binding.menuList.layoutManager = LinearLayoutManager(this)
        var mList = ArrayList<MealTypes>()


        mList.add(MealTypes(R.drawable.slide_image2_salad_8_piezonis, "Bacon Double Cheeseburger", "7 Pan","$6.47", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(MealTypes(R.drawable.slide_image1_rice_bowl_grilled_chicken_supreme, "Bacon Double Cheeseburger", "21 Pan", "$6.47", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(MealTypes(R.drawable.slide_image3_pizza_5_cyprus, "Bacon Double Cheeseburger", "9 Pan", "$6.47", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(MealTypes(R.drawable.slide_image4_sub_10_steak_bomb, "Bacon Double Cheeseburger", "16 Pan", "$6.47", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(MealTypes(R.drawable.slide_image5_appetizer_7_buffalo_wings, "Bacon Double Cheeseburger", "15 Pan", "$6.47", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(MealTypes(R.drawable.slide_image6_burger_3_ultimate, "Bacon Double Cheeseburger", "13 Pan", "$6.47", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))
        mList.add(MealTypes(R.drawable.slide_image7_calzone_2_bbq_chicken, "Bacon Double Cheeseburger", "3 Pan", "$6.47", R.string.BBQ_Chicken_Pizza_ingredients, R.string.BBQ_Chicken_Pizza))




        val burgerAdapter = MenuAdapter(mList)
        binding.menuList.adapter = burgerAdapter
        binding.nameWithCount.text = intent.getStringExtra("nameWithCount")

//        burgerAdapter.onItemClick = {
//            val intent = Intent(this@PizzasMenu, ItemDetails::class.java)
//            intent.putExtra("itemImage", it.itemImage)
//            intent.putExtra("itemName", it.itemName)
//            intent.putExtra("ingredient", it.ingredient)
//            intent.putExtra("details", it.details)
//            startActivity(intent)
//        }

    }
}