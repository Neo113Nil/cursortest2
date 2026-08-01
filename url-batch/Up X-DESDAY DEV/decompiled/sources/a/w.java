package a;

import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements W0.a, X0.d, Serializable, P0.a {

    /* renamed from: a, reason: collision with root package name */
    public transient w f1093a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1094b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1095c = false;
    public final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1096e;

    public w(int i, Object obj) {
        this.f1096e = i;
        this.f1094b = obj;
    }

    @Override // W0.a
    public final Object a() {
        switch (this.f1096e) {
            case 0:
                ((x) this.f1094b).d();
                break;
            default:
                ((x) this.f1094b).d();
                break;
        }
        return P0.d.f626c;
    }

    @Override // X0.d
    public final int b() {
        return 0;
    }

    public final X0.b d() {
        if (!this.f1095c) {
            return X0.i.a(x.class);
        }
        X0.i.f1018a.getClass();
        return new X0.g();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            wVar.getClass();
            return this.d == wVar.d && this.f1094b.equals(wVar.f1094b) && d().equals(wVar.d());
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar2 = this.f1093a;
        if (wVar2 == null) {
            X0.i.f1018a.getClass();
            this.f1093a = this;
            wVar2 = this;
        }
        return obj.equals(wVar2);
    }

    public final int hashCode() {
        d();
        return (((d().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        w wVar = this.f1093a;
        if (wVar == null) {
            X0.i.f1018a.getClass();
            this.f1093a = this;
            wVar = this;
        }
        return wVar != this ? wVar.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
