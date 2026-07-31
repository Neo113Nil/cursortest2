package com.ogury.ad.internal;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class e2 {
    public final q0 a;
    public final r0 b;
    public final og c;

    public e2(Context context) {
        q0 androidDevice = new q0(context);
        r0 app = new r0(context);
        og permissionsHandler = new og(context, hb.c);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(androidDevice, "androidDevice");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(permissionsHandler, "permissionsHandler");
        this.a = androidDevice;
        this.b = app;
        this.c = permissionsHandler;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        og ogVar = this.c;
        ogVar.getClass();
        jSONObject.put("connectivity", (String) ogVar.a(g2.n, new wf(ogVar)));
        qh qhVar = this.a.b;
        qhVar.getClass();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(qhVar.a);
        String format = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        jSONObject.put(POBConstants.KEY_AT, format);
        jSONObject.put("build", 404010);
        jSONObject.put("version", "5.2.2");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.b.b.a());
        jSONObject.put("apps_publishers", jSONArray);
        return jSONObject;
    }
}
