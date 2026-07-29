package o;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: o.Jy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261Jy extends AbstractC1184hg implements InterfaceC1882sH {
    public final /* synthetic */ int j = 1;
    public final InterfaceC1118gg k;
    public final UL l;

    public C0261Jy(InterfaceC1245ib interfaceC1245ib) {
        super(C0460Rq.t, YS.d);
        this.k = interfaceC1245ib;
        this.l = new C2051us(interfaceC1245ib);
    }

    public static /* synthetic */ void A0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static /* synthetic */ void B0(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "name";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static /* synthetic */ void G0(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                objArr[1] = "getTypeParameters";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "getType";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public final UL H0() {
        switch (this.j) {
            case 0:
                C2051us c2051us = (C2051us) this.l;
                if (c2051us != null) {
                    return c2051us;
                }
                A0(1);
                throw null;
            default:
                L l = (L) this.l;
                if (l != null) {
                    return l;
                }
                B0(7);
                throw null;
        }
    }

    @Override // o.InterfaceC1106gU
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public final C0261Jy e(C2096vX c2096vX) {
        if (c2096vX == null) {
            G0(3);
            throw null;
        }
        if (!c2096vX.a.e()) {
            AbstractC1004ey i = n() instanceof InterfaceC1245ib ? c2096vX.i(3, c()) : c2096vX.i(1, c());
            if (i == null) {
                return null;
            }
            if (i != c()) {
                return new C0261Jy(n(), new C1897sW(i), getAnnotations());
            }
        }
        return this;
    }

    @Override // o.InterfaceC2072v9
    public final C0261Jy J() {
        return null;
    }

    @Override // o.InterfaceC2072v9
    public final boolean Q() {
        return false;
    }

    @Override // o.AbstractC1184hg, o.InterfaceC1118gg
    public final InterfaceC2072v9 a() {
        return this;
    }

    @Override // o.L, o.UL
    public final AbstractC1004ey c() {
        AbstractC1004ey c = H0().c();
        if (c != null) {
            return c;
        }
        G0(6);
        throw null;
    }

    @Override // o.InterfaceC1249ig
    public final IS d() {
        return IS.e;
    }

    @Override // o.InterfaceC2072v9
    public final AbstractC1004ey getReturnType() {
        return c();
    }

    @Override // o.InterfaceC2072v9
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        G0(5);
        throw null;
    }

    @Override // o.InterfaceC1446lg, o.OB
    public final C0244Jh getVisibility() {
        C0244Jh c0244Jh = AbstractC0270Kh.f;
        if (c0244Jh != null) {
            return c0244Jh;
        }
        G0(9);
        throw null;
    }

    @Override // o.InterfaceC1118gg
    public final InterfaceC1118gg n() {
        switch (this.j) {
            case 0:
                InterfaceC1245ib interfaceC1245ib = (InterfaceC1245ib) this.k;
                if (interfaceC1245ib != null) {
                    return interfaceC1245ib;
                }
                A0(2);
                throw null;
            default:
                InterfaceC1118gg interfaceC1118gg = this.k;
                if (interfaceC1118gg != null) {
                    return interfaceC1118gg;
                }
                B0(8);
                throw null;
        }
    }

    @Override // o.InterfaceC2072v9
    public final Collection o() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        G0(8);
        throw null;
    }

    @Override // o.InterfaceC1118gg
    public final Object t(InterfaceC1380kg interfaceC1380kg, Object obj) {
        return interfaceC1380kg.n(this, obj);
    }

    @Override // o.InterfaceC2072v9
    public final List t0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        G0(7);
        throw null;
    }

    @Override // o.AbstractC1184hg
    public String toString() {
        switch (this.j) {
            case 0:
                return "class " + ((InterfaceC1245ib) this.k).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // o.InterfaceC2072v9
    public final C0261Jy x() {
        return null;
    }

    @Override // o.AbstractC1184hg, o.InterfaceC1118gg
    public final InterfaceC1118gg a() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0261Jy(InterfaceC1118gg interfaceC1118gg, L l, InterfaceC1738q4 interfaceC1738q4) {
        this(interfaceC1118gg, l, interfaceC1738q4, YS.d);
        if (interfaceC1118gg == null) {
            B0(0);
            throw null;
        }
        if (interfaceC1738q4 != null) {
        } else {
            B0(2);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0261Jy(InterfaceC1118gg interfaceC1118gg, L l, InterfaceC1738q4 interfaceC1738q4, C0827cE c0827cE) {
        super(interfaceC1738q4, c0827cE);
        if (interfaceC1118gg == null) {
            B0(3);
            throw null;
        }
        if (interfaceC1738q4 == null) {
            B0(5);
            throw null;
        }
        if (c0827cE != null) {
            this.k = interfaceC1118gg;
            this.l = l;
            return;
        }
        B0(6);
        throw null;
    }
}
