package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.pj;
import com.my.target.wh;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class nj extends i3 {
    private final wh.c f;
    boolean g;
    float h;

    private nj(t5 t5Var, uh uhVar, long j, wh.c cVar) {
        super(t5Var, uhVar, j);
        this.g = false;
        this.h = 0.0f;
        this.f = cVar;
    }

    public static nj a(t5 t5Var, uh uhVar, long j, wh.c cVar) {
        return new nj(t5Var, uhVar, j, cVar);
    }

    private void b(float f, long j) {
        pj.a a;
        String valueOf = String.valueOf((int) f);
        String format = String.format(Locale.getDefault(), "%.1f", Float.valueOf(Math.min(j, 60000L) / 1000.0f));
        HashMap hashMap = new HashMap();
        hashMap.put("viewability_percent", valueOf);
        hashMap.put("viewability_duration", format);
        mi.b("ViewabilityTracker: ViewabilityDurationStatTracker", "Sending ViewabilityDuration stat (max visible percent = " + valueOf + ", duration = " + format + " sec)");
        wh.a(this.a, hashMap, 1, this.f);
        if (!th.c(this.a.c) || (a = a()) == null) {
            return;
        }
        a.a();
    }

    private long d() {
        return System.currentTimeMillis() - this.e;
    }

    @Override // com.my.target.di
    public void a(View view) {
    }

    @Override // com.my.target.di
    public void c() {
        if (!this.g) {
            this.e = 0L;
        } else {
            a(this.h, d());
        }
    }

    @Override // com.my.target.di
    public void a(boolean z, float f, Context context) {
        if (this.g) {
            a(z, f);
        } else if (a(z)) {
            this.g = true;
            this.h = f;
            mi.b("ViewabilityTracker: ViewabilityDurationStatTracker", "Start tracking viewability");
        }
    }

    private void a(boolean z, float f) {
        this.h = Math.max(this.h, f);
        long d = d();
        if (z && d < 60000) {
            mi.b("ViewabilityTracker: ViewabilityDurationStatTracker", "No need to send ViewabilityDurationStat (isVisible = true, currentDurationMillis = " + d + ")");
            return;
        }
        a(this.h, d);
    }

    private void a(float f, long j) {
        b(f, j);
        mi.b("ViewabilityTracker: ViewabilityDurationStatTracker", "ViewabilityDuration tracked, kill self");
        b();
    }
}
