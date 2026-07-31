package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ҭ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public class C0572 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f958 = StringFog.decrypt("651u5MyYI1vTq1rg2JE5W+2cUfTflT5A2A==\n", "qvk/ka30Si8=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public final long f959;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0783 f960;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Context f961;

    public C0572(Context context, C0783 c0783, long j) {
        this.f961 = context;
        this.f960 = c0783;
        this.f959 = j;
        new C1106(context);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public JSONObject mo4064(JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        if (jSONObject == null) {
            jSONObject = IronSourceNetworkBridge.jsonObjectInit();
        }
        JSONObject m4291 = AbstractC1006.m4291(jSONObject, false);
        if (!TextUtils.isEmpty(this.f960.f1838)) {
            m4291.put(StringFog.decrypt("Xhqz+GY+\n", "P2rDswNHO5k=\n"), this.f960.f1838);
        } else if (!TextUtils.isEmpty(this.f960.f1837)) {
            m4291.put(StringFog.decrypt("O4PU\n", "XMqwu7mc9dI=\n"), this.f960.f1837);
        }
        String str3 = this.f960.f1834;
        if (!TextUtils.isEmpty(str3)) {
            m4291.put(StringFog.decrypt("dwbrcA==\n", "HnWZE1Inp20=\n"), str3);
        }
        if (z2) {
            if (this.f959 > 0) {
                m4291.put(StringFog.decrypt("GyjF3w==\n", "d0uxrDlPGlA=\n"), this.f959);
            }
            m4291.put(StringFog.decrypt("MAwTkyE=\n", "U2Nj40AYgFc=\n"), this.f960.f1833);
            m4291.put(StringFog.decrypt("SZ6B\n", "Lff1/dj5RdU=\n"), this.f960.f1832);
            String decrypt = StringFog.decrypt("n+I1\n", "6otR8k+Z6ig=\n");
            C0783 c0783 = this.f960;
            synchronized (c0783) {
                str = c0783.f1836;
            }
            m4291.put(decrypt, str);
            m4291.put(StringFog.decrypt("nH4=\n", "6R2SH5Lc4uc=\n"), this.f960.f1835);
            m4291.put(StringFog.decrypt("0xE=\n", "p2uSPTUPiCM=\n"), Calendar.getInstance().getTimeZone().getRawOffset() / 3600000.0d);
            m4291.put(StringFog.decrypt("XQ5NJ0w=\n", "KX4bQj6olis=\n"), IronSourceAdQuality.getSDKVersion());
            String decrypt2 = StringFog.decrypt("Aw==\n", "d1GH/YwhGzs=\n");
            String str4 = AbstractC0758.f1704;
            try {
                try {
                    Class.forName(StringFog.decrypt("aGnvxcVEFy1yNebFwEYfIG50rL7eQwogW2rjktVY\n", "CwaC67Aqflk=\n"));
                    str2 = AbstractC0758.f1698;
                } catch (ClassNotFoundException unused) {
                    str2 = AbstractC0758.f1696;
                }
            } catch (ClassNotFoundException unused2) {
                Class.forName(StringFog.decrypt("gOonSoo4ZzSQ6j8WgC8mO4f0PwWPI3wjkOEhSpAuY3SC7DhKsCVnN4/kHhaCKW04guYhIZs+bTSQ\n7CUK\n", "44VKZONKCFo=\n"));
                str2 = AbstractC0758.f1697;
            }
            m4291.put(decrypt2, str2);
            m4291.put(StringFog.decrypt("Dg+Ogxg=\n", "Y2Dq5nRkK+4=\n"), Build.MODEL);
            m4291.put(StringFog.decrypt("Ycm7U2YFOkh52rBU\n", "DKjVJgBkWTw=\n"), Build.MANUFACTURER);
            m4291.put(StringFog.decrypt("clWsCXcuhKQ=\n", "AjnNfRFB9sk=\n"), StringFog.decrypt("I3YB+eCYvA==\n", "Qhhli4/x2Kw=\n"));
            String decrypt3 = StringFog.decrypt("bbTt\n", "AsebwASEFn4=\n");
            String str5 = AbstractC0608.f1070;
            m4291.put(decrypt3, Build.VERSION.RELEASE);
            AbstractC0758.m4158(this.f961, m4291);
            Context context = this.f961;
            try {
                if (context.checkCallingOrSelfPermission(StringFog.decrypt("paDEFqS13rC0q9IJoq/J96ugjiWIn//Nl5H3LY2V5c2Qj/Qh\n", "xM6gZMvcup4=\n")) == 0) {
                    WifiInfo connectionInfo = ((WifiManager) context.getSystemService(StringFog.decrypt("E9OIZg==\n", "ZLruDxza5Go=\n"))).getConnectionInfo();
                    m4291.put(AbstractC0608.f1060, connectionInfo.getSupplicantState());
                    if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                        m4291.put(AbstractC0608.f1059, connectionInfo.getRssi());
                        m4291.put(AbstractC0608.f1058, connectionInfo.getLinkSpeed());
                    }
                }
            } catch (Throwable th) {
                String str6 = AbstractC0608.f1070;
                AbstractC0580.m4080(str6, str6, StringFog.decrypt("/tiKqmTPIUDfw5aiNpgpQtKKkatwgGBQ1Iqds3OBNA==\n", "u6r4xRbvQCQ=\n"), th, null, false);
            }
            Context context2 = this.f961;
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService(StringFog.decrypt("SFkMb7yBpB1dXxZ4\n", "KzZiAdni0HQ=\n"));
                TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService(StringFog.decrypt("mBsz8ug=\n", "6HNcnI00fuA=\n"));
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
                if (networkInfo != null) {
                    m4291.put(AbstractC0608.f1057, networkInfo.getState());
                    if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                        m4291.put(AbstractC0608.f1056, networkInfo.getType());
                        m4291.put(AbstractC0608.f1055, networkInfo.getTypeName());
                        m4291.put(AbstractC0608.f1054, networkInfo.getSubtype());
                        m4291.put(AbstractC0608.f1053, networkInfo.getSubtypeName());
                        m4291.put(AbstractC0608.f1052, telephonyManager.getNetworkOperator());
                        m4291.put(AbstractC0608.f1051, telephonyManager.getNetworkOperatorName());
                        m4291.put(AbstractC0608.f1050, telephonyManager.getNetworkCountryIso());
                        if (z3) {
                            m4291.put(AbstractC0608.f1049, telephonyManager.getSimOperator());
                            m4291.put(AbstractC0608.f1048, telephonyManager.getSimOperatorName());
                        }
                    }
                }
            } catch (Throwable th2) {
                String str7 = AbstractC0608.f1070;
                AbstractC0580.m4080(str7, str7, StringFog.decrypt("plokrcR2d0OHQTilljt5RYpEM+LfOHBIw1w54tMgc0mX\n", "4yhWwrZWFic=\n"), th2, null, false);
            }
            AbstractC0608.m4117(m4291);
            AbstractC0608.m4111(m4291);
            m4291.put(StringFog.decrypt("hpVR+A==\n", "6OIwjq3L/xU=\n"), z);
            AbstractC0608.m4116(this.f961, m4291);
            try {
                m4291.put(AbstractC0608.f1061, AbstractC1006.m4291(AbstractC0608.m4112(), false));
            } catch (JSONException unused3) {
            }
            try {
                JSONObject jSONObject2 = new JSONObject(this.f960.f1831);
                jSONObject2.remove(StringFog.decrypt("JhEx/gQKJJAYFyzODw==\n", "R3VAoW1kTeQ=\n"));
                jSONObject2.remove(StringFog.decrypt("nItXRLzlbPOag1xZvOJm64yE\n", "6eozN+OWCYA=\n"));
                if (jSONObject2.length() > 0) {
                    m4291.putOpt(StringFog.decrypt("j8kg2Q==\n", "4r1ErbBQkW8=\n"), jSONObject2);
                }
            } catch (Exception e) {
                String str8 = f958;
                AbstractC0580.m4080(str8, str8, StringFog.decrypt("6WRgz7xkpsnIf3zH7imi2c02dsG6JefH33l8gLor58jac3zU\n", "rBYSoM5Ex60=\n"), e, null, false);
            }
        }
        return m4291;
    }
}
