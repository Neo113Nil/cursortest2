package sg.bigo.ads.cy;

import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.n;

/* loaded from: classes5.dex */
public final class a {
    @NonNull
    public static String a(@NonNull String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(35);
        if (indexOf >= 0) {
            trim = trim.substring(0, indexOf).trim();
        }
        String a = n.a(trim);
        if (a != null && a.length() != 0) {
            return a;
        }
        String a2 = n.a(String.valueOf(trim.hashCode()));
        if (a2 == null || a2.length() == 0) {
            a2 = "";
        }
        return a2;
    }
}
