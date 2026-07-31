package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class uy {
    public static final uy c;
    public static final uy d;
    public static final /* synthetic */ uy[] e;
    public final String b;

    static {
        uy uyVar = new uy(0, "NETWORK", "network");
        c = uyVar;
        uy uyVar2 = new uy(1, "CACHE", "cache");
        d = uyVar2;
        uy[] uyVarArr = {uyVar, uyVar2};
        e = uyVarArr;
        EnumEntriesKt.enumEntries(uyVarArr);
    }

    public uy(int i, String str, String str2) {
        this.b = str2;
    }

    public static uy valueOf(String str) {
        return (uy) Enum.valueOf(uy.class, str);
    }

    public static uy[] values() {
        return (uy[]) e.clone();
    }
}
