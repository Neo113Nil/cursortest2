package o;

import com.google.firebase.messaging.Constants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: o.vk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2109vk extends AbstractC1309jb {
    public final C1968tb n;

    /* renamed from: o, reason: collision with root package name */
    public final C2043uk f235o;
    public final XE p;
    public final InterfaceC1738q4 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2109vk(OT ot, InterfaceC1245ib interfaceC1245ib, JR jr, C0827cE c0827cE, XE xe, InterfaceC1738q4 interfaceC1738q4, IS is) {
        super(ot, interfaceC1245ib, c0827cE, is);
        if (ot == null) {
            F(6);
            throw null;
        }
        if (interfaceC1245ib == null) {
            F(7);
            throw null;
        }
        if (jr == null) {
            F(8);
            throw null;
        }
        if (c0827cE == null) {
            F(9);
            throw null;
        }
        if (xe == null) {
            F(10);
            throw null;
        }
        this.q = interfaceC1738q4;
        this.n = new C1968tb(this, Collections.EMPTY_LIST, Collections.singleton(jr), ot);
        this.f235o = new C2043uk(this, ot);
        this.p = xe;
    }

    public static /* synthetic */ void F(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case 12:
                objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                objArr[0] = "storageManager";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static C2109vk w0(OT ot, InterfaceC1245ib interfaceC1245ib, C0827cE c0827cE, SA sa, InterfaceC1738q4 interfaceC1738q4, IS is) {
        if (ot == null) {
            F(0);
            throw null;
        }
        if (interfaceC1245ib == null) {
            F(1);
            throw null;
        }
        if (c0827cE == null) {
            F(2);
            throw null;
        }
        if (sa != null) {
            return new C2109vk(ot, interfaceC1245ib, interfaceC1245ib.i(), c0827cE, sa, interfaceC1738q4, is);
        }
        F(3);
        throw null;
    }

    @Override // o.InterfaceC1245ib
    public final int B() {
        return 4;
    }

    @Override // o.InterfaceC1245ib
    public final boolean D() {
        return false;
    }

    @Override // o.InterfaceC1245ib
    public final Collection E() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        F(16);
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
        F(23);
        throw null;
    }

    @Override // o.OB
    public final boolean X() {
        return false;
    }

    @Override // o.InterfaceC1245ib, o.OB
    public final int g() {
        return 1;
    }

    @Override // o.W3
    public final InterfaceC1738q4 getAnnotations() {
        InterfaceC1738q4 interfaceC1738q4 = this.q;
        if (interfaceC1738q4 != null) {
            return interfaceC1738q4;
        }
        F(21);
        throw null;
    }

    @Override // o.InterfaceC1245ib, o.InterfaceC1446lg, o.OB
    public final C0244Jh getVisibility() {
        C0244Jh c0244Jh = AbstractC0270Kh.e;
        if (c0244Jh != null) {
            return c0244Jh;
        }
        F(20);
        throw null;
    }

    @Override // o.InterfaceC1245ib
    public final LY h0() {
        return null;
    }

    @Override // o.InterfaceC1245ib
    public final C0981eb i0() {
        return null;
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
        F(22);
        throw null;
    }

    @Override // o.OB
    public final boolean p0() {
        return false;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // o.YC
    public final WB u(C1398ky c1398ky) {
        C2043uk c2043uk = this.f235o;
        if (c2043uk != null) {
            return c2043uk;
        }
        F(14);
        throw null;
    }

    @Override // o.InterfaceC1245ib
    public final boolean y0() {
        return false;
    }

    @Override // o.InterfaceC2364zb
    public final SW z() {
        C1968tb c1968tb = this.n;
        if (c1968tb != null) {
            return c1968tb;
        }
        F(17);
        throw null;
    }
}
