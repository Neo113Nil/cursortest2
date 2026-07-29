package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.Eb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0108Eb {
    public static final EnumC0108Eb h;
    public static final /* synthetic */ EnumC0108Eb[] i;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0108Eb EF0;

    static {
        EnumC0108Eb enumC0108Eb = new EnumC0108Eb("UNKNOWN", 0);
        EnumC0108Eb enumC0108Eb2 = new EnumC0108Eb("ANDROID_FIREBASE", 1);
        h = enumC0108Eb2;
        i = new EnumC0108Eb[]{enumC0108Eb, enumC0108Eb2};
    }

    public static EnumC0108Eb valueOf(String str) {
        return (EnumC0108Eb) Enum.valueOf(EnumC0108Eb.class, str);
    }

    public static EnumC0108Eb[] values() {
        return (EnumC0108Eb[]) i.clone();
    }
}
