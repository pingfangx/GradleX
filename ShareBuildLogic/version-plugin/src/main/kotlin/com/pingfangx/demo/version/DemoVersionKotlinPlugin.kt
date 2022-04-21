package com.pingfangx.demo.version

import org.gradle.api.Plugin
import org.gradle.api.Project

class DemoVersionKotlinPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.afterEvaluate {
            project.dependencies.add("testImplementation", Libs.JUNIT)
        }
    }
}