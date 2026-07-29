package o;

import com.google.firebase.database.core.ValidationPath;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class RJ extends TY implements PJ {
    public C0261Jy A;
    public C0261Jy B;
    public ArrayList C;
    public SJ D;
    public WJ E;
    public C0325Ml F;
    public C0325Ml G;
    public final boolean m;
    public RA n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1455lp f95o;
    public final int p;
    public C0244Jh q;
    public Collection r;
    public final PJ s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RJ(InterfaceC1118gg interfaceC1118gg, PJ pj, InterfaceC1738q4 interfaceC1738q4, int i, C0244Jh c0244Jh, boolean z, C0827cE c0827cE, int i2, IS is, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(interfaceC1118gg, interfaceC1738q4, c0827cE, null, is);
        if (interfaceC1118gg == null) {
            A0(0);
            throw null;
        }
        if (interfaceC1738q4 == null) {
            A0(1);
            throw null;
        }
        if (i == 0) {
            A0(2);
            throw null;
        }
        if (c0244Jh == null) {
            A0(3);
            throw null;
        }
        if (c0827cE == null) {
            A0(4);
            throw null;
        }
        if (i2 == 0) {
            A0(5);
            throw null;
        }
        if (is == null) {
            A0(6);
            throw null;
        }
        this.m = z;
        this.r = null;
        this.z = Collections.EMPTY_LIST;
        this.p = i;
        this.q = c0244Jh;
        this.s = pj == null ? this : pj;
        this.t = i2;
        this.u = z2;
        this.v = z3;
        this.w = z4;
        this.x = z5;
        this.y = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
                switch (i) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                Object[] objArr = new Object[i2];
                switch (i) {
                    case 1:
                    case 8:
                        objArr[0] = "annotations";
                        break;
                    case 2:
                    case 9:
                        objArr[0] = "modality";
                        break;
                    case 3:
                    case 10:
                    case 20:
                        objArr[0] = "visibility";
                        break;
                    case 4:
                    case 11:
                        objArr[0] = "name";
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    case 12:
                    case 35:
                        objArr[0] = "kind";
                        break;
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    case 13:
                    case 37:
                        objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
                        break;
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 14:
                        objArr[0] = "inType";
                        break;
                    case 15:
                    case 17:
                        objArr[0] = "outType";
                        break;
                    case 16:
                    case 18:
                        objArr[0] = "typeParameters";
                        break;
                    case 19:
                        objArr[0] = "contextReceiverParameters";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case 38:
                    case 39:
                    case 41:
                    case 42:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                        break;
                    case 27:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 29:
                        objArr[0] = "copyConfiguration";
                        break;
                    case 30:
                        objArr[0] = "substitutor";
                        break;
                    case 31:
                        objArr[0] = "accessorDescriptor";
                        break;
                    case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                        objArr[0] = "newOwner";
                        break;
                    case 33:
                        objArr[0] = "newModality";
                        break;
                    case 34:
                        objArr[0] = "newVisibility";
                        break;
                    case 36:
                        objArr[0] = "newName";
                        break;
                    case 40:
                        objArr[0] = "overriddenDescriptors";
                        break;
                }
                if (i != 28) {
                    objArr[1] = "getSourceToUseForCopy";
                } else if (i == 38) {
                    objArr[1] = "getOriginal";
                } else if (i == 39) {
                    objArr[1] = "getKind";
                } else if (i == 41) {
                    objArr[1] = "getOverriddenDescriptors";
                } else if (i != 42) {
                    switch (i) {
                        case 21:
                            objArr[1] = "getTypeParameters";
                            break;
                        case 22:
                            objArr[1] = "getContextReceiverParameters";
                            break;
                        case 23:
                            objArr[1] = "getReturnType";
                            break;
                        case 24:
                            objArr[1] = "getModality";
                            break;
                        case 25:
                            objArr[1] = "getVisibility";
                            break;
                        case 26:
                            objArr[1] = "getAccessors";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                            break;
                    }
                } else {
                    objArr[1] = "copy";
                }
                switch (i) {
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        objArr[2] = "create";
                        break;
                    case 14:
                        objArr[2] = "setInType";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        objArr[2] = "setType";
                        break;
                    case 20:
                        objArr[2] = "setVisibility";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case 38:
                    case 39:
                    case 41:
                    case 42:
                        break;
                    case 27:
                        objArr[2] = "substitute";
                        break;
                    case 29:
                        objArr[2] = "doSubstitute";
                        break;
                    case 30:
                    case 31:
                        objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                        break;
                    case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    case 40:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
                    switch (i) {
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i2 = 2;
            Object[] objArr2 = new Object[i2];
            switch (i) {
            }
            if (i != 28) {
            }
            switch (i) {
            }
            String format2 = String.format(str, objArr2);
            if (i != 28) {
                switch (i) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 28) {
            switch (i) {
            }
            Object[] objArr22 = new Object[i2];
            switch (i) {
            }
            if (i != 28) {
            }
            switch (i) {
            }
            String format22 = String.format(str, objArr22);
            if (i != 28) {
            }
            throw new IllegalStateException(format22);
        }
        i2 = 2;
        Object[] objArr222 = new Object[i2];
        switch (i) {
        }
        if (i != 28) {
        }
        switch (i) {
        }
        String format222 = String.format(str, objArr222);
        if (i != 28) {
        }
        throw new IllegalStateException(format222);
    }

    public static RJ I0(InterfaceC1118gg interfaceC1118gg, int i, C0244Jh c0244Jh, boolean z, C0827cE c0827cE, int i2, IS is) {
        C1672p4 c1672p4 = C0460Rq.t;
        if (interfaceC1118gg == null) {
            A0(7);
            throw null;
        }
        if (i == 0) {
            A0(9);
            throw null;
        }
        if (c0244Jh == null) {
            A0(10);
            throw null;
        }
        if (c0827cE == null) {
            A0(11);
            throw null;
        }
        if (i2 == 0) {
            A0(12);
            throw null;
        }
        if (is != null) {
            return new RJ(interfaceC1118gg, null, c1672p4, i, c0244Jh, z, c0827cE, i2, is, false, false, false, false, false);
        }
        A0(13);
        throw null;
    }

    public static InterfaceC0381Op K0(C2096vX c2096vX, MJ mj) {
        if (mj == null) {
            A0(31);
            throw null;
        }
        InterfaceC0381Op interfaceC0381Op = ((NJ) mj).s;
        if (interfaceC0381Op != null) {
            return interfaceC0381Op.e(c2096vX);
        }
        return null;
    }

    @Override // o.InterfaceC2072v9
    public Object C(C0633Yh c0633Yh) {
        return null;
    }

    @Override // o.SY
    public final boolean G() {
        return this.m;
    }

    @Override // o.InterfaceC2204x9
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public final RJ y(InterfaceC1118gg interfaceC1118gg, int i, C0244Jh c0244Jh) {
        QJ qj = new QJ(this);
        if (interfaceC1118gg == null) {
            QJ.a(0);
            throw null;
        }
        qj.a = interfaceC1118gg;
        qj.d = null;
        if (i == 0) {
            QJ.a(6);
            throw null;
        }
        qj.b = i;
        if (c0244Jh == null) {
            QJ.a(8);
            throw null;
        }
        qj.c = c0244Jh;
        qj.e = 2;
        qj.g = false;
        RJ b = qj.b();
        if (b != null) {
            return b;
        }
        A0(42);
        throw null;
    }

    @Override // o.TY, o.InterfaceC2072v9
    public final C0261Jy J() {
        return this.B;
    }

    public RJ J0(InterfaceC1118gg interfaceC1118gg, int i, C0244Jh c0244Jh, PJ pj, int i2, C0827cE c0827cE) {
        if (interfaceC1118gg == null) {
            A0(32);
            throw null;
        }
        if (i == 0) {
            A0(33);
            throw null;
        }
        if (c0244Jh == null) {
            A0(34);
            throw null;
        }
        if (i2 == 0) {
            A0(35);
            throw null;
        }
        if (c0827cE == null) {
            A0(36);
            throw null;
        }
        return new RJ(interfaceC1118gg, pj, getAnnotations(), i, c0244Jh, this.m, c0827cE, i2, IS.e, this.u, isConst(), this.w, w(), this.y);
    }

    @Override // o.PJ
    public final C0325Ml L() {
        return this.G;
    }

    public final void L0(SJ sj, WJ wj, C0325Ml c0325Ml, C0325Ml c0325Ml2) {
        this.D = sj;
        this.E = wj;
        this.F = c0325Ml;
        this.G = c0325Ml2;
    }

    @Override // o.InterfaceC2204x9
    public final int M() {
        int i = this.t;
        if (i != 0) {
            return i;
        }
        A0(39);
        throw null;
    }

    public final void M0(RA ra, InterfaceC1455lp interfaceC1455lp) {
        if (interfaceC1455lp == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.f95o = interfaceC1455lp;
        if (ra == null) {
            ra = (RA) interfaceC1455lp.invoke();
        }
        this.n = ra;
    }

    public final void O0(AbstractC1004ey abstractC1004ey, List list, C0261Jy c0261Jy, C0261Jy c0261Jy2, List list2) {
        if (abstractC1004ey == null) {
            A0(17);
            throw null;
        }
        if (list == null) {
            A0(18);
            throw null;
        }
        if (list2 == null) {
            A0(19);
            throw null;
        }
        this.l = abstractC1004ey;
        this.C = new ArrayList(list);
        this.B = c0261Jy2;
        this.A = c0261Jy;
        this.z = list2;
    }

    @Override // o.PJ
    public final C0325Ml R() {
        return this.F;
    }

    @Override // o.InterfaceC2072v9
    public final List T() {
        List list = this.z;
        if (list != null) {
            return list;
        }
        A0(22);
        throw null;
    }

    @Override // o.SY
    public final boolean V() {
        return this.u;
    }

    @Override // o.OB
    public final boolean X() {
        return this.w;
    }

    @Override // o.PJ
    public final boolean a0() {
        return this.y;
    }

    @Override // o.PJ
    public final WJ b() {
        return this.E;
    }

    @Override // o.InterfaceC2204x9
    public final void c0(Collection collection) {
        if (collection != null) {
            this.r = collection;
        } else {
            A0(40);
            throw null;
        }
    }

    @Override // o.OB
    public final int g() {
        int i = this.p;
        if (i != 0) {
            return i;
        }
        A0(24);
        throw null;
    }

    @Override // o.PJ
    public final SJ getGetter() {
        return this.D;
    }

    @Override // o.TY, o.InterfaceC2072v9
    public final AbstractC1004ey getReturnType() {
        AbstractC1004ey c = c();
        if (c != null) {
            return c;
        }
        A0(23);
        throw null;
    }

    @Override // o.TY, o.InterfaceC2072v9
    public final List getTypeParameters() {
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for ".concat(AbstractC1184hg.F0(this)));
    }

    @Override // o.InterfaceC1446lg, o.OB
    public final C0244Jh getVisibility() {
        C0244Jh c0244Jh = this.q;
        if (c0244Jh != null) {
            return c0244Jh;
        }
        A0(25);
        throw null;
    }

    @Override // o.SY
    public boolean isConst() {
        return this.v;
    }

    @Override // o.InterfaceC2072v9
    public final Collection o() {
        Collection collection = this.r;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        A0(41);
        throw null;
    }

    @Override // o.SY
    public final AbstractC0551Vd o0() {
        RA ra = this.n;
        if (ra != null) {
            return (AbstractC0551Vd) ra.invoke();
        }
        return null;
    }

    @Override // o.OB
    public final boolean p0() {
        return false;
    }

    @Override // o.PJ
    public final ArrayList r() {
        ArrayList arrayList = new ArrayList(2);
        SJ sj = this.D;
        if (sj != null) {
            arrayList.add(sj);
        }
        WJ wj = this.E;
        if (wj != null) {
            arrayList.add(wj);
        }
        return arrayList;
    }

    @Override // o.InterfaceC1118gg
    public final Object t(InterfaceC1380kg interfaceC1380kg, Object obj) {
        return interfaceC1380kg.u(this, obj);
    }

    @Override // o.OB
    public boolean w() {
        return this.x;
    }

    @Override // o.TY, o.InterfaceC2072v9
    public final C0261Jy x() {
        return this.A;
    }

    @Override // o.InterfaceC1106gU
    public final PJ e(C2096vX c2096vX) {
        if (c2096vX == null) {
            A0(27);
            throw null;
        }
        if (c2096vX.a.e()) {
            return this;
        }
        QJ qj = new QJ(this);
        AbstractC1964tX f = c2096vX.f();
        if (f == null) {
            QJ.a(15);
            throw null;
        }
        qj.f = f;
        qj.d = a();
        return qj.b();
    }

    @Override // o.AbstractC1314jg, o.AbstractC1184hg, o.InterfaceC1118gg
    public final PJ a() {
        PJ pj = this.s;
        PJ a = pj == this ? this : pj.a();
        if (a != null) {
            return a;
        }
        A0(38);
        throw null;
    }

    public void N0(AbstractC1004ey abstractC1004ey) {
    }
}
