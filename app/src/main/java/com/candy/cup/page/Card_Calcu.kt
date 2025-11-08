package com.candy.cup.page

import Calcu
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.candy.cup.ui.theme.Cup_CalculatorTheme
import com.candy.cup.data.Data
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Info
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.window.Dialog
import com.candy.cup.R

@Composable
fun Card_Calcu(innerpadding: PaddingValues)
{
	val text = remember { mutableStateListOf("", "", "") }
	val data = remember { mutableStateOf(Data()) }
	var res_str by remember { mutableStateOf("(o゜▽゜)o☆)") }
	var font_color by remember { mutableStateOf(Color.Unspecified) }
	var dialog_show = remember { mutableStateListOf(false, false, false) }
	val context = LocalContext.current

	Column(
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.SpaceEvenly,

		modifier = Modifier.padding(innerpadding)
			.fillMaxSize()
	)
	{
		Text(
			text = stringResource(R.string.app_name),
			fontSize = 36.sp,
			fontWeight = FontWeight.Bold,
		)
		ElevatedCard(
			elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
			modifier = Modifier.padding(16.dp)
		)
		{
			Column(
				modifier = Modifier.padding(8.dp)
			)
			{
				Row(
					verticalAlignment = Alignment.CenterVertically,
					modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
						.fillMaxWidth()
				)
				{
					Text(
						text = stringResource(R.string.under_title),
						fontSize = 18.sp,
						fontWeight = FontWeight.SemiBold,
						modifier = Modifier
							.weight(0.5f)
					)
					IconButton(
						onClick = {
							dialog_show[0] = true
						},
						modifier = Modifier.weight(0.15f)
					)
					{
						Icon(
							imageVector = Icons.Rounded.Info,
							contentDescription = "more"
						)
						if(dialog_show[0])
						{
							Dialog(
								onDismissRequest = {
									dialog_show[0] = false
								}
							)
							{
								Card(
									modifier = Modifier.padding(16.dp)
								)
								{
									Row(
										modifier = Modifier.padding(16.dp)
									)
									{
										Text(
											text = stringResource(R.string.under_tips),
											textAlign = TextAlign.Center
										)
									}

								}
							}
						}
					}
					OutlinedTextField(
						value =  text[0],
						label = {
							Text(
								text = "cm"
							)
						},
						keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
						onValueChange = {
								newText->
							text[0] = newText
							data.value.under = newText.toFloatOrNull() ?: 0f
						},
						maxLines = 1,
						modifier = Modifier.fillMaxWidth()
							.weight(0.35f)
					)
				}
				Row(
					verticalAlignment = Alignment.CenterVertically,
					modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
						.fillMaxWidth()
				)
				{
					Text(
						text = stringResource(R.string.bust_title),
						fontSize = 18.sp,
						fontWeight = FontWeight.SemiBold,
						modifier = Modifier
							.weight(0.5f)
					)
					IconButton(
						onClick = {
							dialog_show[1] = true
						},
						modifier = Modifier.weight(0.15f)
					)
					{
						Icon(
							imageVector = Icons.Rounded.Info,
							contentDescription = "more"
						)
						if(dialog_show[1])
						{
							Dialog(
								onDismissRequest = {
									dialog_show[1] = false
								}
							)
							{
								Card(
									modifier = Modifier.padding(16.dp)
								)
								{
									Row(
										modifier = Modifier.padding(16.dp)
									)
									{
										Text(
											text = stringResource(R.string.bust_tips),
											textAlign = TextAlign.Center
										)
									}
								}
							}
						}
					}
					OutlinedTextField(
						value =  text[1],
						label = {
							Text(
								"cm"
							)
						},
						keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
						onValueChange = {
								newText->
							text[1] = newText
							data.value.bust = newText.toFloatOrNull() ?: 0f
						},
						maxLines = 1,
						modifier = Modifier.fillMaxWidth()
							.weight(0.35f)
					)
				}
				Row(
					verticalAlignment = Alignment.CenterVertically,
					modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
						.fillMaxWidth()
				)
				{
					Text(
						text = stringResource(R.string.bust_45_title),
						fontSize = 18.sp,
						fontWeight = FontWeight.SemiBold,
						modifier = Modifier
							.weight(0.5f)
					)
					IconButton(
						onClick = {
							dialog_show[2] = true
						},
						modifier = Modifier.weight(0.15f)
					)
					{
						Icon(
							imageVector = Icons.Rounded.Info,
							contentDescription = "more"
						)
						if(dialog_show[2])
						{
							Dialog(
								onDismissRequest = {
									dialog_show[2] = false
								}
							)
							{
								Card(
									modifier = Modifier.padding(16.dp)
								)
								{
									Row(
										modifier = Modifier.padding(16.dp)
									)
									{
										Text(
											text = stringResource(R.string.bust_45_tips),
											textAlign = TextAlign.Center
										)
									}
								}
							}
						}
					}
					OutlinedTextField(
						value =  text[2],
						label = {
							Text(
								"cm"
							)
						},
						keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
						onValueChange = {
								newText->
							text[2] = newText
							data.value.bust_45 = newText.toFloatOrNull() ?: 0f
						},
						maxLines = 1,
						modifier = Modifier.fillMaxWidth()
							.weight(0.35f)
					)
				}
			}

			Column(
				horizontalAlignment = Alignment.CenterHorizontally,
				modifier = Modifier.fillMaxWidth()
			)
			{
				ElevatedButton(
					onClick = {
						val newData = Calcu(data.value)
						data.value = newData
						res_str = newData.size
						font_color = Color(0xFFFD81AC)
					},
					modifier = Modifier.padding(vertical = 8.dp)
				)
				{
					Text(
						text = stringResource(R.string.calcu)
					)
				}
				Row(

				)
				{
					Text(
						text = stringResource(R.string.bust_differ) + " " + data.value.sum,
						color = Color(0xFFFD81AC),
						fontWeight = FontWeight.SemiBold,
					)
				}
				Row(
					modifier = Modifier.padding(vertical = 16.dp)
				)
				{
					Text(
						text = res_str,
						fontSize = 28.sp,
						color = font_color,
						fontWeight = FontWeight.Bold,
					)
				}
			}
		}

		Card(

		)
		{
			Column(
				modifier = Modifier.padding(16.dp)
			)
			{
				Text(
					text = stringResource(R.string.tips1),
					fontSize = 12.sp
				)
				Text(
					text = stringResource(R.string.tips2),
					fontSize = 12.sp
				)
				Text(
					text = stringResource(R.string.tips3),
					fontSize = 12.sp
				)
			}
		}

		Row(

		)
		{
			ElevatedButton(
				onClick = {
					val github_link = Intent(Intent.ACTION_VIEW).apply {
						this.data = Uri.parse("https://github.com/Candquarzy/Cup_Calculator")
					}
					context.startActivity(github_link)
				}
			)
			{
				Image(
					painter = painterResource(id =
					if (isSystemInDarkTheme())
					{
						R.drawable.github_white
					}
					else
					{
						R.drawable.github_black
					}),
					contentDescription = "github",
					contentScale = ContentScale.FillWidth,
					modifier = Modifier.size(24.dp)
						.padding(horizontal = 4.dp)
				)
				Text(
					text = stringResource(R.string.repository),
					fontSize = 16.sp,
				)
			}
		}
	}
}

@Preview(showBackground = true)
@Composable
fun Card_Calcu_Preview()
{
	Cup_CalculatorTheme {
		Card_Calcu(PaddingValues(16.dp))
	}
}