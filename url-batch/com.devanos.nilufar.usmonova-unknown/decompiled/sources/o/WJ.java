package o;

import com.google.firebase.messaging.Constants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WJ extends NJ implements MJ {
    public RY t;
    public final WJ u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WJ(PJ pj, InterfaceC1738q4 interfaceC1738q4, int i, C0244Jh c0244Jh, boolean z, boolean z2, boolean z3, int i2, WJ wj, IS is) {
        super(i, c0244Jh, pj, interfaceC1738q4, C0827cE.g("<set-" + pj.getName() + ">"), z, z2, z3, i2, is);
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
        this.u = wj != null ? wj : this;
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "initialize";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static RY J0(WJ wj, AbstractC1004ey abstractC1004ey, InterfaceC1738q4 interfaceC1738q4) {
        if (abstractC1004ey == null) {
            A0(8);
            throw null;
        }
        if (interfaceC1738q4 != null) {
            return new RY(wj, null, 0, interfaceC1738q4, YS.g, abstractC1004ey, false, false, false, null, IS.e);
        }
        A0(9);
        throw null;
    }

    @Override // o.AbstractC1314jg, o.AbstractC1184hg, o.InterfaceC1118gg
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public final WJ a() {
        WJ wj = this.u;
        if (wj != null) {
            return wj;
        }
        A0(13);
        throw null;
    }

    @Override // o.InterfaceC2072v9
    public final AbstractC1004ey getReturnType() {
        return AbstractC0192Hh.e(this).w();
    }

    @Override // o.InterfaceC2204x9, o.InterfaceC2072v9
    public final Collection o() {
        return I0(false);
    }

    @Override // o.InterfaceC1118gg
    public final Object t(InterfaceC1380kg interfaceC1380kg, Object obj) {
        return interfaceC1380kg.l(this, obj);
    }

    @Override // o.InterfaceC2072v9
    public final List t0() {
        RY ry = this.t;
        if (ry == null) {
            throw new IllegalStateException();
        }
        List singletonList = Collections.singletonList(ry);
        if (singletonList != null) {
            return singletonList;
        }
        A0(11);
        throw null;
    }
}
