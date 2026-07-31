package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ue {
    public static final ue c;
    public static final ue d;
    public static final ue e;
    public static final ue f;
    public static final ue g;
    public static final ue h;
    public static final /* synthetic */ ue[] i;
    public final String b;

    static {
        ue ueVar = new ue(0, "AD_REQUEST", "ad_request");
        c = ueVar;
        ue ueVar2 = new ue(1, "AD_ATTEMPT", "ad_attempt");
        d = ueVar2;
        ue ueVar3 = new ue(2, "AD_FILLED_REQUEST", "ad_filled_request");
        e = ueVar3;
        ue ueVar4 = new ue(3, "AD_IMPRESSION", "ad_impression");
        f = ueVar4;
        ue ueVar5 = new ue(4, "AD_CLICK", "ad_click");
        g = ueVar5;
        ue ueVar6 = new ue(5, "AD_REWARD", "ad_reward");
        h = ueVar6;
        ue[] ueVarArr = {ueVar, ueVar2, ueVar3, ueVar4, ueVar5, ueVar6};
        i = ueVarArr;
        EnumEntriesKt.enumEntries(ueVarArr);
    }

    public ue(int i2, String str, String str2) {
        this.b = str2;
    }

    public static ue valueOf(String str) {
        return (ue) Enum.valueOf(ue.class, str);
    }

    public static ue[] values() {
        return (ue[]) i.clone();
    }
}
