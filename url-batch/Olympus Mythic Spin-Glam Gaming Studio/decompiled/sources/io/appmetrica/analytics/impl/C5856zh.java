package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.zh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5856zh extends AbstractC5208ah {
    public final Nf b;
    public final Po c;
    public final SafePackageManager d;
    public final TimeProvider e;

    public C5856zh(@NonNull C5532n5 c5532n5) {
        this(c5532n5, c5532n5.u(), Ka.k().t(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    public final boolean a(@NonNull C5326f6 c5326f6) {
        C5532n5 c5532n5 = this.a;
        if (!this.c.d()) {
            C5326f6 a = ((C5804xh) c5532n5.k.a()).e ? C5326f6.a(c5326f6, EnumC5798xb.EVENT_TYPE_APP_UPDATE) : C5326f6.a(c5326f6, EnumC5798xb.EVENT_TYPE_INIT);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.d.getInstallerPackageName(c5532n5.a, c5532n5.b.a), ""));
                Nf nf = this.b;
                nf.h.a(nf.a);
                jSONObject.put("preloadInfo", ((Kf) nf.c()).b());
            } catch (Throwable unused) {
            }
            a.setValue(jSONObject.toString());
            E9 e9 = c5532n5.n;
            e9.a(a, C5470kl.a(e9.c.b(a), a.i));
            Po po = this.c;
            synchronized (po) {
                JSONObject a2 = po.a.a();
                if (!a2.optBoolean("init_event_done", false)) {
                    po.a.a(a2.put("init_event_done", true));
                }
                Qo qo = po.a;
                Qo.a(qo.a);
                Qo.a(qo.b);
            }
            this.c.a(this.e.currentTimeMillis());
        }
        return false;
    }

    public C5856zh(C5532n5 c5532n5, Po po, Nf nf, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(c5532n5);
        this.c = po;
        this.b = nf;
        this.d = safePackageManager;
        this.e = systemTimeProvider;
    }
}
