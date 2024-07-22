plugins {
    alias(libs.plugins.githubbrowser.android.library)
    alias(libs.plugins.githubbrowser.android.library.jacoco)
    alias(libs.plugins.githubbrowser.android.room)
    alias(libs.plugins.githubbrowser.hilt)
}

android {
    namespace = "com.google.samples.apps.githubbrowser.core.database"
}

dependencies {
    api(projects.core.model)

    implementation(libs.kotlinx.datetime)

    androidTestImplementation(libs.androidx.test.core)
    androidTestImplementation(libs.androidx.test.runner)
    androidTestImplementation(libs.kotlinx.coroutines.test)
}
