import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("com.didiglobal.booster")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "io.github.boostersamples"
        minSdkVersion(18)
        targetSdkVersion(26)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk7", KotlinCompilerVersion.VERSION))
    implementation("com.android.support:appcompat-v7:28.0.0")
}

