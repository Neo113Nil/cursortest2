package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionNInfo;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.StringsKt;

/* compiled from: signatureEnhancement.kt */
/* loaded from: classes8.dex */
public final class SignatureEnhancement {
    private final JavaTypeEnhancement typeEnhancement;

    public SignatureEnhancement(JavaTypeEnhancement typeEnhancement) {
        Intrinsics.checkNotNullParameter(typeEnhancement, "typeEnhancement");
        this.typeEnhancement = typeEnhancement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(LazyJavaResolverContext c, Collection<? extends D> platformSignatures) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(platformSignatures, "platformSignatures");
        Collection<? extends D> collection = platformSignatures;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(enhanceSignature((CallableMemberDescriptor) it.next(), c));
        }
        return arrayList;
    }

    private final <D extends CallableMemberDescriptor> Annotations getDefaultAnnotations(D d, LazyJavaResolverContext lazyJavaResolverContext) {
        ClassifierDescriptor topLevelContainingClassifier = DescriptorUtilKt.getTopLevelContainingClassifier(d);
        if (topLevelContainingClassifier == null) {
            return d.getAnnotations();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptor = topLevelContainingClassifier instanceof LazyJavaClassDescriptor ? (LazyJavaClassDescriptor) topLevelContainingClassifier : null;
        List<JavaAnnotation> moduleAnnotations = lazyJavaClassDescriptor != null ? lazyJavaClassDescriptor.getModuleAnnotations() : null;
        List<JavaAnnotation> list = moduleAnnotations;
        if (list == null || list.isEmpty()) {
            return d.getAnnotations();
        }
        List<JavaAnnotation> list2 = moduleAnnotations;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, (JavaAnnotation) it.next(), true));
        }
        return Annotations.Companion.create(CollectionsKt.plus((Iterable) d.getAnnotations(), (Iterable) arrayList));
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x023c, code lost:
    
        if (r1 == null) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <D extends CallableMemberDescriptor> D enhanceSignature(D d, LazyJavaResolverContext lazyJavaResolverContext) {
        D d2;
        KotlinType kotlinType;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo;
        KotlinType enhance$default;
        KotlinType returnType;
        Pair<CallableDescriptor.UserDataKey<?>, ?> pair;
        KotlinType kotlinType2;
        ArrayList arrayList;
        Iterator it;
        boolean z;
        boolean z2;
        KotlinType type;
        List<TypeEnhancementInfo> parametersInfo;
        String errorsSinceLanguageVersion;
        PropertyDescriptorImpl propertyDescriptorImpl;
        PropertyGetterDescriptorImpl getter;
        if ((d instanceof JavaCallableMemberDescriptor) && (d.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE || d.getOriginal().getOverriddenDescriptors().size() != 1)) {
            LazyJavaResolverContext copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, getDefaultAnnotations(d, lazyJavaResolverContext));
            if (!(d instanceof JavaPropertyDescriptor) || (getter = (propertyDescriptorImpl = (PropertyDescriptorImpl) d).getGetter()) == null || getter.isDefault()) {
                d2 = d;
            } else {
                PropertyGetterDescriptorImpl getter2 = propertyDescriptorImpl.getGetter();
                Intrinsics.checkNotNull(getter2);
                d2 = getter2;
            }
            D d3 = d;
            if (d3.getExtensionReceiverParameter() != null) {
                FunctionDescriptor functionDescriptor = d2 instanceof FunctionDescriptor ? (FunctionDescriptor) d2 : null;
                kotlinType = enhanceValueParameter(d, functionDescriptor != null ? (ValueParameterDescriptor) functionDescriptor.getUserData(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER) : null, copyWithNewDefaultTypeQualifiers, null, false, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$0
                    @Override // kotlin.jvm.functions.Function1
                    public Object invoke(Object obj) {
                        KotlinType enhanceSignature$lambda$2;
                        enhanceSignature$lambda$2 = SignatureEnhancement.enhanceSignature$lambda$2((CallableMemberDescriptor) obj);
                        return enhanceSignature$lambda$2;
                    }
                });
            } else {
                kotlinType = null;
            }
            JavaMethodDescriptor javaMethodDescriptor = d instanceof JavaMethodDescriptor ? (JavaMethodDescriptor) d : null;
            int i = 0;
            if (javaMethodDescriptor != null) {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                DeclarationDescriptor containingDeclaration = javaMethodDescriptor.getContainingDeclaration();
                Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                String signature = MethodSignatureBuildingUtilsKt.signature(signatureBuildingComponents, (ClassDescriptor) containingDeclaration, MethodSignatureMappingKt.computeJvmDescriptor$default(javaMethodDescriptor, false, false, 3, null));
                if (signature != null) {
                    PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo2 = PredefinedEnhancementInfoKt.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE().get(signature);
                    if (predefinedFunctionEnhancementInfo2 == null) {
                        predefinedFunctionEnhancementInfo2 = null;
                    } else {
                        if (predefinedFunctionEnhancementInfo2.getErrorsSinceLanguageVersion() != null && ((errorsSinceLanguageVersion = predefinedFunctionEnhancementInfo2.getErrorsSinceLanguageVersion()) == null || !StringsKt.startsWith$default(errorsSinceLanguageVersion, "2.", false, 2, (Object) null))) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (predefinedFunctionEnhancementInfo2.getErrorsSinceLanguageVersion() != null) {
                            predefinedFunctionEnhancementInfo2 = predefinedFunctionEnhancementInfo2.getWarningModeClone();
                        }
                    }
                    predefinedFunctionEnhancementInfo = predefinedFunctionEnhancementInfo2;
                    if (predefinedFunctionEnhancementInfo != null) {
                        predefinedFunctionEnhancementInfo.getParametersInfo().size();
                        ((JavaMethodDescriptor) d).getValueParameters().size();
                    }
                    boolean z3 = (!UtilsKt.isJspecifyEnabledInStrictMode(lazyJavaResolverContext.getComponents().getJavaTypeEnhancementState()) || copyWithNewDefaultTypeQualifiers.getComponents().getSettings().getIgnoreNullabilityForErasedValueParameters()) && UtilsKt.hasErasedValueParameters(d);
                    List<ValueParameterDescriptor> valueParameters = d2.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                    List<ValueParameterDescriptor> list = valueParameters;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (final ValueParameterDescriptor valueParameterDescriptor : list) {
                        ArrayList arrayList3 = arrayList2;
                        arrayList3.add(enhanceValueParameter(d, valueParameterDescriptor, copyWithNewDefaultTypeQualifiers, (predefinedFunctionEnhancementInfo == null || (parametersInfo = predefinedFunctionEnhancementInfo.getParametersInfo()) == null) ? null : (TypeEnhancementInfo) CollectionsKt.getOrNull(parametersInfo, valueParameterDescriptor.getIndex()), z3, new Function1(valueParameterDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$1
                            private final ValueParameterDescriptor arg$0;

                            {
                                this.arg$0 = valueParameterDescriptor;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public Object invoke(Object obj) {
                                KotlinType enhanceSignature$lambda$9$lambda$8;
                                enhanceSignature$lambda$9$lambda$8 = SignatureEnhancement.enhanceSignature$lambda$9$lambda$8(this.arg$0, (CallableMemberDescriptor) obj);
                                return enhanceSignature$lambda$9$lambda$8;
                            }
                        }));
                        arrayList2 = arrayList3;
                    }
                    ArrayList arrayList4 = arrayList2;
                    D d4 = d2;
                    PropertyDescriptor propertyDescriptor = !(d instanceof PropertyDescriptor) ? (PropertyDescriptor) d : null;
                    enhance$default = enhance$default(this, d, d4, true, copyWithNewDefaultTypeQualifiers, (propertyDescriptor == null && JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) ? AnnotationQualifierApplicabilityType.FIELD : AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE, predefinedFunctionEnhancementInfo == null ? predefinedFunctionEnhancementInfo.getReturnTypeInfo() : null, false, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$2
                        @Override // kotlin.jvm.functions.Function1
                        public Object invoke(Object obj) {
                            KotlinType enhanceSignature$lambda$10;
                            enhanceSignature$lambda$10 = SignatureEnhancement.enhanceSignature$lambda$10((CallableMemberDescriptor) obj);
                            return enhanceSignature$lambda$10;
                        }
                    }, 32, null);
                    returnType = d3.getReturnType();
                    Intrinsics.checkNotNull(returnType);
                    if (!containsFunctionN(returnType)) {
                        ReceiverParameterDescriptor extensionReceiverParameter = d3.getExtensionReceiverParameter();
                        if (!((extensionReceiverParameter == null || (type = extensionReceiverParameter.getType()) == null) ? false : containsFunctionN(type))) {
                            List<ValueParameterDescriptor> valueParameters2 = d3.getValueParameters();
                            Intrinsics.checkNotNullExpressionValue(valueParameters2, "getValueParameters(...)");
                            List<ValueParameterDescriptor> list2 = valueParameters2;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator<T> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    KotlinType type2 = ((ValueParameterDescriptor) it2.next()).getType();
                                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                                    if (containsFunctionN(type2)) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                            z2 = false;
                            if (!z2) {
                                pair = null;
                                if (kotlinType == null && enhance$default == null) {
                                    arrayList = arrayList4;
                                    if ((arrayList instanceof Collection) || !arrayList.isEmpty()) {
                                        it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            if (((KotlinType) it.next()) != null) {
                                                z = true;
                                                break;
                                            }
                                        }
                                    }
                                    z = false;
                                    if (!z) {
                                    }
                                }
                                JavaCallableMemberDescriptor javaCallableMemberDescriptor = (JavaCallableMemberDescriptor) d;
                                if (kotlinType == null) {
                                    ReceiverParameterDescriptor extensionReceiverParameter2 = d3.getExtensionReceiverParameter();
                                    kotlinType2 = extensionReceiverParameter2 != null ? extensionReceiverParameter2.getType() : null;
                                } else {
                                    kotlinType2 = kotlinType;
                                }
                                ArrayList arrayList5 = arrayList4;
                                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                                for (Object obj : arrayList5) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    KotlinType kotlinType3 = (KotlinType) obj;
                                    if (kotlinType3 == null) {
                                        kotlinType3 = d3.getValueParameters().get(i).getType();
                                        Intrinsics.checkNotNullExpressionValue(kotlinType3, "getType(...)");
                                    }
                                    arrayList6.add(kotlinType3);
                                    i = i2;
                                }
                                ArrayList arrayList7 = arrayList6;
                                if (enhance$default == null) {
                                    enhance$default = d3.getReturnType();
                                    Intrinsics.checkNotNull(enhance$default);
                                }
                                JavaCallableMemberDescriptor enhance = javaCallableMemberDescriptor.enhance(kotlinType2, arrayList7, enhance$default, pair);
                                Intrinsics.checkNotNull(enhance, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                                return enhance;
                            }
                        }
                    }
                    pair = TuplesKt.to(DescriptorBasedDeprecationInfoKt.getDEPRECATED_FUNCTION_KEY(), new DeprecationCausedByFunctionNInfo(d));
                    if (kotlinType == null) {
                        arrayList = arrayList4;
                        if (arrayList instanceof Collection) {
                        }
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                    JavaCallableMemberDescriptor javaCallableMemberDescriptor2 = (JavaCallableMemberDescriptor) d;
                    if (kotlinType == null) {
                    }
                    ArrayList arrayList52 = arrayList4;
                    ArrayList arrayList62 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList52, 10));
                    while (r5.hasNext()) {
                    }
                    ArrayList arrayList72 = arrayList62;
                    if (enhance$default == null) {
                    }
                    JavaCallableMemberDescriptor enhance2 = javaCallableMemberDescriptor2.enhance(kotlinType2, arrayList72, enhance$default, pair);
                    Intrinsics.checkNotNull(enhance2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                    return enhance2;
                }
            }
            predefinedFunctionEnhancementInfo = null;
            if (predefinedFunctionEnhancementInfo != null) {
            }
            if (UtilsKt.isJspecifyEnabledInStrictMode(lazyJavaResolverContext.getComponents().getJavaTypeEnhancementState())) {
            }
            List<ValueParameterDescriptor> valueParameters3 = d2.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters3, "getValueParameters(...)");
            List<ValueParameterDescriptor> list3 = valueParameters3;
            ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            while (r16.hasNext()) {
            }
            ArrayList arrayList42 = arrayList22;
            D d42 = d2;
            if (!(d instanceof PropertyDescriptor)) {
            }
            enhance$default = enhance$default(this, d, d42, true, copyWithNewDefaultTypeQualifiers, (propertyDescriptor == null && JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) ? AnnotationQualifierApplicabilityType.FIELD : AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE, predefinedFunctionEnhancementInfo == null ? predefinedFunctionEnhancementInfo.getReturnTypeInfo() : null, false, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$2
                @Override // kotlin.jvm.functions.Function1
                public Object invoke(Object obj2) {
                    KotlinType enhanceSignature$lambda$10;
                    enhanceSignature$lambda$10 = SignatureEnhancement.enhanceSignature$lambda$10((CallableMemberDescriptor) obj2);
                    return enhanceSignature$lambda$10;
                }
            }, 32, null);
            returnType = d3.getReturnType();
            Intrinsics.checkNotNull(returnType);
            if (!containsFunctionN(returnType)) {
            }
            pair = TuplesKt.to(DescriptorBasedDeprecationInfoKt.getDEPRECATED_FUNCTION_KEY(), new DeprecationCausedByFunctionNInfo(d));
            if (kotlinType == null) {
            }
            JavaCallableMemberDescriptor javaCallableMemberDescriptor22 = (JavaCallableMemberDescriptor) d;
            if (kotlinType == null) {
            }
            ArrayList arrayList522 = arrayList42;
            ArrayList arrayList622 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList522, 10));
            while (r5.hasNext()) {
            }
            ArrayList arrayList722 = arrayList622;
            if (enhance$default == null) {
            }
            JavaCallableMemberDescriptor enhance22 = javaCallableMemberDescriptor22.enhance(kotlinType2, arrayList722, enhance$default, pair);
            Intrinsics.checkNotNull(enhance22, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
            return enhance22;
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType enhanceSignature$lambda$2(CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ReceiverParameterDescriptor extensionReceiverParameter = it.getExtensionReceiverParameter();
        Intrinsics.checkNotNull(extensionReceiverParameter);
        KotlinType type = extensionReceiverParameter.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType enhanceSignature$lambda$9$lambda$8(ValueParameterDescriptor valueParameterDescriptor, CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KotlinType type = it.getValueParameters().get(valueParameterDescriptor.getIndex()).getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType enhanceSignature$lambda$10(CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KotlinType returnType = it.getReturnType();
        Intrinsics.checkNotNull(returnType);
        return returnType;
    }

    public final List<KotlinType> enhanceTypeParameterBounds(TypeParameterDescriptor typeParameter, List<? extends KotlinType> bounds, LazyJavaResolverContext context) {
        KotlinType kotlinType;
        KotlinType enhance$default;
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(context, "context");
        List<? extends KotlinType> list = bounds;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (KotlinType kotlinType2 : list) {
            if (TypeUtilsKt.contains(kotlinType2, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$3
                @Override // kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    boolean enhanceTypeParameterBounds$lambda$15$lambda$14;
                    enhanceTypeParameterBounds$lambda$15$lambda$14 = SignatureEnhancement.enhanceTypeParameterBounds$lambda$15$lambda$14((UnwrappedType) obj);
                    return Boolean.valueOf(enhanceTypeParameterBounds$lambda$15$lambda$14);
                }
            })) {
                kotlinType = kotlinType2;
            } else {
                kotlinType = kotlinType2;
                enhance$default = enhance$default(this, new SignatureParts(typeParameter, false, context, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false, 16, null), kotlinType, CollectionsKt.emptyList(), null, false, 12, null);
                if (enhance$default != null) {
                    arrayList.add(enhance$default);
                }
            }
            enhance$default = kotlinType;
            arrayList.add(enhance$default);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enhanceTypeParameterBounds$lambda$15$lambda$14(UnwrappedType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof RawType;
    }

    public final KotlinType enhanceSuperType(KotlinType type, LazyJavaResolverContext context) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        KotlinType enhance$default = enhance$default(this, new SignatureParts(null, false, context, AnnotationQualifierApplicabilityType.TYPE_USE, true), type, CollectionsKt.emptyList(), null, false, 12, null);
        return enhance$default == null ? type : enhance$default;
    }

    private final boolean containsFunctionN(KotlinType kotlinType) {
        return TypeUtils.contains(kotlinType, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$4
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                Boolean containsFunctionN$lambda$16;
                containsFunctionN$lambda$16 = SignatureEnhancement.containsFunctionN$lambda$16((UnwrappedType) obj);
                return containsFunctionN$lambda$16;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean containsFunctionN$lambda$16(UnwrappedType unwrappedType) {
        ClassifierDescriptor mo13656getDeclarationDescriptor = unwrappedType.getConstructor().mo13656getDeclarationDescriptor();
        boolean z = false;
        if (mo13656getDeclarationDescriptor == null) {
            return false;
        }
        if (Intrinsics.areEqual(mo13656getDeclarationDescriptor.getName(), JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME().shortName()) && Intrinsics.areEqual(DescriptorUtilsKt.fqNameOrNull(mo13656getDeclarationDescriptor), JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private final KotlinType enhanceValueParameter(CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, TypeEnhancementInfo typeEnhancementInfo, boolean z, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        LazyJavaResolverContext copyWithNewDefaultTypeQualifiers;
        return enhance(callableMemberDescriptor, valueParameterDescriptor, false, (valueParameterDescriptor == null || (copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations())) == null) ? lazyJavaResolverContext : copyWithNewDefaultTypeQualifiers, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, typeEnhancementInfo, z, function1);
    }

    static /* synthetic */ KotlinType enhance$default(SignatureEnhancement signatureEnhancement, CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z2, Function1 function1, int i, Object obj) {
        return signatureEnhancement.enhance(callableMemberDescriptor, annotated, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, typeEnhancementInfo, (i & 32) != 0 ? false : z2, function1);
    }

    private final KotlinType enhance(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z2, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        SignatureParts signatureParts = new SignatureParts(annotated, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, false, 16, null);
        KotlinType invoke = function1.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
        Collection<? extends CallableMemberDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            Intrinsics.checkNotNull(callableMemberDescriptor2);
            arrayList.add(function1.invoke(callableMemberDescriptor2));
        }
        return enhance(signatureParts, invoke, arrayList, typeEnhancementInfo, z2);
    }

    static /* synthetic */ KotlinType enhance$default(SignatureEnhancement signatureEnhancement, SignatureParts signatureParts, KotlinType kotlinType, List list, TypeEnhancementInfo typeEnhancementInfo, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            typeEnhancementInfo = null;
        }
        TypeEnhancementInfo typeEnhancementInfo2 = typeEnhancementInfo;
        if ((i & 8) != 0) {
            z = false;
        }
        return signatureEnhancement.enhance(signatureParts, kotlinType, list, typeEnhancementInfo2, z);
    }

    private final KotlinType enhance(SignatureParts signatureParts, KotlinType kotlinType, List<? extends KotlinType> list, TypeEnhancementInfo typeEnhancementInfo, boolean z) {
        return this.typeEnhancement.enhance(kotlinType, signatureParts.computeIndexedQualifiers(kotlinType, list, typeEnhancementInfo, z), signatureParts.getSkipRawTypeArguments());
    }
}
