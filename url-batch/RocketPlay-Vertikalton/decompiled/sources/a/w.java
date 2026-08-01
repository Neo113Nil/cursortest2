package a;

import h1.InterfaceC0173a;

/* loaded from: classes.dex */
public final /* synthetic */ class w extends i1.a implements InterfaceC0173a, i1.e, n1.a, V0.a {

    /* renamed from: g, reason: collision with root package name */
    public final int f1619g;
    public final int h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, false);
        this.i = i2;
        this.f1619g = i;
        this.h = 0;
    }

    public final n1.a b() {
        i1.j.f3052a.getClass();
        return this;
    }

    @Override // h1.InterfaceC0173a
    public final Object c() {
        switch (this.i) {
            case 0:
                ((x) this.f3040b).d();
                break;
            default:
                ((x) this.f3040b).d();
                break;
        }
        return V0.i.f1250a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            return this.d.equals(wVar.d) && this.f3042e.equals(wVar.f3042e) && this.h == wVar.h && this.f1619g == wVar.f1619g && this.f3040b.equals(wVar.f3040b) && a().equals(wVar.a());
        }
        if (!(obj instanceof w)) {
            return false;
        }
        n1.a aVar = this.f3039a;
        if (aVar == null) {
            b();
            this.f3039a = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // i1.e
    public final int f() {
        return this.f1619g;
    }

    public final int hashCode() {
        a();
        return this.f3042e.hashCode() + ((this.d.hashCode() + (a().hashCode() * 31)) * 31);
    }

    public final String toString() {
        n1.a aVar = this.f3039a;
        if (aVar == null) {
            b();
            this.f3039a = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.d;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }
}
