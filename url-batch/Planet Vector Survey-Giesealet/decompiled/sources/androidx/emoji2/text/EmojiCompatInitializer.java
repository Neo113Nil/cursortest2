package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.ay;
import defpackage.g20;
import defpackage.gp;
import defpackage.hp;
import defpackage.o20;
import defpackage.ot;
import defpackage.p01;
import defpackage.t7;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements ay {
    @Override // defpackage.ay
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.ay
    public final Object b(Context context) {
        ot otVar = new ot(new p01(context));
        otVar.b = 1;
        if (gp.k == null) {
            synchronized (gp.j) {
                try {
                    if (gp.k == null) {
                        gp.k = new gp(otVar);
                    }
                } finally {
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object obj;
        t7 q = t7.q(context);
        q.getClass();
        synchronized (t7.i) {
            try {
                obj = ((HashMap) q.e).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = q.n(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g20 lifecycle = ((o20) obj).getLifecycle();
        lifecycle.a(new hp(this, lifecycle));
    }
}
