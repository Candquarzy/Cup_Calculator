package com.candy.cup.page

import Calcu
import android.R.attr.label
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.material3.Card
import androidx.compose.material3.TextField
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.D
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import com.candy.cup.ui.theme.Cup_CalculatorTheme
import com.candy.cup.data.Data

@Composable
fun Card_Calcu(innerpadding: PaddingValues)
{
	val text = remember { mutableStateListOf("", "", "", "", "") }
	val Data = remember { mutableStateOf(Data()) }
	var res_str by remember { mutableStateOf("请先点击上面的计算哦!") }
	var font_size by remember { mutableStateOf(16.sp) }
	var font_color by remember { mutableStateOf(Color.Unspecified) }

	Column(
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Center,

		modifier = Modifier.padding(innerpadding)
			.fillMaxSize()
	)
	{
		Text(
			text = "罩杯计算器",
			fontSize = 64.sp,
			fontWeight = FontWeight.Bold,
		)
		ElevatedCard(
			elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
			modifier = Modifier.padding(16.dp)
		)
		{
			Column(
				modifier = Modifier.padding(16.dp)
			)
			{
				Row(

				)
				{
					Text(
						text = "请直立，放松后用软尺贴合乳房下缘，水平绕身体一圈:",
						modifier = Modifier.padding(16.dp)
							.fillMaxWidth(0.7f)
					)
					OutlinedTextField(
						value =  text[0],
						label = {
							Text(
								"cm"
							)
						},
						keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
						onValueChange = {
								newText->
							text[0] = newText
							Data.value.under = newText.toFloatOrNull() ?: 0f
						},
						maxLines = 1,
						modifier = Modifier.padding(horizontal = 16.dp)
					)
				}
				Row(

				)
				{
					Text(
						text = "请呼气，用软尺贴合乳房下缘，水平绕身体一圈:",
						modifier = Modifier.padding(16.dp)
							.fillMaxWidth(0.7f)
					)
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
							Data.value.under_air = newText.toFloatOrNull() ?: 0f
						},
						maxLines = 1,
						modifier = Modifier.padding(horizontal = 16.dp)
					)
				}
				Row(

				)
				{
					Text(
						text = "请直立，放松后用软尺轻轻经过乳头，水平绕身体一圈:",
						modifier = Modifier.padding(16.dp)
							.fillMaxWidth(0.7f)
					)
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
							Data.value.bust = newText.toFloatOrNull() ?: 0f
						},
						maxLines = 1,
						modifier = Modifier.padding(horizontal = 16.dp)
					)
				}
				Row(

				)
				{
					Text(
						text = "请俯身45°，放松后用软尺轻轻经过乳头，水平绕身体一圈:",
						modifier = Modifier.padding(16.dp)
							.fillMaxWidth(0.7f)
					)
					OutlinedTextField(
						value =  text[3],
						label = {
							Text(
								"cm"
							)
						},
						keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
						onValueChange = {
								newText->
							text[3] = newText
							Data.value.bust_45 = newText.toFloatOrNull() ?: 0f
						},
						maxLines = 1,
						modifier = Modifier.padding(horizontal = 16.dp)
					)
				}
				Row(

				)
				{
					Text(
						text = "请俯身90°，放松后用软尺轻轻经过乳头，水平绕身体一圈:",
						modifier = Modifier.padding(16.dp)
							.fillMaxWidth(0.7f)
					)
					OutlinedTextField(
						value =  text[4],
						label = {
							Text(
								"cm"
							)
						},
						keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
						onValueChange = {
								newText->
							text[4] = newText
							Data.value.bust_90 = newText.toFloatOrNull() ?: 0f
						},
						maxLines = 1,
						modifier = Modifier.padding(horizontal = 16.dp)
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
						res_str = Calcu(Data.value)
						font_size = 36.sp
						font_color = Color(0xFFFD81AC)
					}
				)
				{
					Text(
						text = "输入完毕 开始计算喵!"
					)
				}
				Text(
					text = res_str,
					fontSize = font_size,
					color = font_color,
					fontWeight = FontWeight.Bold,

					modifier = Modifier.padding(16.dp)
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