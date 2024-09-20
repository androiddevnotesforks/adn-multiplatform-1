package com.example.multiplatform.presentation.showcases

import com.example.multiplatform.presentation.showcases.dataflow.keyvalue.`object`.ObjectKeyValueShowcase
import com.example.multiplatform.presentation.showcases.dataflow.keyvalue.primitive.PrimitiveKeyValueShowcase
import com.example.multiplatform.presentation.showcases.userflow.loader.data.DataLoaderShowcase
import com.example.multiplatform.presentation.showcases.userflow.navigation.args.ArgsNavigationShowcase
import com.example.multiplatform.presentation.showcases.userflow.navigation.no_args.NoArgsNavigationShowcase
import com.example.multiplatform.presentation.showcases.userflow.theme.change.ChangeThemeDialogShowcase
import com.example.multiplatform.presentation.showcases.userflow.theme.change.ChangeThemeScreenShowcase
import com.example.multiplatform.presentation.showcases.userflow.theme.toggle.ToggleThemeShowcase

/**
 * Object containing all showcase items.
 */
object Showcases {

    /**
     * A list containing all showcase items.
     */
    val all = listOf(
        ShowcaseItemGroup("Dataflow :: KeyValue"),
        PrimitiveKeyValueShowcase,
        ObjectKeyValueShowcase,
        ShowcaseItemGroup("Userflow :: Navigation + MVVM"),
        NoArgsNavigationShowcase,
        ArgsNavigationShowcase,
        ShowcaseItemGroup("Userflow :: Loader"),
        DataLoaderShowcase,
        ShowcaseItemGroup("Userflow :: Theme"),
        ChangeThemeScreenShowcase,
        ChangeThemeDialogShowcase,
        ToggleThemeShowcase,
    )

}