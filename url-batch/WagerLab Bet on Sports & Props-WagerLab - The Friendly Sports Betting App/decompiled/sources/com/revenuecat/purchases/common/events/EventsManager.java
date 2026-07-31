package com.revenuecat.purchases.common.events;

import androidx.core.app.NotificationCompat;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.ads.events.AdEvent;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.events.BackendStoredEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterImpressionEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterSurveyOptionChosenEvent;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import com.revenuecat.purchases.utils.EventsFileHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.modules.PolymorphicModuleBuilder;
import kotlinx.serialization.modules.SerializersModuleBuilder;

/* compiled from: EventsManager.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B\u0099\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012Z\u0010\r\u001aV\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u00124\u00122\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00120\u0013\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\u0002\u0010\u001aJ\b\u0010 \u001a\u00020\u0012H\u0002J \u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0010\u0010$\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u0010J\b\u0010%\u001a\u00020\u0012H\u0002J\u0018\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(2\u0006\u0010\"\u001a\u00020\u0010H\u0002J\u0010\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060*H\u0002J\u0010\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0*H\u0002J\u000e\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020.R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\b\u001bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00188B@BX\u0082\u000e¢\u0006\u0002\n\u0000Rb\u0010\r\u001aV\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u00124\u00122\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00120\u0013\u0012\u0004\u0012\u00020\u00120\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsManager;", "", "appSessionID", "Ljava/util/UUID;", "legacyEventsFileHelper", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "fileHelper", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "identityManager", "Lcom/revenuecat/purchases/identity/IdentityManager;", "eventsDispatcher", "Lcom/revenuecat/purchases/common/Dispatcher;", "postEvents", "Lkotlin/Function4;", "Lcom/revenuecat/purchases/common/events/EventsRequest;", "Lcom/revenuecat/purchases/common/Delay;", "Lkotlin/Function0;", "", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/PurchasesError;", "Lkotlin/ParameterName;", "name", "error", "", "shouldMarkAsSynced", "(Ljava/util/UUID;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/Dispatcher;Lkotlin/jvm/functions/Function4;)V", "appSessionID$1", "flushInProgress", "Ljava/util/concurrent/atomic/AtomicBoolean;", "<set-?>", "legacyFlushTriggered", "checkFileSizeAndClearIfNeeded", "enqueue", "delay", "command", "flushEvents", "flushLegacyEvents", "flushNextBatch", "batchNumber", "", "getLegacyPaywallsStoredEvents", "", "getStoredEvents", "track", NotificationCompat.CATEGORY_EVENT, "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventsManager {
    public static final String AD_EVENTS_FILE_PATH = "RevenueCat/event_store/ad_event_store.jsonl";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String EVENTS_FILE_PATH_NEW = "RevenueCat/event_store/event_store.jsonl";
    public static final int EVENTS_TO_CLEAR_ON_LIMIT = 50;
    public static final double FILE_SIZE_LIMIT_KB = 2048.0d;
    private static final int FLUSH_COUNT = 50;
    private static final int MAX_FLUSH_BATCHES = 10;
    private static final String PAYWALL_EVENTS_FILE_PATH = "RevenueCat/paywall_event_store/paywall_event_store.jsonl";
    private static final UUID appSessionID;
    private static final Json json;

    /* renamed from: appSessionID$1, reason: from kotlin metadata */
    private final UUID appSessionID;
    private final Dispatcher eventsDispatcher;
    private final EventsFileHelper<BackendStoredEvent> fileHelper;
    private AtomicBoolean flushInProgress;
    private final IdentityManager identityManager;
    private final EventsFileHelper<PaywallStoredEvent> legacyEventsFileHelper;
    private boolean legacyFlushTriggered;
    private final Function4<EventsRequest, Delay, Function0<Unit>, Function2<? super PurchasesError, ? super Boolean, Unit>, Unit> postEvents;

    /* JADX WARN: Multi-variable type inference failed */
    public EventsManager(UUID appSessionID2, EventsFileHelper<PaywallStoredEvent> eventsFileHelper, EventsFileHelper<BackendStoredEvent> fileHelper, IdentityManager identityManager, Dispatcher eventsDispatcher, Function4<? super EventsRequest, ? super Delay, ? super Function0<Unit>, ? super Function2<? super PurchasesError, ? super Boolean, Unit>, Unit> postEvents) {
        Intrinsics.checkNotNullParameter(appSessionID2, "appSessionID");
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        Intrinsics.checkNotNullParameter(identityManager, "identityManager");
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(postEvents, "postEvents");
        this.appSessionID = appSessionID2;
        this.legacyEventsFileHelper = eventsFileHelper;
        this.fileHelper = fileHelper;
        this.identityManager = identityManager;
        this.eventsDispatcher = eventsDispatcher;
        this.postEvents = postEvents;
        this.flushInProgress = new AtomicBoolean(false);
    }

    public /* synthetic */ EventsManager(UUID uuid, EventsFileHelper eventsFileHelper, EventsFileHelper eventsFileHelper2, IdentityManager identityManager, Dispatcher dispatcher, Function4 function4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? appSessionID : uuid, eventsFileHelper, eventsFileHelper2, identityManager, dispatcher, function4);
    }

    /* compiled from: EventsManager.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00172\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0002¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsManager$Companion;", "", "()V", "AD_EVENTS_FILE_PATH", "", "EVENTS_FILE_PATH_NEW", "EVENTS_TO_CLEAR_ON_LIMIT", "", "getEVENTS_TO_CLEAR_ON_LIMIT$annotations", "FILE_SIZE_LIMIT_KB", "", "getFILE_SIZE_LIMIT_KB$annotations", "FLUSH_COUNT", "MAX_FLUSH_BATCHES", "PAYWALL_EVENTS_FILE_PATH", "appSessionID", "Ljava/util/UUID;", "getAppSessionID$purchases_defaultsBc8Release", "()Ljava/util/UUID;", "json", "Lkotlinx/serialization/json/Json;", "getJson$annotations", "adEvents", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "fileHelper", "Lcom/revenuecat/purchases/common/FileHelper;", "backendEvents", "paywalls", "Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getEVENTS_TO_CLEAR_ON_LIMIT$annotations() {
        }

        public static /* synthetic */ void getFILE_SIZE_LIMIT_KB$annotations() {
        }

        private static /* synthetic */ void getJson$annotations() {
        }

        private Companion() {
        }

        public final UUID getAppSessionID$purchases_defaultsBc8Release() {
            return EventsManager.appSessionID;
        }

        public final EventsFileHelper<BackendStoredEvent> backendEvents(FileHelper fileHelper) {
            Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
            return new EventsFileHelper<>(fileHelper, EventsManager.EVENTS_FILE_PATH_NEW, new Function1<BackendStoredEvent, String>() { // from class: com.revenuecat.purchases.common.events.EventsManager$Companion$backendEvents$1
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(BackendStoredEvent event) {
                    Json json;
                    Intrinsics.checkNotNullParameter(event, "event");
                    json = EventsManager.json;
                    return json.encodeToString(BackendStoredEvent.INSTANCE.serializer(), event);
                }
            }, new Function1<String, BackendStoredEvent>() { // from class: com.revenuecat.purchases.common.events.EventsManager$Companion$backendEvents$2
                @Override // kotlin.jvm.functions.Function1
                public final BackendStoredEvent invoke(String jsonString) {
                    Json json;
                    Intrinsics.checkNotNullParameter(jsonString, "jsonString");
                    json = EventsManager.json;
                    return (BackendStoredEvent) json.decodeFromString(BackendStoredEvent.INSTANCE.serializer(), jsonString);
                }
            });
        }

        public final EventsFileHelper<BackendStoredEvent> adEvents(FileHelper fileHelper) {
            Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
            return new EventsFileHelper<>(fileHelper, EventsManager.AD_EVENTS_FILE_PATH, new Function1<BackendStoredEvent, String>() { // from class: com.revenuecat.purchases.common.events.EventsManager$Companion$adEvents$1
                @Override // kotlin.jvm.functions.Function1
                public final String invoke(BackendStoredEvent event) {
                    Json json;
                    Intrinsics.checkNotNullParameter(event, "event");
                    json = EventsManager.json;
                    return json.encodeToString(BackendStoredEvent.INSTANCE.serializer(), event);
                }
            }, new Function1<String, BackendStoredEvent>() { // from class: com.revenuecat.purchases.common.events.EventsManager$Companion$adEvents$2
                @Override // kotlin.jvm.functions.Function1
                public final BackendStoredEvent invoke(String jsonString) {
                    Json json;
                    Intrinsics.checkNotNullParameter(jsonString, "jsonString");
                    json = EventsManager.json;
                    return (BackendStoredEvent) json.decodeFromString(BackendStoredEvent.INSTANCE.serializer(), jsonString);
                }
            });
        }

        public final EventsFileHelper<PaywallStoredEvent> paywalls(FileHelper fileHelper) {
            Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
            return new EventsFileHelper<>(fileHelper, EventsManager.PAYWALL_EVENTS_FILE_PATH, EventsManager$Companion$paywalls$1.INSTANCE, new EventsManager$Companion$paywalls$2(PaywallStoredEvent.INSTANCE));
        }
    }

    static {
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
        appSessionID = randomUUID;
        json = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.revenuecat.purchases.common.events.EventsManager$Companion$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                invoke2(jsonBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(JsonBuilder Json) {
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
                PolymorphicModuleBuilder polymorphicModuleBuilder = new PolymorphicModuleBuilder(Reflection.getOrCreateKotlinClass(BackendStoredEvent.class), null);
                polymorphicModuleBuilder.subclass(Reflection.getOrCreateKotlinClass(BackendStoredEvent.CustomerCenter.class), BackendStoredEvent.CustomerCenter.INSTANCE.serializer());
                polymorphicModuleBuilder.subclass(Reflection.getOrCreateKotlinClass(BackendStoredEvent.Paywalls.class), BackendStoredEvent.Paywalls.INSTANCE.serializer());
                polymorphicModuleBuilder.subclass(Reflection.getOrCreateKotlinClass(BackendStoredEvent.Ad.class), BackendStoredEvent.Ad.INSTANCE.serializer());
                polymorphicModuleBuilder.buildTo(serializersModuleBuilder);
                Json.setSerializersModule(serializersModuleBuilder.build());
                Json.setExplicitNulls(false);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkFileSizeAndClearIfNeeded() {
        if (this.fileHelper.fileSizeInKB() >= 2048.0d) {
            LogLevel logLevel = LogLevel.WARN;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w("[Purchases] - " + logLevel.name(), "Event store size limit reached. Clearing oldest events to free up space.");
            }
            this.fileHelper.clear(50);
        }
    }

    public final synchronized void track(final FeatureEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        enqueue$default(this, null, new Function0<Unit>() { // from class: com.revenuecat.purchases.common.events.EventsManager$track$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BackendStoredEvent backendStoredEvent;
                IdentityManager identityManager;
                UUID uuid;
                IdentityManager identityManager2;
                UUID uuid2;
                IdentityManager identityManager3;
                UUID uuid3;
                IdentityManager identityManager4;
                UUID uuid4;
                IdentityManager identityManager5;
                UUID uuid5;
                IdentityManager identityManager6;
                UUID uuid6;
                IdentityManager identityManager7;
                UUID uuid7;
                EventsFileHelper eventsFileHelper;
                IdentityManager identityManager8;
                FeatureEvent featureEvent = FeatureEvent.this;
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Tracking event: " + featureEvent);
                }
                FeatureEvent featureEvent2 = FeatureEvent.this;
                if (featureEvent2 instanceof PaywallEvent) {
                    identityManager8 = this.identityManager;
                    backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((PaywallEvent) featureEvent2, identityManager8.getCurrentAppUserID());
                } else if (featureEvent2 instanceof CustomerCenterImpressionEvent) {
                    identityManager7 = this.identityManager;
                    String currentAppUserID = identityManager7.getCurrentAppUserID();
                    uuid7 = this.appSessionID;
                    String uuid8 = uuid7.toString();
                    Intrinsics.checkNotNullExpressionValue(uuid8, "appSessionID.toString()");
                    backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((CustomerCenterImpressionEvent) featureEvent2, currentAppUserID, uuid8);
                } else if (featureEvent2 instanceof CustomerCenterSurveyOptionChosenEvent) {
                    identityManager6 = this.identityManager;
                    String currentAppUserID2 = identityManager6.getCurrentAppUserID();
                    uuid6 = this.appSessionID;
                    String uuid9 = uuid6.toString();
                    Intrinsics.checkNotNullExpressionValue(uuid9, "appSessionID.toString()");
                    backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((CustomerCenterSurveyOptionChosenEvent) featureEvent2, currentAppUserID2, uuid9);
                } else if (featureEvent2 instanceof AdEvent.Displayed) {
                    identityManager5 = this.identityManager;
                    String currentAppUserID3 = identityManager5.getCurrentAppUserID();
                    uuid5 = this.appSessionID;
                    String uuid10 = uuid5.toString();
                    Intrinsics.checkNotNullExpressionValue(uuid10, "appSessionID.toString()");
                    backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.Displayed) featureEvent2, currentAppUserID3, uuid10);
                } else if (featureEvent2 instanceof AdEvent.Open) {
                    identityManager4 = this.identityManager;
                    String currentAppUserID4 = identityManager4.getCurrentAppUserID();
                    uuid4 = this.appSessionID;
                    String uuid11 = uuid4.toString();
                    Intrinsics.checkNotNullExpressionValue(uuid11, "appSessionID.toString()");
                    backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.Open) featureEvent2, currentAppUserID4, uuid11);
                } else if (featureEvent2 instanceof AdEvent.Revenue) {
                    identityManager3 = this.identityManager;
                    String currentAppUserID5 = identityManager3.getCurrentAppUserID();
                    uuid3 = this.appSessionID;
                    String uuid12 = uuid3.toString();
                    Intrinsics.checkNotNullExpressionValue(uuid12, "appSessionID.toString()");
                    backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.Revenue) featureEvent2, currentAppUserID5, uuid12);
                } else if (featureEvent2 instanceof AdEvent.Loaded) {
                    identityManager2 = this.identityManager;
                    String currentAppUserID6 = identityManager2.getCurrentAppUserID();
                    uuid2 = this.appSessionID;
                    String uuid13 = uuid2.toString();
                    Intrinsics.checkNotNullExpressionValue(uuid13, "appSessionID.toString()");
                    backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.Loaded) featureEvent2, currentAppUserID6, uuid13);
                } else if (featureEvent2 instanceof AdEvent.FailedToLoad) {
                    identityManager = this.identityManager;
                    String currentAppUserID7 = identityManager.getCurrentAppUserID();
                    uuid = this.appSessionID;
                    String uuid14 = uuid.toString();
                    Intrinsics.checkNotNullExpressionValue(uuid14, "appSessionID.toString()");
                    backendStoredEvent = BackendStoredEventKt.toBackendStoredEvent((AdEvent.FailedToLoad) featureEvent2, currentAppUserID7, uuid14);
                } else {
                    backendStoredEvent = null;
                }
                if (backendStoredEvent != null) {
                    this.checkFileSizeAndClearIfNeeded();
                    eventsFileHelper = this.fileHelper;
                    eventsFileHelper.appendEvent(backendStoredEvent);
                } else {
                    FeatureEvent featureEvent3 = FeatureEvent.this;
                    LogLevel logLevel2 = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "Backend event not implemented for: " + featureEvent3);
                    }
                }
            }
        }, 1, null);
    }

    public static /* synthetic */ void flushEvents$default(EventsManager eventsManager, Delay delay, int i, Object obj) {
        if ((i & 1) != 0) {
            delay = Delay.DEFAULT;
        }
        eventsManager.flushEvents(delay);
    }

    public final synchronized void flushEvents(final Delay delay) {
        Intrinsics.checkNotNullParameter(delay, "delay");
        enqueue$default(this, null, new Function0<Unit>() { // from class: com.revenuecat.purchases.common.events.EventsManager$flushEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AtomicBoolean atomicBoolean;
                boolean z;
                atomicBoolean = EventsManager.this.flushInProgress;
                if (!atomicBoolean.getAndSet(true)) {
                    EventsManager.this.flushNextBatch(1, delay);
                    z = EventsManager.this.legacyFlushTriggered;
                    if (z) {
                        return;
                    }
                    EventsManager.this.legacyFlushTriggered = true;
                    EventsManager.this.flushLegacyEvents();
                    return;
                }
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Flush already in progress.");
                }
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flushNextBatch(final int batchNumber, final Delay delay) {
        if (batchNumber <= 10) {
            final List<BackendStoredEvent> storedEvents = getStoredEvents();
            List filterNotNull = CollectionsKt.filterNotNull(storedEvents);
            if (filterNotNull.isEmpty()) {
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "No new events to sync.");
                }
                this.flushInProgress.set(false);
                return;
            }
            LogLevel logLevel2 = LogLevel.VERBOSE;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.v("[Purchases] - " + logLevel2.name(), "New event flush (batch " + batchNumber + "): posting " + filterNotNull.size() + " events.");
            }
            Function4<EventsRequest, Delay, Function0<Unit>, Function2<? super PurchasesError, ? super Boolean, Unit>, Unit> function4 = this.postEvents;
            List list = filterNotNull;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(BackendStoredEventKt.toBackendEvent((BackendStoredEvent) it.next()));
            }
            function4.invoke(new EventsRequest(arrayList), delay, new Function0<Unit>() { // from class: com.revenuecat.purchases.common.events.EventsManager$flushNextBatch$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    int i = batchNumber;
                    LogLevel logLevel3 = LogLevel.VERBOSE;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.v("[Purchases] - " + logLevel3.name(), "New event flush (batch " + i + "): success.");
                    }
                    EventsManager eventsManager = EventsManager.this;
                    final EventsManager eventsManager2 = EventsManager.this;
                    final List<BackendStoredEvent> list2 = storedEvents;
                    final int i2 = batchNumber;
                    final Delay delay2 = delay;
                    EventsManager.enqueue$default(eventsManager, null, new Function0<Unit>() { // from class: com.revenuecat.purchases.common.events.EventsManager$flushNextBatch$5.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            EventsFileHelper eventsFileHelper;
                            eventsFileHelper = EventsManager.this.fileHelper;
                            eventsFileHelper.clear(list2.size());
                            EventsManager.this.flushNextBatch(i2 + 1, delay2);
                        }
                    }, 1, null);
                }
            }, new Function2<PurchasesError, Boolean, Unit>() { // from class: com.revenuecat.purchases.common.events.EventsManager$flushNextBatch$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError, Boolean bool) {
                    invoke(purchasesError, bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PurchasesError error, final boolean z) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "New event flush (batch " + batchNumber + ") error: " + error + '.', null);
                    EventsManager eventsManager = EventsManager.this;
                    final EventsManager eventsManager2 = EventsManager.this;
                    final List<BackendStoredEvent> list2 = storedEvents;
                    EventsManager.enqueue$default(eventsManager, null, new Function0<Unit>() { // from class: com.revenuecat.purchases.common.events.EventsManager$flushNextBatch$6.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            AtomicBoolean atomicBoolean;
                            EventsFileHelper eventsFileHelper;
                            if (z) {
                                eventsFileHelper = eventsManager2.fileHelper;
                                eventsFileHelper.clear(list2.size());
                            }
                            atomicBoolean = eventsManager2.flushInProgress;
                            atomicBoolean.set(false);
                        }
                    }, 1, null);
                }
            });
            return;
        }
        LogLevel logLevel3 = LogLevel.VERBOSE;
        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
            currentLogHandler3.v("[Purchases] - " + logLevel3.name(), "Reached maximum number of flush batches (10). Stopping flush.");
        }
        this.flushInProgress.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flushLegacyEvents() {
        final EventsFileHelper<PaywallStoredEvent> eventsFileHelper = this.legacyEventsFileHelper;
        if (eventsFileHelper == null) {
            return;
        }
        enqueue$default(this, null, new Function0<Unit>() { // from class: com.revenuecat.purchases.common.events.EventsManager$flushLegacyEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                final List legacyPaywallsStoredEvents;
                Function4 function4;
                legacyPaywallsStoredEvents = EventsManager.this.getLegacyPaywallsStoredEvents();
                List filterNotNull = CollectionsKt.filterNotNull(legacyPaywallsStoredEvents);
                List list = filterNotNull;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BackendStoredEvent.Paywalls(((PaywallStoredEvent) it.next()).toBackendEvent()));
                }
                ArrayList arrayList2 = arrayList;
                if (filterNotNull.isEmpty()) {
                    LogLevel logLevel = LogLevel.VERBOSE;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.v("[Purchases] - " + logLevel.name(), "No legacy events to sync. Skipping legacy flush.");
                        return;
                    }
                    return;
                }
                LogLevel logLevel2 = LogLevel.VERBOSE;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.v("[Purchases] - " + logLevel2.name(), "Legacy event flush: posting " + arrayList2.size() + " events.");
                }
                function4 = EventsManager.this.postEvents;
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(BackendStoredEventKt.toBackendEvent((BackendStoredEvent.Paywalls) it2.next()));
                }
                EventsRequest eventsRequest = new EventsRequest(arrayList4);
                Delay delay = Delay.LONG;
                final EventsManager eventsManager = EventsManager.this;
                final EventsFileHelper<PaywallStoredEvent> eventsFileHelper2 = eventsFileHelper;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: com.revenuecat.purchases.common.events.EventsManager$flushLegacyEvents$1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        LogLevel logLevel3 = LogLevel.VERBOSE;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.v("[Purchases] - " + logLevel3.name(), "Legacy event flush: success.");
                        }
                        EventsManager eventsManager2 = EventsManager.this;
                        final EventsFileHelper<PaywallStoredEvent> eventsFileHelper3 = eventsFileHelper2;
                        final List<PaywallStoredEvent> list2 = legacyPaywallsStoredEvents;
                        EventsManager.enqueue$default(eventsManager2, null, new Function0<Unit>() { // from class: com.revenuecat.purchases.common.events.EventsManager.flushLegacyEvents.1.4.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                eventsFileHelper3.clear(list2.size());
                            }
                        }, 1, null);
                    }
                };
                final EventsManager eventsManager2 = EventsManager.this;
                final EventsFileHelper<PaywallStoredEvent> eventsFileHelper3 = eventsFileHelper;
                function4.invoke(eventsRequest, delay, function0, new Function2<PurchasesError, Boolean, Unit>() { // from class: com.revenuecat.purchases.common.events.EventsManager$flushLegacyEvents$1.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError, Boolean bool) {
                        invoke(purchasesError, bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PurchasesError error, final boolean z) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Legacy event flush error: " + error + '.', null);
                        EventsManager eventsManager3 = EventsManager.this;
                        final EventsFileHelper<PaywallStoredEvent> eventsFileHelper4 = eventsFileHelper3;
                        final List<PaywallStoredEvent> list2 = legacyPaywallsStoredEvents;
                        EventsManager.enqueue$default(eventsManager3, null, new Function0<Unit>() { // from class: com.revenuecat.purchases.common.events.EventsManager.flushLegacyEvents.1.5.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z) {
                                    eventsFileHelper4.clear(list2.size());
                                }
                            }
                        }, 1, null);
                    }
                });
            }
        }, 1, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.List] */
    private final List<BackendStoredEvent> getStoredEvents() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = CollectionsKt.emptyList();
        this.fileHelper.readFile(new Function1<Sequence<? extends BackendStoredEvent>, Unit>() { // from class: com.revenuecat.purchases.common.events.EventsManager$getStoredEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sequence<? extends BackendStoredEvent> sequence) {
                invoke2(sequence);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [T, java.util.List] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Sequence<? extends BackendStoredEvent> sequence) {
                Intrinsics.checkNotNullParameter(sequence, "sequence");
                objectRef.element = SequencesKt.toList(SequencesKt.take(sequence, 50));
            }
        });
        return (List) objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.List] */
    public final List<PaywallStoredEvent> getLegacyPaywallsStoredEvents() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = CollectionsKt.emptyList();
        EventsFileHelper<PaywallStoredEvent> eventsFileHelper = this.legacyEventsFileHelper;
        if (eventsFileHelper != null) {
            eventsFileHelper.readFile(new Function1<Sequence<? extends PaywallStoredEvent>, Unit>() { // from class: com.revenuecat.purchases.common.events.EventsManager$getLegacyPaywallsStoredEvents$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Sequence<? extends PaywallStoredEvent> sequence) {
                    invoke2((Sequence<PaywallStoredEvent>) sequence);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r3v2, types: [T, java.util.List] */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Sequence<PaywallStoredEvent> sequence) {
                    Intrinsics.checkNotNullParameter(sequence, "sequence");
                    objectRef.element = SequencesKt.toList(SequencesKt.take(sequence, 50));
                }
            });
        }
        return (List) objectRef.element;
    }

    static /* synthetic */ void enqueue$default(EventsManager eventsManager, Delay delay, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            delay = Delay.NONE;
        }
        eventsManager.enqueue(delay, function0);
    }

    private final void enqueue(Delay delay, final Function0<Unit> command) {
        this.eventsDispatcher.enqueue(new Runnable() { // from class: com.revenuecat.purchases.common.events.EventsManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Function0.this.invoke();
            }
        }, delay);
    }
}
