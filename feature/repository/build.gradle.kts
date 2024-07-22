plugins {
    alias(libs.plugins.githubbrowser.android.feature)
    alias(libs.plugins.githubbrowser.android.library.compose)
    alias(libs.plugins.githubbrowser.android.library.jacoco)
}

android {
    namespace = "com.google.samples.apps.githubbrowser.feature.repository"
}

dependencies {
    implementation(projects.core.data)
    implementation(projects.core.domain)
    implementation(projects.core.ui)

    testImplementation(projects.core.testing)

    androidTestImplementation(libs.bundles.androidx.compose.ui.test)
    androidTestImplementation(projects.core.testing)
}