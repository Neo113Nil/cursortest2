package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class xl {
    public static final wl c;
    public static final xl d;
    public static final xl e;
    public static final /* synthetic */ xl[] f;
    public final String b;

    /* JADX WARN: Type inference failed for: r0v2, types: [yads.wl] */
    static {
        xl xlVar = new xl(0, "CONSTANT", "constant");
        xl xlVar2 = new xl(1, "RATIO", "ratio");
        xl xlVar3 = new xl(2, "SCREEN_BASED", "screen_based");
        xl xlVar4 = new xl(3, "SCREEN_ORIENTATION_BASED", "screen_orientation_based");
        d = xlVar4;
        xl xlVar5 = new xl(4, "MEDIATION", "mediation");
        e = xlVar5;
        xl[] xlVarArr = {xlVar, xlVar2, xlVar3, xlVar4, xlVar5};
        f = xlVarArr;
        EnumEntriesKt.enumEntries(xlVarArr);
        c = new Object() { // from class: yads.wl
        };
    }

    public xl(int i, String str, String str2) {
        this.b = str2;
    }

    public static xl valueOf(String str) {
        return (xl) Enum.valueOf(xl.class, str);
    }

    public static xl[] values() {
        return (xl[]) f.clone();
    }
}
