package o;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.rE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1813rE {
    public static final SparseArray h;
    public static final /* synthetic */ EnumC1813rE[] i;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1813rE EF1;

    static {
        EnumC1813rE enumC1813rE = new EnumC1813rE("MOBILE", 0);
        EnumC1813rE enumC1813rE2 = new EnumC1813rE("WIFI", 1);
        EnumC1813rE enumC1813rE3 = new EnumC1813rE("MOBILE_MMS", 2);
        EnumC1813rE enumC1813rE4 = new EnumC1813rE("MOBILE_SUPL", 3);
        EnumC1813rE enumC1813rE5 = new EnumC1813rE("MOBILE_DUN", 4);
        EnumC1813rE enumC1813rE6 = new EnumC1813rE("MOBILE_HIPRI", 5);
        EnumC1813rE enumC1813rE7 = new EnumC1813rE("WIMAX", 6);
        EnumC1813rE enumC1813rE8 = new EnumC1813rE("BLUETOOTH", 7);
        EnumC1813rE enumC1813rE9 = new EnumC1813rE("DUMMY", 8);
        EnumC1813rE enumC1813rE10 = new EnumC1813rE("ETHERNET", 9);
        EnumC1813rE enumC1813rE11 = new EnumC1813rE("MOBILE_FOTA", 10);
        EnumC1813rE enumC1813rE12 = new EnumC1813rE("MOBILE_IMS", 11);
        EnumC1813rE enumC1813rE13 = new EnumC1813rE("MOBILE_CBS", 12);
        EnumC1813rE enumC1813rE14 = new EnumC1813rE("WIFI_P2P", 13);
        EnumC1813rE enumC1813rE15 = new EnumC1813rE("MOBILE_IA", 14);
        EnumC1813rE enumC1813rE16 = new EnumC1813rE("MOBILE_EMERGENCY", 15);
        EnumC1813rE enumC1813rE17 = new EnumC1813rE("PROXY", 16);
        EnumC1813rE enumC1813rE18 = new EnumC1813rE("VPN", 17);
        EnumC1813rE enumC1813rE19 = new EnumC1813rE("NONE", 18);
        i = new EnumC1813rE[]{enumC1813rE, enumC1813rE2, enumC1813rE3, enumC1813rE4, enumC1813rE5, enumC1813rE6, enumC1813rE7, enumC1813rE8, enumC1813rE9, enumC1813rE10, enumC1813rE11, enumC1813rE12, enumC1813rE13, enumC1813rE14, enumC1813rE15, enumC1813rE16, enumC1813rE17, enumC1813rE18, enumC1813rE19};
        SparseArray sparseArray = new SparseArray();
        h = sparseArray;
        sparseArray.put(0, enumC1813rE);
        sparseArray.put(1, enumC1813rE2);
        sparseArray.put(2, enumC1813rE3);
        sparseArray.put(3, enumC1813rE4);
        sparseArray.put(4, enumC1813rE5);
        sparseArray.put(5, enumC1813rE6);
        sparseArray.put(6, enumC1813rE7);
        sparseArray.put(7, enumC1813rE8);
        sparseArray.put(8, enumC1813rE9);
        sparseArray.put(9, enumC1813rE10);
        sparseArray.put(10, enumC1813rE11);
        sparseArray.put(11, enumC1813rE12);
        sparseArray.put(12, enumC1813rE13);
        sparseArray.put(13, enumC1813rE14);
        sparseArray.put(14, enumC1813rE15);
        sparseArray.put(15, enumC1813rE16);
        sparseArray.put(16, enumC1813rE17);
        sparseArray.put(17, enumC1813rE18);
        sparseArray.put(-1, enumC1813rE19);
    }

    public static EnumC1813rE valueOf(String str) {
        return (EnumC1813rE) Enum.valueOf(EnumC1813rE.class, str);
    }

    public static EnumC1813rE[] values() {
        return (EnumC1813rE[]) i.clone();
    }
}
