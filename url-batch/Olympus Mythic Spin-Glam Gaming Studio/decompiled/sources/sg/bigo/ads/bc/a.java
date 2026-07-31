package sg.bigo.ads.bc;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.p;

/* loaded from: classes5.dex */
public class a {
    private static final String a = "a";

    public static long a(String str, long j) {
        if (TextUtils.isEmpty(str) || j == 0) {
            return 0L;
        }
        try {
            long longValue = Long.valueOf(str).longValue();
            int hashCode = String.valueOf(j).hashCode();
            return ((j ^ longValue) ^ Math.abs(hashCode)) >> 20;
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Nullable
    public static String a(@Nullable String str, @NonNull String str2) {
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            str3 = a;
            str4 = "data error with empty.";
        } else {
            if (!TextUtils.isEmpty(str2)) {
                return p.a(str, str2);
            }
            str3 = a;
            str4 = "cip error with empty.";
        }
        sg.bigo.ads.bn.a.a(0, str3, str4);
        return null;
    }

    @Nullable
    public static String a(@NonNull String str, @NonNull String str2, ValueCallback<Exception> valueCallback) {
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            str3 = a;
            str4 = "cip error with empty.";
        } else if (TextUtils.isEmpty(str2)) {
            str3 = a;
            str4 = "string error with empty.";
        } else {
            String a2 = p.a(str, str2, valueCallback);
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
            str3 = a;
            str4 = "cip error with empty content.";
        }
        sg.bigo.ads.bn.a.a(0, str3, str4);
        return null;
    }

    @Nullable
    public static byte[] b(@NonNull String str, @NonNull String str2) {
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            str3 = a;
            str4 = "cip error with empty.";
        } else if (TextUtils.isEmpty(str2)) {
            str3 = a;
            str4 = "string error with empty.";
        } else {
            byte[] b = p.b(str, str2, null);
            if (b != null) {
                return b;
            }
            str3 = a;
            str4 = "cip error with empty content.";
        }
        sg.bigo.ads.bn.a.a(0, str3, str4);
        return null;
    }
}
