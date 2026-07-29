package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC0262Jz;
import o.C0236Iz;
import o.C0950e6;
import o.C1318jk;
import o.C1753qJ;
import o.C1884sJ;
import o.EnumC0054Bz;
import o.InterfaceC0229Is;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lo/Is;", "Lo/Nz;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0229Is {
    @Override // o.InterfaceC0229Is
    public final List a() {
        return C1318jk.h;
    }

    @Override // o.InterfaceC0229Is
    public final Object b(Context context) {
        AbstractC0048Bt.n(context, "context");
        C0950e6 A = C0950e6.A(context);
        AbstractC0048Bt.m(A, "getInstance(context)");
        if (!((HashSet) A.j).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0262Jz.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC0048Bt.l(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0236Iz());
        }
        C1884sJ c1884sJ = C1884sJ.p;
        c1884sJ.getClass();
        c1884sJ.l = new Handler();
        c1884sJ.m.e(EnumC0054Bz.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC0048Bt.l(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C1753qJ(c1884sJ));
        return c1884sJ;
    }
}
