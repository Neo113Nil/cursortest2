package kotlinx.serialization.json;

import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* compiled from: JsonElement.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/JsonPrimitive;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable(with = JsonNullSerializer.class)
/* loaded from: classes5.dex */
public final class JsonNull extends JsonPrimitive {

    @NotNull
    public static final JsonNull INSTANCE = new JsonNull();
    private static final String content = POBCommonConstants.NULL_VALUE;

    @NotNull
    public final KSerializer serializer() {
        return JsonNullSerializer.INSTANCE;
    }

    private JsonNull() {
        super(null);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String getContent() {
        return content;
    }
}
