package yads;

import com.facebook.share.internal.ShareConstants;
import com.ironsource.X3;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class gn1 {
    public static final gn1 c;
    public static final gn1 d;
    public static final gn1 e;
    public static final gn1 f;
    public static final gn1 g;
    public static final /* synthetic */ gn1[] h;
    public final String b;

    static {
        gn1 gn1Var = new gn1(0, "WEB_VIEW", X3.i.K);
        c = gn1Var;
        gn1 gn1Var2 = new gn1(1, ShareConstants.VIDEO_URL, "video");
        d = gn1Var2;
        gn1 gn1Var3 = new gn1(2, "MULTIBANNER", "multibanner");
        e = gn1Var3;
        gn1 gn1Var4 = new gn1(3, ShareConstants.IMAGE_URL, "image");
        f = gn1Var4;
        gn1 gn1Var5 = new gn1(4, "MEDIATION", "mediation");
        g = gn1Var5;
        gn1[] gn1VarArr = {gn1Var, gn1Var2, gn1Var3, gn1Var4, gn1Var5};
        h = gn1VarArr;
        EnumEntriesKt.enumEntries(gn1VarArr);
    }

    public gn1(int i, String str, String str2) {
        this.b = str2;
    }

    public static gn1 valueOf(String str) {
        return (gn1) Enum.valueOf(gn1.class, str);
    }

    public static gn1[] values() {
        return (gn1[]) h.clone();
    }
}
