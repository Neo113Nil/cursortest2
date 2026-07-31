package yads;

import android.util.Log;
import android.webkit.WebView;
import com.ironsource.X3;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class w3 {
    public final av3 a;

    public w3(av3 av3Var) {
        this.a = av3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        av3 av3Var = this.a;
        if (av3Var.g) {
            throw new IllegalStateException("AdSession is finished");
        }
        av3Var.b.getClass();
        av3 av3Var2 = this.a;
        if (!av3Var2.f || av3Var2.g) {
            try {
                av3Var2.b();
            } catch (Exception unused) {
            }
        }
        av3 av3Var3 = this.a;
        if (!av3Var3.f || av3Var3.g) {
            return;
        }
        if (av3Var3.i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
        i9 i9Var = av3Var3.e;
        kw3.a.a((WebView) i9Var.b.get(), "publishImpressionEvent", i9Var.a);
        av3Var3.i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(xc3 xc3Var) {
        gw3.a(this.a);
        this.a.b.getClass();
        av3 av3Var = this.a;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", xc3Var.a);
            if (xc3Var.a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, xc3Var.b);
            }
            jSONObject.put("autoPlay", true);
            jSONObject.put(X3.i.L, xc3Var.c);
        } catch (JSONException e) {
            Log.e("OMIDLIB", "VastProperties: JSON error", e);
        }
        if (!av3Var.j) {
            i9 i9Var = av3Var.e;
            kw3.a.a((WebView) i9Var.b.get(), "publishLoadedEvent", jSONObject, i9Var.a);
            av3Var.j = true;
            return;
        }
        throw new IllegalStateException("Loaded event can only be sent once");
    }
}
