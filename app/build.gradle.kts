plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.buie.garbagevehicletracker"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.buie.garbagevehicletracker"
        minSdk = 22
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation("io.socket:socket.io-client:2.0.0")
    implementation("com.google.android.gms:play-services-location:21.0.1")
}
