package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class vf {
    public static final vf b;
    public static final vf c;
    public static final vf d;
    public static final /* synthetic */ vf[] e;

    static {
        vf vfVar = new vf(0, "UNKNOWN");
        b = vfVar;
        vf vfVar2 = new vf(1, "NETWORK");
        c = vfVar2;
        vf vfVar3 = new vf(2, "INVALID_RESPONSE");
        d = vfVar3;
        vf[] vfVarArr = {vfVar, vfVar2, vfVar3};
        e = vfVarArr;
        EnumEntriesKt.enumEntries(vfVarArr);
    }

    public vf(int i, String str) {
    }

    public static vf valueOf(String str) {
        return (vf) Enum.valueOf(vf.class, str);
    }

    public static vf[] values() {
        return (vf[]) e.clone();
    }
}
