package androidx.emoji2.text;

import A0.h;
import U.j;
import U.k;
import U.t;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.v;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import m0.C0252a;
import m0.b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // m0.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // m0.b
    public final Object b(Context context) {
        Object obj;
        t tVar = new t(new h(context));
        tVar.f816a = 1;
        if (j.f820k == null) {
            synchronized (j.f819j) {
                try {
                    if (j.f820k == null) {
                        j.f820k = new j(tVar);
                    }
                } finally {
                }
            }
        }
        C0252a c2 = C0252a.c(context);
        c2.getClass();
        synchronized (C0252a.f3124e) {
            try {
                obj = c2.f3125a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        v d = ((androidx.lifecycle.t) obj).d();
        d.a(new k(this, d));
        return Boolean.TRUE;
    }
}
