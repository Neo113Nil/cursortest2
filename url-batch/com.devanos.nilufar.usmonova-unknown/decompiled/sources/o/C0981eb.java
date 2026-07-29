package o;

import com.google.firebase.messaging.Constants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: o.eb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0981eb extends AbstractC0433Qp implements InterfaceC0629Yd {
    public final boolean K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0981eb(InterfaceC1245ib interfaceC1245ib, InterfaceC0629Yd interfaceC0629Yd, InterfaceC1738q4 interfaceC1738q4, boolean z, int i, IS is) {
        super(i, interfaceC1738q4, interfaceC1245ib, interfaceC0629Yd, YS.e, is);
        if (interfaceC1245ib == null) {
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
        if (is == null) {
            A0(3);
            throw null;
        }
        this.K = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i != 21 && i != 27) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                Object[] objArr = new Object[i2];
                switch (i) {
                    case 1:
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    case 8:
                    case 25:
                        objArr[0] = "annotations";
                        break;
                    case 2:
                    case 24:
                        objArr[0] = "kind";
                        break;
                    case 3:
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    case 9:
                    case 26:
                        objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
                        break;
                    case 4:
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 10:
                    case 13:
                        objArr[0] = "unsubstitutedValueParameters";
                        break;
                    case 11:
                    case 14:
                        objArr[0] = "visibility";
                        break;
                    case 12:
                        objArr[0] = "typeParameterDescriptors";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 27:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                        break;
                    case 20:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 22:
                        objArr[0] = "overriddenDescriptors";
                        break;
                    case 23:
                        objArr[0] = "newOwner";
                        break;
                }
                if (i != 21) {
                    objArr[1] = "getOverriddenDescriptors";
                } else if (i != 27) {
                    switch (i) {
                        case 15:
                        case 16:
                            objArr[1] = "calculateContextReceiverParameters";
                            break;
                        case 17:
                            objArr[1] = "getContainingDeclaration";
                            break;
                        case 18:
                            objArr[1] = "getConstructedClass";
                            break;
                        case 19:
                            objArr[1] = "getOriginal";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                            break;
                    }
                } else {
                    objArr[1] = "copy";
                }
                switch (i) {
                    case 4:
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        objArr[2] = "create";
                        break;
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 8:
                    case 9:
                        objArr[2] = "createSynthesized";
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        objArr[2] = "initialize";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 27:
                        break;
                    case 20:
                        objArr[2] = "substitute";
                        break;
                    case 22:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i != 21 && i != 27) {
                    switch (i) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
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
            if (i != 21) {
            }
            switch (i) {
            }
            String format2 = String.format(str, objArr2);
            if (i != 21) {
                switch (i) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 21) {
            switch (i) {
            }
            Object[] objArr22 = new Object[i2];
            switch (i) {
            }
            if (i != 21) {
            }
            switch (i) {
            }
            String format22 = String.format(str, objArr22);
            if (i != 21) {
            }
            throw new IllegalStateException(format22);
        }
        i2 = 2;
        Object[] objArr222 = new Object[i2];
        switch (i) {
        }
        if (i != 21) {
        }
        switch (i) {
        }
        String format222 = String.format(str, objArr222);
        if (i != 21) {
        }
        throw new IllegalStateException(format222);
    }

    @Override // o.InterfaceC0629Yd
    public final boolean H() {
        return this.K;
    }

    @Override // o.InterfaceC0629Yd
    public final InterfaceC1245ib I() {
        InterfaceC1245ib n = n();
        if (n != null) {
            return n;
        }
        A0(18);
        throw null;
    }

    @Override // o.AbstractC0433Qp
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public C0981eb J0(int i, InterfaceC1738q4 interfaceC1738q4, InterfaceC1118gg interfaceC1118gg, InterfaceC0381Op interfaceC0381Op, C0827cE c0827cE, IS is) {
        if (interfaceC1118gg == null) {
            A0(23);
            throw null;
        }
        if (i == 0) {
            A0(24);
            throw null;
        }
        if (interfaceC1738q4 == null) {
            A0(25);
            throw null;
        }
        if (i == 1 || i == 4) {
            return new C0981eb((InterfaceC1245ib) interfaceC1118gg, this, interfaceC1738q4, this.K, 1, is);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC1118gg + "\nkind: " + AbstractC1888sN.w(i));
    }

    @Override // o.AbstractC1314jg, o.InterfaceC1118gg
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1245ib n() {
        InterfaceC1245ib interfaceC1245ib = (InterfaceC1245ib) super.n();
        if (interfaceC1245ib != null) {
            return interfaceC1245ib;
        }
        A0(17);
        throw null;
    }

    @Override // o.AbstractC1314jg, o.AbstractC1184hg, o.InterfaceC1118gg
    /* renamed from: U0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C0981eb a() {
        C0981eb c0981eb = (C0981eb) super.a();
        if (c0981eb != null) {
            return c0981eb;
        }
        A0(19);
        throw null;
    }

    public final void V0(List list, C0244Jh c0244Jh) {
        if (list == null) {
            A0(13);
            throw null;
        }
        if (c0244Jh != null) {
            W0(list, c0244Jh, n().p());
        } else {
            A0(14);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0(List list, C0244Jh c0244Jh, List list2) {
        C0261Jy c0261Jy;
        InterfaceC1245ib n;
        List list3;
        if (list == null) {
            A0(10);
            throw null;
        }
        if (c0244Jh == null) {
            A0(11);
            throw null;
        }
        if (list2 == null) {
            A0(12);
            throw null;
        }
        InterfaceC1245ib n2 = n();
        if (n2.k()) {
            InterfaceC1118gg n3 = n2.n();
            if (n3 instanceof InterfaceC1245ib) {
                c0261Jy = ((InterfaceC1245ib) n3).z0();
                n = n();
                if (n.s0().isEmpty()) {
                    list3 = n.s0();
                    if (list3 == null) {
                        A0(15);
                        throw null;
                    }
                } else {
                    list3 = Collections.EMPTY_LIST;
                    if (list3 == null) {
                        A0(16);
                        throw null;
                    }
                }
                M0(null, c0261Jy, list3, list2, list, null, 1, c0244Jh);
            }
        }
        c0261Jy = null;
        n = n();
        if (n.s0().isEmpty()) {
        }
        M0(null, c0261Jy, list3, list2, list, null, 1, c0244Jh);
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC1106gU
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public final C0981eb e(C2096vX c2096vX) {
        if (c2096vX != null) {
            return (C0981eb) super.e(c2096vX);
        }
        A0(20);
        throw null;
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC2204x9
    public final void c0(Collection collection) {
        if (collection != null) {
            return;
        }
        A0(22);
        throw null;
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC2204x9, o.InterfaceC2072v9
    public final Collection o() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        A0(21);
        throw null;
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC1118gg
    public final Object t(InterfaceC1380kg interfaceC1380kg, Object obj) {
        return interfaceC1380kg.r(this, obj);
    }

    @Override // o.AbstractC0433Qp, o.InterfaceC2204x9
    public final InterfaceC2204x9 y(InterfaceC1245ib interfaceC1245ib, int i, C0244Jh c0244Jh) {
        return (C0981eb) H0(interfaceC1245ib, i, c0244Jh);
    }
}
