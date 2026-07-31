package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵩ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C1030 extends AbstractC0544 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2616 = StringFog.decrypt("EXlH\n", "fRYgqhaVHwo=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0544[] f2617;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f2618;

    public C1030(String str, ArrayList arrayList) {
        this.f2618 = AbstractC0471.m4008(str);
        AbstractC0544[] abstractC0544Arr = new AbstractC0544[arrayList.size()];
        this.f2617 = abstractC0544Arr;
        arrayList.toArray(abstractC0544Arr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1030 c1030 = (C1030) obj;
        if (this.f2618.equals(c1030.f2618)) {
            return Arrays.equals(this.f2617, c1030.f2617);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f2618;
        return Arrays.hashCode(this.f2617) + ((str != null ? str.hashCode() : 0) * 31);
    }

    public String toString() {
        return mo4048(this.f2617);
    }

    /* renamed from: ﾇ */
    public String mo4048(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2618);
        sb.append(StringFog.decrypt("Xg==\n", "dl6xV9ZEUWw=\n"));
        sb.append(AbstractC0544.m4040(objArr));
        return AbstractC1293.m4543("nQ==\n", "tPg2BOuWM1Y=\n", sb);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0544
    /* renamed from: ﾒ */
    public C0954 mo4042(C0785 c0785, C0880 c0880) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0544 abstractC0544 : this.f2617) {
            arrayList.add(abstractC0544.m4041(c0785, c0880).f2276);
        }
        if (!this.f2618.equals(f2616)) {
            try {
                return new C0954(((C1064) c0785.m4181(this.f2618)).m4337(c0785, c0880, arrayList));
            } catch (Exception unused) {
                if (c0880.f2146.m4161(this.f2618) == null) {
                    return new C0954(c0880.f2144.mo4016(c0880, this.f2618, arrayList, c0880.f2142, c0785));
                }
                C0954 m4337 = c0880.f2146.m4161(this.f2618).m4337(c0785, c0880, arrayList);
                m4337.f2275 = false;
                return m4337;
            }
        }
        AbstractC0844.m4219(StringFog.decrypt("pqWemjhu7Q==\n", "9ffSxXQhqgo=\n"), c0880.m4231() + StringFog.decrypt("x3Y=\n", "/VZSCjmAQvk=\n") + arrayList.get(0), null, null);
        return new C0954(null);
    }
}
