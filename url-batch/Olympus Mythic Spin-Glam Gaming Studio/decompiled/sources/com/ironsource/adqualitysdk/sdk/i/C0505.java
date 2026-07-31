package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ξ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0505 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1284 f463;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f464;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f465;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ String f466;

    public C0505(C1284 c1284, String str, boolean z, C0880 c0880) {
        this.f463 = c1284;
        this.f466 = str;
        this.f465 = z;
        this.f464 = c0880;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4028(Object obj, Method method, Object[] objArr) {
        if (method != null) {
            try {
                String str = this.f466 + StringFog.decrypt("7w==\n", "we1W/VAk6Bk=\n") + method.getName();
                ArrayList m4531 = C1284.m4531(this.f463, objArr != null ? Arrays.asList(objArr) : new ArrayList(), new Object[]{(InterfaceC1111) obj});
                ArrayList arrayList = new ArrayList();
                if (this.f465) {
                    arrayList.add(m4531);
                    m4531 = arrayList;
                }
                C1189 c1189 = this.f464.f2142;
                C0880.m4228(c1189.f3085, str, true, false, m4531);
                C0880 c0880 = c1189.f3085;
                C1195 c1195 = new C1195(c1189, str, false, m4531);
                c0880.getClass();
                try {
                    AbstractC1026.m4316(c1195);
                } catch (Throwable unused) {
                }
                C0880 c08802 = c1189.f3085;
                C1195 c11952 = new C1195(c1189, str, true, m4531);
                c08802.getClass();
                try {
                    AbstractC1026.m4314(new C1152(c11952));
                } catch (Throwable unused2) {
                }
            } catch (Exception e) {
                String m4231 = this.f464.m4231();
                StringBuilder sb = new StringBuilder();
                sb.append(StringFog.decrypt("5G4ObEJCO3PXcxdqXgVy\n", "oRx8AzBiUh0=\n"));
                sb.append(method.getName());
                sb.append(StringFog.decrypt("gsQAx6O/pijNx0U=\n", "oqlls8vQwgg=\n"));
                sb.append(this.f466);
                AbstractC0844.m4219(m4231, AbstractC1293.m4543("2jh4rtinDNyI\n", "+lQR3azCYrk=\n", sb), e, null);
            }
        }
    }
}
