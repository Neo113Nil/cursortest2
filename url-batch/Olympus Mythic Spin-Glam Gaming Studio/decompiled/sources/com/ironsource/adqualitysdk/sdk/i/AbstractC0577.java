package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Һ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public abstract class AbstractC0577 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static WeakReference f967;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4068(String str, String str2, Throwable th, boolean z) {
        try {
            m4069(str, str2, th, z, false, false);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4069(String str, String str2, Throwable th, boolean z, boolean z2, boolean z3) {
        try {
            if (z) {
                AbstractC0580.m4082(str, str2, z3);
                if (th != null) {
                    AbstractC0580.m4080(str, str, StringFog.decrypt("QZduhCC817k=\n", "BfIa5UnQpIM=\n"), th, null, z3);
                }
            } else {
                AbstractC0580.m4080(str, str, str2, th, null, z3);
            }
            m4067(str, str2, StringFog.decrypt("w73L9v6ADGb89Q==\n", "l8+qlZvibQU=\n") + str, th, null, null, false, z2, z3);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4067(String str, String str2, String str3, Throwable th, AbstractC0441 abstractC0441, JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        String str4;
        String stackTraceString;
        if (z) {
            try {
                String str5 = str3 + StringFog.decrypt("Nw==\n", "Deqs+qok5/U=\n") + str;
                AbstractC0580.m4080(str, str, str2 + StringFog.decrypt("44F0Nje2NQ==\n", "w6kXWVPTFW8=\n") + str5 + StringFog.decrypt("Jw==\n", "DhoSuLuDsgE=\n"), th, abstractC0441, z3);
                str4 = str5;
            } catch (Throwable unused) {
                return;
            }
        } else {
            str4 = str3;
        }
        C0546 c0546 = (C0546) f967.get();
        if (c0546 != null) {
            if (abstractC0441 != null) {
                stackTraceString = abstractC0441.toString();
            } else if (th instanceof AbstractC0441) {
                stackTraceString = th.toString();
            } else {
                stackTraceString = Log.getStackTraceString(th);
            }
            c0546.m4046(str, str2, str4, stackTraceString, jSONObject, z2);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4066(String str, String str2, String str3, String str4) {
        try {
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            String str5 = str3 + StringFog.decrypt("kg==\n", "qPp4CwVFEfw=\n") + str;
            AbstractC0580.m4082(str, StringFog.decrypt("KX/bc39MaqUYZYk=\n", "bA2pHA1sHcw=\n") + str5 + StringFog.decrypt("Bnayyw/cMfJSdrPRRA==\n", "Jh/cv2q7Q5M=\n"), false);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str4 != null ? "\n".concat(str4) : "");
            AbstractC0580.m4082(str, sb.toString(), false);
            C0546 c0546 = (C0546) f967.get();
            if (c0546 != null) {
                c0546.m4046(str, str2, str5, str4, null, false);
            }
        } catch (Throwable unused) {
        }
    }
}
