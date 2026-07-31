package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class m50 {
    public static final m50 c;
    public static final /* synthetic */ m50[] d;
    public final String b;

    static {
        m50 m50Var = new m50(0, "ERROR", "error");
        m50 m50Var2 = new m50(1, "MESSAGE", "message");
        c = m50Var2;
        m50[] m50VarArr = {m50Var, m50Var2};
        d = m50VarArr;
        EnumEntriesKt.enumEntries(m50VarArr);
    }

    public m50(int i, String str, String str2) {
        this.b = str2;
    }

    public static m50 valueOf(String str) {
        return (m50) Enum.valueOf(m50.class, str);
    }

    public static m50[] values() {
        return (m50[]) d.clone();
    }
}
