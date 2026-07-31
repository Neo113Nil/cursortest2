package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭒ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1193 implements InterfaceC1075 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1191 f3092;

    public C1193(C1191 c1191) {
        this.f3092 = c1191;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1075
    /* renamed from: ﾒ */
    public final void mo4123(C1335 c1335) {
        C1348 c1348 = c1335.f3681;
        int i = c1348.f3705;
        String str = c1348.f3704;
        if (i >= 200 && i <= 299) {
            String decrypt = StringFog.decrypt("tK/kqjJtkBaG\n", "9cGFxksZ+XU=\n");
            AbstractC0580.m4079(decrypt, decrypt, StringFog.decrypt("6J4tYr3JCb3Mkjwxr8kIrdyBNiyvjFquwIN5MbmHHo3ZlDc2/Q==\n", "r/FZQtzpesg=\n"), this.f3092.f3090, true);
            Iterator it = this.f3092.f3089.iterator();
            while (it.hasNext()) {
                C1071 c1071 = (C1071) it.next();
                C0404 c0404 = this.f3092.f3087.f2768;
                C0515 c0515 = c1071.f2723;
                c0404.getClass();
                C0916.m4240().post(new C0407(c0404, c0515));
            }
            AbstractC1026.m4312(new C1264(this, c1335));
            return;
        }
        if (i == 403) {
            synchronized (this.f3092.f3087) {
                try {
                    Iterator it2 = this.f3092.f3087.f2762.iterator();
                    while (it2.hasNext()) {
                        AbstractC1026.m4312(new C1266((C0374) it2.next()));
                    }
                } finally {
                }
            }
        } else {
            AbstractC0580.m4078(StringFog.decrypt("ayjOEKTp0ttZ\n", "KkavfN2du7g=\n"), StringFog.decrypt("PqNnn7tFz5sK7H2foVmGgh+jZJ3vWs+BBex5n6FJ44MIon7U72rJgU2+b4m/QsiGCPYq\n", "bcwK+s8tpvU=\n") + i + " " + str);
        }
        AbstractC1026.m4312(new C1258(this, c1335, i, str));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1075
    /* renamed from: ﾒ */
    public final void mo4124(C1335 c1335, String str) {
        AbstractC1026.m4312(new C1201(this, c1335, str));
    }
}
