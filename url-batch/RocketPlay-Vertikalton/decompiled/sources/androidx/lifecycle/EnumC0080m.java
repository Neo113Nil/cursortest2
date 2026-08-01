package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0080m {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0080m f1896a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0080m f1897b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0080m f1898c;
    public static final EnumC0080m d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0080m f1899e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0080m[] f1900f;

    static {
        EnumC0080m enumC0080m = new EnumC0080m("DESTROYED", 0);
        f1896a = enumC0080m;
        EnumC0080m enumC0080m2 = new EnumC0080m("INITIALIZED", 1);
        f1897b = enumC0080m2;
        EnumC0080m enumC0080m3 = new EnumC0080m("CREATED", 2);
        f1898c = enumC0080m3;
        EnumC0080m enumC0080m4 = new EnumC0080m("STARTED", 3);
        d = enumC0080m4;
        EnumC0080m enumC0080m5 = new EnumC0080m("RESUMED", 4);
        f1899e = enumC0080m5;
        f1900f = new EnumC0080m[]{enumC0080m, enumC0080m2, enumC0080m3, enumC0080m4, enumC0080m5};
    }

    public static EnumC0080m valueOf(String str) {
        return (EnumC0080m) Enum.valueOf(EnumC0080m.class, str);
    }

    public static EnumC0080m[] values() {
        return (EnumC0080m[]) f1900f.clone();
    }
}
