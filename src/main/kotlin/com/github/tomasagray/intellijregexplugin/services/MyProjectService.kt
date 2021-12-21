package com.github.tomasagray.intellijregexplugin.services

import com.intellij.openapi.project.Project
import com.github.tomasagray.intellijregexplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
