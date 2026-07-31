package com.my.target;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class cg extends ei {
    private cg(y yVar, n nVar) {
        super(yVar, nVar);
    }

    public static cg b(y yVar, n nVar) {
        return new cg(yVar, nVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        if (r1.equals("playheadViewabilityValue") == false) goto L14;
     */
    @Override // com.my.target.ei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rh a(JSONObject jSONObject, float f) {
        boolean z;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("url");
        char c = 1;
        if (TextUtils.isEmpty(optString)) {
            a("type", 3006, "statType is empty");
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(optString2)) {
            a("url", 3006, "URL is empty");
            z = true;
        }
        if (z) {
            return null;
        }
        boolean optBoolean = jSONObject.optBoolean("isImpression", false);
        optString.getClass();
        switch (optString.hashCode()) {
            case -1053159584:
                if (optString.equals("playheadTimerValue")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1669348544:
                break;
            case 1788134515:
                if (optString.equals("playheadReachedValue")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return a(jSONObject, optString2);
            case 1:
                return a(jSONObject, optString2, optBoolean);
            case 2:
                xe a = super.a(jSONObject, optString2, f, x0.e);
                if (a == null || a.h() < 0.0f) {
                    return null;
                }
                return a;
            default:
                return super.a(jSONObject, f);
        }
    }

    private rh a(JSONObject jSONObject, String str) {
        if (!str.contains("[CONTENTPLAYHEAD]")) {
            a("[CONTENTPLAYHEAD]", 3006, "value is empty");
            return null;
        }
        int optInt = jSONObject.optInt("startTimer", 0);
        int optInt2 = jSONObject.optInt("endTimer", 0);
        if (optInt < 0) {
            a("startTimer", 3006, "startTimer=" + optInt);
            return null;
        }
        if (optInt2 < 0) {
            a("endTimer", 3006, "endTimer=" + optInt2);
            return null;
        }
        if (optInt2 != 0 && optInt >= optInt2) {
            return null;
        }
        dg b = dg.b(str);
        b.b(jSONObject.optInt("rate", 1));
        b.c(optInt);
        b.a(optInt2);
        return b;
    }

    private rh a(JSONObject jSONObject, String str, boolean z) {
        int optInt = jSONObject.optInt("viewablePercent", -1);
        if (optInt >= 0 && optInt <= 100) {
            int optInt2 = jSONObject.optInt(IronSourceConstants.EVENTS_DURATION, -1);
            if (optInt2 < 0) {
                return null;
            }
            int optInt3 = jSONObject.optInt("startTimer", 0);
            int optInt4 = jSONObject.optInt("endTimer", 0);
            if (optInt3 < 0) {
                a("startTimer", 3006, "startTimer=" + optInt3);
                return null;
            }
            if (optInt4 < 0) {
                a("endTimer", 3006, "endTimer=" + optInt4);
                return null;
            }
            if (optInt4 != 0 && optInt3 >= optInt4) {
                return null;
            }
            eg a = eg.a(str, optInt2, optInt, jSONObject.optBoolean("mrc", true), z);
            a.b(optInt3);
            a.a(optInt4);
            return a;
        }
        a("viewablePercent", 3006, "viewablePercent=" + optInt);
        return null;
    }
}
