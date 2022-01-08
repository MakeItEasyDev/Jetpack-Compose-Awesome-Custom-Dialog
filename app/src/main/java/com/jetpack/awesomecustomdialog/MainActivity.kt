package com.jetpack.awesomecustomdialog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack.awesomecustomdialog.components.ErrorDialog
import com.jetpack.awesomecustomdialog.components.InfoDialog
import com.jetpack.awesomecustomdialog.components.SuccessDialog
import com.jetpack.awesomecustomdialog.ui.theme.AwesomeCustomDialogTheme
import com.jetpack.awesomecustomdialog.ui.theme.ErrorColor
import com.jetpack.awesomecustomdialog.ui.theme.InfoColor
import com.jetpack.awesomecustomdialog.ui.theme.SuccessColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AwesomeCustomDialogTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = {
                                    Text(
                                        text = "Awesome Custom Dialog",
                                        modifier = Modifier.fillMaxWidth(),
                                        textAlign = TextAlign.Center
                                    )
                                }
                            )
                        }
                    ) {
                        CustomDialog()
                    }
                }
            }
        }
    }
}

@Composable
fun CustomDialog() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val successDialog = remember { mutableStateOf(false) }
        val errorDialog = remember { mutableStateOf(false) }
        val infoDialog = remember { mutableStateOf(false) }

        Button(
            onClick = { successDialog.value = true },
            colors = ButtonDefaults.buttonColors(backgroundColor = SuccessColor),
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .clip(RoundedCornerShape(5.dp))
        ) {
            Text(
                text = "Success Dialog",
                color = Color.White,
                modifier = Modifier
                    .padding(vertical = 8.dp),
                fontSize = 16.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { errorDialog.value = true },
            colors = ButtonDefaults.buttonColors(backgroundColor = ErrorColor),
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .clip(RoundedCornerShape(5.dp))
        ) {
            Text(
                text = "Error Dialog",
                color = Color.White,
                modifier = Modifier
                    .padding(vertical = 8.dp),
                fontSize = 16.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { infoDialog.value = true },
            colors = ButtonDefaults.buttonColors(backgroundColor = InfoColor),
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .clip(RoundedCornerShape(5.dp))
        ) {
            Text(
                text = "Info Dialog",
                color = Color.White,
                modifier = Modifier
                    .padding(vertical = 8.dp),
                fontSize = 16.sp
            )
        }

        if (successDialog.value) {
            AwesomeCustomDialog(
                type = AwesomeCustomDialogType.SUCCESS,
                title = "Success",
                desc = "This is a Success Dialog",
                onDismiss = {
                    successDialog.value = false
                }
            )
        }

        if (errorDialog.value) {
            AwesomeCustomDialog(
                type = AwesomeCustomDialogType.ERROR,
                title = "Error",
                desc = "This is a Error Dialog",
                onDismiss = {
                    errorDialog.value = false
                }
            )
        }

        if (infoDialog.value) {
            AwesomeCustomDialog(
                type = AwesomeCustomDialogType.INFO,
                title = "Info",
                desc = "This is a Info Dialog",
                onDismiss = {
                    infoDialog.value = false
                }
            )
        }
    }
}

@Composable
fun AwesomeCustomDialog(
    type: AwesomeCustomDialogType,
    title: String,
    desc: String,
    onDismiss: () -> Unit
) {
    MaterialTheme {
        when (type) {
            AwesomeCustomDialogType.SUCCESS -> {
                SuccessDialog(
                    title = title,
                    desc = desc,
                    onDismiss = onDismiss
                )
            }
            AwesomeCustomDialogType.ERROR -> {
                ErrorDialog(
                    title = title,
                    desc = desc,
                    onDismiss = onDismiss
                )
            }
            AwesomeCustomDialogType.INFO -> {
                InfoDialog(
                    title = title,
                    desc = desc,
                    onDismiss = onDismiss
                )
            }
        }
    }
}

enum class AwesomeCustomDialogType {
    SUCCESS, ERROR, INFO
}






















