plugins {
    alias(libs.plugins.githubbrowser.android.library)
    alias(libs.plugins.githubbrowser.android.library.jacoco)
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.google.samples.apps.githubbrowser.core.domain"
}

dependencies {
    api(projects.core.data)
    api(projects.core.model)

    implementation(libs.javax.inject)

    testImplementation(projects.core.testing)
}