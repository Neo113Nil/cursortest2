package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class yt2 {
    public static final yt2 c;
    public static final yt2 d;
    public static final /* synthetic */ yt2[] e;
    public final String b;

    static {
        yt2 yt2Var = new yt2(0, "CONFIGURATION_FAILED", "configuration_failed");
        c = yt2Var;
        yt2 yt2Var2 = new yt2(1, "TIMEOUT", "timeout");
        d = yt2Var2;
        yt2[] yt2VarArr = {yt2Var, yt2Var2};
        e = yt2VarArr;
        EnumEntriesKt.enumEntries(yt2VarArr);
    }

    public yt2(int i, String str, String str2) {
        this.b = str2;
    }

    public static yt2 valueOf(String str) {
        return (yt2) Enum.valueOf(yt2.class, str);
    }

    public static yt2[] values() {
        return (yt2[]) e.clone();
    }
}
