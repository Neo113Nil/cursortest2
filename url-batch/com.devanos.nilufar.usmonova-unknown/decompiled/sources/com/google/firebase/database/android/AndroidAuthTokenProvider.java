package com.google.firebase.database.android;

import android.annotation.SuppressLint;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.database.core.TokenProvider;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.InternalTokenResult;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;
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
public class AndroidAuthTokenProvider implements TokenProvider {
    private final Deferred<InternalAuthProvider> deferredAuthProvider;
    private final AtomicReference<InternalAuthProvider> internalAuth = new AtomicReference<>();

    public AndroidAuthTokenProvider(Deferred<InternalAuthProvider> deferred) {
        this.deferredAuthProvider = deferred;
        deferred.whenAvailable(new C1932t2(1, this));
    }

    private static boolean isUnauthenticatedUsage(Exception exc) {
        return (exc instanceof FirebaseApiNotAvailableException) || (exc instanceof FirebaseNoSignedInUserException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addTokenChangeListener$3(TokenProvider.TokenChangeListener tokenChangeListener, InternalTokenResult internalTokenResult) {
        tokenChangeListener.onTokenChange(internalTokenResult.getToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addTokenChangeListener$4(ExecutorService executorService, TokenProvider.TokenChangeListener tokenChangeListener, InternalTokenResult internalTokenResult) {
        executorService.execute(new RunnableC1866s2(tokenChangeListener, 1, internalTokenResult));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addTokenChangeListener$5(ExecutorService executorService, TokenProvider.TokenChangeListener tokenChangeListener, Provider provider) {
        ((InternalAuthProvider) provider.get()).addIdTokenListener(new C1998u2(executorService, tokenChangeListener, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getToken$1(TokenProvider.GetTokenCompletionListener getTokenCompletionListener, GetTokenResult getTokenResult) {
        getTokenCompletionListener.onSuccess(getTokenResult.getToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getToken$2(TokenProvider.GetTokenCompletionListener getTokenCompletionListener, Exception exc) {
        if (isUnauthenticatedUsage(exc)) {
            getTokenCompletionListener.onSuccess(null);
        } else {
            getTokenCompletionListener.onError(exc.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Provider provider) {
        this.internalAuth.set((InternalAuthProvider) provider.get());
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public void addTokenChangeListener(ExecutorService executorService, TokenProvider.TokenChangeListener tokenChangeListener) {
        this.deferredAuthProvider.whenAvailable(new C1998u2(executorService, tokenChangeListener, 2));
    }

    @Override // com.google.firebase.database.core.TokenProvider
    @SuppressLint({"TaskMainThread"})
    public void getToken(boolean z, TokenProvider.GetTokenCompletionListener getTokenCompletionListener) {
        InternalAuthProvider internalAuthProvider = this.internalAuth.get();
        if (internalAuthProvider == null) {
            getTokenCompletionListener.onSuccess(null);
            return;
        }
        MU accessToken = internalAuthProvider.getAccessToken(z);
        C2064v2 c2064v2 = new C2064v2(getTokenCompletionListener, 2);
        p30 p30Var = (p30) accessToken;
        p30Var.getClass();
        ExecutorC0729al executorC0729al = OU.a;
        p30Var.c(executorC0729al, c2064v2);
        p30Var.b(executorC0729al, new C2064v2(getTokenCompletionListener, 3));
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public void removeTokenChangeListener(TokenProvider.TokenChangeListener tokenChangeListener) {
    }
}
