package yads;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class rv3 implements Runnable {
    public final /* synthetic */ float b;
    public final /* synthetic */ tv3 c;

    public rv3(tv3 tv3Var, float f) {
        this.c = tv3Var;
        this.b = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        lw3 lw3Var = this.c.b.e;
        float f = this.b;
        lw3Var.a = f;
        if (lw3Var.d == null) {
            lw3Var.d = qv3.c;
        }
        Iterator it = Collections.unmodifiableCollection(lw3Var.d.b).iterator();
        while (it.hasNext()) {
            i9 i9Var = ((av3) it.next()).e;
            kw3.a.a((WebView) i9Var.b.get(), "setDeviceVolume", Float.valueOf(f), i9Var.a);
        }
    }
}
