package com.my.target;

import android.text.TextUtils;
import com.my.target.common.models.ImageData;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class nd {
    private final sd a;
    private final y2 b;

    private nd(sd sdVar, y yVar, n nVar) {
        this.a = sdVar;
        this.b = y2.a(yVar, nVar);
    }

    public static nd a(sd sdVar, y yVar, n nVar) {
        return new nd(sdVar, yVar, nVar);
    }

    public void a(JSONObject jSONObject, md mdVar) {
        this.b.a(jSONObject, mdVar);
        mdVar.h(jSONObject.optBoolean("hasNotification", mdVar.n0()));
        mdVar.g(jSONObject.optBoolean("Banner", mdVar.m0()));
        mdVar.k(jSONObject.optBoolean("RequireCategoryHighlight", mdVar.q0()));
        mdVar.i(jSONObject.optBoolean("ItemHighlight", mdVar.o0()));
        mdVar.j(jSONObject.optBoolean("Main", mdVar.p0()));
        mdVar.l(jSONObject.optBoolean("RequireWifi", mdVar.r0()));
        mdVar.m(jSONObject.optBoolean("subitem", mdVar.s0()));
        mdVar.A(jSONObject.optString("bubble_id", mdVar.Y()));
        mdVar.B(jSONObject.optString("labelType", mdVar.h0()));
        mdVar.C(jSONObject.optString("status", mdVar.j0()));
        mdVar.h(jSONObject.optInt("mrgs_id"));
        mdVar.e(jSONObject.optInt("coins"));
        mdVar.f(ya.a(jSONObject, "coins_icon_bgcolor", mdVar.b0()));
        mdVar.g(ya.a(jSONObject, "coins_icon_textcolor", mdVar.c0()));
        String optString = jSONObject.optString("icon_hd");
        if (!TextUtils.isEmpty(optString)) {
            mdVar.a(ImageData.newImageData(optString));
        }
        String optString2 = jSONObject.optString("coins_icon_hd");
        if (!TextUtils.isEmpty(optString2)) {
            mdVar.d(ImageData.newImageData(optString2));
        }
        String optString3 = jSONObject.optString("cross_notif_icon_hd");
        if (!TextUtils.isEmpty(optString3)) {
            mdVar.e(ImageData.newImageData(optString3));
        }
        String d = this.a.d();
        if (!TextUtils.isEmpty(d)) {
            mdVar.c(ImageData.newImageData(d));
        }
        String e = this.a.e();
        if (!TextUtils.isEmpty(e)) {
            mdVar.f(ImageData.newImageData(e));
        }
        String h = this.a.h();
        if (!TextUtils.isEmpty(h)) {
            mdVar.h(ImageData.newImageData(h));
        }
        String j0 = mdVar.j0();
        if (j0 != null) {
            String a = this.a.a(j0);
            if (!TextUtils.isEmpty(a)) {
                mdVar.i(ImageData.newImageData(a));
            }
        }
        String g = this.a.g();
        if (!mdVar.o0() || TextUtils.isEmpty(g)) {
            return;
        }
        mdVar.g(ImageData.newImageData(g));
    }
}
