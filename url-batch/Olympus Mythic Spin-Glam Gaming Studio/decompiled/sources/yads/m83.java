package yads;

import com.ironsource.Hb;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class m83 {
    public static final m83 c;
    public static final m83 d;
    public static final m83 e;
    public static final m83 f;
    public static final m83 g;
    public static final m83 h;
    public static final m83 i;
    public static final m83 j;
    public static final /* synthetic */ m83[] k;
    public final String b;

    static {
        m83 m83Var = new m83(0, "NETWORK", "network");
        c = m83Var;
        m83 m83Var2 = new m83(1, "TIMEOUT", "timeout");
        d = m83Var2;
        m83 m83Var3 = new m83(2, "SERVER", Hb.a);
        e = m83Var3;
        m83 m83Var4 = new m83(3, "CLIENT", "client");
        f = m83Var4;
        m83 m83Var5 = new m83(4, "SSL", "ssl");
        g = m83Var5;
        m83 m83Var6 = new m83(5, "PARSE", "parse");
        h = m83Var6;
        m83 m83Var7 = new m83(6, "AUTH", "auth");
        i = m83Var7;
        m83 m83Var8 = new m83(7, "UNKNOWN", "unknown");
        j = m83Var8;
        m83[] m83VarArr = {m83Var, m83Var2, m83Var3, m83Var4, m83Var5, m83Var6, m83Var7, m83Var8};
        k = m83VarArr;
        EnumEntriesKt.enumEntries(m83VarArr);
    }

    public m83(int i2, String str, String str2) {
        this.b = str2;
    }

    public static m83 valueOf(String str) {
        return (m83) Enum.valueOf(m83.class, str);
    }

    public static m83[] values() {
        return (m83[]) k.clone();
    }
}
