package sg.bigo.ads.bt;

import androidx.annotation.Nullable;
import org.slf4j.Marker;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes15.dex */
public final class b {
    public long a;
    public long b = -1;
    private long c;

    private b() {
    }

    @Nullable
    public static b a(String str) {
        b bVar = null;
        if (r.a((CharSequence) str)) {
            return null;
        }
        int indexOf = str.indexOf(" ");
        int indexOf2 = str.indexOf("-");
        int indexOf3 = str.indexOf("/");
        if (indexOf >= 0 && indexOf3 >= 0 && indexOf < indexOf3) {
            bVar = new b();
            if (indexOf2 > indexOf && indexOf2 < indexOf3) {
                try {
                    bVar.a = Long.parseLong(str.substring(indexOf + 1, indexOf2));
                    bVar.c = Long.parseLong(str.substring(indexOf2 + 1, indexOf3));
                } catch (Exception unused) {
                }
            }
            String substring = str.substring(indexOf3 + 1);
            if (!Marker.ANY_MARKER.equals(substring)) {
                bVar.b = Long.parseLong(substring);
            }
        }
        return bVar;
    }
}
