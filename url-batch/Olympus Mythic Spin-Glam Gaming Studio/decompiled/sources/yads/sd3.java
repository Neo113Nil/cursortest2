package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class sd3 {
    public static final sd3 c;
    public static final sd3 d;
    public static final /* synthetic */ sd3[] e;
    public final int b;

    static {
        sd3 sd3Var = new sd3(0, 1, "VERIFICATION_REJECTED");
        sd3 sd3Var2 = new sd3(1, 2, "VERIFICATION_NOT_SUPPORTED");
        c = sd3Var2;
        sd3 sd3Var3 = new sd3(2, 3, "ERROR_RESOURCE_LOAD");
        d = sd3Var3;
        sd3[] sd3VarArr = {sd3Var, sd3Var2, sd3Var3};
        e = sd3VarArr;
        EnumEntriesKt.enumEntries(sd3VarArr);
    }

    public sd3(int i, int i2, String str) {
        this.b = i2;
    }

    public static sd3 valueOf(String str) {
        return (sd3) Enum.valueOf(sd3.class, str);
    }

    public static sd3[] values() {
        return (sd3[]) e.clone();
    }
}
