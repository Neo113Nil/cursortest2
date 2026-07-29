package o;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class F20 {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ com.google.android.gms.common.internal.a c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ com.google.android.gms.common.internal.a f;

    public F20(com.google.android.gms.common.internal.a aVar, int i, Bundle bundle) {
        this.f = aVar;
        Boolean bool = Boolean.TRUE;
        this.c = aVar;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract void a(C0162Gd c0162Gd);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.a = null;
        }
        synchronized (this.c.k) {
            this.c.k.remove(this);
        }
    }
}
