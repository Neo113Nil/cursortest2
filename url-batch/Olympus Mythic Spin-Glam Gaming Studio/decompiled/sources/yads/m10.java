package yads;

import com.facebook.share.internal.ShareConstants;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m10 {
    public static final m10 b;
    public static final m10 c;
    public static final /* synthetic */ m10[] d;

    static {
        m10 m10Var = new m10(0, "TEXT");
        b = m10Var;
        m10 m10Var2 = new m10(1, ShareConstants.IMAGE_URL);
        c = m10Var2;
        m10[] m10VarArr = {m10Var, m10Var2};
        d = m10VarArr;
        EnumEntriesKt.enumEntries(m10VarArr);
    }

    public m10(int i, String str) {
    }

    public static m10 valueOf(String str) {
        return (m10) Enum.valueOf(m10.class, str);
    }

    public static m10[] values() {
        return (m10[]) d.clone();
    }
}
