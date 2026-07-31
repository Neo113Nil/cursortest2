package kotlinx.serialization;

/* compiled from: SerialFormat.kt */
/* loaded from: classes3.dex */
public interface StringFormat extends SerialFormat {
    Object decodeFromString(DeserializationStrategy deserializationStrategy, String str);

    String encodeToString(SerializationStrategy serializationStrategy, Object obj);
}
