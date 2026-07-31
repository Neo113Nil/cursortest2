package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ṭ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1052 extends C0572 {

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f2654 = StringFog.decrypt("+9WN7sjfdgbJ/prn399YANTenuPFxG0=\n", "urvsgrGrH2U=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final Handler f2655;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public int f2656;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public int f2657;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final int f2658;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f2659;

    public C1052(Context context, C0783 c0783, int i, String str, long j) {
        super(context, c0783, j);
        this.f2658 = i;
        this.f2657 = 0;
        this.f2656 = 1;
        this.f2659 = str;
        HandlerThread handlerThread = new HandlerThread(StringFog.decrypt("waHhm5aesnvzivaSgZ6cfe6q8pabhak=\n", "gM+A9+/q2xg=\n"));
        handlerThread.start();
        this.f2655 = new Handler(handlerThread.getLooper());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m4326(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z, C1143 c1143) {
        this.f2655.post(new C1061(this, str, jSONObject, jSONObject2, z, c1143));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C0572
    /* renamed from: ﾒ */
    public final JSONObject mo4064(JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        long timeInMillis;
        long elapsedRealtime;
        synchronized (this) {
            String str = AbstractC0530.f589;
            timeInMillis = Calendar.getInstance().getTimeInMillis();
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        JSONObject mo4064 = super.mo4064(jSONObject, z, z2, z3);
        try {
            String str2 = AbstractC1183.f3064;
            long optLong = mo4064.optLong(str2);
            mo4064.remove(str2);
            if (optLong != 0) {
                long j = elapsedRealtime - (timeInMillis - optLong);
                mo4064.put(StringFog.decrypt("Kq1Q\n", "WdkjSOd9ouo=\n"), timeInMillis);
                mo4064.put(StringFog.decrypt("HGVE\n", "bxAww9vh3Pk=\n"), elapsedRealtime);
                timeInMillis = optLong;
                elapsedRealtime = j;
            }
            mo4064.put(StringFog.decrypt("nzs2\n", "+09FzcNuEiM=\n"), timeInMillis);
            mo4064.put(StringFog.decrypt("wPE=\n", "tYU4sKaJnRY=\n"), elapsedRealtime);
            mo4064.put(StringFog.decrypt("g/vdBg==\n", "8I60YliIw78=\n"), this.f2659);
            mo4064.put(StringFog.decrypt("5XoK\n", "lhNunj+q3W0=\n"), this.f2658);
            String decrypt = StringFog.decrypt("2FRE\n", "qzopn8jqacM=\n");
            int i = this.f2657;
            if (i == 0) {
                i = 1;
            }
            mo4064.put(decrypt, i);
            if (AbstractC0590.m4087().mo4088()) {
                mo4064.put(StringFog.decrypt("AXRqFg==\n", "YgcGcmT6c/4=\n"), true);
            }
            C0586 c0586 = ((C0600) AbstractC0590.m4087()).f1014;
            if (c0586 != null) {
                String m4085 = c0586.m4085();
                if (!TextUtils.isEmpty(m4085)) {
                    mo4064.put(StringFog.decrypt("TLgs\n", "KcxYYSgsJbw=\n"), m4085);
                }
            }
            if (z2) {
                m4327(mo4064);
            }
        } catch (JSONException e) {
            String str3 = f2654;
            AbstractC0580.m4080(str3, str3, StringFog.decrypt("xYN6IibE4tvlkHwkOoOhzPaUZjkZgfXI\n", "gPEITVTkgak=\n"), e, null, false);
        }
        return mo4064;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m4327(JSONObject jSONObject) {
        C0784 m4034 = C0506.m4029().m4034();
        try {
            jSONObject.put(StringFog.decrypt("2voSG0MMKgve\n", "tpthbxdjX2g=\n"), AbstractC1006.m4290(m4034.f1842, m4034.f1841, m4034.f1840, m4034.f1839));
        } catch (JSONException e) {
            String str = f2654;
            AbstractC0580.m4080(str, str, StringFog.decrypt("clK6Ukik19NzSaZaGujXxGNPvV5SpMLYN0W+WFTw\n", "FyDIPTqEtrc=\n"), e, null, false);
        }
    }
}
