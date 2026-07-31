package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class tg2 {
    public static final tg2 d;
    public static final tg2 e;
    public static final tg2 f;
    public static final tg2 g;
    public static final /* synthetic */ tg2[] h;
    public final int b;
    public final String c;

    static {
        tg2 tg2Var = new tg2(0, 1001, "TIMEOUT", "The request failed to load due to a timeout");
        d = tg2Var;
        tg2 tg2Var2 = new tg2(1, 1002, "INVALID_CONFIGURATION", "The provided configuration is invalid");
        e = tg2Var2;
        tg2 tg2Var3 = new tg2(2, 1003, "EMPTY_MEDIATION_DATA", "No mediation data was received. Possibly, Client Bidding adapters are not connected");
        f = tg2Var3;
        tg2 tg2Var4 = new tg2(3, 1004, "INVALID_FETCHED_DATA", "The fetched data is invalid");
        g = tg2Var4;
        tg2[] tg2VarArr = {tg2Var, tg2Var2, tg2Var3, tg2Var4};
        h = tg2VarArr;
        EnumEntriesKt.enumEntries(tg2VarArr);
    }

    public tg2(int i, int i2, String str, String str2) {
        this.b = i2;
        this.c = str2;
    }

    public static tg2 valueOf(String str) {
        return (tg2) Enum.valueOf(tg2.class, str);
    }

    public static tg2[] values() {
        return (tg2[]) h.clone();
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }
}
