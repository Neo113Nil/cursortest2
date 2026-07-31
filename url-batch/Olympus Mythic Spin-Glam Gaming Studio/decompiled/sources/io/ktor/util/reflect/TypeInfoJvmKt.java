package io.ktor.util.reflect;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: TypeInfoJvm.kt */
/* loaded from: classes3.dex */
public abstract class TypeInfoJvmKt {
    public static final boolean instanceOf(Object obj, KClass type) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return JvmClassMappingKt.getJavaClass(type).isInstance(obj);
    }
}
