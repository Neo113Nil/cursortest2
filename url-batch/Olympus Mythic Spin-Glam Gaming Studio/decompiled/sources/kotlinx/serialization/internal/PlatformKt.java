package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* compiled from: Platform.kt */
/* loaded from: classes5.dex */
public abstract class PlatformKt {
    public static final boolean isInterface(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return JvmClassMappingKt.getJavaClass(kClass).isInterface();
    }

    public static final KSerializer compiledSerializerImpl(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return constructSerializerForGivenTypeArgs(kClass, new KSerializer[0]);
    }

    public static final Object[] toNativeArrayImpl(ArrayList arrayList, KClass eClass) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object newInstance = Array.newInstance((Class<?>) JvmClassMappingKt.getJavaClass(eClass), arrayList.size());
        Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return array;
    }

    public static final Void platformSpecificSerializerNotRegistered(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    public static final KSerializer constructSerializerForGivenTypeArgs(KClass kClass, KSerializer... args) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return constructSerializerForGivenTypeArgs(JvmClassMappingKt.getJavaClass(kClass), (KSerializer[]) Arrays.copyOf(args, args.length));
    }

    public static final KSerializer constructSerializerForGivenTypeArgs(Class cls, KSerializer... args) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        if (cls.isEnum() && isNotAnnotated(cls)) {
            return createEnumSerializer(cls);
        }
        KSerializer invokeSerializerOnDefaultCompanion = invokeSerializerOnDefaultCompanion(cls, (KSerializer[]) Arrays.copyOf(args, args.length));
        if (invokeSerializerOnDefaultCompanion != null) {
            return invokeSerializerOnDefaultCompanion;
        }
        KSerializer findObjectSerializer = findObjectSerializer(cls);
        if (findObjectSerializer != null) {
            return findObjectSerializer;
        }
        KSerializer findInNamedCompanion = findInNamedCompanion(cls, (KSerializer[]) Arrays.copyOf(args, args.length));
        if (findInNamedCompanion != null) {
            return findInNamedCompanion;
        }
        if (isPolymorphicSerializer(cls)) {
            return new PolymorphicSerializer(JvmClassMappingKt.getKotlinClass(cls));
        }
        return null;
    }

    private static final KSerializer findInNamedCompanion(Class cls, KSerializer... kSerializerArr) {
        Field field;
        KSerializer invokeSerializerOnCompanion;
        Object findNamedCompanionByAnnotation = findNamedCompanionByAnnotation(cls);
        if (findNamedCompanionByAnnotation != null && (invokeSerializerOnCompanion = invokeSerializerOnCompanion(findNamedCompanionByAnnotation, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length))) != null) {
            return invokeSerializerOnCompanion;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i = 0;
            Class<?> cls2 = null;
            boolean z = false;
            while (true) {
                if (i < length) {
                    Class<?> cls3 = declaredClasses[i];
                    if (Intrinsics.areEqual(cls3.getSimpleName(), "$serializer")) {
                        if (z) {
                            break;
                        }
                        z = true;
                        cls2 = cls3;
                    }
                    i++;
                } else if (!z) {
                }
            }
            cls2 = null;
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof KSerializer) {
                return (KSerializer) obj;
            }
            return null;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static final Object findNamedCompanionByAnnotation(Class cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i];
            if (cls2.getAnnotation(NamedCompanion.class) != null) {
                break;
            }
            i++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return companionOrNull(cls, simpleName);
    }

    private static final boolean isNotAnnotated(Class cls) {
        return cls.getAnnotation(Serializable.class) == null && cls.getAnnotation(Polymorphic.class) == null;
    }

    private static final boolean isPolymorphicSerializer(Class cls) {
        if (cls.getAnnotation(Polymorphic.class) != null) {
            return true;
        }
        Serializable serializable = (Serializable) cls.getAnnotation(Serializable.class);
        return serializable != null && Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(serializable.with()), Reflection.getOrCreateKotlinClass(PolymorphicSerializer.class));
    }

    private static final KSerializer invokeSerializerOnDefaultCompanion(Class cls, KSerializer... kSerializerArr) {
        Object companionOrNull = companionOrNull(cls, "Companion");
        if (companionOrNull == null) {
            return null;
        }
        return invokeSerializerOnCompanion(companionOrNull, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    private static final KSerializer invokeSerializerOnCompanion(Object obj, KSerializer... kSerializerArr) {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (invoke instanceof KSerializer) {
                return (KSerializer) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final Object companionOrNull(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static final KSerializer createEnumSerializer(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
        Intrinsics.checkNotNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new EnumSerializer(canonicalName, (Enum[]) enumConstants);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009d, code lost:
    
        if (r4 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0056, code lost:
    
        if (r5 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final KSerializer findObjectSerializer(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return null;
        }
        int i = 0;
        if (StringsKt.startsWith$default(canonicalName, "java.", false, 2, (Object) null) || StringsKt.startsWith$default(canonicalName, "kotlin.", false, 2, (Object) null)) {
            return null;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        int length = declaredFields.length;
        Field field = null;
        int i2 = 0;
        boolean z = false;
        while (true) {
            if (i2 < length) {
                Field field2 = declaredFields[i2];
                if (Intrinsics.areEqual(field2.getName(), "INSTANCE") && Intrinsics.areEqual(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                    if (z) {
                        break;
                    }
                    z = true;
                    field = field2;
                }
                i2++;
            }
        }
        field = null;
        if (field == null) {
            return null;
        }
        Object obj = field.get(null);
        Method[] methods = cls.getMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
        int length2 = methods.length;
        Method method = null;
        boolean z2 = false;
        while (true) {
            if (i < length2) {
                Method method2 = methods[i];
                if (Intrinsics.areEqual(method2.getName(), "serializer")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0 && Intrinsics.areEqual(method2.getReturnType(), KSerializer.class)) {
                        if (z2) {
                            break;
                        }
                        method = method2;
                        z2 = true;
                    }
                }
                i++;
            }
        }
        method = null;
        if (method == null) {
            return null;
        }
        Object invoke = method.invoke(obj, null);
        if (invoke instanceof KSerializer) {
            return (KSerializer) invoke;
        }
        return null;
    }

    public static final boolean isReferenceArray(KClass rootClass) {
        Intrinsics.checkNotNullParameter(rootClass, "rootClass");
        return JvmClassMappingKt.getJavaClass(rootClass).isArray();
    }

    public static final Map initBuiltins() {
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(String.class), BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Character.TYPE), BuiltinSerializersKt.serializer(CharCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(char[].class), BuiltinSerializersKt.CharArraySerializer());
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Double.TYPE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(double[].class), BuiltinSerializersKt.DoubleArraySerializer());
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Float.TYPE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(float[].class), BuiltinSerializersKt.FloatArraySerializer());
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Long.TYPE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(long[].class), BuiltinSerializersKt.LongArraySerializer());
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(ULong.class), BuiltinSerializersKt.serializer(ULong.Companion));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Integer.TYPE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(int[].class), BuiltinSerializersKt.IntArraySerializer());
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(UInt.class), BuiltinSerializersKt.serializer(UInt.Companion));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Short.TYPE), BuiltinSerializersKt.serializer(ShortCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(short[].class), BuiltinSerializersKt.ShortArraySerializer());
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(UShort.class), BuiltinSerializersKt.serializer(UShort.Companion));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Byte.TYPE), BuiltinSerializersKt.serializer(ByteCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(byte[].class), BuiltinSerializersKt.ByteArraySerializer());
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(UByte.class), BuiltinSerializersKt.serializer(UByte.Companion));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Boolean.TYPE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(boolean[].class), BuiltinSerializersKt.BooleanArraySerializer());
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Unit.class), BuiltinSerializersKt.serializer(Unit.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Void.class), BuiltinSerializersKt.NothingSerializer());
        try {
            createMapBuilder.put(Reflection.getOrCreateKotlinClass(Duration.class), BuiltinSerializersKt.serializer(Duration.Companion));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            createMapBuilder.put(Reflection.getOrCreateKotlinClass(ULongArray.class), BuiltinSerializersKt.ULongArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            createMapBuilder.put(Reflection.getOrCreateKotlinClass(UIntArray.class), BuiltinSerializersKt.UIntArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            createMapBuilder.put(Reflection.getOrCreateKotlinClass(UShortArray.class), BuiltinSerializersKt.UShortArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            createMapBuilder.put(Reflection.getOrCreateKotlinClass(UByteArray.class), BuiltinSerializersKt.UByteArraySerializer());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            createMapBuilder.put(Reflection.getOrCreateKotlinClass(Uuid.class), BuiltinSerializersKt.serializer(Uuid.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return MapsKt.build(createMapBuilder);
    }
}
