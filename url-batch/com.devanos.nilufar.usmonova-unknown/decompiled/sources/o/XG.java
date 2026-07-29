package o;

import com.google.firebase.database.core.ValidationPath;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;

/* loaded from: classes.dex */
public final class XG {
    public static final List b = AbstractC0720ac.J0(ServiceLoader.load(InterfaceC2308yl.class, InterfaceC2308yl.class.getClassLoader()));
    public static final XG c;
    public static final C0140Fh d;
    public final InterfaceC1070fy a;

    static {
        C0140Fh c0140Fh = new C0140Fh(13);
        d = c0140Fh;
        c = new XG(c0140Fh);
    }

    public XG(InterfaceC1070fy interfaceC1070fy) {
        if (interfaceC1070fy != null) {
            this.a = interfaceC1070fy;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0171 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Object[] objArr;
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 95 && i != 98 && i != 103 && i != 44 && i != 45) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
            }
            if (i != 11 && i != 12 && i != 16 && i != 21 && i != 95 && i != 98 && i != 103 && i != 44 && i != 45) {
                switch (i) {
                    default:
                        switch (i) {
                            default:
                                switch (i) {
                                    default:
                                        switch (i) {
                                            case 90:
                                            case 91:
                                            case 92:
                                                break;
                                            default:
                                                i2 = 3;
                                                break;
                                        }
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                        i2 = 2;
                                        break;
                                }
                            case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                                break;
                        }
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        break;
                }
                objArr = new Object[i2];
                switch (i) {
                    case 1:
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                        objArr[0] = "kotlinTypePreparator";
                        break;
                    case 2:
                        objArr[0] = "customSubtype";
                        break;
                    case 3:
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    default:
                        objArr[0] = "kotlinTypeRefiner";
                        break;
                    case 4:
                        objArr[0] = "equalityAxioms";
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                        objArr[0] = "axioms";
                        break;
                    case 8:
                    case 9:
                        objArr[0] = "candidateSet";
                        break;
                    case 10:
                        objArr[0] = "transformFirst";
                        break;
                    case 11:
                    case 12:
                    case 16:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 44:
                    case 45:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 90:
                    case 91:
                    case 92:
                    case 95:
                    case 98:
                    case 103:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                        break;
                    case 13:
                        objArr[0] = "f";
                        break;
                    case 14:
                        objArr[0] = "g";
                        break;
                    case 15:
                    case 17:
                        objArr[0] = "descriptor";
                        break;
                    case 18:
                        objArr[0] = "result";
                        break;
                    case 19:
                    case 22:
                    case 30:
                    case 40:
                        objArr[0] = "superDescriptor";
                        break;
                    case 20:
                    case 23:
                    case 31:
                    case 41:
                        objArr[0] = "subDescriptor";
                        break;
                    case 42:
                        objArr[0] = "firstParameters";
                        break;
                    case 43:
                        objArr[0] = "secondParameters";
                        break;
                    case 46:
                        objArr[0] = "typeInSuper";
                        break;
                    case 47:
                        objArr[0] = "typeInSub";
                        break;
                    case 48:
                    case 51:
                    case 77:
                        objArr[0] = "typeCheckerState";
                        break;
                    case 49:
                        objArr[0] = "superTypeParameter";
                        break;
                    case 50:
                        objArr[0] = "subTypeParameter";
                        break;
                    case 52:
                        objArr[0] = "name";
                        break;
                    case 53:
                        objArr[0] = "membersFromSupertypes";
                        break;
                    case 54:
                        objArr[0] = "membersFromCurrent";
                        break;
                    case 55:
                    case 61:
                    case 64:
                    case 86:
                    case 89:
                    case 96:
                        objArr[0] = "current";
                        break;
                    case 56:
                    case 62:
                    case 66:
                    case 87:
                    case 106:
                        objArr[0] = "strategy";
                        break;
                    case 57:
                        objArr[0] = "overriding";
                        break;
                    case 58:
                        objArr[0] = "fromSuper";
                        break;
                    case 59:
                        objArr[0] = "fromCurrent";
                        break;
                    case 60:
                        objArr[0] = "descriptorsFromSuper";
                        break;
                    case 63:
                    case 65:
                        objArr[0] = "notOverridden";
                        break;
                    case 67:
                    case 69:
                    case 73:
                        objArr[0] = "a";
                        break;
                    case 68:
                    case 70:
                    case 75:
                        objArr[0] = "b";
                        break;
                    case 71:
                        objArr[0] = "candidate";
                        break;
                    case 72:
                    case 88:
                    case 93:
                    case 109:
                        objArr[0] = "descriptors";
                        break;
                    case 74:
                        objArr[0] = "aReturnType";
                        break;
                    case 76:
                        objArr[0] = "bReturnType";
                        break;
                    case 78:
                    case 85:
                        objArr[0] = "overridables";
                        break;
                    case 79:
                    case 101:
                        objArr[0] = "descriptorByHandle";
                        break;
                    case 94:
                        objArr[0] = "classModality";
                        break;
                    case 97:
                        objArr[0] = "toFilter";
                        break;
                    case 99:
                    case 104:
                        objArr[0] = "overrider";
                        break;
                    case 100:
                    case 105:
                        objArr[0] = "extractFrom";
                        break;
                    case 102:
                        objArr[0] = "onConflict";
                        break;
                    case 107:
                    case 108:
                        objArr[0] = "memberDescriptor";
                        break;
                }
                if (i != 11 || i == 12) {
                    objArr[1] = "filterOverrides";
                } else if (i != 16) {
                    if (i != 21) {
                        if (i == 95) {
                            objArr[1] = "getMinimalModality";
                        } else if (i == 98) {
                            objArr[1] = "filterVisibleFakeOverrides";
                        } else if (i == 103) {
                            objArr[1] = "extractMembersOverridableInBothWays";
                        } else if (i != 44 && i != 45) {
                            switch (i) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                    break;
                                default:
                                    switch (i) {
                                        case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                            objArr[1] = "isOverridableByWithoutExternalConditions";
                                            break;
                                        default:
                                            switch (i) {
                                                case 80:
                                                case 81:
                                                case 82:
                                                case 83:
                                                case 84:
                                                    objArr[1] = "selectMostSpecificMember";
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 90:
                                                        case 91:
                                                        case 92:
                                                            objArr[1] = "determineModalityForFakeOverride";
                                                            break;
                                                        default:
                                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                            break;
                                                    }
                                            }
                                    }
                            }
                        } else {
                            objArr[1] = "createTypeCheckerState";
                        }
                    }
                    objArr[1] = "isOverridableBy";
                } else {
                    objArr[1] = "getOverriddenDeclarations";
                }
                switch (i) {
                    case 1:
                    case 2:
                        objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                        break;
                    case 3:
                    case 4:
                        objArr[2] = "create";
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                        objArr[2] = "<init>";
                        break;
                    case 8:
                        objArr[2] = "filterOutOverridden";
                        break;
                    case 9:
                    case 10:
                        objArr[2] = "filterOverrides";
                        break;
                    case 11:
                    case 12:
                    case 16:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 44:
                    case 45:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 90:
                    case 91:
                    case 92:
                    case 95:
                    case 98:
                    case 103:
                        break;
                    case 13:
                    case 14:
                        objArr[2] = "overrides";
                        break;
                    case 15:
                        objArr[2] = "getOverriddenDeclarations";
                        break;
                    case 17:
                    case 18:
                        objArr[2] = "collectOverriddenDeclarations";
                        break;
                    case 19:
                    case 20:
                    case 22:
                    case 23:
                        objArr[2] = "isOverridableBy";
                        break;
                    case 30:
                    case 31:
                        objArr[2] = "isOverridableByWithoutExternalConditions";
                        break;
                    case 40:
                    case 41:
                        objArr[2] = "getBasicOverridabilityProblem";
                        break;
                    case 42:
                    case 43:
                        objArr[2] = "createTypeCheckerState";
                        break;
                    case 46:
                    case 47:
                    case 48:
                        objArr[2] = "areTypesEquivalent";
                        break;
                    case 49:
                    case 50:
                    case 51:
                        objArr[2] = "areTypeParametersEquivalent";
                        break;
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                        objArr[2] = "generateOverridesInFunctionGroup";
                        break;
                    case 57:
                    case 58:
                        objArr[2] = "isVisibleForOverride";
                        break;
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                        objArr[2] = "extractAndBindOverridesForMember";
                        break;
                    case 63:
                        objArr[2] = "allHasSameContainingDeclaration";
                        break;
                    case 64:
                    case 65:
                    case 66:
                        objArr[2] = "createAndBindFakeOverrides";
                        break;
                    case 67:
                    case 68:
                        objArr[2] = "isMoreSpecific";
                        break;
                    case 69:
                    case 70:
                        objArr[2] = "isVisibilityMoreSpecific";
                        break;
                    case 71:
                    case 72:
                        objArr[2] = "isMoreSpecificThenAllOf";
                        break;
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                        objArr[2] = "isReturnTypeMoreSpecific";
                        break;
                    case 78:
                    case 79:
                        objArr[2] = "selectMostSpecificMember";
                        break;
                    case 85:
                    case 86:
                    case 87:
                        objArr[2] = "createAndBindFakeOverride";
                        break;
                    case 88:
                    case 89:
                        objArr[2] = "determineModalityForFakeOverride";
                        break;
                    case 93:
                    case 94:
                        objArr[2] = "getMinimalModality";
                        break;
                    case 96:
                    case 97:
                        objArr[2] = "filterVisibleFakeOverrides";
                        break;
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 104:
                    case 105:
                    case 106:
                        objArr[2] = "extractMembersOverridableInBothWays";
                        break;
                    case 107:
                        objArr[2] = "resolveUnknownVisibilityForMember";
                        break;
                    case 108:
                        objArr[2] = "computeVisibilityToInherit";
                        break;
                    case 109:
                        objArr[2] = "findMaxVisibility";
                        break;
                    default:
                        objArr[2] = "createWithTypeRefiner";
                        break;
                }
                String format = String.format(str, objArr);
                if (i != 11 && i != 12 && i != 16 && i != 21 && i != 95 && i != 98 && i != 103 && i != 44 && i != 45) {
                    switch (i) {
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                            break;
                        default:
                            switch (i) {
                                case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                    break;
                                default:
                                    switch (i) {
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                            break;
                                        default:
                                            switch (i) {
                                                case 90:
                                                case 91:
                                                case 92:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(format);
                                            }
                                    }
                            }
                    }
                }
                throw new IllegalStateException(format);
            }
            i2 = 2;
            objArr = new Object[i2];
            switch (i) {
            }
            if (i != 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i) {
            }
            String format2 = String.format(str, objArr);
            if (i != 11) {
                switch (i) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 11) {
            switch (i) {
            }
            objArr = new Object[i2];
            switch (i) {
            }
            if (i != 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i) {
            }
            String format22 = String.format(str, objArr);
            if (i != 11) {
            }
            throw new IllegalStateException(format22);
        }
        i2 = 2;
        objArr = new Object[i2];
        switch (i) {
        }
        if (i != 11) {
        }
        objArr[1] = "filterOverrides";
        switch (i) {
        }
        String format222 = String.format(str, objArr);
        if (i != 11) {
        }
        throw new IllegalStateException(format222);
    }

    public static boolean b(AbstractC1004ey abstractC1004ey, AbstractC1004ey abstractC1004ey2, RW rw) {
        if (abstractC1004ey == null) {
            a(46);
            throw null;
        }
        if (abstractC1004ey2 == null) {
            a(47);
            throw null;
        }
        if (AbstractC1473m3.P(abstractC1004ey) && AbstractC1473m3.P(abstractC1004ey2)) {
            return true;
        }
        return C0460Rq.r(rw, abstractC1004ey.E0(), abstractC1004ey2.E0());
    }

    public static void c(InterfaceC2204x9 interfaceC2204x9, LinkedHashSet linkedHashSet) {
        if (interfaceC2204x9 == null) {
            a(17);
            throw null;
        }
        if (interfaceC2204x9.M() != 2) {
            linkedHashSet.add(interfaceC2204x9);
            return;
        }
        if (interfaceC2204x9.o().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC2204x9);
        }
        Iterator it = interfaceC2204x9.o().iterator();
        while (it.hasNext()) {
            c((InterfaceC2204x9) it.next(), linkedHashSet);
        }
    }

    public static ArrayList d(InterfaceC2072v9 interfaceC2072v9) {
        C0261Jy J = interfaceC2072v9.J();
        ArrayList arrayList = new ArrayList();
        if (J != null) {
            arrayList.add(J.c());
        }
        Iterator it = interfaceC2072v9.t0().iterator();
        while (it.hasNext()) {
            arrayList.add(((RY) it.next()).c());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0183, code lost:
    
        if (r1 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0185, code lost:
    
        r0 = o.AbstractC0270Kh.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018a, code lost:
    
        r12 = ((o.InterfaceC2204x9) s(r11, new o.C2311yo(2))).y(r12, r5, r0);
        r13.e0(r12, r11);
        r13.f(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0188, code lost:
    
        r0 = o.AbstractC0270Kh.g;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Collection collection, InterfaceC1245ib interfaceC1245ib, AbstractC0048Bt abstractC0048Bt) {
        if (collection == null) {
            a(85);
            throw null;
        }
        if (interfaceC1245ib == null) {
            a(86);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            int i = 1;
            if (it.hasNext()) {
                Object next = it.next();
                InterfaceC2204x9 interfaceC2204x9 = (InterfaceC2204x9) next;
                if (!AbstractC0270Kh.e(interfaceC2204x9.getVisibility())) {
                    if (interfaceC2204x9 == null) {
                        AbstractC0270Kh.a(2);
                        throw null;
                    }
                    if (interfaceC1245ib == null) {
                        AbstractC0270Kh.a(3);
                        throw null;
                    }
                    if (AbstractC0270Kh.c(AbstractC0270Kh.l, interfaceC2204x9, interfaceC1245ib) == null) {
                        z = true;
                    }
                }
                if (z) {
                    arrayList.add(next);
                }
            } else {
                boolean isEmpty = arrayList.isEmpty();
                if (!isEmpty) {
                    collection = arrayList;
                }
                Iterator it2 = collection.iterator();
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    if (it2.hasNext()) {
                        InterfaceC2204x9 interfaceC2204x92 = (InterfaceC2204x9) it2.next();
                        int v = AbstractC1888sN.v(interfaceC2204x92.g());
                        if (v == 0) {
                            break;
                        }
                        if (v == 1) {
                            throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC2204x92);
                        }
                        if (v == 2) {
                            z2 = true;
                        } else if (v == 3) {
                            z3 = true;
                        }
                    } else {
                        if (interfaceC1245ib.X() && interfaceC1245ib.g() != 4 && interfaceC1245ib.g() != 2) {
                            z = true;
                        }
                        if (z2 && !z3) {
                            i = 3;
                        } else if (z2 || !z3) {
                            HashSet<InterfaceC2204x9> hashSet = new HashSet();
                            for (InterfaceC2204x9 interfaceC2204x93 : collection) {
                                if (interfaceC2204x93 == null) {
                                    a(15);
                                    throw null;
                                }
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                c(interfaceC2204x93, linkedHashSet);
                                hashSet.addAll(linkedHashSet);
                            }
                            if (!hashSet.isEmpty() && AbstractC0192Hh.j((InterfaceC1118gg) hashSet.iterator().next()).q(AbstractC1305jX.j) != null) {
                                throw new ClassCastException();
                            }
                            if (hashSet.size() > 1) {
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                Iterator it3 = hashSet.iterator();
                                while (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    Iterator it4 = linkedHashSet2.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            linkedHashSet2.add(next2);
                                            break;
                                        }
                                        InterfaceC2072v9 interfaceC2072v9 = (InterfaceC2072v9) next2;
                                        InterfaceC2072v9 interfaceC2072v92 = (InterfaceC2072v9) it4.next();
                                        if (!q(interfaceC2072v9, interfaceC2072v92)) {
                                            if (q(interfaceC2072v92, interfaceC2072v9)) {
                                                break;
                                            }
                                        } else {
                                            it4.remove();
                                        }
                                    }
                                }
                                hashSet = linkedHashSet2;
                            }
                            int g = interfaceC1245ib.g();
                            if (g == 0) {
                                a(94);
                                throw null;
                            }
                            i = 4;
                            for (InterfaceC2204x9 interfaceC2204x94 : hashSet) {
                                int g2 = (z && interfaceC2204x94.g() == 4) ? g : interfaceC2204x94.g();
                                if (AbstractC1888sN.b(g2, i) < 0) {
                                    i = g2;
                                }
                            }
                            if (i == 0) {
                                a(95);
                                throw null;
                            }
                        } else {
                            i = z ? interfaceC1245ib.g() : 4;
                            if (i == 0) {
                                a(92);
                                throw null;
                            }
                        }
                    }
                }
            }
        }
    }

    public static ArrayList g(Object obj, LinkedList linkedList, InterfaceC2114vp interfaceC2114vp, InterfaceC2114vp interfaceC2114vp2) {
        if (obj == null) {
            a(99);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC2072v9 interfaceC2072v9 = (InterfaceC2072v9) interfaceC2114vp.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC2072v9 interfaceC2072v92 = (InterfaceC2072v9) interfaceC2114vp.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                int j = j(interfaceC2072v9, interfaceC2072v92);
                if (j == 1) {
                    arrayList.add(next);
                    it.remove();
                } else if (j == 3) {
                    interfaceC2114vp2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static WG i(InterfaceC2072v9 interfaceC2072v9, InterfaceC2072v9 interfaceC2072v92) {
        boolean z;
        if (interfaceC2072v9 == null) {
            a(40);
            throw null;
        }
        if (interfaceC2072v92 == null) {
            a(41);
            throw null;
        }
        boolean z2 = interfaceC2072v9 instanceof InterfaceC0381Op;
        if ((z2 && !(interfaceC2072v92 instanceof InterfaceC0381Op)) || (((z = interfaceC2072v9 instanceof PJ)) && !(interfaceC2072v92 instanceof PJ))) {
            return WG.d("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC2072v9);
        }
        if (!interfaceC2072v9.getName().equals(interfaceC2072v92.getName())) {
            return WG.d("Name mismatch");
        }
        WG d2 = (interfaceC2072v9.J() == null) != (interfaceC2072v92.J() == null) ? WG.d("Receiver presence mismatch") : interfaceC2072v9.t0().size() != interfaceC2072v92.t0().size() ? WG.d("Value parameter number mismatch") : null;
        if (d2 != null) {
            return d2;
        }
        return null;
    }

    public static int j(InterfaceC2072v9 interfaceC2072v9, InterfaceC2072v9 interfaceC2072v92) {
        XG xg = c;
        int c2 = xg.l(interfaceC2072v92, interfaceC2072v9, null).c();
        int c3 = xg.m(interfaceC2072v9, interfaceC2072v92, null, false).c();
        if (c2 == 1 && c3 == 1) {
            return 1;
        }
        return (c2 == 3 || c3 == 3) ? 3 : 2;
    }

    public static boolean k(InterfaceC2072v9 interfaceC2072v9, InterfaceC2072v9 interfaceC2072v92) {
        if (interfaceC2072v9 == null) {
            a(67);
            throw null;
        }
        if (interfaceC2072v92 == null) {
            a(68);
            throw null;
        }
        AbstractC1004ey returnType = interfaceC2072v9.getReturnType();
        AbstractC1004ey returnType2 = interfaceC2072v92.getReturnType();
        if (!p(interfaceC2072v9, interfaceC2072v92)) {
            return false;
        }
        RW f = c.f(interfaceC2072v9.getTypeParameters(), interfaceC2072v92.getTypeParameters());
        if (interfaceC2072v9 instanceof InterfaceC0381Op) {
            return o(interfaceC2072v9, returnType, interfaceC2072v92, returnType2, f);
        }
        if (!(interfaceC2072v9 instanceof PJ)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC2072v9.getClass());
        }
        PJ pj = (PJ) interfaceC2072v9;
        PJ pj2 = (PJ) interfaceC2072v92;
        WJ b2 = pj.b();
        WJ b3 = pj2.b();
        if ((b2 == null || b3 == null) ? true : p(b2, b3)) {
            return (pj.G() && pj2.G()) ? C0460Rq.r(f, returnType.E0(), returnType2.E0()) : (pj.G() || !pj2.G()) && o(interfaceC2072v9, returnType, interfaceC2072v92, returnType2, f);
        }
        return false;
    }

    public static boolean o(InterfaceC2072v9 interfaceC2072v9, AbstractC1004ey abstractC1004ey, InterfaceC2072v9 interfaceC2072v92, AbstractC1004ey abstractC1004ey2, RW rw) {
        if (interfaceC2072v9 == null) {
            a(73);
            throw null;
        }
        if (abstractC1004ey == null) {
            a(74);
            throw null;
        }
        if (interfaceC2072v92 == null) {
            a(75);
            throw null;
        }
        if (abstractC1004ey2 != null) {
            return C0460Rq.v(C0460Rq.j, rw, abstractC1004ey.E0(), abstractC1004ey2.E0());
        }
        a(76);
        throw null;
    }

    public static boolean p(InterfaceC2072v9 interfaceC2072v9, InterfaceC2072v9 interfaceC2072v92) {
        if (interfaceC2072v9 == null) {
            a(69);
            throw null;
        }
        if (interfaceC2072v92 != null) {
            Integer b2 = AbstractC0270Kh.b(interfaceC2072v9.getVisibility(), interfaceC2072v92.getVisibility());
            return b2 == null || b2.intValue() >= 0;
        }
        a(70);
        throw null;
    }

    public static boolean q(InterfaceC2072v9 interfaceC2072v9, InterfaceC2072v9 interfaceC2072v92) {
        C0460Rq c0460Rq = C0460Rq.z;
        if (interfaceC2072v9 == null) {
            a(13);
            throw null;
        }
        if (interfaceC2072v92 == null) {
            a(14);
            throw null;
        }
        if (!interfaceC2072v9.equals(interfaceC2072v92) && c0460Rq.j(interfaceC2072v9.a(), interfaceC2072v92.a(), false)) {
            return true;
        }
        InterfaceC2072v9 a = interfaceC2072v92.a();
        int i = AbstractC0114Eh.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AbstractC0114Eh.b(interfaceC2072v9.a(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (c0460Rq.j(a, (InterfaceC2072v9) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(InterfaceC2204x9 interfaceC2204x9, InterfaceC2114vp interfaceC2114vp) {
        C0244Jh c0244Jh;
        C0244Jh c0244Jh2;
        C0244Jh c0244Jh3;
        if (interfaceC2204x9 == null) {
            a(107);
            throw null;
        }
        for (InterfaceC2204x9 interfaceC2204x92 : interfaceC2204x9.o()) {
            if (interfaceC2204x92.getVisibility() == AbstractC0270Kh.g) {
                r(interfaceC2204x92, interfaceC2114vp);
            }
        }
        if (interfaceC2204x9.getVisibility() != AbstractC0270Kh.g) {
            return;
        }
        Collection<InterfaceC2204x9> o2 = interfaceC2204x9.o();
        if (o2 == null) {
            a(109);
            throw null;
        }
        if (!o2.isEmpty()) {
            Iterator it = o2.iterator();
            loop3: while (true) {
                c0244Jh = null;
                while (it.hasNext()) {
                    C0244Jh visibility = ((InterfaceC2204x9) it.next()).getVisibility();
                    if (c0244Jh != null) {
                        Integer b2 = AbstractC0270Kh.b(visibility, c0244Jh);
                        if (b2 == null) {
                            break;
                        } else if (b2.intValue() > 0) {
                        }
                    }
                    c0244Jh = visibility;
                }
            }
            if (c0244Jh != null) {
                Iterator it2 = o2.iterator();
                while (it2.hasNext()) {
                    Integer b3 = AbstractC0270Kh.b(c0244Jh, ((InterfaceC2204x9) it2.next()).getVisibility());
                    if (b3 != null && b3.intValue() >= 0) {
                    }
                }
                c0244Jh2 = c0244Jh;
            }
            c0244Jh2 = null;
            break;
        }
        c0244Jh2 = AbstractC0270Kh.j;
        if (c0244Jh2 != null) {
            if (interfaceC2204x9.M() == 2) {
                for (InterfaceC2204x9 interfaceC2204x93 : o2) {
                    if (interfaceC2204x93.g() == 4 || interfaceC2204x93.getVisibility().equals(c0244Jh2)) {
                    }
                }
            } else {
                c0244Jh2 = AbstractC0270Kh.f(c0244Jh2.a.c());
            }
            if (c0244Jh2 != null) {
                if (interfaceC2114vp != null) {
                    interfaceC2114vp.invoke(interfaceC2204x9);
                }
                c0244Jh3 = AbstractC0270Kh.e;
            } else {
                c0244Jh3 = c0244Jh2;
            }
            if (!(interfaceC2204x9 instanceof RJ)) {
                RJ rj = (RJ) interfaceC2204x9;
                if (c0244Jh3 == null) {
                    RJ.A0(20);
                    throw null;
                }
                rj.q = c0244Jh3;
                Iterator it3 = ((PJ) interfaceC2204x9).r().iterator();
                while (it3.hasNext()) {
                    r((MJ) it3.next(), c0244Jh2 == null ? null : interfaceC2114vp);
                }
                return;
            }
            if (interfaceC2204x9 instanceof AbstractC0433Qp) {
                AbstractC0433Qp abstractC0433Qp = (AbstractC0433Qp) interfaceC2204x9;
                if (c0244Jh3 != null) {
                    abstractC0433Qp.s = c0244Jh3;
                    return;
                } else {
                    AbstractC0433Qp.A0(10);
                    throw null;
                }
            }
            NJ nj = (NJ) interfaceC2204x9;
            nj.r = c0244Jh3;
            if (c0244Jh3 != nj.H0().getVisibility()) {
                nj.l = false;
                return;
            }
            return;
        }
        c0244Jh2 = null;
        if (c0244Jh2 != null) {
        }
        if (!(interfaceC2204x9 instanceof RJ)) {
        }
    }

    public static Object s(Collection collection, InterfaceC2114vp interfaceC2114vp) {
        Object obj;
        if (collection.size() == 1) {
            Object m0 = AbstractC0720ac.m0(collection);
            if (m0 != null) {
                return m0;
            }
            a(80);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(collection));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(interfaceC2114vp.invoke(it.next()));
        }
        Object m02 = AbstractC0720ac.m0(collection);
        InterfaceC2072v9 interfaceC2072v9 = (InterfaceC2072v9) interfaceC2114vp.invoke(m02);
        for (Object obj2 : collection) {
            InterfaceC2072v9 interfaceC2072v92 = (InterfaceC2072v9) interfaceC2114vp.invoke(obj2);
            if (interfaceC2072v92 == null) {
                a(71);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(obj2);
                    break;
                }
                if (!k(interfaceC2072v92, (InterfaceC2072v9) it2.next())) {
                    break;
                }
            }
            if (k(interfaceC2072v92, interfaceC2072v9) && !k(interfaceC2072v9, interfaceC2072v92)) {
                m02 = obj2;
            }
        }
        if (arrayList.isEmpty()) {
            if (m02 != null) {
                return m02;
            }
            a(81);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object m03 = AbstractC0720ac.m0(arrayList);
            if (m03 != null) {
                return m03;
            }
            a(82);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (!AbstractC0868ct.E(((InterfaceC2072v9) interfaceC2114vp.invoke(obj)).getReturnType())) {
                break;
            }
        }
        if (obj != null) {
            return obj;
        }
        Object m04 = AbstractC0720ac.m0(arrayList);
        if (m04 != null) {
            return m04;
        }
        a(84);
        throw null;
    }

    public final RW f(List list, List list2) {
        if (list == null) {
            a(42);
            throw null;
        }
        if (list2 == null) {
            a(43);
            throw null;
        }
        boolean isEmpty = list.isEmpty();
        C1332jy c1332jy = C1332jy.a;
        C1398ky c1398ky = C1398ky.a;
        InterfaceC1070fy interfaceC1070fy = this.a;
        if (isEmpty) {
            return new RW(true, true, new C0208Hx((HashMap) null, interfaceC1070fy), c1332jy, c1398ky);
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(((InterfaceC1437lX) list.get(i)).z(), ((InterfaceC1437lX) list2.get(i)).z());
        }
        return new RW(true, true, new C0208Hx(hashMap, interfaceC1070fy), c1332jy, c1398ky);
    }

    public final void h(C0827cE c0827cE, Collection collection, Collection collection2, InterfaceC1245ib interfaceC1245ib, AbstractC0048Bt abstractC0048Bt) {
        Integer b2;
        if (c0827cE == null) {
            a(52);
            throw null;
        }
        if (collection == null) {
            a(53);
            throw null;
        }
        if (collection2 == null) {
            a(54);
            throw null;
        }
        if (interfaceC1245ib == null) {
            a(55);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            InterfaceC2204x9 interfaceC2204x9 = (InterfaceC2204x9) it.next();
            if (interfaceC2204x9 == null) {
                a(59);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            C1630oS c1630oS = new C1630oS();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                InterfaceC2204x9 interfaceC2204x92 = (InterfaceC2204x9) it2.next();
                int c2 = l(interfaceC2204x92, interfaceC2204x9, interfaceC1245ib).c();
                boolean z = !AbstractC0270Kh.e(interfaceC2204x92.getVisibility()) && AbstractC0270Kh.c(AbstractC0270Kh.l, interfaceC2204x92, interfaceC2204x9) == null;
                int v = AbstractC1888sN.v(c2);
                if (v == 0) {
                    if (z) {
                        c1630oS.add(interfaceC2204x92);
                    }
                    arrayList.add(interfaceC2204x92);
                } else if (v == 2) {
                    if (z) {
                        abstractC0048Bt.x(interfaceC2204x92, interfaceC2204x9);
                    }
                    arrayList.add(interfaceC2204x92);
                }
            }
            abstractC0048Bt.e0(interfaceC2204x9, c1630oS);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            InterfaceC1118gg n = ((InterfaceC2204x9) linkedHashSet.iterator().next()).n();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((InterfaceC2204x9) it3.next()).n() != n) {
                        LinkedList<InterfaceC2204x9> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            InterfaceC2204x9 interfaceC2204x93 = null;
                            for (InterfaceC2204x9 interfaceC2204x94 : linkedList) {
                                if (interfaceC2204x93 == null || ((b2 = AbstractC0270Kh.b(interfaceC2204x93.getVisibility(), interfaceC2204x94.getVisibility())) != null && b2.intValue() < 0)) {
                                    interfaceC2204x93 = interfaceC2204x94;
                                }
                            }
                            AbstractC0048Bt.k(interfaceC2204x93);
                            e(g(interfaceC2204x93, linkedList, new C2311yo(3), new VG(abstractC0048Bt, interfaceC2204x93)), interfaceC1245ib, abstractC0048Bt);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((InterfaceC2204x9) it4.next()), interfaceC1245ib, abstractC0048Bt);
        }
    }

    public final WG l(InterfaceC2072v9 interfaceC2072v9, InterfaceC2072v9 interfaceC2072v92, InterfaceC1245ib interfaceC1245ib) {
        if (interfaceC2072v9 == null) {
            a(19);
            throw null;
        }
        if (interfaceC2072v92 != null) {
            return m(interfaceC2072v9, interfaceC2072v92, interfaceC1245ib, false);
        }
        a(20);
        throw null;
    }

    public final WG m(InterfaceC2072v9 interfaceC2072v9, InterfaceC2072v9 interfaceC2072v92, InterfaceC1245ib interfaceC1245ib, boolean z) {
        if (interfaceC2072v9 == null) {
            a(22);
            throw null;
        }
        if (interfaceC2072v92 == null) {
            a(23);
            throw null;
        }
        WG n = n(interfaceC2072v9, interfaceC2072v92, z);
        boolean z2 = n.c() == 1;
        List<InterfaceC2308yl> list = b;
        for (InterfaceC2308yl interfaceC2308yl : list) {
            if (interfaceC2308yl.b() != 1 && (!z2 || interfaceC2308yl.b() != 2)) {
                int v = AbstractC1888sN.v(interfaceC2308yl.a(interfaceC2072v9, interfaceC2072v92, interfaceC1245ib));
                if (v == 0) {
                    z2 = true;
                } else {
                    if (v == 1) {
                        return WG.b("External condition failed");
                    }
                    if (v == 2) {
                        return WG.d("External condition");
                    }
                }
            }
        }
        if (!z2) {
            return n;
        }
        for (InterfaceC2308yl interfaceC2308yl2 : list) {
            if (interfaceC2308yl2.b() == 1) {
                int v2 = AbstractC1888sN.v(interfaceC2308yl2.a(interfaceC2072v9, interfaceC2072v92, interfaceC1245ib));
                if (v2 == 0) {
                    throw new IllegalStateException("Contract violation in " + interfaceC2308yl2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (v2 == 1) {
                    return WG.b("External condition failed");
                }
                if (v2 == 2) {
                    return WG.d("External condition");
                }
            }
        }
        WG wg = WG.b;
        if (wg != null) {
            return wg;
        }
        WG.a(0);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
    
        r14.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WG n(InterfaceC2072v9 interfaceC2072v9, InterfaceC2072v9 interfaceC2072v92, boolean z) {
        if (interfaceC2072v9 == null) {
            a(30);
            throw null;
        }
        if (interfaceC2072v92 == null) {
            a(31);
            throw null;
        }
        WG i = i(interfaceC2072v9, interfaceC2072v92);
        if (i != null) {
            return i;
        }
        ArrayList d2 = d(interfaceC2072v9);
        ArrayList d3 = d(interfaceC2072v92);
        List typeParameters = interfaceC2072v9.getTypeParameters();
        List typeParameters2 = interfaceC2072v92.getTypeParameters();
        if (typeParameters.size() != typeParameters2.size()) {
            for (int i2 = 0; i2 < d2.size(); i2++) {
                if (!InterfaceC1136gy.a.a((AbstractC1004ey) d2.get(i2), (AbstractC1004ey) d3.get(i2))) {
                    return WG.d("Type parameter number mismatch");
                }
            }
            return WG.b("Type parameter number mismatch");
        }
        RW f = f(typeParameters, typeParameters2);
        for (int i3 = 0; i3 < typeParameters.size(); i3++) {
            InterfaceC1437lX interfaceC1437lX = (InterfaceC1437lX) typeParameters.get(i3);
            InterfaceC1437lX interfaceC1437lX2 = (InterfaceC1437lX) typeParameters2.get(i3);
            if (interfaceC1437lX == null) {
                a(49);
                throw null;
            }
            if (interfaceC1437lX2 == null) {
                a(50);
                throw null;
            }
            List<AbstractC1004ey> upperBounds = interfaceC1437lX.getUpperBounds();
            ArrayList arrayList = new ArrayList(interfaceC1437lX2.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (AbstractC1004ey abstractC1004ey : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        if (b(abstractC1004ey, (AbstractC1004ey) listIterator.next(), f)) {
                            break;
                        }
                    }
                }
            }
            return WG.d("Type parameter bounds mismatch");
        }
        for (int i4 = 0; i4 < d2.size(); i4++) {
            if (!b((AbstractC1004ey) d2.get(i4), (AbstractC1004ey) d3.get(i4), f)) {
                return WG.d("Value parameter type mismatch");
            }
        }
        if ((interfaceC2072v9 instanceof InterfaceC0381Op) && (interfaceC2072v92 instanceof InterfaceC0381Op) && ((InterfaceC0381Op) interfaceC2072v9).isSuspend() != ((InterfaceC0381Op) interfaceC2072v92).isSuspend()) {
            return WG.b("Incompatible suspendability");
        }
        if (z) {
            AbstractC1004ey returnType = interfaceC2072v9.getReturnType();
            AbstractC1004ey returnType2 = interfaceC2072v92.getReturnType();
            if (returnType != null && returnType2 != null && ((!AbstractC1473m3.P(returnType2) || !AbstractC1473m3.P(returnType)) && !C0460Rq.v(C0460Rq.j, f, returnType2.E0(), returnType.E0()))) {
                return WG.b("Return type mismatch");
            }
        }
        WG wg = WG.b;
        if (wg != null) {
            return wg;
        }
        WG.a(0);
        throw null;
    }
}
