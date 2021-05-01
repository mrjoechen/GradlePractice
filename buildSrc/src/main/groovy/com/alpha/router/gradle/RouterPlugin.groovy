package com.alpha.router.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class RouterPlugin implements Plugin<Project>{

    @Override
    void apply(Project target) {
        println("RouterPlugin apply from ${target.name}")
    }
}
