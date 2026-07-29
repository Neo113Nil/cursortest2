package o;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: o.qv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1791qv {
    BOOLEAN(EnumC1423lJ.m, "boolean", "Z", "java.lang.Boolean"),
    CHAR(EnumC1423lJ.n, "char", "C", "java.lang.Character"),
    BYTE(EnumC1423lJ.f193o, "byte", "B", "java.lang.Byte"),
    SHORT(EnumC1423lJ.p, "short", "S", "java.lang.Short"),
    INT(EnumC1423lJ.q, "int", "I", "java.lang.Integer"),
    FLOAT(EnumC1423lJ.r, "float", "F", "java.lang.Float"),
    LONG(EnumC1423lJ.s, "long", "J", "java.lang.Long"),
    DOUBLE(EnumC1423lJ.t, "double", "D", "java.lang.Double");

    public static final HashSet t = new HashSet();
    public static final HashMap u = new HashMap();
    public static final EnumMap v = new EnumMap(EnumC1423lJ.class);
    public static final HashMap w = new HashMap();
    public final EnumC1423lJ h;
    public final String i;
    public final String j;
    public final C2245xo k;

    static {
        for (EnumC1791qv enumC1791qv : values()) {
            t.add(enumC1791qv.e());
            u.put(enumC1791qv.i, enumC1791qv);
            v.put((EnumMap) enumC1791qv.d(), (EnumC1423lJ) enumC1791qv);
            w.put(enumC1791qv.c(), enumC1791qv);
        }
    }

    EnumC1791qv(EnumC1423lJ enumC1423lJ, String str, String str2, String str3) {
        if (enumC1423lJ == null) {
            a(6);
            throw null;
        }
        this.h = enumC1423lJ;
        this.i = str;
        this.j = str2;
        this.k = new C2245xo(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Object[] objArr;
        if (i != 2 && i != 4) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i != 2 && i != 4) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                objArr = new Object[i2];
                switch (i) {
                    case 1:
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                        objArr[0] = "name";
                        break;
                    case 2:
                    case 4:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                        break;
                    case 3:
                        objArr[0] = "type";
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    case 8:
                        objArr[0] = "desc";
                        break;
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        objArr[0] = "primitiveType";
                        break;
                    case 9:
                        objArr[0] = "wrapperClassName";
                        break;
                    default:
                        objArr[0] = "className";
                        break;
                }
                if (i == 2 && i != 4) {
                    switch (i) {
                        case 10:
                            objArr[1] = "getPrimitiveType";
                            break;
                        case 11:
                            objArr[1] = "getJavaKeywordName";
                            break;
                        case 12:
                            objArr[1] = "getDesc";
                            break;
                        case 13:
                            objArr[1] = "getWrapperFqName";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                            break;
                    }
                } else {
                    objArr[1] = "get";
                }
                switch (i) {
                    case 1:
                    case 3:
                        objArr[2] = "get";
                        break;
                    case 2:
                    case 4:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                        objArr[2] = "getByDesc";
                        break;
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 8:
                    case 9:
                        objArr[2] = "<init>";
                        break;
                    default:
                        objArr[2] = "isWrapperClassName";
                        break;
                }
                String format = String.format(str, objArr);
                if (i != 2 && i != 4) {
                    switch (i) {
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i2 = 2;
            objArr = new Object[i2];
            switch (i) {
            }
            if (i == 2) {
            }
            objArr[1] = "get";
            switch (i) {
            }
            String format2 = String.format(str, objArr);
            if (i != 2) {
                switch (i) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 2) {
            switch (i) {
            }
            objArr = new Object[i2];
            switch (i) {
            }
            if (i == 2) {
            }
            objArr[1] = "get";
            switch (i) {
            }
            String format22 = String.format(str, objArr);
            if (i != 2) {
            }
            throw new IllegalStateException(format22);
        }
        i2 = 2;
        objArr = new Object[i2];
        switch (i) {
        }
        if (i == 2) {
        }
        objArr[1] = "get";
        switch (i) {
        }
        String format222 = String.format(str, objArr);
        if (i != 2) {
        }
        throw new IllegalStateException(format222);
    }

    public static EnumC1791qv b(String str) {
        EnumC1791qv enumC1791qv = (EnumC1791qv) u.get(str);
        if (enumC1791qv != null) {
            return enumC1791qv;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public final String c() {
        String str = this.j;
        if (str != null) {
            return str;
        }
        a(12);
        throw null;
    }

    public final EnumC1423lJ d() {
        EnumC1423lJ enumC1423lJ = this.h;
        if (enumC1423lJ != null) {
            return enumC1423lJ;
        }
        a(10);
        throw null;
    }

    public final C2245xo e() {
        C2245xo c2245xo = this.k;
        if (c2245xo != null) {
            return c2245xo;
        }
        a(13);
        throw null;
    }
}
