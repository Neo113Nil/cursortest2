package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidInstallReferrerDataSource.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096B¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidInstallReferrerDataSource;", "Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "appContext", "Landroid/content/Context;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lkotlinx/coroutines/CoroutineScope;)V", "invoke", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onError", "", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AndroidInstallReferrerDataSource implements InstallReferrerDataSource {
    private static final long TIME_OUT_MS = 500;

    @NotNull
    private final Context appContext;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidInstallReferrerDataSource(@NotNull Context appContext, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.appContext = appContext;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.scope = scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.unity3d.ads.core.data.datasource.InstallReferrerDataSource
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull Continuation continuation) {
        AndroidInstallReferrerDataSource$invoke$1 androidInstallReferrerDataSource$invoke$1;
        int i;
        try {
            if (continuation instanceof AndroidInstallReferrerDataSource$invoke$1) {
                androidInstallReferrerDataSource$invoke$1 = (AndroidInstallReferrerDataSource$invoke$1) continuation;
                int i2 = androidInstallReferrerDataSource$invoke$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    androidInstallReferrerDataSource$invoke$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = androidInstallReferrerDataSource$invoke$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = androidInstallReferrerDataSource$invoke$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Duration.Companion companion = Duration.Companion;
                        long duration = DurationKt.toDuration(500L, DurationUnit.MILLISECONDS);
                        AndroidInstallReferrerDataSource$invoke$2 androidInstallReferrerDataSource$invoke$2 = new AndroidInstallReferrerDataSource$invoke$2(this, null);
                        androidInstallReferrerDataSource$invoke$1.label = 1;
                        obj = TimeoutKt.m8205withTimeoutKLykuaI(duration, androidInstallReferrerDataSource$invoke$2, androidInstallReferrerDataSource$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (InitializationRequestOuterClass.InstallReferrer) obj;
                }
            }
            if (i != 0) {
            }
            return (InitializationRequestOuterClass.InstallReferrer) obj;
        } catch (TimeoutCancellationException unused) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "install_referral_fetch_timed_out", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 126, (Object) null);
            return null;
        }
        androidInstallReferrerDataSource$invoke$1 = new AndroidInstallReferrerDataSource$invoke$1(this, continuation);
        Object obj2 = androidInstallReferrerDataSource$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidInstallReferrerDataSource$invoke$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(CancellableContinuation continuation) {
        Object m8023constructorimpl;
        try {
            continuation.resumeWith(Result.m8023constructorimpl(null));
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8029isSuccessimpl(m8023constructorimpl)) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "install_referral_fetch_failed", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 126, (Object) null);
        }
    }
}
