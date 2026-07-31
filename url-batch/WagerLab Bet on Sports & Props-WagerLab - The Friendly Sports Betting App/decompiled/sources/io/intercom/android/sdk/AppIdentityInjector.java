package io.intercom.android.sdk;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.Gson;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.ApiFactory;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.SurveyApi;
import io.intercom.android.sdk.api.TaggingSocketFactory;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.tickets.create.data.TicketApi;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* compiled from: AppIdentityInjector.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0001\u0018\u0000 _2\u00020\u0001:\u0001_B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u001f\u0010\u001cR\u001b\u0010!\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020&8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0018\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0018\u001a\u0004\b,\u0010-R\u001b\u0010/\u001a\u00020+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0018\u001a\u0004\b0\u0010-R\u001b\u00102\u001a\u00020+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0018\u001a\u0004\b3\u0010-R\u001b\u00105\u001a\u0002068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0018\u001a\u0004\b7\u00108R\u001b\u0010:\u001a\u00020;8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u0018\u001a\u0004\b<\u0010=R\u001b\u0010?\u001a\u00020@8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u0018\u001a\u0004\bA\u0010BR\u001b\u0010D\u001a\u00020E8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u0010\u0018\u001a\u0004\bF\u0010GR\u001b\u0010I\u001a\u00020J8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010\u0018\u001a\u0004\bK\u0010LR\u001b\u0010N\u001a\u00020O8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bR\u0010\u0018\u001a\u0004\bP\u0010QR\u001b\u0010S\u001a\u00020T8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bW\u0010\u0018\u001a\u0004\bU\u0010VR\u001b\u0010X\u001a\u00020Y8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010\u0018\u001a\u0004\bZ\u0010[R\u000e\u0010]\u001a\u00020^X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Lio/intercom/android/sdk/AppIdentityInjector;", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "apiKey", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "customHostname", "<init>", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "appIdentityScope", "Lkotlinx/coroutines/CoroutineScope;", "initializeEvents", "", "destroy", "injector", "Lio/intercom/android/sdk/Injector;", "getInjector", "()Lio/intercom/android/sdk/Injector;", "appIdentity", "Lio/intercom/android/sdk/identity/AppIdentity;", "getAppIdentity", "()Lio/intercom/android/sdk/identity/AppIdentity;", "appIdentity$delegate", "Lkotlin/Lazy;", "configurableHttpClient", "Lokhttp3/OkHttpClient;", "getConfigurableHttpClient", "()Lokhttp3/OkHttpClient;", "configurableHttpClient$delegate", "httpClientWithoutHeaders", "getHttpClientWithoutHeaders", "httpClientWithoutHeaders$delegate", "hostname", "getHostname", "()Ljava/lang/String;", "hostname$delegate", "gsonWithAdapters", "Lcom/google/gson/Gson;", "getGsonWithAdapters", "()Lcom/google/gson/Gson;", "gsonWithAdapters$delegate", "kotlinXRetrofit", "Lretrofit2/Retrofit;", "getKotlinXRetrofit", "()Lretrofit2/Retrofit;", "kotlinXRetrofit$delegate", "legacyRetrofit", "getLegacyRetrofit", "legacyRetrofit$delegate", "retrofitWithoutHeaders", "getRetrofitWithoutHeaders", "retrofitWithoutHeaders$delegate", MetricTracker.Place.API, "Lio/intercom/android/sdk/api/Api;", "getApi", "()Lio/intercom/android/sdk/api/Api;", "api$delegate", "helpCenterApi", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "getHelpCenterApi", "()Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "helpCenterApi$delegate", "surveyApi", "Lio/intercom/android/sdk/api/SurveyApi;", "getSurveyApi", "()Lio/intercom/android/sdk/api/SurveyApi;", "surveyApi$delegate", "ticketApi", "Lio/intercom/android/sdk/tickets/create/data/TicketApi;", "getTicketApi", "()Lio/intercom/android/sdk/tickets/create/data/TicketApi;", "ticketApi$delegate", "externalUploadApi", "Lio/intercom/android/sdk/api/ExternalUploadApi;", "getExternalUploadApi", "()Lio/intercom/android/sdk/api/ExternalUploadApi;", "externalUploadApi$delegate", "messengerApi", "Lio/intercom/android/sdk/api/MessengerApi;", "getMessengerApi", "()Lio/intercom/android/sdk/api/MessengerApi;", "messengerApi$delegate", "nexusClient", "Lio/intercom/android/nexus/NexusClient;", "getNexusClient", "()Lio/intercom/android/nexus/NexusClient;", "nexusClient$delegate", "ablyManager", "Lio/intercom/android/sdk/AblyManager;", "getAblyManager", "()Lio/intercom/android/sdk/AblyManager;", "ablyManager$delegate", "nexusDebouncePeriod", "", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AppIdentityInjector {
    private static final int NEXUS_TRAFFIC_TAG = 63987;

    /* renamed from: ablyManager$delegate, reason: from kotlin metadata */
    private final Lazy ablyManager;

    /* renamed from: api$delegate, reason: from kotlin metadata */
    private final Lazy api;

    /* renamed from: appIdentity$delegate, reason: from kotlin metadata */
    private final Lazy appIdentity;
    private final CoroutineScope appIdentityScope;

    /* renamed from: configurableHttpClient$delegate, reason: from kotlin metadata */
    private final Lazy configurableHttpClient;

    /* renamed from: externalUploadApi$delegate, reason: from kotlin metadata */
    private final Lazy externalUploadApi;

    /* renamed from: gsonWithAdapters$delegate, reason: from kotlin metadata */
    private final Lazy gsonWithAdapters;

    /* renamed from: helpCenterApi$delegate, reason: from kotlin metadata */
    private final Lazy helpCenterApi;

    /* renamed from: hostname$delegate, reason: from kotlin metadata */
    private final Lazy hostname;

    /* renamed from: httpClientWithoutHeaders$delegate, reason: from kotlin metadata */
    private final Lazy httpClientWithoutHeaders;

    /* renamed from: kotlinXRetrofit$delegate, reason: from kotlin metadata */
    private final Lazy kotlinXRetrofit;

    /* renamed from: legacyRetrofit$delegate, reason: from kotlin metadata */
    private final Lazy legacyRetrofit;

    /* renamed from: messengerApi$delegate, reason: from kotlin metadata */
    private final Lazy messengerApi;

    /* renamed from: nexusClient$delegate, reason: from kotlin metadata */
    private final Lazy nexusClient;
    private final long nexusDebouncePeriod;

    /* renamed from: retrofitWithoutHeaders$delegate, reason: from kotlin metadata */
    private final Lazy retrofitWithoutHeaders;

    /* renamed from: surveyApi$delegate, reason: from kotlin metadata */
    private final Lazy surveyApi;

    /* renamed from: ticketApi$delegate, reason: from kotlin metadata */
    private final Lazy ticketApi;
    public static final int $stable = 8;

    public AppIdentityInjector(final Application application, final String apiKey, final String appId, final String str) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.appIdentityScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
        this.appIdentity = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.AppIdentityInjector$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AppIdentity appIdentity_delegate$lambda$0;
                appIdentity_delegate$lambda$0 = AppIdentityInjector.appIdentity_delegate$lambda$0(apiKey, appId, application);
                return appIdentity_delegate$lambda$0;
            }
        });
        this.configurableHttpClient = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.AppIdentityInjector$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OkHttpClient configurableHttpClient_delegate$lambda$1;
                configurableHttpClient_delegate$lambda$1 = AppIdentityInjector.configurableHttpClient_delegate$lambda$1(application, this);
                return configurableHttpClient_delegate$lambda$1;
            }
        });
        this.httpClientWithoutHeaders = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.AppIdentityInjector$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OkHttpClient httpClientWithoutHeaders_delegate$lambda$2;
                httpClientWithoutHeaders_delegate$lambda$2 = AppIdentityInjector.httpClientWithoutHeaders_delegate$lambda$2(application);
                return httpClientWithoutHeaders_delegate$lambda$2;
            }
        });
        this.hostname = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.AppIdentityInjector$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String hostname_delegate$lambda$3;
                hostname_delegate$lambda$3 = AppIdentityInjector.hostname_delegate$lambda$3(str, this, application);
                return hostname_delegate$lambda$3;
            }
        });
        this.gsonWithAdapters = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.AppIdentityInjector$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Gson gsonWithAdapters_delegate$lambda$4;
                gsonWithAdapters_delegate$lambda$4 = AppIdentityInjector.gsonWithAdapters_delegate$lambda$4();
                return gsonWithAdapters_delegate$lambda$4;
            }
        });
        this.kotlinXRetrofit = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.AppIdentityInjector$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Retrofit kotlinXRetrofit_delegate$lambda$5;
                kotlinXRetrofit_delegate$lambda$5 = AppIdentityInjector.kotlinXRetrofit_delegate$lambda$5(AppIdentityInjector.this);
                return kotlinXRetrofit_delegate$lambda$5;
            }
        });
        this.legacyRetrofit = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.AppIdentityInjector$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Retrofit legacyRetrofit_delegate$lambda$6;
                legacyRetrofit_delegate$lambda$6 = AppIdentityInjector.legacyRetrofit_delegate$lambda$6(AppIdentityInjector.this);
                return legacyRetrofit_delegate$lambda$6;
            }
        });
        this.retrofitWithoutHeaders = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.AppIdentityInjector$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Retrofit retrofitWithoutHeaders_delegate$lambda$7;
                retrofitWithoutHeaders_delegate$lambda$7 = AppIdentityInjector.retrofitWithoutHeaders_delegate$lambda$7(AppIdentityInjector.this);
                return retrofitWithoutHeaders_delegate$lambda$7;
            }
        });
        this.api = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.AppIdentityInjector$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Api api_delegate$lambda$8;
                api_delegate$lambda$8 = AppIdentityInjector.api_delegate$lambda$8(application, this);
                return api_delegate$lambda$8;
            }
        });
        this.helpCenterApi = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.AppIdentityInjector$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HelpCenterApi helpCenterApi_delegate$lambda$9;
                helpCenterApi_delegate$lambda$9 = AppIdentityInjector.helpCenterApi_delegate$lambda$9(AppIdentityInjector.this);
                return helpCenterApi_delegate$lambda$9;
            }
        });
        this.surveyApi = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.AppIdentityInjector$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SurveyApi surveyApi_delegate$lambda$10;
                surveyApi_delegate$lambda$10 = AppIdentityInjector.surveyApi_delegate$lambda$10(AppIdentityInjector.this);
                return surveyApi_delegate$lambda$10;
            }
        });
        this.ticketApi = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.AppIdentityInjector$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TicketApi ticketApi_delegate$lambda$11;
                ticketApi_delegate$lambda$11 = AppIdentityInjector.ticketApi_delegate$lambda$11(AppIdentityInjector.this);
                return ticketApi_delegate$lambda$11;
            }
        });
        this.externalUploadApi = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.AppIdentityInjector$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExternalUploadApi externalUploadApi_delegate$lambda$12;
                externalUploadApi_delegate$lambda$12 = AppIdentityInjector.externalUploadApi_delegate$lambda$12(AppIdentityInjector.this);
                return externalUploadApi_delegate$lambda$12;
            }
        });
        this.messengerApi = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.AppIdentityInjector$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MessengerApi messengerApi_delegate$lambda$13;
                messengerApi_delegate$lambda$13 = AppIdentityInjector.messengerApi_delegate$lambda$13(AppIdentityInjector.this);
                return messengerApi_delegate$lambda$13;
            }
        });
        this.nexusClient = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.AppIdentityInjector$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NexusWrapper nexusClient_delegate$lambda$14;
                nexusClient_delegate$lambda$14 = AppIdentityInjector.nexusClient_delegate$lambda$14(AppIdentityInjector.this);
                return nexusClient_delegate$lambda$14;
            }
        });
        this.ablyManager = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.AppIdentityInjector$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AblyManager ablyManager_delegate$lambda$15;
                ablyManager_delegate$lambda$15 = AppIdentityInjector.ablyManager_delegate$lambda$15(AppIdentityInjector.this);
                return ablyManager_delegate$lambda$15;
            }
        });
        this.nexusDebouncePeriod = TimeUnit.SECONDS.toMillis(1L);
    }

    public /* synthetic */ AppIdentityInjector(Application application, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, str, str2, (i & 8) != 0 ? null : str3);
    }

    public final void initializeEvents() {
        BuildersKt__Builders_commonKt.launch$default(this.appIdentityScope, null, null, new AppIdentityInjector$initializeEvents$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(this.appIdentityScope, null, null, new AppIdentityInjector$initializeEvents$2(this, null), 3, null);
    }

    public final void destroy() {
        CoroutineScopeKt.cancel$default(this.appIdentityScope, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Injector getInjector() {
        Injector injector = Injector.get();
        Intrinsics.checkNotNullExpressionValue(injector, "get(...)");
        return injector;
    }

    public final AppIdentity getAppIdentity() {
        Object value = this.appIdentity.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AppIdentity) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppIdentity appIdentity_delegate$lambda$0(String apiKey, String appId, Application application) {
        Intrinsics.checkNotNullParameter(apiKey, "$apiKey");
        Intrinsics.checkNotNullParameter(appId, "$appId");
        Intrinsics.checkNotNullParameter(application, "$application");
        AppIdentity create = AppIdentity.create(apiKey, appId);
        create.persist(application);
        return create;
    }

    public final OkHttpClient getConfigurableHttpClient() {
        return (OkHttpClient) this.configurableHttpClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient configurableHttpClient_delegate$lambda$1(Application application, AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(application, "$application");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AppIdentity appIdentity = this$0.getAppIdentity();
        UserIdentity userIdentity = this$0.getInjector().getUserIdentity();
        Intrinsics.checkNotNullExpressionValue(userIdentity, "getUserIdentity(...)");
        return ApiFactory.INSTANCE.createConfigurableHttpClient(application, appIdentity, userIdentity);
    }

    public final OkHttpClient getHttpClientWithoutHeaders() {
        return (OkHttpClient) this.httpClientWithoutHeaders.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient httpClientWithoutHeaders_delegate$lambda$2(Application application) {
        Intrinsics.checkNotNullParameter(application, "$application");
        return ApiFactory.INSTANCE.createHttpClientWithoutHeaders(application);
    }

    public final String getHostname() {
        return (String) this.hostname.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String hostname_delegate$lambda$3(String str, AppIdentityInjector this$0, Application application) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(application, "$application");
        return str == null ? ApiFactory.INSTANCE.getServerUrl(this$0.getAppIdentity(), application) : str;
    }

    public final Gson getGsonWithAdapters() {
        return (Gson) this.gsonWithAdapters.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson gsonWithAdapters_delegate$lambda$4() {
        return ApiFactory.INSTANCE.createGsonWithAdapters();
    }

    public final Retrofit getKotlinXRetrofit() {
        return (Retrofit) this.kotlinXRetrofit.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Retrofit kotlinXRetrofit_delegate$lambda$5(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ApiFactory.INSTANCE.createKotlinXRetrofit(this$0.getHostname(), this$0.getConfigurableHttpClient());
    }

    public final Retrofit getLegacyRetrofit() {
        return (Retrofit) this.legacyRetrofit.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Retrofit legacyRetrofit_delegate$lambda$6(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ApiFactory.INSTANCE.createLegacyRetrofit(this$0.getHostname(), this$0.getConfigurableHttpClient(), this$0.getGsonWithAdapters());
    }

    public final Retrofit getRetrofitWithoutHeaders() {
        return (Retrofit) this.retrofitWithoutHeaders.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Retrofit retrofitWithoutHeaders_delegate$lambda$7(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ApiFactory apiFactory = ApiFactory.INSTANCE;
        String hostname = this$0.getHostname();
        OkHttpClient httpClientWithoutHeaders = this$0.getHttpClientWithoutHeaders();
        Gson gson = this$0.getInjector().getGson();
        Intrinsics.checkNotNullExpressionValue(gson, "getGson(...)");
        return apiFactory.createLegacyRetrofit(hostname, httpClientWithoutHeaders, gson);
    }

    public final Api getApi() {
        return (Api) this.api.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Api api_delegate$lambda$8(Application application, AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(application, "$application");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AppIdentity appIdentity = this$0.getAppIdentity();
        UserIdentity userIdentity = this$0.getInjector().getUserIdentity();
        Intrinsics.checkNotNullExpressionValue(userIdentity, "getUserIdentity(...)");
        Provider<AppConfig> appConfigProvider = this$0.getInjector().getAppConfigProvider();
        Intrinsics.checkNotNullExpressionValue(appConfigProvider, "getAppConfigProvider(...)");
        OpsMetricTracker opsMetricTracker = this$0.getInjector().getOpsMetricTracker();
        Intrinsics.checkNotNullExpressionValue(opsMetricTracker, "getOpsMetricTracker(...)");
        IntercomDataLayer dataLayer = this$0.getInjector().getDataLayer();
        Intrinsics.checkNotNullExpressionValue(dataLayer, "getDataLayer(...)");
        UnreadConversationsTracker unreadConversationsTracker = this$0.getInjector().getUnreadConversationsTracker();
        Intrinsics.checkNotNullExpressionValue(unreadConversationsTracker, "getUnreadConversationsTracker(...)");
        Api createApi = ApiFactory.INSTANCE.createApi(application, appIdentity, userIdentity, appConfigProvider, opsMetricTracker, dataLayer, unreadConversationsTracker, this$0.getConfigurableHttpClient(), this$0.getMessengerApi());
        createApi.updateMaxRequests();
        return createApi;
    }

    public final HelpCenterApi getHelpCenterApi() {
        return (HelpCenterApi) this.helpCenterApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HelpCenterApi helpCenterApi_delegate$lambda$9(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ApiFactory.INSTANCE.createHelpCenterApi(this$0.getKotlinXRetrofit());
    }

    public final SurveyApi getSurveyApi() {
        return (SurveyApi) this.surveyApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurveyApi surveyApi_delegate$lambda$10(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ApiFactory.INSTANCE.createSurveyApi(this$0.getLegacyRetrofit());
    }

    public final TicketApi getTicketApi() {
        return (TicketApi) this.ticketApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TicketApi ticketApi_delegate$lambda$11(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ApiFactory.INSTANCE.createTicketApi(this$0.getLegacyRetrofit());
    }

    public final ExternalUploadApi getExternalUploadApi() {
        return (ExternalUploadApi) this.externalUploadApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExternalUploadApi externalUploadApi_delegate$lambda$12(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ApiFactory.INSTANCE.getUploadApi(this$0.getRetrofitWithoutHeaders());
    }

    public final MessengerApi getMessengerApi() {
        return (MessengerApi) this.messengerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessengerApi messengerApi_delegate$lambda$13(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ApiFactory.INSTANCE.createMessengerApi(this$0.getLegacyRetrofit());
    }

    public final NexusClient getNexusClient() {
        return (NexusClient) this.nexusClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NexusWrapper nexusClient_delegate$lambda$14(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OkHttpClient build = NexusClient.defaultOkHttpClientBuilder().socketFactory(new TaggingSocketFactory(SocketFactory.getDefault(), NEXUS_TRAFFIC_TAG)).build();
        Twig nexusTwig = LumberMill.getNexusTwig();
        Intrinsics.checkNotNullExpressionValue(nexusTwig, "getNexusTwig(...)");
        Api api = this$0.getApi();
        long j = this$0.nexusDebouncePeriod;
        IntercomDataLayer dataLayer = this$0.getInjector().getDataLayer();
        Intrinsics.checkNotNullExpressionValue(dataLayer, "getDataLayer(...)");
        return new NexusWrapper(nexusTwig, build, api, j, dataLayer);
    }

    public final AblyManager getAblyManager() {
        return (AblyManager) this.ablyManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AblyManager ablyManager_delegate$lambda$15(AppIdentityInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Twig ablyTwig = LumberMill.getAblyTwig();
        Intrinsics.checkNotNullExpressionValue(ablyTwig, "getAblyTwig(...)");
        return new AblyManager(ablyTwig, this$0.getMessengerApi());
    }
}
