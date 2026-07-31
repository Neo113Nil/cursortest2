package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ں, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0670 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0529 f1425;

    public C0670(C0529 c0529) {
        this.f1425 = c0529;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        if (r3.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("WbuJDjKFVOZEvJwH\n", "EPXdS2DWAK8=\n")) != false) goto L30;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0529 c0529 = this.f1425;
        char c = 0;
        String str = (String) arrayList.get(0);
        c0529.getClass();
        switch (str.hashCode()) {
            case -2032180703:
                if (str.equals(StringFog.decrypt("Ha/1zhrbog==\n", "Weqzj0+X9t8=\n"))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1841345251:
                if (str.equals(StringFog.decrypt("lNSaaTGV\n", "x4XPKGPQogA=\n"))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                break;
            case -1201514634:
                if (str.equals(StringFog.decrypt("SR/kyRTUpwo=\n", "H1q2nV2X5kY=\n"))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -77725029:
                if (str.equals(StringFog.decrypt("TbSgu5YyNwBE\n", "AfXu/8VxdlA=\n"))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 73622449:
                if (str.equals(StringFog.decrypt("MJC+hOc=\n", "fcL7x7Mqhhg=\n"))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str.equals(StringFog.decrypt("iIg3lBWtkXA=\n", "2s1g1Ufp1DQ=\n"))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str.equals(StringFog.decrypt("sgEntVRv\n", "8EBp+xE9Z1w=\n"))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return UnitDisplayType.INTERSTITIAL;
            case 1:
                return UnitDisplayType.LANDSCAPE;
            case 2:
                return UnitDisplayType.MRECT;
            case 3:
                return UnitDisplayType.BANNER;
            case 4:
                return UnitDisplayType.REWARDED;
            case 5:
                return UnitDisplayType.SQUARE;
            case 6:
                return UnitDisplayType.VERTICAL;
            case 7:
                return UnitDisplayType.DEFAULT;
            default:
                return null;
        }
    }
}
