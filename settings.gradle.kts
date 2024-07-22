pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
rootProject.name = "GithubBrowser"
include(":app")
include(":feature")
include(":feature:repository")
include(":core")
include(":core:common")
include(":core:data")
include(":core:database")
include(":core:domain")
include(":core:model")
include(":core:network")
include(":core:notification")
include(":core:ui")
include(":core:testing")
