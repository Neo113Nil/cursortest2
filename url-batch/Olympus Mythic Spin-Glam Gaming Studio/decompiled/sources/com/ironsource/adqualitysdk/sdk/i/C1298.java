package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｃ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1298 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1289 f3470;

    public C1298(C1289 c1289) {
        this.f3470 = c1289;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.ironsource.adqualitysdk.sdk.i.ᒶ] */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C1289 c1289 = this.f3470;
        if (c1289.f3455) {
            C0791 c0791 = c1289.f3450.f3192;
            Context context = c1289.f3454;
            C1314 c1314 = new C1314(this);
            synchronized (c0791) {
                try {
                    if (c0791.f1876.get()) {
                        return;
                    }
                    if (c0791.f1875) {
                        AbstractC1026.m4312(new C0847(c1314));
                    } else {
                        String decrypt = StringFog.decrypt("9DUBLzQ4OyTMAhQR\n", "tVFQWlVUUlA=\n");
                        AbstractC0580.m4081(decrypt, decrypt, StringFog.decrypt("N2ujm35O/Gk3a6Obfk7xLWgp4OU8FqMnf2bP0gIWsChzMveW\n", "GkaOtlNj0UQ=\n") + IronSourceAdQuality.getSDKVersion() + StringFog.decrypt("2PRtqGPLD8TV9G2oY8sP\n", "+NlAhU7mIuk=\n"), true);
                        C0849 c0849 = new C0849(c0791, c1314, context);
                        if (c0791.m4198()) {
                            String str = AbstractC0688.f1543;
                            ArrayList arrayList = new ArrayList(Arrays.asList(new C0531(), new C0543(), new C0551()));
                            ArrayList arrayList2 = new ArrayList(AbstractC0688.f1542);
                            if (!arrayList.isEmpty()) {
                                AbstractC0955 abstractC0955 = (AbstractC0955) arrayList.remove(0);
                                String str2 = (String) arrayList2.remove(0);
                                if (!arrayList.isEmpty()) {
                                    c0849 = new C0833(c0791, context, arrayList, arrayList2, c0849);
                                }
                                AbstractC1026.m4312(new C0829(c0791, str2, context, abstractC0955, c0849));
                            }
                        } else {
                            AbstractC1026.m4312(new C0829(c0791, AbstractC0688.f1543, context, new C0535(), c0849));
                        }
                        c0791.f1875 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
