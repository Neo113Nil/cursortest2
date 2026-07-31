package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class k11 {
    public static final k11 c;
    public static final /* synthetic */ k11[] d;
    public final String b;

    static {
        k11 k11Var = new k11(0, "ICON_HORIZONTAL_POSITION_LEFT", "left");
        k11 k11Var2 = new k11(1, "ICON_HORIZONTAL_POSITION_RIGHT", "right");
        k11 k11Var3 = new k11(2, "ICON_HORIZONTAL_POSITION_LEFT_OFFSET", "leftOffset");
        c = k11Var3;
        k11[] k11VarArr = {k11Var, k11Var2, k11Var3};
        d = k11VarArr;
        EnumEntriesKt.enumEntries(k11VarArr);
    }

    public k11(int i, String str, String str2) {
        this.b = str2;
    }

    public static k11 valueOf(String str) {
        return (k11) Enum.valueOf(k11.class, str);
    }

    public static k11[] values() {
        return (k11[]) d.clone();
    }
}
