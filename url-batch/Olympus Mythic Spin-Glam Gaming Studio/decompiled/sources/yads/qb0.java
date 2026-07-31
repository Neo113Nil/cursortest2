package yads;

import android.content.Context;
import android.os.SystemClock;
import android.webkit.URLUtil;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class qb0 implements c63 {
    public final v3 a;
    public final t8 b;
    public final x8 c;
    public final m2 d;
    public final pm0 e;
    public final boolean f;
    public final WeakReference g;

    public qb0(Context context, yu2 yu2Var, v3 v3Var, t8 t8Var, x8 x8Var, boolean z) {
        pm0 pm0Var;
        m2 m2Var = new m2(yu2Var);
        pm0 pm0Var2 = pm0.c;
        if (pm0Var2 == null) {
            synchronized (pm0.d) {
                pm0Var = pm0.c;
                if (pm0Var == null) {
                    pm0Var = new pm0(context.getApplicationContext());
                    pm0.c = pm0Var;
                }
            }
            pm0Var2 = pm0Var;
        }
        this.a = v3Var;
        this.b = t8Var;
        this.c = x8Var;
        this.d = m2Var;
        this.e = pm0Var2;
        this.f = z;
        this.g = new WeakReference(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145  */
    @Override // yads.c63
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b63 a(String str) {
        zu zuVar;
        boolean z;
        vu vuVar;
        String a;
        String str2;
        vw2 vw2Var;
        this.e.a.getClass();
        boolean z2 = true;
        boolean z3 = Intrinsics.areEqual((Object) null, Boolean.TRUE) || this.b.C;
        m2 m2Var = this.d;
        Context context = (Context) this.g.get();
        v3 v3Var = this.a;
        t8 t8Var = this.b;
        x8 x8Var = this.c;
        boolean z4 = this.f;
        m2Var.getClass();
        if (context != null) {
            AtomicLong atomicLong = l2.a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long andSet = elapsedRealtime - l2.a.getAndSet(elapsedRealtime);
            if (0 > andSet || andSet >= 1001) {
                vw2 vw2Var2 = vw2.l;
                if (vw2Var2 == null) {
                    synchronized (vw2.k) {
                        vw2Var = vw2.l;
                        if (vw2Var == null) {
                            vw2Var = new vw2();
                            vw2.l = vw2Var;
                        }
                    }
                    vw2Var2 = vw2Var;
                }
                bu2 a2 = vw2Var2.a(context);
                m2Var.d.getClass();
                if (a2 != null && (str2 = a2.V) != null) {
                    zu.c.getClass();
                    zu[] values = zu.values();
                    int length = values.length;
                    for (int i = 0; i < length; i++) {
                        zuVar = values[i];
                        if (Intrinsics.areEqual(zuVar.b, str2)) {
                            break;
                        }
                    }
                }
                zuVar = null;
                if (z4 || ((z3 && zuVar == null) || zu.d == zuVar)) {
                    if (str.length() != 0) {
                        String replaceFirst = new Regex("http(s?)://").replaceFirst(str, "");
                        for (lb3 lb3Var : lb3.values()) {
                            z = false;
                            if (StringsKt.startsWith$default(replaceFirst, lb3Var.b, false, 2, (Object) null)) {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (URLUtil.isNetworkUrl(str)) {
                        vuVar = uu.a;
                        m2Var.a.getClass();
                        a = m2Var.b.a(str, MapsKt.mapOf(TuplesKt.to("{CLICK_DEST}", wu.a(vuVar))));
                        z2 = m2Var.c.a(context, v3Var, t8Var, x8Var, a);
                        x8Var.a(9, null);
                        return !z2 ? new a63(eo2.d, vuVar, a) : new z53(eo2.d);
                    }
                } else {
                    z = false;
                }
                vuVar = tu.a;
                m2Var.a.getClass();
                a = m2Var.b.a(str, MapsKt.mapOf(TuplesKt.to("{CLICK_DEST}", wu.a(vuVar))));
                if (m2Var.e.a(context, a)) {
                    x8Var.a(7, null);
                } else {
                    z2 = URLUtil.isNetworkUrl(a) ? m2Var.c.a(context, v3Var, t8Var, x8Var, a) : z;
                }
                x8Var.a(9, null);
                if (!z2) {
                }
            }
        }
        return new z53(eo2.d);
    }
}
