package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: JvmSerializable.jvm.kt */
/* loaded from: classes6.dex */
public abstract class JvmSerializable_jvmKt {
    public static final Object JvmSerializerReplacement(JvmSerializer serializer, Object value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(value, "value");
        return new DefaultJvmSerializerReplacement(serializer, value);
    }
}
