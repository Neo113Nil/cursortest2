package o;

import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import com.google.firebase.auth.internal.IdTokenListener;
import com.google.firebase.database.android.AndroidAppCheckTokenProvider;
import com.google.firebase.database.android.AndroidAuthTokenProvider;
import com.google.firebase.database.core.TokenProvider;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.InternalTokenResult;
import java.util.concurrent.ExecutorService;

/* renamed from: o.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1998u2 implements AppCheckTokenListener, Deferred.DeferredHandler, IdTokenListener {
    public final /* synthetic */ int h;
    public final /* synthetic */ ExecutorService i;
    public final /* synthetic */ TokenProvider.TokenChangeListener j;

    public /* synthetic */ C1998u2(ExecutorService executorService, TokenProvider.TokenChangeListener tokenChangeListener, int i) {
        this.h = i;
        this.i = executorService;
        this.j = tokenChangeListener;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        switch (this.h) {
            case 1:
                AndroidAppCheckTokenProvider.lambda$addTokenChangeListener$5(this.i, this.j, provider);
                break;
            default:
                AndroidAuthTokenProvider.lambda$addTokenChangeListener$5(this.i, this.j, provider);
                break;
        }
    }

    @Override // com.google.firebase.appcheck.interop.AppCheckTokenListener
    public void onAppCheckTokenChanged(AppCheckTokenResult appCheckTokenResult) {
        AndroidAppCheckTokenProvider.lambda$addTokenChangeListener$4(this.i, this.j, appCheckTokenResult);
    }

    @Override // com.google.firebase.auth.internal.IdTokenListener
    public void onIdTokenChanged(InternalTokenResult internalTokenResult) {
        AndroidAuthTokenProvider.lambda$addTokenChangeListener$4(this.i, this.j, internalTokenResult);
    }
}
