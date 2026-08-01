package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.a;
import defpackage.ah;
import defpackage.dh;
import defpackage.fo;
import defpackage.j0;
import defpackage.ke;
import defpackage.lj;
import defpackage.lp;
import defpackage.tb;
import defpackage.y5;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements fo {
    @Override // defpackage.fo
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.fo
    public final Object b(Context context) {
        Object obj;
        lj ljVar = new lj(new j0(context));
        ljVar.a = 1;
        if (ah.k == null) {
            synchronized (ah.j) {
                try {
                    if (ah.k == null) {
                        ah.k = new ah(ljVar);
                    }
                } finally {
                }
            }
        }
        y5 i = y5.i(context);
        i.getClass();
        synchronized (y5.e) {
            try {
                obj = ((HashMap) i.a).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = i.c(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final a e = ((lp) obj).e();
        e.a(new ke(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // defpackage.ke
            public final void a() {
                (Build.VERSION.SDK_INT >= 28 ? tb.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new dh(), 500L);
                e.f(this);
            }
        });
        return Boolean.TRUE;
    }
}
