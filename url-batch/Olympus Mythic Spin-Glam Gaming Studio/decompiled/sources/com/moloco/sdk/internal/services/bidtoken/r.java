package com.moloco.sdk.internal.services.bidtoken;

import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.login.LoginLogger;
import com.moloco.sdk.BidToken;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.I;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes14.dex */
public final class r implements q {
    public static final int k = 8;

    @NotNull
    public final I b;

    @NotNull
    public final o c;

    @NotNull
    public final com.moloco.sdk.internal.services.encryption.a d;

    @NotNull
    public final com.moloco.sdk.internal.services.bidtoken.providers.l e;

    @NotNull
    public final String f;

    @NotNull
    public String g;

    @NotNull
    public String h;

    @NotNull
    public f i;

    @NotNull
    public final Mutex j;

    @DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.ClientBidTokenServiceImpl", f = "ClientBidTokenService.kt", l = {191}, m = "bidToken-BWLJW6A")
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            Object a = r.this.a(null, null, null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public r(@NotNull I timeProviderService, @NotNull o clientBidTokenBuilder, @NotNull com.moloco.sdk.internal.services.encryption.a encryptionService, @NotNull com.moloco.sdk.internal.services.bidtoken.providers.l signalProvider) {
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        Intrinsics.checkNotNullParameter(clientBidTokenBuilder, "clientBidTokenBuilder");
        Intrinsics.checkNotNullParameter(encryptionService, "encryptionService");
        Intrinsics.checkNotNullParameter(signalProvider, "signalProvider");
        this.b = timeProviderService;
        this.c = clientBidTokenBuilder;
        this.d = encryptionService;
        this.e = signalProvider;
        this.f = "ClientBidTokenServiceImpl";
        this.g = "";
        this.h = "";
        this.i = e.a();
        this.j = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:11:0x0062, B:13:0x0068, B:14:0x00b5, B:16:0x00bd, B:20:0x00d2, B:23:0x009b), top: B:10:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #0 {all -> 0x0099, blocks: (B:11:0x0062, B:13:0x0068, B:14:0x00b5, B:16:0x00bd, B:20:0x00d2, B:23:0x009b), top: B:10:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d2 A[Catch: all -> 0x0099, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0099, blocks: (B:11:0x0062, B:13:0x0068, B:14:0x00b5, B:16:0x00bd, B:20:0x00d2, B:23:0x009b), top: B:10:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:11:0x0062, B:13:0x0068, B:14:0x00b5, B:16:0x00bd, B:20:0x00d2, B:23:0x009b), top: B:10:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.moloco.sdk.internal.services.bidtoken.q
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull MetricsRecorder metricsRecorder, @NotNull String str, @NotNull f fVar, @NotNull Continuation continuation) {
        a aVar;
        int i;
        Mutex mutex;
        r rVar;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i2 = aVar.h;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.h = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.f;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = aVar.h;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.j;
                        aVar.a = this;
                        aVar.b = metricsRecorder;
                        aVar.c = str;
                        aVar.d = fVar;
                        aVar.e = mutex;
                        aVar.h = 1;
                        if (mutex.lock(null, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        rVar = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = (Mutex) aVar.e;
                        fVar = (f) aVar.d;
                        str = (String) aVar.c;
                        MetricsRecorder metricsRecorder2 = (MetricsRecorder) aVar.b;
                        rVar = (r) aVar.a;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        metricsRecorder = metricsRecorder2;
                    }
                    if (rVar.a(str, fVar)) {
                        metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.z.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "true"));
                    } else {
                        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, rVar.f, "Bid token needs refresh, fetching new bid token", false, 4, null);
                        rVar.g = str;
                        rVar.i = fVar;
                        metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.z.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "false"));
                        rVar.h = rVar.a(str, metricsRecorder);
                    }
                    if (rVar.h.length() != 0) {
                        Result.Companion companion = Result.INSTANCE;
                        Object m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(new Exception("Client bid token is empty")));
                        mutex.unlock(null);
                        return m8023constructorimpl;
                    }
                    Result.Companion companion2 = Result.INSTANCE;
                    Object m8023constructorimpl2 = Result.m8023constructorimpl(rVar.h);
                    mutex.unlock(null);
                    return m8023constructorimpl2;
                }
            }
            if (rVar.a(str, fVar)) {
            }
            if (rVar.h.length() != 0) {
            }
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.h;
        if (i != 0) {
        }
    }

    public final boolean a(f fVar) {
        f fVar2 = this.i;
        this.i = fVar;
        boolean areEqual = Intrinsics.areEqual(fVar2, fVar);
        boolean z = !areEqual;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f, !areEqual ? "config updated" : "config didn't change", false, 4, null);
        return z;
    }

    public final boolean a(String str, f fVar) {
        if (!Intrinsics.areEqual(this.g, str)) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f, "rp changed, needs refresh", false, 4, null);
            return true;
        }
        if (a(fVar)) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f, "config changed, needs refresh", false, 4, null);
            return true;
        }
        if (this.h.length() == 0) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f, "cached bidToken is empty, needs refresh", false, 4, null);
            return true;
        }
        if (this.e.b()) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f, "signal provider updated, needs refresh", false, 4, null);
            return true;
        }
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f, "Bid token doesn't need refresh", false, 4, null);
        return false;
    }

    public final String a(String str, MetricsRecorder metricsRecorder) {
        Exception exc;
        String str2;
        if (str.length() == 0) {
            metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.y.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), "empty_public_key"));
            return "";
        }
        TimerEvent startTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.o.c());
        try {
            long a2 = this.b.a();
            str2 = "rsa";
            try {
                byte[] a3 = this.d.a(str);
                String str3 = "update_signal_state";
                try {
                    this.e.a();
                    str3 = "provide_signal";
                    BidToken.ClientBidTokenComponents a4 = this.c.a(this.e.d(), this.i);
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    MolocoLogger.debugBuildLog$default(molocoLogger, this.f, "BidToken Component: " + a4, false, 4, null);
                    byte[] encode = Base64.encode(a4.toByteArray(), 0);
                    try {
                        com.moloco.sdk.internal.services.encryption.a aVar = this.d;
                        Intrinsics.checkNotNull(encode);
                        byte[] encode2 = Base64.encode(aVar.a(encode), 0);
                        o oVar = this.c;
                        Intrinsics.checkNotNull(encode2);
                        String encodeToString = Base64.encodeToString(oVar.a(encode2, a3), 0);
                        com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                        metricsRecorder.recordTimerEvent(startTimerEvent.withTag(dVar.c(), "success"));
                        metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.y.c()).withTag(dVar.c(), "success"));
                        MolocoLogger.info$default(molocoLogger, this.f, "Client bid token build time: " + (this.b.a() - a2) + " ms", null, false, 12, null);
                        return "v2:" + encodeToString;
                    } catch (Exception e) {
                        exc = e;
                        str2 = "aes";
                        String simpleName = exc.getClass().getSimpleName();
                        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                        MolocoLogger.warn$default(molocoLogger2, this.f, "Client bid token build failed: " + simpleName, exc, false, 8, null);
                        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.y.c());
                        com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.d;
                        CountEvent withTag = countEvent.withTag(dVar2.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                        com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.b;
                        CountEvent withTag2 = withTag.withTag(dVar3.c(), simpleName);
                        if (str2.length() > 0) {
                            withTag2.withTag(com.moloco.sdk.internal.client_metrics_data.d.g.c(), str2);
                        }
                        MolocoLogger.debugBuildLog$default(molocoLogger2, this.f, "Recording metric failure: " + withTag2.getName() + ", tags: " + CollectionsKt.joinToString$default(withTag2.getEventTags(), StringUtils.COMMA, null, null, 0, null, null, 62, null), false, 4, null);
                        metricsRecorder.recordCountEvent(withTag2);
                        metricsRecorder.recordTimerEvent(startTimerEvent.withTag(dVar2.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar3.c(), simpleName));
                        return "";
                    }
                } catch (Exception e2) {
                    exc = e2;
                    str2 = str3;
                }
            } catch (Exception e3) {
                exc = e3;
            }
        } catch (Exception e4) {
            exc = e4;
            str2 = "";
        }
    }
}
