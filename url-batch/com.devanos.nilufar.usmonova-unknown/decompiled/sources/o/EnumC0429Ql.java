package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: o.Ql, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0429Ql {
    public static final EnumC0429Ql i;
    public static final EnumC0429Ql j;
    public static final EnumC0429Ql[] k;
    public static final /* synthetic */ EnumC0429Ql[] l;
    public final int h;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0429Ql EF0;

    static {
        EnumC1592nu enumC1592nu = EnumC1592nu.DOUBLE;
        EnumC0429Ql enumC0429Ql = new EnumC0429Ql("DOUBLE", 0, 0, 1, enumC1592nu);
        EnumC1592nu enumC1592nu2 = EnumC1592nu.FLOAT;
        EnumC0429Ql enumC0429Ql2 = new EnumC0429Ql("FLOAT", 1, 1, 1, enumC1592nu2);
        EnumC1592nu enumC1592nu3 = EnumC1592nu.LONG;
        EnumC0429Ql enumC0429Ql3 = new EnumC0429Ql("INT64", 2, 2, 1, enumC1592nu3);
        EnumC0429Ql enumC0429Ql4 = new EnumC0429Ql("UINT64", 3, 3, 1, enumC1592nu3);
        EnumC1592nu enumC1592nu4 = EnumC1592nu.INT;
        EnumC0429Ql enumC0429Ql5 = new EnumC0429Ql("INT32", 4, 4, 1, enumC1592nu4);
        EnumC0429Ql enumC0429Ql6 = new EnumC0429Ql("FIXED64", 5, 5, 1, enumC1592nu3);
        EnumC0429Ql enumC0429Ql7 = new EnumC0429Ql("FIXED32", 6, 6, 1, enumC1592nu4);
        EnumC1592nu enumC1592nu5 = EnumC1592nu.BOOLEAN;
        EnumC0429Ql enumC0429Ql8 = new EnumC0429Ql("BOOL", 7, 7, 1, enumC1592nu5);
        EnumC1592nu enumC1592nu6 = EnumC1592nu.STRING;
        EnumC0429Ql enumC0429Ql9 = new EnumC0429Ql("STRING", 8, 8, 1, enumC1592nu6);
        EnumC1592nu enumC1592nu7 = EnumC1592nu.MESSAGE;
        EnumC0429Ql enumC0429Ql10 = new EnumC0429Ql("MESSAGE", 9, 9, 1, enumC1592nu7);
        EnumC1592nu enumC1592nu8 = EnumC1592nu.BYTE_STRING;
        EnumC0429Ql enumC0429Ql11 = new EnumC0429Ql("BYTES", 10, 10, 1, enumC1592nu8);
        EnumC0429Ql enumC0429Ql12 = new EnumC0429Ql("UINT32", 11, 11, 1, enumC1592nu4);
        EnumC1592nu enumC1592nu9 = EnumC1592nu.ENUM;
        EnumC0429Ql enumC0429Ql13 = new EnumC0429Ql("ENUM", 12, 12, 1, enumC1592nu9);
        EnumC0429Ql enumC0429Ql14 = new EnumC0429Ql("SFIXED32", 13, 13, 1, enumC1592nu4);
        EnumC0429Ql enumC0429Ql15 = new EnumC0429Ql("SFIXED64", 14, 14, 1, enumC1592nu3);
        EnumC0429Ql enumC0429Ql16 = new EnumC0429Ql("SINT32", 15, 15, 1, enumC1592nu4);
        EnumC0429Ql enumC0429Ql17 = new EnumC0429Ql("SINT64", 16, 16, 1, enumC1592nu3);
        EnumC0429Ql enumC0429Ql18 = new EnumC0429Ql("GROUP", 17, 17, 1, enumC1592nu7);
        EnumC0429Ql enumC0429Ql19 = new EnumC0429Ql("DOUBLE_LIST", 18, 18, 2, enumC1592nu);
        EnumC0429Ql enumC0429Ql20 = new EnumC0429Ql("FLOAT_LIST", 19, 19, 2, enumC1592nu2);
        EnumC0429Ql enumC0429Ql21 = new EnumC0429Ql("INT64_LIST", 20, 20, 2, enumC1592nu3);
        EnumC0429Ql enumC0429Ql22 = new EnumC0429Ql("UINT64_LIST", 21, 21, 2, enumC1592nu3);
        EnumC0429Ql enumC0429Ql23 = new EnumC0429Ql("INT32_LIST", 22, 22, 2, enumC1592nu4);
        EnumC0429Ql enumC0429Ql24 = new EnumC0429Ql("FIXED64_LIST", 23, 23, 2, enumC1592nu3);
        EnumC0429Ql enumC0429Ql25 = new EnumC0429Ql("FIXED32_LIST", 24, 24, 2, enumC1592nu4);
        EnumC0429Ql enumC0429Ql26 = new EnumC0429Ql("BOOL_LIST", 25, 25, 2, enumC1592nu5);
        EnumC0429Ql enumC0429Ql27 = new EnumC0429Ql("STRING_LIST", 26, 26, 2, enumC1592nu6);
        EnumC0429Ql enumC0429Ql28 = new EnumC0429Ql("MESSAGE_LIST", 27, 27, 2, enumC1592nu7);
        EnumC0429Ql enumC0429Ql29 = new EnumC0429Ql("BYTES_LIST", 28, 28, 2, enumC1592nu8);
        EnumC0429Ql enumC0429Ql30 = new EnumC0429Ql("UINT32_LIST", 29, 29, 2, enumC1592nu4);
        EnumC0429Ql enumC0429Ql31 = new EnumC0429Ql("ENUM_LIST", 30, 30, 2, enumC1592nu9);
        EnumC0429Ql enumC0429Ql32 = new EnumC0429Ql("SFIXED32_LIST", 31, 31, 2, enumC1592nu4);
        EnumC0429Ql enumC0429Ql33 = new EnumC0429Ql("SFIXED64_LIST", 32, 32, 2, enumC1592nu3);
        EnumC0429Ql enumC0429Ql34 = new EnumC0429Ql("SINT32_LIST", 33, 33, 2, enumC1592nu4);
        EnumC0429Ql enumC0429Ql35 = new EnumC0429Ql("SINT64_LIST", 34, 34, 2, enumC1592nu3);
        EnumC0429Ql enumC0429Ql36 = new EnumC0429Ql("DOUBLE_LIST_PACKED", 35, 35, 3, enumC1592nu);
        i = enumC0429Ql36;
        EnumC0429Ql enumC0429Ql37 = new EnumC0429Ql("FLOAT_LIST_PACKED", 36, 36, 3, enumC1592nu2);
        EnumC0429Ql enumC0429Ql38 = new EnumC0429Ql("INT64_LIST_PACKED", 37, 37, 3, enumC1592nu3);
        EnumC0429Ql enumC0429Ql39 = new EnumC0429Ql("UINT64_LIST_PACKED", 38, 38, 3, enumC1592nu3);
        EnumC0429Ql enumC0429Ql40 = new EnumC0429Ql("INT32_LIST_PACKED", 39, 39, 3, enumC1592nu4);
        EnumC0429Ql enumC0429Ql41 = new EnumC0429Ql("FIXED64_LIST_PACKED", 40, 40, 3, enumC1592nu3);
        EnumC0429Ql enumC0429Ql42 = new EnumC0429Ql("FIXED32_LIST_PACKED", 41, 41, 3, enumC1592nu4);
        EnumC0429Ql enumC0429Ql43 = new EnumC0429Ql("BOOL_LIST_PACKED", 42, 42, 3, enumC1592nu5);
        EnumC0429Ql enumC0429Ql44 = new EnumC0429Ql("UINT32_LIST_PACKED", 43, 43, 3, enumC1592nu4);
        EnumC0429Ql enumC0429Ql45 = new EnumC0429Ql("ENUM_LIST_PACKED", 44, 44, 3, enumC1592nu9);
        EnumC0429Ql enumC0429Ql46 = new EnumC0429Ql("SFIXED32_LIST_PACKED", 45, 45, 3, enumC1592nu4);
        EnumC0429Ql enumC0429Ql47 = new EnumC0429Ql("SFIXED64_LIST_PACKED", 46, 46, 3, enumC1592nu3);
        EnumC0429Ql enumC0429Ql48 = new EnumC0429Ql("SINT32_LIST_PACKED", 47, 47, 3, enumC1592nu4);
        EnumC0429Ql enumC0429Ql49 = new EnumC0429Ql("SINT64_LIST_PACKED", 48, 48, 3, enumC1592nu3);
        j = enumC0429Ql49;
        l = new EnumC0429Ql[]{enumC0429Ql, enumC0429Ql2, enumC0429Ql3, enumC0429Ql4, enumC0429Ql5, enumC0429Ql6, enumC0429Ql7, enumC0429Ql8, enumC0429Ql9, enumC0429Ql10, enumC0429Ql11, enumC0429Ql12, enumC0429Ql13, enumC0429Ql14, enumC0429Ql15, enumC0429Ql16, enumC0429Ql17, enumC0429Ql18, enumC0429Ql19, enumC0429Ql20, enumC0429Ql21, enumC0429Ql22, enumC0429Ql23, enumC0429Ql24, enumC0429Ql25, enumC0429Ql26, enumC0429Ql27, enumC0429Ql28, enumC0429Ql29, enumC0429Ql30, enumC0429Ql31, enumC0429Ql32, enumC0429Ql33, enumC0429Ql34, enumC0429Ql35, enumC0429Ql36, enumC0429Ql37, enumC0429Ql38, enumC0429Ql39, enumC0429Ql40, enumC0429Ql41, enumC0429Ql42, enumC0429Ql43, enumC0429Ql44, enumC0429Ql45, enumC0429Ql46, enumC0429Ql47, enumC0429Ql48, enumC0429Ql49, new EnumC0429Ql("GROUP_LIST", 49, 49, 2, enumC1592nu7), new EnumC0429Ql("MAP", 50, 50, 4, EnumC1592nu.VOID)};
        EnumC0429Ql[] values = values();
        k = new EnumC0429Ql[values.length];
        for (EnumC0429Ql enumC0429Ql50 : values) {
            k[enumC0429Ql50.h] = enumC0429Ql50;
        }
    }

    public EnumC0429Ql(String str, int i2, int i3, int i4, EnumC1592nu enumC1592nu) {
        this.h = i3;
        int v = AbstractC1888sN.v(i4);
        if (v == 1) {
            enumC1592nu.getClass();
        } else if (v == 3) {
            enumC1592nu.getClass();
        }
        if (i4 == 1) {
            enumC1592nu.ordinal();
        }
    }

    public static EnumC0429Ql valueOf(String str) {
        return (EnumC0429Ql) Enum.valueOf(EnumC0429Ql.class, str);
    }

    public static EnumC0429Ql[] values() {
        return (EnumC0429Ql[]) l.clone();
    }
}
