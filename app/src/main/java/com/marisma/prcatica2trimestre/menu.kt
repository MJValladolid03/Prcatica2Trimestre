package com.marisma.prcatica2trimestre

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class menu : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_menu, container, false)
        val creditsButton = view.findViewById<Button>(R.id.creditsButton)
        creditsButton.setOnClickListener { // Navegar al fragmento de créditos
            navigateToCreditsFragment()
        }
        val logoutButton = view.findViewById<Button>(R.id.logoutButton)
        logoutButton.setOnClickListener { // Navegar de regreso al fragmento de Login
            navigateToLoginFragment()
        }
        return view
    }

    private fun navigateToCreditsFragment() {
        // Código para navegar al fragmento de créditos
    }

    private fun navigateToLoginFragment() {
        // Código para navegar al fragmento de Login
    }
}
