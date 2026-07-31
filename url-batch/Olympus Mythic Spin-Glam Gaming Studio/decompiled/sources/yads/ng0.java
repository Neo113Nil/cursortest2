package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class ng0 {
    public static final /* synthetic */ ng0[] b;

    static {
        ng0[] ng0VarArr = {new ng0(0, "AD", "ad"), new ng0(1, "PACK_SHOT", "pack_shot"), new ng0(2, "CLOSE_DIALOG", "close_dialog")};
        b = ng0VarArr;
        EnumEntriesKt.enumEntries(ng0VarArr);
    }

    public ng0(int i, String str, String str2) {
    }

    public static ng0 valueOf(String str) {
        return (ng0) Enum.valueOf(ng0.class, str);
    }

    public static ng0[] values() {
        return (ng0[]) b.clone();
    }
}
