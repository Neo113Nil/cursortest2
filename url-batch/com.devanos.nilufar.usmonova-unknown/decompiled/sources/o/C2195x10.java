package o;

import android.view.View;
import java.util.ArrayList;

/* renamed from: o.x10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2195x10 implements InterfaceC0288Kz {
    public final /* synthetic */ C2103ve h;
    public final /* synthetic */ P3 i;
    public final /* synthetic */ C0901dM j;
    public final /* synthetic */ C1360kM k;
    public final /* synthetic */ View l;

    public C2195x10(C2103ve c2103ve, P3 p3, C0901dM c0901dM, C1360kM c1360kM, View view) {
        this.h = c2103ve;
        this.i = p3;
        this.j = c0901dM;
        this.k = c1360kM;
        this.l = view;
    }

    @Override // o.InterfaceC0288Kz
    public final void j(InterfaceC0365Nz interfaceC0365Nz, EnumC0054Bz enumC0054Bz) {
        boolean z;
        int i = AbstractC1997u10.a[enumC0054Bz.ordinal()];
        InterfaceC0718aa interfaceC0718aa = null;
        if (i == 1) {
            AbstractC0868ct.H(this.h, null, EnumC0500Te.k, new C2129w10(this.k, this.j, interfaceC0365Nz, this, this.l, null), 1);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                this.j.d();
                return;
            } else {
                C0901dM c0901dM = this.j;
                synchronized (c0901dM.b) {
                    c0901dM.q = true;
                }
                return;
            }
        }
        P3 p3 = this.i;
        if (p3 != null) {
            C1662oy c1662oy = (C1662oy) p3.j;
            synchronized (c1662oy.a) {
                try {
                    synchronized (c1662oy.a) {
                        z = c1662oy.d;
                    }
                    if (!z) {
                        ArrayList arrayList = c1662oy.b;
                        c1662oy.b = c1662oy.c;
                        c1662oy.c = arrayList;
                        c1662oy.d = true;
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((InterfaceC2235xe) arrayList.get(i2)).resumeWith(C0782bY.a);
                        }
                        arrayList.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0901dM c0901dM2 = this.j;
        synchronized (c0901dM2.b) {
            if (c0901dM2.q) {
                c0901dM2.q = false;
                interfaceC0718aa = c0901dM2.e();
            }
        }
        if (interfaceC0718aa != null) {
            ((C0849ca) interfaceC0718aa).resumeWith(C0782bY.a);
        }
    }
}
