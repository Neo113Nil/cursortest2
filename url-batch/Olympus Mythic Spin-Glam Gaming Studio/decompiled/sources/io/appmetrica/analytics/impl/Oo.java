package io.appmetrica.analytics.impl;

import android.util.Base64;
import com.adjust.sdk.Constants;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class Oo {
    public final Qo a;

    public Oo(C5698tf c5698tf, C5823ya c5823ya) {
        this.a = new Qo(c5698tf, c5823ya, new Ro() { // from class: io.appmetrica.analytics.impl.Oo$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.Ro
            public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
                return Oo.a(jSONObject, jSONObject2);
            }
        });
    }

    public final synchronized void a(C5751vg c5751vg) {
        String str;
        if (c5751vg != null) {
            try {
                str = new String(Base64.encode(c5751vg.a(), 0), Charsets.UTF_8);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            str = null;
        }
        JSONObject a = this.a.a();
        if (!Intrinsics.areEqual(JsonUtils.optStringOrNull(a, Constants.REFERRER), str)) {
            this.a.a(a.put(Constants.REFERRER, str));
        }
        Qo qo = this.a;
        Qo.a(qo.a);
        Qo.a(qo.b);
    }

    public final synchronized void b(String str) {
        JSONObject a = this.a.a();
        if (!Intrinsics.areEqual(JsonUtils.optStringOrNull(a, "device_id_hash"), str)) {
            this.a.a(a.put("device_id_hash", str));
        }
        Qo qo = this.a;
        Qo.a(qo.a);
        Qo.a(qo.b);
    }

    public final synchronized C5751vg b() {
        byte[] decode;
        C5751vg c5751vg;
        String optStringOrNull = JsonUtils.optStringOrNull(this.a.a(), Constants.REFERRER);
        if (optStringOrNull != null) {
            try {
                decode = Base64.decode(optStringOrNull.getBytes(Charsets.UTF_8), 0);
            } catch (Throwable unused) {
            }
            c5751vg = (decode == null || decode.length == 0) ? null : new C5751vg(decode);
        }
        return c5751vg;
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_id", JsonUtils.optStringOrNullable(jSONObject2, "device_id", JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put(Constants.REFERRER, JsonUtils.optStringOrNullable(jSONObject2, Constants.REFERRER, JsonUtils.optStringOrNull(jSONObject, Constants.REFERRER)));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", Cb.a(jSONObject2, "last_migration_api_level", Cb.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final synchronized void a(String str) {
        JSONObject a = this.a.a();
        if (!Intrinsics.areEqual(JsonUtils.optStringOrNull(a, "device_id"), str)) {
            this.a.a(a.put("device_id", str));
        }
        Qo qo = this.a;
        Qo.a(qo.a);
        Qo.a(qo.b);
    }

    public final synchronized String a() {
        return JsonUtils.optStringOrNull(this.a.a(), "device_id_hash");
    }
}
