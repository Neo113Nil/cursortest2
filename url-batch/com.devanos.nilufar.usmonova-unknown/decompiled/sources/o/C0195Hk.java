package o;

import java.util.Arrays;
import java.util.List;

/* renamed from: o.Hk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195Hk extends JR {
    public final SW i;
    public final C0169Gk j;
    public final EnumC0247Jk k;
    public final List l;
    public final boolean m;
    public final String[] n;

    /* renamed from: o, reason: collision with root package name */
    public final String f45o;

    public C0195Hk(SW sw, C0169Gk c0169Gk, EnumC0247Jk enumC0247Jk, List list, boolean z, String... strArr) {
        AbstractC0048Bt.n(enumC0247Jk, "kind");
        AbstractC0048Bt.n(list, "arguments");
        AbstractC0048Bt.n(strArr, "formatParams");
        this.i = sw;
        this.j = c0169Gk;
        this.k = enumC0247Jk;
        this.l = list;
        this.m = z;
        this.n = strArr;
        String str = enumC0247Jk.h;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.f45o = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
    }

    @Override // o.AbstractC1004ey
    public final OW A0() {
        OW.i.getClass();
        return OW.j;
    }

    @Override // o.AbstractC1004ey
    public final SW B0() {
        return this.i;
    }

    @Override // o.AbstractC1004ey
    public final boolean C0() {
        return this.m;
    }

    @Override // o.AbstractC1004ey
    public final AbstractC1004ey D0(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        return this;
    }

    @Override // o.AbstractC2097vY
    /* renamed from: G0 */
    public final AbstractC2097vY D0(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        return this;
    }

    @Override // o.JR, o.AbstractC2097vY
    public final AbstractC2097vY H0(OW ow) {
        AbstractC0048Bt.n(ow, "newAttributes");
        return this;
    }

    @Override // o.JR
    /* renamed from: I0 */
    public final JR F0(boolean z) {
        String[] strArr = this.n;
        return new C0195Hk(this.i, this.j, this.k, this.l, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // o.JR
    /* renamed from: J0 */
    public final JR H0(OW ow) {
        AbstractC0048Bt.n(ow, "newAttributes");
        return this;
    }

    @Override // o.AbstractC1004ey
    public final WB r0() {
        return this.j;
    }

    @Override // o.AbstractC1004ey
    public final List w0() {
        return this.l;
    }
}
