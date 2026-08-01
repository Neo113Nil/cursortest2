package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import i0.C0147a;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements i0.b {
    @Override // i0.b
    public final List a() {
        return Q0.q.f668a;
    }

    @Override // i0.b
    public final Object b(Context context) {
        X0.d.e(context, "context");
        C0147a c2 = C0147a.c(context);
        X0.d.d(c2, "getInstance(context)");
        if (!c2.f2386b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0071o.f1367a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            X0.d.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0070n());
        }
        A a2 = A.i;
        a2.getClass();
        a2.f1334e = new Handler();
        a2.f1335f.d(EnumC0068l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        X0.d.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new z(a2));
        return a2;
    }
}
