package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.ads.AdUnit;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓹ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0867 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0771 f2093;

    public C0867(C0771 c0771) {
        this.f2093 = c0771;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r5.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("FXIxeLgJ+xsdYCtkvhXqCgtjIHCkA+0B\n", "VDZuO+pMuk8=\n")) == false) goto L18;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0771 c0771 = this.f2093;
        char c = 0;
        String str = (String) arrayList.get(0);
        c0771.getClass();
        int hashCode = str.hashCode();
        if (hashCode == -2102692847) {
            if (str.equals(StringFog.decrypt("3eOKM1pGl77V8ZAvXFqGr8PjnCNYT5ez\n", "nKfVcAgD1uo=\n"))) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != -1357644918) {
            if (hashCode == 235669401) {
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("+tPUBD3ATvjywc4YO9xf6eTBwgMqyg==\n", "u5eLR2+FD6w=\n"))) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_UNSUPPORTED_OR_UNKNOWN;
        }
        if (c == 1) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_VIDEO;
        }
        if (c != 2) {
            return null;
        }
        return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_DISPLAY;
    }
}
