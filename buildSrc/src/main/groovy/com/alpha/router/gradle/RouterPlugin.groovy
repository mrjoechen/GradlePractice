package com.alpha.router.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class RouterPlugin implements Plugin<Project>{

    @Override
    void apply(Project project) {
        println("RouterPlugin apply from ${project.name}")

        project.getExtensions().create("router", RouterExtension)
        project.afterEvaluate {

            RouterExtension extension = project["router"]

            println("用户设置的WIKI路径为 : ${extension.wikiDir}")
        }
    }
}
