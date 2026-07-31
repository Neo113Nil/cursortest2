package yads;

import com.my.target.common.webform.WebFormSetViewSettings;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class ip2 {
    public static final ip2 c;
    public static final ip2 d;
    public static final /* synthetic */ ip2[] e;
    public final String b;

    static {
        ip2 ip2Var = new ip2(0, "LIGHT", WebFormSetViewSettings.StatusBarStyle.LIGHT);
        c = ip2Var;
        ip2 ip2Var2 = new ip2(1, "DARK", WebFormSetViewSettings.StatusBarStyle.DARK);
        d = ip2Var2;
        ip2[] ip2VarArr = {ip2Var, ip2Var2};
        e = ip2VarArr;
        EnumEntriesKt.enumEntries(ip2VarArr);
    }

    public ip2(int i, String str, String str2) {
        this.b = str2;
    }

    public static ip2 valueOf(String str) {
        return (ip2) Enum.valueOf(ip2.class, str);
    }

    public static ip2[] values() {
        return (ip2[]) e.clone();
    }
}
