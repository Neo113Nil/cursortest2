package com.inmobi.media;

import android.content.Context;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.core.content.ContextCompat;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.iab.omid.library.inmobi.Omid;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import okhttp3.OkHttpClient;
import okio.BufferedSource;

/* renamed from: com.inmobi.media.xl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4479xl {
    public static boolean b;
    public static final C4479xl a = new C4479xl();
    public static final C4320rl c = new C4320rl();

    public static boolean a() {
        int i;
        try {
            Reflection.getOrCreateKotlinClass(OkHttpClient.class).getSimpleName();
            i = 0;
        } catch (NoClassDefFoundError e) {
            Log.d("xl", "Missing required dependency: com.squareup.okhttp3:okhttp (OkHttpClient)", e);
            i = 1;
        }
        try {
            Reflection.getOrCreateKotlinClass(BufferedSource.class).getSimpleName();
        } catch (NoClassDefFoundError e2) {
            i++;
            Log.d("xl", "Missing required dependency: com.squareup.okio:okio (BufferedSource)", e2);
        }
        try {
            Reflection.getOrCreateKotlinClass(CoroutineScope.class).getSimpleName();
        } catch (NoClassDefFoundError e3) {
            i++;
            Log.d("xl", "Missing required dependency: org.jetbrains.kotlinx:kotlinx-coroutines-android (CoroutineScope)", e3);
        }
        try {
            Reflection.getOrCreateKotlinClass(Dispatchers.class).getSimpleName();
        } catch (NoClassDefFoundError e4) {
            i++;
            Log.d("xl", "Missing required dependency: org.jetbrains.kotlinx:kotlinx-coroutines-android (Dispatchers)", e4);
        }
        try {
            Reflection.getOrCreateKotlinClass(AdvertisingIdClient.class).getSimpleName();
        } catch (NoClassDefFoundError e5) {
            i++;
            Log.d("xl", "Missing required dependency: com.google.android.gms:play-services-ads-identifier (AdvertisingIdClient)", e5);
        }
        try {
            Reflection.getOrCreateKotlinClass(ContextCompat.class).getSimpleName();
        } catch (NoClassDefFoundError e6) {
            i++;
            Log.d("xl", "Missing required dependency: androidx.core:core-ktx (ContextCompat)", e6);
        }
        try {
            Reflection.getOrCreateKotlinClass(EnumEntries.class).getSimpleName();
        } catch (NoClassDefFoundError e7) {
            i++;
            Log.d("xl", "Missing required dependency: Kotlin stdlib (EnumEntries) - upgrade Kotlin version", e7);
        }
        try {
            Reflection.getOrCreateKotlinClass(CustomTabsClient.class).getSimpleName();
        } catch (NoClassDefFoundError e8) {
            i++;
            Log.d("xl", "Missing required dependency: androidx.browser:browser (CustomTabsClient)", e8);
        }
        try {
            Reflection.getOrCreateKotlinClass(Omid.class).getSimpleName();
        } catch (NoClassDefFoundError e9) {
            i++;
            Log.d("xl", "Missing required dependency: com.iab.omid.library.inmobi:omsdk-android (Omid)", e9);
        }
        if (i > 0) {
            Log.d("xl", "Total no missing dependencies = " + i);
        }
        return i > 0;
    }

    public static boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Qa a2 = Pa.a(context, "sdk_version_store");
        Intrinsics.checkNotNullParameter("sdk_version", "key");
        if (a2.a.getString("sdk_version", null) == null) {
            return true;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Qa a3 = Pa.a(context, "sdk_version_store");
        Intrinsics.checkNotNullParameter("sdk_version", "key");
        return !Intrinsics.areEqual(a3.a.getString("sdk_version", null), "11.3.0");
    }

    public static void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (b(context)) {
                AbstractC3884b7.a(context);
                Intrinsics.checkNotNullParameter(context, "context");
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Qa.a(Pa.a(context, "sdk_version_store"), "db_deletion_failed", true);
                Context context2 = AbstractC4002fj.a;
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                AbstractC4002fj.a(applicationContext);
            }
        } catch (Exception e) {
            Log.d("xl", "Error in cleaning cache directory", e);
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(8:11|12|(3:14|(2:17|15)|18)|19|(3:21|(1:23)|24)|25|26|27)(2:30|31))(1:32))(6:36|37|(3:39|(1:41)|42)|43|(1:45)(1:48)|(2:47|35))|33))|51|6|7|(0)(0)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r7.b(r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x002f, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f7, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("xl", "TAG");
        r7.getMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("xl", "TAG");
        com.inmobi.media.Xb.a((byte) 1, "xl", "SDK encountered unexpected error while stopping internal components");
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ContinuationImpl continuationImpl) {
        C4346sl c4346sl;
        int i;
        if (continuationImpl instanceof C4346sl) {
            c4346sl = (C4346sl) continuationImpl;
            int i2 = c4346sl.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4346sl.b = i2 - Integer.MIN_VALUE;
                Object obj = c4346sl.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4346sl.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4425vk.f.set(false);
                    C4358t6 c4358t6 = C4425vk.g;
                    if (c4358t6 != null) {
                        c4358t6.f.set(false);
                        c4358t6.g.set(true);
                        Job job = c4358t6.j;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, null, 1, null);
                        }
                        c4358t6.j = null;
                        c4358t6.i = null;
                    }
                    C4425vk.g = null;
                    C4425vk.j = null;
                    ((Kc) AbstractC4002fj.e.getValue()).a(C4425vk.i);
                    Hh hh = AbstractC4477xj.a;
                    c4346sl.b = 1;
                    Object a2 = N3.a(AbstractC4477xj.a, new C4450wj(null), c4346sl);
                    if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        a2 = Unit.INSTANCE;
                    }
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        C5 c5 = AbstractC3861aa.c;
                        if (c5 != null) {
                            Iterator it = c5.c.iterator();
                            while (it.hasNext()) {
                                ((B5) it.next()).b();
                            }
                        }
                        Xa xa = AbstractC3861aa.d;
                        C4358t6 c4358t62 = xa.b;
                        if (c4358t62 != null) {
                            c4358t62.f.set(false);
                            c4358t62.g.set(true);
                            Job job2 = c4358t62.j;
                            if (job2 != null) {
                                Job.DefaultImpls.cancel$default(job2, null, 1, null);
                            }
                            c4358t62.j = null;
                            c4358t62.i = null;
                        }
                        xa.b = null;
                        ((Kc) AbstractC4002fj.e.getValue()).a(xa.d);
                        AbstractC4135kk.a();
                        Mc.a.compareAndSet(true, false);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AbstractC3869ai.c.set(false);
                ((Kc) AbstractC4002fj.e.getValue()).a(AbstractC3869ai.f);
                AbstractC3869ai.b = null;
                C4131kg c4131kg = C4131kg.a;
                c4346sl.b = 2;
            }
        }
        c4346sl = new C4346sl(continuationImpl);
        Object obj2 = c4346sl.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4346sl.b;
        if (i != 0) {
        }
        AbstractC3869ai.c.set(false);
        ((Kc) AbstractC4002fj.e.getValue()).a(AbstractC3869ai.f);
        AbstractC3869ai.b = null;
        C4131kg c4131kg2 = C4131kg.a;
        c4346sl.b = 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:18|19))(2:20|21))(1:24))(3:31|32|(2:34|23))|25|(1:27)(1:30)|(2:29|23)|21))|37|6|7|(0)(0)|25|(0)(0)|(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a1, code lost:
    
        if (r8.a(r2) == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0030, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("xl", "TAG");
        r8.getMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("xl", "TAG");
        com.inmobi.media.Xb.a((byte) 2, "xl", "SDK encountered unexpected error while starting internal components");
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:12:0x002b, B:13:0x00a4, B:20:0x003b, B:21:0x0073, B:24:0x003f, B:25:0x0057, B:30:0x006e, B:32:0x0046), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        C4373tl c4373tl;
        Object coroutine_suspended;
        int i;
        Object a2;
        if (continuationImpl instanceof C4373tl) {
            c4373tl = (C4373tl) continuationImpl;
            int i2 = c4373tl.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4373tl.c = i2 - Integer.MIN_VALUE;
                Object obj = c4373tl.a;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4373tl.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Yk.a();
                    AppSetIdInfo appSetIdInfo = F1.a;
                    E3.f();
                    c4373tl.c = 1;
                    if (C4425vk.b(c4373tl) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        AbstractC3861aa.c();
                        HashMap hashMap = new HashMap();
                        C4425vk c4425vk = C4425vk.a;
                        C4425vk.b("SessionStarted", hashMap, EnumC4530zk.a);
                        AbstractC4135kk.b();
                        Mc.a();
                        Qf.a(E1.c);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    Io io2 = Io.a;
                    AbstractC3869ai.c.set(true);
                    AbstractC3869ai.b();
                    ((Kc) AbstractC4002fj.e.getValue()).a(new int[]{2, 1, 100, 151, 150, 152}, AbstractC3869ai.f);
                    C4277q4 c4277q4 = AbstractC4015g4.a;
                    AbstractC4015g4.a(TelemetryCategory.TELEMETRY, AbstractC3869ai.d);
                    C4131kg c4131kg = C4131kg.a;
                    c4373tl.c = 3;
                }
                Hh hh = AbstractC4477xj.a;
                c4373tl.c = 2;
                a2 = N3.a(AbstractC4477xj.a, new C4424vj(null), c4373tl);
                if (a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    a2 = Unit.INSTANCE;
                }
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Io io22 = Io.a;
                AbstractC3869ai.c.set(true);
                AbstractC3869ai.b();
                ((Kc) AbstractC4002fj.e.getValue()).a(new int[]{2, 1, 100, 151, 150, 152}, AbstractC3869ai.f);
                C4277q4 c4277q42 = AbstractC4015g4.a;
                AbstractC4015g4.a(TelemetryCategory.TELEMETRY, AbstractC3869ai.d);
                C4131kg c4131kg2 = C4131kg.a;
                c4373tl.c = 3;
            }
        }
        c4373tl = new C4373tl(this, continuationImpl);
        Object obj2 = c4373tl.a;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4373tl.c;
        if (i != 0) {
        }
        Hh hh2 = AbstractC4477xj.a;
        c4373tl.c = 2;
        a2 = N3.a(AbstractC4477xj.a, new C4424vj(null), c4373tl);
        if (a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
        if (a2 == coroutine_suspended) {
        }
        Io io222 = Io.a;
        AbstractC3869ai.c.set(true);
        AbstractC3869ai.b();
        ((Kc) AbstractC4002fj.e.getValue()).a(new int[]{2, 1, 100, 151, 150, 152}, AbstractC3869ai.f);
        C4277q4 c4277q422 = AbstractC4015g4.a;
        AbstractC4015g4.a(TelemetryCategory.TELEMETRY, AbstractC3869ai.d);
        C4131kg c4131kg22 = C4131kg.a;
        c4373tl.c = 3;
    }
}
