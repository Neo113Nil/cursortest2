package sg.bigo.ads.cn;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class j extends b {
    public j(@NonNull sg.bigo.ads.ai.j jVar, @NonNull sg.bigo.ads.an.g gVar, @NonNull sg.bigo.ads.cf.b bVar, @NonNull sg.bigo.ads.api.b bVar2, @NonNull sg.bigo.ads.ai.n nVar, @NonNull sg.bigo.ads.ce.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.ai.n> eVar) {
        super(jVar, gVar, bVar, bVar2, nVar, eVar);
    }

    @Override // sg.bigo.ads.cn.b, sg.bigo.ads.cn.a
    protected final void a(@NonNull String str, @NonNull Map<String, Object> map) {
        sg.bigo.ads.cj.b a;
        if (this.m != null) {
            Object obj = map.get("logid");
            long longValue = obj instanceof Long ? ((Long) obj).longValue() : 0L;
            try {
                JSONObject jSONObject = new JSONObject(str);
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("ads");
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null && (a = sg.bigo.ads.cj.b.a(longValue, k().g, this.l, optJSONObject)) != null) {
                        arrayList.add(a);
                    }
                }
                if (sg.bigo.ads.common.utils.l.a((Collection) arrayList)) {
                    a(1005, 0, "empty ad data.");
                } else {
                    this.m.a(a(), this.k, (sg.bigo.ads.cj.b[]) arrayList.toArray(new sg.bigo.ads.cj.b[arrayList.size()]));
                }
            } catch (JSONException unused) {
                a(1005, 0, "Invalid ad data.");
            }
        }
    }

    @Override // sg.bigo.ads.cn.b, sg.bigo.ads.cn.a
    protected final void i() {
        sg.bigo.ads.bw.a.B();
    }

    @Override // sg.bigo.ads.cn.b, sg.bigo.ads.cn.a
    protected final boolean j() {
        return sg.bigo.ads.ai.k.a.e() && sg.bigo.ads.bw.a.A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sg.bigo.ads.cn.b, sg.bigo.ads.cn.a
    @NonNull
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final sg.bigo.ads.cf.e f() {
        return this.c.b("/Ad/GetUniIconAds", null);
    }
}
