package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class v62 {
    public static final /* synthetic */ v62[] b;

    static {
        v62[] v62VarArr = {new v62()};
        b = v62VarArr;
        EnumEntriesKt.enumEntries(v62VarArr);
    }

    public static v62 valueOf(String str) {
        return (v62) Enum.valueOf(v62.class, str);
    }

    public static v62[] values() {
        return (v62[]) b.clone();
    }
}
