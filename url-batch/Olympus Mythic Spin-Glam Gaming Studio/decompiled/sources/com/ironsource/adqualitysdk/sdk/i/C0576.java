package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ҷ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0576 extends AbstractC1100 {
    static {
        StringFog.decrypt("lgB0DDNQK6CX\n", "5WUaaHYiWc8=\n");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4065(C0880 c0880, ArrayList arrayList) {
        boolean booleanValue;
        JSONObject jSONObject;
        String str = (String) AbstractC1100.m4401(arrayList, 0, String.class);
        String str2 = c0880.m4231() + StringFog.decrypt("3w==\n", "5Wi3s7A7Swo=\n") + Integer.toHexString(str.hashCode());
        Throwable th = (Throwable) AbstractC1100.m4401(arrayList, 1, Throwable.class);
        try {
            if (arrayList.size() > 2) {
                if (AbstractC1100.m4400(arrayList, 2, JSONObject.class)) {
                    JSONObject jSONObject2 = (JSONObject) AbstractC1100.m4401(arrayList, 2, JSONObject.class);
                    if (arrayList.size() > 3 && AbstractC1100.m4400(arrayList, 3, Boolean.class)) {
                        r1 = ((Boolean) AbstractC1100.m4401(arrayList, 3, Boolean.class)).booleanValue();
                    }
                    jSONObject = jSONObject2;
                    booleanValue = r1;
                } else {
                    booleanValue = AbstractC1100.m4400(arrayList, 2, Boolean.class) ? ((Boolean) AbstractC1100.m4401(arrayList, 2, Boolean.class)).booleanValue() : false;
                    jSONObject = null;
                }
                AbstractC0577.m4067(c0880.m4231(), str, str2, th, null, jSONObject, true, false, booleanValue);
            } else {
                AbstractC0577.m4067(c0880.m4231(), str, str2, th, null, null, true, false, false);
            }
        } catch (Throwable unused) {
        }
    }
}
