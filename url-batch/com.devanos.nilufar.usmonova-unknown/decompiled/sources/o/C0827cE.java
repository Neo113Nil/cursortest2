package o;

/* renamed from: o.cE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0827cE implements Comparable {
    public final String h;
    public final boolean i;

    public C0827cE(String str, boolean z) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.h = str;
        this.i = z;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                objArr[2] = "identifier";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "isValidIdentifier";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static C0827cE d(String str) {
        if (str != null) {
            return str.startsWith("<") ? g(str) : e(str);
        }
        a(8);
        throw null;
    }

    public static C0827cE e(String str) {
        if (str != null) {
            return new C0827cE(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean f(String str) {
        if (str == null) {
            a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static C0827cE g(String str) {
        if (str == null) {
            a(7);
            throw null;
        }
        if (str.startsWith("<")) {
            return new C0827cE(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    public final String b() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public final String c() {
        if (this.i) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String b = b();
        if (b != null) {
            return b;
        }
        a(2);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.h.compareTo(((C0827cE) obj).h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0827cE)) {
            return false;
        }
        C0827cE c0827cE = (C0827cE) obj;
        return this.i == c0827cE.i && this.h.equals(c0827cE.h);
    }

    public final int hashCode() {
        return (this.h.hashCode() * 31) + (this.i ? 1 : 0);
    }

    public final String toString() {
        return this.h;
    }
}
