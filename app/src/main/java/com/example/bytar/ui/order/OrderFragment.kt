package com.example.bytar.ui.order

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bytar.databinding.FragmentOrderBinding
import com.example.bytar.ui.setting.SettingActivity
import com.stepstone.stepper.Step
import com.stepstone.stepper.StepperLayout
import com.stepstone.stepper.VerificationError
import com.stepstone.stepper.viewmodel.StepViewModel
import androidx.annotation.IntRange as AndroidIntRange

class OrderFragment : Fragment() , Step  {
    lateinit var binding: FragmentOrderBinding

    private var mStepperLayout: StepperLayout?=null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderBinding.inflate(inflater, container, false)

        /*getViewModel(2)
*/
        mStepperLayout =  binding.stepperLayout;
        mStepperLayout!!.setAdapter(
            MyStepperAdapter(
                (context as SettingActivity).supportFragmentManager,
                requireContext()
            )
        )
        return binding.root
    }

    override fun onSelected() {
/*
        binding.button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                //Your code here
            }})*/
    }

    override fun verifyStep(): VerificationError? {
        TODO("Not yet implemented")
    }


    override fun onError(error: VerificationError) {
    }
   /* fun getViewModel(position:Int) : StepViewModel {

        IntRange (0, position)
        val builder: StepViewModel.Builder=StepViewModel.Builder(requireContext())
            .setTitle(R.string.search_go)
        when (position) {
            0 -> builder
                .setEndButtonLabel("This way")
                .setBackButtonLabel("Cancel")
                .setNextButtonEndDrawableResId(R.drawable.button_onoff_indicator_off)
                .setBackButtonStartDrawableResId(StepViewModel.NULL_DRAWABLE)
            1 -> builder
                .setEndButtonLabel(R.string.autofill)
                .setBackButtonLabel("Go to first")
                .setBackButtonStartDrawableResId(R.drawable.alert_dark_frame)
            2 -> builder
                .setBackButtonLabel("Go back")
                .setEndButtonLabel("I'm done!")
            else -> throw IllegalArgumentException("Unsupported position: $position")
        }
        return builder.create()
        }*/

}