package com.ogury.ad.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.iab.omid.library.ogury.Omid;
import com.ogury.ad.async.Completable;
import com.ogury.ad.async.Schedulers;
import com.ogury.core.internal.GppConsentConstants;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import com.ogury.core.internal.datastore.datastore.OnDataStoreChangeListener;
import com.ogury.core.internal.network.NetworkClient;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes.dex */
public final class n9 {
    public final Completable.Companion a;
    public final tb b;
    public final me c;
    public final g5 d;
    public final t9 e;
    public final wg f;
    public final sh g;
    public int h;
    public Throwable i;
    public final List j;
    public SharedPreferences.OnSharedPreferenceChangeListener k;
    public OnDataStoreChangeListener l;

    public n9() {
        Completable.Companion completableFactory = Completable.INSTANCE;
        tb profigDaoFactory = ke.d;
        me profigHandlerFactory = ne.g;
        g5 measurementsEventsLogger = g5.a;
        t9 omidSdk = t9.a;
        wg sdkIntegrationChecker = wg.a;
        sh topActivityMonitor = sh.a;
        Intrinsics.checkNotNullParameter(completableFactory, "completableFactory");
        Intrinsics.checkNotNullParameter(profigDaoFactory, "profigDaoFactory");
        Intrinsics.checkNotNullParameter(profigHandlerFactory, "profigHandlerFactory");
        Intrinsics.checkNotNullParameter(measurementsEventsLogger, "measurementsEventsLogger");
        Intrinsics.checkNotNullParameter(omidSdk, "omidSdk");
        Intrinsics.checkNotNullParameter(sdkIntegrationChecker, "sdkIntegrationChecker");
        Intrinsics.checkNotNullParameter(topActivityMonitor, "topActivityMonitor");
        this.a = completableFactory;
        this.b = profigDaoFactory;
        this.c = profigHandlerFactory;
        this.d = measurementsEventsLogger;
        this.e = omidSdk;
        this.f = sdkIntegrationChecker;
        this.g = topActivityMonitor;
        this.h = 1;
        List synchronizedList = Collections.synchronizedList(new LinkedList());
        Intrinsics.checkNotNullExpressionValue(synchronizedList, "synchronizedList(...)");
        this.j = synchronizedList;
    }

