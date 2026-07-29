package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: DeserializedClassDescriptor.kt */
/* loaded from: classes2.dex */
/* synthetic */ class DeserializedClassDescriptor$computeValueClassRepresentation$1 extends AdaptedFunctionReference implements Function1<ProtoBuf.Type, SimpleType> {
    DeserializedClassDescriptor$computeValueClassRepresentation$1(Object obj) {
        super(1, obj, TypeDeserializer.class, "simpleType", "simpleType(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;Z)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final SimpleType invoke(ProtoBuf.Type p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return TypeDeserializer.simpleType$default((TypeDeserializer) this.receiver, p0, false, 2, null);
    }
}
