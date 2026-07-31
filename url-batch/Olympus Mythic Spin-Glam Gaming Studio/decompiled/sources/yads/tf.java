package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class tf {
    public static final tf b;
    public static final tf c;
    public static final tf d;
    public static final /* synthetic */ tf[] e;

    static {
        tf tfVar = new tf(0, "UNKNOWN");
        b = tfVar;
        tf tfVar2 = new tf(1, "NETWORK");
        c = tfVar2;
        tf tfVar3 = new tf(2, "INVALID_RESPONSE");
        d = tfVar3;
        tf[] tfVarArr = {tfVar, tfVar2, tfVar3};
        e = tfVarArr;
        EnumEntriesKt.enumEntries(tfVarArr);
    }

    public tf(int i, String str) {
    }

    public static tf valueOf(String str) {
        return (tf) Enum.valueOf(tf.class, str);
    }

    public static tf[] values() {
        return (tf[]) e.clone();
    }
}
