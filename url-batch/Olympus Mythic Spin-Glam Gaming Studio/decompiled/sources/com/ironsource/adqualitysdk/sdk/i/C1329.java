package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.fairbid.internal.Constants;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｺ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1329 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1161 f3673;

    public C1329(C1161 c1161) {
        this.f3673 = c1161;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r6.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("fURvI7b8og==\n", "KAokbfmr7Fw=\n")) != false) goto L24;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1161 c1161 = this.f3673;
        char c = 0;
        String str = (String) arrayList.get(0);
        c1161.getClass();
        int hashCode = str.hashCode();
        if (hashCode == -1372958932) {
            if (str.equals(StringFog.decrypt("R2/MFFRfnfZaaNkd\n", "DiGYUQYMyb8=\n"))) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 433141802) {
            if (hashCode != 543046670) {
                if (hashCode == 1951953708 && str.equals(StringFog.decrypt("wdOdEoyg\n", "g5LTXMnyatk=\n"))) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals(StringFog.decrypt("G1VK9qx3lhs=\n", "SRAdt/4z018=\n"))) {
                    c = 3;
                }
                c = 65535;
            }
        }
        if (c == 0) {
            return Constants.AdType.UNKNOWN;
        }
        if (c == 1) {
            return Constants.AdType.BANNER;
        }
        if (c == 2) {
            return Constants.AdType.INTERSTITIAL;
        }
        if (c != 3) {
            return null;
        }
        return Constants.AdType.REWARDED;
    }
}
