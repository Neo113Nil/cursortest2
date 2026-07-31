package yads;

import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class a13 {
    public static final /* synthetic */ a13[] c;
    public final String b;

    static {
        a13[] a13VarArr = {new a13(0, "VISIBLE", VastAttributes.VISIBLE), new a13(1, "DELAYED", "delayed")};
        c = a13VarArr;
        EnumEntriesKt.enumEntries(a13VarArr);
    }

    public a13(int i, String str, String str2) {
        this.b = str2;
    }

    public static a13 valueOf(String str) {
        return (a13) Enum.valueOf(a13.class, str);
    }

    public static a13[] values() {
        return (a13[]) c.clone();
    }
}
