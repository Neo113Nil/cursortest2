package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.ay;
import defpackage.e20;
import defpackage.g8;
import defpackage.h20;
import defpackage.i20;
import defpackage.t7;
import defpackage.th0;
import defpackage.uh0;
import defpackage.wp;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements ay {
    @Override // defpackage.ay
    public final List a() {
        return wp.d;
    }

    @Override // defpackage.ay
    public final Object b(Context context) {
        context.getClass();
        t7 q = t7.q(context);
        q.getClass();
        if (!((HashSet) q.f).contains(ProcessLifecycleInitializer.class)) {
            g8.s("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!i20.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new h20());
        }
        uh0 uh0Var = uh0.l;
        uh0Var.getClass();
        uh0Var.h = new Handler();
        uh0Var.i.e(e20.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new th0(uh0Var));
        return uh0Var;
    }
}
