package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* compiled from: SerializersModuleCollector.kt */
/* loaded from: classes13.dex */
public interface SerializersModuleCollector {
    /* JADX INFO: Access modifiers changed from: private */
    static KSerializer contextual$lambda$0(KSerializer kSerializer, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return kSerializer;
    }

    void contextual(KClass kClass, Function1 function1);

    void polymorphic(KClass kClass, KClass kClass2, KSerializer kSerializer);

    void polymorphicDefaultDeserializer(KClass kClass, Function1 function1);

    void polymorphicDefaultSerializer(KClass kClass, Function1 function1);

    default void contextual(KClass kClass, final KSerializer serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        contextual(kClass, new Function1() { // from class: kotlinx.serialization.modules.SerializersModuleCollector$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KSerializer contextual$lambda$0;
                contextual$lambda$0 = SerializersModuleCollector.contextual$lambda$0(KSerializer.this, (List) obj);
                return contextual$lambda$0;
            }
        });
    }
}
