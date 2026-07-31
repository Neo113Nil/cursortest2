package yads;

import android.app.KeyguardManager;
import android.content.Context;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class nw3 {
    public static final nw3 d = new nw3();
    public WeakReference a;
    public boolean b = false;
    public boolean c = false;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z, boolean z2) {
        if ((z2 || z) == (this.c || this.b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(qv3.c.a).iterator();
        while (it.hasNext()) {
            i9 i9Var = ((av3) it.next()).e;
            boolean z3 = z2 || z;
            if (i9Var.b.get() != 0) {
                kw3.a.a((WebView) i9Var.b.get(), "setDeviceLockState", z3 ? "locked" : "unlocked");
            }
        }
    }

    public final void a() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean isDeviceLocked = keyguardManager.isDeviceLocked();
        a(this.b, isDeviceLocked);
        this.c = isDeviceLocked;
    }
}
