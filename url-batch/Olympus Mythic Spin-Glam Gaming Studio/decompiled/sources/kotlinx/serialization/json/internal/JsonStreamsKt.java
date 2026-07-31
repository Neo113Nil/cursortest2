package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonEncoder;

/* compiled from: JsonStreams.kt */
/* loaded from: classes4.dex */
public abstract class JsonStreamsKt {
    public static final void encodeByWriter(Json json, InternalJsonWriter writer, SerializationStrategy serializer, Object obj) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        new StreamingJsonEncoder(writer, json, WriteMode.OBJ, new JsonEncoder[WriteMode.getEntries().size()]).encodeSerializableValue(serializer, obj);
    }

    public static final Object decodeByReader(Json json, DeserializationStrategy deserializer, InternalJsonReader reader) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(reader, "reader");
        ReaderJsonLexer ReaderJsonLexer$default = ReaderJsonLexerKt.ReaderJsonLexer$default(json, reader, null, 4, null);
        try {
            Object decodeSerializableValue = new StreamingJsonDecoder(json, WriteMode.OBJ, ReaderJsonLexer$default, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
            ReaderJsonLexer$default.expectEof();
            return decodeSerializableValue;
        } finally {
            ReaderJsonLexer$default.release();
        }
    }
}
