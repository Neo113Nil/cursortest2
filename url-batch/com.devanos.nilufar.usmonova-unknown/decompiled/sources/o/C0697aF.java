package o;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: o.aF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0697aF {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    public C0697aF(String str, PendingIntent pendingIntent) {
        IconCompat b = IconCompat.b(2131165271);
        Bundle bundle = new Bundle();
        this.d = true;
        this.b = b;
        if (b.d() == 2) {
            this.e = b.c();
        }
        this.f = C1091gF.b(str);
        this.g = pendingIntent;
        this.a = bundle;
        this.c = true;
        this.d = true;
    }
}
