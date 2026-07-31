package yads;

import com.unity3d.ads.core.data.model.exception.GatewayException;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class k51 {
    public static final k51 c;
    public static final k51 d;
    public static final k51 e;
    public static final k51 f;
    public static final /* synthetic */ k51[] g;
    public final String b;

    static {
        k51 k51Var = new k51(0, "INITIALIZATION", GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION);
        c = k51Var;
        k51 k51Var2 = new k51(1, "AD", "ad");
        d = k51Var2;
        k51 k51Var3 = new k51(2, "INSTREAM", "instream");
        e = k51Var3;
        k51 k51Var4 = new k51(3, "BIDDER_TOKEN", "bidder_token");
        f = k51Var4;
        k51[] k51VarArr = {k51Var, k51Var2, k51Var3, k51Var4};
        g = k51VarArr;
        EnumEntriesKt.enumEntries(k51VarArr);
    }

    public k51(int i, String str, String str2) {
        this.b = str2;
    }

    public static k51 valueOf(String str) {
        return (k51) Enum.valueOf(k51.class, str);
    }

    public static k51[] values() {
        return (k51[]) g.clone();
    }
}
