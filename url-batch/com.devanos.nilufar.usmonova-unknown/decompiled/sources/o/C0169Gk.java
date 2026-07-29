package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* renamed from: o.Gk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0169Gk implements WB {
    public final String b;

    public C0169Gk(int i, String... strArr) {
        String str;
        AbstractC1888sN.p(i, "kind");
        AbstractC0048Bt.n(strArr, "formatParams");
        switch (i) {
            case 1:
                str = "No member resolution should be done on captured type, it used only during constraint system resolution";
                break;
            case 2:
                str = "Scope for integer literal type (%s)";
                break;
            case 3:
                str = "Error scope for erased receiver type";
                break;
            case 4:
                str = "Scope for abbreviation %s";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                str = "Scope for stub type %s";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "A scope for common supertype which is not a normal classifier";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "Scope for error type %s";
                break;
            case 8:
                str = "Scope for unsupported type %s";
                break;
            case 9:
                str = "Error scope for class %s with arguments: %s";
                break;
            case 10:
                str = "Error resolution candidate for call %s";
                break;
            default:
                throw null;
        }
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.b = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
    }

    @Override // o.PN
    public Collection b(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        return C1318jk.h;
    }

    @Override // o.WB
    public Set d() {
        return C1648ok.h;
    }

    @Override // o.WB
    public Set e() {
        return C1648ok.h;
    }

    @Override // o.WB
    public Set f() {
        return C1648ok.h;
    }

    @Override // o.PN
    public InterfaceC2364zb g(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        return new C0013Ak(C0827cE.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{c0827cE}, 1))));
    }

    @Override // o.WB
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set a(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        C0013Ak c0013Ak = C0273Kk.c;
        AbstractC0048Bt.n(c0013Ak, "containingDeclaration");
        C0065Ck c0065Ck = new C0065Ck(c0013Ak, null, C0460Rq.t, C0827cE.g("<Error function>"), 1, IS.e);
        C0195Hk c = C0273Kk.c(EnumC0247Jk.l, new String[0]);
        C0244Jh c0244Jh = AbstractC0270Kh.e;
        C1318jk c1318jk = C1318jk.h;
        c0065Ck.M0(null, null, c1318jk, c1318jk, c1318jk, c, 3, c0244Jh);
        return AbstractC0773bP.i(c0065Ck);
    }

    @Override // o.WB
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set c(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        return C0273Kk.f;
    }

    public String toString() {
        return AbstractC2188wx.h(new StringBuilder("ErrorScope{"), this.b, '}');
    }
}
