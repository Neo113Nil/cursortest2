package com.my.target;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.common.util.concurrent.AtomicDouble;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.oe;
import com.my.target.wh;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public class oe {
    private static final DecimalFormat l;
    private final wh.c a;
    private boolean b;
    private fe c;
    private uh d;
    private th e;
    private Context f;
    private String g;
    private a h;
    private float i;
    private b j;
    private final t3 k;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a();
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static final class b {
        private final AtomicDouble a = new AtomicDouble();
        private float b = 0.0f;

        b() {
        }

        public float a() {
            return (float) this.a.getAndSet(0.0d);
        }

        public void a(float f, float f2) {
            float min = Math.min(f, f2);
            if (1 == v4.a(min, this.b)) {
                this.a.addAndGet(min - this.b);
            }
            this.b = min;
        }
    }

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        l = decimalFormat;
        decimalFormat.setMaximumFractionDigits(2);
    }

    private oe(eb ebVar, fe feVar, Context context, wh.c cVar, t3 t3Var) {
        this.j = new b();
        this.k = t3Var;
        this.c = feVar;
        this.a = cVar;
        if (context != null) {
            this.f = context.getApplicationContext();
        }
        if (ebVar == null) {
            return;
        }
        th H = ebVar.H();
        this.e = H;
        this.d = H.c();
        this.g = ebVar.x();
        this.i = ebVar.t();
    }

    public static oe a(th thVar, float f) {
        return new oe(thVar, f, b());
    }

    private static t3 b() {
        return t3.a(new Handler(Looper.getMainLooper()));
    }

    public static oe c() {
        return new oe(null, null, null, null, b());
    }

    private void d() {
        final th thVar;
        final b bVar;
        synchronized (this) {
            thVar = this.e;
            bVar = this.j;
        }
        if (thVar != null) {
            this.k.a(10000L, new Runnable() { // from class: com.my.target.oe$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    oe.a(oe.b.this, thVar);
                }
            });
        }
    }

    public void e() {
        if (a()) {
            return;
        }
        this.d = this.e.c();
        this.b = false;
    }

    public void f() {
        d();
        if (a()) {
            return;
        }
        wh.b(this.e, "playbackCompleted", 1);
    }

    public void g() {
        d();
    }

    public void h() {
        d();
        if (a()) {
            return;
        }
        wh.b(this.e, "closedByUser", 999);
    }

    public void i() {
        d();
        if (a()) {
            return;
        }
        wh.b(this.e, "playbackPaused", 1);
        fe feVar = this.c;
        if (feVar != null) {
            feVar.a(0);
        }
    }

    public void j() {
        d();
        if (a()) {
            return;
        }
        wh.b(this.e, "error", 1);
        wh.b(this.e, "playbackError", 1);
        fe feVar = this.c;
        if (feVar != null) {
            feVar.a(3);
        }
    }

    public void k() {
        d();
        if (a()) {
            return;
        }
        wh.b(this.e, "playbackTimeout", 1);
    }

    public void l() {
        d();
        if (a()) {
            return;
        }
        wh.b(this.e, "playbackResumed", 1);
        fe feVar = this.c;
        if (feVar != null) {
            feVar.a(1);
        }
    }

    public void m() {
        d();
        if (a()) {
            return;
        }
        wh.b(this.e, "playbackStopped", 1);
    }

    public static oe a(eb ebVar, fe feVar, wh.c cVar, Context context) {
        return new oe(ebVar, feVar, context, cVar, b());
    }

    private static void b(th thVar, float f) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_DURATION, l.format(f));
            hashMap.put("localTimestamp", Long.toString(SystemClock.elapsedRealtime()));
            wh.a(thVar, "playbackDuration", hashMap, 1);
        } catch (Throwable th) {
            mi.c("PlaybackTracker", "Unexpected exception: " + th.getMessage() + "\nexception=" + gi.b(th));
        }
    }

    public void a(Context context) {
        this.f = context;
    }

    public void a(a aVar) {
        this.h = aVar;
    }

    public void a(eb ebVar) {
        this.k.b();
        if (ebVar != null) {
            if (ebVar.H() != this.e) {
                this.b = false;
            }
            synchronized (this) {
                this.e = ebVar.H();
                this.j = new b();
            }
            this.d = ebVar.H().c();
        } else {
            synchronized (this) {
                this.e = null;
                this.j = new b();
            }
            this.d = null;
        }
        this.g = null;
        this.i = 0.0f;
    }

    public void b(float f, float f2) {
        if (v4.a(f, f2) == 0) {
            return;
        }
        if (!a()) {
            if (v4.a(0.0f, f) == 0) {
                wh.b(this.e, "volumeOn", 1);
            } else if (v4.a(0.0f, f2) == 0) {
                wh.b(this.e, "volumeOff", 1);
            }
        }
        fe feVar = this.c;
        if (feVar != null) {
            feVar.a(f2);
        }
    }

    private oe(th thVar, float f, t3 t3Var) {
        this(null, null, null, null, t3Var);
        this.e = thVar;
        this.d = thVar != null ? thVar.c() : null;
        this.i = f;
    }

    public void b(boolean z) {
        if (a()) {
            return;
        }
        wh.b(this.e, z ? "volumeOn" : "volumeOff", 999);
        fe feVar = this.c;
        if (feVar != null) {
            feVar.a(z ? 1.0f : 0.0f);
        }
    }

    public void a(fe feVar) {
        this.c = feVar;
    }

    public void a(float f, float f2) {
        d();
        this.j.a(f, f2);
        if (a()) {
            return;
        }
        if (!this.b) {
            wh.a(this.e, "playbackStarted", 1, this.a);
            a aVar = this.h;
            if (aVar != null) {
                aVar.a();
            }
            this.b = true;
        }
        if (!this.d.c.isEmpty()) {
            uh a2 = this.d.a();
            Iterator it = this.d.c.iterator();
            while (it.hasNext()) {
                xe xeVar = (xe) it.next();
                if (v4.a(xeVar.h(), f) != 1) {
                    a2.c.add(xeVar);
                    it.remove();
                }
            }
            wh.b(a2, 1, this.a);
        }
        fe feVar = this.c;
        if (feVar != null) {
            feVar.b(f, f2);
        }
        if (this.i <= 0.0f || f2 <= 0.0f || TextUtils.isEmpty(this.g) || Math.abs(f2 - this.i) <= 1.5f) {
            return;
        }
        mi.e("PlaybackTracker", "The diff between expected duration = " + this.i + " and the received duration = " + f2 + " from the player is more than duration error limit = 1.5");
    }

    public void a(boolean z) {
        if (a()) {
            return;
        }
        wh.b(this.e, z ? "fullscreenOn" : "fullscreenOff", 1);
        fe feVar = this.c;
        if (feVar != null) {
            feVar.a(z);
        }
    }

    private boolean a() {
        return this.f == null || this.e == null || this.d == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar, th thVar) {
        float a2 = bVar.a();
        if (v4.a(0.0f, a2) == -1) {
            b(thVar, a2);
        }
    }
}
