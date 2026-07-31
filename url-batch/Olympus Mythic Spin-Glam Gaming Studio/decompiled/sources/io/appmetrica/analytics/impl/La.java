package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.StringsKt;

/* loaded from: classes10.dex */
public final class La implements InstallReferrerStateListener {
    public final InstallReferrerClient a;
    public final InterfaceC5803xg b;
    public final /* synthetic */ Ma c;

    public La(Ma ma, InstallReferrerClient installReferrerClient, InterfaceC5803xg interfaceC5803xg) {
        this.c = ma;
        this.a = installReferrerClient;
        this.b = interfaceC5803xg;
    }

    public static void a(int i) {
        if (i == 3) {
            C5340fk c5340fk = Dj.a;
            IllegalStateException illegalStateException = new IllegalStateException("Developer error");
            c5340fk.getClass();
            c5340fk.a(new Ej("Failed to get referrer via Google Play referrer library", illegalStateException));
            return;
        }
        if (i != 4) {
            return;
        }
        C5340fk c5340fk2 = Dj.a;
        IllegalStateException illegalStateException2 = new IllegalStateException("Permission error");
        c5340fk2.getClass();
        c5340fk2.a(new Ej("Failed to get referrer via Google Play referrer library", illegalStateException2));
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(final int i) {
        this.c.a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.La$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                La.a(La.this, i);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0002, B:5:0x0008, B:6:0x005d, B:19:0x0022, B:24:0x004f, B:25:0x0057, B:26:0x002b, B:28:0x0031, B:31:0x0038), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0002, B:5:0x0008, B:6:0x005d, B:19:0x0022, B:24:0x004f, B:25:0x0057, B:26:0x002b, B:28:0x0031, B:31:0x0038), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(La la, int i) {
        Object m8023constructorimpl;
        String installReferrer;
        C5751vg c5751vg;
        Object dg;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (i != 0) {
                la.getClass();
                a(i);
                dg = new Cg("The connection returned an error code " + i, null, 2, null);
            } else {
                ReferrerDetails installReferrer2 = la.a.getInstallReferrer();
                if (installReferrer2 != null && (installReferrer = installReferrer2.getInstallReferrer()) != null && !StringsKt.isBlank(installReferrer)) {
                    c5751vg = new C5751vg(installReferrer2.getInstallReferrer(), installReferrer2.getReferrerClickTimestampSeconds(), installReferrer2.getInstallBeginTimestampSeconds(), 2);
                    if (c5751vg != null) {
                        dg = new Cg("Referrer is null", null, 2, null);
                    } else {
                        dg = new Dg(c5751vg);
                    }
                }
                c5751vg = null;
                if (c5751vg != null) {
                }
            }
            m8023constructorimpl = Result.m8023constructorimpl(dg);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            C5340fk c5340fk = Dj.a;
            c5340fk.getClass();
            c5340fk.a(new Ej("Failed to get referrer via Google Play referrer library", m8026exceptionOrNullimpl));
            m8023constructorimpl = new Cg("Failed to get referrer via Google Play referrer library", m8026exceptionOrNullimpl);
        }
        Eg eg = (Eg) m8023constructorimpl;
        try {
            la.a.endConnection();
        } catch (Throwable unused) {
        }
        la.b.a(eg);
    }
}
