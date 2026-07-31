package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ṫ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1050 extends AbstractRunnableC0913 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C0791 f2647;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0807 f2648;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ List f2649;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f2650;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Context f2651;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2652;

    public C1050(C0791 c0791, String str, Context context, String str2, List list, C0807 c0807) {
        this.f2647 = c0791;
        this.f2652 = str;
        this.f2651 = context;
        this.f2650 = str2;
        this.f2649 = list;
        this.f2648 = c0807;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        AbstractC0580.m4078(StringFog.decrypt("+to/9VT2/5/L+DD1UPLugg==\n", "ubVRmzGVi/A=\n"), StringFog.decrypt("4XVW3yr+1BDSclHMY/zXF8Z+XN8s7Zg=\n", "qBs/q0OfuHk=\n") + this.f2652);
        try {
            C0791 c0791 = this.f2647;
            Context context = this.f2651;
            String str = this.f2650;
            String str2 = this.f2652;
            List list = this.f2649;
            C0807 c0807 = this.f2648;
            c0791.getClass();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c0791.m4203(context, str, str2, (AbstractC0955) it.next(), c0807);
            }
        } catch (Throwable th) {
            C0696 c0696 = this.f2647.f1867;
            if (c0696 != null) {
                AbstractC1026.m4312(new C0712(c0696, this.f2652, EnumC0724.f1641));
            }
            HashMap m4189 = C0791.m4189(this.f2647);
            String str3 = this.f2650;
            Throwable th2 = th;
            while (th2.getCause() != null) {
                th2 = th2.getCause();
            }
            m4189.put(str3, th2.toString());
            AbstractC0577.m4069(StringFog.decrypt("3uVAshtnrjLvx0+yH2O/Lw==\n", "nYou3H4E2l0=\n"), StringFog.decrypt("zc9Vn07cJTDt3FOZUptmIefTSZVfiCkwqA==\n", "iL0n8Dz8RkI=\n") + this.f2652, th, true, true, false);
        }
    }
}
