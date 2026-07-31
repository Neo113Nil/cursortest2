package com.my.target.common;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.my.target.common.MyTargetConfig;
import com.my.target.db;
import com.my.target.hc;
import com.my.target.jg;
import com.my.target.kc;
import com.my.target.kg;
import com.my.target.l2;
import com.my.target.mc;
import com.my.target.mi;
import com.my.target.o0;
import com.my.target.rc;
import com.my.target.u4;
import com.my.target.ub;
import com.my.target.v3;
import com.my.target.wh;
import com.my.target.x3;
import com.my.target.z3;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class MyTargetManager {
    private static final AtomicBoolean a = new AtomicBoolean();
    private static volatile MyTargetConfig b = new MyTargetConfig.Builder().build();
    public static jg c = null;
    private static hc d = null;

    public static hc a() {
        hc hcVar = d;
        Objects.requireNonNull(hcVar);
        return hcVar;
    }

    public static jg b() {
        jg jgVar = c;
        Objects.requireNonNull(jgVar);
        return jgVar;
    }

    public static jg c() {
        return c;
    }

    @AnyThread
    public static void clearDiskCache() {
        if (o0.a()) {
            o0.b(new Runnable() { // from class: com.my.target.common.MyTargetManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    MyTargetManager.d();
                }
            });
            return;
        }
        z3 b2 = z3.b();
        if (b2 != null) {
            b2.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d() {
        z3 b2 = z3.b();
        if (b2 != null) {
            b2.a();
        }
    }

    @NonNull
    @WorkerThread
    public static String getBidderToken(@NonNull Context context) {
        return u4.b().a(b, MyTargetPrivacy.currentPrivacy(), context);
    }

    public static long getDiskCacheMaxSize() {
        return z3.c();
    }

    public static long getDiskCacheTtl() {
        return z3.d();
    }

    @NonNull
    public static MyTargetConfig getSdkConfig() {
        return b;
    }

    @AnyThread
    public static void initSdk(@NonNull Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            mi.c("MyTarget cannot be initialized due to a null application context");
        } else if (a.compareAndSet(false, true)) {
            mi.c("MyTarget initialization");
            final jg jgVar = new jg(applicationContext);
            c = jgVar;
            o0.b(new Runnable() { // from class: com.my.target.common.MyTargetManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MyTargetManager.a(jg.this, applicationContext);
                }
            });
        }
    }

    public static boolean isSdkInitialized() {
        return a.get();
    }

    public static void setDebugMode(boolean z) {
        mi.a = z;
        if (z) {
            mi.a("Debug mode enabled");
        }
    }

    public static void setDiskCacheMaxSize(long j) {
        z3.a(j);
    }

    public static void setDiskCacheTtl(long j) {
        z3.b(j);
    }

    public static void setSdkConfig(@NonNull MyTargetConfig myTargetConfig) {
        b = myTargetConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(jg jgVar, Context context) {
        kc a2 = mc.a(jgVar);
        hc a3 = hc.a(a2);
        d = a3;
        wh.a(jgVar, a2, a3);
        l2.a(jgVar, a3);
        kg.b();
        x3.a(context);
        db.a(jgVar);
        u4.b().a(b, context);
        rc.a(context);
        o0.b();
        v3 a4 = u4.b().a();
        if (a4 == null) {
            ub.a("undefined", "undefined", "undefined", "undefined");
        } else {
            ub.a(a4.a, a4.d, a4.e, a4.f);
        }
    }
}
