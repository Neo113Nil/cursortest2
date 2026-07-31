package yads;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class si0 extends Lambda implements Function2 {
    public final /* synthetic */ ti0 b;
    public final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si0(ti0 ti0Var, ArrayList arrayList) {
        super(2);
        this.b = ti0Var;
        this.c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        JSONObject jSONObject = (JSONObject) obj;
        ii0 ii0Var = (ii0) obj2;
        this.b.getClass();
        String str = null;
        if (jSONObject.has("view_name")) {
            try {
                obj3 = jSONObject.get("view_name");
            } catch (JSONException unused) {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str = (String) obj3;
            }
        }
        if (str != null) {
            this.c.add(new hi0(ii0Var, str));
        }
        return Unit.INSTANCE;
    }
}
