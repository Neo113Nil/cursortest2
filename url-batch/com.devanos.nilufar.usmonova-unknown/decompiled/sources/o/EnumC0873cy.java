package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.cy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0873cy {
    public static final EnumC0873cy h;
    public static final EnumC0873cy i;
    public static final EnumC0873cy j;
    public static final /* synthetic */ EnumC0873cy[] k;

    static {
        EnumC0873cy enumC0873cy = new EnumC0873cy("RUNTIME", 0);
        h = enumC0873cy;
        EnumC0873cy enumC0873cy2 = new EnumC0873cy("BINARY", 1);
        i = enumC0873cy2;
        EnumC0873cy enumC0873cy3 = new EnumC0873cy("SOURCE", 2);
        j = enumC0873cy3;
        k = new EnumC0873cy[]{enumC0873cy, enumC0873cy2, enumC0873cy3};
    }

    public static EnumC0873cy valueOf(String str) {
        return (EnumC0873cy) Enum.valueOf(EnumC0873cy.class, str);
    }

    public static EnumC0873cy[] values() {
        return (EnumC0873cy[]) k.clone();
    }
}
