package com.google.firebase.database.android;

import android.annotation.SuppressLint;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.database.core.TokenProvider;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import o.C1932t2;
import o.C1998u2;
import o.C2064v2;
import o.ExecutorC0729al;
import o.MU;
import o.OU;
import o.RunnableC1866s2;
import o.p30;

/* loaded from: classes.dex */
public class AndroidAppCheckTokenProvider implements TokenProvider {
    private final Deferred<InteropAppCheckTokenProvider> deferredAppCheckProvider;
    private final AtomicReference<InteropAppCheckTokenProvider> internalAppCheck = new AtomicReference<>();

    public AndroidAppCheckTokenProvider(Deferred<InteropAppCheckTokenProvider> deferred) {
        this.deferredAppCheckProvider = deferred;
        deferred.whenAvailable(new C1932t2(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addTokenChangeListener$3(TokenProvider.TokenChangeListener tokenChangeListener, AppCheckTokenResult appCheckTokenResult) {
        tokenChangeListener.onTokenChange(appCheckTokenResult.getToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addTokenChangeListener$4(ExecutorService executorService, TokenProvider.TokenChangeListener tokenChangeListener, AppCheckTokenResult appCheckTokenResult) {
        executorService.execute(new RunnableC1866s2(tokenChangeListener, 0, appCheckTokenResult));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addTokenChangeListener$5(ExecutorService executorService, TokenProvider.TokenChangeListener tokenChangeListener, Provider provider) {
        ((InteropAppCheckTokenProvider) provider.get()).addAppCheckTokenListener(new C1998u2(executorService, tokenChangeListener, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getToken$1(TokenProvider.GetTokenCompletionListener getTokenCompletionListener, AppCheckTokenResult appCheckTokenResult) {
        getTokenCompletionListener.onSuccess(appCheckTokenResult.getToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getToken$2(TokenProvider.GetTokenCompletionListener getTokenCompletionListener, Exception exc) {
        getTokenCompletionListener.onError(exc.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Provider provider) {
        this.internalAppCheck.set((InteropAppCheckTokenProvider) provider.get());
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public void addTokenChangeListener(ExecutorService executorService, TokenProvider.TokenChangeListener tokenChangeListener) {
        this.deferredAppCheckProvider.whenAvailable(new C1998u2(executorService, tokenChangeListener, 1));
    }

    @Override // com.google.firebase.database.core.TokenProvider
    @SuppressLint({"TaskMainThread"})
    public void getToken(boolean z, TokenProvider.GetTokenCompletionListener getTokenCompletionListener) {
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = this.internalAppCheck.get();
        if (interopAppCheckTokenProvider == null) {
            getTokenCompletionListener.onSuccess(null);
            return;
        }
        MU token = interopAppCheckTokenProvider.getToken(z);
        C2064v2 c2064v2 = new C2064v2(getTokenCompletionListener, 0);
        p30 p30Var = (p30) token;
        p30Var.getClass();
        ExecutorC0729al executorC0729al = OU.a;
        p30Var.c(executorC0729al, c2064v2);
        p30Var.b(executorC0729al, new C2064v2(getTokenCompletionListener, 1));
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public void removeTokenChangeListener(TokenProvider.TokenChangeListener tokenChangeListener) {
    }
}
