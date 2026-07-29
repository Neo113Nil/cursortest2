package o;

import android.util.SparseArray;
import java.util.Iterator;

/* renamed from: o.an, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0731an implements InterfaceC0797bn {
    public final /* synthetic */ C0862cn a;

    public C0731an(C0862cn c0862cn) {
        this.a = c0862cn;
    }

    @Override // o.InterfaceC0797bn
    public final void b() {
        C0862cn c0862cn = this.a;
        Iterator it = c0862cn.v.iterator();
        while (it.hasNext()) {
            ((InterfaceC0797bn) it.next()).b();
        }
        DI di = c0862cn.s;
        SparseArray sparseArray = di.r;
        while (sparseArray.size() > 0) {
            di.B.r0(sparseArray.keyAt(0));
        }
        CI ci = c0862cn.t;
        SparseArray sparseArray2 = ci.n;
        while (sparseArray2.size() > 0) {
            ci.t.r0(sparseArray2.keyAt(0));
        }
        c0862cn.k.f = null;
    }

    @Override // o.InterfaceC0797bn
    public final void a() {
    }
}
