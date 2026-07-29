package o;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class NJ extends AbstractC1314jg implements MJ {
    public boolean l;
    public final boolean m;
    public final int n;

    /* renamed from: o, reason: collision with root package name */
    public final PJ f70o;
    public final boolean p;
    public final int q;
    public C0244Jh r;
    public InterfaceC0381Op s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NJ(int i, C0244Jh c0244Jh, PJ pj, InterfaceC1738q4 interfaceC1738q4, C0827cE c0827cE, boolean z, boolean z2, boolean z3, int i2, IS is) {
        super(pj.n(), interfaceC1738q4, c0827cE, is);
        if (i == 0) {
            A0(0);
            throw null;
        }
        if (c0244Jh == null) {
            A0(1);
            throw null;
        }
        if (interfaceC1738q4 == null) {
            A0(3);
            throw null;
        }
        if (is == null) {
            A0(5);
            throw null;
        }
        this.s = null;
        this.n = i;
        this.r = c0244Jh;
        this.f70o = pj;
        this.l = z;
        this.m = z2;
        this.p = z3;
        this.q = i2;
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        switch (i) {
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "getKind";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(format);
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // o.InterfaceC2072v9
    public final Object C(C0633Yh c0633Yh) {
        return null;
    }

    public final PJ H0() {
        PJ pj = this.f70o;
        if (pj != null) {
            return pj;
        }
        A0(13);
        throw null;
    }

    public final ArrayList I0(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (PJ pj : H0().o()) {
            OB getter = z ? pj.getGetter() : pj.b();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC2072v9
    public final C0261Jy J() {
        return H0().J();
    }

    @Override // o.InterfaceC2204x9
    public final int M() {
        int i = this.q;
        if (i != 0) {
            return i;
        }
        A0(6);
        throw null;
    }

    @Override // o.InterfaceC2072v9
    public final boolean Q() {
        return false;
    }

    @Override // o.InterfaceC2072v9
    public final List T() {
        List T = H0().T();
        if (T != null) {
            return T;
        }
        A0(14);
        throw null;
    }

    @Override // o.OB
    public final boolean X() {
        return false;
    }

    @Override // o.InterfaceC0381Op
    public final boolean b0() {
        return false;
    }

    @Override // o.InterfaceC2204x9
    public final void c0(Collection collection) {
        if (collection != null) {
            return;
        }
        A0(16);
        throw null;
    }

    @Override // o.InterfaceC0381Op, o.InterfaceC1106gU
    public final InterfaceC0381Op e(C2096vX c2096vX) {
        if (c2096vX != null) {
            return this;
        }
        A0(7);
        throw null;
    }

    @Override // o.InterfaceC0381Op
    public final boolean e0() {
        return false;
    }

    @Override // o.InterfaceC0381Op
    public final boolean f0() {
        return false;
    }

    @Override // o.OB
    public final int g() {
        int i = this.n;
        if (i != 0) {
            return i;
        }
        A0(10);
        throw null;
    }

    @Override // o.InterfaceC2072v9
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        A0(9);
        throw null;
    }

    @Override // o.InterfaceC1446lg, o.OB
    public final C0244Jh getVisibility() {
        C0244Jh c0244Jh = this.r;
        if (c0244Jh != null) {
            return c0244Jh;
        }
        A0(11);
        throw null;
    }

    @Override // o.InterfaceC0381Op
    public final boolean isSuspend() {
        return false;
    }

    @Override // o.InterfaceC0381Op
    public final boolean l0() {
        return false;
    }

    @Override // o.InterfaceC0381Op
    public final boolean m() {
        return this.p;
    }

    @Override // o.OB
    public final boolean p0() {
        return false;
    }

    @Override // o.InterfaceC0381Op
    public final boolean u0() {
        return false;
    }

    @Override // o.InterfaceC0381Op
    public final InterfaceC0381Op v() {
        return this.s;
    }

    @Override // o.OB
    public final boolean w() {
        return this.m;
    }

    @Override // o.InterfaceC2072v9
    public final C0261Jy x() {
        return H0().x();
    }

    @Override // o.InterfaceC2204x9
    public final InterfaceC2204x9 y(InterfaceC1245ib interfaceC1245ib, int i, C0244Jh c0244Jh) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // o.InterfaceC1106gU
    public final /* bridge */ /* synthetic */ InterfaceC1249ig e(C2096vX c2096vX) {
        e(c2096vX);
        return this;
    }
}
