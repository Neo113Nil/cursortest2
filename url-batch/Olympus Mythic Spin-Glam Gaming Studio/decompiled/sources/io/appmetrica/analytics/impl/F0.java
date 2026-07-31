package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes6.dex */
public abstract class F0 {
    public static T6 a(Handler handler, E0 e0) {
        return new T6(handler, e0);
    }

    public static Wf a(Context context, T6 t6) {
        return new Wf(context, t6);
    }

    public static Ji a(Wf wf, Context context, ICommonExecutor iCommonExecutor) {
        C5631r0 c5631r0 = new C5631r0(context, iCommonExecutor);
        return new Ji(c5631r0, new C5473ko(new Hb()), new V4(wf), new C5599pk(context, c5631r0));
    }

    public static C5342fm a(Context context, Ji ji, Handler handler) {
        return new C5342fm(ji, C5661s4.l().d(context), handler);
    }

    public static C5699tg a(Ji ji, C5594pf c5594pf, Handler handler) {
        return new C5699tg(ji, c5594pf, handler, c5594pf.s());
    }

    public static C5779wi a(Context context, Wf wf, Ji ji, Handler handler, C5342fm c5342fm) {
        return new C5779wi(context, wf, ji, handler, c5342fm);
    }

    public static C5774wd a(Context context) {
        return new C5774wd(C5661s4.l().c.a(), C5661s4.l().b(context), "client_modules", new SystemTimeProvider());
    }
}
