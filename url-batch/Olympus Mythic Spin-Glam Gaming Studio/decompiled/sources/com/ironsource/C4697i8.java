package com.ironsource;

import android.webkit.JavascriptInterface;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* renamed from: com.ironsource.i8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4697i8 {
    private C4750l8 a;

    C4697i8(C4750l8 c4750l8) {
        this.a = c4750l8;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/i8;->receiveMessageFromExternal(Ljava/lang/String;)V");
        CreativeInfoManager.onReceiveMessageFromExternal(com.safedk.android.utils.h.f, this, str);
        safedk_i8_receiveMessageFromExternal_afa7ac330e32496e214e10ecc1273bad(str);
    }

    @JavascriptInterface
    public void safedk_i8_receiveMessageFromExternal_afa7ac330e32496e214e10ecc1273bad(String p0) {
        this.a.handleMessageFromAd(p0);
    }
}
