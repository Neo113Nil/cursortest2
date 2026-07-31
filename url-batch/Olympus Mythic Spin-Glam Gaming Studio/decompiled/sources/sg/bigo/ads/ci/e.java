package sg.bigo.ads.ci;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.core.r;

/* loaded from: classes5.dex */
public final class e extends f {
    public final r a;
    public final sg.bigo.ads.az.a b;
    public final sg.bigo.ads.db.a c;
    public final sg.bigo.ads.cr.a g;

    public e(@NonNull Context context) {
        super(context);
        this.a = new r();
        this.b = new sg.bigo.ads.az.a();
        this.c = new sg.bigo.ads.db.a();
        this.g = new sg.bigo.ads.cr.a();
    }

    @Override // sg.bigo.ads.an.e
    public final void a(Context context) {
        super.a(context);
        if (!TextUtils.isEmpty(this.w)) {
            try {
                d(new JSONObject(this.w));
            } catch (JSONException unused) {
            }
        }
        if (!TextUtils.isEmpty(this.v)) {
            try {
                a(new JSONObject(this.v));
            } catch (JSONException unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.u)) {
            try {
                b(new JSONObject(this.u));
            } catch (JSONException unused3) {
            }
        }
        if (TextUtils.isEmpty(this.x)) {
            return;
        }
        try {
            c(new JSONObject(this.x));
        } catch (JSONException unused4) {
        }
    }

    @Override // sg.bigo.ads.ci.f
    protected final void a(JSONObject jSONObject) {
        this.a.a(jSONObject);
    }

    @Override // sg.bigo.ads.an.e
    public final String b() {
        return "GlobalConfigData";
    }

    @Override // sg.bigo.ads.ci.f
    protected final void b(JSONObject jSONObject) {
        this.b.a(jSONObject);
    }

    @Override // sg.bigo.ads.ci.f
    protected final void c(JSONObject jSONObject) {
        this.c.a(jSONObject);
    }

    @Override // sg.bigo.ads.ci.f
    protected final void d(JSONObject jSONObject) {
        this.g.a(jSONObject);
    }

    @Override // sg.bigo.ads.ai.j
    @NonNull
    public final r m() {
        return this.a;
    }

    @NonNull
    public final String toString() {
        return "GlobalConfigData{huaweiAdIdInfo=" + this.h + ", googleAdIdInfo=" + this.i + ", location=" + this.j + ", state=" + this.m + ", configId=" + this.n + ", interval=" + this.o + ", token='" + this.p + "', antiBan='" + this.q + "', strategy=" + this.r + ", abflags='" + this.s + "', country='" + this.t + "', creatives='" + this.u + "', trackConfig='" + this.v + "', callbackConfig='" + this.w + "', reportConfig='" + this.x + "', appCheckConfig='" + this.y + "', uid='" + this.z + "', maxRequestNum=" + this.A + ", negFeedbackState=" + this.B + ", omUrl='" + this.C + "', globalSwitch=" + this.E.a + ", bannerJsUrl='" + this.D + "', reqCountry='" + this.L + "', appFlag='" + this.O + "'}";
    }
}
