package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class cw extends uj implements ml {
    public final Handler f;
    public final String g;
    public final boolean h;
    public final cw i;

    public cw(Handler handler, String str, boolean z) {
        this.f = handler;
        this.g = str;
        this.h = z;
        this.i = z ? this : new cw(handler, str, true);
    }

    @Override // defpackage.ml
    public final void c(long j, hc hcVar) {
        bw bwVar = new bw(hcVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f.postDelayed(bwVar, j)) {
            hcVar.s(new aw(0, this, bwVar));
        } else {
            l(hcVar.h, bwVar);
        }
    }

    @Override // defpackage.uj
    public final void d(rj rjVar, Runnable runnable) {
        if (this.f.post(runnable)) {
            return;
        }
        l(rjVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cw)) {
            return false;
        }
        cw cwVar = (cw) obj;
        return cwVar.f == this.f && cwVar.h == this.h;
    }

    @Override // defpackage.uj
    public final boolean f(rj rjVar) {
        return (this.h && nz.l(Looper.myLooper(), this.f.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return (this.h ? 1231 : 1237) ^ System.identityHashCode(this.f);
    }

    public final void l(rj rjVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        zz zzVar = (zz) rjVar.k(b2.C);
        if (zzVar != null) {
            zzVar.a(cancellationException);
        }
        gl glVar = vm.a;
        cl.f.d(rjVar, runnable);
    }

    @Override // defpackage.uj
    public final String toString() {
        cw cwVar;
        String str;
        gl glVar = vm.a;
        cw cwVar2 = o40.a;
        if (this == cwVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cwVar = cwVar2.i;
            } catch (UnsupportedOperationException unused) {
                cwVar = null;
            }
            str = this == cwVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.g;
        if (str2 == null) {
            str2 = this.f.toString();
        }
        if (!this.h) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public cw(Handler handler) {
        this(handler, null, false);
    }
}
