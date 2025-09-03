import android.util.Log
import com.candy.cup.data.Data

fun Calcu(Data: Data): String
{
	val count: Int = when((Data.under + Data.under_air) / 2){
		in 55.0..60.9 -> 60
		in 61.0..65.9 -> 65
		in 66.0..70.9 -> 70
		in 71.0..75.9 -> 75
		in 76.0..80.9 -> 80
		in 81.0..85.9 -> 85
		in 86.0..90.9 -> 90
		else -> 95
	}
	val results: Float = ((Data.bust + Data.bust_45 + Data.bust_90) / 3.0f) - ((Data.under + Data.under_air) / 2.0f)

	Log.d("FUCK", "count is now: $results")

	return count.toString() + " " + when(results){
		in 27.5..29.0 -> "H"
		in 25.0..27.4 -> "G"
		in 22.5..24.9 -> "F"
		in 20.0..22.4 -> "E"
		in 17.5..19.9 -> "D"
		in 15.0..17.4 -> "C"
		in 12.5..14.9 -> "B"
		in 10.0..12.4 -> "A"
		in 7.5..9.9 -> "AA"
		else -> "ERR"
	}
}