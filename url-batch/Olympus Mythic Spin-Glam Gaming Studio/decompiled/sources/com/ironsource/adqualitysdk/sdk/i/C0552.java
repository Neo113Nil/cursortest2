package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.с, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0552 extends C1030 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final AbstractC0544[] f795;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC0544 f796;

    public C0552(AbstractC0544 abstractC0544, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(str, arrayList2);
        this.f796 = abstractC0544;
        if (arrayList != null) {
            AbstractC0544[] abstractC0544Arr = new AbstractC0544[arrayList.size()];
            this.f795 = abstractC0544Arr;
            arrayList.toArray(abstractC0544Arr);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C1030
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0552.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C0552 c0552 = (C0552) obj;
        AbstractC0544 abstractC0544 = this.f796;
        if (abstractC0544 == null ? c0552.f796 != null : !abstractC0544.equals(c0552.f796)) {
            return false;
        }
        AbstractC0544[] abstractC0544Arr = this.f795;
        AbstractC0544[] abstractC0544Arr2 = c0552.f795;
        return abstractC0544Arr != null ? abstractC0544Arr.equals(abstractC0544Arr2) : abstractC0544Arr2 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C1030
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        AbstractC0544 abstractC0544 = this.f796;
        int hashCode2 = (hashCode + (abstractC0544 != null ? abstractC0544.hashCode() : 0)) * 31;
        AbstractC0544[] abstractC0544Arr = this.f795;
        return hashCode2 + (abstractC0544Arr != null ? abstractC0544Arr.hashCode() : 0);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C1030
    public final String toString() {
        return mo4048(this.f2617);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C1030
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String mo4048(Object[] objArr) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f796);
        sb.append(StringFog.decrypt("EA==\n", "Pt9DYMrMZB4=\n"));
        sb.append(this.f2618);
        if (this.f795 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(StringFog.decrypt("4g==\n", "3ub6qf6X3FU=\n"));
            sb2.append(AbstractC0544.m4040(this.f795));
            str = AbstractC1293.m4543("/A==\n", "woiYh1MEkuY=\n", sb2);
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(StringFog.decrypt("GA==\n", "MDn07Ly/hyM=\n"));
        sb.append(AbstractC0544.m4040(objArr));
        return AbstractC1293.m4543("3A==\n", "9SRRMF1EiDk=\n", sb);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.C1030, com.ironsource.adqualitysdk.sdk.i.AbstractC0544
    /* renamed from: ﾒ */
    public final C0954 mo4042(C0785 c0785, C0880 c0880) {
        C1064 c1064;
        ArrayList arrayList = new ArrayList();
        for (AbstractC0544 abstractC0544 : this.f2617) {
            arrayList.add(abstractC0544.m4041(c0785, c0880).f2276);
        }
        AbstractC0544 abstractC05442 = this.f796;
        if ((abstractC05442 instanceof C0780) && ((C0780) abstractC05442).f1826.equals(StringFog.decrypt("M5Nb8mU=\n", "QOYrlxdV9eU=\n"))) {
            C0954 m4337 = c0880.f2146.f1775.m4161(this.f2618).m4337(c0785, c0880, arrayList);
            m4337.f2275 = false;
            return m4337;
        }
        Object obj = this.f796.m4041(c0785, c0880).f2276;
        if (obj instanceof InterfaceC1077) {
            return new C0954(((InterfaceC1077) obj).mo4016(c0880, this.f2618, arrayList, c0880.f2142, c0785));
        }
        if (obj instanceof C0880) {
            synchronized (obj) {
                try {
                    C0880 c08802 = (C0880) obj;
                    String str = this.f2618;
                    if (str != null) {
                        c1064 = c08802.f2146.m4161(str);
                    } else {
                        c08802.getClass();
                        c1064 = null;
                    }
                    if (c1064 != null) {
                        C0954 m43372 = c1064.m4337(c08802.f2145, c08802, arrayList);
                        m43372.f2275 = false;
                        return m43372;
                    }
                    AbstractC0844.m4219(c0880.m4231(), StringFog.decrypt("SmL1mvySqCxqc/KB59yqdGJ1853h1u0=\n", "DxCH9Y6yzVQ=\n") + this.f2618, new NoSuchMethodException(), null);
                } finally {
                }
            }
        }
        try {
            AbstractC0544[] abstractC0544Arr = this.f795;
            Method m4477 = abstractC0544Arr != null ? AbstractC1226.m4477(obj, this.f2618, m4047(abstractC0544Arr, c0785, c0880)) : AbstractC1226.m4478(obj, this.f2618, (List) arrayList);
            if (m4477 != null) {
                return new C0954(m4477.invoke(obj, arrayList.toArray()));
            }
            arrayList.add(0, obj);
            return new C0954(c0880.f2144.mo4016(c0880, this.f2618, arrayList, c0880.f2142, c0785));
        } catch (IllegalAccessException e) {
            AbstractC0844.m4219(c0880.m4231(), StringFog.decrypt("tzKZce9HH/uXI55q9Akdo58ln3byA1o=\n", "8kDrHp1neoM=\n") + this, e, null);
            return null;
        } catch (IllegalArgumentException e2) {
            AbstractC0844.m4219(c0880.m4231(), StringFog.decrypt("8FAdhifQDunQQRqdPJ4MsdhHG4E6lEs=\n", "tSJv6VXwa5E=\n") + this, e2, null);
            return null;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m4047(AbstractC0544[] abstractC0544Arr, C0785 c0785, C0880 c0880) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0544 abstractC0544 : abstractC0544Arr) {
            arrayList.add((Class) abstractC0544.m4041(c0785, c0880).f2276);
        }
        return arrayList;
    }
}
