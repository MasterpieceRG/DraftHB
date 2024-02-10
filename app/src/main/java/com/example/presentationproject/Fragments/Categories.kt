package com.example.presentationproject.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.presentationproject.Activitys.ActivityMenuList
import com.example.presentationproject.AdapterCategories.CategorieItemAdapter
import com.example.presentationproject.AdapterCategories.CategorieItems
import com.example.presentationproject.R
import com.example.presentationproject.databinding.FragmentCategoriesBinding

class Categories : Fragment() {
    private lateinit var binding:FragmentCategoriesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCategoriesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.categoriesList.setHasFixedSize(true)
        binding.categoriesList.layoutManager = GridLayoutManager(context, 2, GridLayoutManager.VERTICAL,false)
        var mList = ArrayList<CategorieItems>()


        mList.add(CategorieItems(R.drawable.slide_image2_salad_8_piezonis, "Bacon Double Cheeseburger","Salad: 15"))
        mList.add(CategorieItems(R.drawable.slide_image1_rice_bowl_grilled_chicken_supreme, "Bacon Double Cheeseburger","Rice bowl: 12"))
        mList.add(CategorieItems(R.drawable.slide_image3_pizza_5_cyprus, "Bacon Double Cheeseburger","Salad: 75"))
        mList.add(CategorieItems(R.drawable.slide_image4_sub_10_steak_bomb, "Bacon Double Cheeseburger","Salad: 21"))
        mList.add(CategorieItems(R.drawable.slide_image5_appetizer_7_buffalo_wings, "Bacon Double Cheeseburger","Salad: 18"))
        mList.add(CategorieItems(R.drawable.slide_image6_burger_3_ultimate, "Bacon Double Cheeseburger","Salad: 5"))
        mList.add(CategorieItems(R.drawable.slide_image7_calzone_2_bbq_chicken, "Bacon Double Cheeseburger","Salad: 3"))


        val categoriesAdapter = CategorieItemAdapter(mList)
        binding.categoriesList.adapter = categoriesAdapter

        categoriesAdapter.onItemClick = {
            val intent = Intent(context, ActivityMenuList::class.java)
            intent.putExtra("nameWithCount", it.nameWithCount)
            startActivity(intent)
        }
    }
}