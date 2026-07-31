package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Timer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class Nk {
    public final AbstractC4168m1 a;
    public final HashMap b;

    public Nk(AbstractC4168m1 timeOutInformer) {
        Intrinsics.checkNotNullParameter(timeOutInformer, "timeOutInformer");
        this.a = timeOutInformer;
        this.b = new HashMap();
    }

    public final boolean a(byte b, long j) {
        Intrinsics.checkNotNullExpressionValue("Nk", "TAG");
        if (this.b.containsKey(Byte.valueOf(b))) {
            a(b);
        }
        try {
            Timer timer = new Timer("Nk");
            this.b.put(Byte.valueOf(b), timer);
            timer.schedule(new Mk(this, b), j);
            return true;
        } catch (InternalError e) {
            Intrinsics.checkNotNullExpressionValue("Nk", "TAG");
            e.toString();
            return false;
        }
    }

    public final void b(final byte b) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.Nk$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Nk.a(Nk.this, b);
            }
        });
    }

    public static final void a(Nk nk, byte b) {
        nk.a.a(b);
    }

    public final void a(byte b) {
        Intrinsics.checkNotNullExpressionValue("Nk", "TAG");
        Timer timer = (Timer) this.b.get(Byte.valueOf(b));
        if (timer != null) {
            timer.cancel();
            this.b.remove(Byte.valueOf(b));
        }
    }
}
