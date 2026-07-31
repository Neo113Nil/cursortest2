package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.ads.AdUnit;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓽ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0871 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0771 f2097;

    public C0871(C0771 c0771) {
        this.f2097 = c0771;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r5.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("cF3jVsoL5oFhRuhC2xzynX9U41PfFOE=\n", "MRm8G4tZrdQ=\n")) != false) goto L19;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0771 c0771 = this.f2097;
        char c = 0;
        String str = (String) arrayList.get(0);
        c0771.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 556003820) {
            if (hashCode != 556062505) {
                if (hashCode == 1382961856 && str.equals(StringFog.decrypt("L5qeSi7wEDU+gZVeP+cENSCVj0g47A==\n", "bt7BB2+iW2A=\n"))) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (str.equals(StringFog.decrypt("6mSv5xUcG9T7f6TzBAsPyOVtr+AHAR4=\n", "qyDwqlROUIE=\n"))) {
                    c = 1;
                }
                c = 65535;
            }
        }
        if (c == 0) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_HTML;
        }
        if (c == 1) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_JSON;
        }
        if (c != 2) {
            return null;
        }
        return AdUnit.AdMarkupType.AD_MARKUP_TYPE_UNKNOWN;
    }
}
