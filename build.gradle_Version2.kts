plugins {
    // solo para que el proyecto tenga un build.gradle.kts raíz
}

tasks.register("clean", Delete::class) {
    delete(rootProject.layout.buildDirectory)
}