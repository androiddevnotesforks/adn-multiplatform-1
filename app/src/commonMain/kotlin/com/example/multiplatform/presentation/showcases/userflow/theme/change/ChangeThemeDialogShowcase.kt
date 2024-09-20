package com.example.multiplatform.presentation.showcases.userflow.theme.change

import com.example.multiplatform.presentation.showcases.ShowcaseItem
import com.example.multiplatform.presentation.showcases.ShowcasesViewModel
import com.example.multiplatform.presentation.theme.change.ChangeThemeDialogDestination

/**
 * Showcase item representing a change theme dialog.
 * This showcase item demonstrates the functionality of changing the theme via a dialog.
 */
object ChangeThemeDialogShowcase : ShowcaseItem {

    override val label: String = "Change Theme Dialog"

    override fun onClick(viewModel: ShowcasesViewModel) {
        viewModel.navigationStore.onNext(ChangeThemeDialogDestination)
    }

}