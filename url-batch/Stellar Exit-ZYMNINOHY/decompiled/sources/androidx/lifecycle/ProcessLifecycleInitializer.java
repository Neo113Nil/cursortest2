package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import o.C0089a;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements o.b {
    @Override // o.b
    public final List a() {
        return V.m.f386b;
    }

    @Override // o.b
    public final Object b(Context context) {
        e0.h.e(context, "context");
        C0089a c2 = C0089a.c(context);
        e0.h.d(c2, "getInstance(context)");
        if (!c2.f1111b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!h.f434a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            e0.h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new g());
        }
        n nVar = n.f441i;
        nVar.getClass();
        nVar.f446e = new Handler();
        nVar.f447f.a(d.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        e0.h.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new m(nVar));
        return nVar;
    }
}
