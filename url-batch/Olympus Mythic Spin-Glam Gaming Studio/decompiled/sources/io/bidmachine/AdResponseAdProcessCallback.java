package io.bidmachine;

import androidx.annotation.VisibleForTesting;
import io.bidmachine.core.Logger;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.viewabilitytracker.model.ActionEvent;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.lazy.LazyValue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0001J\b\u0010\u001e\u001a\u00020\u0007H\u0007J\u0006\u0010\u001f\u001a\u00020\u001cJ\u001c\u0010 \u001a\u00020\u001c2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001c0\"H\u0007J\b\u0010#\u001a\u0004\u0018\u00010\u0003J\b\u0010$\u001a\u00020\u0007H\u0007J\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u0007J\b\u0010%\u001a\u00020\u0007H\u0007J\u0006\u0010\u0010\u001a\u00020\u0007J\u001e\u0010&\u001a\u00020\u001c2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0013\u0018\u00010(H\u0016J\u0006\u0010*\u001a\u00020\u0007J\u001a\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u001a\u00100\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00101\u001a\u00020\u001c2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0012\u00104\u001a\u00020\u001c2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00105\u001a\u00020\u001cH\u0016J\b\u00106\u001a\u00020\u001cH\u0016J\b\u00107\u001a\u00020\u001cH\u0016J\b\u00108\u001a\u00020\u001cH\u0016J\b\u00109\u001a\u00020\u001cH\u0016J\u0010\u0010:\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/H\u0016J\b\u0010;\u001a\u00020\u001cH\u0016J\b\u0010<\u001a\u00020\u001cH\u0007J \u0010=\u001a\u00020\u001c2\u0016\b\u0002\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c\u0018\u00010\"H\u0007J\u0010\u0010?\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/H\u0016J\b\u0010@\u001a\u00020\u001cH\u0016J\u001a\u0010A\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0007J\b\u0010B\u001a\u00020\u001cH\u0016J\u000e\u0010C\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0001J\u0010\u0010D\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lio/bidmachine/AdResponseAdProcessCallback;", "Lio/bidmachine/AdProcessCallback;", "adResponse", "Lio/bidmachine/AdResponse;", "(Lio/bidmachine/AdResponse;)V", "adProcessCallbackMap", "", "", "getAdProcessCallbackMap", "()Ljava/util/Map;", "isFinished", "isLoadTracked", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLoaded", "isLoading", "isResultShownTracked", "isShownTracked", "isVisibilityTrackerShownTracked", "mutexCallback", "", "trackedEvents", "", "Lio/bidmachine/TrackEventType;", "visibilitySource", "Lio/bidmachine/core/VisibilitySource;", "weakAdResponse", "Ljava/lang/ref/WeakReference;", "appendCallback", "", "adProcessCallback", "canSendShownCallback", "destroy", "executeOnCallback", "action", "Lkotlin/Function1;", "getAdResponse", "isBidMachineShowTracked", "isNetworkShowTracked", "onBrokenCreativeEvent", "params", "", "", "onLoading", "onNetworkViewabilityEvent", "actionEvent", "Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "bmError", "Lio/bidmachine/utils/BMError;", "onVisibilityTrackerViewabilityEvent", "processClickVerified", "systemComponent", "Lio/bidmachine/util/SystemComponent;", "processClicked", "processClosed", "processDestroy", "processExpired", "processFillAd", "processFinished", "processLoadFail", "processLoadSuccess", "processNetworkVisibilityEventShown", "processResultShown", "postback", "processShowFail", "processShown", "processViewabilityEvent", "processVisibilityTrackerShown", "removeCallback", "setVisibilitySource", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class AdResponseAdProcessCallback implements AdProcessCallback {

    @NotNull
    private final Map<AdProcessCallback, Boolean> adProcessCallbackMap;
    private volatile boolean isFinished;

    @NotNull
    private final AtomicBoolean isLoadTracked;

    @NotNull
    private final AtomicBoolean isLoaded;

    @NotNull
    private final AtomicBoolean isLoading;

    @NotNull
    private final AtomicBoolean isResultShownTracked;

    @NotNull
    private final AtomicBoolean isShownTracked;

    @NotNull
    private final AtomicBoolean isVisibilityTrackerShownTracked;

    @NotNull
    private final Object mutexCallback;

    @NotNull
    private final Set<TrackEventType> trackedEvents;

    @NotNull
    public volatile VisibilitySource visibilitySource;

    @NotNull
    private final WeakReference<AdResponse> weakAdResponse;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VisibilitySource.values().length];
            try {
                iArr[VisibilitySource.BidMachine.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VisibilitySource.Network.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VisibilitySource.All.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class a extends Lambda implements Function1 {
        final /* synthetic */ SystemComponent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SystemComponent systemComponent) {
            super(1);
            this.a = systemComponent;
        }

        public final void a(AdProcessCallback it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.processClickVerified(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AdProcessCallback) obj);
            return Unit.INSTANCE;
        }
    }

    static final class b extends Lambda implements Function1 {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final void a(AdProcessCallback it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.processClosed();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AdProcessCallback) obj);
            return Unit.INSTANCE;
        }
    }

    static final class c extends Lambda implements Function1 {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final void a(AdProcessCallback it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.processDestroy();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AdProcessCallback) obj);
            return Unit.INSTANCE;
        }
    }

    static final class d extends Lambda implements Function1 {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final void a(AdProcessCallback it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.processExpired();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AdProcessCallback) obj);
            return Unit.INSTANCE;
        }
    }

    static final class e extends Lambda implements Function1 {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final void a(AdProcessCallback it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.processFillAd();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AdProcessCallback) obj);
            return Unit.INSTANCE;
        }
    }

    static final class f extends Lambda implements Function1 {
        public static final f a = new f();

        f() {
            super(1);
        }

        public final void a(AdProcessCallback it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.processFinished();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AdProcessCallback) obj);
            return Unit.INSTANCE;
        }
    }

    static final class g extends Lambda implements Function1 {
        final /* synthetic */ BMError a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(BMError bMError) {
            super(1);
            this.a = bMError;
        }

        public final void a(AdProcessCallback it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.processLoadFail(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AdProcessCallback) obj);
            return Unit.INSTANCE;
        }
    }

    static final class h extends Lambda implements Function1 {
        public static final h a = new h();

        h() {
            super(1);
        }

        public final void a(AdProcessCallback it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.processLoadSuccess();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AdProcessCallback) obj);
            return Unit.INSTANCE;
        }
    }

    static final class i extends Lambda implements Function1 {
        public static final i a = new i();

        i() {
            super(1);
        }

        public final void a(AdProcessCallback it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.processShown();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AdProcessCallback) obj);
            return Unit.INSTANCE;
        }
    }

    static final class j extends Lambda implements Function1 {
        final /* synthetic */ BMError a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(BMError bMError) {
            super(1);
            this.a = bMError;
        }

        public final void a(AdProcessCallback it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.processShowFail(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AdProcessCallback) obj);
            return Unit.INSTANCE;
        }
    }

    static final class k extends Lambda implements Function1 {
        k() {
            super(1);
        }

        public final void a(AdResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Set set = AdResponseAdProcessCallback.this.trackedEvents;
            TrackEventType trackEventType = TrackEventType.Show;
            if (set.add(trackEventType)) {
                it.eventFinish(trackEventType, true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AdResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public AdResponseAdProcessCallback(@NotNull AdResponse adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.weakAdResponse = new WeakReference<>(adResponse);
        this.adProcessCallbackMap = new WeakHashMap();
        this.mutexCallback = new Object();
        this.isLoaded = new AtomicBoolean(false);
        this.isLoading = new AtomicBoolean(false);
        this.isLoadTracked = new AtomicBoolean(false);
        this.isShownTracked = new AtomicBoolean(false);
        this.isVisibilityTrackerShownTracked = new AtomicBoolean(false);
        this.isResultShownTracked = new AtomicBoolean(false);
        this.trackedEvents = new CopyOnWriteArraySet();
        this.visibilitySource = VisibilitySource.Network;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onBrokenCreativeEvent$lambda$22$lambda$21(AdResponse it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        return "onBrokenCreativeEvent - " + it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processClickVerified$lambda$12$lambda$11(AdResponse it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        return "processClickVerified - " + it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processClosed$lambda$16$lambda$15(AdResponseAdProcessCallback this$0, AdResponse it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        return "processClosed (" + this$0.isFinished + ") - " + it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processDestroy$lambda$20$lambda$19(AdResponse it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        return "processDestroy - " + it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processExpired$lambda$18$lambda$17(AdResponse it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        return "processExpired - " + it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processFillAd$lambda$5$lambda$4(AdResponse it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        return "processFillAd - " + it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processFinished$lambda$14$lambda$13(AdResponse it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        return "processFinished - " + it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processLoadFail$lambda$3$lambda$2(BMError bmError) {
        Intrinsics.checkNotNullParameter(bmError, "$bmError");
        return "processLoadFail - " + bmError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processLoadSuccess$lambda$1$lambda$0(AdResponse it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        return "processLoadSuccess - " + it;
    }

    public static /* synthetic */ void processResultShown$default(AdResponseAdProcessCallback adResponseAdProcessCallback, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function1 = null;
        }
        adResponseAdProcessCallback.processResultShown(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processResultShown$lambda$9$lambda$8(AdResponse it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        return "processShown - " + it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processShowFail$lambda$7$lambda$6(BMError bmError) {
        Intrinsics.checkNotNullParameter(bmError, "$bmError");
        return "processShowFail - " + bmError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processViewabilityEvent$lambda$23(int i2, AdResponse adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "$adResponse");
        return "processViewabilityEvent (Unknown action code - " + i2 + ") - " + adResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processViewabilityEvent$lambda$24(ActionEvent actionEvent, BMError bMError) {
        Intrinsics.checkNotNullParameter(actionEvent, "$actionEvent");
        return "processViewabilityEvent (" + actionEvent + "), error - " + bMError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processViewabilityEvent$lambda$25(ActionEvent actionEvent, AdResponse adResponse) {
        Intrinsics.checkNotNullParameter(actionEvent, "$actionEvent");
        Intrinsics.checkNotNullParameter(adResponse, "$adResponse");
        return "processViewabilityEvent (" + actionEvent + ") - " + adResponse;
    }

    public final void appendCallback(@NotNull AdProcessCallback adProcessCallback) {
        Intrinsics.checkNotNullParameter(adProcessCallback, "adProcessCallback");
        synchronized (this.mutexCallback) {
            this.adProcessCallbackMap.put(adProcessCallback, Boolean.TRUE);
        }
    }

    @VisibleForTesting
    public final boolean canSendShownCallback() {
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.visibilitySource.ordinal()];
        if (i2 == 1) {
            return isBidMachineShowTracked();
        }
        if (i2 == 2) {
            return isNetworkShowTracked();
        }
        if (i2 == 3) {
            return isBidMachineShowTracked() && isNetworkShowTracked();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void destroy() {
        this.weakAdResponse.clear();
        synchronized (this.mutexCallback) {
            this.adProcessCallbackMap.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @VisibleForTesting
    public final void executeOnCallback(@NotNull Function1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        synchronized (this.mutexCallback) {
            try {
                for (AdProcessCallback adProcessCallback : new ArrayList(this.adProcessCallbackMap.keySet())) {
                    Intrinsics.checkNotNullExpressionValue(adProcessCallback, "adProcessCallback");
                    action.invoke(adProcessCallback);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    public final Map<AdProcessCallback, Boolean> getAdProcessCallbackMap() {
        return this.adProcessCallbackMap;
    }

    @Nullable
    public final AdResponse getAdResponse() {
        return this.weakAdResponse.get();
    }

    @VisibleForTesting
    public final boolean isBidMachineShowTracked() {
        return this.isVisibilityTrackerShownTracked.get();
    }

    public final boolean isLoaded() {
        return this.isLoaded.get();
    }

    public final boolean isLoading() {
        return this.isLoading.get();
    }

    @VisibleForTesting
    public final boolean isNetworkShowTracked() {
        return this.isShownTracked.get();
    }

    public final boolean isShownTracked() {
        return this.isResultShownTracked.get();
    }

    @Override // io.bidmachine.AdProcessCallback
    public void onBrokenCreativeEvent(@Nullable Map<String, ? extends Object> params) {
        final AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponseAdProcessCallback$$ExternalSyntheticLambda12
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String onBrokenCreativeEvent$lambda$22$lambda$21;
                    onBrokenCreativeEvent$lambda$22$lambda$21 = AdResponseAdProcessCallback.onBrokenCreativeEvent$lambda$22$lambda$21(AdResponse.this);
                    return onBrokenCreativeEvent$lambda$22$lambda$21;
                }
            });
            adResponse.eventFinish(TrackEventType.BrokenCreativeDetector, false, (Map<String, Object>) params);
        }
    }

    public final boolean onLoading() {
        return this.isLoading.compareAndSet(false, true);
    }

    @Override // io.bidmachine.AdProcessCallback
    public void onNetworkViewabilityEvent(@NotNull ActionEvent actionEvent, @Nullable BMError bmError) {
        Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
        processViewabilityEvent(actionEvent, bmError);
        if (actionEvent.getIsBillable() && bmError == null) {
            processNetworkVisibilityEventShown();
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void onVisibilityTrackerViewabilityEvent(@NotNull ActionEvent actionEvent, @Nullable BMError bmError) {
        Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
        processViewabilityEvent(actionEvent, bmError);
        if (actionEvent.getIsBillable() && bmError == null) {
            processVisibilityTrackerShown();
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClickVerified(@Nullable SystemComponent systemComponent) {
        final AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponseAdProcessCallback$$ExternalSyntheticLambda0
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String processClickVerified$lambda$12$lambda$11;
                    processClickVerified$lambda$12$lambda$11 = AdResponseAdProcessCallback.processClickVerified$lambda$12$lambda$11(AdResponse.this);
                    return processClickVerified$lambda$12$lambda$11;
                }
            });
            adResponse.processClickVerified(systemComponent);
        }
        executeOnCallback(new a(systemComponent));
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClicked(@Nullable SystemComponent systemComponent) {
        AdResponse adResponse = getAdResponse();
        if (adResponse == null) {
            processClickVerified(systemComponent);
        } else if (adResponse.processClicked()) {
            processClickVerified(systemComponent);
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClosed() {
        final AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponseAdProcessCallback$$ExternalSyntheticLambda3
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String processClosed$lambda$16$lambda$15;
                    processClosed$lambda$16$lambda$15 = AdResponseAdProcessCallback.processClosed$lambda$16$lambda$15(AdResponseAdProcessCallback.this, adResponse);
                    return processClosed$lambda$16$lambda$15;
                }
            });
            adResponse.processClosed(this.isFinished);
        }
        executeOnCallback(b.a);
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processDestroy() {
        executeOnCallback(c.a);
        final AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponseAdProcessCallback$$ExternalSyntheticLambda5
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String processDestroy$lambda$20$lambda$19;
                    processDestroy$lambda$20$lambda$19 = AdResponseAdProcessCallback.processDestroy$lambda$20$lambda$19(AdResponse.this);
                    return processDestroy$lambda$20$lambda$19;
                }
            });
            adResponse.destroy();
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processExpired() {
        final AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponseAdProcessCallback$$ExternalSyntheticLambda1
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String processExpired$lambda$18$lambda$17;
                    processExpired$lambda$18$lambda$17 = AdResponseAdProcessCallback.processExpired$lambda$18$lambda$17(AdResponse.this);
                    return processExpired$lambda$18$lambda$17;
                }
            });
            adResponse.processExpired();
        } else {
            adResponse = null;
        }
        executeOnCallback(d.a);
        if (adResponse != null) {
            adResponse.notifyExpired(false);
        }
        processDestroy();
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processFillAd() {
        final AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponseAdProcessCallback$$ExternalSyntheticLambda2
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String processFillAd$lambda$5$lambda$4;
                    processFillAd$lambda$5$lambda$4 = AdResponseAdProcessCallback.processFillAd$lambda$5$lambda$4(AdResponse.this);
                    return processFillAd$lambda$5$lambda$4;
                }
            });
            adResponse.processFillAd();
        }
        executeOnCallback(e.a);
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processFinished() {
        final AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponseAdProcessCallback$$ExternalSyntheticLambda4
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String processFinished$lambda$14$lambda$13;
                    processFinished$lambda$14$lambda$13 = AdResponseAdProcessCallback.processFinished$lambda$14$lambda$13(AdResponse.this);
                    return processFinished$lambda$14$lambda$13;
                }
            });
            adResponse.processFinished();
            this.isFinished = true;
        }
        executeOnCallback(f.a);
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processLoadFail(@NotNull final BMError bmError) {
        Intrinsics.checkNotNullParameter(bmError, "bmError");
        if (this.isLoadTracked.compareAndSet(false, true)) {
            this.isLoaded.set(false);
            this.isLoading.set(false);
            AdResponse adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponseAdProcessCallback$$ExternalSyntheticLambda8
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String processLoadFail$lambda$3$lambda$2;
                        processLoadFail$lambda$3$lambda$2 = AdResponseAdProcessCallback.processLoadFail$lambda$3$lambda$2(BMError.this);
                        return processLoadFail$lambda$3$lambda$2;
                    }
                });
                adResponse.processLoadFail(bmError);
            }
            executeOnCallback(new g(bmError));
            processDestroy();
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processLoadSuccess() {
        if (this.isLoadTracked.compareAndSet(false, true)) {
            this.isLoaded.set(true);
            this.isLoading.set(false);
            final AdResponse adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponseAdProcessCallback$$ExternalSyntheticLambda7
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String processLoadSuccess$lambda$1$lambda$0;
                        processLoadSuccess$lambda$1$lambda$0 = AdResponseAdProcessCallback.processLoadSuccess$lambda$1$lambda$0(AdResponse.this);
                        return processLoadSuccess$lambda$1$lambda$0;
                    }
                });
                adResponse.processLoadSuccess();
            }
            UserAgentManager.updateWebViewUserAgent();
            executeOnCallback(h.a);
        }
    }

    @VisibleForTesting
    public final void processNetworkVisibilityEventShown() {
        if (this.isShownTracked.compareAndSet(false, true) && canSendShownCallback()) {
            processResultShown$default(this, null, 1, null);
        }
    }

    @VisibleForTesting
    public final void processResultShown(@Nullable Function1 postback) {
        if (this.isResultShownTracked.compareAndSet(false, true)) {
            final AdResponse adResponse = getAdResponse();
            if (adResponse != null) {
                Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponseAdProcessCallback$$ExternalSyntheticLambda6
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String processResultShown$lambda$9$lambda$8;
                        processResultShown$lambda$9$lambda$8 = AdResponseAdProcessCallback.processResultShown$lambda$9$lambda$8(AdResponse.this);
                        return processResultShown$lambda$9$lambda$8;
                    }
                });
                adResponse.processShown();
                if (postback != null) {
                    postback.invoke(adResponse);
                }
            }
            executeOnCallback(i.a);
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processShowFail(@NotNull final BMError bmError) {
        Intrinsics.checkNotNullParameter(bmError, "bmError");
        AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponseAdProcessCallback$$ExternalSyntheticLambda13
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String processShowFail$lambda$7$lambda$6;
                    processShowFail$lambda$7$lambda$6 = AdResponseAdProcessCallback.processShowFail$lambda$7$lambda$6(BMError.this);
                    return processShowFail$lambda$7$lambda$6;
                }
            });
            adResponse.processShowFail(bmError);
        }
        executeOnCallback(new j(bmError));
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processShown() {
        if (this.isShownTracked.compareAndSet(false, true) && canSendShownCallback()) {
            processResultShown(new k());
        }
    }

    @VisibleForTesting
    public final void processViewabilityEvent(@NotNull final ActionEvent actionEvent, @Nullable final BMError bmError) {
        Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
        final AdResponse adResponse = getAdResponse();
        if (adResponse == null) {
            return;
        }
        final int actionCode = actionEvent.getActionCode();
        TrackEventType fromNumber = TrackEventType.fromNumber(actionCode);
        if (fromNumber == null) {
            Logger.e(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponseAdProcessCallback$$ExternalSyntheticLambda9
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String processViewabilityEvent$lambda$23;
                    processViewabilityEvent$lambda$23 = AdResponseAdProcessCallback.processViewabilityEvent$lambda$23(actionCode, adResponse);
                    return processViewabilityEvent$lambda$23;
                }
            });
        } else if (this.trackedEvents.add(fromNumber)) {
            if (bmError != null) {
                Logger.e(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponseAdProcessCallback$$ExternalSyntheticLambda10
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String processViewabilityEvent$lambda$24;
                        processViewabilityEvent$lambda$24 = AdResponseAdProcessCallback.processViewabilityEvent$lambda$24(ActionEvent.this, bmError);
                        return processViewabilityEvent$lambda$24;
                    }
                });
            } else {
                Logger.d(adResponse.tag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.AdResponseAdProcessCallback$$ExternalSyntheticLambda11
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String processViewabilityEvent$lambda$25;
                        processViewabilityEvent$lambda$25 = AdResponseAdProcessCallback.processViewabilityEvent$lambda$25(ActionEvent.this, adResponse);
                        return processViewabilityEvent$lambda$25;
                    }
                });
            }
            adResponse.eventFinish(fromNumber, actionEvent.getIsBillable(), bmError);
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processVisibilityTrackerShown() {
        if (this.isVisibilityTrackerShownTracked.compareAndSet(false, true) && canSendShownCallback()) {
            processResultShown$default(this, null, 1, null);
        }
    }

    public final void removeCallback(@NotNull AdProcessCallback adProcessCallback) {
        Intrinsics.checkNotNullParameter(adProcessCallback, "adProcessCallback");
        synchronized (this.mutexCallback) {
            this.adProcessCallbackMap.remove(adProcessCallback);
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void setVisibilitySource(@NotNull VisibilitySource visibilitySource) {
        Intrinsics.checkNotNullParameter(visibilitySource, "visibilitySource");
        this.visibilitySource = visibilitySource;
    }
}
