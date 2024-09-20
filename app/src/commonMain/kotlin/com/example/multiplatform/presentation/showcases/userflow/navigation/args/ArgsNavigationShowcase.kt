package com.example.multiplatform.presentation.showcases.userflow.navigation.args

import com.example.multiplatform.presentation.showcases.ShowcaseItem
import com.example.multiplatform.presentation.showcases.ShowcasesViewModel
import com.example.multiplatform.presentation.showcases.userflow.navigation.args.from.ArgsNavigationFromDestination
import com.example.multiplatform.presentation.showcases.userflow.navigation.args.to.ArgsNavigationToDestination
import shared.presentation.navigation.NavigationDestination

object ArgsNavigationShowcase : ShowcaseItem {

    override val label: String = "Navigation with arguments"

    override fun onClick(viewModel: ShowcasesViewModel) {
        viewModel.navigationStore.onNext(ArgsNavigationFromDestination)
    }

    override fun dependsOn(): List<NavigationDestination<*>> = listOf(
        ArgsNavigationFromDestination,
        ArgsNavigationToDestination
    )

}