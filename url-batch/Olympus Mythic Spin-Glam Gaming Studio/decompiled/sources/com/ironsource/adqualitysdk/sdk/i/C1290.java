package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.placement.PlacementType;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﻪ, reason: contains not printable characters */
/* loaded from: classes14.dex */
public final class C1290 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1207 f3456;

    public C1290(C1207 c1207) {
        this.f3456 = c1207;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r6.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("sHE/FLcrYUM=\n", "4jRoVeVvJAc=\n")) == false) goto L23;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1207 c1207 = this.f3456;
        char c = 0;
        String str = (String) arrayList.get(0);
        c1207.getClass();
        int hashCode = str.hashCode();
        if (hashCode == -1617199657) {
            if (str.equals(StringFog.decrypt("H/F9NFNfkQ==\n", "Vr8rdR8W1VE=\n"))) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode == -1372958932) {
            if (str.equals(StringFog.decrypt("CKyB0kS7NH4Vq5Tb\n", "QeLVlxboYDc=\n"))) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -65580248) {
            if (hashCode == 543046670) {
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("wUUdw2aWlkfGSwXVdZ2b\n", "jwpJnC/Y3xM=\n"))) {
                c = 3;
            }
            c = 65535;
        }
        if (c == 0) {
            return PlacementType.REWARDED;
        }
        if (c == 1) {
            return PlacementType.INTERSTITIAL;
        }
        if (c == 2) {
            return PlacementType.INVALID;
        }
        if (c != 3) {
            return null;
        }
        return PlacementType.NOT_INITIALIZED;
    }
}
