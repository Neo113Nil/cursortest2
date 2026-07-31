package com.unity3d.ads.core.data.datasource;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.InstallReferrerKt;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidInstallReferrerDataSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1", f = "AndroidInstallReferrerDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ CancellableContinuation $continuation;
    final /* synthetic */ InstallReferrerClient $referrerClient;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidInstallReferrerDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1(InstallReferrerClient installReferrerClient, AndroidInstallReferrerDataSource androidInstallReferrerDataSource, CancellableContinuation cancellableContinuation, Continuation continuation) {
        super(2, continuation);
        this.$referrerClient = installReferrerClient;
        this.this$0 = androidInstallReferrerDataSource;
        this.$continuation = cancellableContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1 androidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1 = new AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1(this.$referrerClient, this.this$0, this.$continuation, continuation);
        androidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1.L$0 = obj;
        return androidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m8023constructorimpl;
        SendDiagnosticEvent sendDiagnosticEvent;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            try {
                ReferrerDetails installReferrer = this.$referrerClient.getInstallReferrer();
                CancellableContinuation cancellableContinuation = this.$continuation;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    InstallReferrerKt.Dsl.Companion companion2 = InstallReferrerKt.Dsl.INSTANCE;
                    InitializationRequestOuterClass.InstallReferrer.Builder newBuilder = InitializationRequestOuterClass.InstallReferrer.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                    InstallReferrerKt.Dsl _create = companion2._create(newBuilder);
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        _create.setUrl(installReferrer2);
                    }
                    _create.setClickTime(installReferrer.getReferrerClickTimestampSeconds());
                    _create.setInstallTime(installReferrer.getInstallBeginTimestampServerSeconds());
                    _create.setInstantExperienceLunch(installReferrer.getGooglePlayInstantParam());
                    cancellableContinuation.resumeWith(Result.m8023constructorimpl(_create._build()));
                    m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m8029isSuccessimpl(m8023constructorimpl)) {
                    sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "install_referral_fetch_completed", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 126, (Object) null);
                }
            } finally {
                try {
                    this.$referrerClient.endConnection();
                } catch (Throwable unused) {
                }
            }
        } catch (RemoteException unused2) {
            this.this$0.onError(this.$continuation);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused3) {
            this.this$0.onError(this.$continuation);
        }
        try {
            this.$referrerClient.endConnection();
        } catch (Throwable unused4) {
        }
        return Unit.INSTANCE;
    }
}
