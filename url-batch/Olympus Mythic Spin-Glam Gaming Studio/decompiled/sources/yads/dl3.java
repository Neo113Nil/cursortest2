package yads;

import java.util.Arrays;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class dl3 implements xc1 {
    public static final dl3 c;
    public static final dl3 d;
    public static final dl3 e;
    public static final /* synthetic */ dl3[] f;
    public final String b;

    static {
        dl3 dl3Var = new dl3(0, "DEFAULT", "default");
        c = dl3Var;
        dl3 dl3Var2 = new dl3(1, "LOADING", "loading");
        d = dl3Var2;
        dl3 dl3Var3 = new dl3(2, "HIDDEN", "hidden");
        e = dl3Var3;
        dl3[] dl3VarArr = {dl3Var, dl3Var2, dl3Var3};
        f = dl3VarArr;
        EnumEntriesKt.enumEntries(dl3VarArr);
    }

    public dl3(int i, String str, String str2) {
        this.b = str2;
    }

    public static dl3 valueOf(String str) {
        return (dl3) Enum.valueOf(dl3.class, str);
    }

    public static dl3[] values() {
        return (dl3[]) f.clone();
    }

    @Override // yads.xc1
    public final String a() {
        String quote = JSONObject.quote(this.b);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("state: %s", Arrays.copyOf(new Object[]{quote}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
