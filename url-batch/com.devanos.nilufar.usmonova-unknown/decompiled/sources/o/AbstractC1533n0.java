package o;

import com.google.firebase.messaging.Constants;
import java.util.List;

/* renamed from: o.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1533n0 extends AbstractC1314jg implements InterfaceC1437lX {
    public final int l;
    public final boolean m;
    public final int n;

    /* renamed from: o, reason: collision with root package name */
    public final SA f200o;
    public final SA p;
    public final VA q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1533n0(OT ot, InterfaceC1118gg interfaceC1118gg, InterfaceC1738q4 interfaceC1738q4, C0827cE c0827cE, int i, boolean z, int i2, C1097gL c1097gL) {
        super(interfaceC1118gg, interfaceC1738q4, c0827cE, IS.e);
        if (ot == null) {
            A0(0);
            throw null;
        }
        if (interfaceC1118gg == null) {
            A0(1);
            throw null;
        }
        if (interfaceC1738q4 == null) {
            A0(2);
            throw null;
        }
        if (c0827cE == null) {
            A0(3);
            throw null;
        }
        if (i == 0) {
            A0(4);
            throw null;
        }
        if (c1097gL == null) {
            A0(6);
            throw null;
        }
        this.l = i;
        this.m = z;
        this.n = i2;
        C1269j0 c1269j0 = new C1269j0(this, ot, c1097gL);
        VA va = (VA) ot;
        this.f200o = new SA(va, c1269j0);
        this.p = new SA(va, new C1401l0(this, 0, c0827cE));
        this.q = va;
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        switch (i) {
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
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
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "supertypeLoopChecker";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // o.InterfaceC1437lX
    public final OT A() {
        VA va = this.q;
        if (va != null) {
            return va;
        }
        A0(14);
        throw null;
    }

    public abstract List I0();

    @Override // o.InterfaceC1437lX
    public final boolean O() {
        return false;
    }

    @Override // o.InterfaceC1437lX
    public final boolean P() {
        return this.m;
    }

    @Override // o.InterfaceC1437lX
    public final int Y() {
        int i = this.l;
        if (i != 0) {
            return i;
        }
        A0(7);
        throw null;
    }

    @Override // o.AbstractC1314jg, o.AbstractC1184hg, o.InterfaceC1118gg
    public final InterfaceC2364zb a() {
        return this;
    }

    @Override // o.InterfaceC1437lX
    public final int getIndex() {
        return this.n;
    }

    @Override // o.InterfaceC1437lX
    public final List getUpperBounds() {
        List d = ((C1467m0) z()).d();
        if (d != null) {
            return d;
        }
        A0(8);
        throw null;
    }

    @Override // o.InterfaceC2364zb
    public final JR i() {
        JR jr = (JR) this.p.invoke();
        if (jr != null) {
            return jr;
        }
        A0(10);
        throw null;
    }

    @Override // o.InterfaceC1118gg
    public final Object t(InterfaceC1380kg interfaceC1380kg, Object obj) {
        return interfaceC1380kg.a(this, obj);
    }

    @Override // o.InterfaceC2364zb
    public final SW z() {
        SW sw = (SW) this.f200o.invoke();
        if (sw != null) {
            return sw;
        }
        A0(9);
        throw null;
    }

    @Override // o.AbstractC1314jg, o.AbstractC1184hg, o.InterfaceC1118gg
    public final InterfaceC1118gg a() {
        return this;
    }

    @Override // o.AbstractC1314jg, o.AbstractC1184hg, o.InterfaceC1118gg
    public final InterfaceC1437lX a() {
        return this;
    }

    @Override // o.AbstractC1314jg
    /* renamed from: G0 */
    public final InterfaceC1249ig a() {
        return this;
    }

    public List H0(List list) {
        return list;
    }
}
