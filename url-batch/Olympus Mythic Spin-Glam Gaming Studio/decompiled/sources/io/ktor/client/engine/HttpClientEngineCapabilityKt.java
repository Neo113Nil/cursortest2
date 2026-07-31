package io.ktor.client.engine;

import io.ktor.client.plugins.HttpTimeoutCapability;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* compiled from: HttpClientEngineCapability.kt */
/* loaded from: classes6.dex */
public abstract class HttpClientEngineCapabilityKt {
    private static final Set DEFAULT_CAPABILITIES;
    private static final AttributeKey ENGINE_CAPABILITIES_KEY;

    public static final AttributeKey getENGINE_CAPABILITIES_KEY() {
        return ENGINE_CAPABILITIES_KEY;
    }

    static {
        KType kType;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Map.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            kType = Reflection.mutableCollectionType(Reflection.typeOf(Map.class, companion.invariant(Reflection.typeOf(HttpClientEngineCapability.class, companion.getSTAR())), companion.invariant(Reflection.typeOf(Object.class))));
        } catch (Throwable unused) {
            kType = null;
        }
        ENGINE_CAPABILITIES_KEY = new AttributeKey("EngineCapabilities", new TypeInfo(orCreateKotlinClass, kType));
        DEFAULT_CAPABILITIES = SetsKt.setOf(HttpTimeoutCapability.INSTANCE);
    }
}
