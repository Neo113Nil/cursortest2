package kotlinx.serialization.json;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JsonElementBuilders.kt */
/* loaded from: classes12.dex */
public final class JsonObjectBuilder {
    private final Map content = new LinkedHashMap();

    public final JsonElement put(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        return (JsonElement) this.content.put(key, element);
    }

    public final JsonObject build() {
        return new JsonObject(this.content);
    }
}
