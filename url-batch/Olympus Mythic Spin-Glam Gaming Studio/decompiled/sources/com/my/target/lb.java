package com.my.target;

import android.content.Context;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.mediation.AdNetworkConfig;
import com.my.target.mediation.MediationAdConfig;
import com.my.target.mediation.MediationAdapter;
import com.my.target.tb;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes10.dex */
public abstract class lb {
    final n a;
    final tb.a b;
    final jb c;
    MediationAdapter d;
    WeakReference e;
    zf f;
    b g;
    String h;
    tb i;
    float j;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static class a implements MediationAdConfig {
        private final String a;
        private final String b;
        private final int c;
        private final int d;
        private final Map e;
        private final MyTargetPrivacy f;
        private final AdNetworkConfig g;

        a(String str, String str2, Map map, int i, int i2, MyTargetPrivacy myTargetPrivacy, AdNetworkConfig adNetworkConfig) {
            this.a = str;
            this.b = str2;
            this.e = map;
            this.d = i;
            this.c = i2;
            this.f = myTargetPrivacy;
            this.g = adNetworkConfig;
        }

        public static a a(String str, String str2, Map map, int i, int i2, MyTargetPrivacy myTargetPrivacy, AdNetworkConfig adNetworkConfig) {
            return new a(str, str2, map, i, i2, myTargetPrivacy, adNetworkConfig);
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public AdNetworkConfig getAdNetworkConfig() {
            return this.g;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public int getAge() {
            return this.d;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public int getGender() {
            return this.c;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public String getPayload() {
            return this.b;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public String getPlacementId() {
            return this.a;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public MyTargetPrivacy getPrivacy() {
            return this.f;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public Map getServerParams() {
            return this.e;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public boolean isUserAgeRestricted() {
            return this.f.userAgeRestricted;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public boolean isUserConsent() {
            Boolean bool = this.f.userConsent;
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public boolean isUserConsentSpecified() {
            return this.f.userConsent != null;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    final class b implements Runnable {
        final kb a;

        b(kb kbVar) {
            this.a = kbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            mi.a("MediationEngine: Timeout for " + this.a.b() + " ad network");
            lb.this.a(this.a, "networkTimeout");
            lb.this.a(this.a, false);
        }
    }

    lb(jb jbVar, n nVar, tb.a aVar) {
        this.c = jbVar;
        this.a = nVar;
        this.b = aVar;
    }

    private void k() {
        MediationAdapter mediationAdapter = this.d;
        if (mediationAdapter != null) {
            try {
                mediationAdapter.destroy();
            } catch (Throwable th) {
                mi.b("MediationEngine: Error - " + th);
            }
            this.d = null;
        }
        Context j = j();
        if (j == null) {
            mi.b("MediationEngine: Can't configure next ad network, context is null");
            return;
        }
        kb d = this.c.d();
        if (d == null) {
            mi.a("MediationEngine: No ad networks available");
            h();
            return;
        }
        mi.a("MediationEngine: Prepare adapter for " + d.b() + " ad network");
        MediationAdapter a2 = a(d);
        this.d = a2;
        if (a2 == null || !a(a2)) {
            mi.b("MediationEngine: Can't create adapter, class " + d.a() + " not found or invalid");
            a(d, "networkAdapterInvalid");
            k();
            return;
        }
        mi.a("MediationEngine: Adapter created");
        this.i = this.b.a(d.b(), d.f());
        zf zfVar = this.f;
        if (zfVar != null) {
            zfVar.close();
        }
        int i = d.i();
        if (i > 0) {
            this.g = new b(d);
            zf a3 = zf.a(i);
            this.f = a3;
            a3.a(this.g);
        } else {
            this.g = null;
        }
        a(d, "networkRequested");
        a(this.d, d, j);
    }

    public String a() {
        return this.h;
    }

    abstract void a(MediationAdapter mediationAdapter, kb kbVar, Context context);

    abstract boolean a(MediationAdapter mediationAdapter);

    public void b(Context context) {
        this.e = new WeakReference(context);
        k();
    }

    public float d() {
        return this.j;
    }

    abstract void h();

    abstract MediationAdapter i();

    Context j() {
        WeakReference weakReference = this.e;
        if (weakReference == null) {
            return null;
        }
        return (Context) weakReference.get();
    }

    void a(kb kbVar, boolean z) {
        b bVar = this.g;
        if (bVar == null || bVar.a != kbVar) {
            return;
        }
        Context j = j();
        tb tbVar = this.i;
        if (tbVar != null && j != null) {
            tbVar.b();
            this.i.d();
        }
        zf zfVar = this.f;
        if (zfVar != null) {
            zfVar.b(this.g);
            this.f.close();
            this.f = null;
        }
        this.g = null;
        if (!z) {
            k();
            return;
        }
        this.h = kbVar.b();
        this.j = kbVar.f();
        a(kbVar, "networkFilled");
    }

    void a(kb kbVar, String str) {
        wh.b(kbVar.h(), str, 999);
    }

    private MediationAdapter a(kb kbVar) {
        if (kbVar.j()) {
            return i();
        }
        return a(kbVar.a());
    }

    private MediationAdapter a(String str) {
        try {
            return (MediationAdapter) Class.forName(str).getConstructor(null).newInstance(null);
        } catch (Throwable th) {
            mi.b("MediationEngine: Error – " + th);
            return null;
        }
    }
}
