package o;

/* renamed from: o.xo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2245xo {
    public static final C2245xo c = new C2245xo("");
    public final C2377zo a;
    public transient C2245xo b;

    public C2245xo(String str) {
        if (str != null) {
            this.a = new C2377zo(str, this);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                objArr[1] = "toUnsafe";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static C2245xo j(C0827cE c0827cE) {
        if (c0827cE != null) {
            return new C2245xo(new C2377zo(c0827cE.b(), c.i(), c0827cE));
        }
        a(13);
        throw null;
    }

    public final String b() {
        String str = this.a.a;
        if (str != null) {
            return str;
        }
        C2377zo.a(4);
        throw null;
    }

    public final C2245xo c(C0827cE c0827cE) {
        if (c0827cE != null) {
            return new C2245xo(this.a.b(c0827cE), this);
        }
        a(8);
        throw null;
    }

    public final boolean d() {
        return this.a.a.isEmpty();
    }

    public final C2245xo e() {
        C2245xo c2245xo = this.b;
        if (c2245xo != null) {
            return c2245xo;
        }
        if (d()) {
            throw new IllegalStateException("root");
        }
        C2377zo c2377zo = this.a;
        C2377zo c2377zo2 = c2377zo.c;
        if (c2377zo2 == null) {
            if (c2377zo.a.isEmpty()) {
                throw new IllegalStateException("root");
            }
            c2377zo.c();
            c2377zo2 = c2377zo.c;
            if (c2377zo2 == null) {
                C2377zo.a(8);
                throw null;
            }
        }
        C2245xo c2245xo2 = new C2245xo(c2377zo2);
        this.b = c2245xo2;
        return c2245xo2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2245xo) && this.a.equals(((C2245xo) obj).a);
    }

    public final C0827cE f() {
        C0827cE f = this.a.f();
        if (f != null) {
            return f;
        }
        a(9);
        throw null;
    }

    public final C0827cE g() {
        C2377zo c2377zo = this.a;
        if (c2377zo.a.isEmpty()) {
            C0827cE c0827cE = C2377zo.e;
            if (c0827cE != null) {
                return c0827cE;
            }
            C2377zo.a(12);
            throw null;
        }
        C0827cE f = c2377zo.f();
        if (f != null) {
            return f;
        }
        C2377zo.a(13);
        throw null;
    }

    public final boolean h(C0827cE c0827cE) {
        if (c0827cE == null) {
            a(12);
            throw null;
        }
        String str = this.a.a;
        if (str.isEmpty()) {
            return false;
        }
        int indexOf = str.indexOf(46);
        String b = c0827cE.b();
        if (indexOf == -1) {
            indexOf = Math.max(str.length(), b.length());
        }
        return str.regionMatches(0, b, 0, indexOf);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final C2377zo i() {
        C2377zo c2377zo = this.a;
        if (c2377zo != null) {
            return c2377zo;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.a.toString();
    }

    public C2245xo(C2377zo c2377zo) {
        this.a = c2377zo;
    }

    public C2245xo(C2377zo c2377zo, C2245xo c2245xo) {
        this.a = c2377zo;
        this.b = c2245xo;
    }
}
