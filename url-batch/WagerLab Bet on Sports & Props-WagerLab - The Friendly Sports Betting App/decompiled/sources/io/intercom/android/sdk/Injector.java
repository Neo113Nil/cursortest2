package io.intercom.android.sdk;

import android.app.Application;
import com.google.gson.Gson;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.DeDuper;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.SurveyApi;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.errorreporting.ErrorReporter;
import io.intercom.android.sdk.exceptions.IntercomIntegrationException;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.metrics.MetricsStore;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.tickets.create.data.TicketApi;
import io.intercom.android.sdk.user.UserUpdaterHelper;
import io.intercom.android.sdk.utilities.ActivityFinisher;
import io.intercom.android.sdk.utilities.FirstMessageUtilsKt;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import io.intercom.android.sdk.utilities.SystemSettings;
import io.intercom.android.sdk.utilities.UuidStringProvider;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes8.dex */
public class Injector {
    private static final Twig TWIG = LumberMill.getLogger();
    private static Injector instance;
    private AppIdentityInjector appIdentityInjector;
    private final Application application;
    private IntercomDataLayer dataLayer;
    private ErrorReporter errorReporter;
    private Gson gson;
    private LifecycleTracker lifecycleTracker;
    private MetricTracker metricTracker;
    private MetricsStore metricsStore;
    private OpsMetricTracker opsMetricTracker;
    private OverlayPresenter overlayPresenter;
    private ResetManager resetManager;
    private DeDuper superDeDuper;
    private UnreadConversationsTracker unreadConversationsTracker;
    private final UserIdentity userIdentity;
    private UserUpdater userUpdater;
    private UserUpdaterHelper userUpdaterHelper;
    private final ActivityFinisher activityFinisher = new ActivityFinisher();
    private final Provider<AppConfig> appConfigProvider = new Provider<AppConfig>() { // from class: io.intercom.android.sdk.Injector.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.intercom.android.sdk.Provider
        public AppConfig get() {
            return Injector.this.dataLayer.getConfig().getValue();
        }
    };
    private final Provider<NexusClient> nexusClientProvider = new Provider() { // from class: io.intercom.android.sdk.Injector$$ExternalSyntheticLambda0
        @Override // io.intercom.android.sdk.Provider
        public final Object get() {
            return Injector.this.getNexusClient();
        }
    };
    private final Provider<UserUpdater> userUpdaterProvider = new Provider() { // from class: io.intercom.android.sdk.Injector$$ExternalSyntheticLambda1
        @Override // io.intercom.android.sdk.Provider
        public final Object get() {
            return Injector.this.getUserUpdater();
        }
    };
    private final Provider<Api> apiProvider = new Provider() { // from class: io.intercom.android.sdk.Injector$$ExternalSyntheticLambda2
        @Override // io.intercom.android.sdk.Provider
        public final Object get() {
            return Injector.this.getApi();
        }
    };
    private final Provider<UserIdentity> userIdentityProvider = new Provider() { // from class: io.intercom.android.sdk.Injector$$ExternalSyntheticLambda3
        @Override // io.intercom.android.sdk.Provider
        public final Object get() {
            return Injector.this.getUserIdentity();
        }
    };
    private final Provider<MetricTracker> metricTrackerProvider = new Provider() { // from class: io.intercom.android.sdk.Injector$$ExternalSyntheticLambda4
        @Override // io.intercom.android.sdk.Provider
        public final Object get() {
            return Injector.this.getMetricTracker();
        }
    };
    private final CoroutineScope applicationScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob((Job) null));

    public static synchronized void initIfCachedCredentials(Application application) {
        synchronized (Injector.class) {
            if (instance != null) {
                return;
            }
            AppIdentity loadFromDevice = AppIdentity.loadFromDevice(application);
            String apiKey = loadFromDevice.apiKey();
            String appId = loadFromDevice.appId();
            if (!appId.isEmpty() && !apiKey.isEmpty()) {
                initWithAppCredentials(application, apiKey, appId);
            }
        }
    }

    public static synchronized void initWithAppCredentials(Application application, String str, String str2) {
        synchronized (Injector.class) {
            if (instance != null) {
                return;
            }
            TWIG.internal("Injector", "Initializing");
            Injector injector = new Injector(application, new UserIdentity(application), str, str2, null);
            instance = injector;
            application.registerActivityLifecycleCallbacks(injector.getLifecycleTracker());
        }
    }

    public synchronized void changeWorkspace(String str, String str2) {
        TWIG.internal("Injector", "Switching workspace");
        getResetManager().hardReset();
        this.appIdentityInjector.destroy();
        AppIdentityInjector appIdentityInjector = new AppIdentityInjector(getApplication(), str, str2, null);
        this.appIdentityInjector = appIdentityInjector;
        appIdentityInjector.initializeEvents();
    }

    protected Injector(Application application, UserIdentity userIdentity, String str, String str2, String str3) {
        this.application = application;
        this.userIdentity = userIdentity;
        this.appIdentityInjector = new AppIdentityInjector(application, str, str2, str3);
    }

    public static synchronized boolean isNotInitialised() {
        boolean z;
        synchronized (Injector.class) {
            z = instance == null;
        }
        return z;
    }

    public static synchronized Injector get() {
        Injector injector;
        synchronized (Injector.class) {
            injector = instance;
            if (injector == null) {
                throw new IntercomIntegrationException("Intercom was not initialized correctly, Intercom.initialize() needs to be called in onCreate() in your Application class.");
            }
        }
        return injector;
    }

    public void initializeIntercomEventsListeners() {
        FirstMessageUtilsKt.handleFirstMessageToast(this.applicationScope, LumberMill.getLogger(), this.application, getDataLayer());
        this.appIdentityInjector.initializeEvents();
    }

    public Application getApplication() {
        return this.application;
    }

    public Provider<AppConfig> getAppConfigProvider() {
        return this.appConfigProvider;
    }

    public AppIdentity getAppIdentity() {
        return this.appIdentityInjector.getAppIdentity();
    }

    public UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    public synchronized IntercomDataLayer getDataLayer() {
        if (this.dataLayer == null) {
            this.dataLayer = new IntercomDataLayer(this.application, this.applicationScope);
        }
        return this.dataLayer;
    }

    public synchronized UnreadConversationsTracker getUnreadConversationsTracker() {
        if (this.unreadConversationsTracker == null) {
            this.unreadConversationsTracker = new UnreadConversationsTracker(this.metricTrackerProvider);
        }
        return this.unreadConversationsTracker;
    }

    public synchronized UserUpdaterHelper getUserUpdaterHelper() {
        if (this.userUpdaterHelper == null) {
            this.userUpdaterHelper = new UserUpdaterHelper(this.userUpdaterProvider, getDataLayer(), this.userIdentityProvider);
        }
        return this.userUpdaterHelper;
    }

    public NexusClient getNexusClient() {
        return this.appIdentityInjector.getNexusClient();
    }

    public AblyManager getAblyManager() {
        return this.appIdentityInjector.getAblyManager();
    }

    public synchronized DeDuper getDeDuper() {
        if (this.superDeDuper == null) {
            DeDuper deDuper = new DeDuper(this.appConfigProvider, this.application.getSharedPreferences(PreferenceKeys.INTERCOM_DEDUPER_PREFS, 0));
            this.superDeDuper = deDuper;
            deDuper.readPersistedCachedAttributes();
        }
        return this.superDeDuper;
    }

    public Api getApi() {
        return this.appIdentityInjector.getApi();
    }

    public HelpCenterApi getHelpCenterApi() {
        return this.appIdentityInjector.getHelpCenterApi();
    }

    public SurveyApi getSurveyApi() {
        return this.appIdentityInjector.getSurveyApi();
    }

    public TicketApi getTicketApi() {
        return this.appIdentityInjector.getTicketApi();
    }

    public MessengerApi getMessengerApi() {
        return this.appIdentityInjector.getMessengerApi();
    }

    public ExternalUploadApi getExternalUploadApi() {
        return this.appIdentityInjector.getExternalUploadApi();
    }

    public synchronized Gson getGson() {
        if (this.gson == null) {
            this.gson = new Gson();
        }
        return this.gson;
    }

    public synchronized MetricTracker getMetricTracker() {
        if (this.metricTracker == null) {
            this.metricTracker = new MetricTracker(this.userIdentity, getMetricsStore(), getApplication());
        }
        return this.metricTracker;
    }

    public synchronized MetricsStore getMetricsStore() {
        if (this.metricsStore == null) {
            this.metricsStore = new MetricsStore(getApplication(), getApiProvider(), this.appConfigProvider);
        }
        return this.metricsStore;
    }

    public synchronized OpsMetricTracker getOpsMetricTracker() {
        if (this.opsMetricTracker == null) {
            this.opsMetricTracker = new OpsMetricTracker(getMetricsStore(), getTimeProvider(), UuidStringProvider.SYSTEM);
        }
        return this.opsMetricTracker;
    }

    public synchronized OverlayPresenter getOverlayPresenter() {
        if (this.overlayPresenter == null) {
            this.overlayPresenter = new OverlayPresenter(getApplication(), this.appConfigProvider, getMetricTracker(), this.userIdentity, getDataLayer(), getApiProvider());
        }
        return this.overlayPresenter;
    }

    public TimeProvider getTimeProvider() {
        return TimeProvider.SYSTEM;
    }

    public synchronized LifecycleTracker getLifecycleTracker() {
        if (this.lifecycleTracker == null) {
            this.lifecycleTracker = LifecycleTracker.create(getMetricsStore(), getErrorReporter(), getDeDuper(), getTimeProvider(), getResetManager(), SystemSettings.getTransitionScale(this.application), getApiProvider(), getDataLayer(), getUserUpdaterHelper());
        }
        return this.lifecycleTracker;
    }

    public synchronized ErrorReporter getErrorReporter() {
        if (this.errorReporter == null) {
            this.errorReporter = ErrorReporter.create(this.application, getGson(), this.apiProvider);
        }
        return this.errorReporter;
    }

    public synchronized UserUpdater getUserUpdater() {
        if (this.userUpdater == null) {
            this.userUpdater = new UserUpdater(getApiProvider(), getOpsMetricTracker(), getDataLayer());
        }
        return this.userUpdater;
    }

    public synchronized ResetManager getResetManager() {
        if (this.resetManager == null) {
            this.resetManager = new ResetManager(getApiProvider(), getUserIdentity(), getOverlayPresenter(), this.appConfigProvider, this.application, this.activityFinisher, getDataLayer(), getUnreadConversationsTracker());
        }
        return this.resetManager;
    }

    public Provider<UserUpdater> getUserUpdaterProvider() {
        return this.userUpdaterProvider;
    }

    public Provider<Api> getApiProvider() {
        return this.apiProvider;
    }

    public Provider<NexusClient> getNexusClientProvider() {
        return this.nexusClientProvider;
    }

    public ActivityFinisher getActivityFinisher() {
        return this.activityFinisher;
    }

    static void setSharedInstance(Injector injector) {
        instance = injector;
    }
}
