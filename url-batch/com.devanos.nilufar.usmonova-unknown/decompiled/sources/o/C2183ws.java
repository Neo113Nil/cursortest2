package o;

/* renamed from: o.ws, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2183ws {
    public final Object a;
    public final Object b;
    public final Object c;
    public final C1527mv d;
    public final String e;
    public final C1639ob f;

    public C2183ws(Object obj, Object obj2, C1527mv c1527mv, C1527mv c1527mv2, String str, C1639ob c1639ob) {
        AbstractC0048Bt.n(str, "filePath");
        this.a = obj;
        this.b = obj2;
        this.c = c1527mv;
        this.d = c1527mv2;
        this.e = str;
        this.f = c1639ob;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2183ws)) {
            return false;
        }
        C2183ws c2183ws = (C2183ws) obj;
        return this.a.equals(c2183ws.a) && AbstractC0048Bt.h(this.b, c2183ws.b) && AbstractC0048Bt.h(this.c, c2183ws.c) && this.d.equals(c2183ws.d) && AbstractC0048Bt.h(this.e, c2183ws.e) && this.f.equals(c2183ws.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.a + ", compilerVersion=" + this.b + ", languageVersion=" + this.c + ", expectedVersion=" + this.d + ", filePath=" + this.e + ", classId=" + this.f + ')';
    }
}
