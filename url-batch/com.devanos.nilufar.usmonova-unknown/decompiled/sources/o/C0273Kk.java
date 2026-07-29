package o;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: o.Kk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273Kk {
    public static final C0273Kk a = new C0273Kk();
    public static final C0091Dk b = C0091Dk.h;
    public static final C0013Ak c = new C0013Ak(C0827cE.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
    public static final C0195Hk d = c(EnumC0247Jk.f52o, new String[0]);
    public static final C0195Hk e = c(EnumC0247Jk.B, new String[0]);
    public static final Set f = AbstractC0773bP.i(new C0117Ek());

    public static final C0169Gk a(int i, boolean z, String... strArr) {
        AbstractC1888sN.p(i, "kind");
        AbstractC0048Bt.n(strArr, "formatParams");
        if (!z) {
            return new C0169Gk(i, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        AbstractC0048Bt.n(strArr2, "formatParams");
        return new KV(i, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static final C0169Gk b(int i, String... strArr) {
        AbstractC1888sN.p(i, "kind");
        return a(i, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final C0195Hk c(EnumC0247Jk enumC0247Jk, String... strArr) {
        AbstractC0048Bt.n(enumC0247Jk, "kind");
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        AbstractC0048Bt.n(strArr2, "formatParams");
        return e(enumC0247Jk, C1318jk.h, d(enumC0247Jk, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static C0221Ik d(EnumC0247Jk enumC0247Jk, String... strArr) {
        AbstractC0048Bt.n(enumC0247Jk, "kind");
        AbstractC0048Bt.n(strArr, "formatParams");
        return new C0221Ik(enumC0247Jk, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static C0195Hk e(EnumC0247Jk enumC0247Jk, List list, SW sw, String... strArr) {
        AbstractC0048Bt.n(enumC0247Jk, "kind");
        AbstractC0048Bt.n(strArr, "formatParams");
        return new C0195Hk(sw, b(7, sw.toString()), enumC0247Jk, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(InterfaceC1118gg interfaceC1118gg) {
        if (interfaceC1118gg != null) {
            return (interfaceC1118gg instanceof C0013Ak) || (interfaceC1118gg.n() instanceof C0013Ak) || interfaceC1118gg == b;
        }
        return false;
    }
}
