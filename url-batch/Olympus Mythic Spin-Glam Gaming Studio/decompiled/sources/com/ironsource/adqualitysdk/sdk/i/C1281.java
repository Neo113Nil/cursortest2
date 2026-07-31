package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﻠ, reason: contains not printable characters */
/* loaded from: classes14.dex */
public final class C1281 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str = AbstractC0608.f1070;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        if (intent != null) {
            try {
                jsonObjectInit.put(AbstractC0608.f1047, intent.hasExtra(StringFog.decrypt("pH7E2dq0gQ==\n", "1BKxvr3R5a4=\n")) ? intent.getIntExtra(StringFog.decrypt("9xXwptYqzQ==\n", "h3mFwbFPqVw=\n"), -1) : -1);
                jsonObjectInit.put(AbstractC0608.f1046, Math.round(((intent.hasExtra(StringFog.decrypt("laPb1ys=\n", "+catskfXxlM=\n")) ? intent.getIntExtra(StringFog.decrypt("NWKMLeA=\n", "WQf6SIxKzqw=\n"), -1) : -1) * 100.0f) / (intent.hasExtra(StringFog.decrypt("JfQRGbo=\n", "Vpdwdd+H9kQ=\n")) ? intent.getIntExtra(StringFog.decrypt("LNPVtFw=\n", "X7C02Dm1Y4w=\n"), -1) : -1)));
            } catch (Throwable th) {
                AbstractC0580.m4072(AbstractC0608.f1070, StringFog.decrypt("lJLBJXmVAxO1id0tK9cDA6WFwTMr2QcBtIzAan/aQh2ij91wKw==\n", "0eCzSgu1Ync=\n") + th.getLocalizedMessage());
            }
        }
        synchronized (AbstractC0608.class) {
            AbstractC0608.f1044 = jsonObjectInit;
        }
    }
}
