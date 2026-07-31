package yads;

import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class el1 {
    public final av3 a;

    public el1(av3 av3Var) {
        this.a = av3Var;
    }

    public final void a(float f, float f2) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
        gw3.a(this.a);
        JSONObject jSONObject = new JSONObject();
        ov3.a(jSONObject, IronSourceConstants.EVENTS_DURATION, Float.valueOf(f));
        ov3.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        ov3.a(jSONObject, X3.j.P, Float.valueOf(lw3.a().a));
        this.a.e.a("start", jSONObject);
    }

    public final void a(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            gw3.a(this.a);
            JSONObject jSONObject = new JSONObject();
            ov3.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
            ov3.a(jSONObject, X3.j.P, Float.valueOf(lw3.a().a));
            this.a.e.a("volumeChange", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media volume");
    }
}
