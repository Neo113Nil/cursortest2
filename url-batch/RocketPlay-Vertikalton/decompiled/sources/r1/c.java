package r1;

import E1.AbstractC0001b;
import Z0.i;
import android.os.Handler;
import android.os.Looper;
import i1.f;
import java.util.concurrent.CancellationException;
import q1.AbstractC0349o;
import q1.AbstractC0352s;
import q1.AbstractC0358y;
import q1.InterfaceC0355v;
import u1.m;

/* loaded from: classes.dex */
public final class c extends AbstractC0349o implements InterfaceC0355v {
    private volatile c _immediate;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f3927c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3928e;

    /* renamed from: f, reason: collision with root package name */
    public final c f3929f;

    public c(Handler handler, String str, boolean z2) {
        this.f3927c = handler;
        this.d = str;
        this.f3928e = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f3929f = cVar;
    }

    @Override // q1.AbstractC0349o
    public final void D(i iVar, Runnable runnable) {
        if (this.f3927c.post(runnable)) {
            return;
        }
        AbstractC0352s.a(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        AbstractC0358y.f3925b.D(iVar, runnable);
    }

    @Override // q1.AbstractC0349o
    public final boolean E() {
        return (this.f3928e && f.a(Looper.myLooper(), this.f3927c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f3927c == this.f3927c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3927c);
    }

    @Override // q1.AbstractC0349o
    public final String toString() {
        c cVar;
        String str;
        w1.d dVar = AbstractC0358y.f3924a;
        c cVar2 = m.f4201a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f3929f;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.d;
        if (str2 == null) {
            str2 = this.f3927c.toString();
        }
        return this.f3928e ? AbstractC0001b.g(str2, ".immediate") : str2;
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
