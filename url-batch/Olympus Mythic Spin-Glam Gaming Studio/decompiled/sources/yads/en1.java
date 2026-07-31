package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class en1 implements ai {
    public final em1 a;
    public final ji3 b;
    public final h31 c;
    public final w31 d;

    public en1(Context context, mt1 mt1Var, dm dmVar) {
        em1 em1Var = new em1(dmVar.a);
        ji3 ji3Var = new ji3(context, mt1Var, dmVar);
        h31 h31Var = new h31();
        w31 w31Var = new w31();
        this.a = em1Var;
        this.b = ji3Var;
        this.c = h31Var;
        this.d = w31Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    @Override // yads.ai
    public final Object a(JSONObject jSONObject) {
        ij1 ij1Var;
        ?? r7;
        de3 de3Var;
        ic3 ic3Var;
        kj3 kj3Var;
        Object m8023constructorimpl;
        al1 zk1Var;
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            boolean z = ob1.a;
            throw new o12("Native Ad json has not required attributes");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        em1 em1Var = this.a;
        if (!jSONObject2.has("media") || jSONObject2.isNull("media")) {
            ij1Var = null;
        } else {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("media");
            em1Var.getClass();
            float f = (float) jSONObject3.getDouble("aspectRatio");
            if (f == 0.0f) {
                f = 1.7777778f;
            }
            try {
                zk1Var = new yk1(em1Var.a.a("html", jSONObject3));
            } catch (Exception e) {
                String optString = jSONObject3.optString("htmlUrl");
                if (optString.length() == 0) {
                    optString = null;
                }
                if (optString == null) {
                    throw e;
                }
                zk1Var = new zk1(optString);
            }
            ij1Var = new ij1(zk1Var, f, false, 4);
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("images");
        if (optJSONArray != null) {
            w31 w31Var = this.d;
            w31Var.getClass();
            r7 = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                r7.add(w31Var.a.a(optJSONArray.getJSONObject(i)));
            }
        } else {
            r7 = 0;
        }
        q31 a = (!jSONObject2.has("image") || jSONObject2.isNull("image")) ? null : this.c.a(jSONObject2.getJSONObject("image"));
        if ((r7 == 0 || r7.isEmpty()) && a != null) {
            r7 = CollectionsKt.mutableListOf(a);
        }
        ji3 ji3Var = this.b;
        if (!jSONObject2.has("video") || jSONObject2.isNull("video")) {
            de3Var = null;
        } else {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("video");
            try {
                ic3Var = ji3Var.d.a(ji3Var.b.a("vast", jSONObject4), ji3Var.a);
            } catch (Exception unused) {
                ic3Var = null;
            }
            if (ic3Var == null || ic3Var.b.isEmpty()) {
                throw new o12("Invalid VAST in response");
            }
            JSONObject optJSONObject = jSONObject4.optJSONObject("settings");
            if (optJSONObject != null) {
                ji3Var.e.getClass();
                boolean optBoolean = optJSONObject.optBoolean("volumeControlVisible", true);
                boolean optBoolean2 = optJSONObject.optBoolean("isProgressBarHidden", false);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(Double.valueOf(optJSONObject.getDouble("initialVolume")));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                    m8023constructorimpl = null;
                }
                kj3Var = new kj3(optBoolean, optBoolean2, (Double) m8023constructorimpl);
            } else {
                kj3Var = null;
            }
            ArrayList a2 = ji3Var.c.a(ic3Var.b);
            if (a2.isEmpty()) {
                throw new o12("Invalid VAST in response");
            }
            JSONObject optJSONObject2 = jSONObject4.optJSONObject("preview");
            de3Var = new de3(a2, kj3Var, optJSONObject2 != null ? ji3Var.f.a(optJSONObject2) : null);
        }
        if (ij1Var != null || ((r7 != 0 && !r7.isEmpty()) || de3Var != null)) {
            return new dn1(ij1Var, de3Var, r7 != 0 ? CollectionsKt.toMutableList((Collection) r7) : null);
        }
        boolean z2 = ob1.a;
        throw new o12("Native Ad json has not required attributes");
    }
}
