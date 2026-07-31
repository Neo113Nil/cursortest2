package com.mobilefuse.sdk.omid;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.mobilefuse.Omid;
import com.iab.omid.library.mobilefuse.adsession.AdSession;
import com.iab.omid.library.mobilefuse.adsession.AdSessionConfiguration;
import com.iab.omid.library.mobilefuse.adsession.AdSessionContext;
import com.iab.omid.library.mobilefuse.adsession.CreativeType;
import com.iab.omid.library.mobilefuse.adsession.ImpressionType;
import com.iab.omid.library.mobilefuse.adsession.Owner;
import com.iab.omid.library.mobilefuse.adsession.Partner;
import com.iab.omid.library.mobilefuse.adsession.VerificationScriptResource;
import com.mobilefuse.sdk.AdRendererType;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.MobileFuseDefaults;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.core.R;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.mobilefuse.sdk.service.MobileFuseService;
import com.mobilefuse.sdk.storyboard.StoryboardOmidBridge;
import com.mobilefuse.sdk.telemetry.TelemetryManager;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OmidService.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u001d\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010\u001f\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!J)\u0010&\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00040\"H\u0010¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020\u0004H\u0014¢\u0006\u0004\b'\u0010\u0003R.\u0010)\u001a\u0004\u0018\u00010\t2\b\u0010(\u001a\u0004\u0018\u00010\t8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010\u0003\u001a\u0004\b+\u0010,R.\u0010/\u001a\u0004\u0018\u00010.2\b\u0010(\u001a\u0004\u0018\u00010.8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010\u0003\u001a\u0004\b1\u00102R\u0014\u00104\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010*¨\u00065"}, d2 = {"Lcom/mobilefuse/sdk/omid/OmidService;", "Lcom/mobilefuse/sdk/service/MobileFuseService;", "<init>", "()V", "", "reportOmidVersion", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "", "completeAction", "loadOmidJs", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Lcom/mobilefuse/sdk/AdRendererType;", "adRendererType", "Lcom/mobilefuse/sdk/omid/OmidBridge;", "createOmidBridge", "(Lcom/mobilefuse/sdk/AdRendererType;)Lcom/mobilefuse/sdk/omid/OmidBridge;", "Landroid/webkit/WebView;", "webView", "customReferenceData", "Lcom/iab/omid/library/mobilefuse/adsession/AdSession;", "getHtmlAdSession", "(Landroid/content/Context;Landroid/webkit/WebView;Ljava/lang/String;)Lcom/iab/omid/library/mobilefuse/adsession/AdSession;", "Landroid/view/View;", "rootContainerView", "", "Lcom/iab/omid/library/mobilefuse/adsession/VerificationScriptResource;", "verificationScripts", "getNativeVideoAdSession", "(Landroid/content/Context;Landroid/view/View;Ljava/util/List;Ljava/lang/String;)Lcom/iab/omid/library/mobilefuse/adsession/AdSession;", "getNativeAdSession", "ensureOmidActivated", "(Landroid/content/Context;)V", "Lkotlin/Function2;", "", "initServiceImpl$mobilefuse_sdk_core_release", "(Lkotlin/jvm/functions/Function2;)V", "initServiceImpl", "resetImpl", "<set-?>", "omidJsContent", "Ljava/lang/String;", "getOmidJsContent", "()Ljava/lang/String;", "getOmidJsContent$annotations", "Lcom/iab/omid/library/mobilefuse/adsession/Partner;", "omidPartner", "Lcom/iab/omid/library/mobilefuse/adsession/Partner;", "getOmidPartner", "()Lcom/iab/omid/library/mobilefuse/adsession/Partner;", "getOmidPartner$annotations", "CERTIFIED_OM_SDK_VERSION", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes10.dex */
public final class OmidService extends MobileFuseService {
    private static final String CERTIFIED_OM_SDK_VERSION = "1.8.0";

    @NotNull
    public static final OmidService INSTANCE = new OmidService();

    @Nullable
    private static String omidJsContent;

    @Nullable
    private static Partner omidPartner;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    /* loaded from: classes6.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdRendererType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AdRendererType.MRAID.ordinal()] = 1;
            iArr[AdRendererType.VAST.ordinal()] = 2;
            iArr[AdRendererType.STORYBOARD.ordinal()] = 3;
        }
    }

    public static /* synthetic */ void getOmidJsContent$annotations() {
    }

    public static /* synthetic */ void getOmidPartner$annotations() {
    }

    private OmidService() {
    }

    @Nullable
    public static final String getOmidJsContent() {
        return omidJsContent;
    }

    @Nullable
    public static final Partner getOmidPartner() {
        return omidPartner;
    }

    @Nullable
    public static final AdSession getHtmlAdSession(@NotNull Context context, @NotNull WebView webView, @Nullable String customReferenceData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Partner partner = omidPartner;
            if (partner == null) {
                return null;
            }
            INSTANCE.ensureOmidActivated(context);
            AdSessionConfiguration createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
            Intrinsics.checkNotNullExpressionValue(createAdSessionConfiguration, "AdSessionConfiguration.c…onScripts*/\n            )");
            AdSessionContext createHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(partner, webView, null, customReferenceData);
            Intrinsics.checkNotNullExpressionValue(createHtmlAdSessionContext, "AdSessionContext.createH…ReferenceData*/\n        )");
            AdSession createAdSession = AdSession.createAdSession(createAdSessionConfiguration, createHtmlAdSessionContext);
            Intrinsics.checkNotNullExpressionValue(createAdSession, "AdSession.createAdSessio…ration, adSessionContext)");
            createAdSession.registerAdView(webView);
            return createAdSession;
        } catch (Throwable th) {
            if (OmidService$getHtmlAdSession$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return null;
        }
    }

    @Nullable
    public static final AdSession getNativeAdSession(@NotNull Context context, @NotNull View rootContainerView, @NotNull List<VerificationScriptResource> verificationScripts, @Nullable String customReferenceData) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootContainerView, "rootContainerView");
        Intrinsics.checkNotNullParameter(verificationScripts, "verificationScripts");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Partner partner = omidPartner;
            if (partner == null || (str = omidJsContent) == null) {
                return null;
            }
            INSTANCE.ensureOmidActivated(context);
            AdSessionConfiguration createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
            Intrinsics.checkNotNullExpressionValue(createAdSessionConfiguration, "AdSessionConfiguration.c…onScripts*/\n            )");
            AdSessionContext createNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(partner, str, verificationScripts, null, customReferenceData);
            Intrinsics.checkNotNullExpressionValue(createNativeAdSessionContext, "AdSessionContext.createN…ReferenceData*/\n        )");
            AdSession createAdSession = AdSession.createAdSession(createAdSessionConfiguration, createNativeAdSessionContext);
            Intrinsics.checkNotNullExpressionValue(createAdSession, "AdSession.createAdSessio…ration, adSessionContext)");
            createAdSession.registerAdView(rootContainerView);
            return createAdSession;
        } catch (Throwable th) {
            if (OmidService$getNativeAdSession$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return null;
        }
    }

    @Nullable
    public static final AdSession getNativeVideoAdSession(@NotNull Context context, @NotNull View rootContainerView, @NotNull List<VerificationScriptResource> verificationScripts, @Nullable String customReferenceData) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootContainerView, "rootContainerView");
        Intrinsics.checkNotNullParameter(verificationScripts, "verificationScripts");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Partner partner = omidPartner;
            if (partner == null || (str = omidJsContent) == null) {
                return null;
            }
            INSTANCE.ensureOmidActivated(context);
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            AdSessionConfiguration createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
            Intrinsics.checkNotNullExpressionValue(createAdSessionConfiguration, "AdSessionConfiguration.c…onScripts*/\n            )");
            AdSessionContext createNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(partner, str, verificationScripts, null, customReferenceData);
            Intrinsics.checkNotNullExpressionValue(createNativeAdSessionContext, "AdSessionContext.createN…ReferenceData*/\n        )");
            AdSession createAdSession = AdSession.createAdSession(createAdSessionConfiguration, createNativeAdSessionContext);
            Intrinsics.checkNotNullExpressionValue(createAdSession, "AdSession.createAdSessio…ration, adSessionContext)");
            createAdSession.registerAdView(rootContainerView);
            return createAdSession;
        } catch (Throwable th) {
            if (OmidService$getNativeVideoAdSession$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return null;
        }
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    public void initServiceImpl$mobilefuse_sdk_core_release(@NotNull final Function2 completeAction) {
        Either errorResult;
        Context globalContext;
        OmidService omidService;
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            globalContext = AppLifecycleHelper.getGlobalContext();
            Omid.activate(globalContext);
            omidService = INSTANCE;
            omidService.reportOmidVersion();
        } catch (Throwable th) {
            if (OmidService$initServiceImpl$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (!Omid.isActive()) {
            MobileFuse.INSTANCE.logDebug("Can't activate the Omid sdk");
            completeAction.invoke(omidService, Boolean.FALSE);
            return;
        }
        omidService.loadOmidJs(globalContext, new Function1() { // from class: com.mobilefuse.sdk.omid.OmidService$initServiceImpl$$inlined$gracefullyHandleException$lambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable String str) {
                if (str != null) {
                    OmidService.omidJsContent = str;
                    OmidService.omidPartner = Partner.createPartner(MobileFuseDefaults.OMID_PARTNER_NAME, "1.8.0");
                    Function2.this.invoke(OmidService.INSTANCE, Boolean.TRUE);
                } else {
                    MobileFuse.INSTANCE.logDebug("Can't find the \"omsdk_v1.js\"");
                    Function2.this.invoke(OmidService.INSTANCE, Boolean.FALSE);
                }
            }
        });
        errorResult = new SuccessResult(Unit.INSTANCE);
        if (errorResult instanceof ErrorResult) {
            completeAction.invoke(INSTANCE, Boolean.FALSE);
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            ((SuccessResult) errorResult).getValue();
        }
    }

    private final void reportOmidVersion() {
        String omidVersion = Omid.getVersion();
        TelemetryManager.Companion companion = TelemetryManager.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(omidVersion, "omidVersion");
        companion.registerModule("com.iab.omid.library.mobilefuse", omidVersion);
    }

    private final void loadOmidJs(final Context context, final Function1 completeAction) {
        final Flow flow = FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector<? super String>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull FlowCollector<? super String> receiver) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
                InputStream openRawResource = resources.openRawResource(R.raw.mobilefuse_omsdk_v1);
                Intrinsics.checkNotNullExpressionValue(openRawResource, "res.openRawResource(R.raw.mobilefuse_omsdk_v1)");
                byte[] bArr = new byte[openRawResource.available()];
                int read = openRawResource.read(bArr);
                Charset forName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(\"UTF-8\")");
                receiver.emit(new SuccessResult(new String(bArr, 0, read, forName)));
            }
        });
        final Schedulers schedulers = Schedulers.IO;
        final Flow flow2 = FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$$inlined$emitOn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector<? super String>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super String> flow3) {
                Intrinsics.checkNotNullParameter(flow3, "$this$flow");
                SchedulersKt.runOnScheduler(schedulers, new Function0() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$$inlined$emitOn$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$.inlined.emitOn.1.1.1
                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public void emitError(@NotNull Throwable error) {
                                Intrinsics.checkNotNullParameter(error, "error");
                                FlowCollector.DefaultImpls.emitError(this, error);
                            }

                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public void emitSuccess(T t) {
                                FlowCollector.DefaultImpls.emitSuccess(this, t);
                            }

                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                flow3.emit(value);
                            }
                        });
                    }
                });
            }
        });
        final Schedulers schedulers2 = Schedulers.MAIN;
        final Flow flow3 = FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$$inlined$runOn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector<? super String>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super String> flow4) {
                Intrinsics.checkNotNullParameter(flow4, "$this$flow");
                Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$$inlined$runOn$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitError(@NotNull Throwable error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        FlowCollector.DefaultImpls.emitError(this, error);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitSuccess(T t) {
                        FlowCollector.DefaultImpls.emitSuccess(this, t);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        final FlowCollector flowCollector = flow4;
                        SchedulersKt.runOnScheduler(schedulers2, new Function0() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$.inlined.runOn.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                invoke();
                                return Unit.INSTANCE;
                            }

                            public final void invoke() {
                                FlowCollector.this.emit(value);
                            }
                        });
                    }
                });
            }
        });
        FlowKt.flow(new Function1() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$$inlined$catchElse$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FlowCollector<? super String>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final FlowCollector<? super String> flow4) {
                Intrinsics.checkNotNullParameter(flow4, "$this$flow");
                Flow.this.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$$inlined$catchElse$1.1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitError(@NotNull Throwable error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        FlowCollector.DefaultImpls.emitError(this, error);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public void emitSuccess(T t) {
                        FlowCollector.DefaultImpls.emitSuccess(this, t);
                    }

                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        FlowCollector flowCollector = flow4;
                        if (value instanceof ErrorResult) {
                            flowCollector.emit(new SuccessResult(null));
                        } else if (value instanceof SuccessResult) {
                            flowCollector.emit(value);
                        }
                    }
                });
            }
        }).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.omid.OmidService$loadOmidJs$$inlined$collectResult$1
            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitError(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                FlowCollector.DefaultImpls.emitError(this, error);
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitSuccess(T t) {
                FlowCollector.DefaultImpls.emitSuccess(this, t);
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof SuccessResult) {
                    Function1.this.invoke(((SuccessResult) result).getValue());
                }
            }
        });
    }

    @NotNull
    public static final OmidBridge createOmidBridge(@NotNull AdRendererType adRendererType) {
        Intrinsics.checkNotNullParameter(adRendererType, "adRendererType");
        int i = WhenMappings.$EnumSwitchMapping$0[adRendererType.ordinal()];
        if (i == 1) {
            return new MraidOmidBridgeImpl();
        }
        if (i == 2) {
            return new VastOmidBridgeImpl();
        }
        if (i == 3) {
            return new StoryboardOmidBridge();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void ensureOmidActivated(Context context) {
        if (Omid.isActive()) {
            return;
        }
        Omid.activate(context.getApplicationContext());
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    protected void resetImpl() {
        omidPartner = null;
        omidJsContent = null;
    }
}
