package o;

import com.google.firebase.database.core.ValidationPath;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.xX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2228xX {
    public static final C0195Hk a = C0273Kk.c(EnumC0247Jk.s, new String[0]);
    public static final C0195Hk b = C0273Kk.c(EnumC0247Jk.p, new String[0]);
    public static final C2162wX c = new C2162wX("NO_EXPECTED_TYPE");
    public static final C2162wX d = new C2162wX("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Removed duplicated region for block: B:107:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
                switch (i) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
                Object[] objArr = new Object[i2];
                switch (i) {
                    case 4:
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 9:
                    case 11:
                    case 15:
                    case 17:
                    case 19:
                    case 26:
                    case 35:
                    case 48:
                    case 53:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    case 8:
                    case 10:
                    case 18:
                    case 23:
                    case 25:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 38:
                    case 40:
                    default:
                        objArr[0] = "type";
                        break;
                    case 12:
                        objArr[0] = "typeConstructor";
                        break;
                    case 13:
                        objArr[0] = "unsubstitutedMemberScope";
                        break;
                    case 14:
                        objArr[0] = "refinedTypeFactory";
                        break;
                    case 16:
                        objArr[0] = "parameters";
                        break;
                    case 20:
                        objArr[0] = "subType";
                        break;
                    case 21:
                        objArr[0] = "superType";
                        break;
                    case 22:
                        objArr[0] = "substitutor";
                        break;
                    case 24:
                        objArr[0] = "result";
                        break;
                    case 31:
                    case 33:
                        objArr[0] = "clazz";
                        break;
                    case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                        objArr[0] = "typeArguments";
                        break;
                    case 34:
                        objArr[0] = "projections";
                        break;
                    case 36:
                        objArr[0] = "a";
                        break;
                    case 37:
                        objArr[0] = "b";
                        break;
                    case 39:
                        objArr[0] = "typeParameters";
                        break;
                    case 41:
                        objArr[0] = "typeParameterConstructors";
                        break;
                    case 42:
                        objArr[0] = "specialType";
                        break;
                    case 43:
                    case 44:
                        objArr[0] = "isSpecialType";
                        break;
                    case 45:
                    case 46:
                        objArr[0] = "parameterDescriptor";
                        break;
                    case 47:
                    case 51:
                        objArr[0] = "numberValueTypeConstructor";
                        break;
                    case 49:
                    case 50:
                        objArr[0] = "supertypes";
                        break;
                    case 52:
                    case 55:
                        objArr[0] = "expectedType";
                        break;
                    case 54:
                        objArr[0] = "literalTypeConstructor";
                        break;
                }
                if (i == 4) {
                    if (i != 9) {
                        if (i == 11 || i == 15) {
                            objArr[1] = "makeUnsubstitutedType";
                        } else if (i == 17) {
                            objArr[1] = "getDefaultTypeProjections";
                        } else if (i == 19) {
                            objArr[1] = "getImmediateSupertypes";
                        } else if (i == 26) {
                            objArr[1] = "getAllSupertypes";
                        } else if (i == 35) {
                            objArr[1] = "substituteProjectionsForParameters";
                        } else if (i != 48) {
                            if (i != 53) {
                                if (i != 6 && i != 7) {
                                    switch (i) {
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                            break;
                                    }
                                }
                            }
                            objArr[1] = "getPrimitiveNumberType";
                        } else {
                            objArr[1] = "getDefaultPrimitiveNumberType";
                        }
                    }
                    objArr[1] = "makeNullableIfNeeded";
                } else {
                    objArr[1] = "makeNullableAsSpecified";
                }
                switch (i) {
                    case 1:
                        objArr[2] = "makeNullable";
                        break;
                    case 2:
                        objArr[2] = "makeNotNullable";
                        break;
                    case 3:
                        objArr[2] = "makeNullableAsSpecified";
                        break;
                    case 4:
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 9:
                    case 11:
                    case 15:
                    case 17:
                    case 19:
                    case 26:
                    case 35:
                    case 48:
                    case 53:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    case 8:
                        objArr[2] = "makeNullableIfNeeded";
                        break;
                    case 10:
                        objArr[2] = "canHaveSubtypes";
                        break;
                    case 12:
                    case 13:
                    case 14:
                        objArr[2] = "makeUnsubstitutedType";
                        break;
                    case 16:
                        objArr[2] = "getDefaultTypeProjections";
                        break;
                    case 18:
                        objArr[2] = "getImmediateSupertypes";
                        break;
                    case 20:
                    case 21:
                    case 22:
                        objArr[2] = "createSubstitutedSupertype";
                        break;
                    case 23:
                    case 24:
                        objArr[2] = "collectAllSupertypes";
                        break;
                    case 25:
                        objArr[2] = "getAllSupertypes";
                        break;
                    case 27:
                        objArr[2] = "isNullableType";
                        break;
                    case 28:
                        objArr[2] = "acceptsNullable";
                        break;
                    case 29:
                        objArr[2] = "hasNullableSuperType";
                        break;
                    case 30:
                        objArr[2] = "getClassDescriptor";
                        break;
                    case 31:
                    case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                        objArr[2] = "substituteParameters";
                        break;
                    case 33:
                    case 34:
                        objArr[2] = "substituteProjectionsForParameters";
                        break;
                    case 36:
                    case 37:
                        objArr[2] = "equalTypes";
                        break;
                    case 38:
                    case 39:
                        objArr[2] = "dependsOnTypeParameters";
                        break;
                    case 40:
                    case 41:
                        objArr[2] = "dependsOnTypeConstructors";
                        break;
                    case 42:
                    case 43:
                    case 44:
                        objArr[2] = "contains";
                        break;
                    case 45:
                    case 46:
                        objArr[2] = "makeStarProjection";
                        break;
                    case 47:
                    case 49:
                        objArr[2] = "getDefaultPrimitiveNumberType";
                        break;
                    case 50:
                        objArr[2] = "findByFqName";
                        break;
                    case 51:
                    case 52:
                    case 54:
                    case 55:
                        objArr[2] = "getPrimitiveNumberType";
                        break;
                    case 60:
                        objArr[2] = "isTypeParameter";
                        break;
                    case 61:
                        objArr[2] = "isReifiedTypeParameter";
                        break;
                    case 62:
                        objArr[2] = "isNonReifiedTypeParameter";
                        break;
                    case 63:
                        objArr[2] = "getTypeParameterDescriptorOrNull";
                        break;
                    default:
                        objArr[2] = "noExpectedType";
                        break;
                }
                String format = String.format(str, objArr);
                if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
                    switch (i) {
                        case 56:
                        case 57:
                        case 58:
                        case 59:
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
            if (i == 4) {
            }
            switch (i) {
            }
            String format2 = String.format(str, objArr2);
            if (i != 4) {
                switch (i) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 4) {
            switch (i) {
            }
            Object[] objArr22 = new Object[i2];
            switch (i) {
            }
            if (i == 4) {
            }
            switch (i) {
            }
            String format22 = String.format(str, objArr22);
            if (i != 4) {
            }
            throw new IllegalStateException(format22);
        }
        i2 = 2;
        Object[] objArr222 = new Object[i2];
        switch (i) {
        }
        if (i == 4) {
        }
        switch (i) {
        }
        String format222 = String.format(str, objArr222);
        if (i != 4) {
        }
        throw new IllegalStateException(format222);
    }

    public static boolean b(AbstractC1004ey abstractC1004ey) {
        if (abstractC1004ey == null) {
            a(28);
            throw null;
        }
        if (abstractC1004ey.C0()) {
            return true;
        }
        return AbstractC0868ct.E(abstractC1004ey) && b(((AbstractC1782qm) abstractC1004ey.E0()).j);
    }

    public static boolean c(AbstractC1004ey abstractC1004ey, InterfaceC2114vp interfaceC2114vp, C1630oS c1630oS) {
        if (abstractC1004ey == null) {
            return false;
        }
        AbstractC2097vY E0 = abstractC1004ey.E0();
        if (l(abstractC1004ey)) {
            return ((Boolean) interfaceC2114vp.invoke(E0)).booleanValue();
        }
        if (c1630oS != null && c1630oS.contains(abstractC1004ey)) {
            return false;
        }
        if (((Boolean) interfaceC2114vp.invoke(E0)).booleanValue()) {
            return true;
        }
        if (c1630oS == null) {
            c1630oS = new C1630oS();
        }
        c1630oS.add(abstractC1004ey);
        AbstractC1782qm abstractC1782qm = E0 instanceof AbstractC1782qm ? (AbstractC1782qm) E0 : null;
        if (abstractC1782qm != null && (c(abstractC1782qm.i, interfaceC2114vp, c1630oS) || c(abstractC1782qm.j, interfaceC2114vp, c1630oS))) {
            return true;
        }
        if ((E0 instanceof C0632Yg) && c(((C0632Yg) E0).i, interfaceC2114vp, c1630oS)) {
            return true;
        }
        SW B0 = abstractC1004ey.B0();
        if (B0 instanceof C2382zt) {
            Iterator it = ((C2382zt) B0).b.iterator();
            while (it.hasNext()) {
                if (c((AbstractC1004ey) it.next(), interfaceC2114vp, c1630oS)) {
                    return true;
                }
            }
            return false;
        }
        for (AbstractC1701pX abstractC1701pX : abstractC1004ey.w0()) {
            if (!abstractC1701pX.c() && c(abstractC1701pX.b(), interfaceC2114vp, c1630oS)) {
                return true;
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1767qX(((InterfaceC1437lX) it.next()).i()));
        }
        return AbstractC0720ac.J0(arrayList);
    }

    public static boolean e(AbstractC1004ey abstractC1004ey) {
        if (abstractC1004ey == null) {
            a(27);
            throw null;
        }
        if (!abstractC1004ey.C0() && (!AbstractC0868ct.E(abstractC1004ey) || !e(((AbstractC1782qm) abstractC1004ey.E0()).j))) {
            if (!(abstractC1004ey.E0() instanceof C0632Yg)) {
                if (f(abstractC1004ey)) {
                    if (!(abstractC1004ey.B0().c() instanceof InterfaceC1245ib)) {
                        C2096vX d2 = C2096vX.d(abstractC1004ey);
                        Collection<AbstractC1004ey> d3 = abstractC1004ey.B0().d();
                        ArrayList arrayList = new ArrayList(d3.size());
                        for (AbstractC1004ey abstractC1004ey2 : d3) {
                            if (abstractC1004ey2 == null) {
                                a(21);
                                throw null;
                            }
                            AbstractC1004ey i = d2.i(1, abstractC1004ey2);
                            AbstractC1004ey h = i != null ? h(i, abstractC1004ey.C0()) : null;
                            if (h != null) {
                                arrayList.add(h);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (e((AbstractC1004ey) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                SW B0 = abstractC1004ey.B0();
                if (B0 instanceof C2382zt) {
                    Iterator it2 = ((C2382zt) B0).b.iterator();
                    while (it2.hasNext()) {
                        if (e((AbstractC1004ey) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(AbstractC1004ey abstractC1004ey) {
        if (abstractC1004ey == null) {
            a(60);
            throw null;
        }
        if ((abstractC1004ey.B0().c() instanceof InterfaceC1437lX ? (InterfaceC1437lX) abstractC1004ey.B0().c() : null) != null) {
            return true;
        }
        abstractC1004ey.B0();
        return false;
    }

    public static AbstractC2097vY g(AbstractC1004ey abstractC1004ey, boolean z) {
        if (abstractC1004ey == null) {
            a(3);
            throw null;
        }
        AbstractC2097vY F0 = abstractC1004ey.E0().F0(z);
        if (F0 != null) {
            return F0;
        }
        a(4);
        throw null;
    }

    public static AbstractC1004ey h(AbstractC1004ey abstractC1004ey, boolean z) {
        if (abstractC1004ey != null) {
            return z ? g(abstractC1004ey, true) : abstractC1004ey;
        }
        a(8);
        throw null;
    }

    public static JR i(JR jr, boolean z) {
        if (jr == null) {
            a(5);
            throw null;
        }
        if (!z) {
            return jr;
        }
        JR F0 = jr.F0(true);
        if (F0 != null) {
            return F0;
        }
        a(6);
        throw null;
    }

    public static C1631oT j(InterfaceC1437lX interfaceC1437lX) {
        if (interfaceC1437lX != null) {
            return new C1631oT(interfaceC1437lX);
        }
        a(45);
        throw null;
    }

    public static AbstractC1701pX k(InterfaceC1437lX interfaceC1437lX, C1658ou c1658ou) {
        if (interfaceC1437lX != null) {
            return c1658ou.a == 1 ? new C1767qX(1, DY.r(interfaceC1437lX)) : new C1631oT(interfaceC1437lX);
        }
        a(46);
        throw null;
    }

    public static boolean l(AbstractC1004ey abstractC1004ey) {
        if (abstractC1004ey != null) {
            return abstractC1004ey == c || abstractC1004ey == d;
        }
        a(0);
        throw null;
    }
}
