package a;

/* loaded from: classes.dex */
public final /* synthetic */ class v extends g1.a implements f1.a, g1.e, l1.a, U0.a {

    /* renamed from: g, reason: collision with root package name */
    public final int f1225g;
    public final int h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, false);
        this.i = i2;
        this.f1225g = i;
        this.h = 0;
    }

    public final l1.a b() {
        g1.j.f2584a.getClass();
        return this;
    }

    @Override // f1.a
    public final Object c() {
        switch (this.i) {
            case 0:
                ((w) this.f2573b).d();
                break;
            default:
                ((w) this.f2573b).d();
                break;
        }
        return U0.i.f870a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return this.d.equals(vVar.d) && this.f2575e.equals(vVar.f2575e) && this.h == vVar.h && this.f1225g == vVar.f1225g && this.f2573b.equals(vVar.f2573b) && a().equals(vVar.a());
        }
        if (!(obj instanceof v)) {
            return false;
        }
        l1.a aVar = this.f2572a;
        if (aVar == null) {
            b();
            this.f2572a = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // g1.e
    public final int f() {
        return this.f1225g;
    }

    public final int hashCode() {
        a();
        return this.f2575e.hashCode() + ((this.d.hashCode() + (a().hashCode() * 31)) * 31);
    }

    public final String toString() {
        l1.a aVar = this.f2572a;
        if (aVar == null) {
            b();
            this.f2572a = this;
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
