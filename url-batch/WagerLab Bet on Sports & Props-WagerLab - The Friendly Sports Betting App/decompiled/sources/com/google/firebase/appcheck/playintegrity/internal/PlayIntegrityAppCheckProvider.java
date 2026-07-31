package com.google.firebase.appcheck.playintegrity.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckProvider;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.internal.AppCheckTokenResponse;
import com.google.firebase.appcheck.internal.DefaultAppCheckToken;
import com.google.firebase.appcheck.internal.NetworkClient;
import com.google.firebase.appcheck.internal.RetryManager;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public class PlayIntegrityAppCheckProvider implements AppCheckProvider {
    private static final String UTF_8 = "UTF-8";
    private final Executor blockingExecutor;
    private final IntegrityManager integrityManager;
    private final Executor liteExecutor;
    private final NetworkClient networkClient;
    private final String projectNumber;
    private final RetryManager retryManager;

    public PlayIntegrityAppCheckProvider(FirebaseApp firebaseApp, Executor executor, Executor executor2) {
        this(firebaseApp.getOptions().getGcmSenderId(), IntegrityManagerFactory.create(firebaseApp.getApplicationContext()), new NetworkClient(firebaseApp), executor, executor2, new RetryManager());
    }

    PlayIntegrityAppCheckProvider(String str, IntegrityManager integrityManager, NetworkClient networkClient, Executor executor, Executor executor2, RetryManager retryManager) {
        this.projectNumber = str;
        this.integrityManager = integrityManager;
        this.networkClient = networkClient;
        this.liteExecutor = executor;
        this.blockingExecutor = executor2;
        this.retryManager = retryManager;
    }

    @Override // com.google.firebase.appcheck.AppCheckProvider
    public Task<AppCheckToken> getToken() {
        return getPlayIntegrityAttestation().onSuccessTask(this.liteExecutor, new SuccessContinuation() { // from class: com.google.firebase.appcheck.playintegrity.internal.PlayIntegrityAppCheckProvider$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return PlayIntegrityAppCheckProvider.this.m10202x6a8841c6((IntegrityTokenResponse) obj);
            }
        }).onSuccessTask(this.liteExecutor, new SuccessContinuation() { // from class: com.google.firebase.appcheck.playintegrity.internal.PlayIntegrityAppCheckProvider$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task forResult;
                forResult = Tasks.forResult(DefaultAppCheckToken.constructFromAppCheckTokenResponse((AppCheckTokenResponse) obj));
                return forResult;
            }
        });
    }

    /* renamed from: lambda$getToken$1$com-google-firebase-appcheck-playintegrity-internal-PlayIntegrityAppCheckProvider, reason: not valid java name */
    /* synthetic */ Task m10202x6a8841c6(IntegrityTokenResponse integrityTokenResponse) throws Exception {
        final ExchangePlayIntegrityTokenRequest exchangePlayIntegrityTokenRequest = new ExchangePlayIntegrityTokenRequest(integrityTokenResponse.token());
        return Tasks.call(this.blockingExecutor, new Callable() { // from class: com.google.firebase.appcheck.playintegrity.internal.PlayIntegrityAppCheckProvider$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return PlayIntegrityAppCheckProvider.this.m10201xc30c6805(exchangePlayIntegrityTokenRequest);
            }
        });
    }

    /* renamed from: lambda$getToken$0$com-google-firebase-appcheck-playintegrity-internal-PlayIntegrityAppCheckProvider, reason: not valid java name */
    /* synthetic */ AppCheckTokenResponse m10201xc30c6805(ExchangePlayIntegrityTokenRequest exchangePlayIntegrityTokenRequest) throws Exception {
        return this.networkClient.exchangeAttestationForAppCheckToken(exchangePlayIntegrityTokenRequest.toJsonString().getBytes("UTF-8"), 3, this.retryManager);
    }

    private Task<IntegrityTokenResponse> getPlayIntegrityAttestation() {
        final GeneratePlayIntegrityChallengeRequest generatePlayIntegrityChallengeRequest = new GeneratePlayIntegrityChallengeRequest();
        return Tasks.call(this.blockingExecutor, new Callable() { // from class: com.google.firebase.appcheck.playintegrity.internal.PlayIntegrityAppCheckProvider$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return PlayIntegrityAppCheckProvider.this.m10199x2bbbb578(generatePlayIntegrityChallengeRequest);
            }
        }).onSuccessTask(this.liteExecutor, new SuccessContinuation() { // from class: com.google.firebase.appcheck.playintegrity.internal.PlayIntegrityAppCheckProvider$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return PlayIntegrityAppCheckProvider.this.m10200xd3378f39((GeneratePlayIntegrityChallengeResponse) obj);
            }
        });
    }

    /* renamed from: lambda$getPlayIntegrityAttestation$3$com-google-firebase-appcheck-playintegrity-internal-PlayIntegrityAppCheckProvider, reason: not valid java name */
    /* synthetic */ GeneratePlayIntegrityChallengeResponse m10199x2bbbb578(GeneratePlayIntegrityChallengeRequest generatePlayIntegrityChallengeRequest) throws Exception {
        return GeneratePlayIntegrityChallengeResponse.fromJsonString(this.networkClient.generatePlayIntegrityChallenge(generatePlayIntegrityChallengeRequest.toJsonString().getBytes("UTF-8"), this.retryManager));
    }

    /* renamed from: lambda$getPlayIntegrityAttestation$4$com-google-firebase-appcheck-playintegrity-internal-PlayIntegrityAppCheckProvider, reason: not valid java name */
    /* synthetic */ Task m10200xd3378f39(GeneratePlayIntegrityChallengeResponse generatePlayIntegrityChallengeResponse) throws Exception {
        return this.integrityManager.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(this.projectNumber)).setNonce(generatePlayIntegrityChallengeResponse.getChallenge()).build());
    }
}
