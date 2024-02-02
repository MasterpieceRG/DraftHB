package com.example.presentationproject


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.presentationproject.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var actionBarDrawerTaggle: ActionBarDrawerToggle
    private lateinit var toolbar: Toolbar
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var navController = findNavController(R.id.fragmentContainerView)
        binding.bottomNavView.setupWithNavController(navController)

        toolbar = binding.toolbar
        setSupportActionBar(toolbar)


        actionBarDrawerTaggle = ActionBarDrawerToggle(this, binding.drawerLayout, R.string.nav_open, R.string.nav_close)
        actionBarDrawerTaggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)



        binding.draweNav.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.profile -> {
                    binding.drawerLayout.closeDrawers()
//                    binding.draweNav.setupWithNavController(navController)
                    startActivity(Intent(this@MainActivity, ActivityProfile::class.java))
                }
                R.id.tableBooking -> {
                    binding.drawerLayout.closeDrawers()
                    binding.draweNav.setupWithNavController(navController)
                }

                R.id.logout -> {
                    binding.drawerLayout.closeDrawers()
                    binding.draweNav.setupWithNavController(navController)
                }

                R.id.setting -> {
                    binding.drawerLayout.closeDrawers()
                    binding.draweNav.setupWithNavController(navController)
                }

                R.id.about -> {
                    binding.drawerLayout.closeDrawers()
                    binding.draweNav.setupWithNavController(navController)
                }

                R.id.share -> {
                    binding.drawerLayout.closeDrawers()
                    binding.draweNav.setupWithNavController(navController)
                }


                R.id.home -> {
                    binding.drawerLayout.closeDrawers()
                    binding.draweNav.setupWithNavController(navController)
                }

                R.id.wishlist -> {
                    binding.drawerLayout.closeDrawers()
                    binding.draweNav.setupWithNavController(navController)
                }

                R.id.categories -> {
                    binding.drawerLayout.closeDrawers()
                    binding.draweNav.setupWithNavController(navController)
                }
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerTaggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }

}

