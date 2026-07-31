package yads;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonArrayBuilder;
import kotlinx.serialization.json.JsonElementBuildersKt;

/* loaded from: classes3.dex */
public final class p6 extends Lambda implements Function1 {
    public final /* synthetic */ d7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(d7 d7Var) {
        super(1);
        this.b = d7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonArrayBuilder jsonArrayBuilder = (JsonArrayBuilder) obj;
        Iterator it = this.b.g.iterator();
        while (it.hasNext()) {
            JsonElementBuildersKt.add(jsonArrayBuilder, (String) it.next());
        }
        return Unit.INSTANCE;
    }
}
