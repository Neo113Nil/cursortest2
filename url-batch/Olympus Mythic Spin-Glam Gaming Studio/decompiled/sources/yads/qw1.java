package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class qw1 {
    public static final pw1 c;
    public static final qw1 d;
    public static final /* synthetic */ qw1[] e;
    public final String b;

    static {
        qw1 qw1Var = new qw1(0, "AD_VIDEO_COMPLETE", "advideocomplete");
        qw1 qw1Var2 = new qw1(1, "IMPRESSION_TRACKING_START", "impressionTrackingStart");
        qw1 qw1Var3 = new qw1(2, "IMPRESSION_TRACKING_SUCCESS", "impressionTrackingSuccess");
        qw1 qw1Var4 = new qw1(3, "CLOSE", "close");
        qw1 qw1Var5 = new qw1(4, "OPEN", "open");
        qw1 qw1Var6 = new qw1(5, "REWARDED_AD_COMPLETE", "rewardedAdComplete");
        qw1 qw1Var7 = new qw1(6, "USE_CUSTOM_CLOSE", "usecustomclose");
        qw1 qw1Var8 = new qw1(7, "UNSPECIFIED", "");
        d = qw1Var8;
        qw1[] qw1VarArr = {qw1Var, qw1Var2, qw1Var3, qw1Var4, qw1Var5, qw1Var6, qw1Var7, qw1Var8, new qw1(8, "AD_RENDERED", "adRendered")};
        e = qw1VarArr;
        EnumEntriesKt.enumEntries(qw1VarArr);
        c = new pw1();
    }

    public qw1(int i, String str, String str2) {
        this.b = str2;
    }

    public static qw1 valueOf(String str) {
        return (qw1) Enum.valueOf(qw1.class, str);
    }

    public static qw1[] values() {
        return (qw1[]) e.clone();
    }

    public final String a() {
        return this.b;
    }
}
