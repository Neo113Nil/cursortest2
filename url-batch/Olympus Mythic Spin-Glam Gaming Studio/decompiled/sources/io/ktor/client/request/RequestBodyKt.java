package io.ktor.client.request;

import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: RequestBody.kt */
/* loaded from: classes12.dex */
public abstract class RequestBodyKt {
    private static final AttributeKey BodyTypeAttributeKey;

    public static final AttributeKey getBodyTypeAttributeKey() {
        return BodyTypeAttributeKey;
    }

    static {
        KType kType;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TypeInfo.class);
        try {
            kType = Reflection.typeOf(TypeInfo.class);
        } catch (Throwable unused) {
            kType = null;
        }
        BodyTypeAttributeKey = new AttributeKey("BodyTypeAttributeKey", new TypeInfo(orCreateKotlinClass, kType));
    }
}
