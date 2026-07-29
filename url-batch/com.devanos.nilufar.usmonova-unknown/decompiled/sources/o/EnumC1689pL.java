package o;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.pL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1689pL {
    public static final EnumC1689pL h;
    public static final /* synthetic */ EnumC1689pL[] i;

    static {
        EnumC1689pL enumC1689pL = new EnumC1689pL("DEFAULT", 0);
        h = enumC1689pL;
        EnumC1689pL enumC1689pL2 = new EnumC1689pL("UNMETERED_ONLY", 1);
        EnumC1689pL enumC1689pL3 = new EnumC1689pL("UNMETERED_OR_DAILY", 2);
        EnumC1689pL enumC1689pL4 = new EnumC1689pL("FAST_IF_RADIO_AWAKE", 3);
        EnumC1689pL enumC1689pL5 = new EnumC1689pL("NEVER", 4);
        EnumC1689pL enumC1689pL6 = new EnumC1689pL("UNRECOGNIZED", 5);
        i = new EnumC1689pL[]{enumC1689pL, enumC1689pL2, enumC1689pL3, enumC1689pL4, enumC1689pL5, enumC1689pL6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC1689pL);
        sparseArray.put(1, enumC1689pL2);
        sparseArray.put(2, enumC1689pL3);
        sparseArray.put(3, enumC1689pL4);
        sparseArray.put(4, enumC1689pL5);
        sparseArray.put(-1, enumC1689pL6);
    }

    public static EnumC1689pL valueOf(String str) {
        return (EnumC1689pL) Enum.valueOf(EnumC1689pL.class, str);
    }

    public static EnumC1689pL[] values() {
        return (EnumC1689pL[]) i.clone();
    }
}
