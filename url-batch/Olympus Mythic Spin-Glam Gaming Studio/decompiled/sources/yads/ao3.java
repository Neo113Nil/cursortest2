package yads;

import android.os.Build;
import android.webkit.WebView;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class ao3 {
    public final jj2 a = new jj2();

    public final void a() {
        String a = this.a.a();
        String substringAfter = a != null ? StringsKt.substringAfter(a, ":", "") : null;
        if (substringAfter == null || substringAfter.length() <= 0) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                WebView.setDataDirectorySuffix(substringAfter);
            }
        } catch (Throwable unused) {
        }
    }
}
