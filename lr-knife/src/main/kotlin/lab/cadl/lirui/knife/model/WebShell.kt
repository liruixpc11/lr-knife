package lab.cadl.lirui.knife.model

import tornadofx.*

enum class LanguageType {
    PHP,
    JSP,
    ASP,
    ASPX,
}

class WebShell(url: String,
               cmdName: String,
               passwordName: String,
               password: String,
               lang: LanguageType) {
    var url: String by property(url)
    fun urlProperty() = getProperty(WebShell::url)

    var cmdName: String by property(cmdName)
    fun cmdNameProperty() = getProperty(WebShell::cmdName)

    var passwordName: String by property(passwordName)
    fun passwordNameProperty() = getProperty(WebShell::passwordName)

    var password: String by property(password)
    fun passwordProperty() = getProperty(WebShell::password)

    var lang: LanguageType by property(lang)
    fun langProperty() = getProperty(WebShell::lang)
}