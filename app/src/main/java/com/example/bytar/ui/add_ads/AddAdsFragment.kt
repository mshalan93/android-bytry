package com.example.bytar.ui.add_ads

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.checkSelfPermission
import com.example.bytar.databinding.FragmentAddAdsBinding

class AddAdsFragment : Fragment() {

    lateinit var binding: FragmentAddAdsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentAddAdsBinding.inflate(inflater, container, false)


/*
        //BUTTON CLICK
        binding.imgPickBtn.setOnClickListener {
            //check runtime permission
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                if (checkSelfPermission(requireContext(),Manifest.permission.READ_EXTERNAL_STORAGE) ==
                    PackageManager.PERMISSION_DENIED){
                    //permission denied
                    val permissions = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE);
                    //show popup to request runtime permission
                    requestPermissions(permissions, PERMISSION_CODE);
                }
                else{
                    //permission already granted
                    pickImageFromGallery();
                }
            }
            else{
                //system OS is < Marshmallow
                pickImageFromGallery();
            }
        }

*/



        return binding.root
    }
}
// private fun pickImageFromGallery() {
// //Intent to pick image
// val intent = Intent(Intent.ACTION_PICK)
// intent.type = "image/*"
// startActivityForResult(intent, IMAGE_PICK_CODE)
// }
// companion object {
// //image pick code
// private val IMAGE_PICK_CODE = 1000;
// //Permission code
// private val PERMISSION_CODE = 1001;
// }
// override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
// when(requestCode){
// PERMISSION_CODE -> {
// if (grantResults.size >0 && grantResults[0] ==
// PackageManager.PERMISSION_GRANTED){
// //permission from popup granted
// pickImageFromGallery()
// }
// else{
// //permission from popup denied
// Toast.makeText(requireContext(), "Permission denied", Toast.LENGTH_SHORT).show()
// }
// }
// }
//
// }
// override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
// if (resultCode == Activity.RESULT_OK && requestCode == IMAGE_PICK_CODE) {
// binding.imageView21.setImageURI(data?.data)
// }
// }