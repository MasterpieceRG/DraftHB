pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        //for image slide
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "PresentationProject"
include(":app")
 