package yads;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c7 {
    public static final b7 c;
    public static final /* synthetic */ c7[] d;
    public static final /* synthetic */ EnumEntries e;
    public final String b;

    static {
        c7[] c7VarArr = {new c7(0, "APPLOVIN", "applovin"), new c7(1, "APPLOVINMAX", "applovin_max"), new c7(2, "BIGOADS", "bigoads"), new c7(3, "CHARTBOOST", "chartboost"), new c7(4, "DIGITALTURBINE", "digitalturbine"), new c7(5, "GOOGLE", "admanager"), new c7(6, "ADMOB", "admob"), new c7(7, "INMOBI", "inmobi"), new c7(8, "IRONSOURCE", "ironsource"), new c7(9, "MINTEGRAL", "mintegral"), new c7(10, "MYTARGET", "mytarget"), new c7(11, "PANGLE", "pangle"), new c7(12, "TAPJOY", "tapjoy"), new c7(13, "UNITYADS", "unityads"), new c7(14, "VUNGLE", "vungle"), new c7(15, "YANDEX", "yandex")};
        d = c7VarArr;
        e = EnumEntriesKt.enumEntries(c7VarArr);
        c = new b7();
    }

    public c7(int i, String str, String str2) {
        this.b = str2;
    }

    public static c7 valueOf(String str) {
        return (c7) Enum.valueOf(c7.class, str);
    }

    public static c7[] values() {
        return (c7[]) d.clone();
    }
}
