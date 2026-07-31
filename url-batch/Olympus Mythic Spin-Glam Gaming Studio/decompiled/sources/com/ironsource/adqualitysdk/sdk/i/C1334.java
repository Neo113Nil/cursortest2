package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾃ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1334 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1315 f3678;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3679;

    public C1334(C1315 c1315, boolean z) {
        this.f3678 = c1315;
        this.f3679 = z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        String str;
        HashMap hashMap;
        C1086 c1086 = this.f3678.f3641.f3640.f3470.f3450.f3189;
        String decrypt = StringFog.decrypt("q4KxEY2nxA==\n", "3/LueOPOsNs=\n");
        C1289 c1289 = this.f3678.f3641.f3640.f3470;
        if (c1289.f3453) {
            str = c1289.f3452;
            if (str == null) {
                str = StringFog.decrypt("wLeR0w==\n", "rsL9vzAMMRU=\n");
            }
        } else {
            str = null;
        }
        C0791 c0791 = this.f3678.f3641.f3640.f3470.f3450.f3192;
        new C1106(this.f3678.f3641.f3640.f3470.f3450.f3194);
        C1213 c1213 = this.f3678.f3641.f3640.f3470.f3450;
        Context context = c1213.f3194;
        boolean z = this.f3679;
        C0783 m4455 = C1213.m4455(c1213);
        String str2 = AbstractC0569.f953;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        if (z) {
            try {
                jsonObjectInit.put(StringFog.decrypt("Y9w=\n", "Ba/EmgAYmPY=\n"), true);
            } catch (JSONException e) {
                String str3 = AbstractC0569.f953;
                AbstractC0580.m4080(str3, str3, StringFog.decrypt("wy1vTfcUOyviNnNFpVIzPfUrPUvrRy4u6jMyTuRHLm/zL3lD8VF6O+8yeALxW3ol9TBz\n", "hl8dIoU0Wk8=\n"), e, null, false);
            }
        }
        if (m4455.f1830) {
            jsonObjectInit.put(StringFog.decrypt("ft9LL7Y=\n", "H6o/RtLlvIc=\n"), true);
        }
        jsonObjectInit.put(StringFog.decrypt("L/PZSQ==\n", "X4awLSRzbWI=\n"), str);
        AbstractC1006.m4293(jsonObjectInit, c0791.m4200(), false);
        JSONObject jsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
        JSONObject jsonObjectInit3 = IronSourceNetworkBridge.jsonObjectInit();
        try {
            synchronized (c0791) {
                hashMap = c0791.f1871;
            }
            Iterator it = new HashSet(hashMap.keySet()).iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                jsonObjectInit3.put(str4, (String) c0791.m4201().get(str4));
            }
            jsonObjectInit2.put(StringFog.decrypt("1Lo9WQ==\n", "schPKh90AmI=\n"), jsonObjectInit3);
        } catch (JSONException e2) {
            String str5 = C0791.f1862;
            AbstractC0580.m4080(str5, str5, StringFog.decrypt("p/2DL2DbIeaG5p8nMpgv7IzqkjR9iWDnkP2eMmE=\n", "4o/xQBL7QII=\n"), e2, null, false);
        }
        AbstractC1006.m4293(jsonObjectInit, jsonObjectInit2, false);
        c1086.m4388(decrypt, jsonObjectInit);
        C1289 c12892 = this.f3678.f3641.f3640.f3470;
        if (c12892.f3451) {
            C1086 c10862 = c12892.f3450.f3189;
            c10862.getClass();
            AbstractC1026.m4313(new C1157(c10862));
        }
    }
}
