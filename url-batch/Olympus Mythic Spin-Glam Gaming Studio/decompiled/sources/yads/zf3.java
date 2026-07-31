package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class zf3 {
    public static final zf3 b;
    public static final zf3 c;
    public static final zf3 d;
    public static final zf3 e;
    public static final /* synthetic */ zf3[] f;

    static {
        zf3 zf3Var = new zf3(0, "PREROLL");
        b = zf3Var;
        zf3 zf3Var2 = new zf3(1, "MIDROLL");
        c = zf3Var2;
        zf3 zf3Var3 = new zf3(2, "POSTROLL");
        d = zf3Var3;
        zf3 zf3Var4 = new zf3(3, "STANDALONE");
        e = zf3Var4;
        zf3[] zf3VarArr = {zf3Var, zf3Var2, zf3Var3, zf3Var4};
        f = zf3VarArr;
        EnumEntriesKt.enumEntries(zf3VarArr);
    }

    public zf3(int i, String str) {
    }

    public static zf3 valueOf(String str) {
        return (zf3) Enum.valueOf(zf3.class, str);
    }

    public static zf3[] values() {
        return (zf3[]) f.clone();
    }
}
