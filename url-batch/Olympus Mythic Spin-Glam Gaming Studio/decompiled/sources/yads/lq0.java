package yads;

import android.content.Context;
import com.ironsource.C4993ye;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class lq0 {
    public final og1 a;
    public final jq0 b;

    public lq0(Context context) {
        og1 a = sg1.a(context, "FalseClickDataStorage");
        jq0 jq0Var = new jq0();
        this.a = a;
        this.b = jq0Var;
    }

    public final void a(iq0 iq0Var) {
        String str;
        String valueOf = String.valueOf(iq0Var.b);
        this.b.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ad_type", iq0Var.a.b);
        jSONObject.put("start_time", iq0Var.b);
        jSONObject.put("type", iq0Var.c.b);
        hq0 hq0Var = iq0Var.d;
        String str2 = null;
        if (hq0Var != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("interval", hq0Var.c);
            jSONObject2.put("url", hq0Var.b);
            str = jSONObject2.toString();
        } else {
            str = null;
        }
        jSONObject.put("false_click", str);
        jSONObject.put("report_data", new JSONObject(iq0Var.e));
        c cVar = iq0Var.f;
        if (cVar != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C4993ye.d, cVar.a);
            jSONObject3.put("test_ids", cVar.b);
            str2 = jSONObject3.toString();
        }
        jSONObject.put("ab_experiments", str2);
        ((qg1) this.a).a(valueOf, jSONObject.toString());
    }

    public final void a(long j) {
        ((qg1) this.a).d(String.valueOf(j));
    }
}
