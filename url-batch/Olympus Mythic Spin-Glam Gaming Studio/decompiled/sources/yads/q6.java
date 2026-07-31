package yads;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;

/* loaded from: classes3.dex */
public final class q6 extends Lambda implements Function1 {
    public final /* synthetic */ Map.Entry b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(Map.Entry entry) {
        super(1);
        this.b = entry;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        JsonElementBuildersKt.put(jsonObjectBuilder, "usagePercent", Integer.valueOf(((f7) this.b.getValue()).a));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isDisabled", Boolean.valueOf(((f7) this.b.getValue()).b));
        return Unit.INSTANCE;
    }
}
