plugins {
    alias(libs.plugins.githubbrowser.android.library)
    alias(libs.plugins.githubbrowser.hilt)
}

android {
    namespace = "com.google.samples.apps.githubbrowser.core.notification"
}

dependencies {
    api(projects.core.model)

    implementation(projects.core.common)

    compileOnly(platform(libs.androidx.compose.bom))
}