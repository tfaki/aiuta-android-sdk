package com.aiuta.fashionsdk.tryon.compose.ui.internal.screens.selector.components.body

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.aiuta.fashionsdk.tryon.compose.uikit.composition.LocalTheme

@Composable
internal fun ImageSelectorBlock(
    modifier: Modifier = Modifier,
    uploadPhoto: () -> Unit,
) {
    val theme = LocalTheme.current

    Box(
        modifier = modifier.background(
            color = theme.color.neutral,
            shape = theme.image.shapes.imageLShape,
        ),
    ) {
        ImageSelectorPhoto(
            modifier = Modifier
                .fillMaxSize()
        )

        ImageSelectorBottom(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp)
                .padding(bottom = 24.dp)
                .align(Alignment.BottomCenter),
            uploadPhoto = uploadPhoto,
        )
    }
}
