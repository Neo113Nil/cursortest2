package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class j32 implements m12 {
    public final ArrayList a;
    public final m12 b;

    public j32(ArrayList arrayList) {
        this.a = arrayList;
        this.b = (m12) CollectionsKt.firstOrNull((List) arrayList);
    }

    @Override // yads.m12
    public final String a() {
        m12 m12Var = this.b;
        if (m12Var != null) {
            return m12Var.a();
        }
        return null;
    }

    @Override // yads.m12
    public final s12 b() {
        m12 m12Var = this.b;
        if (m12Var != null) {
            return m12Var.b();
        }
        return null;
    }

    @Override // yads.m12
    public final String c() {
        m12 m12Var = this.b;
        String c = m12Var != null ? m12Var.c() : null;
        return c == null ? "" : c;
    }

    @Override // yads.m12
    public final p42 d() {
        p42 d;
        m12 m12Var = this.b;
        return (m12Var == null || (d = m12Var.d()) == null) ? new p42(null, null) : d;
    }

    @Override // yads.m12
    public final void destroy() {
        m12 m12Var = this.b;
        if (m12Var != null) {
            m12Var.destroy();
        }
    }

    @Override // yads.m12
    public final j00 e() {
        m12 m12Var = this.b;
        if (m12Var != null) {
            return m12Var.e();
        }
        return null;
    }

    @Override // yads.m12
    public final List f() {
        m12 m12Var = this.b;
        if (m12Var != null) {
            return m12Var.f();
        }
        return null;
    }

    @Override // yads.m12
    public final w00 getAdAssets() {
        w00 adAssets;
        m12 m12Var = this.b;
        return (m12Var == null || (adAssets = m12Var.getAdAssets()) == null) ? new w00(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false) : adAssets;
    }

    @Override // yads.m12
    public final dq2 getAdType() {
        dq2 adType;
        m12 m12Var = this.b;
        return (m12Var == null || (adType = m12Var.getAdType()) == null) ? dq2.c : adType;
    }

    @Override // yads.m12
    public final String getInfo() {
        m12 m12Var = this.b;
        if (m12Var != null) {
            return m12Var.getInfo();
        }
        return null;
    }

    @Override // yads.m12
    public final void loadImages() {
        m12 m12Var = this.b;
        if (m12Var != null) {
            m12Var.loadImages();
        }
    }

    @Override // yads.m12
    public final xz a(f22 f22Var) {
        xz a;
        m12 m12Var = this.b;
        return (m12Var == null || (a = m12Var.a(f22Var)) == null) ? new vz(null, new IllegalStateException("No native ad available for binding")) : a;
    }

    @Override // yads.m12
    public final void a(f22 f22Var, ku kuVar) {
        m12 m12Var = this.b;
        if (m12Var != null) {
            m12Var.a(f22Var, kuVar);
        }
    }

    @Override // yads.m12
    public final void a(x00 x00Var) {
        m12 m12Var = this.b;
        if (m12Var != null) {
            m12Var.a(x00Var);
        }
    }

    @Override // yads.m12
    public final void a(zb zbVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((m12) it.next()).a(zbVar);
        }
    }
}
