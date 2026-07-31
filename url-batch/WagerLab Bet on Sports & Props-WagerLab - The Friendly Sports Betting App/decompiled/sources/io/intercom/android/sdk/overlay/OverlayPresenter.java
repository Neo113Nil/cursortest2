package io.intercom.android.sdk.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;
import io.intercom.android.sdk.activities.IntercomNoteActivity;
import io.intercom.android.sdk.activities.IntercomPostActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgsKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.DeliveryOption;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.OverlayState;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.overlay.InAppNotificationPresenter;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.IntercomSurveyActivity;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import io.intercom.android.sdk.utilities.ViewUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes8.dex */
public class OverlayPresenter implements InAppNotificationPresenter.Listener {
    private final Provider<Api> api;
    private final Provider<AppConfig> appConfigProvider;
    private final Handler handler;
    final InAppNotificationPresenter inAppNotificationPresenter;
    private final IntercomDataLayer intercomDataLayer;
    final DefaultLauncherPresenter launcherPresenter;
    private final MetricTracker metricTracker;
    private final UserIdentity userIdentity;
    private final Twig twig = LumberMill.getLogger();
    private final Set<String> viewedPartIds = new HashSet();

    public OverlayPresenter(Application application, Provider<AppConfig> provider, MetricTracker metricTracker, UserIdentity userIdentity, IntercomDataLayer intercomDataLayer, Provider<Api> provider2) {
        this.appConfigProvider = provider;
        this.metricTracker = metricTracker;
        this.userIdentity = userIdentity;
        this.intercomDataLayer = intercomDataLayer;
        this.api = provider2;
        LayoutInflater from = LayoutInflater.from(application);
        Handler handler = new Handler(Looper.getMainLooper());
        this.handler = handler;
        this.inAppNotificationPresenter = new InAppNotificationPresenter(from, handler, this, metricTracker, provider, new ContextLocaliser(provider), hostActivity());
        this.launcherPresenter = new DefaultLauncherPresenter(from, new LauncherOpenBehaviour(), metricTracker);
        CoroutineScope MainScope = CoroutineScopeKt.MainScope();
        intercomDataLayer.unreadConversationIdsUpdates(MainScope, new Function1() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OverlayPresenter.this.m11666lambda$new$0$iointercomandroidsdkoverlayOverlayPresenter((Set) obj);
            }
        });
        intercomDataLayer.configUpdates(MainScope, new Function1() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OverlayPresenter.this.m11667lambda$new$1$iointercomandroidsdkoverlayOverlayPresenter((AppConfig) obj);
            }
        });
        intercomDataLayer.overlayStateUpdates(MainScope, new Function1() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OverlayPresenter.this.m11668lambda$new$2$iointercomandroidsdkoverlayOverlayPresenter((OverlayState) obj);
            }
        });
        intercomDataLayer.listenToEvents(MainScope, new Function1() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OverlayPresenter.this.m11669lambda$new$3$iointercomandroidsdkoverlayOverlayPresenter((IntercomEvent) obj);
            }
        });
    }

    /* renamed from: lambda$new$0$io-intercom-android-sdk-overlay-OverlayPresenter, reason: not valid java name */
    /* synthetic */ Unit m11666lambda$new$0$iointercomandroidsdkoverlayOverlayPresenter(Set set) {
        onStateChange(Integer.valueOf(set.size()), this.intercomDataLayer.getOverlayState().getValue());
        return Unit.INSTANCE;
    }

    /* renamed from: lambda$new$1$io-intercom-android-sdk-overlay-OverlayPresenter, reason: not valid java name */
    /* synthetic */ Unit m11667lambda$new$1$iointercomandroidsdkoverlayOverlayPresenter(AppConfig appConfig) {
        onNewConfig();
        return Unit.INSTANCE;
    }

    /* renamed from: lambda$new$2$io-intercom-android-sdk-overlay-OverlayPresenter, reason: not valid java name */
    /* synthetic */ Unit m11668lambda$new$2$iointercomandroidsdkoverlayOverlayPresenter(OverlayState overlayState) {
        onStateChange(Integer.valueOf(this.intercomDataLayer.getUnreadConversationIds().getValue().size()), overlayState);
        return Unit.INSTANCE;
    }

    /* renamed from: lambda$new$3$io-intercom-android-sdk-overlay-OverlayPresenter, reason: not valid java name */
    /* synthetic */ Unit m11669lambda$new$3$iointercomandroidsdkoverlayOverlayPresenter(IntercomEvent intercomEvent) {
        handleLifecycleEvents(intercomEvent);
        return Unit.INSTANCE;
    }

    void handleLifecycleEvents(IntercomEvent intercomEvent) {
        OverlayState value = this.intercomDataLayer.getOverlayState().getValue();
        Activity pausedHostActivity = value.getPausedHostActivity();
        Activity resumedHostActivity = value.getResumedHostActivity();
        if (intercomEvent instanceof IntercomEvent.ActivityReadyForViewAttachment) {
            if (((IntercomEvent.ActivityReadyForViewAttachment) intercomEvent).getActivity() != pausedHostActivity) {
                removeOverlays(pausedHostActivity);
            }
        } else {
            if (intercomEvent instanceof IntercomEvent.ActivityPaused) {
                removeOverlays(pausedHostActivity);
                return;
            }
            if (intercomEvent instanceof IntercomEvent.ActivityStopped) {
                if (((IntercomEvent.ActivityStopped) intercomEvent).getActivity() == pausedHostActivity) {
                    removeOverlays(pausedHostActivity);
                }
            } else if (intercomEvent instanceof IntercomEvent.AppEnteredBackground) {
                cancelAnimations();
                removeOverlays(pausedHostActivity);
                removeOverlays(resumedHostActivity);
            }
        }
    }

    public void onStateChange(Integer num, OverlayState overlayState) {
        Activity resumedHostActivity = overlayState.getResumedHostActivity();
        List<Conversation> conversations = overlayState.getConversations();
        SurveyData surveyData = overlayState.getSurveyData();
        Carousel carousel = overlayState.getCarousel();
        int bottomPadding = overlayState.getBottomPadding();
        Intercom.Visibility launcherVisibility = overlayState.getLauncherVisibility();
        Intercom.Visibility inAppNotificationsVisibility = overlayState.getInAppNotificationsVisibility();
        this.launcherPresenter.setBottomPadding(bottomPadding);
        this.launcherPresenter.setUnreadCount(num.intValue());
        this.inAppNotificationPresenter.setBottomPadding(bottomPadding);
        if (resumedHostActivity == null || resumedHostActivity.isFinishing() || resumedHostActivity.isDestroyed()) {
            return;
        }
        if (shouldDisplaySurvey(surveyData, resumedHostActivity)) {
            openSurvey(resumedHostActivity);
            return;
        }
        if (shouldDisplayCarousel(carousel, resumedHostActivity)) {
            openCarousel(resumedHostActivity);
            return;
        }
        if (shouldDisplayNotifications(conversations, inAppNotificationsVisibility, resumedHostActivity)) {
            preloadAvatarThenDisplayNotifications(conversations, inAppNotificationsVisibility, resumedHostActivity, this.userIdentity.getFingerprint());
        } else if (shouldDisplayLauncher(conversations, inAppNotificationsVisibility, launcherVisibility, resumedHostActivity)) {
            final ViewGroup rootView = getRootView(resumedHostActivity);
            ViewUtils.waitForViewAttachment(rootView, new Runnable() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    OverlayPresenter.this.m11671x33da9d96(rootView);
                }
            });
        } else {
            removeOverlaysIfPresent(resumedHostActivity);
        }
    }

    /* renamed from: lambda$onStateChange$4$io-intercom-android-sdk-overlay-OverlayPresenter, reason: not valid java name */
    /* synthetic */ void m11671x33da9d96(ViewGroup viewGroup) {
        this.inAppNotificationPresenter.reset(viewGroup);
        this.launcherPresenter.displayLauncherOnAttachedRoot(viewGroup, this.appConfigProvider.get());
    }

    public void softReset() {
        cancelAnimations();
        Activity hostActivity = hostActivity();
        if (hostActivity != null) {
            removeOverlaysIfPresent(hostActivity);
        }
    }

    public void onNewConfig() {
        Intercom.Visibility launcherVisibility = this.intercomDataLayer.getOverlayState().getValue().getLauncherVisibility();
        Intercom.Visibility inAppNotificationsVisibility = this.intercomDataLayer.getOverlayState().getValue().getInAppNotificationsVisibility();
        List<Conversation> conversations = this.intercomDataLayer.getOverlayState().getValue().getConversations();
        Activity resumedHostActivity = this.intercomDataLayer.getOverlayState().getValue().getResumedHostActivity();
        if (shouldDisplayLauncher(conversations, inAppNotificationsVisibility, launcherVisibility, resumedHostActivity)) {
            final ViewGroup rootView = getRootView(resumedHostActivity);
            ViewUtils.waitForViewAttachment(rootView, new Runnable() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    OverlayPresenter.this.m11670x923f23b4(rootView);
                }
            });
        } else {
            this.launcherPresenter.setLauncherBackgroundColor(this.appConfigProvider.get());
        }
    }

    /* renamed from: lambda$onNewConfig$5$io-intercom-android-sdk-overlay-OverlayPresenter, reason: not valid java name */
    /* synthetic */ void m11670x923f23b4(ViewGroup viewGroup) {
        this.launcherPresenter.displayLauncherOnAttachedRoot(viewGroup, this.appConfigProvider.get());
    }

    public void cancelAnimations() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public void removeOverlaysIfPresent(Activity activity) {
        final View findViewById = activity.findViewById(R.id.intercom_overlay_root);
        activity.runOnUiThread(new Runnable() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                OverlayPresenter.this.m11673xb3956ddf(findViewById);
            }
        });
    }

    /* renamed from: lambda$removeOverlaysIfPresent$6$io-intercom-android-sdk-overlay-OverlayPresenter, reason: not valid java name */
    /* synthetic */ void m11673xb3956ddf(View view) {
        if (view != null) {
            this.launcherPresenter.removeLauncher();
            this.inAppNotificationPresenter.reset((ViewGroup) view);
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
        }
    }

    void preloadAvatarThenDisplayNotifications(final List<Conversation> list, final Intercom.Visibility visibility, final Activity activity, final String str) {
        AvatarUtils.preloadAvatar(list.get(0).lastAdmin().getAvatar(), new Runnable() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                OverlayPresenter.this.m11672x90163870(str, list, visibility, activity);
            }
        }, activity);
    }

    /* renamed from: lambda$preloadAvatarThenDisplayNotifications$7$io-intercom-android-sdk-overlay-OverlayPresenter, reason: not valid java name */
    /* synthetic */ void m11672x90163870(String str, List list, Intercom.Visibility visibility, Activity activity) {
        if (str.equals(this.userIdentity.getFingerprint()) && shouldDisplayNotifications(list, visibility, activity)) {
            displayNotifications(list, activity);
        }
    }

    void displayNotifications(final List<Conversation> list, Activity activity) {
        final ViewGroup rootView = getRootView(activity);
        Conversation conversation = list.get(0);
        MessageStyle messageStyle = conversation.lastPart().getMessageStyle();
        DeliveryOption deliveryOption = conversation.lastPart().getDeliveryOption();
        if (list.size() > 1 || this.inAppNotificationPresenter.isDisplaying() || deliveryOption == DeliveryOption.SUMMARY || (deliveryOption == DeliveryOption.FULL && MessageStyle.CHAT.equals(messageStyle))) {
            if (this.launcherPresenter.isDisplaying()) {
                final DefaultLauncher andUnsetLauncher = this.launcherPresenter.getAndUnsetLauncher();
                if (list.size() == 1) {
                    andUnsetLauncher.pulseForTransformation(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            andUnsetLauncher.fadeOffScreen(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.1.1
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator animator2) {
                                    andUnsetLauncher.removeView();
                                }
                            });
                            OverlayPresenter.this.inAppNotificationPresenter.displayNotifications(rootView, list);
                        }
                    });
                    return;
                } else {
                    andUnsetLauncher.fadeOffScreen(new AnimatorListenerAdapter() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.2
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            andUnsetLauncher.removeView();
                            OverlayPresenter.this.inAppNotificationPresenter.displayNotifications(rootView, list);
                        }
                    });
                    return;
                }
            }
            this.inAppNotificationPresenter.displayNotifications(rootView, list);
            return;
        }
        if (deliveryOption == DeliveryOption.FULL) {
            if (MessageStyle.POST.equals(messageStyle)) {
                trackInAppView(conversation.getId(), conversation.lastPart().getId(), 1);
                openPost(conversation);
            } else if (MessageStyle.NOTE.equals(messageStyle)) {
                trackInAppView(conversation.getId(), conversation.lastPart().getId(), 1);
                openNote(conversation);
            }
        }
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotificationPresenter.Listener
    public ViewGroup getRootView() {
        Activity hostActivity = hostActivity();
        hostActivity.getClass();
        return getRootView(hostActivity);
    }

    private ViewGroup getRootView(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.intercom_overlay_root);
        if (viewGroup == null) {
            viewGroup = new FrameLayout(activity);
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            viewGroup.setId(R.id.intercom_overlay_root);
            if (Build.VERSION.SDK_INT >= 30) {
                setupUniversalOverlayPositioning(viewGroup);
            } else {
                setupLegacyOverlayPositioning(viewGroup, activity);
            }
            activity.addContentView(viewGroup, new FrameLayout.LayoutParams(-1, -1));
        }
        return viewGroup;
    }

    private void setupUniversalOverlayPositioning(ViewGroup viewGroup) {
        ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new OnApplyWindowInsetsListener() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return OverlayPresenter.lambda$setupUniversalOverlayPositioning$8(view, windowInsetsCompat);
            }
        });
        ViewCompat.requestApplyInsets(viewGroup);
    }

    static /* synthetic */ WindowInsetsCompat lambda$setupUniversalOverlayPositioning$8(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom + ((int) (view.getResources().getDisplayMetrics().density * 8.0f)));
        return WindowInsetsCompat.CONSUMED;
    }

    private void setupLegacyOverlayPositioning(final ViewGroup viewGroup, final Activity activity) {
        viewGroup.setFitsSystemWindows(false);
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.intercom.android.sdk.overlay.OverlayPresenter.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                OverlayPresenter.this.applyLegacyBottomPadding(viewGroup, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyLegacyBottomPadding(ViewGroup viewGroup, Activity activity) {
        try {
            int i = (int) (activity.getResources().getDisplayMetrics().density * 8.0f);
            int legacyNavigationBarHeight = getLegacyNavigationBarHeight(activity);
            if (legacyNavigationBarHeight > 0) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), legacyNavigationBarHeight + i);
            } else {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), ((int) (activity.getResources().getDisplayMetrics().density * 24.0f)) + i);
            }
        } catch (Throwable unused) {
            viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), ((int) (activity.getResources().getDisplayMetrics().density * 24.0f)) + ((int) (activity.getResources().getDisplayMetrics().density * 8.0f)));
        }
    }

    private int getLegacyNavigationBarHeight(Activity activity) {
        Resources resources = activity.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotificationPresenter.Listener
    public void markAsDismissed(Conversation conversation) {
        this.api.get().markConversationAsDismissed(conversation.getId());
        this.intercomDataLayer.markConversationPartAsDismissed(conversation.lastPart().getId());
    }

    @Override // io.intercom.android.sdk.overlay.InAppNotificationPresenter.Listener
    public void openNotification(Conversation conversation) {
        Part lastAdminPart = conversation.getLastAdminPart();
        MessageStyle messageStyle = lastAdminPart.getMessageStyle();
        if (MessageStyle.POST.equals(messageStyle)) {
            trackInAppView(conversation.getId(), conversation.lastPart().getId(), 0);
            openPost(conversation);
        } else {
            if (MessageStyle.NOTE.equals(messageStyle)) {
                trackInAppView(conversation.getId(), conversation.lastPart().getId(), 0);
                openNote(conversation);
                return;
            }
            openMessenger(conversation);
            if (MessageStyle.CHAT.equals(messageStyle) && DeliveryOption.FULL == lastAdminPart.getDeliveryOption()) {
                this.metricTracker.openedConversationFromFull(conversation.getId(), lastAdminPart.getId());
            } else {
                this.metricTracker.openedConversationFromSnippet(conversation.getId(), lastAdminPart.getId());
            }
        }
    }

    private void openMessenger(Conversation conversation) {
        Activity hostActivity = hostActivity();
        if (hostActivity != null) {
            ArrayList arrayList = new ArrayList();
            Intent conversationIntent = ConversationScreenOpenerKt.getConversationIntent(hostActivity, conversation.getId());
            arrayList.add(IntercomRootActivityArgsKt.getIntentForArgs(hostActivity, IntercomRootActivityArgs.MessagesScreenArgs.INSTANCE, IntercomRootActivity.class, 268435456));
            arrayList.add(conversationIntent);
            hostActivity.startActivities((Intent[]) arrayList.toArray(new Intent[0]));
        }
    }

    private void openPost(Conversation conversation) {
        Activity hostActivity = hostActivity();
        if (hostActivity != null) {
            hostActivity.startActivity(IntercomPostActivity.buildPostIntent(hostActivity, conversation.lastPart(), conversation.getId(), conversation.lastParticipatingAdmin(), conversation.getComposerState().isVisible(), true));
        }
    }

    private void openNote(Conversation conversation) {
        try {
            Activity hostActivity = hostActivity();
            if (hostActivity != null) {
                hostActivity.startActivity(IntercomNoteActivity.buildNoteIntent(hostActivity, conversation.lastPart(), conversation.getId(), conversation.lastParticipatingAdmin(), conversation.getComposerState().isVisible()));
            }
        } catch (IllegalArgumentException e) {
            this.twig.internal("Overlay", "Error loading the note " + e.getMessage());
        }
    }

    private void openSurvey(Activity activity) {
        activity.startActivity(IntercomSurveyActivity.buildIntent(activity));
    }

    private void openCarousel(Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) IntercomCarouselActivity.class));
    }

    private Activity hostActivity() {
        return this.intercomDataLayer.getOverlayState().getValue().getResumedHostActivity();
    }

    private void trackInAppView(String str, String str2, int i) {
        if (this.viewedPartIds.contains(str2)) {
            return;
        }
        this.viewedPartIds.add(str2);
        this.metricTracker.viewedInApp(str, str2, i);
    }

    boolean shouldDisplaySurvey(SurveyData surveyData, Activity activity) {
        return (SurveyData.INSTANCE.getNULL().equals(surveyData) || this.userIdentity.isSoftReset() || activity == null) ? false : true;
    }

    boolean shouldDisplayCarousel(Carousel carousel, Activity activity) {
        return (Carousel.NULL.equals(carousel) || this.userIdentity.isSoftReset() || activity == null) ? false : true;
    }

    boolean shouldDisplayNotifications(List<Conversation> list, Intercom.Visibility visibility, Activity activity) {
        return (visibility != Intercom.Visibility.VISIBLE || this.userIdentity.isSoftReset() || list.isEmpty() || activity == null) ? false : true;
    }

    boolean shouldDisplayLauncher(List<Conversation> list, Intercom.Visibility visibility, Intercom.Visibility visibility2, Activity activity) {
        if (visibility == Intercom.Visibility.VISIBLE) {
            Iterator<Conversation> it = list.iterator();
            while (it.hasNext()) {
                if (DeliveryOption.BADGE != it.next().lastPart().getDeliveryOption()) {
                    return false;
                }
            }
        }
        return visibility2 == Intercom.Visibility.VISIBLE && !this.userIdentity.isSoftReset() && this.userIdentity.identityExists() && this.appConfigProvider.get().isReceivedFromServer() && activity != null;
    }

    public void refreshStateBecauseUserIdentityIsNotInStoreYet() {
        onStateChange(Integer.valueOf(this.intercomDataLayer.getUnreadConversationIds().getValue().size()), this.intercomDataLayer.getOverlayState().getValue());
    }

    private void removeOverlays(Activity activity) {
        if (activity != null) {
            removeOverlaysIfPresent(activity);
        }
    }
}