    public final void a(pf pfVar, Context context) {
        if (pfVar.f.a) {
            this.e.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                Omid.activate(context.getApplicationContext());
            } catch (IllegalArgumentException e) {
                r9.a(e);
            }
            Logger logger = Logger.INSTANCE;
            LogTag logTag = LogTag.INTERNAL;
            SourceTag sourceTag = SourceTag.ADS;
            this.e.getClass();
            logger.d(logTag, sourceTag, "OMID is active. Version: " + Omid.getVersion());
        }
    }

    public final void a(c0 adsConfig) {
        Intrinsics.checkNotNullParameter(adsConfig, "adsConfig");
        IntegrationLogger.d(LogTag.INTERNAL, SourceTag.ADS, "[Setup] Starting...");
        Context context = adsConfig.a;
        ke a = this.b.a(context);
        Product product = adsConfig.c;
        if (product != null) {
            Intrinsics.checkNotNullParameter(product, "product");
            BuildersKt.runBlocking(Dispatchers.getIO(), new ce(a, product, null));
        }
        try {
            this.g.a(context);
        } catch (Throwable th) {
            oh.a(th);
        }
        this.f.getClass();
        wg.a(context);
        int i = this.h;
        if (i != 1 && i != 4) {
            IntegrationLogger.d(LogTag.INTERNAL, SourceTag.ADS, "[Setup] Already setting up or set up");
            return;
        }
        this.h = 3;
        String str = adsConfig.b;
        if (str != null && str.length() != 0) {
            this.a.fromAction(new i9(this, a, adsConfig, context)).doOnError(new j9(this, adsConfig)).subscribe(new k9(this, adsConfig, context));
            return;
        }
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        IntegrationLogger.e(logTag, sourceTag, "[Setup] Failed to set up (invalid asset key: \"" + adsConfig.b + "\")");
        Logger.INSTANCE.e(logTag, sourceTag, "OgurySdk.init() error", new IllegalArgumentException("The api key is null empty. Please provide a valid api key"));
        this.h = 1;
        adsConfig.d.onFailed(null);
    }

    public final void a(Context context, ke keVar) {
        if (this.h == 2 || rb.a(context)) {
            Context context2 = context.getApplicationContext();
            String a = keVar.a();
            if (!Intrinsics.areEqual(a, "")) {
                me meVar = this.c;
                Intrinsics.checkNotNull(context2);
                final ne a2 = meVar.a(context2);
                a2.a(false);
                this.k = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.ogury.ad.internal.n9$$ExternalSyntheticLambda1
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                        n9.a(n9.this, a2, sharedPreferences, str);
                    }
                };
                this.l = new OnDataStoreChangeListener() { // from class: com.ogury.ad.internal.n9$$ExternalSyntheticLambda2
                    @Override // com.ogury.core.internal.datastore.datastore.OnDataStoreChangeListener
                    public final void onDataStoreChanged(String str) {
                        n9.a(n9.this, a2, str);
                    }
                };
                Intrinsics.checkNotNullParameter(context, "context");
                SharedPreferences.OnSharedPreferenceChangeListener onConsentDataChanged = this.k;
                OnDataStoreChangeListener onOguryPrivacyDataChanged = null;
                if (onConsentDataChanged == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("onConsentDataChanged");
                    onConsentDataChanged = null;
                }
                OnDataStoreChangeListener onDataStoreChangeListener = this.l;
                if (onDataStoreChangeListener == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("onPrivacyDataChanged");
                } else {
                    onOguryPrivacyDataChanged = onDataStoreChangeListener;
                }
                Intrinsics.checkNotNullParameter(onConsentDataChanged, "onConsentDataChanged");
                Intrinsics.checkNotNullParameter(onOguryPrivacyDataChanged, "onOguryPrivacyDataChanged");
                InternalCore.setOnPrivacyDataChangeListener(context, onConsentDataChanged, onOguryPrivacyDataChanged);
                this.d.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                if (g5.b == null) {
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter(context2, "context");
                    if (z8.c == null) {
                        int millis = (int) TimeUnit.SECONDS.toMillis(le.b.b.a);
                        Context context3 = context2.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getApplicationContext(...)");
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Context applicationContext = context3.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        z8.c = new z8(new m3(applicationContext), new NetworkClient(millis, millis * 5));
                    }
                    z8 z8Var = z8.c;
                    Intrinsics.checkNotNull(z8Var);
                    g5.b = new n5(z8Var, new e2(context2), context2);
                    return;
                }
                return;
            }
            IntegrationLogger.e(LogTag.INTERNAL, SourceTag.ADS, "[Setup] Failed to set up (invalid asset key: \"" + a + "\")");
            IllegalStateException illegalStateException = new IllegalStateException("There is no api key. Please call OgurySdk.init(context, apiKey) before trying to load or display an ad");
            Log.e("Ogury", "Init Error", illegalStateException);
            throw illegalStateException;
        }
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        IntegrationLogger.e(logTag, sourceTag, "[Setup] The app is not in main application process");
        Logger.INSTANCE.d(logTag, sourceTag, "the app is not in main application process");
        throw new IllegalStateException("The app is not in main application process");
    }

    public static final void a(final n9 this$0, final ne profig, SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(profig, "$profig");
        if (CollectionsKt.contains(GppConsentConstants.INSTANCE.getCONSENT_KEYS(), str)) {
            IntegrationLogger.d(LogTag.INTERNAL, SourceTag.ADS, "[Setup] Consent data changed : " + str);
            Schedulers.INSTANCE.background().scheduleJob(new Runnable() { // from class: com.ogury.ad.internal.n9$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    n9.a(n9.this, profig);
                }
            });
        }
    }

    public static final void a(n9 this$0, ne profig) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(profig, "$profig");
        this$0.getClass();
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        IntegrationLogger.d(logTag, sourceTag, "[Setup] Current configuration is obsolete");
        profig.getClass();
        IntegrationLogger.d(logTag, sourceTag, "[Setup] Configuration has just been marked as obsolete");
        BuildersKt.runBlocking(Dispatchers.getIO(), new od(profig.b, null));
    }

    public static final void a(n9 this$0, ne profig, String key) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(profig, "$profig");
        Intrinsics.checkNotNullParameter(key, "key");
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        IntegrationLogger.d(logTag, sourceTag, "[Setup] Privacy data changed : " + key);
        this$0.getClass();
        IntegrationLogger.d(logTag, sourceTag, "[Setup] Current configuration is obsolete");
        profig.getClass();
        IntegrationLogger.d(logTag, sourceTag, "[Setup] Configuration has just been marked as obsolete");
        BuildersKt.runBlocking(Dispatchers.getIO(), new od(profig.b, null));
    }
}
