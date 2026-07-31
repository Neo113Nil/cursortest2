package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴐ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0957 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0951 f2278;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Context f2279;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Intent f2280;

    public C0957(C0951 c0951, Intent intent, Context context) {
        this.f2278 = c0951;
        this.f2280 = intent;
        this.f2279 = context;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        try {
            if (this.f2280.getAction().equals(StringFog.decrypt("CqRMWS6FDWAFr1wFIoMHIEWJZ2UPqSoaIpxhfxizKgYqhG9u\n", "a8ooK0HsaU4=\n"))) {
                String str = C0951.f2266;
                AbstractC0580.m4078(str, StringFog.decrypt("A+bI+VbsGzgu7NLgXP0EcTvqyPcZ/Rh5I+TZ\n", "TYO8jjmecBg=\n"));
                if (this.f2280.getBooleanExtra(StringFog.decrypt("oEVy123VAj26Q0fRd8I=\n", "zioxuAO7Z14=\n"), false)) {
                    AbstractC0580.m4078(str, StringFog.decrypt("ffpndWtOagNH/SJpax1uTFv5ImRhB3dGSuZrcWcdYA==\n", "KZICBw5pGSM=\n"));
                    AbstractC1026.m4312(new C0998(this));
                } else if (C0951.m4246(this.f2278, this.f2279)) {
                    AbstractC1026.m4312(new C0984(this));
                } else {
                    AbstractC1026.m4312(new C0962(this));
                }
            }
        } catch (Exception e) {
            AbstractC0577.m4068(C0951.f2266, StringFog.decrypt("rrGq+8MWrcbLrLbG1FWhwZ2m\n", "68PYlLE2xKg=\n"), (Throwable) e, false);
        }
    }
}
