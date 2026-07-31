package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class bt {
    public static final bt b;
    public static final bt c;
    public static final /* synthetic */ bt[] d;

    static {
        bt btVar = new bt(0, "ACTIVE");
        b = btVar;
        bt btVar2 = new bt(1, "CANCELED");
        c = btVar2;
        bt[] btVarArr = {btVar, btVar2};
        d = btVarArr;
        EnumEntriesKt.enumEntries(btVarArr);
    }

    public bt(int i, String str) {
    }

    public static bt valueOf(String str) {
        return (bt) Enum.valueOf(bt.class, str);
    }

    public static bt[] values() {
        return (bt[]) d.clone();
    }
}
