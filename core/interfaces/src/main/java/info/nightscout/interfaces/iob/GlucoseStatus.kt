package info.nightscout.interfaces.iob

data class GlucoseStatus(
    val glucose: Double,
    val noise: Double = 0.0,
    val delta: Double = 0.0,
    val shortAvgDelta: Double = 0.0,
    val longAvgDelta: Double = 0.0,
    val date: Long = 0L,
    // mod 7: append 2 variables for 5% range
    val dura_ISF_minutes: Double = 0.0,
    val dura_ISF_average: Double = 0.0,
    // mod 8: append 3 variables for deltas based on regression analysis
    val slope05: Double = 0.0, // wait for longer history
    val slope15: Double = 0.0, // wait for longer history
    val slope40: Double = 0.0, // wait for longer history
    // mod 14f: append results from best fitting parabola
    val dura_p: Double = 0.0,
    val delta_pl: Double = 0.0,
    val delta_pn: Double = 0.0,
    val r_squ: Double = 0.0,
    val bg_acceleration: Double = 0.0,
    val a_0: Double = 0.0,
    val a_1: Double = 0.0,
    val a_2: Double = 0.0,
    val pp_debug: String = "; debug:"
)