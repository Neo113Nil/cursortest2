package yads;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class qt0 implements ai {
    public final t31 a;

    public qt0(t31 t31Var) {
        this.a = t31Var;
    }

    @Override // yads.ai
    public final Object a(JSONObject jSONObject) {
        q31 q31Var;
        if (!jSONObject.has("value")) {
            boolean z = ob1.a;
            throw new o12("Native Ad json has not required attributes");
        }
        if (jSONObject.isNull("value")) {
            q31Var = null;
        } else {
            t31 t31Var = this.a;
            if (!jSONObject.has("value") || jSONObject.isNull("value")) {
                boolean z2 = ob1.a;
                throw new o12("Native Ad json has not required attributes");
            }
            q31Var = t31Var.a.a(jSONObject.getJSONObject("value"));
        }
        return new ot0(q31Var);
    }
}
