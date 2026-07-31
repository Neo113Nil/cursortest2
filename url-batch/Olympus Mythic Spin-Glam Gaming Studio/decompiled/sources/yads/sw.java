package yads;

import android.content.SharedPreferences;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class sw {
    public static final Object i = new Object();
    public final tw a;
    public final uw b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public String g;
    public String h;

    public sw(tw twVar, uw uwVar, og1 og1Var) {
        this.a = twVar;
        this.b = uwVar;
        for (mw mwVar : mw.values()) {
            this.b.getClass();
            qg1 qg1Var = (qg1) og1Var;
            bx bxVar = null;
            mw mwVar2 = qg1Var.a(mwVar.c) ? mwVar : null;
            bx a = mwVar2 != null ? uw.a(qg1Var, mwVar2) : null;
            if (a == null) {
                this.a.getClass();
                String str = mwVar.b;
                mwVar = (str == null || !qg1Var.a(str)) ? null : mwVar;
                if (mwVar != null) {
                    bxVar = tw.a(og1Var, mwVar);
                }
            } else {
                bxVar = a;
            }
            a(bxVar);
        }
        qg1 qg1Var2 = (qg1) og1Var;
        if (qg1Var2.e.isEmpty()) {
            ((SharedPreferences) qg1Var2.d.getValue()).registerOnSharedPreferenceChangeListener(qg1Var2);
        }
        qg1Var2.e.add(new WeakReference(this));
    }

    public final boolean a() {
        boolean z;
        synchronized (i) {
            z = this.e;
        }
        return z;
    }

    public final String b() {
        String str;
        synchronized (i) {
            str = this.c;
        }
        return str;
    }

    public final String c() {
        String str;
        synchronized (i) {
            str = this.d;
        }
        return str;
    }

    public final String d() {
        String str;
        synchronized (i) {
            str = this.f;
        }
        return str;
    }

    public final String e() {
        String str;
        synchronized (i) {
            str = this.g;
        }
        return str;
    }

    public final void a(bx bxVar) {
        if (bxVar instanceof ww) {
            this.e = ((ww) bxVar).a;
            return;
        }
        if (bxVar instanceof xw) {
            this.c = ((xw) bxVar).a;
            return;
        }
        if (bxVar instanceof yw) {
            this.d = ((yw) bxVar).a;
            return;
        }
        if (bxVar instanceof zw) {
            this.f = ((zw) bxVar).a;
        } else if (bxVar instanceof ax) {
            this.g = ((ax) bxVar).a;
        } else if (bxVar instanceof vw) {
            this.h = ((vw) bxVar).a;
        }
    }
}
