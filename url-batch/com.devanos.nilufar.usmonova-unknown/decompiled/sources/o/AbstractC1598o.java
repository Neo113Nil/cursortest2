package o;

import java.util.Collections;
import java.util.List;

/* renamed from: o.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1598o extends YC {
    public final C0827cE h;
    public final SA i;
    public final SA j;
    public final SA k;

    public AbstractC1598o(OT ot, C0827cE c0827cE) {
        if (ot == null) {
            F(0);
            throw null;
        }
        if (c0827cE == null) {
            F(1);
            throw null;
        }
        this.h = c0827cE;
        VA va = (VA) ot;
        this.i = new SA(va, new C1532n(this, 0));
        this.j = new SA(va, new C1532n(this, 1));
        this.k = new SA(va, new C1532n(this, 2));
    }

    public static /* synthetic */ void F(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // o.YC, o.InterfaceC1118gg
    public final InterfaceC2364zb a() {
        return this;
    }

    @Override // o.InterfaceC1245ib
    public final WB d0(AbstractC1964tX abstractC1964tX) {
        AbstractC0192Hh.i(AbstractC0114Eh.d(this));
        WB h = h(abstractC1964tX, C1398ky.a);
        if (h != null) {
            return h;
        }
        F(16);
        throw null;
    }

    @Override // o.InterfaceC1245ib
    public WB g0() {
        WB wb = (WB) this.j.invoke();
        if (wb != null) {
            return wb;
        }
        F(4);
        throw null;
    }

    @Override // o.InterfaceC1118gg
    public final C0827cE getName() {
        C0827cE c0827cE = this.h;
        if (c0827cE != null) {
            return c0827cE;
        }
        F(2);
        throw null;
    }

    @Override // o.YC
    public WB h(AbstractC1964tX abstractC1964tX, C1398ky c1398ky) {
        if (!abstractC1964tX.e()) {
            return new C1172hU(u(c1398ky), new C2096vX(abstractC1964tX));
        }
        WB u = u(c1398ky);
        if (u != null) {
            return u;
        }
        F(12);
        throw null;
    }

    @Override // o.InterfaceC1245ib, o.InterfaceC2364zb
    public final JR i() {
        JR jr = (JR) this.i.invoke();
        if (jr != null) {
            return jr;
        }
        F(20);
        throw null;
    }

    @Override // o.InterfaceC1245ib
    public WB n0() {
        AbstractC0192Hh.i(AbstractC0114Eh.d(this));
        WB u = u(C1398ky.a);
        if (u != null) {
            return u;
        }
        F(17);
        throw null;
    }

    @Override // o.InterfaceC1106gU
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1245ib e(C2096vX c2096vX) {
        if (c2096vX != null) {
            return c2096vX.a.e() ? this : new C1926sz(this, c2096vX);
        }
        F(18);
        throw null;
    }

    @Override // o.InterfaceC1245ib
    public List s0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        F(6);
        throw null;
    }

    @Override // o.InterfaceC1118gg
    public final Object t(InterfaceC1380kg interfaceC1380kg, Object obj) {
        return interfaceC1380kg.h(this, obj);
    }

    @Override // o.InterfaceC1245ib
    public final C0261Jy z0() {
        C0261Jy c0261Jy = (C0261Jy) this.k.invoke();
        if (c0261Jy != null) {
            return c0261Jy;
        }
        F(5);
        throw null;
    }

    @Override // o.YC, o.InterfaceC1118gg
    public final InterfaceC1118gg a() {
        return this;
    }

    @Override // o.YC, o.InterfaceC1118gg
    public final InterfaceC1245ib a() {
        return this;
    }
}
