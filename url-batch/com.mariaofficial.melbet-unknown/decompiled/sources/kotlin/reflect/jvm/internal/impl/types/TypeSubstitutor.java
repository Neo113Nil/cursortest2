package kotlin.reflect.jvm.internal.impl.types;

import com.caverock.androidsvg.SVGParser;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;

/* loaded from: classes2.dex */
public class TypeSubstitutor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final TypeSubstitutor EMPTY = create(TypeSubstitution.EMPTY);
    private final TypeSubstitution substitution;

    private enum VarianceConflictType {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0021 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    break;
            }
            if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
                switch (i) {
                    default:
                        switch (i) {
                            default:
                                switch (i) {
                                    default:
                                        switch (i) {
                                            case 40:
                                            case 41:
                                            case 42:
                                                break;
                                            default:
                                                i2 = 3;
                                                break;
                                        }
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                        i2 = 2;
                                        break;
                                }
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                break;
                        }
                    case 11:
                    case 12:
                    case 13:
                        break;
                }
                Object[] objArr = new Object[i2];
                switch (i) {
                    case 1:
                    case 2:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 34:
                    case 37:
                    case 40:
                    case 41:
                    case 42:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                        break;
                    case 3:
                        objArr[0] = "first";
                        break;
                    case 4:
                        objArr[0] = "second";
                        break;
                    case 5:
                        objArr[0] = "substitutionContext";
                        break;
                    case 6:
                        objArr[0] = "context";
                        break;
                    case 7:
                    default:
                        objArr[0] = "substitution";
                        break;
                    case 9:
                    case 14:
                        objArr[0] = SVGParser.XML_STYLESHEET_ATTR_TYPE;
                        break;
                    case 10:
                    case 15:
                        objArr[0] = "howThisTypeIsUsed";
                        break;
                    case 16:
                    case 17:
                    case 36:
                        objArr[0] = "typeProjection";
                        break;
                    case 18:
                    case 28:
                        objArr[0] = "originalProjection";
                        break;
                    case 26:
                        objArr[0] = "originalType";
                        break;
                    case 27:
                        objArr[0] = "substituted";
                        break;
                    case 33:
                        objArr[0] = "annotations";
                        break;
                    case 35:
                    case 38:
                        objArr[0] = "typeParameterVariance";
                        break;
                    case 39:
                        objArr[0] = "projectionKind";
                        break;
                }
                if (i != 1) {
                    objArr[1] = "replaceWithNonApproximatingSubstitution";
                } else if (i == 2) {
                    objArr[1] = "replaceWithContravariantApproximatingSubstitution";
                } else if (i == 8) {
                    objArr[1] = "getSubstitution";
                } else if (i != 34) {
                    if (i != 37) {
                        switch (i) {
                            case 11:
                            case 12:
                            case 13:
                                objArr[1] = "safeSubstitute";
                                break;
                            default:
                                switch (i) {
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                        objArr[1] = "unsafeSubstitute";
                                        break;
                                    default:
                                        switch (i) {
                                            case 29:
                                            case 30:
                                            case 31:
                                            case 32:
                                                objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                                break;
                                            default:
                                                switch (i) {
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                        break;
                                                    default:
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                        break;
                                                }
                                        }
                                }
                        }
                    }
                    objArr[1] = "combine";
                } else {
                    objArr[1] = "filterOutUnsafeVariance";
                }
                switch (i) {
                    case 1:
                    case 2:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 34:
                    case 37:
                    case 40:
                    case 41:
                    case 42:
                        break;
                    case 3:
                    case 4:
                        objArr[2] = "createChainedSubstitutor";
                        break;
                    case 5:
                    case 6:
                    default:
                        objArr[2] = "create";
                        break;
                    case 7:
                        objArr[2] = "<init>";
                        break;
                    case 9:
                    case 10:
                        objArr[2] = "safeSubstitute";
                        break;
                    case 14:
                    case 15:
                    case 16:
                        objArr[2] = "substitute";
                        break;
                    case 17:
                        objArr[2] = "substituteWithoutApproximation";
                        break;
                    case 18:
                        objArr[2] = "unsafeSubstitute";
                        break;
                    case 26:
                    case 27:
                    case 28:
                        objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                        break;
                    case 33:
                        objArr[2] = "filterOutUnsafeVariance";
                        break;
                    case 35:
                    case 36:
                    case 38:
                    case 39:
                        objArr[2] = "combine";
                        break;
                }
                String format = String.format(str, objArr);
                if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
                    switch (i) {
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            switch (i) {
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                    break;
                                default:
                                    switch (i) {
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                            break;
                                        default:
                                            switch (i) {
                                                case 40:
                                                case 41:
                                                case 42:
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
            Object[] objArr2 = new Object[i2];
            switch (i) {
            }
            if (i != 1) {
            }
            switch (i) {
            }
            String format2 = String.format(str, objArr2);
            if (i != 1) {
                switch (i) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 1) {
            switch (i) {
            }
            Object[] objArr22 = new Object[i2];
            switch (i) {
            }
            if (i != 1) {
            }
            switch (i) {
            }
            String format22 = String.format(str, objArr22);
            if (i != 1) {
            }
            throw new IllegalStateException(format22);
        }
        i2 = 2;
        Object[] objArr222 = new Object[i2];
        switch (i) {
        }
        if (i != 1) {
        }
        switch (i) {
        }
        String format222 = String.format(str, objArr222);
        if (i != 1) {
        }
        throw new IllegalStateException(format222);
    }

    private static final class SubstitutionException extends Exception {
        public SubstitutionException(String str) {
            super(str);
        }
    }

    public static TypeSubstitutor create(TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(0);
        }
        return new TypeSubstitutor(typeSubstitution);
    }

    public TypeSubstitutor replaceWithNonApproximatingSubstitution() {
        TypeSubstitution typeSubstitution = this.substitution;
        return ((typeSubstitution instanceof IndexedParametersSubstitution) && typeSubstitution.approximateContravariantCapturedTypes()) ? new TypeSubstitutor(new IndexedParametersSubstitution(((IndexedParametersSubstitution) this.substitution).getParameters(), ((IndexedParametersSubstitution) this.substitution).getArguments(), false)) : this;
    }

    public static TypeSubstitutor createChainedSubstitutor(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(3);
        }
        if (typeSubstitution2 == null) {
            $$$reportNull$$$0(4);
        }
        return create(DisjointKeysUnionTypeSubstitution.create(typeSubstitution, typeSubstitution2));
    }

    public static TypeSubstitutor create(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(6);
        }
        return create(TypeConstructorSubstitution.create(kotlinType.getConstructor(), kotlinType.getArguments()));
    }

    protected TypeSubstitutor(TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(7);
        }
        this.substitution = typeSubstitution;
    }

    public boolean isEmpty() {
        return this.substitution.isEmpty();
    }

    public TypeSubstitution getSubstitution() {
        TypeSubstitution typeSubstitution = this.substitution;
        if (typeSubstitution == null) {
            $$$reportNull$$$0(8);
        }
        return typeSubstitution;
    }

    public KotlinType safeSubstitute(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            $$$reportNull$$$0(9);
        }
        if (variance == null) {
            $$$reportNull$$$0(10);
        }
        if (isEmpty()) {
            if (kotlinType == null) {
                $$$reportNull$$$0(11);
            }
            return kotlinType;
        }
        try {
            KotlinType type = unsafeSubstitute(new TypeProjectionImpl(variance, kotlinType), null, 0).getType();
            if (type == null) {
                $$$reportNull$$$0(12);
            }
            return type;
        } catch (SubstitutionException e) {
            ErrorType createErrorType = ErrorUtils.createErrorType(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
            if (createErrorType == null) {
                $$$reportNull$$$0(13);
            }
            return createErrorType;
        }
    }

    public KotlinType substitute(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            $$$reportNull$$$0(14);
        }
        if (variance == null) {
            $$$reportNull$$$0(15);
        }
        TypeProjection substitute = substitute(new TypeProjectionImpl(variance, getSubstitution().prepareTopLevelType(kotlinType, variance)));
        if (substitute == null) {
            return null;
        }
        return substitute.getType();
    }

    public TypeProjection substitute(TypeProjection typeProjection) {
        if (typeProjection == null) {
            $$$reportNull$$$0(16);
        }
        TypeProjection substituteWithoutApproximation = substituteWithoutApproximation(typeProjection);
        return (this.substitution.approximateCapturedTypes() || this.substitution.approximateContravariantCapturedTypes()) ? CapturedTypeApproximationKt.approximateCapturedTypesIfNecessary(substituteWithoutApproximation, this.substitution.approximateContravariantCapturedTypes()) : substituteWithoutApproximation;
    }

    public TypeProjection substituteWithoutApproximation(TypeProjection typeProjection) {
        if (typeProjection == null) {
            $$$reportNull$$$0(17);
        }
        if (isEmpty()) {
            return typeProjection;
        }
        try {
            return unsafeSubstitute(typeProjection, null, 0);
        } catch (SubstitutionException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TypeProjection unsafeSubstitute(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor, int i) throws SubstitutionException {
        KotlinType makeNullableIfNeeded;
        if (typeProjection == null) {
            $$$reportNull$$$0(18);
        }
        assertRecursionDepth(i, typeProjection, this.substitution);
        if (!typeProjection.isStarProjection()) {
            KotlinType type = typeProjection.getType();
            if (type instanceof TypeWithEnhancement) {
                TypeWithEnhancement typeWithEnhancement = (TypeWithEnhancement) type;
                UnwrappedType origin = typeWithEnhancement.getOrigin();
                KotlinType enhancement = typeWithEnhancement.getEnhancement();
                TypeProjection unsafeSubstitute = unsafeSubstitute(new TypeProjectionImpl(typeProjection.getProjectionKind(), origin), typeParameterDescriptor, i + 1);
                if (!unsafeSubstitute.isStarProjection()) {
                    return new TypeProjectionImpl(unsafeSubstitute.getProjectionKind(), TypeWithEnhancementKt.wrapEnhancement(unsafeSubstitute.getType().unwrap(), substitute(enhancement, typeProjection.getProjectionKind())));
                }
                if (unsafeSubstitute == null) {
                    $$$reportNull$$$0(20);
                }
                return unsafeSubstitute;
            }
            if (!DynamicTypesKt.isDynamic(type) && !(type.unwrap() instanceof RawType)) {
                TypeProjection mo2084get = this.substitution.mo2084get(type);
                TypeProjection projectedTypeForConflictedTypeWithUnsafeVariance = mo2084get != null ? projectedTypeForConflictedTypeWithUnsafeVariance(type, mo2084get, typeParameterDescriptor, typeProjection) : null;
                Variance projectionKind = typeProjection.getProjectionKind();
                if (projectedTypeForConflictedTypeWithUnsafeVariance == null && FlexibleTypesKt.isFlexible(type) && !TypeCapabilitiesKt.isCustomTypeParameter(type)) {
                    FlexibleType asFlexibleType = FlexibleTypesKt.asFlexibleType(type);
                    int i2 = i + 1;
                    TypeProjection unsafeSubstitute2 = unsafeSubstitute(new TypeProjectionImpl(projectionKind, asFlexibleType.getLowerBound()), typeParameterDescriptor, i2);
                    TypeProjection unsafeSubstitute3 = unsafeSubstitute(new TypeProjectionImpl(projectionKind, asFlexibleType.getUpperBound()), typeParameterDescriptor, i2);
                    Variance projectionKind2 = unsafeSubstitute2.getProjectionKind();
                    if (unsafeSubstitute2.getType() != asFlexibleType.getLowerBound() || unsafeSubstitute3.getType() != asFlexibleType.getUpperBound()) {
                        return new TypeProjectionImpl(projectionKind2, KotlinTypeFactory.flexibleType(TypeSubstitutionKt.asSimpleType(unsafeSubstitute2.getType()), TypeSubstitutionKt.asSimpleType(unsafeSubstitute3.getType())));
                    }
                    if (typeProjection == null) {
                        $$$reportNull$$$0(22);
                        return typeProjection;
                    }
                } else {
                    if (!KotlinBuiltIns.isNothing(type) && !KotlinTypeKt.isError(type)) {
                        if (projectedTypeForConflictedTypeWithUnsafeVariance != null) {
                            VarianceConflictType conflictType = conflictType(projectionKind, projectedTypeForConflictedTypeWithUnsafeVariance.getProjectionKind());
                            if (!CapturedTypeConstructorKt.isCaptured(type)) {
                                int i3 = AnonymousClass2.$SwitchMap$org$jetbrains$kotlin$types$TypeSubstitutor$VarianceConflictType[conflictType.ordinal()];
                                if (i3 == 1) {
                                    throw new SubstitutionException("Out-projection in in-position");
                                }
                                if (i3 == 2) {
                                    return new TypeProjectionImpl(Variance.OUT_VARIANCE, type.getConstructor().getBuiltIns().getNullableAnyType());
                                }
                            }
                            CustomTypeParameter customTypeParameter = TypeCapabilitiesKt.getCustomTypeParameter(type);
                            if (projectedTypeForConflictedTypeWithUnsafeVariance.isStarProjection()) {
                                if (projectedTypeForConflictedTypeWithUnsafeVariance == null) {
                                    $$$reportNull$$$0(24);
                                }
                                return projectedTypeForConflictedTypeWithUnsafeVariance;
                            }
                            if (customTypeParameter != null) {
                                makeNullableIfNeeded = customTypeParameter.substitutionResult(projectedTypeForConflictedTypeWithUnsafeVariance.getType());
                            } else {
                                makeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(projectedTypeForConflictedTypeWithUnsafeVariance.getType(), type.isMarkedNullable());
                            }
                            if (!type.getAnnotations().isEmpty()) {
                                makeNullableIfNeeded = TypeUtilsKt.replaceAnnotations(makeNullableIfNeeded, new CompositeAnnotations(makeNullableIfNeeded.getAnnotations(), filterOutUnsafeVariance(this.substitution.filterAnnotations(type.getAnnotations()))));
                            }
                            if (conflictType == VarianceConflictType.NO_CONFLICT) {
                                projectionKind = combine(projectionKind, projectedTypeForConflictedTypeWithUnsafeVariance.getProjectionKind());
                            }
                            return new TypeProjectionImpl(projectionKind, makeNullableIfNeeded);
                        }
                        TypeProjection substituteCompoundType = substituteCompoundType(typeProjection, i);
                        if (substituteCompoundType == null) {
                            $$$reportNull$$$0(25);
                        }
                        return substituteCompoundType;
                    }
                    if (typeProjection == null) {
                        $$$reportNull$$$0(23);
                        return typeProjection;
                    }
                }
            } else if (typeProjection == null) {
                $$$reportNull$$$0(21);
            }
        } else if (typeProjection == null) {
            $$$reportNull$$$0(19);
            return typeProjection;
        }
        return typeProjection;
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$org$jetbrains$kotlin$types$TypeSubstitutor$VarianceConflictType;

        static {
            int[] iArr = new int[VarianceConflictType.values().length];
            $SwitchMap$org$jetbrains$kotlin$types$TypeSubstitutor$VarianceConflictType = iArr;
            try {
                iArr[VarianceConflictType.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$types$TypeSubstitutor$VarianceConflictType[VarianceConflictType.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$types$TypeSubstitutor$VarianceConflictType[VarianceConflictType.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static TypeProjection projectedTypeForConflictedTypeWithUnsafeVariance(KotlinType kotlinType, TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor, TypeProjection typeProjection2) {
        if (kotlinType == null) {
            $$$reportNull$$$0(26);
        }
        if (typeProjection == null) {
            $$$reportNull$$$0(27);
        }
        if (typeProjection2 == null) {
            $$$reportNull$$$0(28);
        }
        if (kotlinType.getAnnotations().hasAnnotation(StandardNames.FqNames.unsafeVariance)) {
            TypeConstructor constructor = typeProjection.getType().getConstructor();
            if (constructor instanceof NewCapturedTypeConstructor) {
                TypeProjection projection = ((NewCapturedTypeConstructor) constructor).getProjection();
                Variance projectionKind = projection.getProjectionKind();
                if (conflictType(typeProjection2.getProjectionKind(), projectionKind) == VarianceConflictType.OUT_IN_IN_POSITION) {
                    return new TypeProjectionImpl(projection.getType());
                }
                if (typeParameterDescriptor == null) {
                    if (typeProjection == null) {
                        $$$reportNull$$$0(31);
                        return typeProjection;
                    }
                } else {
                    if (conflictType(typeParameterDescriptor.getVariance(), projectionKind) == VarianceConflictType.OUT_IN_IN_POSITION) {
                        return new TypeProjectionImpl(projection.getType());
                    }
                    if (typeProjection == null) {
                        $$$reportNull$$$0(32);
                    }
                }
            } else if (typeProjection == null) {
                $$$reportNull$$$0(30);
                return typeProjection;
            }
        } else if (typeProjection == null) {
            $$$reportNull$$$0(29);
            return typeProjection;
        }
        return typeProjection;
    }

    private static Annotations filterOutUnsafeVariance(Annotations annotations) {
        if (annotations == null) {
            $$$reportNull$$$0(33);
        }
        if (annotations.hasAnnotation(StandardNames.FqNames.unsafeVariance)) {
            return new FilteredAnnotations(annotations, new Function1<FqName, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.1
                private static /* synthetic */ void $$$reportNull$$$0(int i) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
                }

                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(FqName fqName) {
                    if (fqName == null) {
                        $$$reportNull$$$0(0);
                    }
                    return Boolean.valueOf(!fqName.equals(StandardNames.FqNames.unsafeVariance));
                }
            });
        }
        if (annotations == null) {
            $$$reportNull$$$0(34);
        }
        return annotations;
    }

    private TypeProjection substituteCompoundType(TypeProjection typeProjection, int i) throws SubstitutionException {
        KotlinType type = typeProjection.getType();
        Variance projectionKind = typeProjection.getProjectionKind();
        if (type.getConstructor().mo2079getDeclarationDescriptor() instanceof TypeParameterDescriptor) {
            return typeProjection;
        }
        SimpleType abbreviation = SpecialTypesKt.getAbbreviation(type);
        KotlinType substitute = abbreviation != null ? replaceWithNonApproximatingSubstitution().substitute(abbreviation, Variance.INVARIANT) : null;
        KotlinType replace = TypeSubstitutionKt.replace(type, substituteTypeArguments(type.getConstructor().getParameters(), type.getArguments(), i), this.substitution.filterAnnotations(type.getAnnotations()));
        if ((replace instanceof SimpleType) && (substitute instanceof SimpleType)) {
            replace = SpecialTypesKt.withAbbreviation((SimpleType) replace, (SimpleType) substitute);
        }
        return new TypeProjectionImpl(projectionKind, replace);
    }

    private List<TypeProjection> substituteTypeArguments(List<TypeParameterDescriptor> list, List<TypeProjection> list2, int i) throws SubstitutionException {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            TypeParameterDescriptor typeParameterDescriptor = list.get(i2);
            TypeProjection typeProjection = list2.get(i2);
            TypeProjection unsafeSubstitute = unsafeSubstitute(typeProjection, typeParameterDescriptor, i + 1);
            int i3 = AnonymousClass2.$SwitchMap$org$jetbrains$kotlin$types$TypeSubstitutor$VarianceConflictType[conflictType(typeParameterDescriptor.getVariance(), unsafeSubstitute.getProjectionKind()).ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 && typeParameterDescriptor.getVariance() != Variance.INVARIANT && !unsafeSubstitute.isStarProjection()) {
                    unsafeSubstitute = new TypeProjectionImpl(Variance.INVARIANT, unsafeSubstitute.getType());
                }
            } else {
                unsafeSubstitute = TypeUtils.makeStarProjection(typeParameterDescriptor);
            }
            if (unsafeSubstitute != typeProjection) {
                z = true;
            }
            arrayList.add(unsafeSubstitute);
        }
        return !z ? list2 : arrayList;
    }

    public static Variance combine(Variance variance, TypeProjection typeProjection) {
        if (variance == null) {
            $$$reportNull$$$0(35);
        }
        if (typeProjection == null) {
            $$$reportNull$$$0(36);
        }
        if (!typeProjection.isStarProjection()) {
            return combine(variance, typeProjection.getProjectionKind());
        }
        Variance variance2 = Variance.OUT_VARIANCE;
        if (variance2 == null) {
            $$$reportNull$$$0(37);
        }
        return variance2;
    }

    public static Variance combine(Variance variance, Variance variance2) {
        if (variance == null) {
            $$$reportNull$$$0(38);
        }
        if (variance2 == null) {
            $$$reportNull$$$0(39);
        }
        if (variance == Variance.INVARIANT) {
            if (variance2 == null) {
                $$$reportNull$$$0(40);
                return variance2;
            }
        } else {
            if (variance2 == Variance.INVARIANT) {
                if (variance == null) {
                    $$$reportNull$$$0(41);
                }
                return variance;
            }
            if (variance != variance2) {
                throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
            }
            if (variance2 == null) {
                $$$reportNull$$$0(42);
            }
        }
        return variance2;
    }

    private static VarianceConflictType conflictType(Variance variance, Variance variance2) {
        if (variance == Variance.IN_VARIANCE && variance2 == Variance.OUT_VARIANCE) {
            return VarianceConflictType.OUT_IN_IN_POSITION;
        }
        if (variance == Variance.OUT_VARIANCE && variance2 == Variance.IN_VARIANCE) {
            return VarianceConflictType.IN_IN_OUT_POSITION;
        }
        return VarianceConflictType.NO_CONFLICT;
    }

    private static void assertRecursionDepth(int i, TypeProjection typeProjection, TypeSubstitution typeSubstitution) {
        if (i > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + safeToString(typeProjection) + "; substitution: " + safeToString(typeSubstitution));
        }
    }

    private static String safeToString(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (ExceptionUtilsKt.isProcessCanceledException(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }
}
