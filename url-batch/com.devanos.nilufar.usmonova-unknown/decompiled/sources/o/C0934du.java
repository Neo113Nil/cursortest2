package o;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: o.du, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0934du extends HR implements InterfaceC0541Ut {
    public static final C0633Yh M = new C0633Yh();
    public static final C0633Yh N = new C0633Yh();
    public int K;
    public final boolean L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0934du(InterfaceC1118gg interfaceC1118gg, HR hr, InterfaceC1738q4 interfaceC1738q4, C0827cE c0827cE, int i, IS is, boolean z) {
        super(interfaceC1118gg, hr, interfaceC1738q4, c0827cE, i, is);
        if (interfaceC1118gg == null) {
            A0(0);
            throw null;
        }
        if (interfaceC1738q4 == null) {
            A0(1);
            throw null;
        }
        if (c0827cE == null) {
            A0(2);
            throw null;
        }
        if (i == 0) {
            A0(3);
            throw null;
        }
        this.K = 0;
        this.L = z;
    }

    public static /* synthetic */ void A0(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static C0934du W0(InterfaceC1118gg interfaceC1118gg, C0338My c0338My, C0827cE c0827cE, C0904dP c0904dP, boolean z) {
        if (interfaceC1118gg == null) {
            A0(5);
            throw null;
        }
        if (c0827cE != null) {
            return new C0934du(interfaceC1118gg, null, c0338My, c0827cE, 1, c0904dP, z);
        }
        A0(7);
        throw null;
    }

    @Override // o.HR, o.AbstractC0433Qp
    public final AbstractC0433Qp J0(int i, InterfaceC1738q4 interfaceC1738q4, InterfaceC1118gg interfaceC1118gg, InterfaceC0381Op interfaceC0381Op, C0827cE c0827cE, IS is) {
        if (interfaceC1118gg == null) {
            A0(14);
            throw null;
        }
        if (i == 0) {
            A0(15);
            throw null;
        }
        if (interfaceC1738q4 == null) {
            A0(16);
            throw null;
        }
        HR hr = (HR) interfaceC0381Op;
        if (c0827cE == null) {
            c0827cE = getName();
        }
        C0934du c0934du = new C0934du(interfaceC1118gg, hr, interfaceC1738q4, c0827cE, i, is, this.L);
        int i2 = this.K;
        boolean z = false;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw null;
                    }
                }
            }
            z = true;
        }
        c0934du.X0(z, AbstractC1888sN.c(i2));
        return c0934du;
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC2072v9
    public final boolean Q() {
        return AbstractC1888sN.c(this.K);
    }

    @Override // o.HR
    public final HR V0(C0261Jy c0261Jy, C0261Jy c0261Jy2, List list, List list2, List list3, AbstractC1004ey abstractC1004ey, int i, C0244Jh c0244Jh, Map map) {
        C0522Ua c0522Ua;
        if (list == null) {
            A0(9);
            throw null;
        }
        if (list2 == null) {
            A0(10);
            throw null;
        }
        if (list3 == null) {
            A0(11);
            throw null;
        }
        if (c0244Jh == null) {
            A0(12);
            throw null;
        }
        super.V0(c0261Jy, c0261Jy2, list, list2, list3, abstractC1004ey, i, c0244Jh, map);
        for (C0574Wa c0574Wa : LG.h) {
            C0705aN c0705aN = c0574Wa.b;
            C0827cE c0827cE = c0574Wa.a;
            if (c0827cE == null || AbstractC0048Bt.h(getName(), c0827cE)) {
                if (c0705aN != null) {
                    String b = getName().b();
                    AbstractC0048Bt.m(b, "functionDescriptor.name.asString()");
                    if (!c0705aN.h.matcher(b).matches()) {
                        continue;
                    }
                }
                Collection collection = c0574Wa.c;
                if (collection == null || collection.contains(getName())) {
                    InterfaceC0496Ta[] interfaceC0496TaArr = c0574Wa.e;
                    int length = interfaceC0496TaArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            c0522Ua = ((String) c0574Wa.d.invoke(this)) != null ? new C0522Ua(false) : C0522Ua.c;
                        } else {
                            if (interfaceC0496TaArr[i2].c(this) != null) {
                                c0522Ua = new C0522Ua(false);
                                break;
                            }
                            i2++;
                        }
                    }
                    this.t = c0522Ua.a;
                    return this;
                }
            }
        }
        c0522Ua = C0522Ua.b;
        this.t = c0522Ua.a;
        return this;
    }

    public final void X0(boolean z, boolean z2) {
        this.K = z ? z2 ? 4 : 2 : z2 ? 3 : 1;
    }

    @Override // o.InterfaceC0541Ut
    public final InterfaceC0541Ut x0(AbstractC1004ey abstractC1004ey, ArrayList arrayList, AbstractC1004ey abstractC1004ey2, C1619oH c1619oH) {
        ArrayList c = AbstractC1494mO.c(arrayList, t0(), this);
        C0261Jy A = abstractC1004ey == null ? null : AbstractC1807r8.A(this, abstractC1004ey, C0460Rq.t);
        C0407Pp N0 = N0(C2096vX.b);
        N0.n = c;
        N0.r = abstractC1004ey2;
        N0.p = A;
        N0.w = true;
        N0.v = true;
        C0934du c0934du = (C0934du) N0.E.K0(N0);
        if (c1619oH != null) {
            c0934du.O0((C0633Yh) c1619oH.h, c1619oH.i);
        }
        if (c0934du != null) {
            return c0934du;
        }
        A0(21);
        throw null;
    }
}
