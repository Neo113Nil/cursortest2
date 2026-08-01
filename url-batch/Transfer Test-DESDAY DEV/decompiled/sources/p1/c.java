package p1;

import X0.i;
import Y.V;
import android.os.Handler;
import android.os.Looper;
import g1.f;
import java.util.concurrent.CancellationException;
import o1.AbstractC0299p;
import o1.AbstractC0302t;
import o1.AbstractC0308z;
import o1.C0288e;
import o1.InterfaceC0305w;
import s1.m;

/* loaded from: classes.dex */
public final class c extends AbstractC0299p implements InterfaceC0305w {
    private volatile c _immediate;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f3428c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3429e;

    /* renamed from: f, reason: collision with root package name */
    public final c f3430f;

    public c(Handler handler, String str, boolean z2) {
        this.f3428c = handler;
        this.d = str;
        this.f3429e = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f3430f = cVar;
    }

    @Override // o1.AbstractC0299p
    public final boolean A() {
        return (this.f3429e && f.a(Looper.myLooper(), this.f3428c.getLooper())) ? false : true;
    }

    public final void B(i iVar, Runnable runnable) {
        AbstractC0302t.a(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        AbstractC0308z.f3346b.z(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f3428c == this.f3428c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3428c);
    }

    @Override // o1.AbstractC0299p
    public final String toString() {
        c cVar;
        String str;
        u1.d dVar = AbstractC0308z.f3345a;
        c cVar2 = m.f3714a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f3430f;
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
            str2 = this.f3428c.toString();
        }
        return this.f3429e ? V.f(str2, ".immediate") : str2;
    }

    @Override // o1.InterfaceC0305w
    public final void v(C0288e c0288e) {
        H.a aVar = new H.a(c0288e, 3, this);
        if (this.f3428c.postDelayed(aVar, 1500L)) {
            c0288e.o(new androidx.room.d(this, 1, aVar));
        } else {
            B(c0288e.f3311e, aVar);
        }
    }

    @Override // o1.AbstractC0299p
    public final void z(i iVar, Runnable runnable) {
        if (this.f3428c.post(runnable)) {
            return;
        }
        B(iVar, runnable);
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
