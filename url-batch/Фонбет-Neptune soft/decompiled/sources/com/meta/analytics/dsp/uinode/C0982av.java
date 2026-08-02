package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.av, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0982av implements C6U {
    public static String[] A05 = {"udExhBBZigXHD765", "VCbgsgLtwNII3DWSf3Df", "sJ3cSki5Ts1gkpIy0", "hudoenMQ7OfQJqKUwYviTAHkC5956B", "3GiDDKpH2PPu7", "VAV0OzmNbR17K1ZAu", "eIBPlY8UdwZIA15YBWaPzTw3Re1i6Niv", "w6ShnqqW6c5InpRu2fdQvGfdyx0XiT7r"};
    public final /* synthetic */ AbstractC0992b5 A00;
    public final /* synthetic */ InterfaceC00711h A01;
    public final /* synthetic */ C00721i A02;
    public final /* synthetic */ C0889Yn A03;
    public final /* synthetic */ boolean A04;

    public C0982av(C00721i c00721i, C0889Yn c0889Yn, boolean z, AbstractC0992b5 abstractC0992b5, InterfaceC00711h interfaceC00711h) {
        this.A02 = c00721i;
        this.A03 = c0889Yn;
        this.A04 = z;
        this.A00 = abstractC0992b5;
        this.A01 = interfaceC00711h;
    }

    private void A00(boolean z) {
        ArrayList arrayList;
        if (z) {
            C0889Yn c0889Yn = this.A03;
            String[] strArr = A05;
            if (strArr[7].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ua1Hqbcww3qJrVJ6O";
            strArr2[2] = "2U70GzBDbPON7gkn8";
            if (C0478Ih.A1O(c0889Yn) && this.A04) {
                arrayList = this.A02.A02;
                arrayList.add(PC.A01(this.A03, this.A00, 1, new C0983aw(this)));
                return;
            } else {
                this.A01.AAf();
                return;
            }
        }
        this.A01.AAe(AdError.CACHE_ERROR);
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void AB2() {
        A00(false);
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void ABB() {
        A00(true);
    }
}
