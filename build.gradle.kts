buildscript {
    val booster_version = "0.19.0"
    repositories {
        google()
        jcenter()
        maven(url = "https://oss.sonatype.org/content/repositories/public/")
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.4.1")
        classpath(kotlin("gradle-plugin", version = "1.3.31"))
        classpath("com.didiglobal.booster:booster-gradle-plugin:$booster_version")
        classpath("com.didiglobal.booster:booster-task-all:$booster_version")
        classpath("com.didiglobal.booster:booster-transform-all:$booster_version")
    }
}


allprojects {
    repositories {
        google()
        jcenter()
        maven("http://repository.jetbrains.com/all")
        maven("https://oss.sonatype.org/content/repositories/public/")
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
    }
}

