package yads;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;

/* loaded from: classes3.dex */
public final class r6 extends Lambda implements Function1 {
    public final /* synthetic */ d7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(d7 d7Var) {
        super(1);
        this.b = d7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        for (Map.Entry entry : this.b.h.entrySet()) {
            JsonElementBuildersKt.putJsonObject(jsonObjectBuilder, (String) entry.getKey(), new q6(entry));
        }
        return Unit.INSTANCE;
    }
}
