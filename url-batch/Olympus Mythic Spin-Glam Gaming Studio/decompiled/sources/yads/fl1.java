package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class fl1 {
    public static final /* synthetic */ fl1[] c;
    public final String b;

    static {
        fl1[] fl1VarArr = {new fl1(0, "STREAMING", "streaming"), new fl1(1, "PROGRESSIVE", "progressive")};
        c = fl1VarArr;
        EnumEntriesKt.enumEntries(fl1VarArr);
    }

    public fl1(int i, String str, String str2) {
        this.b = str2;
    }

    public static fl1 valueOf(String str) {
        return (fl1) Enum.valueOf(fl1.class, str);
    }

    public static fl1[] values() {
        return (fl1[]) c.clone();
    }
}
