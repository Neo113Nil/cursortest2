package kotlin.jvm;

import com.adjust.sdk.Constants;
import com.safedk.android.analytics.brandsafety.m;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: JvmClassMapping.kt */
/* loaded from: classes14.dex */
public abstract class JvmClassMappingKt {
    public static final Class getJavaClass(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Class jClass = ((ClassBasedDeclarationContainer) kClass).getJClass();
        Intrinsics.checkNotNull(jClass, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return jClass;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class getJavaObjectType(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Class jClass = ((ClassBasedDeclarationContainer) kClass).getJClass();
        if (!jClass.isPrimitive()) {
            Intrinsics.checkNotNull(jClass, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return jClass;
        }
        String name = jClass.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    jClass = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals(m.w)) {
                    jClass = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    jClass = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    jClass = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals(Constants.LONG)) {
                    jClass = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    jClass = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    jClass = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    jClass = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    jClass = Short.class;
                    break;
                }
                break;
        }
        Intrinsics.checkNotNull(jClass, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return jClass;
    }

    public static final KClass getKotlinClass(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Reflection.getOrCreateKotlinClass(cls);
    }

    public static final KClass getAnnotationClass(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "<this>");
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Intrinsics.checkNotNullExpressionValue(annotationType, "annotationType(...)");
        KClass kotlinClass = getKotlinClass(annotationType);
        Intrinsics.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return kotlinClass;
    }
}
