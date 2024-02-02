package com.example.presentationproject

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.example.presentationproject.databinding.ActivityProfileBinding

class ActivityProfile : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityProfileBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
            startActivity(Intent(this@ActivityProfile, MainActivity::class.java))
        }

        binding.nameCard.setOnClickListener {
            //findNavController().navigate(R.id.action_profile_to_editProfile)

            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.editTextEt)

            with(builder) {
                setTitle("Enter new Name!")
                setPositiveButton("Ok") { dialog, which ->
                    binding.name.text = editText.text.toString()
                }
                setNegativeButton("Cancel") { dialog, which ->
                    Log.d("Main", "Negetive button clicked")
                }
                setView(dialogLayout)
                show()
            }
        }

        binding.phoneCard.setOnClickListener {
            //findNavController().navigate(R.id.action_profile_to_editProfile)

            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.editTextEt)

            with(builder) {
                setTitle("Enter new Phone!(last 10 digit)")
                setPositiveButton("Ok") { dialog, which ->
                    binding.phone.text = editText.text.toString()
                }
                setNegativeButton("Cancel") { dialog, which ->
                    Log.d("Main", "Negetive button clicked")
                }
                setView(dialogLayout)
                show()
            }
        }

        binding.addressCard.setOnClickListener {
            //findNavController().navigate(R.id.action_profile_to_editProfile)

            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.editTextEt)

            with(builder) {
                setTitle("Enter new Address!")
                setPositiveButton("Ok") { dialog, which ->
                    binding.address.text = editText.text.toString()
                }
                setNegativeButton("Cancel") { dialog, which ->
                    Log.d("Main", "Negetive button clicked")
                }
                setView(dialogLayout)
                show()
            }
        }

        binding.DOBCard.setOnClickListener {
            //findNavController().navigate(R.id.action_profile_to_editProfile)

            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.editTextEt)

            with(builder) {
                setTitle("Enter new Date of Birth!")
                setPositiveButton("Ok") { dialog, which ->
                    binding.DOB.text = editText.text.toString()
                }
                setNegativeButton("Cancel") { dialog, which ->
                    Log.d("Main", "Negetive button clicked")
                }
                setView(dialogLayout)
                show()
            }
        }

        binding.bioCard.setOnClickListener {
            //findNavController().navigate(R.id.action_profile_to_editProfile)

            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.edit_text_layout, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.editTextEt)

            with(builder) {
                setTitle("Enter new Bio!")
                setPositiveButton("Ok") { dialog, which ->
                    binding.bio.text = editText.text.toString()
                }
                setNegativeButton("Cancel") { dialog, which ->
                    Log.d("Main", "Negetive button clicked")
                }
                setView(dialogLayout)
                show()
            }
        }
    }
}