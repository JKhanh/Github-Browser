plugins {
    alias(libs.plugins.githubbrowser.jvm.library)
    alias(libs.plugins.githubbrowser.hilt)
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.turbine)
}