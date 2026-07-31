package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class kg0 {
    public static final /* synthetic */ kg0[] b;

    static {
        kg0[] kg0VarArr = {new kg0()};
        b = kg0VarArr;
        EnumEntriesKt.enumEntries(kg0VarArr);
    }

    public static kg0 valueOf(String str) {
        return (kg0) Enum.valueOf(kg0.class, str);
    }

    public static kg0[] values() {
        return (kg0[]) b.clone();
    }
}
