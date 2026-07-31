package io.invertase.firebase.appcheck;

import android.util.Log;
import com.amazon.a.a.o.b;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckProvider;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.debug.DebugAppCheckProviderFactory;
import com.google.firebase.appcheck.debug.InternalDebugSecretProvider;
import com.google.firebase.appcheck.debug.internal.DebugAppCheckProvider;
import com.google.firebase.appcheck.playintegrity.PlayIntegrityAppCheckProviderFactory;
import com.google.firebase.inject.Provider;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes8.dex */
public class ReactNativeFirebaseAppCheckProvider implements AppCheckProvider {
    private static final String LOGTAG = "RNFBAppCheck";
    AppCheckProvider delegateProvider;

    @Override // com.google.firebase.appcheck.AppCheckProvider
    public Task<AppCheckToken> getToken() {
        Log.d(LOGTAG, "Provider::getToken - delegating to native provider");
        return this.delegateProvider.getToken();
    }

    public void configure(String str, String str2, final String str3) {
        Log.d(LOGTAG, "Provider::configure with appName/providerName/debugToken: " + str + "/" + str2 + "/" + (str3 != null ? "(not shown)" : "null"));
        try {
            FirebaseApp firebaseApp = FirebaseApp.getInstance(str);
            if (b.ar.equals(str2)) {
                if (str3 != null) {
                    ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                    this.delegateProvider = new DebugAppCheckProvider(firebaseApp, new Provider<InternalDebugSecretProvider>() { // from class: io.invertase.firebase.appcheck.ReactNativeFirebaseAppCheckProvider.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.google.firebase.inject.Provider
                        public InternalDebugSecretProvider get() {
                            return new InternalDebugSecretProvider() { // from class: io.invertase.firebase.appcheck.ReactNativeFirebaseAppCheckProvider.1.1
                                @Override // com.google.firebase.appcheck.debug.InternalDebugSecretProvider
                                public String getDebugSecret() {
                                    return str3;
                                }
                            };
                        }
                    }, newCachedThreadPool, newCachedThreadPool, newCachedThreadPool);
                } else {
                    this.delegateProvider = DebugAppCheckProviderFactory.getInstance().create(firebaseApp);
                }
            }
            if ("playIntegrity".equals(str2)) {
                this.delegateProvider = PlayIntegrityAppCheckProviderFactory.getInstance().create(firebaseApp);
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
