import android.util.Log
import androidx.compose.runtime.MutableState
import com.candy.cup.data.Data
import java.nio.file.Files.size

fun Calcu(data: Data): Data
{
	var count: Int = 40

	for(i in 0..((data.under - 43).toInt()) step 5)
	{
		count += 5
//		Log.i("FUCK",count.toString())
	}

	val sum = ((data.bust + data.bust_45) / 2.0f) - data.under

	var size: String = ""
	var s: Char = '?'
	if(sum < 7.5)
	{
		size = "None"
	}
	else if(sum >= 7.5 && sum <= 9.999999)
	{
		size = "AA"
	}
	else
	{
		var count = sum

		while(count > 7.5)
		{
			s++
			count -= 2.5f
		}

		size = if(s > 'Z')
		{
			"Z"
		}
		else if(s == '@') //TODO BUG
		{
			"A"
		}
		else
		{
			s.toString()
		}
	}

	return data.copy(sum = sum, size = "$count $size")
}