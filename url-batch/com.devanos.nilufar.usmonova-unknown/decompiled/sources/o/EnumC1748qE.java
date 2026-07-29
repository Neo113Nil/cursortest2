package o;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.qE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1748qE {
    public static final SparseArray h;
    public static final /* synthetic */ EnumC1748qE[] i;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1748qE EF1;

    static {
        EnumC1748qE enumC1748qE = new EnumC1748qE("UNKNOWN_MOBILE_SUBTYPE", 0);
        EnumC1748qE enumC1748qE2 = new EnumC1748qE("GPRS", 1);
        EnumC1748qE enumC1748qE3 = new EnumC1748qE("EDGE", 2);
        EnumC1748qE enumC1748qE4 = new EnumC1748qE("UMTS", 3);
        EnumC1748qE enumC1748qE5 = new EnumC1748qE("CDMA", 4);
        EnumC1748qE enumC1748qE6 = new EnumC1748qE("EVDO_0", 5);
        EnumC1748qE enumC1748qE7 = new EnumC1748qE("EVDO_A", 6);
        EnumC1748qE enumC1748qE8 = new EnumC1748qE("RTT", 7);
        EnumC1748qE enumC1748qE9 = new EnumC1748qE("HSDPA", 8);
        EnumC1748qE enumC1748qE10 = new EnumC1748qE("HSUPA", 9);
        EnumC1748qE enumC1748qE11 = new EnumC1748qE("HSPA", 10);
        EnumC1748qE enumC1748qE12 = new EnumC1748qE("IDEN", 11);
        EnumC1748qE enumC1748qE13 = new EnumC1748qE("EVDO_B", 12);
        EnumC1748qE enumC1748qE14 = new EnumC1748qE("LTE", 13);
        EnumC1748qE enumC1748qE15 = new EnumC1748qE("EHRPD", 14);
        EnumC1748qE enumC1748qE16 = new EnumC1748qE("HSPAP", 15);
        EnumC1748qE enumC1748qE17 = new EnumC1748qE("GSM", 16);
        EnumC1748qE enumC1748qE18 = new EnumC1748qE("TD_SCDMA", 17);
        EnumC1748qE enumC1748qE19 = new EnumC1748qE("IWLAN", 18);
        EnumC1748qE enumC1748qE20 = new EnumC1748qE("LTE_CA", 19);
        i = new EnumC1748qE[]{enumC1748qE, enumC1748qE2, enumC1748qE3, enumC1748qE4, enumC1748qE5, enumC1748qE6, enumC1748qE7, enumC1748qE8, enumC1748qE9, enumC1748qE10, enumC1748qE11, enumC1748qE12, enumC1748qE13, enumC1748qE14, enumC1748qE15, enumC1748qE16, enumC1748qE17, enumC1748qE18, enumC1748qE19, enumC1748qE20, new EnumC1748qE("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        h = sparseArray;
        sparseArray.put(0, enumC1748qE);
        sparseArray.put(1, enumC1748qE2);
        sparseArray.put(2, enumC1748qE3);
        sparseArray.put(3, enumC1748qE4);
        sparseArray.put(4, enumC1748qE5);
        sparseArray.put(5, enumC1748qE6);
        sparseArray.put(6, enumC1748qE7);
        sparseArray.put(7, enumC1748qE8);
        sparseArray.put(8, enumC1748qE9);
        sparseArray.put(9, enumC1748qE10);
        sparseArray.put(10, enumC1748qE11);
        sparseArray.put(11, enumC1748qE12);
        sparseArray.put(12, enumC1748qE13);
        sparseArray.put(13, enumC1748qE14);
        sparseArray.put(14, enumC1748qE15);
        sparseArray.put(15, enumC1748qE16);
        sparseArray.put(16, enumC1748qE17);
        sparseArray.put(17, enumC1748qE18);
        sparseArray.put(18, enumC1748qE19);
        sparseArray.put(19, enumC1748qE20);
    }

    public static EnumC1748qE valueOf(String str) {
        return (EnumC1748qE) Enum.valueOf(EnumC1748qE.class, str);
    }

    public static EnumC1748qE[] values() {
        return (EnumC1748qE[]) i.clone();
    }
}
