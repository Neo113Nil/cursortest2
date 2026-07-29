package o;

/* renamed from: o.ob, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1639ob {
    public final C2245xo a;
    public final C2245xo b;
    public final boolean c;

    public C1639ob(C2245xo c2245xo, C2245xo c2245xo2, boolean z) {
        if (c2245xo == null) {
            a(1);
            throw null;
        }
        this.a = c2245xo;
        this.b = c2245xo2;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 5 && i != 6 && i != 7 && i != 9) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i != 5 && i != 6 && i != 7 && i != 9) {
                switch (i) {
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                Object[] objArr = new Object[i2];
                switch (i) {
                    case 1:
                    case 3:
                        objArr[0] = "packageFqName";
                        break;
                    case 2:
                        objArr[0] = "relativeClassName";
                        break;
                    case 4:
                        objArr[0] = "topLevelName";
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 9:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                        break;
                    case 8:
                        objArr[0] = "name";
                        break;
                    case 10:
                        objArr[0] = "segment";
                        break;
                    case 11:
                    case 12:
                        objArr[0] = "string";
                        break;
                    default:
                        objArr[0] = "topLevelFqName";
                        break;
                }
                if (i != 5) {
                    objArr[1] = "getPackageFqName";
                } else if (i == 6) {
                    objArr[1] = "getRelativeClassName";
                } else if (i == 7) {
                    objArr[1] = "getShortClassName";
                } else if (i != 9) {
                    switch (i) {
                        case 13:
                        case 14:
                            objArr[1] = "asString";
                            break;
                        case 15:
                        case 16:
                            objArr[1] = "asFqNameString";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                            break;
                    }
                } else {
                    objArr[1] = "asSingleFqName";
                }
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        objArr[2] = "<init>";
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 9:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        break;
                    case 8:
                        objArr[2] = "createNestedClassId";
                        break;
                    case 10:
                        objArr[2] = "startsWith";
                        break;
                    case 11:
                    case 12:
                        objArr[2] = "fromString";
                        break;
                    default:
                        objArr[2] = "topLevel";
                        break;
                }
                String format = String.format(str, objArr);
                if (i != 5 && i != 6 && i != 7 && i != 9) {
                    switch (i) {
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i2 = 2;
            Object[] objArr2 = new Object[i2];
            switch (i) {
            }
            if (i != 5) {
            }
            switch (i) {
            }
            String format2 = String.format(str, objArr2);
            if (i != 5) {
                switch (i) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 5) {
            switch (i) {
            }
            Object[] objArr22 = new Object[i2];
            switch (i) {
            }
            if (i != 5) {
            }
            switch (i) {
            }
            String format22 = String.format(str, objArr22);
            if (i != 5) {
            }
            throw new IllegalStateException(format22);
        }
        i2 = 2;
        Object[] objArr222 = new Object[i2];
        switch (i) {
        }
        if (i != 5) {
        }
        switch (i) {
        }
        String format222 = String.format(str, objArr222);
        if (i != 5) {
        }
        throw new IllegalStateException(format222);
    }

    public static C1639ob e(String str, boolean z) {
        String str2;
        if (str == null) {
            a(12);
            throw null;
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            str2 = "";
        } else {
            String replace = str.substring(0, lastIndexOf).replace('/', '.');
            str = str.substring(lastIndexOf + 1);
            str2 = replace;
        }
        return new C1639ob(new C2245xo(str2), new C2245xo(str), z);
    }

    public static C1639ob j(C2245xo c2245xo) {
        if (c2245xo != null) {
            return new C1639ob(c2245xo.e(), c2245xo.f());
        }
        a(0);
        throw null;
    }

    public final C2245xo b() {
        C2245xo c2245xo = this.a;
        boolean d = c2245xo.d();
        C2245xo c2245xo2 = this.b;
        if (d) {
            if (c2245xo2 != null) {
                return c2245xo2;
            }
            a(9);
            throw null;
        }
        return new C2245xo(c2245xo.b() + "." + c2245xo2.b());
    }

    public final String c() {
        C2245xo c2245xo = this.a;
        boolean d = c2245xo.d();
        C2245xo c2245xo2 = this.b;
        if (d) {
            return c2245xo2.b();
        }
        String str = c2245xo.b().replace('.', '/') + "/" + c2245xo2.b();
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final C1639ob d(C0827cE c0827cE) {
        if (c0827cE != null) {
            return new C1639ob(g(), this.b.c(c0827cE), this.c);
        }
        a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1639ob.class == obj.getClass()) {
            C1639ob c1639ob = (C1639ob) obj;
            if (this.a.equals(c1639ob.a) && this.b.equals(c1639ob.b) && this.c == c1639ob.c) {
                return true;
            }
        }
        return false;
    }

    public final C1639ob f() {
        C2245xo e = this.b.e();
        if (e.d()) {
            return null;
        }
        return new C1639ob(g(), e, this.c);
    }

    public final C2245xo g() {
        C2245xo c2245xo = this.a;
        if (c2245xo != null) {
            return c2245xo;
        }
        a(5);
        throw null;
    }

    public final C2245xo h() {
        C2245xo c2245xo = this.b;
        if (c2245xo != null) {
            return c2245xo;
        }
        a(6);
        throw null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.c).hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final C0827cE i() {
        C0827cE f = this.b.f();
        if (f != null) {
            return f;
        }
        a(7);
        throw null;
    }

    public final String toString() {
        return this.a.d() ? "/".concat(c()) : c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1639ob(C2245xo c2245xo, C0827cE c0827cE) {
        this(c2245xo, C2245xo.j(c0827cE), false);
        if (c2245xo == null) {
            a(3);
            throw null;
        }
        if (c0827cE != null) {
        } else {
            a(4);
            throw null;
        }
    }
}
