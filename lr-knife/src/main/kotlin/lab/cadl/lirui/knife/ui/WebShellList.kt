package lab.cadl.lirui.knife.ui

import lab.cadl.lirui.knife.model.LanguageType
import lab.cadl.lirui.knife.model.WebShell
import tornadofx.*

class WebShellList : View() {
    override val root = tableview<WebShell> {
        isEditable = true
        items = listOf(
                WebShell("http://www.jszx.net/1.php", "a", "pwd", "helloworld", LanguageType.PHP),
                WebShell("http://www.jszx.net/2.php", "a", "pwd", "helloworld", LanguageType.JSP)
                ).observable()

        column("URL", WebShell::url).makeEditable()
        column("命令参数名", WebShell::cmdName).makeEditable()
        column("密码参数名", WebShell::passwordName).makeEditable()
        column("密码", WebShell::password).makeEditable()
        column("编程语言", WebShell::lang)
    }
}