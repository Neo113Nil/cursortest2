package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class mg0 {
    public static final /* synthetic */ mg0[] b;

    static {
        mg0[] mg0VarArr = {new mg0(0, "DIV_KIT", "divkit"), new mg0(1, "LIGHT_BUNDLE", "lightBundle")};
        b = mg0VarArr;
        EnumEntriesKt.enumEntries(mg0VarArr);
    }

    public mg0(int i, String str, String str2) {
    }

    public static mg0 valueOf(String str) {
        return (mg0) Enum.valueOf(mg0.class, str);
    }

    public static mg0[] values() {
        return (mg0[]) b.clone();
    }
}
