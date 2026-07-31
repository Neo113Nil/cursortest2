package yads;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class n11 {
    public static final n11 c;
    public static final /* synthetic */ n11[] d;
    public final String b;

    static {
        n11 n11Var = new n11(0, "ICON_VERTICAL_POSITION_TOP", ViewHierarchyConstants.DIMENSION_TOP_KEY);
        n11 n11Var2 = new n11(1, "ICON_VERTICAL_POSITION_BOTTOM", "bottom");
        n11 n11Var3 = new n11(2, "ICON_VERTICAL_POSITION_TOP_OFFSET", "topOffset");
        c = n11Var3;
        n11[] n11VarArr = {n11Var, n11Var2, n11Var3};
        d = n11VarArr;
        EnumEntriesKt.enumEntries(n11VarArr);
    }

    public n11(int i, String str, String str2) {
        this.b = str2;
    }

    public static n11 valueOf(String str) {
        return (n11) Enum.valueOf(n11.class, str);
    }

    public static n11[] values() {
        return (n11[]) d.clone();
    }
}
