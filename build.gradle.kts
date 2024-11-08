plugins {
    id("java")
    id("org.jetbrains.intellij.platform") version "2.1.0"
}

group = "ovh.fedox"
version = "1.2-SNAPSHOT"

repositories {
    mavenCentral()

    intellijPlatform {
        defaultRepositories()
    }
}

sourceSets {
    main {
        java {
            srcDirs("src/main/java", "src/main/gen")
        }
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    intellijPlatform {
        intellijIdeaCommunity("2023.3")

        instrumentationTools()
    }
}

tasks {
    patchPluginXml {
        sinceBuild.set("221.*")
        untilBuild.set("244.*")
    }
}

tasks.test {
    useJUnitPlatform()
}