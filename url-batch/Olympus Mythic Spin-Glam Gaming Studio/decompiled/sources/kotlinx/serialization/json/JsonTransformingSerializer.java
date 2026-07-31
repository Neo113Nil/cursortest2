package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: JsonTransformingSerializer.kt */
/* loaded from: classes3.dex */
public abstract class JsonTransformingSerializer implements KSerializer {

    @NotNull
    private final KSerializer tSerializer;

    protected abstract JsonElement transformDeserialize(JsonElement jsonElement);

    @NotNull
    protected JsonElement transformSerialize(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return element;
    }

    public JsonTransformingSerializer(KSerializer tSerializer) {
        Intrinsics.checkNotNullParameter(tSerializer, "tSerializer");
        this.tSerializer = tSerializer;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        JsonEncoder asJsonEncoder = JsonElementSerializersKt.asJsonEncoder(encoder);
        asJsonEncoder.encodeJsonElement(transformSerialize(TreeJsonEncoderKt.writeJson(asJsonEncoder.getJson(), obj, this.tSerializer)));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonDecoder asJsonDecoder = JsonElementSerializersKt.asJsonDecoder(decoder);
        return asJsonDecoder.getJson().decodeFromJsonElement(this.tSerializer, transformDeserialize(asJsonDecoder.decodeJsonElement()));
    }
}
