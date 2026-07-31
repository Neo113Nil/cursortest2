package sg.bigo.ads.bi;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import sg.bigo.ads.common.utils.s;

/* loaded from: classes6.dex */
public final class c {
    private static boolean a = true;

    @NonNull
    @WorkerThread
    public static sg.bigo.ads.an.a a(@NonNull Context context) {
        sg.bigo.ads.an.a aVar;
        boolean z;
        if (!a) {
            return new sg.bigo.ads.an.a("", true);
        }
        long a2 = s.a.a(15);
        try {
            aVar = d.a(context, a2);
            z = true;
        } catch (b unused) {
            aVar = null;
            z = false;
        }
        if (aVar != null) {
            return aVar;
        }
        try {
            aVar = a.a(context, a2);
        } catch (b unused2) {
            if (!z) {
                a = false;
            }
        }
        return aVar != null ? aVar : new sg.bigo.ads.an.a("", true);
    }
}
