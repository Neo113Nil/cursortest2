package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: o.zo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2377zo {
    public static final C0827cE e = C0827cE.g("<root>");
    public static final Pattern f = Pattern.compile("\\.");
    public static final C2311yo g = new C2311yo(0);
    public final String a;
    public transient C2245xo b;
    public transient C2377zo c;
    public transient C0827cE d;

    public C2377zo(String str, C2245xo c2245xo) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.a = str;
        this.b = c2245xo;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "toSafe";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public final C2377zo b(C0827cE c0827cE) {
        String str;
        if (c0827cE == null) {
            a(9);
            throw null;
        }
        String str2 = this.a;
        if (str2.isEmpty()) {
            str = c0827cE.b();
        } else {
            str = str2 + "." + c0827cE.b();
        }
        return new C2377zo(str, this, c0827cE);
    }

    public final void c() {
        String str = this.a;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.d = C0827cE.d(str.substring(lastIndexOf + 1));
            this.c = new C2377zo(str.substring(0, lastIndexOf));
        } else {
            this.d = C0827cE.d(str);
            this.c = C2245xo.c.i();
        }
    }

    public final boolean d() {
        if (this.b != null) {
            return true;
        }
        String str = this.a;
        if (str != null) {
            return str.indexOf(60) < 0;
        }
        a(4);
        throw null;
    }

    public final List e() {
        List list;
        String str = this.a;
        if (str.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            String[] split = f.split(str);
            AbstractC0048Bt.n(split, "<this>");
            AbstractC0048Bt.n(g, "transform");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str2 : split) {
                arrayList.add(C0827cE.d(str2));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        a(14);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2377zo) && this.a.equals(((C2377zo) obj).a);
    }

    public final C0827cE f() {
        C0827cE c0827cE = this.d;
        if (c0827cE != null) {
            if (c0827cE != null) {
                return c0827cE;
            }
            a(10);
            throw null;
        }
        if (this.a.isEmpty()) {
            throw new IllegalStateException("root");
        }
        c();
        C0827cE c0827cE2 = this.d;
        if (c0827cE2 != null) {
            return c0827cE2;
        }
        a(11);
        throw null;
    }

    public final C2245xo g() {
        C2245xo c2245xo = this.b;
        if (c2245xo != null) {
            return c2245xo;
        }
        C2245xo c2245xo2 = new C2245xo(this);
        this.b = c2245xo2;
        return c2245xo2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        if (str.isEmpty()) {
            str = e.b();
        }
        if (str != null) {
            return str;
        }
        a(17);
        throw null;
    }

    public C2377zo(String str) {
        if (str != null) {
            this.a = str;
        } else {
            a(2);
            throw null;
        }
    }

    public C2377zo(String str, C2377zo c2377zo, C0827cE c0827cE) {
        if (str != null) {
            this.a = str;
            this.c = c2377zo;
            this.d = c0827cE;
            return;
        }
        a(3);
        throw null;
    }
}
