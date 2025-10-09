package com.candy.cup.data
//
//import android.R.attr.data
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.text.KeyboardOptions
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Text
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.text.input.KeyboardType
//import androidx.compose.ui.unit.dp
//import com.candy.cup.R
//
//@Composabe
//fun Row_Compose(
//	text: Int,
//	i: Int
//)
//{
//	Row(
//
//	)
//	{
//		Text(
//			text = stringResource(text),
//			modifier = Modifier.padding(16.dp)
//				.fillMaxWidth(0.7f)
//		)
//		OutlinedTextField(
//			value =  text[i],
//			label = {
//				Text(
//					"cm"
//				)
//			},
//			keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
//			onValueChange = {
//					newText->
//				text[0] = newText
//				data.value.under = newText.toFloatOrNull() ?: 0f
//			},
//			maxLines = 1,
//			modifier = Modifier.padding(horizontal = 16.dp)
//		)
//	}
//}