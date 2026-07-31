package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

/* compiled from: TreeJsonEncoder.kt */
/* loaded from: classes10.dex */
public abstract class TreeJsonEncoderKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final JsonElement writeJson(Json json, Object obj, SerializationStrategy serializer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        new JsonTreeEncoder(json, new Function1() { // from class: kotlinx.serialization.json.internal.TreeJsonEncoderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit writeJson$lambda$0;
                writeJson$lambda$0 = TreeJsonEncoderKt.writeJson$lambda$0(Ref$ObjectRef.this, (JsonElement) obj2);
                return writeJson$lambda$0;
            }
        }).encodeSerializableValue(serializer, obj);
        T t = ref$ObjectRef.element;
        if (t != 0) {
            return (JsonElement) t;
        }
        Intrinsics.throwUninitializedPropertyAccessException("result");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit writeJson$lambda$0(Ref$ObjectRef ref$ObjectRef, JsonElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ref$ObjectRef.element = it;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getRequiresTopLevelTag(SerialDescriptor serialDescriptor) {
        return (serialDescriptor.getKind() instanceof PrimitiveKind) || serialDescriptor.getKind() == SerialKind.ENUM.INSTANCE;
    }
}
