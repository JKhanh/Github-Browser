plugins {
    alias(libs.plugins.githubbrowser.android.library)
    alias(libs.plugins.githubbrowser.android.library.compose)
    alias(libs.plugins.githubbrowser.android.library.jacoco)
}

android {
    namespace = "com.google.samples.apps.githubbrowser.core.ui"
}

dependencies {
    api(libs.androidx.metrics)
    api(projects.core.model)

    implementation(libs.androidx.browser)
    implementation(libs.coil.kt)
    implementation(libs.coil.kt.compose)

    androidTestImplementation(libs.bundles.androidx.compose.ui.test)
    androidTestImplementation(projects.core.testing)
}