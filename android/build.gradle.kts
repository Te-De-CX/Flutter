buildscript {
    ext.kotlin_version = '1.7.10' // Update Kotlin version if needed
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:7.2.2' // Update to the latest stable version
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
    }
}