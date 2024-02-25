package utils

import androidx.compose.ui.graphics.toComposeImageBitmap
import androidx.compose.ui.input.pointer.PointerIcon
import org.jetbrains.skia.Image
import org.jetbrains.skiko.Cursor
import java.awt.Desktop
import java.net.URI
import java.net.URL

fun handCursor() = PointerIcon(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR))

fun openURL(uri: URI) {
    val desktop = Desktop.getDesktop()
    desktop.browse(uri)
}

fun loadPicture(url: String) =
    Image.makeFromEncoded(URL(url).readBytes())
        .toComposeImageBitmap()
