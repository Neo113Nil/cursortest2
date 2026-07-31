package yads;

import com.facebook.internal.AnalyticsEvents;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k6 {
    public static final k6 c;
    public static final /* synthetic */ k6[] d;
    public final String b;

    static {
        k6 k6Var = new k6(0, "AUTOMATIC", AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC);
        k6 k6Var2 = new k6(1, "MANUAL", "manual");
        c = k6Var2;
        k6[] k6VarArr = {k6Var, k6Var2};
        d = k6VarArr;
        EnumEntriesKt.enumEntries(k6VarArr);
    }

    public k6(int i, String str, String str2) {
        this.b = str2;
    }

    public static k6 valueOf(String str) {
        return (k6) Enum.valueOf(k6.class, str);
    }

    public static k6[] values() {
        return (k6[]) d.clone();
    }
}
