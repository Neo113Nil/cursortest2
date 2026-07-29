package o;

import com.google.firebase.database.core.ValidationPath;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: o.Eh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0114Eh {
    public static final /* synthetic */ int a = 0;

    static {
        new C2245xo("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static void b(InterfaceC2072v9 interfaceC2072v9, LinkedHashSet linkedHashSet) {
        if (interfaceC2072v9 == null) {
            a(73);
            throw null;
        }
        if (linkedHashSet.contains(interfaceC2072v9)) {
            return;
        }
        Iterator it = interfaceC2072v9.a().o().iterator();
        while (it.hasNext()) {
            InterfaceC2072v9 a2 = ((InterfaceC2072v9) it.next()).a();
            b(a2, linkedHashSet);
            linkedHashSet.add(a2);
        }
    }

    public static InterfaceC1245ib c(AbstractC1004ey abstractC1004ey) {
        if (abstractC1004ey == null) {
            a(45);
            throw null;
        }
        SW B0 = abstractC1004ey.B0();
        if (B0 == null) {
            a(46);
            throw null;
        }
        InterfaceC1245ib interfaceC1245ib = (InterfaceC1245ib) B0.c();
        if (interfaceC1245ib != null) {
            return interfaceC1245ib;
        }
        a(47);
        throw null;
    }

    public static InterfaceC0761bD d(InterfaceC1118gg interfaceC1118gg) {
        if (interfaceC1118gg == null) {
            a(21);
            throw null;
        }
        InterfaceC0761bD e = e(interfaceC1118gg);
        if (e != null) {
            return e;
        }
        a(22);
        throw null;
    }

    public static InterfaceC0761bD e(InterfaceC1118gg interfaceC1118gg) {
        if (interfaceC1118gg == null) {
            a(23);
            throw null;
        }
        while (interfaceC1118gg != null) {
            if (interfaceC1118gg instanceof InterfaceC0761bD) {
                return (InterfaceC0761bD) interfaceC1118gg;
            }
            if (interfaceC1118gg instanceof InterfaceC1289jH) {
                return ((C1465lz) ((InterfaceC1289jH) interfaceC1118gg)).j;
            }
            interfaceC1118gg = interfaceC1118gg.n();
        }
        return null;
    }

    public static C1623oL f(InterfaceC1118gg interfaceC1118gg) {
        C1623oL c1623oL = C1623oL.m;
        if (interfaceC1118gg == null) {
            a(82);
            throw null;
        }
        if (interfaceC1118gg instanceof WJ) {
            interfaceC1118gg = ((WJ) interfaceC1118gg).H0();
        }
        if (interfaceC1118gg instanceof InterfaceC1249ig) {
            ((InterfaceC1249ig) interfaceC1118gg).d().getClass();
        }
        return c1623oL;
    }

    public static C2377zo g(InterfaceC1118gg interfaceC1118gg) {
        if (interfaceC1118gg != null) {
            C2245xo h = h(interfaceC1118gg);
            return h != null ? h.i() : g(interfaceC1118gg.n()).b(interfaceC1118gg.getName());
        }
        a(2);
        throw null;
    }

    public static C2245xo h(InterfaceC1118gg interfaceC1118gg) {
        if (interfaceC1118gg == null) {
            a(5);
            throw null;
        }
        if ((interfaceC1118gg instanceof InterfaceC0761bD) || C0273Kk.f(interfaceC1118gg)) {
            return C2245xo.c;
        }
        if (interfaceC1118gg instanceof InterfaceC1289jH) {
            return ((C1465lz) ((InterfaceC1289jH) interfaceC1118gg)).k;
        }
        if (interfaceC1118gg instanceof InterfaceC0961eH) {
            return ((AbstractC1027fH) ((InterfaceC0961eH) interfaceC1118gg)).l;
        }
        return null;
    }

    public static InterfaceC1118gg i(InterfaceC1118gg interfaceC1118gg, Class cls, boolean z) {
        if (interfaceC1118gg == null) {
            return null;
        }
        if (z) {
            interfaceC1118gg = interfaceC1118gg.n();
        }
        while (interfaceC1118gg != null) {
            if (cls.isInstance(interfaceC1118gg)) {
                return interfaceC1118gg;
            }
            interfaceC1118gg = interfaceC1118gg.n();
        }
        return null;
    }

    public static InterfaceC1245ib j(InterfaceC1245ib interfaceC1245ib) {
        if (interfaceC1245ib == null) {
            a(44);
            throw null;
        }
        Iterator it = interfaceC1245ib.z().d().iterator();
        while (it.hasNext()) {
            InterfaceC1245ib c = c((AbstractC1004ey) it.next());
            if (c.B() != 2) {
                return c;
            }
        }
        return null;
    }

    public static boolean k(InterfaceC1118gg interfaceC1118gg) {
        return n(interfaceC1118gg, 1) && interfaceC1118gg.getName().equals(YS.a);
    }

    public static boolean l(InterfaceC1118gg interfaceC1118gg) {
        return n(interfaceC1118gg, 6) && ((InterfaceC1245ib) interfaceC1118gg).D();
    }

    public static boolean m(InterfaceC1118gg interfaceC1118gg) {
        if (interfaceC1118gg != null) {
            return n(interfaceC1118gg, 4);
        }
        a(36);
        throw null;
    }

    public static boolean n(InterfaceC1118gg interfaceC1118gg, int i) {
        if (i != 0) {
            return (interfaceC1118gg instanceof InterfaceC1245ib) && ((InterfaceC1245ib) interfaceC1118gg).B() == i;
        }
        a(37);
        throw null;
    }

    public static boolean o(InterfaceC1118gg interfaceC1118gg) {
        if (interfaceC1118gg == null) {
            a(1);
            throw null;
        }
        while (interfaceC1118gg != null) {
            if (k(interfaceC1118gg) || ((interfaceC1118gg instanceof InterfaceC1446lg) && ((InterfaceC1446lg) interfaceC1118gg).getVisibility() == AbstractC0270Kh.f)) {
                return true;
            }
            interfaceC1118gg = interfaceC1118gg.n();
        }
        return false;
    }

    public static boolean p(AbstractC1004ey abstractC1004ey, InterfaceC1118gg interfaceC1118gg) {
        if (abstractC1004ey == null) {
            a(30);
            throw null;
        }
        if (interfaceC1118gg == null) {
            a(31);
            throw null;
        }
        InterfaceC2364zb c = abstractC1004ey.B0().c();
        if (c == null) {
            return false;
        }
        InterfaceC1118gg a2 = c.a();
        return (a2 instanceof InterfaceC2364zb) && (interfaceC1118gg instanceof InterfaceC2364zb) && ((InterfaceC2364zb) interfaceC1118gg).z().equals(((InterfaceC2364zb) a2).z());
    }

    public static boolean q(InterfaceC1118gg interfaceC1118gg) {
        return (n(interfaceC1118gg, 1) || n(interfaceC1118gg, 2)) && ((InterfaceC1245ib) interfaceC1118gg).g() == 2;
    }

    public static boolean r(AbstractC1004ey abstractC1004ey, InterfaceC1118gg interfaceC1118gg) {
        if (abstractC1004ey == null) {
            a(32);
            throw null;
        }
        if (interfaceC1118gg == null) {
            a(33);
            throw null;
        }
        if (p(abstractC1004ey, interfaceC1118gg)) {
            return true;
        }
        Iterator it = abstractC1004ey.B0().d().iterator();
        while (it.hasNext()) {
            if (r((AbstractC1004ey) it.next(), interfaceC1118gg)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(InterfaceC1118gg interfaceC1118gg) {
        return interfaceC1118gg != null && (interfaceC1118gg.n() instanceof InterfaceC0961eH);
    }

    public static InterfaceC2204x9 t(InterfaceC2204x9 interfaceC2204x9) {
        if (interfaceC2204x9 == null) {
            a(59);
            throw null;
        }
        while (interfaceC2204x9.M() == 2) {
            Collection o2 = interfaceC2204x9.o();
            if (o2.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + interfaceC2204x9);
            }
            interfaceC2204x9 = (InterfaceC2204x9) o2.iterator().next();
        }
        return interfaceC2204x9;
    }
}
