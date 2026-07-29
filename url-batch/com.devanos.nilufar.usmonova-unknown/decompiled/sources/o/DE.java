package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class DE {
    public static final DE h;
    public static final DE i;
    public static final DE j;
    public static final DE k;
    public static final DE l;
    public static final DE m;
    public static final DE n;

    /* renamed from: o, reason: collision with root package name */
    public static final DE f27o;
    public static final /* synthetic */ DE[] p;

    /* JADX INFO: Fake field, exist only in values array */
    DE EF1;

    static {
        DE de = new DE("FROM_IDE", 0);
        DE de2 = new DE("FROM_BACKEND", 1);
        DE de3 = new DE("FROM_TEST", 2);
        DE de4 = new DE("FROM_BUILTINS", 3);
        h = de4;
        DE de5 = new DE("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        DE de6 = new DE("WHEN_CHECK_OVERRIDES", 5);
        DE de7 = new DE("FOR_SCRIPT", 6);
        DE de8 = new DE("FROM_REFLECTION", 7);
        i = de8;
        DE de9 = new DE("WHEN_RESOLVE_DECLARATION", 8);
        DE de10 = new DE("WHEN_GET_DECLARATION_SCOPE", 9);
        DE de11 = new DE("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        DE de12 = new DE("FOR_ALREADY_TRACKED", 11);
        j = de12;
        DE de13 = new DE("WHEN_GET_ALL_DESCRIPTORS", 12);
        k = de13;
        DE de14 = new DE("WHEN_TYPING", 13);
        DE de15 = new DE("WHEN_GET_SUPER_MEMBERS", 14);
        l = de15;
        DE de16 = new DE("FOR_NON_TRACKED_SCOPE", 15);
        m = de16;
        DE de17 = new DE("FROM_SYNTHETIC_SCOPE", 16);
        DE de18 = new DE("FROM_DESERIALIZATION", 17);
        n = de18;
        DE de19 = new DE("FROM_JAVA_LOADER", 18);
        f27o = de19;
        p = new DE[]{de, de2, de3, de4, de5, de6, de7, de8, de9, de10, de11, de12, de13, de14, de15, de16, de17, de18, de19, new DE("WHEN_GET_LOCAL_VARIABLE", 19), new DE("WHEN_FIND_BY_FQNAME", 20), new DE("WHEN_GET_COMPANION_OBJECT", 21), new DE("FOR_DEFAULT_IMPORTS", 22)};
    }

    public static DE valueOf(String str) {
        return (DE) Enum.valueOf(DE.class, str);
    }

    public static DE[] values() {
        return (DE[]) p.clone();
    }
}
