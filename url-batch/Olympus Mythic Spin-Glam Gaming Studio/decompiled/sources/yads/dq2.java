package yads;

import com.facebook.share.internal.ShareConstants;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class dq2 {
    public static final dq2 c;
    public static final dq2 d;
    public static final dq2 e;
    public static final /* synthetic */ dq2[] f;
    public final String b;

    static {
        dq2 dq2Var = new dq2(0, "CONTENT", "content");
        c = dq2Var;
        dq2 dq2Var2 = new dq2(1, "APP_INSTALL", "app");
        d = dq2Var2;
        dq2 dq2Var3 = new dq2(2, ShareConstants.IMAGE_URL, "image");
        dq2 dq2Var4 = new dq2(3, "PRODUCT_PROMO", "productPromo");
        e = dq2Var4;
        dq2[] dq2VarArr = {dq2Var, dq2Var2, dq2Var3, dq2Var4};
        f = dq2VarArr;
        EnumEntriesKt.enumEntries(dq2VarArr);
    }

    public dq2(int i, String str, String str2) {
        this.b = str2;
    }

    public static dq2 valueOf(String str) {
        return (dq2) Enum.valueOf(dq2.class, str);
    }

    public static dq2[] values() {
        return (dq2[]) f.clone();
    }
}
