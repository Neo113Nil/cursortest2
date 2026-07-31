package kotlinx.serialization.modules;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.modules.ContextualProvider;

/* compiled from: SerializersModuleBuilders.kt */
/* loaded from: classes3.dex */
public final class SerializersModuleBuilder implements SerializersModuleCollector {
    private boolean hasInterfaceContextualSerializers;
    private final Map class2ContextualProvider = new HashMap();
    private final Map polyBase2Serializers = new HashMap();
    private final Map polyBase2DefaultSerializerProvider = new HashMap();
    private final Map polyBase2NamedSerializers = new HashMap();
    private final Map polyBase2DefaultDeserializerProvider = new HashMap();

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public void contextual(KClass kClass, KSerializer serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        registerSerializer$default(this, kClass, new ContextualProvider.Argless(serializer), false, 4, null);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public void contextual(KClass kClass, Function1 provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        registerSerializer$default(this, kClass, new ContextualProvider.WithTypeArguments(provider), false, 4, null);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public void polymorphic(KClass baseClass, KClass actualClass, KSerializer actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        registerPolymorphicSerializer$default(this, baseClass, actualClass, actualSerializer, false, 8, null);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public void polymorphicDefaultSerializer(KClass baseClass, Function1 defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        registerDefaultPolymorphicSerializer(baseClass, defaultSerializerProvider, false);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public void polymorphicDefaultDeserializer(KClass baseClass, Function1 defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        registerDefaultPolymorphicDeserializer(baseClass, defaultDeserializerProvider, false);
    }

    public final void include(SerializersModule module) {
        Intrinsics.checkNotNullParameter(module, "module");
        module.dumpTo(this);
    }

    public static /* synthetic */ void registerSerializer$default(SerializersModuleBuilder serializersModuleBuilder, KClass kClass, ContextualProvider contextualProvider, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        serializersModuleBuilder.registerSerializer(kClass, contextualProvider, z);
    }

    public final void registerSerializer(KClass forClass, ContextualProvider provider, boolean z) {
        ContextualProvider contextualProvider;
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (!z && (contextualProvider = (ContextualProvider) this.class2ContextualProvider.get(forClass)) != null && !Intrinsics.areEqual(contextualProvider, provider)) {
            throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
        }
        this.class2ContextualProvider.put(forClass, provider);
        if (PlatformKt.isInterface(forClass)) {
            this.hasInterfaceContextualSerializers = true;
        }
    }

    public final void registerDefaultPolymorphicSerializer(KClass baseClass, Function1 defaultSerializerProvider, boolean z) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        Function1 function1 = (Function1) this.polyBase2DefaultSerializerProvider.get(baseClass);
        if (function1 != null && !Intrinsics.areEqual(function1, defaultSerializerProvider) && !z) {
            throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + function1);
        }
        this.polyBase2DefaultSerializerProvider.put(baseClass, defaultSerializerProvider);
    }

    public final void registerDefaultPolymorphicDeserializer(KClass baseClass, Function1 defaultDeserializerProvider, boolean z) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        Function1 function1 = (Function1) this.polyBase2DefaultDeserializerProvider.get(baseClass);
        if (function1 != null && !Intrinsics.areEqual(function1, defaultDeserializerProvider) && !z) {
            throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + function1);
        }
        this.polyBase2DefaultDeserializerProvider.put(baseClass, defaultDeserializerProvider);
    }

    public static /* synthetic */ void registerPolymorphicSerializer$default(SerializersModuleBuilder serializersModuleBuilder, KClass kClass, KClass kClass2, KSerializer kSerializer, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        serializersModuleBuilder.registerPolymorphicSerializer(kClass, kClass2, kSerializer, z);
    }

    public final void registerPolymorphicSerializer(KClass baseClass, KClass concreteClass, KSerializer concreteSerializer, boolean z) {
        Object obj;
        KClass kClass;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
        Intrinsics.checkNotNullParameter(concreteSerializer, "concreteSerializer");
        String serialName = concreteSerializer.getDescriptor().getSerialName();
        Map map = this.polyBase2Serializers;
        Object obj2 = map.get(baseClass);
        if (obj2 == null) {
            obj2 = new HashMap();
            map.put(baseClass, obj2);
        }
        Map map2 = (Map) obj2;
        Map map3 = this.polyBase2NamedSerializers;
        Object obj3 = map3.get(baseClass);
        if (obj3 == null) {
            obj3 = new HashMap();
            map3.put(baseClass, obj3);
        }
        Map map4 = (Map) obj3;
        KSerializer kSerializer = (KSerializer) map2.get(concreteClass);
        if (kSerializer != null && !Intrinsics.areEqual(kSerializer, concreteSerializer)) {
            if (z) {
            } else {
                throw new SerializerAlreadyRegisteredException(baseClass, concreteClass);
            }
        }
        KSerializer kSerializer2 = (KSerializer) map4.get(serialName);
        if (kSerializer2 != null && !Intrinsics.areEqual(kSerializer2, concreteSerializer)) {
            Iterator it = MapsKt.asSequence(map2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((Map.Entry) obj).getValue() == kSerializer2) {
                        break;
                    }
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry == null || (kClass = (KClass) entry.getKey()) == null) {
                throw new IllegalStateException(("Name " + serialName + " is registered in the module but no Kotlin class is associated with it.").toString());
            }
            if (z) {
            } else {
                throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + baseClass + "' have the same serial name '" + serialName + "': " + concreteSerializer + " for '" + concreteClass + "' and " + kSerializer2 + " for '" + kClass + '\'');
            }
        }
        map2.put(concreteClass, concreteSerializer);
        map4.put(serialName, concreteSerializer);
    }

    public final SerializersModule build() {
        return new SerialModuleImpl(this.class2ContextualProvider, this.polyBase2Serializers, this.polyBase2DefaultSerializerProvider, this.polyBase2NamedSerializers, this.polyBase2DefaultDeserializerProvider, this.hasInterfaceContextualSerializers);
    }
}
