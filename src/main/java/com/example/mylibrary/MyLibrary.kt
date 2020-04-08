package com.example.mylibrary

data class Language(val name: String, val hotness: Int)

class MyLibrary {
    /**
     * @return data relating to the Kotlin {@code Lanugage}.
     */
    fun kotlinLanguage() = Language("Kotlin", 10)
}