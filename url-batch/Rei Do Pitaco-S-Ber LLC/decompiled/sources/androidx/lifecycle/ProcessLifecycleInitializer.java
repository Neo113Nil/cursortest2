package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.fo;
import defpackage.fp;
import defpackage.hp;
import defpackage.ip;
import defpackage.l8;
import defpackage.tw;
import defpackage.uh;
import defpackage.uw;
import defpackage.y5;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements fo {
    @Override // defpackage.fo
    public final List a() {
        return uh.f;
    }

    @Override // defpackage.fo
    public final Object b(Context context) {
        context.getClass();
        y5 i = y5.i(context);
        i.getClass();
        if (!((HashSet) i.b).contains(ProcessLifecycleInitializer.class)) {
            l8.u("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!ip.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new hp());
        }
        uw uwVar = uw.n;
        uwVar.getClass();
        uwVar.j = new Handler();
        uwVar.k.d(fp.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new tw(uwVar));
        return uwVar;
    }
}
