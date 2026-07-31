package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class o31 {
    public static final o31 b;
    public static final o31 c;
    public static final o31 d;
    public static final o31 e;
    public static final /* synthetic */ o31[] f;

    static {
        o31 o31Var = new o31(0, "PNG");
        b = o31Var;
        o31 o31Var2 = new o31(1, "JPEG");
        c = o31Var2;
        o31 o31Var3 = new o31(2, "GIF");
        d = o31Var3;
        o31 o31Var4 = new o31(3, "UNKNOWN");
        e = o31Var4;
        o31[] o31VarArr = {o31Var, o31Var2, o31Var3, o31Var4};
        f = o31VarArr;
        EnumEntriesKt.enumEntries(o31VarArr);
    }

    public o31(int i, String str) {
    }

    public static o31 valueOf(String str) {
        return (o31) Enum.valueOf(o31.class, str);
    }

    public static o31[] values() {
        return (o31[]) f.clone();
    }
}
