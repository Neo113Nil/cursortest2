package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class Yl {
    public final Pa a = new Pa();
    public final HashMap b = new HashMap();
    public C5783wm c = null;
    public final Wl d = new Wl(this);

    public static final Yl a() {
        return Xl.a;
    }

    public final Rm a(Context context, C5351g5 c5351g5, C5628qm c5628qm) {
        Rm rm = (Rm) this.b.get(c5351g5.a);
        boolean z = true;
        if (rm == null) {
            synchronized (this.b) {
                try {
                    rm = (Rm) this.b.get(c5351g5.a);
                    if (rm == null) {
                        rm = new Rm(new Sm(context, c5351g5.a, c5628qm, this.d));
                        rm.f();
                        this.b.put(c5351g5.a, rm);
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            rm.a(c5628qm);
        }
        return rm;
    }

    public final void a(C5351g5 c5351g5, InterfaceC5394hm interfaceC5394hm) {
        synchronized (this.b) {
            try {
                this.a.a(c5351g5.a, interfaceC5394hm);
                C5783wm c5783wm = this.c;
                if (c5783wm != null) {
                    interfaceC5394hm.a(c5783wm);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
