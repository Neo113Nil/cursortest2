package com.my.target;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class ki {
    public static ji a(JSONObject jSONObject) {
        int i;
        int i2;
        int i3 = -1;
        try {
            i = jSONObject.getInt("startValue");
        } catch (JSONException e) {
            mi.a("TimersParser: invalid startValue field:" + e.getLocalizedMessage());
            i = -1;
        }
        try {
            i3 = jSONObject.getInt("startPvalue");
        } catch (JSONException e2) {
            mi.a("TimersParser: invalid startPvalue field:" + e2.getLocalizedMessage());
        }
        try {
            i2 = jSONObject.getInt("extraDuration");
        } catch (JSONException e3) {
            mi.a("TimersParser: invalid extraDuration field:" + e3.getLocalizedMessage());
            i2 = 0;
        }
        return ji.a(i, i3, i2);
    }
}
