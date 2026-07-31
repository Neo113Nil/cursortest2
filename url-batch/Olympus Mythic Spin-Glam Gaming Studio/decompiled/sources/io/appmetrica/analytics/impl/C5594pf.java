package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.pf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5594pf extends Sd {
    public static final C5672sf d = new C5672sf("UUID_RESULT", null);
    public static final C5672sf e = new C5672sf("DEVICE_ID_RESULT", null);
    public static final C5672sf f = new C5672sf("DEVICE_ID_HASH_RESULT", null);
    public static final C5672sf g = new C5672sf("AD_URL_GET_RESULT", null);
    public static final C5672sf h = new C5672sf("AD_URL_REPORT_RESULT", null);
    public static final C5672sf i = new C5672sf("CUSTOM_HOSTS", null);
    public static final C5672sf j = new C5672sf("SERVER_TIME_OFFSET", null);
    public static final C5672sf k = new C5672sf("RESPONSE_CLIDS_RESULT", null);
    public static final C5672sf l = new C5672sf("CUSTOM_SDK_HOSTS", null);
    public static final C5672sf m = new C5672sf("CLIENT_CLIDS", null);
    public static final C5672sf n = new C5672sf("DEFERRED_DEEP_LINK_WAS_CHECKED", null);
    public static final C5672sf o = new C5672sf("API_LEVEL", null);
    public static final C5672sf p = new C5672sf("NEXT_STARTUP_TIME", null);
    public static final C5672sf q = new C5672sf(IronSourceConstants.TYPE_GAID, null);
    public static final C5672sf r = new C5672sf("HOAID", null);
    public static final C5672sf s = new C5672sf("YANDEX_ADV_ID", null);
    public static final C5672sf t = new C5672sf("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);
    public static final C5672sf u = new C5672sf("SCREEN_INFO", null);
    public static final C5672sf v = new C5672sf("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);
    public static final C5672sf w = new C5672sf("FEATURES", null);
    public static final C5672sf x = new C5672sf("APPMETRICA_CLIENT_CONFIG", null);

    public C5594pf(InterfaceC5357gb interfaceC5357gb) {
        super(interfaceC5357gb);
    }

    public final boolean a(boolean z) {
        return this.a.getBoolean(t.b, z);
    }

    public final long b(long j2) {
        return this.a.getLong(j.a, j2);
    }

    @NonNull
    public final C5594pf c(@Nullable IdentifiersResult identifiersResult) {
        return a(l.b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult d() {
        return h(g.b);
    }

    @NonNull
    public final C5594pf f(@Nullable IdentifiersResult identifiersResult) {
        return a(q.b, identifiersResult);
    }

    public final List<String> g() {
        String string = this.a.getString(i.b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return Cb.b(string);
    }

    @NonNull
    public final IdentifiersResult h() {
        return h(l.b);
    }

    @NonNull
    public final IdentifiersResult i() {
        return h(f.b);
    }

    @NonNull
    public final IdentifiersResult j() {
        return h(e.b);
    }

    @NonNull
    public final C5616qa k() {
        String string = this.a.getString(w.b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new C5616qa(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C5616qa(null, IdentifierStatus.UNKNOWN, null);
    }

    @NonNull
    public final IdentifiersResult l() {
        return h(q.b);
    }

    @NonNull
    public final IdentifiersResult m() {
        return h(r.b);
    }

    @NonNull
    public final long n() {
        return this.a.getLong(p.b, 0L);
    }

    @NonNull
    public final IdentifiersResult o() {
        return h(k.b);
    }

    @Nullable
    public final ScreenInfo p() {
        return Cb.e(this.a.getString(u.b, null));
    }

    @NonNull
    public final IdentifiersResult q() {
        return h(d.b);
    }

    @NonNull
    public final IdentifiersResult r() {
        return h(s.b);
    }

    public final boolean s() {
        return this.a.getBoolean(n.b, false);
    }

    public final boolean t() {
        return this.a.getBoolean(v.b, false);
    }

    public final C5594pf u() {
        return (C5594pf) d(n.b, true);
    }

    public final void v() {
        d(v.b, true);
    }

    @NonNull
    public final IdentifiersResult e() {
        return h(h.b);
    }

    public final long a(long j2) {
        return this.a.getLong(o.b, j2);
    }

    @NonNull
    public final C5594pf b(@Nullable IdentifiersResult identifiersResult) {
        return a(h.b, identifiersResult);
    }

    public final C5594pf c(long j2) {
        return (C5594pf) d(o.b, j2);
    }

    @NonNull
    public final C5594pf d(@Nullable IdentifiersResult identifiersResult) {
        return a(f.b, identifiersResult);
    }

    @Nullable
    public final AppMetricaConfig.Builder f() {
        String string = this.a.getString(x.b, null);
        if (string == null) {
            return null;
        }
        return new X3().a(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentifiersResult h(String str) {
        IdentifiersResult identifiersResult;
        String string;
        try {
            string = this.a.getString(str, null);
        } catch (Throwable unused) {
        }
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            identifiersResult = new IdentifiersResult(JsonUtils.optStringOrNull(jSONObject, "ID"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            return identifiersResult != null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "no identifier in preferences") : identifiersResult;
        }
        identifiersResult = null;
        if (identifiersResult != null) {
        }
    }

    @NonNull
    public final C5594pf i(@Nullable IdentifiersResult identifiersResult) {
        return a(d.b, identifiersResult);
    }

    @NonNull
    public final C5594pf j(@Nullable IdentifiersResult identifiersResult) {
        return a(s.b, identifiersResult);
    }

    @NonNull
    public final C5594pf e(@Nullable IdentifiersResult identifiersResult) {
        return a(e.b, identifiersResult);
    }

    @NonNull
    public final C5594pf g(@Nullable IdentifiersResult identifiersResult) {
        return a(r.b, identifiersResult);
    }

    @NonNull
    public final C5594pf a(@Nullable IdentifiersResult identifiersResult) {
        return a(g.b, identifiersResult);
    }

    public final C5594pf b(boolean z) {
        return (C5594pf) d(t.b, z);
    }

    @NonNull
    public final C5594pf d(long j2) {
        return (C5594pf) d(p.b, j2);
    }

    @Nullable
    public final String i(@Nullable String str) {
        return this.a.getString(m.b, str);
    }

    public final C5594pf j(@Nullable String str) {
        return (C5594pf) d(m.b, str);
    }

    public final C5594pf e(long j2) {
        return (C5594pf) d(j.b, j2);
    }

    @Override // io.appmetrica.analytics.impl.Sd
    @NonNull
    public final String g(@NonNull String str) {
        return new C5672sf(str, null).b;
    }

    public final C5594pf a(List<String> list) {
        return (C5594pf) d(i.b, Do.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    @NonNull
    public final C5594pf h(@Nullable IdentifiersResult identifiersResult) {
        return a(k.b, identifiersResult);
    }

    @NonNull
    public final C5594pf a(@NonNull C5616qa c5616qa) {
        String str = w.b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c5616qa.a).put("STATUS", c5616qa.b.getValue()).putOpt("ERROR_EXPLANATION", c5616qa.c);
        } catch (Throwable unused) {
        }
        return (C5594pf) d(str, jSONObject.toString());
    }

    @Override // io.appmetrica.analytics.impl.Sd, io.appmetrica.analytics.impl.AbstractC5646rf
    @NonNull
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C5594pf e(@NonNull String str) {
        return (C5594pf) f(new C5672sf(str, null).b);
    }

    public final void a(@Nullable ScreenInfo screenInfo) {
        d(u.b, Cb.a(screenInfo));
    }

    public final void a(@NonNull AppMetricaConfig appMetricaConfig) {
        d(x.b, appMetricaConfig.toJson());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C5594pf a(String str, IdentifiersResult identifiersResult) {
        String jSONObject;
        if (identifiersResult != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ID", identifiersResult.id).put("STATUS", identifiersResult.status.getValue()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
                } catch (Throwable unused) {
                }
                jSONObject = jSONObject2.toString();
            } catch (Throwable unused2) {
            }
            if (jSONObject != null) {
                d(str, jSONObject);
            }
            return this;
        }
        jSONObject = null;
        if (jSONObject != null) {
        }
        return this;
    }
}
