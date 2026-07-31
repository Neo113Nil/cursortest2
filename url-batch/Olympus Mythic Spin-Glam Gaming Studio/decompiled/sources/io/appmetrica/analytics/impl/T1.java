package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.internal.AppMetricaService;

/* loaded from: classes9.dex */
public final class T1 {
    public static Intent a(Context context) {
        C5650rj c5650rj;
        C5661s4.l().v.getClass();
        Intent data = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme(Y7.b).authority(context.getPackageName()).path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", Wf.c).build());
        C5661s4 l = C5661s4.l();
        synchronized (l) {
            try {
                if (l.p == null) {
                    C5650rj c5650rj2 = new C5650rj();
                    l.p = c5650rj2;
                    l.h.a(c5650rj2);
                }
                c5650rj = l.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        ScreenInfo a = c5650rj.a(context);
        return data.putExtra("screen_size", a != null ? Cb.a(a) : null);
    }
}
