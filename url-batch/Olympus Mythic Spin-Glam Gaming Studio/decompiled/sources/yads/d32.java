package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d32 {
    public static final d32 c;
    public static final /* synthetic */ d32[] d;
    public final String b;

    static {
        d32 d32Var = new d32(0, com.ironsource.mediationsdk.j.f, "custom");
        c = d32Var;
        d32[] d32VarArr = {d32Var, new d32(1, "TEMPLATE", "template")};
        d = d32VarArr;
        EnumEntriesKt.enumEntries(d32VarArr);
    }

    public d32(int i, String str, String str2) {
        this.b = str2;
    }

    public static d32 valueOf(String str) {
        return (d32) Enum.valueOf(d32.class, str);
    }

    public static d32[] values() {
        return (d32[]) d.clone();
    }
}
