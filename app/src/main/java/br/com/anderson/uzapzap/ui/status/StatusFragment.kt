package br.com.anderson.uzapzap.ui.status


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.anderson.uzapzap.R
import br.com.anderson.uzapzap.ui.base.BaseFragment

class StatusFragment : BaseFragment() {

    override fun getTitulo(): Int {
        return R.string.tab_status
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_status, container, false)
    }


}
