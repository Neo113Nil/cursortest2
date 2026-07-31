package com.facebook.ads.redexgen.core;

import android.content.Context;

@Deprecated
/* renamed from: com.facebook.ads.redexgen.X.pE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3713pE implements C5Y {
    public final Context A00;
    public final C5Y A01;
    public final InterfaceC20495t A02;

    public C3713pE(Context context, InterfaceC20495t interfaceC20495t, C5Y c5y) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC20495t;
        this.A01 = c5y;
    }

    public C3713pE(Context context, String str, InterfaceC20495t interfaceC20495t) {
        this(context, interfaceC20495t, new AO().A01(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C5Y
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final AP A5I() {
        AP ap = new AP(this.A00, this.A01.A5I());
        if (this.A02 != null) {
            ap.A43(this.A02);
        }
        return ap;
    }
}
