package com.example.presentationproject


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.presentationproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var actionBarDrawerTaggle: ActionBarDrawerToggle
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var navController = findNavController(R.id.fragmentContainerView)
        binding.bottomNavView.setupWithNavController(navController)



        actionBarDrawerTaggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            R.string.nav_open,
            R.string.nav_close
        );
        actionBarDrawerTaggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.draweNav.setNavigationItemSelectedListener { menuItem ->


            when (menuItem.itemId) {
                R.id.profile -> {
                    binding.drawerLayout.closeDrawers()
                    binding.draweNav.setupWithNavController(navController)
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

