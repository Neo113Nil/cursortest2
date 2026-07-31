package kotlinx.serialization.json;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JsonElementBuilders.kt */
/* loaded from: classes6.dex */
public final class JsonArrayBuilder {
    private final List content = new ArrayList();

    public final boolean add(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.content.add(element);
        return true;
    }

    public final JsonArray build() {
        return new JsonArray(this.content);
    }
}
