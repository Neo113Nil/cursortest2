package com.my.target;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class ug {
    public tg a(String str) {
        try {
            String string = new JSONObject(str).getString("id");
            if (!TextUtils.isEmpty(string)) {
                return new tg(string);
            }
            mi.a("ShoppablePostMessageParamsParser: can't parse shoppablePostMessageParams – shoppableAdsDataId is empty");
            return null;
        } catch (Throwable th) {
            mi.a("ShoppablePostMessageParamsParser: can't parse shoppablePostMessageParams – " + th.getMessage());
            return null;
        }
    }
}
