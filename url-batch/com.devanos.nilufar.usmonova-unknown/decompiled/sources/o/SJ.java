package o;

import com.google.firebase.messaging.Constants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SJ extends NJ implements MJ {
    public AbstractC1004ey t;
    public final SJ u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SJ(PJ pj, InterfaceC1738q4 interfaceC1738q4, int i, C0244Jh c0244Jh, boolean z, boolean z2, boolean z3, int i2, SJ sj, IS is) {
        super(i, c0244Jh, pj, interfaceC1738q4, C0827cE.g("<get-" + pj.getName() + ">"), z, z2, z3, i2, is);
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
        if (i2 == 0) {
            A0(4);
            throw null;
        }
        if (is == null) {
            A0(5);
            throw null;
        }
        this.u = sj != null ? sj : this;
    }

    public static /* synthetic */ void A0(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // o.AbstractC1314jg, o.AbstractC1184hg, o.InterfaceC1118gg
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public final SJ a() {
        SJ sj = this.u;
        if (sj != null) {
            return sj;
        }
        A0(8);
        throw null;
    }

    public final void K0(AbstractC1004ey abstractC1004ey) {
        if (abstractC1004ey == null) {
            abstractC1004ey = H0().c();
        }
        this.t = abstractC1004ey;
    }

    @Override // o.InterfaceC2072v9
    public final AbstractC1004ey getReturnType() {
        return this.t;
    }

    @Override // o.InterfaceC2204x9, o.InterfaceC2072v9
    public final Collection o() {
        return I0(true);
    }

    @Override // o.InterfaceC1118gg
    public final Object t(InterfaceC1380kg interfaceC1380kg, Object obj) {
        return interfaceC1380kg.y(this, obj);
    }

    @Override // o.InterfaceC2072v9
    public final List t0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        A0(7);
        throw null;
    }
}
