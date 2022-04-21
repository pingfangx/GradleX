package com.pingfangx.demo.version


import org.gradle.api.Plugin
import org.gradle.api.Project

class DemoVersionGroovyPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.afterEvaluate {
            project.dependencies {
                testImplementation Libs.JUNIT
            }
        }
    }
}