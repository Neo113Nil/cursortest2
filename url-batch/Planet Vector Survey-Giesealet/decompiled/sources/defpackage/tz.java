package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class tz {
    public static final tz d;
    public static final tz e;
    public static final tz f;
    public static final tz g;
    public static final /* synthetic */ tz[] h;

    static {
        tz tzVar = new tz("LookaheadMeasurement", 0);
        d = tzVar;
        tz tzVar2 = new tz("LookaheadPlacement", 1);
        e = tzVar2;
        tz tzVar3 = new tz("Measurement", 2);
        f = tzVar3;
        tz tzVar4 = new tz("Placement", 3);
        g = tzVar4;
        h = new tz[]{tzVar, tzVar2, tzVar3, tzVar4};
    }

    public static tz valueOf(String str) {
        return (tz) Enum.valueOf(tz.class, str);
    }

    public static tz[] values() {
        return (tz[]) h.clone();
    }
}
