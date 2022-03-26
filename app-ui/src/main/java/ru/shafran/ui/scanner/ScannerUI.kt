package ru.shafran.ui.scanner

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Create
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.shafran.common.scanner.CustomerScanner
import ru.shafran.ui.camera.CameraUI
import ru.shafran.ui.details.CustomerDetailsHostUI

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomerScannerUI(component: CustomerScanner, modifier: Modifier) {
    CustomerDetailsHostUI(
        component = component.customerDetails,
        modifier = modifier,
    ) {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            floatingActionButton = {
                FloatingActionButton(onClick = component::onGenerateCustomer) {
                    Icon(Icons.Outlined.Create, contentDescription = null)
                }
            }
        ) {
            CameraUI(
                component = component.camera,
                modifier = Modifier.fillMaxSize(),
            )
        }
    }
}
