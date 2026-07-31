package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ۥ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0680 extends AbstractC0502 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList f1493;

    public C0680(ArrayList arrayList) {
        this.f1493 = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("NexD1g==\n", "Q40x9g1PmZU=\n"));
        sb.append(TextUtils.join(StringFog.decrypt("DdQ=\n", "IfR1+FtUj8Q=\n"), this.f1493));
        return AbstractC1293.m4543("yA==\n", "80e7sJhqtx4=\n", sb);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0502
    /* renamed from: ﾒ */
    public final C0954 mo3961(C0785 c0785, C0880 c0880) {
        List asList;
        Iterator it = this.f1493.iterator();
        while (it.hasNext()) {
            AbstractC0544 abstractC0544 = (AbstractC0544) it.next();
            C0780 c0780 = abstractC0544 instanceof C0780 ? (C0780) abstractC0544 : abstractC0544 instanceof C0741 ? ((C0741) abstractC0544).f1668 : null;
            if (c0780 != null && (asList = Arrays.asList(c0780.f1826)) != null) {
                Iterator it2 = asList.iterator();
                while (it2.hasNext()) {
                    c0785.f1850.put((String) it2.next(), null);
                }
            }
            abstractC0544.mo4042(c0785, c0880);
        }
        return new C0954(null);
    }
}
