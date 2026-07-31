package yads;

import com.yandex.div.core.ScrollDirection;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class y03 {
    public static final y03 c;
    public static final /* synthetic */ y03[] d;
    public final String b;

    static {
        y03 y03Var = new y03(0, "NEXT", ScrollDirection.NEXT);
        y03 y03Var2 = new y03(1, "LAST", "last");
        c = y03Var2;
        y03[] y03VarArr = {y03Var, y03Var2};
        d = y03VarArr;
        EnumEntriesKt.enumEntries(y03VarArr);
    }

    public y03(int i, String str, String str2) {
        this.b = str2;
    }

    public static y03 valueOf(String str) {
        return (y03) Enum.valueOf(y03.class, str);
    }

    public static y03[] values() {
        return (y03[]) d.clone();
    }
}
