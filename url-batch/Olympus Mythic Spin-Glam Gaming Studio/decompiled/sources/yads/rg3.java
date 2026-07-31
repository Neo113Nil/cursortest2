package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class rg3 {
    public static final rg3 b;
    public static final rg3 c;
    public static final rg3 d;
    public static final rg3 e;
    public static final rg3 f;
    public static final rg3 g;
    public static final rg3 h;
    public static final rg3 i;
    public static final rg3 j;
    public static final rg3 k;
    public static final /* synthetic */ rg3[] l;

    static {
        rg3 rg3Var = new rg3(0, "INITIAL");
        b = rg3Var;
        rg3 rg3Var2 = new rg3(1, "PREPARING");
        c = rg3Var2;
        rg3 rg3Var3 = new rg3(2, "PREPARED");
        d = rg3Var3;
        rg3 rg3Var4 = new rg3(3, "PLAYING");
        e = rg3Var4;
        rg3 rg3Var5 = new rg3(4, "STOPPED");
        f = rg3Var5;
        rg3 rg3Var6 = new rg3(5, "FINISHED");
        g = rg3Var6;
        rg3 rg3Var7 = new rg3(6, "PAUSED");
        h = rg3Var7;
        rg3 rg3Var8 = new rg3(7, "BUFFERING");
        i = rg3Var8;
        rg3 rg3Var9 = new rg3(8, "PLAYING_ERROR");
        j = rg3Var9;
        rg3 rg3Var10 = new rg3(9, "PREPARING_ERROR");
        k = rg3Var10;
        rg3[] rg3VarArr = {rg3Var, rg3Var2, rg3Var3, rg3Var4, rg3Var5, rg3Var6, rg3Var7, rg3Var8, rg3Var9, rg3Var10};
        l = rg3VarArr;
        EnumEntriesKt.enumEntries(rg3VarArr);
    }

    public rg3(int i2, String str) {
    }

    public static rg3 valueOf(String str) {
        return (rg3) Enum.valueOf(rg3.class, str);
    }

    public static rg3[] values() {
        return (rg3[]) l.clone();
    }
}
