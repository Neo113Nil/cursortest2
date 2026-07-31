package io.ktor.http;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: Url.kt */
/* loaded from: classes13.dex */
public final class UrlSerializer implements KSerializer {
    public static final UrlSerializer INSTANCE = new UrlSerializer();
    private static final SerialDescriptor descriptor = SerialDescriptorsKt.PrimitiveSerialDescriptor("io.ktor.http.Url", PrimitiveKind.STRING.INSTANCE);

    private UrlSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Url deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return URLUtilsKt.Url(decoder.decodeString());
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Url value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeString(value.getUrlString());
    }
}
