package lab.cadl.lirui.knife.ui

import javafx.scene.text.FontWeight
import tornadofx.*

class RootView : View() {
    override val root = tabpane {
        tab("KNIFE") {
            this.isClosable = false
            this += WebShellList()
        }
    }
}

class Styles : Stylesheet() {
    init {
        label {
//            fontSize = 20.px
//            fontWeight = FontWeight.BOLD
//            backgroundColor += c("#cecece")
        }
    }
}

class KnifeApp : App(RootView::class, Styles::class) {
}