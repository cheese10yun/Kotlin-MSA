rootProject.name = "kotlin-msa"

include(
    "member-service"
)

include(
    "order-service",
    "order-service:order-api",
    "order-service:order-domain"

)

pluginManagement {
    repositories {
        gradlePluginPortal()
    }

    val pluginVersions = mapOf(
        "org.jetbrains.kotlin" to "1.3.50",
        "org.jetbrains.kotlin.plugin" to "1.3.50",
        "org.springframework" to "2.2.0.RELEASE",
        "io.spring" to "1.0.8.RELEASE"
    )

    resolutionStrategy {
        eachPlugin {
            if (pluginVersions.containsKey(requested.id.namespace)) {
                useVersion(pluginVersions[requested.id.namespace])
            }
        }
    }
}