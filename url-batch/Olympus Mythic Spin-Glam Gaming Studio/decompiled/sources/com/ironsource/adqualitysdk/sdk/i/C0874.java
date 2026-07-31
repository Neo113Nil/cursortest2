package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.ads.AdContainer;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔀ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0874 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0771 f2113;

    public C0874(C0771 c0771) {
        this.f2113 = c0771;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r4.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("ggS6iOKtl+mGF6+S96WN7pwEsoXi\n", "0kj7y6fg0qc=\n")) == false) goto L13;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0771 c0771 = this.f2113;
        char c = 0;
        String str = (String) arrayList.get(0);
        c0771.getClass();
        int hashCode = str.hashCode();
        if (hashCode != -1097819034) {
            if (hashCode == 1554700484) {
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("KeJ4AzmuY4kt8W0ZLKZ5gSzidRM/sWOCNw==\n", "ea45QHzjJsc=\n"))) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_INLINE;
        }
        if (c != 1) {
            return null;
        }
        return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_FULLSCREEN;
    }
}
