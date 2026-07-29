package o;

import com.google.firebase.database.core.ValidationPath;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: o.Pp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0407Pp implements InterfaceC0355Np {
    public boolean A;
    public final LinkedHashMap B;
    public Boolean C;
    public boolean D;
    public final /* synthetic */ AbstractC0433Qp E;
    public AbstractC1964tX h;
    public InterfaceC1118gg i;
    public int j;
    public C0244Jh k;
    public InterfaceC0381Op l;
    public int m;
    public List n;

    /* renamed from: o, reason: collision with root package name */
    public final List f86o;
    public C0261Jy p;
    public C0261Jy q;
    public AbstractC1004ey r;
    public C0827cE s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public C1318jk y;
    public InterfaceC1738q4 z;

    public C0407Pp(AbstractC0433Qp abstractC0433Qp, AbstractC1964tX abstractC1964tX, InterfaceC1118gg interfaceC1118gg, int i, C0244Jh c0244Jh, int i2, List list, List list2, C0261Jy c0261Jy, AbstractC1004ey abstractC1004ey) {
        if (abstractC1964tX == null) {
            a(0);
            throw null;
        }
        if (interfaceC1118gg == null) {
            a(1);
            throw null;
        }
        if (i == 0) {
            a(2);
            throw null;
        }
        if (c0244Jh == null) {
            a(3);
            throw null;
        }
        if (i2 == 0) {
            a(4);
            throw null;
        }
        if (list == null) {
            a(5);
            throw null;
        }
        if (list2 == null) {
            a(6);
            throw null;
        }
        if (abstractC1004ey == null) {
            a(7);
            throw null;
        }
        this.E = abstractC0433Qp;
        this.l = null;
        this.q = abstractC0433Qp.q;
        this.t = true;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = abstractC0433Qp.z;
        this.y = null;
        this.z = null;
        this.A = abstractC0433Qp.A;
        this.B = new LinkedHashMap();
        this.C = null;
        this.D = false;
        this.h = abstractC1964tX;
        this.i = interfaceC1118gg;
        this.j = i;
        this.k = c0244Jh;
        this.m = i2;
        this.n = list;
        this.f86o = list2;
        this.p = c0261Jy;
        this.r = abstractC1004ey;
        this.s = null;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i2 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "newContextReceiverParameters";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = "name";
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(format);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // o.InterfaceC0355Np
    public final InterfaceC0355Np A() {
        this.v = true;
        return this;
    }

    @Override // o.InterfaceC0355Np
    public final InterfaceC0355Np E(InterfaceC1118gg interfaceC1118gg) {
        if (interfaceC1118gg != null) {
            this.i = interfaceC1118gg;
            return this;
        }
        a(8);
        throw null;
    }

    @Override // o.InterfaceC0355Np
    public final InterfaceC0355Np K(int i) {
        if (i != 0) {
            this.j = i;
            return this;
        }
        a(10);
        throw null;
    }

    @Override // o.InterfaceC0355Np
    public final InterfaceC0355Np M() {
        this.B.put(C0934du.N, Boolean.TRUE);
        return this;
    }

    @Override // o.InterfaceC0355Np
    public final InterfaceC0355Np N() {
        this.A = true;
        return this;
    }

    @Override // o.InterfaceC0355Np
    public final InterfaceC0355Np P(AbstractC1004ey abstractC1004ey) {
        if (abstractC1004ey != null) {
            this.r = abstractC1004ey;
            return this;
        }
        a(23);
        throw null;
    }

    @Override // o.InterfaceC0355Np
    public final InterfaceC0355Np T() {
        this.u = true;
        return this;
    }

    @Override // o.InterfaceC0355Np
    public final InterfaceC0381Op build() {
        return this.E.K0(this);
    }

    @Override // o.InterfaceC0355Np
    public final InterfaceC0355Np e() {
        this.t = false;
        return this;
    }

    @Override // o.InterfaceC0355Np
    public final InterfaceC0355Np k(List list) {
        this.n = list;
        return this;
    }

    @Override // o.InterfaceC0355Np
    public final InterfaceC0355Np o(InterfaceC1738q4 interfaceC1738q4) {
        if (interfaceC1738q4 != null) {
            this.z = interfaceC1738q4;
            return this;
        }
        a(35);
        throw null;
    }

    @Override // o.InterfaceC0355Np
    public final InterfaceC0355Np p(C0827cE c0827cE) {
        if (c0827cE != null) {
            this.s = c0827cE;
            return this;
        }
        a(17);
        throw null;
    }

    @Override // o.InterfaceC0355Np
    public final InterfaceC0355Np s() {
        this.y = C1318jk.h;
        return this;
    }

    @Override // o.InterfaceC0355Np
    public final InterfaceC0355Np t(C0261Jy c0261Jy) {
        this.q = c0261Jy;
        return this;
    }

    @Override // o.InterfaceC0355Np
    public final InterfaceC0355Np v() {
        this.x = true;
        return this;
    }

    @Override // o.InterfaceC0355Np
    public final InterfaceC0355Np w(int i) {
        if (i != 0) {
            this.m = i;
            return this;
        }
        a(14);
        throw null;
    }

    @Override // o.InterfaceC0355Np
    public final InterfaceC0355Np x(C0244Jh c0244Jh) {
        if (c0244Jh != null) {
            this.k = c0244Jh;
            return this;
        }
        a(12);
        throw null;
    }
}
