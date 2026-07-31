package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ห, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0743 extends AbstractC0544 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0544[] f1670;

    public C0743(ArrayList arrayList) {
        AbstractC0544[] abstractC0544Arr = new AbstractC0544[arrayList.size()];
        this.f1670 = abstractC0544Arr;
        arrayList.toArray(abstractC0544Arr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0743.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f1670, ((C0743) obj).f1670);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1670);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("Lg==\n", "dVSi5lEiujc=\n"));
        sb.append(AbstractC0544.m4040(this.f1670));
        return AbstractC1293.m4543("5w==\n", "usij8qqDIy8=\n", sb);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0544
    /* renamed from: ﾒ */
    public final C0954 mo4042(C0785 c0785, C0880 c0880) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0544 abstractC0544 : this.f1670) {
            arrayList.add(abstractC0544.m4041(c0785, c0880).f2276);
        }
        return new C0954(arrayList);
    }
}
