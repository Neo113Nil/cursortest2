package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.jv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3401jv extends AbstractRunnableC2705Wc {
    public final /* synthetic */ C3400ju A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C3401jv(C3400ju c3400ju, Map map, Map map2) {
        this.A00 = c3400ju;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        C3388ji c3388ji;
        C3218gi c3218gi;
        C3388ji c3388ji2;
        c3388ji = this.A00.A01;
        if (!TextUtils.isEmpty(c3388ji.A7O())) {
            HashMap hashMap = new HashMap();
            Map<String, String> extraData = this.A02;
            hashMap.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            hashMap.putAll(extraData2);
            c3218gi = this.A00.A0A;
            VA A0A = c3218gi.A0A();
            c3388ji2 = this.A00.A01;
            A0A.AC3(c3388ji2.A7O(), hashMap);
        }
    }
}
