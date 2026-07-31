package com.my.target;

import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class t6 {
    private t6() {
    }

    public static t6 a() {
        return new t6();
    }

    public void a(JSONObject jSONObject, l6 l6Var) {
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            ArrayList c = l6Var.c();
            int size = c.size();
            int i = 0;
            while (i < size) {
                Object obj = c.get(i);
                i++;
                hb hbVar = (hb) obj;
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(hbVar.h());
                if (optJSONObject2 != null) {
                    a(optJSONObject2, hbVar);
                }
            }
        }
    }

    private void a(JSONObject jSONObject, hb hbVar) {
        hbVar.a(jSONObject.optInt("connectionTimeout", hbVar.e()));
        int optInt = jSONObject.optInt("maxBannersShow", hbVar.f());
        if (optInt == 0) {
            optInt = -1;
        }
        hbVar.b(optInt);
    }
}
