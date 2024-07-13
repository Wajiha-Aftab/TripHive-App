package com.example.triphive

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.DialogFragment

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class RateUsFragment : DialogFragment() {

    private lateinit var btn_continue: AppCompatButton
    private lateinit var ratingBar: RatingBar

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        return dialog
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_rate_us, container, false)

        btn_continue = view.findViewById(R.id.btn_continue)
        ratingBar = view.findViewById(R.id.ratingBar)

        btn_continue.setOnClickListener {
            val rate = ratingBar.rating
            Toast.makeText(requireContext(), "Rating: $rate", Toast.LENGTH_LONG).show()
            dismiss()
        }

        return view
    }

    override fun onStart() {
        super.onStart()
        val window = dialog?.window
        val params = window?.attributes
        params?.dimAmount = 0.5f
        window?.attributes = params
        window?.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RateUsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
