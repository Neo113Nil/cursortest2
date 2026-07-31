package yads;

import com.ironsource.X3;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f1 {
    public static final f1 c;
    public static final f1 d;
    public static final f1 e;
    public static final /* synthetic */ f1[] f;
    public final String b;

    static {
        f1 f1Var = new f1(0, "BROWSER", "browser");
        c = f1Var;
        f1 f1Var2 = new f1(1, "WEBVIEW", X3.i.K);
        d = f1Var2;
        f1 f1Var3 = new f1(2, com.ironsource.mediationsdk.j.f, "custom");
        e = f1Var3;
        f1[] f1VarArr = {f1Var, f1Var2, f1Var3};
        f = f1VarArr;
        EnumEntriesKt.enumEntries(f1VarArr);
    }

    public f1(int i, String str, String str2) {
        this.b = str2;
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) f.clone();
    }
}
