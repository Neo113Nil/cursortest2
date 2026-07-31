package com.mbridge.msdk.mbsignalcommon.Report;

import android.content.Context;
import android.util.Base64;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: H5ReportManager.java */
/* loaded from: classes4.dex */
public class a {
    private static final String c = "a";
    int a = 0;
    int b = 1;

    /* compiled from: H5ReportManager.java */
    /* renamed from: com.mbridge.msdk.mbsignalcommon.Report.a$a, reason: collision with other inner class name */
    private static final class C1440a {
        private static a a = new a();
    }

    public static a a() {
        return C1440a.a;
    }

    public void a(Object obj, String str, JSONArray jSONArray, int i) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        JSONObject optJSONObject5;
        JSONObject optJSONObject6;
        JSONObject optJSONObject7;
        JSONObject optJSONObject8;
        JSONObject optJSONObject9;
        JSONObject optJSONObject10;
        JSONObject optJSONObject11;
        int i2;
        try {
            if (jSONArray == null) {
                a(this.b, "called reporter failed, params empty", obj);
                return;
            }
            int length = jSONArray.length();
            if (length == 0) {
                a(this.b, "called reporter failed, params empty", obj);
                return;
            }
            int i3 = 0;
            if ("reportMessageR".equalsIgnoreCase(str)) {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    i2 = length - 1;
                    if (i3 >= i2) {
                        break;
                    }
                    JSONObject optJSONObject12 = jSONArray.optJSONObject(i3);
                    if (optJSONObject12 != null) {
                        stringBuffer.append(optJSONObject12.optString("key"));
                        stringBuffer.append("=");
                        stringBuffer.append(optJSONObject12.opt("value"));
                        stringBuffer.append(X3.j.c);
                    }
                    i3++;
                }
                JSONObject optJSONObject13 = jSONArray.optJSONObject(i2);
                if (optJSONObject13 != null) {
                    stringBuffer.append(optJSONObject13.optString("key"));
                    stringBuffer.append("=");
                    stringBuffer.append(optJSONObject13.opt("value"));
                }
                a(stringBuffer.toString());
            } else if ("reportMessageD".equalsIgnoreCase(str)) {
                String str2 = "";
                String string = (length <= 0 || (optJSONObject11 = jSONArray.optJSONObject(0)) == null) ? "" : optJSONObject11.getString("value");
                int i4 = (length <= 1 || (optJSONObject10 = jSONArray.optJSONObject(1)) == null) ? -1 : optJSONObject10.getInt("value");
                int i5 = (length <= 2 || (optJSONObject9 = jSONArray.optJSONObject(2)) == null) ? -1 : optJSONObject9.getInt("value");
                int i6 = (length <= 3 || (optJSONObject8 = jSONArray.optJSONObject(3)) == null) ? -1 : optJSONObject8.getInt("value");
                int i7 = (length <= 4 || (optJSONObject7 = jSONArray.optJSONObject(4)) == null) ? -1 : optJSONObject7.getInt("value");
                String string2 = (length <= 5 || (optJSONObject6 = jSONArray.optJSONObject(5)) == null) ? "" : optJSONObject6.getString("value");
                String string3 = (length <= 6 || (optJSONObject5 = jSONArray.optJSONObject(6)) == null) ? "" : optJSONObject5.getString("value");
                int i8 = (length <= 7 || (optJSONObject4 = jSONArray.optJSONObject(7)) == null) ? -1 : optJSONObject4.getInt("value");
                String string4 = (length <= 8 || (optJSONObject3 = jSONArray.optJSONObject(8)) == null) ? "" : optJSONObject3.getString("value");
                int i9 = (length <= 9 || (optJSONObject2 = jSONArray.optJSONObject(9)) == null) ? -1 : optJSONObject2.getInt("value");
                if (length > 10 && (optJSONObject = jSONArray.optJSONObject(10)) != null) {
                    str2 = optJSONObject.getString("value");
                }
                a(string, i4, i5, i6, i7, string2, string3, i8, string4, i9, str2);
            }
            a(this.a, "called reporter success", obj);
        } catch (Throwable th) {
            q0.a(c, th.getMessage());
            a(this.b, "exception: " + th.getMessage(), obj);
        }
    }

    public void a(String str) {
        d.b().e(str);
    }

    public void a(String str, int i, int i2, int i3, int i4, String str2, String str3, int i5, String str4, int i6, String str5) {
        try {
            Context d = c.n().d();
            if (d != null) {
                n.a(g.a(d)).a(new com.mbridge.msdk.foundation.entity.n(str, i, i2, i3, i4, str2, str3, i5, str4, i6, str5));
            }
        } catch (Throwable th) {
            q0.a(c, th.getMessage());
        }
    }

    public void a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("message", str);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            q0.a(c, e.getMessage());
        } catch (Throwable th) {
            q0.a(c, th.getMessage());
        }
    }
}
