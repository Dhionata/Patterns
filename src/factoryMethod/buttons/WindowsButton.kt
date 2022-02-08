package factoryMethod.buttons

import java.awt.Color
import java.awt.FlowLayout
import java.awt.Font
import javax.swing.*
import kotlin.system.exitProcess


/*
Created by Dhionatã on 2/8/2022
*/
class WindowsButton : Button {
    val panel = JPanel()
    val frame = JFrame()
    var button = JButton()

    override fun render() {
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.isResizable = false
        val label = JLabel("Windows 10")
        label.isOpaque = true
        label.background = Color(235, 233, 126)
        label.font = Font("FabricaAbstrata", Font.BOLD, 44)
        label.horizontalAlignment = SwingConstants.CENTER
        panel.layout = FlowLayout(FlowLayout.CENTER)
        frame.contentPane.add(panel)
        panel.add(label)
        onClick()
        panel.add(button)

        frame.setSize(320, 200)
        frame.isVisible = true
        onClick()
    }

    override fun onClick() {
        button = JButton("Exit")
        button.addActionListener {
            frame.isVisible = false
            exitProcess(0)
        }
    }
}
