package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import i0.C0136a;
import i0.InterfaceC0137b;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0137b {
    @Override // i0.InterfaceC0137b
    public final List a() {
        return Q0.m.f664a;
    }

    @Override // i0.InterfaceC0137b
    public final Object b(Context context) {
        X0.e.e(context, "context");
        C0136a c2 = C0136a.c(context);
        X0.e.d(c2, "getInstance(context)");
        if (!c2.f2380b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0072o.f1365a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            X0.e.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0071n());
        }
        A a2 = A.i;
        a2.getClass();
        a2.f1332e = new Handler();
        a2.f1333f.d(EnumC0069l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        X0.e.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new z(a2));
        return a2;
    }
}
