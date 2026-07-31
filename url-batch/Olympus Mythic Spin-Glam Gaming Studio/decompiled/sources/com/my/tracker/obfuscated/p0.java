package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* loaded from: classes15.dex */
public final class p0 {
    static int f = 3;
    static volatile p0 g;
    final e0 a;
    final n b;
    final Context c;
    InstallReferrerClient d;
    int e;

    final class a implements InstallReferrerStateListener {
        a() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            x2.a("ReferrerHandler: install referrer service is disconnected. Connection attempts: " + p0.this.e);
            p0.this.a(this);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i) {
            x2.a("ReferrerHandler: install referrer setup is finished");
            if (i == -1) {
                p0.this.a(this);
            } else {
                p0.this.a(i);
            }
        }
    }

    p0(e0 e0Var, n nVar, Context context) {
        this.a = e0Var;
        this.b = nVar;
        this.c = context.getApplicationContext();
    }

    public static void a(e0 e0Var, n nVar, Context context) {
        if (g != null) {
            return;
        }
        synchronized (p0.class) {
            try {
                if (g != null) {
                    return;
                }
                final p0 p0Var = new p0(e0Var, nVar, context);
                m.a(new Runnable() { // from class: com.my.tracker.obfuscated.p0$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        p0.a(p0.this);
                    }
                });
                g = p0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        try {
            x2.a("ReferrerHandler: initialize InstallReferrerClient");
            this.d = InstallReferrerClient.newBuilder(this.c).build();
            a(new a());
        } catch (Throwable th) {
            x2.b("ReferrerHandler: error occurred while initialization InstallReferrerClient", th);
        }
    }

    void b() {
        p1 a2 = p1.a(this.c);
        if (a2.r()) {
            return;
        }
        String m = a2.m();
        if (TextUtils.isEmpty(m)) {
            return;
        }
        a(m, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(p0 p0Var) {
        p0Var.b();
        p0Var.a();
    }

    public static void a(String str, Context context, Runnable runnable) {
        p0 p0Var = g;
        if (p0Var == null) {
            p1 a2 = p1.a(context);
            if (!a2.r()) {
                a2.l(str);
            }
            runnable.run();
            return;
        }
        p0Var.a(str, runnable);
    }

    void a() {
        if (p1.a(this.c).o()) {
            return;
        }
        m.f(new Runnable() { // from class: com.my.tracker.obfuscated.p0$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.c();
            }
        });
    }

    void a(int i) {
        if (this.d == null) {
            x2.b("ReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i == 0) {
                x2.a("ReferrerHandler: retrieving install referrer");
                final ReferrerDetails installReferrer = this.d.getInstallReferrer();
                m.a(new Runnable() { // from class: com.my.tracker.obfuscated.p0$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        p0.this.b(installReferrer);
                    }
                });
            } else {
                x2.a("ReferrerHandler: InstallReferrerResponse code: " + i);
            }
        } catch (Throwable th) {
            x2.b("ReferrerHandler: error occurred while retrieving install referrer", th);
        }
        try {
            this.d.endConnection();
        } catch (Throwable unused) {
        }
        this.d = null;
    }

    void a(InstallReferrerStateListener installReferrerStateListener) {
        InstallReferrerClient installReferrerClient = this.d;
        if (installReferrerClient == null) {
            x2.a("ReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.e;
        if (i >= f) {
            try {
                installReferrerClient.endConnection();
            } catch (Throwable unused) {
            }
            this.d = null;
            return;
        }
        this.e = i + 1;
        try {
            x2.a("ReferrerHandler: connect to referrer client");
            this.d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            x2.b("ReferrerHandler: error occurred while connection InstallReferrerClient", th);
            a(installReferrerStateListener);
        }
    }

    void a(String str, Runnable runnable) {
        p1 a2 = p1.a(this.c);
        if (a2.r()) {
            x2.a("ReferrerHandler: referrer has been tracked");
            return;
        }
        this.a.a(str, t.b(this.c), runnable);
        this.b.a(str);
        a2.v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(ReferrerDetails referrerDetails) {
        p1 a2 = p1.a(this.c);
        if (a2.o()) {
            x2.a("ReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        x2.a("ReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.a.a(installReferrer, t.b(this.c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.b.a(installReferrer);
        a2.s();
    }
}
