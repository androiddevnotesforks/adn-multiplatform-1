package com.example.multiplatform.presentation.showcases.userflow.theme.change

import com.example.multiplatform.presentation.showcases.ShowcaseItem
import com.example.multiplatform.presentation.showcases.ShowcasesViewModel
import com.example.multiplatform.presentation.theme.change.ChangeThemeDestination

/**
 * Showcase item representing a change theme screen.
 * This showcase item demonstrates the functionality of changing the theme via a dedicated screen.
 */
object ChangeThemeScreenShowcase : ShowcaseItem {

    override val label: String = "Change Theme Screen"

    override fun onClick(viewModel: ShowcasesViewModel) {
        viewModel.navigationStore.onNext(ChangeThemeDestination)
    }

}