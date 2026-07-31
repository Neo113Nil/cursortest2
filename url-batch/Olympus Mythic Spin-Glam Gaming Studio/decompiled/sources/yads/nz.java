package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class nz {
    public static final nz b;
    public static final /* synthetic */ nz[] c;

    static {
        nz nzVar = new nz();
        b = nzVar;
        nz[] nzVarArr = {nzVar};
        c = nzVarArr;
        EnumEntriesKt.enumEntries(nzVarArr);
    }

    public static nz valueOf(String str) {
        return (nz) Enum.valueOf(nz.class, str);
    }

    public static nz[] values() {
        return (nz[]) c.clone();
    }
}
