package o;

import com.google.firebase.messaging.Constants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: o.lb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1441lb extends AbstractC1309jb {
    public final int n;

    /* renamed from: o, reason: collision with root package name */
    public final int f195o;
    public final C1968tb p;
    public WB q;
    public Set r;
    public C0981eb s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1441lb(InterfaceC1118gg interfaceC1118gg, C0827cE c0827cE, int i, int i2, List list, OT ot) {
        super(ot, interfaceC1118gg, c0827cE, IS.e);
        if (interfaceC1118gg == null) {
            F(0);
            throw null;
        }
        if (c0827cE == null) {
            F(1);
            throw null;
        }
        if (i == 0) {
            F(2);
            throw null;
        }
        if (i2 == 0) {
            F(3);
            throw null;
        }
        if (ot == null) {
            F(6);
            throw null;
        }
        this.n = i;
        this.f195o = i2;
        this.p = new C1968tb(this, Collections.EMPTY_LIST, list, ot);
    }

    public static /* synthetic */ void F(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "storageManager";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // o.InterfaceC1245ib
    public final int B() {
        int i = this.f195o;
        if (i != 0) {
            return i;
        }
        F(15);
        throw null;
    }

    @Override // o.InterfaceC1245ib
    public final boolean D() {
        return false;
    }

    @Override // o.InterfaceC1245ib
    public final Collection E() {
        Set set = this.r;
        if (set != null) {
            return set;
        }
        F(11);
        throw null;
    }

    @Override // o.InterfaceC1245ib
    public final boolean K() {
        return false;
    }

    @Override // o.InterfaceC1245ib
    public final Collection U() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        F(19);
        throw null;
    }

    @Override // o.OB
    public final boolean X() {
        return false;
    }

    @Override // o.InterfaceC1245ib, o.OB
    public final int g() {
        int i = this.n;
        if (i != 0) {
            return i;
        }
        F(16);
        throw null;
    }

    @Override // o.W3
    public final InterfaceC1738q4 getAnnotations() {
        return C0460Rq.t;
    }

    @Override // o.InterfaceC1245ib, o.InterfaceC1446lg, o.OB
    public final C0244Jh getVisibility() {
        C0244Jh c0244Jh = AbstractC0270Kh.e;
        if (c0244Jh != null) {
            return c0244Jh;
        }
        F(17);
        throw null;
    }

    @Override // o.InterfaceC1245ib
    public final LY h0() {
        return null;
    }

    @Override // o.InterfaceC1245ib
    public final C0981eb i0() {
        return this.s;
    }

    @Override // o.InterfaceC1245ib
    public final boolean j() {
        return false;
    }

    @Override // o.InterfaceC1245ib
    public final WB j0() {
        return VB.b;
    }

    @Override // o.InterfaceC0004Ab
    public final boolean k() {
        return false;
    }

    @Override // o.InterfaceC1245ib
    public final boolean m() {
        return false;
    }

    @Override // o.InterfaceC1245ib, o.InterfaceC0004Ab
    public final List p() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        F(18);
        throw null;
    }

    @Override // o.OB
    public final boolean p0() {
        return false;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // o.YC
    public final WB u(C1398ky c1398ky) {
        WB wb = this.q;
        if (wb != null) {
            return wb;
        }
        F(13);
        throw null;
    }

    public final void w0(WB wb, Set set, C0981eb c0981eb) {
        this.q = wb;
        this.r = set;
        this.s = c0981eb;
    }

    @Override // o.InterfaceC1245ib
    public final boolean y0() {
        return false;
    }

    @Override // o.InterfaceC2364zb
    public final SW z() {
        C1968tb c1968tb = this.p;
        if (c1968tb != null) {
            return c1968tb;
        }
        F(10);
        throw null;
    }
}
