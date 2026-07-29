package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import o.AbstractC0106Dz;
import o.C0272Kj;
import o.C0298Lj;
import o.C0665Zn;
import o.C0950e6;
import o.C0985ef;
import o.InterfaceC0229Is;
import o.InterfaceC0365Nz;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0229Is {
    @Override // o.InterfaceC0229Is
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // o.InterfaceC0229Is
    public final Object b(Context context) {
        Object obj;
        C0665Zn c0665Zn = new C0665Zn(new C0985ef(context, 1));
        c0665Zn.b = 1;
        if (C0272Kj.k == null) {
            synchronized (C0272Kj.j) {
                try {
                    if (C0272Kj.k == null) {
                        C0272Kj.k = new C0272Kj(c0665Zn);
                    }
                } finally {
                }
            }
        }
        C0950e6 A = C0950e6.A(context);
        A.getClass();
        synchronized (C0950e6.m) {
            try {
                obj = ((HashMap) A.i).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = A.u(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        AbstractC0106Dz lifecycle = ((InterfaceC0365Nz) obj).getLifecycle();
        lifecycle.a(new C0298Lj(this, lifecycle));
        return Boolean.TRUE;
    }
}
