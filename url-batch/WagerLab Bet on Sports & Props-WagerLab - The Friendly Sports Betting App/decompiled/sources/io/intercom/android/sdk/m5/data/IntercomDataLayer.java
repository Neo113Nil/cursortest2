package io.intercom.android.sdk.m5.data;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.facebook.internal.FacebookRequestErrorClassification;
import expo.modules.devlauncher.launcher.manifest.DevLauncherUserInterface;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppConfigKt;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.models.BotIntro;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.CustomizationModel;
import io.intercom.android.sdk.models.DeliveryOption;
import io.intercom.android.sdk.models.HostAppState;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.OverlayState;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import io.intercom.android.sdk.utilities.ActivityUtils;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: IntercomDataLayer.kt */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010C\u001a\u00020D2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010F\u001a\u00020D2\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010G\u001a\u00020D2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u000e\u0010H\u001a\u00020D2\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010I\u001a\u00020D2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010J\u001a\u00020D2\u0006\u0010\"\u001a\u00020!J\u0006\u0010K\u001a\u00020DJ\u000e\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020NJ\u0006\u0010O\u001a\u00020DJ\u000e\u0010P\u001a\u00020D2\u0006\u0010Q\u001a\u00020RJ\u000e\u0010S\u001a\u00020D2\u0006\u0010T\u001a\u00020UJ\u000e\u0010V\u001a\u00020D2\u0006\u0010T\u001a\u00020UJ\u0014\u0010W\u001a\u00020D2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150-J\u000e\u0010X\u001a\u00020D2\u0006\u0010?\u001a\u00020YJ\u0006\u0010Z\u001a\u00020DJ\u000e\u0010[\u001a\u00020D2\u0006\u0010\\\u001a\u00020:J\u000e\u0010]\u001a\u00020D2\u0006\u0010^\u001a\u00020\u0015J\u000e\u0010_\u001a\u00020D2\u0006\u0010`\u001a\u00020\u000bJ\u000e\u0010a\u001a\u00020D2\u0006\u0010b\u001a\u00020\u0015J\u0014\u0010c\u001a\u00020D2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010d\u001a\u00020D2\u0006\u0010e\u001a\u00020fJ\u000e\u0010g\u001a\u00020D2\u0006\u0010e\u001a\u00020fJ\u000e\u0010h\u001a\u00020D2\u0006\u0010e\u001a\u00020fJ\u000e\u0010i\u001a\u00020D2\u0006\u0010j\u001a\u00020kJ\u0006\u0010l\u001a\u00020DJ\u0006\u0010m\u001a\u00020DJ\u0006\u0010n\u001a\u00020DJ\u0006\u0010o\u001a\u00020DJ\u0016\u0010p\u001a\u00020D2\u0006\u0010q\u001a\u000202H\u0086@¢\u0006\u0002\u0010rJ\u0010\u0010s\u001a\u00020D2\u0006\u0010t\u001a\u000208H\u0002J\"\u0010u\u001a\u00020D2\u0006\u0010v\u001a\u00020\u00052\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020D0xJ\"\u0010y\u001a\u00020D2\u0006\u0010v\u001a\u00020\u00052\u0012\u0010z\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020D0xJ(\u0010{\u001a\u00020D2\u0006\u0010v\u001a\u00020\u00052\u0018\u0010|\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150-\u0012\u0004\u0012\u00020D0xJ\u001a\u0010p\u001a\u00020D2\b\b\u0002\u0010v\u001a\u00020\u00052\u0006\u00103\u001a\u000202H\u0007J\"\u0010}\u001a\u00020D2\u0006\u0010v\u001a\u00020\u00052\u0012\u0010~\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020D0xJ\u000f\u0010\u007f\u001a\u00020D2\u0007\u0010\u0080\u0001\u001a\u00020<J\u0007\u0010\u0081\u0001\u001a\u00020DJ\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010<R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000fR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000fR\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u000fR\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u000fR\u001a\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150-0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150-0\r¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u000fR\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020201X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020204¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0014\u00107\u001a\b\u0012\u0004\u0012\u0002080\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020:0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u0002080\r¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u000fR\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020:0\r¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u000f¨\u0006\u0083\u0001"}, d2 = {"Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "", "context", "Landroid/content/Context;", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "_conversations", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lio/intercom/android/sdk/models/Conversation;", "conversations", "Lkotlinx/coroutines/flow/StateFlow;", "getConversations", "()Lkotlinx/coroutines/flow/StateFlow;", "_botIntro", "Lio/intercom/android/sdk/models/BotIntro;", "botIntro", "getBotIntro", "_botBehaviourId", "", "botBehaviourId", "getBotBehaviourId", "_teamPresence", "Lio/intercom/android/sdk/models/TeamPresence;", "teamPresence", "getTeamPresence", "_ticket", "Lio/intercom/android/sdk/models/Ticket;", "ticket", "getTicket", "_surveyData", "Lio/intercom/android/sdk/survey/model/SurveyData;", "surveyData", "getSurveyData", "_overlayState", "Lio/intercom/android/sdk/models/OverlayState;", "overlayState", "getOverlayState", "_hostAppState", "Lio/intercom/android/sdk/models/HostAppState;", "hostAppState", "getHostAppState", "_unreadConversationIds", "", "unreadConversationIds", "getUnreadConversationIds", "_event", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lio/intercom/android/sdk/m5/data/IntercomEvent;", NotificationCompat.CATEGORY_EVENT, "Lkotlinx/coroutines/flow/SharedFlow;", "getEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "_config", "Lio/intercom/android/sdk/identity/AppConfig;", "_pushNotificationsBannerDismissed", "", "openResponse", "Lio/intercom/android/sdk/models/OpenMessengerResponse;", "homeCards", "Lio/intercom/android/sdk/m5/home/data/HomeCards;", "config", "getConfig", "pushNotificationsBannerDismissed", "getPushNotificationsBannerDismissed", "addConversations", "", "newConversations", "updateBotIntro", "updateBotBehaviourId", "updateTeamPresence", "updateTicket", "updateSurveyData", "clearSurveyData", "updateCarousel", "carousel", "Lio/intercom/android/sdk/models/carousel/Carousel;", "clearCarousel", "updateBottomPadding", "bottomPadding", "", "updateLauncherVisibility", "visibility", "Lio/intercom/android/sdk/Intercom$Visibility;", "updateInAppNotificationsVisibility", "updateUnreadConversationIds", "updateConfig", "Lio/intercom/android/sdk/models/Config;", "resetConfig", "updatePushNotificationsBannerDismissed", "dismissed", "markConversationAsRead", "conversationId", "fetchConversationSuccess", "conversation", "markConversationPartAsDismissed", "partId", "updateOverlayConversations", "activityReadyForViewAttachment", "activity", "Landroid/app/Activity;", "activityPaused", "activityStopped", "appEnteredBackground", "timestamp", "", "appEnteredForeground", "updateSessionStarted", "hardReset", "clearUserData", "emitEvent", "intercomEvent", "(Lio/intercom/android/sdk/m5/data/IntercomEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAppConfig", "newAppConfig", "configUpdates", "coroutineScope", "onNewAppConfig", "Lkotlin/Function1;", "overlayStateUpdates", "onNewOverlyState", "unreadConversationIdsUpdates", "onNewUnreadConversationsIdsState", "listenToEvents", "onNewEvent", "updateOpenResponse", "response", "clearOpenResponse", "getOpenResponse", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomDataLayer {
    public static final int $stable = 8;
    private final MutableStateFlow<String> _botBehaviourId;
    private final MutableStateFlow<BotIntro> _botIntro;
    private final MutableStateFlow<AppConfig> _config;
    private final MutableStateFlow<List<Conversation>> _conversations;
    private final MutableSharedFlow<IntercomEvent> _event;
    private final MutableStateFlow<HostAppState> _hostAppState;
    private final MutableStateFlow<OverlayState> _overlayState;
    private final MutableStateFlow<Boolean> _pushNotificationsBannerDismissed;
    private final MutableStateFlow<SurveyData> _surveyData;
    private final MutableStateFlow<TeamPresence> _teamPresence;
    private final MutableStateFlow<Ticket> _ticket;
    private final MutableStateFlow<Set<String>> _unreadConversationIds;
    private final CoroutineScope applicationScope;
    private final StateFlow<String> botBehaviourId;
    private final StateFlow<BotIntro> botIntro;
    private final StateFlow<AppConfig> config;
    private final Context context;
    private final StateFlow<List<Conversation>> conversations;
    private final SharedFlow<IntercomEvent> event;
    private List<? extends HomeCards> homeCards;
    private final StateFlow<HostAppState> hostAppState;
    private OpenMessengerResponse openResponse;
    private final StateFlow<OverlayState> overlayState;
    private final StateFlow<Boolean> pushNotificationsBannerDismissed;
    private final StateFlow<SurveyData> surveyData;
    private final StateFlow<TeamPresence> teamPresence;
    private final StateFlow<Ticket> ticket;
    private final StateFlow<Set<String>> unreadConversationIds;

    public final void emitEvent(IntercomEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        emitEvent$default(this, null, event, 1, null);
    }

    public IntercomDataLayer(Context context, CoroutineScope applicationScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        this.context = context;
        this.applicationScope = applicationScope;
        MutableStateFlow<List<Conversation>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._conversations = MutableStateFlow;
        this.conversations = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<BotIntro> MutableStateFlow2 = StateFlowKt.MutableStateFlow(BotIntro.NULL);
        this._botIntro = MutableStateFlow2;
        this.botIntro = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this._botBehaviourId = MutableStateFlow3;
        this.botBehaviourId = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<TeamPresence> MutableStateFlow4 = StateFlowKt.MutableStateFlow(TeamPresence.NULL);
        this._teamPresence = MutableStateFlow4;
        this.teamPresence = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Ticket> MutableStateFlow5 = StateFlowKt.MutableStateFlow(Ticket.INSTANCE.getNULL());
        this._ticket = MutableStateFlow5;
        this.ticket = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<SurveyData> MutableStateFlow6 = StateFlowKt.MutableStateFlow(SurveyData.INSTANCE.getNULL());
        this._surveyData = MutableStateFlow6;
        this.surveyData = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<OverlayState> MutableStateFlow7 = StateFlowKt.MutableStateFlow(OverlayState.NULL);
        this._overlayState = MutableStateFlow7;
        this.overlayState = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<HostAppState> MutableStateFlow8 = StateFlowKt.MutableStateFlow(HostAppState.NULL);
        this._hostAppState = MutableStateFlow8;
        this.hostAppState = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<Set<String>> MutableStateFlow9 = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        this._unreadConversationIds = MutableStateFlow9;
        this.unreadConversationIds = FlowKt.asStateFlow(MutableStateFlow9);
        MutableSharedFlow<IntercomEvent> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._event = MutableSharedFlow$default;
        this.event = MutableSharedFlow$default;
        this.homeCards = CollectionsKt.emptyList();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
        Intrinsics.checkNotNull(sharedPreferences);
        MutableStateFlow<AppConfig> MutableStateFlow10 = StateFlowKt.MutableStateFlow(AppConfigKt.getAppConfig(sharedPreferences, ContextCompat.getColor(context, R.color.intercom_main_blue), new NexusConfig()));
        this._config = MutableStateFlow10;
        MutableStateFlow<Boolean> MutableStateFlow11 = StateFlowKt.MutableStateFlow(Boolean.valueOf(sharedPreferences.getBoolean("push_notifications_banner_dismissed", false)));
        this._pushNotificationsBannerDismissed = MutableStateFlow11;
        this.config = FlowKt.asStateFlow(MutableStateFlow10);
        this.pushNotificationsBannerDismissed = FlowKt.asStateFlow(MutableStateFlow11);
    }

    public final StateFlow<List<Conversation>> getConversations() {
        return this.conversations;
    }

    public final StateFlow<BotIntro> getBotIntro() {
        return this.botIntro;
    }

    public final StateFlow<String> getBotBehaviourId() {
        return this.botBehaviourId;
    }

    public final StateFlow<TeamPresence> getTeamPresence() {
        return this.teamPresence;
    }

    public final StateFlow<Ticket> getTicket() {
        return this.ticket;
    }

    public final StateFlow<SurveyData> getSurveyData() {
        return this.surveyData;
    }

    public final StateFlow<OverlayState> getOverlayState() {
        return this.overlayState;
    }

    public final StateFlow<HostAppState> getHostAppState() {
        return this.hostAppState;
    }

    public final StateFlow<Set<String>> getUnreadConversationIds() {
        return this.unreadConversationIds;
    }

    public final SharedFlow<IntercomEvent> getEvent() {
        return this.event;
    }

    public final StateFlow<AppConfig> getConfig() {
        return this.config;
    }

    public final StateFlow<Boolean> getPushNotificationsBannerDismissed() {
        return this.pushNotificationsBannerDismissed;
    }

    public final void addConversations(List<Conversation> newConversations) {
        List<Conversation> value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(newConversations, "newConversations");
        MutableStateFlow<List<Conversation>> mutableStateFlow = this._conversations;
        do {
            value = mutableStateFlow.getValue();
            List sortedWith = CollectionsKt.sortedWith(CollectionsKt.plus((Collection) newConversations, (Iterable) value), new Comparator() { // from class: io.intercom.android.sdk.m5.data.IntercomDataLayer$addConversations$lambda$2$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(ConversationExtensionsKt.lastActionCreatedAt((Conversation) t2)), Long.valueOf(ConversationExtensionsKt.lastActionCreatedAt((Conversation) t)));
                }
            });
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            for (Object obj : sortedWith) {
                if (hashSet.add(((Conversation) obj).getId())) {
                    arrayList.add(obj);
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
    }

    public final void updateBotIntro(BotIntro botIntro) {
        Intrinsics.checkNotNullParameter(botIntro, "botIntro");
        MutableStateFlow<BotIntro> mutableStateFlow = this._botIntro;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), botIntro)) {
        }
    }

    public final void updateBotBehaviourId(String botBehaviourId) {
        MutableStateFlow<String> mutableStateFlow = this._botBehaviourId;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), botBehaviourId)) {
        }
    }

    public final void updateTeamPresence(TeamPresence teamPresence) {
        Intrinsics.checkNotNullParameter(teamPresence, "teamPresence");
        MutableStateFlow<TeamPresence> mutableStateFlow = this._teamPresence;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), teamPresence)) {
        }
    }

    public final void updateTicket(Ticket ticket) {
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        MutableStateFlow<Ticket> mutableStateFlow = this._ticket;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), ticket)) {
        }
    }

    public final void updateSurveyData(SurveyData surveyData) {
        OverlayState value;
        OverlayState overlayState;
        Intrinsics.checkNotNullParameter(surveyData, "surveyData");
        MutableStateFlow<SurveyData> mutableStateFlow = this._surveyData;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), surveyData)) {
        }
        MutableStateFlow<OverlayState> mutableStateFlow2 = this._overlayState;
        do {
            value = mutableStateFlow2.getValue();
            overlayState = value;
        } while (!mutableStateFlow2.compareAndSet(value, OverlayState.copy$default(overlayState, Intrinsics.areEqual(overlayState.getSurveyData(), SurveyData.INSTANCE.getNULL()) ? surveyData : overlayState.getSurveyData(), null, 0, null, null, null, null, null, null, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    public final void clearSurveyData() {
        OverlayState value;
        MutableStateFlow<SurveyData> mutableStateFlow = this._surveyData;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), SurveyData.INSTANCE.getNULL())) {
        }
        MutableStateFlow<OverlayState> mutableStateFlow2 = this._overlayState;
        do {
            value = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value, OverlayState.copy$default(value, SurveyData.INSTANCE.getNULL(), null, 0, null, null, null, null, null, null, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
    }

    public final void updateCarousel(Carousel carousel) {
        OverlayState value;
        OverlayState overlayState;
        Intrinsics.checkNotNullParameter(carousel, "carousel");
        MutableStateFlow<OverlayState> mutableStateFlow = this._overlayState;
        do {
            value = mutableStateFlow.getValue();
            overlayState = value;
        } while (!mutableStateFlow.compareAndSet(value, OverlayState.copy$default(overlayState, null, Intrinsics.areEqual(overlayState.getCarousel(), Carousel.NULL) ? carousel : overlayState.getCarousel(), 0, null, null, null, null, null, null, 509, null)));
    }

    public final void clearCarousel() {
        OverlayState value;
        Carousel NULL;
        MutableStateFlow<OverlayState> mutableStateFlow = this._overlayState;
        do {
            value = mutableStateFlow.getValue();
            NULL = Carousel.NULL;
            Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
        } while (!mutableStateFlow.compareAndSet(value, OverlayState.copy$default(value, null, NULL, 0, null, null, null, null, null, null, 509, null)));
    }

    public final void updateBottomPadding(int bottomPadding) {
        MutableStateFlow<OverlayState> mutableStateFlow = this._overlayState;
        while (true) {
            OverlayState value = mutableStateFlow.getValue();
            int i = bottomPadding;
            if (mutableStateFlow.compareAndSet(value, OverlayState.copy$default(value, null, null, i, null, null, null, null, null, null, TypedValues.PositionType.TYPE_PERCENT_Y, null))) {
                return;
            } else {
                bottomPadding = i;
            }
        }
    }

    public final void updateLauncherVisibility(Intercom.Visibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        MutableStateFlow<OverlayState> mutableStateFlow = this._overlayState;
        while (true) {
            OverlayState value = mutableStateFlow.getValue();
            Intercom.Visibility visibility2 = visibility;
            if (mutableStateFlow.compareAndSet(value, OverlayState.copy$default(value, null, null, 0, visibility2, null, null, null, null, null, TypedValues.PositionType.TYPE_PERCENT_WIDTH, null))) {
                return;
            } else {
                visibility = visibility2;
            }
        }
    }

    public final void updateInAppNotificationsVisibility(Intercom.Visibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        MutableStateFlow<OverlayState> mutableStateFlow = this._overlayState;
        while (true) {
            OverlayState value = mutableStateFlow.getValue();
            Intercom.Visibility visibility2 = visibility;
            if (mutableStateFlow.compareAndSet(value, OverlayState.copy$default(value, null, null, 0, null, visibility2, null, null, null, null, 495, null))) {
                return;
            } else {
                visibility = visibility2;
            }
        }
    }

    public final void updateUnreadConversationIds(Set<String> unreadConversationIds) {
        Intrinsics.checkNotNullParameter(unreadConversationIds, "unreadConversationIds");
        MutableStateFlow<Set<String>> mutableStateFlow = this._unreadConversationIds;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), unreadConversationIds)) {
        }
    }

    public final void updateConfig(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (Intrinsics.areEqual(config, Config.INSTANCE.getNULL())) {
            return;
        }
        updateAppConfig(AppConfigKt.getAppConfig(config, this._config.getValue().getPrimaryColor()));
    }

    public final void resetConfig() {
        updateAppConfig(AppConfig.copy$default(this.config.getValue(), null, 0, 0, 0, false, false, false, 0, 0L, 0L, 0L, 0L, false, false, null, null, false, false, null, null, null, null, "", false, false, false, false, false, null, new NexusConfig(), null, false, null, false, -541065217, 3, null));
    }

    public final void updatePushNotificationsBannerDismissed(boolean dismissed) {
        Boolean value;
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
        Intrinsics.checkNotNull(sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("push_notifications_banner_dismissed", dismissed);
        edit.apply();
        MutableStateFlow<Boolean> mutableStateFlow = this._pushNotificationsBannerDismissed;
        do {
            value = mutableStateFlow.getValue();
            value.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.valueOf(dismissed)));
    }

    public final void markConversationAsRead(String conversationId) {
        OverlayState value;
        OverlayState overlayState;
        ArrayList arrayList;
        Set<String> value2;
        ArrayList arrayList2;
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        List<Conversation> conversations = this.overlayState.getValue().getConversations();
        MutableStateFlow<OverlayState> mutableStateFlow = this._overlayState;
        do {
            value = mutableStateFlow.getValue();
            overlayState = value;
            arrayList = new ArrayList();
            for (Object obj : conversations) {
                if (!Intrinsics.areEqual(((Conversation) obj).getId(), conversationId)) {
                    arrayList.add(obj);
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, OverlayState.copy$default(overlayState, null, null, 0, null, null, arrayList, null, null, null, 479, null)));
        Set<String> value3 = this.unreadConversationIds.getValue();
        MutableStateFlow<Set<String>> mutableStateFlow2 = this._unreadConversationIds;
        do {
            value2 = mutableStateFlow2.getValue();
            arrayList2 = new ArrayList();
            for (Object obj2 : value3) {
                if (!Intrinsics.areEqual((String) obj2, conversationId)) {
                    arrayList2.add(obj2);
                }
            }
        } while (!mutableStateFlow2.compareAndSet(value2, CollectionsKt.toSet(arrayList2)));
    }

    public final void fetchConversationSuccess(Conversation conversation) {
        Set<String> value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Set<String> value2 = this.unreadConversationIds.getValue();
        if (conversation.isRead()) {
            MutableStateFlow<Set<String>> mutableStateFlow = this._unreadConversationIds;
            do {
                value = mutableStateFlow.getValue();
                arrayList = new ArrayList();
                for (Object obj : value2) {
                    if (!Intrinsics.areEqual((String) obj, conversation.getId())) {
                        arrayList.add(obj);
                    }
                }
            } while (!mutableStateFlow.compareAndSet(value, CollectionsKt.toSet(arrayList)));
            return;
        }
        MutableStateFlow<Set<String>> mutableStateFlow2 = this._unreadConversationIds;
        while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), SetsKt.plus(value2, conversation.getId()))) {
        }
    }

    public final void markConversationPartAsDismissed(String partId) {
        OverlayState value;
        OverlayState overlayState;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(partId, "partId");
        List<Conversation> conversations = this.overlayState.getValue().getConversations();
        Set plus = SetsKt.plus(this.overlayState.getValue().getDismissedPartIds(), partId);
        MutableStateFlow<OverlayState> mutableStateFlow = this._overlayState;
        do {
            value = mutableStateFlow.getValue();
            overlayState = value;
            arrayList = new ArrayList();
            for (Object obj : conversations) {
                Conversation conversation = (Conversation) obj;
                Set set = plus;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual((String) it.next(), conversation.lastPart().getId())) {
                            break;
                        }
                    }
                }
                arrayList.add(obj);
            }
        } while (!mutableStateFlow.compareAndSet(value, OverlayState.copy$default(overlayState, null, null, 0, null, null, arrayList, plus, null, null, 415, null)));
    }

    public final void updateOverlayConversations(List<Conversation> conversations) {
        OverlayState value;
        OverlayState overlayState;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(conversations, "conversations");
        Set<String> dismissedPartIds = this.overlayState.getValue().getDismissedPartIds();
        MutableStateFlow<OverlayState> mutableStateFlow = this._overlayState;
        do {
            value = mutableStateFlow.getValue();
            overlayState = value;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : conversations) {
                Conversation conversation = (Conversation) obj;
                Set<String> set = dismissedPartIds;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual((String) it.next(), conversation.lastPart().getId())) {
                            break;
                        }
                    }
                }
                arrayList2.add(obj);
            }
            arrayList = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (((Conversation) obj2).lastPart().getDeliveryOption() != DeliveryOption.BADGE) {
                    arrayList.add(obj2);
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, OverlayState.copy$default(overlayState, null, null, 0, null, null, arrayList, null, null, null, 479, null)));
    }

    public final void activityReadyForViewAttachment(Activity activity) {
        OverlayState value;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!ActivityUtils.isHostActivity(activity)) {
            activity = null;
        }
        Activity activity2 = activity;
        MutableStateFlow<OverlayState> mutableStateFlow = this._overlayState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, OverlayState.copy$default(value, null, null, 0, null, null, null, null, activity2, null, 127, null)));
    }

    public final void activityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        MutableStateFlow<OverlayState> mutableStateFlow = this._overlayState;
        while (true) {
            OverlayState value = mutableStateFlow.getValue();
            Activity activity2 = activity;
            if (mutableStateFlow.compareAndSet(value, OverlayState.copy$default(value, null, null, 0, null, null, null, null, null, activity2, 127, null))) {
                return;
            } else {
                activity = activity2;
            }
        }
    }

    public final void activityStopped(Activity activity) {
        OverlayState value;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Activity pausedHostActivity = Intrinsics.areEqual(activity, this.overlayState.getValue().getPausedHostActivity()) ? null : this.overlayState.getValue().getPausedHostActivity();
        MutableStateFlow<OverlayState> mutableStateFlow = this._overlayState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, OverlayState.copy$default(value, null, null, 0, null, null, null, null, null, pausedHostActivity, 255, null)));
    }

    public final void appEnteredBackground(long timestamp) {
        OverlayState value;
        HostAppState value2;
        MutableStateFlow<OverlayState> mutableStateFlow = this._overlayState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, OverlayState.copy$default(value, null, null, 0, null, null, null, null, null, null, 127, null)));
        MutableStateFlow<HostAppState> mutableStateFlow2 = this._hostAppState;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, HostAppState.copy$default(value2, true, false, timestamp, 2, null)));
    }

    public final void appEnteredForeground() {
        HostAppState value;
        MutableStateFlow<HostAppState> mutableStateFlow = this._hostAppState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HostAppState.copy$default(value, false, false, 0L, 4, null)));
    }

    public final void updateSessionStarted() {
        HostAppState value;
        MutableStateFlow<HostAppState> mutableStateFlow = this._hostAppState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HostAppState.copy$default(value, false, true, 0L, 5, null)));
    }

    public final void hardReset() {
        HostAppState value;
        resetConfig();
        MutableStateFlow<HostAppState> mutableStateFlow = this._hostAppState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HostAppState.copy$default(value, false, false, 0L, 5, null)));
    }

    public final void clearUserData() {
        OverlayState value;
        SurveyData surveyData;
        Carousel NULL;
        MutableStateFlow<List<Conversation>> mutableStateFlow = this._conversations;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), CollectionsKt.emptyList())) {
        }
        MutableStateFlow<BotIntro> mutableStateFlow2 = this._botIntro;
        while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), BotIntro.NULL)) {
        }
        MutableStateFlow<String> mutableStateFlow3 = this._botBehaviourId;
        while (!mutableStateFlow3.compareAndSet(mutableStateFlow3.getValue(), null)) {
        }
        MutableStateFlow<TeamPresence> mutableStateFlow4 = this._teamPresence;
        while (!mutableStateFlow4.compareAndSet(mutableStateFlow4.getValue(), TeamPresence.NULL)) {
        }
        MutableStateFlow<Ticket> mutableStateFlow5 = this._ticket;
        while (!mutableStateFlow5.compareAndSet(mutableStateFlow5.getValue(), Ticket.INSTANCE.getNULL())) {
        }
        MutableStateFlow<SurveyData> mutableStateFlow6 = this._surveyData;
        while (!mutableStateFlow6.compareAndSet(mutableStateFlow6.getValue(), SurveyData.INSTANCE.getNULL())) {
        }
        MutableStateFlow<OverlayState> mutableStateFlow7 = this._overlayState;
        do {
            value = mutableStateFlow7.getValue();
            surveyData = SurveyData.INSTANCE.getNULL();
            NULL = Carousel.NULL;
            Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
        } while (!mutableStateFlow7.compareAndSet(value, OverlayState.copy$default(value, surveyData, NULL, 0, null, null, CollectionsKt.emptyList(), SetsKt.emptySet(), null, null, FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED, null)));
        MutableStateFlow<Set<String>> mutableStateFlow8 = this._unreadConversationIds;
        while (!mutableStateFlow8.compareAndSet(mutableStateFlow8.getValue(), SetsKt.emptySet())) {
        }
        this.openResponse = null;
        this.homeCards = CollectionsKt.emptyList();
    }

    public final Object emitEvent(IntercomEvent intercomEvent, Continuation<? super Unit> continuation) {
        Object emit = this._event.emit(intercomEvent, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }

    private final void updateAppConfig(AppConfig newAppConfig) {
        CustomizationModel customization;
        String themeMode;
        ThemeMode themeMode2;
        if (Intrinsics.areEqual(newAppConfig, this._config.getValue())) {
            return;
        }
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
        Intrinsics.checkNotNull(sharedPreferences);
        AppConfigKt.setAppConfig(sharedPreferences, newAppConfig);
        this._config.setValue(newAppConfig);
        ConfigModules configModules = newAppConfig.getConfigModules();
        if (configModules == null || (customization = configModules.getCustomization()) == null || (themeMode = customization.getThemeMode()) == null) {
            return;
        }
        String lowerCase = themeMode.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int hashCode = lowerCase.hashCode();
        if (hashCode == -887328209) {
            if (lowerCase.equals("system")) {
                themeMode2 = ThemeMode.SYSTEM;
            }
            themeMode2 = ThemeMode.LIGHT;
        } else if (hashCode == 3075958) {
            if (lowerCase.equals(DevLauncherUserInterface.DARK)) {
                themeMode2 = ThemeMode.DARK;
            }
            themeMode2 = ThemeMode.LIGHT;
        } else {
            if (hashCode == 102970646 && lowerCase.equals(DevLauncherUserInterface.LIGHT)) {
                themeMode2 = ThemeMode.LIGHT;
            }
            themeMode2 = ThemeMode.LIGHT;
        }
        ThemeManager.INSTANCE.updateServerTheme(themeMode2);
    }

    public final void configUpdates(CoroutineScope coroutineScope, Function1<? super AppConfig, Unit> onNewAppConfig) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onNewAppConfig, "onNewAppConfig");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new IntercomDataLayer$configUpdates$1(this, onNewAppConfig, null), 3, null);
    }

    public final void overlayStateUpdates(CoroutineScope coroutineScope, Function1<? super OverlayState, Unit> onNewOverlyState) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onNewOverlyState, "onNewOverlyState");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new IntercomDataLayer$overlayStateUpdates$1(this, onNewOverlyState, null), 3, null);
    }

    public final void unreadConversationIdsUpdates(CoroutineScope coroutineScope, Function1<? super Set<String>, Unit> onNewUnreadConversationsIdsState) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onNewUnreadConversationsIdsState, "onNewUnreadConversationsIdsState");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new IntercomDataLayer$unreadConversationIdsUpdates$1(this, onNewUnreadConversationsIdsState, null), 3, null);
    }

    public static /* synthetic */ void emitEvent$default(IntercomDataLayer intercomDataLayer, CoroutineScope coroutineScope, IntercomEvent intercomEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineScope = intercomDataLayer.applicationScope;
        }
        intercomDataLayer.emitEvent(coroutineScope, intercomEvent);
    }

    public final void emitEvent(CoroutineScope coroutineScope, IntercomEvent event) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(event, "event");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new IntercomDataLayer$emitEvent$2(this, event, null), 3, null);
    }

    public final void listenToEvents(CoroutineScope coroutineScope, Function1<? super IntercomEvent, Unit> onNewEvent) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onNewEvent, "onNewEvent");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new IntercomDataLayer$listenToEvents$1(this, onNewEvent, null), 3, null);
    }

    public final void updateOpenResponse(OpenMessengerResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.openResponse = response;
    }

    public final void clearOpenResponse() {
        this.openResponse = null;
    }

    public final OpenMessengerResponse getOpenResponse() {
        return this.openResponse;
    }
}
