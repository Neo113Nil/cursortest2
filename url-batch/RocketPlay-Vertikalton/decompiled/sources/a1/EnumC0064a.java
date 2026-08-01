package a1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0064a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0064a f1630a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0064a[] f1631b;

    static {
        EnumC0064a enumC0064a = new EnumC0064a("COROUTINE_SUSPENDED", 0);
        f1630a = enumC0064a;
        f1631b = new EnumC0064a[]{enumC0064a, new EnumC0064a("UNDECIDED", 1), new EnumC0064a("RESUMED", 2)};
    }

    public static EnumC0064a valueOf(String str) {
        return (EnumC0064a) Enum.valueOf(EnumC0064a.class, str);
    }

    public static EnumC0064a[] values() {
        return (EnumC0064a[]) f1631b.clone();
    }
}
