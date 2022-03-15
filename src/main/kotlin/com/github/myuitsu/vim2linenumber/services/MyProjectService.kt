package com.github.myuitsu.vim2linenumber.services

import com.intellij.openapi.project.Project
import com.github.myuitsu.vim2linenumber.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
