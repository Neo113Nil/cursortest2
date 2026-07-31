package kotlinx.serialization.json;

import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: JsonEncoder.kt */
/* loaded from: classes6.dex */
public interface JsonEncoder extends Encoder, CompositeEncoder {
    void encodeJsonElement(JsonElement jsonElement);

    Json getJson();
}
