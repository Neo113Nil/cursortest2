package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڹ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0669 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0664 f1424;

    public C0669(C0664 c0664) {
        this.f1424 = c0664;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0654 c0654 = this.f1424.f1417;
        if (c0654.f1391) {
            C0791 c0791 = c0654.f1390;
            String decrypt = StringFog.decrypt("1Cc17uic0YXXbDLr7InWqcwxJejkut2c\n", "uUJRh4nouOo=\n");
            c0791.getClass();
            c0791.m4205(decrypt, new ArrayList());
            this.f1424.f1417.f1391 = false;
        }
    }
}
