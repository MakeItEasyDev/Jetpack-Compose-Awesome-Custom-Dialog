package com.jetpack.awesomecustomdialog.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.jetpack.awesomecustomdialog.ui.theme.ErrorColor
import com.jetpack.awesomecustomdialog.ui.theme.Shapes
import com.jetpack.awesomecustomdialog.ui.theme.SuccessColor

@Composable
fun SuccessDialog(
    title: String,
    desc: String,
    onDismiss: () -> Unit
) {
    Dialog(
        onDismissRequest = onDismiss
    ) {
        Box(
            modifier = Modifier
                .width(300.dp)
                .height(400.dp)
        ) {
            Column(
                modifier = Modifier
                    .size(300.dp)
            ) {
                Spacer(modifier = Modifier.height(36.dp))
                Box(
                    modifier = Modifier
                        .width(300.dp)
                        .height(164.dp)
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(10.dp)
                        )
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(24.dp))
                        Text(
                            text = title.uppercase(),
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = desc,
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal
                            )
                        )
                        Spacer(modifier = Modifier.height(24.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Button(
                                onClick = onDismiss,
                                shape = Shapes.large,
                                colors = ButtonDefaults.buttonColors(backgroundColor = ErrorColor),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f)
                                    .clip(RoundedCornerShape(5.dp))
                            ) {
                                Text(
                                    text = "Cancel",
                                    color = Color.White
                                )
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            Button(
                                onClick = onDismiss,
                                shape = Shapes.large,
                                colors = ButtonDefaults.buttonColors(backgroundColor = SuccessColor),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f)
                                    .clip(RoundedCornerShape(5.dp))
                            ) {
                                Text(
                                    text = "Ok",
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
            }
            SuccessHeader(
                modifier = Modifier
                    .size(72.dp)
                    .align(Alignment.TopCenter)
                    .border(
                        border = BorderStroke(width = 5.dp, color = Color.White),
                        shape = CircleShape
                    )
            )
        }
    }
}

@Composable
fun ErrorDialog(
    title: String,
    desc: String,
    onDismiss: () -> Unit
) {
    Dialog(
        onDismissRequest = onDismiss
    ) {
        Box(
            modifier = Modifier
                .width(300.dp)
                .height(400.dp)
        ) {
            Column(
                modifier = Modifier
                    .size(300.dp)
            ) {
                Spacer(modifier = Modifier.height(36.dp))
                Box(
                    modifier = Modifier
                        .width(300.dp)
                        .height(164.dp)
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(10.dp)
                        )
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(24.dp))
                        Text(
                            text = title.uppercase(),
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = desc,
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal
                            )
                        )
                        Spacer(modifier = Modifier.height(24.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Button(
                                onClick = onDismiss,
                                shape = Shapes.large,
                                colors = ButtonDefaults.buttonColors(backgroundColor = ErrorColor),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f)
                                    .clip(RoundedCornerShape(5.dp))
                            ) {
                                Text(
                                    text = "Cancel",
                                    color = Color.White
                                )
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            Button(
                                onClick = onDismiss,
                                shape = Shapes.large,
                                colors = ButtonDefaults.buttonColors(backgroundColor = SuccessColor),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f)
                                    .clip(RoundedCornerShape(5.dp))
                            ) {
                                Text(
                                    text = "Ok",
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
            }
            ErrorHeader(
                modifier = Modifier
                    .size(72.dp)
                    .align(Alignment.TopCenter)
                    .border(
                        border = BorderStroke(width = 5.dp, color = Color.White),
                        shape = CircleShape
                    )
            )
        }
    }
}

@Composable
fun InfoDialog(
    title: String,
    desc: String,
    onDismiss: () -> Unit
) {
    Dialog(
        onDismissRequest = onDismiss
    ) {
        Box(
            modifier = Modifier
                .width(300.dp)
                .height(400.dp)
        ) {
            Column(
                modifier = Modifier
                    .size(300.dp)
            ) {
                Spacer(modifier = Modifier.height(36.dp))
                Box(
                    modifier = Modifier
                        .width(300.dp)
                        .height(164.dp)
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(10.dp)
                        )
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(24.dp))
                        Text(
                            text = title.uppercase(),
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = desc,
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal
                            )
                        )
                        Spacer(modifier = Modifier.height(24.dp))
                        Button(
                            onClick = onDismiss,
                            shape = Shapes.large,
                            colors = ButtonDefaults.buttonColors(backgroundColor = SuccessColor),
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(5.dp))
                        ) {
                            Text(
                                text = "Ok",
                                color = Color.White
                            )
                        }
                    }
                }
            }
            InfoHeader(
                modifier = Modifier
                    .size(72.dp)
                    .align(Alignment.TopCenter)
                    .border(
                        border = BorderStroke(width = 5.dp, color = Color.White),
                        shape = CircleShape
                    )
            )
        }
    }
}























