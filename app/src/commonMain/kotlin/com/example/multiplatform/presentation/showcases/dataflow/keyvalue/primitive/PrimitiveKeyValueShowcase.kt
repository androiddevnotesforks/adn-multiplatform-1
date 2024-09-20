package com.example.multiplatform.presentation.showcases.dataflow.keyvalue.primitive

import com.example.multiplatform.presentation.showcases.ShowcaseItem
import com.example.multiplatform.presentation.showcases.ShowcasesViewModel
import shared.presentation.navigation.NavigationDestination

object PrimitiveKeyValueShowcase : ShowcaseItem {

    override val label: String = "Save and restore primitives"

    override fun onClick(viewModel: ShowcasesViewModel) {
        viewModel.navigationStore.onNext(PrimitiveKeyValueDestination)
    }

    override fun dependsOn(): List<NavigationDestination<*>> = listOf(
        PrimitiveKeyValueDestination
    )

}