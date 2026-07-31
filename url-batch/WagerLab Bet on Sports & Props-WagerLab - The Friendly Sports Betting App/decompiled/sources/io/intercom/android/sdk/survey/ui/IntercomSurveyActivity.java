package io.intercom.android.sdk.survey.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.activities.IntercomBaseActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.survey.CloseEventTrigger;
import io.intercom.android.sdk.survey.SurveyLaunchMode;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyViewModel;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import io.intercom.android.sdk.utilities.PhoneNumberValidator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IntercomSurveyActivity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\tH\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0016R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/survey/ui/IntercomSurveyActivity;", "Lio/intercom/android/sdk/activities/IntercomBaseActivity;", "<init>", "()V", "injector", "Lio/intercom/android/sdk/Injector;", "kotlin.jvm.PlatformType", "Lio/intercom/android/sdk/Injector;", "viewModel", "Lio/intercom/android/sdk/survey/SurveyViewModel;", "getViewModel", "()Lio/intercom/android/sdk/survey/SurveyViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "createVM", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onBackPressed", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomSurveyActivity extends IntercomBaseActivity {
    private static final String PARCEL_SURVEY_ID = "parcel_survey_id";
    private final Injector injector = Injector.get();

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            SurveyViewModel viewModel_delegate$lambda$0;
            viewModel_delegate$lambda$0 = IntercomSurveyActivity.viewModel_delegate$lambda$0(IntercomSurveyActivity.this);
            return viewModel_delegate$lambda$0;
        }
    });

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final Intent buildIntent(Context context) {
        return INSTANCE.buildIntent(context);
    }

    @JvmStatic
    public static final Intent buildIntent(Context context, String str) {
        return INSTANCE.buildIntent(context, str);
    }

    /* compiled from: IntercomSurveyActivity.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/survey/ui/IntercomSurveyActivity$Companion;", "", "<init>", "()V", "PARCEL_SURVEY_ID", "", "buildIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "surveyId", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Intent buildIntent(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return buildIntent$default(this, context, null, 2, null);
        }

        private Companion() {
        }

        public static /* synthetic */ Intent buildIntent$default(Companion companion, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.buildIntent(context, str);
        }

        @JvmStatic
        public final Intent buildIntent(Context context, String surveyId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) IntercomSurveyActivity.class);
            intent.putExtra(IntercomSurveyActivity.PARCEL_SURVEY_ID, surveyId);
            intent.setFlags(335544320);
            return intent;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SurveyViewModel getViewModel() {
        return (SurveyViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurveyViewModel viewModel_delegate$lambda$0(IntercomSurveyActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.createVM();
    }

    private final SurveyViewModel createVM() {
        String stringExtra = getIntent().getStringExtra(PARCEL_SURVEY_ID);
        return SurveyViewModel.INSTANCE.create(this, stringExtra != null ? new SurveyLaunchMode.Programmatic(stringExtra) : new SurveyLaunchMode.Automatic(this.injector.getDataLayer().getSurveyData().getValue()));
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        IntercomSurveyActivity intercomSurveyActivity = this;
        EdgeToEdge.enable$default(intercomSurveyActivity, null, null, 3, null);
        super.onCreate(savedInstanceState);
        PhoneNumberValidator.loadCountryAreaCodes(this);
        ComponentActivityKt.setContent$default(intercomSurveyActivity, null, ComposableLambdaKt.composableLambdaInstance(-179321000, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                    Intrinsics.checkNotNullExpressionValue(appConfig, "get(...)");
                    ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, ComposableLambdaKt.rememberComposableLambda(-2107771943, true, new AnonymousClass1(IntercomSurveyActivity.this), composer, 54), composer, 56);
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* compiled from: IntercomSurveyActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ IntercomSurveyActivity this$0;

                AnonymousClass1(IntercomSurveyActivity intercomSurveyActivity) {
                    this.this$0 = intercomSurveyActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    SurveyViewModel viewModel;
                    SurveyViewModel viewModel2;
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        viewModel = this.this$0.getViewModel();
                        State collectAsState = SnapshotStateKt.collectAsState(viewModel.getState(), null, composer, 8, 1);
                        WindowCompat.getInsetsController(this.this$0.getWindow(), this.this$0.getWindow().getDecorView()).setAppearanceLightStatusBars(ColorExtensionsKt.m12245isLightColor8_81llA(ColorExtensionsKt.m12237darken8_81llA(((SurveyState) collectAsState.getValue()).getSurveyUiColors().m11685getBackground0d7_KjU())));
                        SurveyState surveyState = (SurveyState) collectAsState.getValue();
                        viewModel2 = this.this$0.getViewModel();
                        C01331 c01331 = new C01331(viewModel2);
                        final IntercomSurveyActivity intercomSurveyActivity = this.this$0;
                        Function0 function0 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006c: CONSTRUCTOR (r2v6 'function0' kotlin.jvm.functions.Function0) = (r10v10 'intercomSurveyActivity' io.intercom.android.sdk.survey.ui.IntercomSurveyActivity A[DONT_INLINE]) A[DECLARE_VAR, MD:(io.intercom.android.sdk.survey.ui.IntercomSurveyActivity):void (m)] call: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1$1$$ExternalSyntheticLambda0.<init>(io.intercom.android.sdk.survey.ui.IntercomSurveyActivity):void type: CONSTRUCTOR in method: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes8.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 23 more
                            */
                        /*
                            this = this;
                            r10 = r10 & 11
                            r0 = 2
                            if (r10 != r0) goto L10
                            boolean r10 = r9.getSkipping()
                            if (r10 != 0) goto Lc
                            goto L10
                        Lc:
                            r9.skipToGroupEnd()
                            return
                        L10:
                            io.intercom.android.sdk.survey.ui.IntercomSurveyActivity r10 = r8.this$0
                            io.intercom.android.sdk.survey.SurveyViewModel r10 = io.intercom.android.sdk.survey.ui.IntercomSurveyActivity.access$getViewModel(r10)
                            kotlinx.coroutines.flow.MutableStateFlow r10 = r10.getState()
                            kotlinx.coroutines.flow.StateFlow r10 = (kotlinx.coroutines.flow.StateFlow) r10
                            r0 = 8
                            r1 = 1
                            r2 = 0
                            androidx.compose.runtime.State r10 = androidx.compose.runtime.SnapshotStateKt.collectAsState(r10, r2, r9, r0, r1)
                            java.lang.Object r0 = r10.getValue()
                            io.intercom.android.sdk.survey.SurveyState r0 = (io.intercom.android.sdk.survey.SurveyState) r0
                            io.intercom.android.sdk.survey.SurveyUiColors r0 = r0.getSurveyUiColors()
                            io.intercom.android.sdk.survey.ui.IntercomSurveyActivity r1 = r8.this$0
                            android.view.Window r1 = r1.getWindow()
                            io.intercom.android.sdk.survey.ui.IntercomSurveyActivity r2 = r8.this$0
                            android.view.Window r2 = r2.getWindow()
                            android.view.View r2 = r2.getDecorView()
                            androidx.core.view.WindowInsetsControllerCompat r1 = androidx.core.view.WindowCompat.getInsetsController(r1, r2)
                            long r2 = r0.m11685getBackground0d7_KjU()
                            long r2 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m12237darken8_81llA(r2)
                            boolean r0 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m12245isLightColor8_81llA(r2)
                            r1.setAppearanceLightStatusBars(r0)
                            java.lang.Object r10 = r10.getValue()
                            r0 = r10
                            io.intercom.android.sdk.survey.SurveyState r0 = (io.intercom.android.sdk.survey.SurveyState) r0
                            io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1$1$1 r10 = new io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1$1$1
                            io.intercom.android.sdk.survey.ui.IntercomSurveyActivity r1 = r8.this$0
                            io.intercom.android.sdk.survey.SurveyViewModel r1 = io.intercom.android.sdk.survey.ui.IntercomSurveyActivity.access$getViewModel(r1)
                            r10.<init>(r1)
                            kotlin.reflect.KFunction r10 = (kotlin.reflect.KFunction) r10
                            r1 = r10
                            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                            io.intercom.android.sdk.survey.ui.IntercomSurveyActivity r10 = r8.this$0
                            io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1$1$$ExternalSyntheticLambda0 r2 = new io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1$1$$ExternalSyntheticLambda0
                            r2.<init>(r10)
                            io.intercom.android.sdk.survey.ui.IntercomSurveyActivity r10 = r8.this$0
                            io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1$1$$ExternalSyntheticLambda1 r3 = new io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1$1$$ExternalSyntheticLambda1
                            r3.<init>(r10)
                            io.intercom.android.sdk.survey.ui.IntercomSurveyActivity r10 = r8.this$0
                            io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1$1$$ExternalSyntheticLambda2 r4 = new io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1$1$$ExternalSyntheticLambda2
                            r4.<init>(r10)
                            r6 = 0
                            r7 = 0
                            r5 = r9
                            io.intercom.android.sdk.survey.ui.components.SurveyComponentKt.SurveyComponent(r0, r1, r2, r3, r4, r5, r6, r7)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                    }

                    /* compiled from: IntercomSurveyActivity.kt */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
                    /* synthetic */ class C01331 extends FunctionReferenceImpl implements Function1<CoroutineScope, Unit> {
                        C01331(Object obj) {
                            super(1, obj, SurveyViewModel.class, "continueClicked", "continueClicked(Lkotlinx/coroutines/CoroutineScope;)V", 0);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CoroutineScope coroutineScope) {
                            invoke2(coroutineScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(CoroutineScope coroutineScope) {
                            ((SurveyViewModel) this.receiver).continueClicked(coroutineScope);
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$0(IntercomSurveyActivity this$0) {
                        SurveyViewModel viewModel;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        viewModel = this$0.getViewModel();
                        viewModel.onCloseClicked(CloseEventTrigger.CLOSE_BUTTON);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2(IntercomSurveyActivity this$0, SurveyState.Content.SecondaryCta it) {
                        SurveyViewModel viewModel;
                        Injector injector;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        viewModel = this$0.getViewModel();
                        viewModel.onSecondaryCtaClicked(it);
                        String destination = it.getDestination();
                        IntercomSurveyActivity intercomSurveyActivity = this$0;
                        injector = this$0.injector;
                        LinkOpener.handleUrl(destination, intercomSurveyActivity, injector.getApi());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1(IntercomSurveyActivity this$0, String it) {
                        SurveyViewModel viewModel;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        viewModel = this$0.getViewModel();
                        viewModel.onAnswerUpdated();
                        return Unit.INSTANCE;
                    }
                }
            }), 1, null);
        }

        @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
        protected void onStart() {
            super.onStart();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new IntercomSurveyActivity$onStart$1(this, null), 3, null);
            getViewModel().onUiLoaded();
        }

        @Override // androidx.activity.ComponentActivity, android.app.Activity
        public void onBackPressed() {
            super.onBackPressed();
        }
    }
