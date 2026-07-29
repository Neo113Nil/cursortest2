package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.vx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2122vx {
    public static final EnumC2122vx h;
    public static final EnumC2122vx i;
    public static final EnumC2122vx j;
    public static final EnumC2122vx k;
    public static final /* synthetic */ EnumC2122vx[] l;

    static {
        EnumC2122vx enumC2122vx = new EnumC2122vx("PUBLIC", 0);
        h = enumC2122vx;
        EnumC2122vx enumC2122vx2 = new EnumC2122vx("PROTECTED", 1);
        i = enumC2122vx2;
        EnumC2122vx enumC2122vx3 = new EnumC2122vx("INTERNAL", 2);
        j = enumC2122vx3;
        EnumC2122vx enumC2122vx4 = new EnumC2122vx("PRIVATE", 3);
        k = enumC2122vx4;
        l = new EnumC2122vx[]{enumC2122vx, enumC2122vx2, enumC2122vx3, enumC2122vx4};
    }

    public static EnumC2122vx valueOf(String str) {
        return (EnumC2122vx) Enum.valueOf(EnumC2122vx.class, str);
    }

    public static EnumC2122vx[] values() {
        return (EnumC2122vx[]) l.clone();
    }
}
