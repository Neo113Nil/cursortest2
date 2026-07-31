package com.my.target;

import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.LoudnessMetadata;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public abstract class z2 {
    protected final y a;
    protected final n b;
    protected final y2 c;
    protected boolean d = true;

    z2(y yVar, n nVar, int i) {
        this.a = yVar;
        this.b = nVar;
        y2 a = y2.a(yVar, nVar);
        this.c = a;
        a.a(i);
    }

    protected static LoudnessMetadata a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("loudnessMetadata");
        if (optJSONObject != null) {
            float optDouble = (float) optJSONObject.optDouble("integratedLufs");
            float optDouble2 = (float) optJSONObject.optDouble("truePeak");
            if (!Float.isNaN(optDouble) && !Float.isNaN(optDouble2)) {
                return LoudnessMetadata.a(optDouble, optDouble2);
            }
        }
        return null;
    }

    private void a(String str, int i, String str2) {
    }

    private ImageData e(JSONObject jSONObject, z0 z0Var) {
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            mi.a("CommonVideoParser: PostView background image hasn't url");
            a("url", 3006, "imageUrl is empty or null");
            return null;
        }
        int optInt = jSONObject.optInt("width", -1);
        if (optInt < 0) {
            mi.a("CommonVideoParser: PostView background image hasn't width");
            a("width", 3006, "width = " + optInt + " cannot be less than zero");
            return null;
        }
        int optInt2 = jSONObject.optInt("height", -1);
        if (optInt2 >= 0) {
            return ImageData.newImageData(optString, optInt, optInt2);
        }
        mi.a("CommonVideoParser: PostView background image hasn't height");
        a("height", 3006, "height = " + optInt2 + " cannot be less than zero");
        return null;
    }

    protected rf b(JSONObject jSONObject) {
        return sf.a(jSONObject);
    }

    public void c(JSONObject jSONObject, z0 z0Var) {
        c3 a;
        JSONArray optJSONArray = jSONObject.optJSONArray("companionAds");
        if (optJSONArray == null) {
            return;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null && (a = a(optJSONObject, z0Var.x())) != null) {
                z0Var.a(a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected l3 d(JSONObject jSONObject, z0 z0Var) {
        ImageData imageData;
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            mi.a("CommonVideoParser: CTA button hasn't button link");
            a("url", 3006, "url is empty or null");
            return null;
        }
        String optString2 = jSONObject.optString("buttonText");
        if (TextUtils.isEmpty(optString2)) {
            mi.a("CommonVideoParser: CTA button hasn't button link text");
            a("buttonText", 3006, "buttonText is empty or null");
            return null;
        }
        String optString3 = jSONObject.optString("additionalText");
        if (TextUtils.isEmpty(optString3)) {
            mi.a("CommonVideoParser: CTA button hasn't text");
            a("additionalText", 3007, "additionalText is empty or null");
        }
        int a = ya.a(jSONObject, "buttonColor", Integer.MAX_VALUE);
        if (a == Integer.MAX_VALUE) {
            mi.a("CommonVideoParser: CTA button hasn't button color");
            a("buttonColor", 3007, "buttonColor = " + a + " has incorrect value");
        }
        int a2 = ya.a(jSONObject, "buttonTextColor", Integer.MAX_VALUE);
        if (a2 == Integer.MAX_VALUE) {
            mi.a("CommonVideoParser: CTA button hasn't button text color");
            a("buttonTextColor", 3007, "buttonTextColor = " + a2 + " has incorrect value");
        }
        if (jSONObject.has("icon")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("icon");
            if (optJSONObject != null) {
                imageData = e(optJSONObject, z0Var);
                return l3.a(optString3, optString, optString2, a != Integer.MAX_VALUE ? null : Integer.valueOf(a), a2 != Integer.MAX_VALUE ? null : Integer.valueOf(a2), imageData);
            }
            a("icon", 3007, "iconJson is null");
        }
        imageData = null;
        return l3.a(optString3, optString, optString2, a != Integer.MAX_VALUE ? null : Integer.valueOf(a), a2 != Integer.MAX_VALUE ? null : Integer.valueOf(a2), imageData);
    }

    protected ue f(JSONObject jSONObject, z0 z0Var) {
        JSONObject optJSONObject;
        String optString = jSONObject.optString("text");
        if (TextUtils.isEmpty(optString)) {
            mi.a("CommonVideoParser: PostView hasn't text");
            a("text", 3007, "PostView text is empty or null");
        }
        ImageData e = (!jSONObject.has("backgroundImage") || (optJSONObject = jSONObject.optJSONObject("backgroundImage")) == null) ? null : e(optJSONObject, z0Var);
        if (e == null) {
            mi.a("CommonVideoParser: PostView hasn't backgroundImage");
            a("backgroundImage", 3007, "backgroundImage is empty or null");
        }
        if (TextUtils.isEmpty(optString) && e == null) {
            mi.a("CommonVideoParser: PostView Text or Background Image should exist but both are empty");
            return null;
        }
        boolean optBoolean = jSONObject.optBoolean("pauseOnHide", false);
        int a = ya.a(jSONObject, "overlay", Integer.MAX_VALUE);
        if (a == Integer.MAX_VALUE) {
            mi.a("CommonVideoParser: PostView hasn't overlay");
        }
        double optDouble = jSONObject.optDouble(IronSourceConstants.EVENTS_DURATION, 3.0d);
        return ue.a(optString, optDouble >= 0.001d ? optDouble : 3.0d, optBoolean, a == Integer.MAX_VALUE ? null : Integer.valueOf(a), e);
    }

    rg g(JSONObject jSONObject, z0 z0Var) {
        String optString = jSONObject.optString("src");
        if (TextUtils.isEmpty(optString)) {
            mi.a("CommonVideoParser: encoded shoppable source is empty or null");
            a("src", 3006, "Encoded shoppable source is empty or null");
            return null;
        }
        try {
            String str = new String(Base64.decode(optString, 0));
            int i = 2;
            int optInt = jSONObject.optInt("interactionTimeout", 2);
            if (!jSONObject.has("interactionTimeout")) {
                a("interactionTimeout", 3007, "shoppableBannerJson hasn't interactionTimeout");
            } else if (optInt < 0) {
                a("interactionTimeout", 3007, "interactionTimeout = 2 cannot be less than zero");
            } else {
                i = optInt;
            }
            rg a = rg.a(str, (long) (Math.min(i, z0Var.t()) * 1000.0f));
            this.c.a(jSONObject, a);
            return a;
        } catch (Throwable th) {
            mi.a("CommonVideoParser: shoppable source parsing is ended with exception: " + th);
            a("src", 3007, "Shoppable source parsing is ended with exception: " + th);
            return null;
        }
    }

    protected void b(JSONObject jSONObject, z0 z0Var) {
        float A = this.a.A();
        if (A < 0.0f && jSONObject.has("point")) {
            A = (float) jSONObject.optDouble("point");
            if (A < 0.0f) {
                a("point", 3007, "point = " + A + " cannot be less than zero");
            }
        }
        float B = this.a.B();
        if (B < 0.0f && jSONObject.has("pointP")) {
            B = (float) jSONObject.optDouble("pointP");
            if (B < 0.0f) {
                a("pointP", 3007, "pointP = " + B + " cannot be less than zero");
            }
        }
        if (A < 0.0f && B < 0.0f) {
            A = -1.0f;
            B = -1.0f;
        }
        z0Var.e(A);
        z0Var.f(B);
    }

    public u0 a(JSONObject jSONObject, u uVar, String str) {
        return this.c.b(jSONObject, uVar, str);
    }

    public t a() {
        return this.b.a();
    }

    public boolean a(JSONObject jSONObject, z0 z0Var, x0 x0Var) {
        this.c.a(jSONObject, z0Var, x0Var.d());
        this.d = z0Var.U();
        if (!"statistics".equals(z0Var.M())) {
            return false;
        }
        b(jSONObject, z0Var);
        return true;
    }

    protected c3 a(JSONObject jSONObject, String str) {
        c3 h0 = c3.h0();
        this.c.a(jSONObject, h0);
        if (h0.R() == 0) {
            a("width", 3006, "companionBanner width = 0");
            return null;
        }
        if (h0.v() == 0) {
            a("height", 3006, "companionBanner height = 0");
            return null;
        }
        h0.f(jSONObject.optInt(VastAttributes.ASSET_WIDTH));
        h0.e(jSONObject.optInt(VastAttributes.ASSET_HEIGHT));
        h0.h(jSONObject.optInt(VastAttributes.EXPANDED_WIDTH));
        h0.g(jSONObject.optInt(VastAttributes.EXPANDED_HEIGHT));
        h0.F(jSONObject.optString("staticResource"));
        h0.D(jSONObject.optString("iframeResource"));
        h0.C(jSONObject.optString("htmlResource"));
        h0.B(jSONObject.optString(VastAttributes.API_FRAMEWORK));
        h0.A(jSONObject.optString(VastAttributes.AD_SLOT_ID));
        String optString = jSONObject.optString("required");
        if (!TextUtils.isEmpty(optString)) {
            if (!"all".equals(optString) && !"any".equals(optString) && !"none".equals(optString)) {
                a("required", 3007, "required value is incorrect");
                return h0;
            }
            h0.E(optString);
        }
        return h0;
    }

    protected void a(JSONObject jSONObject, z0 z0Var) {
        boolean optBoolean;
        boolean optBoolean2;
        boolean optBoolean3;
        b(jSONObject, z0Var);
        Boolean d = this.a.d();
        if (d != null) {
            optBoolean = d.booleanValue();
        } else {
            optBoolean = jSONObject.optBoolean("allowClose", z0Var.o0());
        }
        z0Var.f(optBoolean);
        Boolean f = this.a.f();
        if (f != null) {
            optBoolean2 = f.booleanValue();
        } else {
            optBoolean2 = jSONObject.optBoolean("hasPause", z0Var.p0());
        }
        z0Var.g(optBoolean2);
        Boolean g = this.a.g();
        if (g != null) {
            optBoolean3 = g.booleanValue();
        } else {
            optBoolean3 = jSONObject.optBoolean("allowReplay", z0Var.q0());
        }
        z0Var.h(optBoolean3);
        float e = this.a.e();
        if (e < 0.0f) {
            e = (float) jSONObject.optDouble("allowCloseDelay", z0Var.Y());
        }
        z0Var.c(e);
    }
}
