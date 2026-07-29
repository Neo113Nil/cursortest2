package o;

/* renamed from: o.cv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0870cv {
    public final String a;

    public C0870cv(String str) {
        if (str != null) {
            this.a = str;
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 3 && i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static C0870cv b(C1639ob c1639ob) {
        C2245xo g = c1639ob.g();
        String replace = c1639ob.h().b().replace('.', '$');
        if (g.d()) {
            return new C0870cv(replace);
        }
        return new C0870cv(g.b().replace('.', '/') + "/" + replace);
    }

    public static C0870cv c(C2245xo c2245xo) {
        if (c2245xo != null) {
            return new C0870cv(c2245xo.b().replace('.', '/'));
        }
        a(2);
        throw null;
    }

    public static C0870cv d(String str) {
        if (str != null) {
            return new C0870cv(str);
        }
        a(0);
        throw null;
    }

    public final String e() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0870cv.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C0870cv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
