package sg.bigo.ads.api.core;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.ai.e;

/* loaded from: classes5.dex */
public final class j implements sg.bigo.ads.ai.e {
    public sg.bigo.ads.ai.f[] e;
    public sg.bigo.ads.ai.f f;
    public long a = 0;
    public String b = "en";
    public String c = "";
    public String d = "";
    public String g = "";
    public String h = "";
    public int i = 0;
    public int j = 0;

    @NonNull
    public e.b l = new e.b();

    @NonNull
    public e.a m = new e.a();

    @NonNull
    public e.c[] k = new e.c[0];

    private void a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new k(optJSONObject));
                }
            }
            k[] kVarArr = new k[arrayList.size()];
            this.e = kVarArr;
            this.e = (sg.bigo.ads.ai.f[]) arrayList.toArray(kVarArr);
        }
    }

    @Override // sg.bigo.ads.ai.e
    public final String a() {
        return this.c;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = jSONObject.optLong("form_id", 0L);
            this.c = jSONObject.optString("title", "");
            this.b = jSONObject.optString("ad_lang", "en");
            this.d = jSONObject.optString("description", "");
            this.g = jSONObject.optString("purpose", "");
            this.i = jSONObject.optInt("color", 0);
            this.j = jSONObject.optInt("form_style_id", 0);
            this.h = jSONObject.optString("extra", "");
            a(jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("icon");
            if (optJSONObject != null) {
                this.f = new k(optJSONObject);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("questions");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        arrayList.add(new e.c(optJSONObject2));
                    }
                }
                e.c[] cVarArr = new e.c[arrayList.size()];
                this.k = cVarArr;
                this.k = (e.c[]) arrayList.toArray(cVarArr);
            }
            e.b bVar = this.l;
            String optString = jSONObject.optString("privacy", "");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    bVar.a = jSONObject2.optString("name", "");
                    bVar.b = jSONObject2.optString("url", "");
                } catch (JSONException unused) {
                }
            }
            e.a aVar = this.m;
            String optString2 = jSONObject.optString("feedback", "");
            if (TextUtils.isEmpty(optString2)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(optString2);
            aVar.a = jSONObject3.optString("title", "");
            aVar.b = jSONObject3.optString("description", "");
            aVar.c = jSONObject3.optString("cta", "");
            aVar.d = jSONObject3.optString("land_url", "");
        } catch (JSONException unused2) {
        }
    }

    @Override // sg.bigo.ads.ai.e
    public final String b() {
        return this.d;
    }

    @Override // sg.bigo.ads.ai.e
    public final long c() {
        return this.a;
    }

    @Override // sg.bigo.ads.ai.e
    public final int d() {
        return this.i;
    }

    @Override // sg.bigo.ads.ai.e
    public final String e() {
        return this.b;
    }

    @Override // sg.bigo.ads.ai.e
    public final int f() {
        return this.j;
    }

    @Override // sg.bigo.ads.ai.e
    public final String g() {
        return this.h;
    }

    @Override // sg.bigo.ads.ai.e
    public final String h() {
        return this.g;
    }

    @Override // sg.bigo.ads.ai.e
    public final sg.bigo.ads.ai.f[] i() {
        return this.e;
    }

    @Override // sg.bigo.ads.ai.e
    public final sg.bigo.ads.ai.f j() {
        sg.bigo.ads.ai.f[] fVarArr = this.e;
        if (fVarArr == null || fVarArr.length <= 0) {
            return null;
        }
        return fVarArr[0];
    }

    @Override // sg.bigo.ads.ai.e
    public final sg.bigo.ads.ai.f k() {
        return this.f;
    }

    @Override // sg.bigo.ads.ai.e
    public final e.b l() {
        return this.l;
    }

    @Override // sg.bigo.ads.ai.e
    public final e.c[] m() {
        return this.k;
    }

    @Override // sg.bigo.ads.ai.e
    public final e.a n() {
        return this.m;
    }
}
