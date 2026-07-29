package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: o.Ik, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221Ik implements SW {
    public final EnumC0247Jk a;
    public final String[] b;
    public final String c;

    public C0221Ik(EnumC0247Jk enumC0247Jk, String... strArr) {
        AbstractC0048Bt.n(enumC0247Jk, "kind");
        AbstractC0048Bt.n(strArr, "formatParams");
        this.a = enumC0247Jk;
        this.b = strArr;
        String str = enumC0247Jk.h;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(copyOf, copyOf.length))}, 1));
    }

    @Override // o.SW
    public final boolean a() {
        return false;
    }

    @Override // o.SW
    public final InterfaceC2364zb c() {
        C0273Kk.a.getClass();
        return C0273Kk.c;
    }

    @Override // o.SW
    public final Collection d() {
        return C1318jk.h;
    }

    @Override // o.SW
    public final List getParameters() {
        return C1318jk.h;
    }

    @Override // o.SW
    public final AbstractC0545Ux l() {
        C1776qg c1776qg = C1776qg.f;
        return C1776qg.f;
    }

    public final String toString() {
        return this.c;
    }
}
