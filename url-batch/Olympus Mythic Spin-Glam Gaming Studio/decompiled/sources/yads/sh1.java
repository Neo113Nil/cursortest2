package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class sh1 {
    public static final sh1 c;
    public static final sh1 d;
    public static final sh1 e;
    public static final sh1 f;
    public static final sh1 g;
    public static final sh1 h;
    public static final sh1 i;
    public static final sh1 j;
    public static final /* synthetic */ sh1[] k;
    public final String b;

    static {
        sh1 sh1Var = new sh1(0, "AUTOMATIC_SDK_INITIALIZATION", com.safedk.android.utils.h.y + ".AUTOMATIC_SDK_INITIALIZATION");
        c = sh1Var;
        sh1 sh1Var2 = new sh1(1, "AGE_RESTRICTED_USER", com.safedk.android.utils.h.y + ".AGE_RESTRICTED_USER");
        d = sh1Var2;
        sh1 sh1Var3 = new sh1(2, "ENABLE_LOGGING", com.safedk.android.utils.h.y + ".ENABLE_LOGGING");
        e = sh1Var3;
        sh1 sh1Var4 = new sh1(3, "AD_HOST", com.safedk.android.utils.h.y + ".AD_HOST");
        f = sh1Var4;
        sh1 sh1Var5 = new sh1(4, "FALLBACK_HOSTS", com.safedk.android.utils.h.y + ".FALLBACK_HOSTS");
        g = sh1Var5;
        sh1 sh1Var6 = new sh1(5, "APPMETRICA_EASY_INTEGRATION_ENABLED", com.safedk.android.utils.h.y + ".APPMETRICA_EASY_INTEGRATION_ENABLED");
        h = sh1Var6;
        sh1 sh1Var7 = new sh1(6, "APPMETRICA_ANALYTICS_ENABLED", com.safedk.android.utils.h.y + ".APPMETRICA_ANALYTICS_ENABLED");
        i = sh1Var7;
        sh1 sh1Var8 = new sh1(7, "SINGLE_ASSEMBLY_ENABLED", com.safedk.android.utils.h.y + ".SINGLE_ASSEMBLY_ENABLED");
        j = sh1Var8;
        sh1[] sh1VarArr = {sh1Var, sh1Var2, sh1Var3, sh1Var4, sh1Var5, sh1Var6, sh1Var7, sh1Var8};
        k = sh1VarArr;
        EnumEntriesKt.enumEntries(sh1VarArr);
    }

    public sh1(int i2, String str, String str2) {
        this.b = str2;
    }

    public static sh1 valueOf(String str) {
        return (sh1) Enum.valueOf(sh1.class, str);
    }

    public static sh1[] values() {
        return (sh1[]) k.clone();
    }
}
