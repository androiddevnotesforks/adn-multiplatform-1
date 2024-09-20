package com.example.multiplatform.presentation.showcases.userflow.navigation.no_args

import com.example.multiplatform.presentation.showcases.ShowcaseItem
import com.example.multiplatform.presentation.showcases.ShowcasesViewModel
import com.example.multiplatform.presentation.showcases.userflow.navigation.no_args.from.NoArgsNavigationFromDestination
import com.example.multiplatform.presentation.showcases.userflow.navigation.no_args.to.NoArgsNavigationToDestination
import shared.presentation.navigation.NavigationDestination

object NoArgsNavigationShowcase : ShowcaseItem {

    override val label: String = "Navigation without arguments"

    override fun onClick(viewModel: ShowcasesViewModel) {
        viewModel.navigationStore.onNext(NoArgsNavigationFromDestination)
    }

    override fun dependsOn(): List<NavigationDestination<*>> = listOf(
        NoArgsNavigationFromDestination,
        NoArgsNavigationToDestination
    )

}