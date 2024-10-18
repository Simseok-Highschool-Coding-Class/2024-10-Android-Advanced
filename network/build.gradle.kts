plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "${libs.versions.id.get()}.data"
}

dependencies {
    // retrofit
    implementation(libs.ok.http.base)
    implementation(libs.retrofit.base)
    implementation(libs.retrofit.gson)
    implementation(libs.google.gson)

    // serialization
    implementation(libs.serialization)
    implementation(libs.serialization.converter)

    // test
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)

    // module dependency
    implementation(project(":domain"))

    // global dependency
    implementation(project(":util"))
}