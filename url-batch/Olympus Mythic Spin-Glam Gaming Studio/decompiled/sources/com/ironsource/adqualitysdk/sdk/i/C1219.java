package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮋ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C1219 extends AbstractC0751 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0502[] f3208;

    public C1219(ArrayList arrayList, byte b) {
        super(b);
        AbstractC0502[] abstractC0502Arr = new AbstractC0502[arrayList.size()];
        this.f3208 = abstractC0502Arr;
        arrayList.toArray(abstractC0502Arr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1219.class != obj.getClass()) {
            return false;
        }
        AbstractC0502[] abstractC0502Arr = this.f3208;
        AbstractC0502[] abstractC0502Arr2 = ((C1219) obj).f3208;
        return abstractC0502Arr != null ? abstractC0502Arr.equals(abstractC0502Arr2) : abstractC0502Arr2 == null;
    }

    public final int hashCode() {
        AbstractC0502[] abstractC0502Arr = this.f3208;
        if (abstractC0502Arr != null) {
            return abstractC0502Arr.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("60g=\n", "kEJsSGp1EKQ=\n"));
        for (AbstractC0502 abstractC0502 : this.f3208) {
            byte b = this.f1680;
            for (int i = 0; i < b; i++) {
                sb.append("  ");
            }
            sb.append(abstractC0502.toString());
            sb.append("\n");
        }
        int i2 = this.f1680 - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
        sb.append(StringFog.decrypt("DQ==\n", "cIPlt9Hf8ic=\n"));
        return sb.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0502
    /* renamed from: ﾒ */
    public final C0954 mo3961(C0785 c0785, C0880 c0880) {
        C0954 c0954 = new C0954(null);
        C0785 c07852 = new C0785(new HashMap(), c0785, false);
        for (AbstractC0502 abstractC0502 : this.f3208) {
            c0954 = abstractC0502.m4026(c07852, c0880);
            if (c0954.f2275 || c0954.f2274 || c0954.f2273) {
                break;
            }
            c0785.f1843 = (short) (c0785.f1843 + 1);
        }
        return c0954;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0502
    /* renamed from: ﾒ */
    public final int mo3960() {
        int i = 2;
        for (AbstractC0502 abstractC0502 : this.f3208) {
            i += abstractC0502.mo3960();
        }
        return i;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0502
    /* renamed from: ﾒ */
    public final int mo4027(C0785 c0785) {
        int i = 0;
        for (int i2 = 0; i2 < c0785.f1843; i2++) {
            i += this.f3208[i2].mo3960();
        }
        return i;
    }
}
