package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* loaded from: classes.dex */
public final class Pd {
    public final Context a;
    public final InterfaceC5434jb b;
    public final R9 c;
    public final Ve d;
    public final Ho e;
    public volatile IdentifiersResult f;

    public Pd(Context context, InterfaceC5434jb interfaceC5434jb) {
        this(context, interfaceC5434jb, Qd.a(context), new Ve(context), new Ho());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentifiersResult a() {
        IdentifiersResult identifiersResult = this.f;
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            Ho ho = this.e;
            String str = identifiersResult.id;
            ho.getClass();
            if (Ho.a(str)) {
                return identifiersResult;
            }
        }
        try {
            R9 r9 = this.c;
            r9.a.lock();
            r9.b.a();
            identifiersResult = this.f;
        } catch (Throwable unused) {
        }
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            Ho ho2 = this.e;
            String str2 = identifiersResult.id;
            ho2.getClass();
            if (Ho.a(str2)) {
                R9 r92 = this.c;
                r92.b.b();
                r92.a.unlock();
                return identifiersResult == null ? identifiersResult : new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)");
            }
        }
        String a = AbstractC5409ib.a(FileUtils.getFileFromSdkStorage(this.d.a, "uuid.dat"));
        this.e.getClass();
        if (!Ho.a(a)) {
            a = this.d.a(this.b.a(this.a));
        }
        this.e.getClass();
        if (Ho.a(a)) {
            IdentifiersResult identifiersResult2 = new IdentifiersResult(a, IdentifierStatus.OK, null);
            try {
                this.f = identifiersResult2;
            } catch (Throwable unused2) {
            }
            identifiersResult = identifiersResult2;
        }
        R9 r922 = this.c;
        r922.b.b();
        r922.a.unlock();
        if (identifiersResult == null) {
        }
    }

    public Pd(Context context, InterfaceC5434jb interfaceC5434jb, R9 r9, Ve ve, Ho ho) {
        this.a = context;
        this.b = interfaceC5434jb;
        this.c = r9;
        this.d = ve;
        this.e = ho;
        try {
            r9.a();
            ve.a();
            r9.b();
        } catch (Throwable unused) {
            this.c.b();
        }
    }
}
