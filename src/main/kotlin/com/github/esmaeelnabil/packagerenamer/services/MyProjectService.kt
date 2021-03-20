package com.github.esmaeelnabil.packagerenamer.services

import com.github.esmaeelnabil.packagerenamer.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
