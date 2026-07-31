package sg.bigo.ads.y;

import androidx.annotation.NonNull;
import io.bidmachine.protobuf.EventTypeExtended;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes15.dex */
public final class e {
    public static int a(@NonNull String str, int i) {
        if (i <= 0) {
            return 0;
        }
        return Math.abs((str + new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis() / 86400000))).hashCode()) % i;
    }

    public static String a(@NonNull String str) {
        return (a(str, 100) + 1) + "M+";
    }

    public static String b(@NonNull String str) {
        return (a(str, EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE) + 100) + "K";
    }

    public static String c(@NonNull String str) {
        return "4." + (a(str, 7) + 3);
    }
}
