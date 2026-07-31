package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.t4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5687t4 {
    public final C5638r7 a;
    public Ob b;
    public Pb c;
    public C5747vc d;

    public C5687t4(File file) {
        this.a = new C5638r7(file);
    }

    public final synchronized InterfaceC5357gb a(Context context) {
        Pb pb;
        pb = this.c;
        if (pb == null) {
            pb = new Pb(c(context));
            this.c = pb;
        }
        return pb;
    }

    public final synchronized InterfaceC5357gb b(Context context) {
        return c(context);
    }

    public final InterfaceC5357gb c(Context context) {
        C5747vc c5747vc;
        Ob ob = this.b;
        if (ob == null) {
            synchronized (this) {
                c5747vc = this.d;
                if (c5747vc == null) {
                    C5638r7 c5638r7 = this.a;
                    String a = new C5613q7(c5638r7.a, c5638r7.b, true).a(context, new C5298e4());
                    C5276d7 c5276d7 = M5.c;
                    c5276d7.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("preferences", J5.a);
                    C5810xn c5810xn = c5276d7.c;
                    C5534n7 c5534n7 = c5276d7.a;
                    C5430j7 c5430j7 = c5534n7.c;
                    C5456k7 c5456k7 = c5534n7.d;
                    Pa pa = new Pa(false);
                    pa.a(112, new C5324f4());
                    An an = new An("service database", hashMap);
                    c5810xn.getClass();
                    c5747vc = new C5747vc(context, a, new C5719ua(a), new C5836yn(c5430j7, c5456k7, pa, an));
                    this.d = c5747vc;
                }
            }
            ob = new Ob("preferences", c5747vc, C5661s4.l().c.b());
            this.b = ob;
        }
        return ob;
    }
}
