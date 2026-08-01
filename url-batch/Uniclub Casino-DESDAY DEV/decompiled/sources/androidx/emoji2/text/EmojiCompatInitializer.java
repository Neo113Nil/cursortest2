package androidx.emoji2.text;

import C.g;
import T.j;
import T.k;
import T.s;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import i0.C0147a;
import i0.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // i0.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // i0.b
    public final Object b(Context context) {
        Object obj;
        s sVar = new s(new g(context));
        sVar.f719a = 1;
        if (j.f723k == null) {
            synchronized (j.f722j) {
                try {
                    if (j.f723k == null) {
                        j.f723k = new j(sVar);
                    }
                } finally {
                }
            }
        }
        C0147a c2 = C0147a.c(context);
        c2.getClass();
        synchronized (C0147a.f2384e) {
            try {
                obj = c2.f2385a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        t e2 = ((r) obj).e();
        e2.a(new k(this, e2));
        return Boolean.TRUE;
    }
}
