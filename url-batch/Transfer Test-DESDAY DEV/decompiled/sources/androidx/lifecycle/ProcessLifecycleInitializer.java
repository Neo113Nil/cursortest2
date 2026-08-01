package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import m0.C0252a;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements m0.b {
    @Override // m0.b
    public final List a() {
        return V0.m.f875a;
    }

    @Override // m0.b
    public final Object b(Context context) {
        g1.f.e(context, "context");
        C0252a c2 = C0252a.c(context);
        g1.f.d(c2, "getInstance(context)");
        if (!c2.f3126b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0076q.f1526a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            g1.f.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0075p());
        }
        C c3 = C.i;
        c3.getClass();
        c3.f1489e = new Handler();
        c3.f1490f.d(EnumC0071l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        g1.f.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new B(c3));
        return c3;
    }
}
