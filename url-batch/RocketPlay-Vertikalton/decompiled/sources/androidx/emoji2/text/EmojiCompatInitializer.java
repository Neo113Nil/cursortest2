package androidx.emoji2.text;

import A1.d;
import U.j;
import U.k;
import U.t;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.v;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import m0.C0294a;
import m0.InterfaceC0295b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0295b {
    @Override // m0.InterfaceC0295b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // m0.InterfaceC0295b
    public final Object b(Context context) {
        Object obj;
        t tVar = new t(new d(context));
        tVar.f1174a = 1;
        if (j.f1178k == null) {
            synchronized (j.f1177j) {
                try {
                    if (j.f1178k == null) {
                        j.f1178k = new j(tVar);
                    }
                } finally {
                }
            }
        }
        C0294a c2 = C0294a.c(context);
        c2.getClass();
        synchronized (C0294a.f3553e) {
            try {
                obj = c2.f3554a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        v e2 = ((androidx.lifecycle.t) obj).e();
        e2.a(new k(this, e2));
        return Boolean.TRUE;
    }
}
