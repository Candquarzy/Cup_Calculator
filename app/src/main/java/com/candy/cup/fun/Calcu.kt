import androidx.compose.runtime.MutableState
import com.candy.cup.data.Data
import java.nio.file.Files.size

fun Calcu(data: Data): Data
{
	val count: Int = when(data.under){
		in 58.0..62.99 -> 60
		in 63.0..67.99 -> 65
		in 68.0..72.99 -> 70
		in 73.0..77.99 -> 75
		in 78.0..82.99 -> 80
		in 83.0..87.99 -> 85
		in 88.0..92.99 -> 90
		in 93.0..97.99 -> 95
		else -> -1
	}
	val sum = ((data.bust + data.bust_45) / 2.0f) - data.under

	val size = when(sum){
		in 27.5..29.99 -> "H"
		in 25.0..27.49 -> "G"
		in 22.5..24.99 -> "F"
		in 20.0..22.49 -> "E"
		in 17.5..19.99 -> "D"
		in 15.0..17.49 -> "C"
		in 12.5..14.99 -> "B"
		in 10.0..12.49 -> "A"
		in 7.5..9.9 -> "AA"
		else -> "?"
	}

	return data.copy(sum = sum, size = count.toString() + size)
}