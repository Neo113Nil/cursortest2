package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.services.core.request.WebRequestEvent;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ۦ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0681 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1011 f1494;

    public C0681(C1011 c1011) {
        this.f1494 = c1011;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r4.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("YY3YUfDjxsw=\n", "IsKVAbymkok=\n")) != false) goto L14;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1011 c1011 = this.f1494;
        char c = 0;
        String str = (String) arrayList.get(0);
        c1011.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 183181625) {
            if (hashCode == 2066319421 && str.equals(StringFog.decrypt("W9LvgbCx\n", "HZOmzfX1dL0=\n"))) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return WebRequestEvent.COMPLETE;
        }
        if (c != 1) {
            return null;
        }
        return WebRequestEvent.FAILED;
    }
}
