package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import m0.C0294a;
import m0.InterfaceC0295b;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0295b {
    @Override // m0.InterfaceC0295b
    public final List a() {
        return W0.s.f1284a;
    }

    @Override // m0.InterfaceC0295b
    public final Object b(Context context) {
        i1.f.e(context, "context");
        C0294a c2 = C0294a.c(context);
        i1.f.d(c2, "getInstance(context)");
        if (!c2.f3555b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0084q.f1905a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            i1.f.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0083p());
        }
        C c3 = C.i;
        c3.getClass();
        c3.f1868e = new Handler();
        c3.f1869f.d(EnumC0079l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        i1.f.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new B(c3));
        return c3;
    }
}
