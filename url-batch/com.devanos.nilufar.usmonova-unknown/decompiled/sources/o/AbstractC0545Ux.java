package o;

import com.google.firebase.database.core.ValidationPath;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: o.Ux, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0545Ux {
    public static final C0827cE e = C0827cE.g("<built-ins module>");
    public C0826cD a;
    public final SA b;
    public final PA c;
    public final VA d;

    public AbstractC0545Ux(VA va) {
        this.d = va;
        va.a(new C0493Sx(this, 0));
        this.b = new SA(va, new C0493Sx(this, 1));
        this.c = va.b(new C1466m(2, this));
    }

    public static boolean A(AbstractC1004ey abstractC1004ey, C2377zo c2377zo) {
        if (abstractC1004ey == null) {
            a(97);
            throw null;
        }
        if (c2377zo != null) {
            return H(abstractC1004ey.B0(), c2377zo);
        }
        a(98);
        throw null;
    }

    public static boolean B(AbstractC1004ey abstractC1004ey, C2377zo c2377zo) {
        if (c2377zo != null) {
            return A(abstractC1004ey, c2377zo) && !abstractC1004ey.C0();
        }
        a(135);
        throw null;
    }

    public static boolean C(InterfaceC0381Op interfaceC0381Op) {
        if (interfaceC0381Op.a().getAnnotations().i(AbstractC1433lT.m)) {
            return true;
        }
        if (!(interfaceC0381Op instanceof PJ)) {
            return false;
        }
        PJ pj = (PJ) interfaceC0381Op;
        boolean G = pj.G();
        SJ getter = pj.getGetter();
        WJ b = pj.b();
        if (getter == null || !C(getter)) {
            return false;
        }
        if (G) {
            return b != null && C(b);
        }
        return true;
    }

    public static boolean D(AbstractC1004ey abstractC1004ey, C2377zo c2377zo) {
        if (abstractC1004ey == null) {
            a(105);
            throw null;
        }
        if (c2377zo != null) {
            return !abstractC1004ey.C0() && A(abstractC1004ey, c2377zo);
        }
        a(106);
        throw null;
    }

    public static boolean E(AbstractC1004ey abstractC1004ey) {
        if (abstractC1004ey == null) {
            a(136);
            throw null;
        }
        if (abstractC1004ey != null) {
            return A(abstractC1004ey, AbstractC1433lT.b) && !AbstractC2228xX.e(abstractC1004ey);
        }
        a(138);
        throw null;
    }

    public static boolean F(AbstractC1004ey abstractC1004ey) {
        if (abstractC1004ey == null) {
            a(94);
            throw null;
        }
        if (abstractC1004ey.C0()) {
            return false;
        }
        InterfaceC2364zb c = abstractC1004ey.B0().c();
        if (!(c instanceof InterfaceC1245ib)) {
            return false;
        }
        InterfaceC1245ib interfaceC1245ib = (InterfaceC1245ib) c;
        if (interfaceC1245ib != null) {
            return t(interfaceC1245ib) != null;
        }
        a(96);
        throw null;
    }

    public static boolean G(AbstractC1004ey abstractC1004ey) {
        return D(abstractC1004ey, AbstractC1433lT.f);
    }

    public static boolean H(SW sw, C2377zo c2377zo) {
        if (sw == null) {
            a(101);
            throw null;
        }
        if (c2377zo != null) {
            InterfaceC2364zb c = sw.c();
            return (c instanceof InterfaceC1245ib) && b((InterfaceC1245ib) c, c2377zo);
        }
        a(102);
        throw null;
    }

    public static boolean I(InterfaceC2364zb interfaceC2364zb) {
        if (interfaceC2364zb == null) {
            a(10);
            throw null;
        }
        for (InterfaceC2364zb interfaceC2364zb2 = interfaceC2364zb; interfaceC2364zb2 != null; interfaceC2364zb2 = interfaceC2364zb2.n()) {
            if (interfaceC2364zb2 instanceof InterfaceC0961eH) {
                return ((AbstractC1027fH) ((InterfaceC0961eH) interfaceC2364zb2)).l.h(AbstractC1499mT.i);
            }
        }
        return false;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 3:
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 3:
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i2 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 162:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "getStorageManager";
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 3:
            case 4:
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(format);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean b(InterfaceC1245ib interfaceC1245ib, C2377zo c2377zo) {
        if (interfaceC1245ib == null) {
            a(103);
            throw null;
        }
        if (c2377zo != null) {
            return interfaceC1245ib.getName().equals(c2377zo.f()) && c2377zo.equals(AbstractC0114Eh.g(interfaceC1245ib));
        }
        a(104);
        throw null;
    }

    public static EnumC1423lJ r(InterfaceC2364zb interfaceC2364zb) {
        if (interfaceC2364zb == null) {
            a(77);
            throw null;
        }
        if (AbstractC1433lT.a0.contains(interfaceC2364zb.getName())) {
            return (EnumC1423lJ) AbstractC1433lT.c0.get(AbstractC0114Eh.g(interfaceC2364zb));
        }
        return null;
    }

    public static EnumC1423lJ t(InterfaceC1245ib interfaceC1245ib) {
        if (interfaceC1245ib == null) {
            a(76);
            throw null;
        }
        if (AbstractC1433lT.Z.contains(interfaceC1245ib.getName())) {
            return (EnumC1423lJ) AbstractC1433lT.b0.get(AbstractC0114Eh.g(interfaceC1245ib));
        }
        return null;
    }

    public static boolean x(AbstractC1004ey abstractC1004ey) {
        if (abstractC1004ey != null) {
            return A(abstractC1004ey, AbstractC1433lT.a);
        }
        a(139);
        throw null;
    }

    public static boolean y(AbstractC1004ey abstractC1004ey) {
        if (abstractC1004ey != null) {
            return A(abstractC1004ey, AbstractC1433lT.g);
        }
        a(88);
        throw null;
    }

    public static boolean z(InterfaceC1118gg interfaceC1118gg) {
        if (interfaceC1118gg != null) {
            return AbstractC0114Eh.i(interfaceC1118gg, W8.class, false) != null;
        }
        a(9);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, o.Iy] */
    public final void c() {
        C0827cE c0827cE = e;
        AbstractC0048Bt.n(c0827cE, "moduleName");
        VA va = this.d;
        C0826cD c0826cD = new C0826cD(c0827cE, va, this, 48);
        this.a = c0826cD;
        T8.a.getClass();
        T8 t8 = (T8) S8.b.getValue();
        C0826cD c0826cD2 = this.a;
        Iterable l = l();
        InterfaceC1160hI p = p();
        Z1 d = d();
        V8 v8 = (V8) t8;
        v8.getClass();
        AbstractC0048Bt.n(c0826cD2, "builtInsModule");
        AbstractC0048Bt.n(l, "classDescriptorFactories");
        AbstractC0048Bt.n(p, "platformDependentDeclarationFilter");
        AbstractC0048Bt.n(d, "additionalClassPartsProvider");
        Set set = AbstractC1499mT.f198o;
        U8 u8 = new U8(1, 0, v8.b);
        AbstractC0048Bt.n(set, "packageFqNames");
        Set<C2245xo> set2 = set;
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(set2));
        for (C2245xo c2245xo : set2) {
            Q8.m.getClass();
            String a = Q8.a(c2245xo);
            InputStream inputStream = (InputStream) u8.invoke(a);
            if (inputStream == null) {
                throw new IllegalStateException(AbstractC1888sN.s("Resource not found in classpath: ", a));
            }
            arrayList.add(AbstractC0048Bt.z(c2245xo, va, c0826cD2, inputStream));
        }
        C1093gH c1093gH = new C1093gH(arrayList);
        C1334k c1334k = new C1334k(va, c0826cD2);
        Y1 y1 = new Y1(22, c1093gH);
        Q8 q8 = Q8.m;
        C0296Lh c0296Lh = new C0296Lh(va, c0826cD2, y1, new C2002u5(c0826cD2, c1334k, q8), c1093gH, InterfaceC0143Fk.c, HO.u, l, c1334k, d, p, q8.a, null, new C0218Ih(va), null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((W8) it.next()).I0(c0296Lh);
        }
        c0826cD.f145o = c1093gH;
        C0826cD c0826cD3 = this.a;
        c0826cD3.getClass();
        c0826cD3.n = new C0695aD(P6.t0(new C0826cD[]{c0826cD3}));
    }

    public Z1 d() {
        return HO.j;
    }

    public final JR e() {
        JR i = j("Any").i();
        if (i != null) {
            return i;
        }
        a(50);
        throw null;
    }

    public final AbstractC1004ey f(AbstractC1004ey abstractC1004ey) {
        C1639ob f;
        C1639ob c1639ob;
        InterfaceC1245ib o2;
        JR jr = null;
        if (abstractC1004ey == null) {
            a(67);
            throw null;
        }
        if (y(abstractC1004ey)) {
            if (abstractC1004ey.w0().size() != 1) {
                throw new IllegalStateException();
            }
            AbstractC1004ey b = ((AbstractC1701pX) abstractC1004ey.w0().get(0)).b();
            if (b != null) {
                return b;
            }
            a(68);
            throw null;
        }
        AbstractC2097vY g = AbstractC2228xX.g(abstractC1004ey, false);
        AbstractC1004ey abstractC1004ey2 = (AbstractC1004ey) ((C0519Tx) this.b.invoke()).b.get(g);
        if (abstractC1004ey2 != null) {
            return abstractC1004ey2;
        }
        int i = AbstractC0114Eh.a;
        InterfaceC2364zb c = g.B0().c();
        InterfaceC0761bD e2 = c == null ? null : AbstractC0114Eh.e(c);
        if (e2 != null) {
            InterfaceC2364zb c2 = g.B0().c();
            if (c2 != null) {
                Set set = AbstractC1965tY.a;
                C0827cE name = c2.getName();
                AbstractC0048Bt.n(name, "name");
                if (AbstractC1965tY.d.contains(name) && (f = AbstractC0192Hh.f(c2)) != null && (c1639ob = (C1639ob) AbstractC1965tY.b.get(f)) != null && (o2 = AbstractC1052fg.o(e2, c1639ob)) != null) {
                    jr = o2.i();
                }
            }
            if (jr != null) {
                return jr;
            }
        }
        throw new IllegalStateException("not array: " + abstractC1004ey);
    }

    public final JR g(int i, AbstractC1004ey abstractC1004ey, InterfaceC1738q4 interfaceC1738q4) {
        if (i == 0) {
            a(78);
            throw null;
        }
        if (abstractC1004ey != null) {
            return HO.q(AbstractC1494mO.m(interfaceC1738q4), j("Array"), Collections.singletonList(new C1767qX(i, abstractC1004ey)));
        }
        a(79);
        throw null;
    }

    public final JR h(AbstractC2097vY abstractC2097vY) {
        if (abstractC2097vY != null) {
            return g(1, abstractC2097vY, C0460Rq.t);
        }
        a(83);
        throw null;
    }

    public final InterfaceC1245ib i(C2245xo c2245xo) {
        if (c2245xo == null) {
            a(12);
            throw null;
        }
        InterfaceC1245ib H = AbstractC0022At.H(k(), c2245xo);
        if (H != null) {
            return H;
        }
        a(13);
        throw null;
    }

    public final InterfaceC1245ib j(String str) {
        if (str != null) {
            return (InterfaceC1245ib) this.c.invoke(C0827cE.e(str));
        }
        a(14);
        throw null;
    }

    public final C0826cD k() {
        this.a.getClass();
        C0826cD c0826cD = this.a;
        if (c0826cD != null) {
            return c0826cD;
        }
        a(7);
        throw null;
    }

    public Iterable l() {
        List singletonList = Collections.singletonList(new P8(this.d, k()));
        if (singletonList != null) {
            return singletonList;
        }
        a(5);
        throw null;
    }

    public final JR m() {
        JR o2 = o();
        if (o2 != null) {
            return o2;
        }
        a(52);
        throw null;
    }

    public final JR n() {
        JR i = j("Nothing").i();
        if (i != null) {
            return i;
        }
        a(48);
        throw null;
    }

    public final JR o() {
        JR F0 = e().F0(true);
        if (F0 != null) {
            return F0;
        }
        a(51);
        throw null;
    }

    public InterfaceC1160hI p() {
        return C0460Rq.S;
    }

    public final JR q(EnumC1423lJ enumC1423lJ) {
        if (enumC1423lJ == null) {
            a(73);
            throw null;
        }
        JR jr = (JR) ((C0519Tx) this.b.invoke()).a.get(enumC1423lJ);
        if (jr != null) {
            return jr;
        }
        a(74);
        throw null;
    }

    public final JR s(EnumC1423lJ enumC1423lJ) {
        if (enumC1423lJ == null) {
            a(53);
            throw null;
        }
        JR i = j(enumC1423lJ.h.b()).i();
        if (i != null) {
            return i;
        }
        a(54);
        throw null;
    }

    public final JR u() {
        JR i = j("String").i();
        if (i != null) {
            return i;
        }
        a(65);
        throw null;
    }

    public final InterfaceC1245ib v(int i) {
        return i(AbstractC1499mT.e.c(C0827cE.e(EnumC0304Lp.l.i + i)));
    }

    public final JR w() {
        JR i = j("Unit").i();
        if (i != null) {
            return i;
        }
        a(64);
        throw null;
    }
}
