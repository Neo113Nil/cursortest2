package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɿ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public abstract class AbstractC0442 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public boolean f317 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f318;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f319;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f320;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f321;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f316 = StringFog.decrypt("qeFk0g==\n", "zI8S/V5ASzM=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f315 = StringFog.decrypt("9+fg\n", "lomEB3FmDUw=\n");

    public AbstractC0442(String str, String str2, String str3, String str4) {
        this.f321 = str;
        this.f320 = str2;
        this.f319 = str3;
        this.f318 = str4;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m4003() {
        JSONObject jSONObject;
        String decrypt = StringFog.decrypt("ARHM74739hhc\n", "c3ShgPqSkno=\n");
        C0600 c0600 = (C0600) AbstractC0590.m4087();
        synchronized (c0600) {
            jSONObject = c0600.f2998;
        }
        String optString = jSONObject.optString(c0600.f1035);
        if (!this.f317 || TextUtils.isEmpty(optString)) {
            return decrypt;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(decrypt);
        sb.append(f316);
        sb.append(optString);
        return AbstractC1293.m4543("UQ==\n", "flSajFoenTk=\n", sb);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public String mo4004() {
        return m4003() + this.f321 + StringFog.decrypt("9A==\n", "21CGoR4ZiB0=\n") + this.f320 + StringFog.decrypt("1w==\n", "+YSpR9ak6Pc=\n") + f315 + StringFog.decrypt("uw==\n", "lWWCvM6NJVU=\n") + this.f319 + StringFog.decrypt("Jg==\n", "CCwfgLuElYM=\n") + this.f318;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m4005(String str) {
        String m4003 = m4003();
        StringBuilder sb = new StringBuilder();
        sb.append(m4003);
        sb.append(this.f321);
        sb.append(StringFog.decrypt("Qg==\n", "bavZ1HrPE3I=\n"));
        String str2 = f315;
        sb.append(str2);
        StringBuilder m4006 = AbstractC0446.m4006("VA==\n", "e7X9oG/ZH0E=\n", sb, str);
        m4006.append(StringFog.decrypt("CA==\n", "JwBjvRpLgBU=\n"));
        m4006.append(this.f320);
        StringBuilder m40062 = AbstractC0446.m4006("0g==\n", "/JwvxNXkleQ=\n", m4006, str2);
        m40062.append(StringFog.decrypt("HQ==\n", "M8LuU85D6nY=\n"));
        m40062.append(this.f319);
        m40062.append(StringFog.decrypt("fQ==\n", "U0jB2/iA1XQ=\n"));
        m40062.append(this.f318);
        return m40062.toString();
    }
}
