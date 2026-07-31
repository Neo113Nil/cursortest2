package io.intercom.android.sdk.helpcenter.articles;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.WindowCompat;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.articles.ArticleWebViewClient;
import io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.component.IntercomTopBarIcon;
import io.intercom.android.sdk.ui.component.IntercomTopBarKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IntercomArticleActivity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0015J\b\u0010\u0015\u001a\u00020\u0012H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity;", "Lio/intercom/android/sdk/helpcenter/IntercomHelpCenterBaseActivity;", "<init>", "()V", "arguments", "Lio/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity$ArticleActivityArguments;", "getArguments", "()Lio/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity$ArticleActivityArguments;", "arguments$delegate", "Lkotlin/Lazy;", "scrollBy", "Landroidx/compose/runtime/MutableIntState;", "viewModel", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "getViewModel", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "viewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setCookies", "ArticleActivityArguments", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomArticleActivity extends IntercomHelpCenterBaseActivity {
    private static final String ARTICLE_ID = "ARTICLE_ID";
    private static final String IS_SEARCH_BROWSE = "IS_FROM_SEARCH_BROWSE";
    private static final String METRIC_PLACE = "METRIC_PLACE";
    private static final String SHOULD_HIDE_REACTIONS = "SHOULD_HIDE_REACTIONS";

    /* renamed from: arguments$delegate, reason: from kotlin metadata */
    private final Lazy arguments = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            IntercomArticleActivity.ArticleActivityArguments arguments_delegate$lambda$0;
            arguments_delegate$lambda$0 = IntercomArticleActivity.arguments_delegate$lambda$0(IntercomArticleActivity.this);
            return arguments_delegate$lambda$0;
        }
    });
    private final MutableIntState scrollBy = SnapshotIntStateKt.mutableIntStateOf(0);

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ArticleViewModel viewModel_delegate$lambda$2;
            viewModel_delegate$lambda$2 = IntercomArticleActivity.viewModel_delegate$lambda$2(IntercomArticleActivity.this);
            return viewModel_delegate$lambda$2;
        }
    });

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final Intent buildIntent(Context context, ArticleActivityArguments articleActivityArguments) {
        return INSTANCE.buildIntent(context, articleActivityArguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleActivityArguments arguments_delegate$lambda$0(IntercomArticleActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Companion companion = INSTANCE;
        Intent intent = this$0.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.getArguments(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArticleActivityArguments getArguments() {
        return (ArticleActivityArguments) this.arguments.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArticleViewModel getViewModel() {
        return (ArticleViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleViewModel viewModel_delegate$lambda$2(final IntercomArticleActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = (this$0.getResources().getConfiguration().uiMode & 48) == 32;
        HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
        Intrinsics.checkNotNullExpressionValue(helpCenterApi, "getHelpCenterApi(...)");
        return ArticleViewModel.INSTANCE.create(this$0, helpCenterApi, Injector.get().getAppConfigProvider().get().getHelpCenterUrl(), this$0.getArguments().getMetricPlace(), this$0.getArguments().isFromSearchBrowse(), this$0.getArguments().getShouldHideReactions(), new Function1() { // from class: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit viewModel_delegate$lambda$2$lambda$1;
                viewModel_delegate$lambda$2$lambda$1 = IntercomArticleActivity.viewModel_delegate$lambda$2$lambda$1(IntercomArticleActivity.this, ((Integer) obj).intValue());
                return viewModel_delegate$lambda$2$lambda$1;
            }
        }, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewModel_delegate$lambda$2$lambda$1(IntercomArticleActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.scrollBy.setIntValue(i);
        return Unit.INSTANCE;
    }

    @Override // io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        IntercomArticleActivity intercomArticleActivity = this;
        EdgeToEdge.enable$default(intercomArticleActivity, null, null, 3, null);
        super.onCreate(savedInstanceState);
        ComponentActivityKt.setContent$default(intercomArticleActivity, null, ComposableLambdaKt.composableLambdaInstance(1674700077, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    final IntercomArticleActivity intercomArticleActivity2 = IntercomArticleActivity.this;
                    IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(-199442729, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                                WindowCompat.getInsetsController(IntercomArticleActivity.this.getWindow(), IntercomArticleActivity.this.getWindow().getDecorView()).setAppearanceLightStatusBars(ColorExtensionsKt.m12245isLightColor8_81llA(IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12152getBackground0d7_KjU()));
                                EffectsKt.LaunchedEffect(Unit.INSTANCE, new C01201(IntercomArticleActivity.this, null), composer2, 70);
                                ScaffoldKt.m3198ScaffoldTvnljyQ(WindowInsetsPaddingKt.windowInsetsPadding(BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12152getBackground0d7_KjU(), null, 2, null), WindowInsets_androidKt.getDisplayCutout(WindowInsets.INSTANCE, composer2, 8)), ComposableLambdaKt.rememberComposableLambda(547021723, true, new AnonymousClass2(IntercomArticleActivity.this), composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-494666138, true, new AnonymousClass3(IntercomArticleActivity.this), composer2, 54), composer2, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* compiled from: IntercomArticleActivity.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$1", f = "IntercomArticleActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C01201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            int label;
                            final /* synthetic */ IntercomArticleActivity this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C01201(IntercomArticleActivity intercomArticleActivity, Continuation<? super C01201> continuation) {
                                super(2, continuation);
                                this.this$0 = intercomArticleActivity;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C01201(this.this$0, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C01201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                ArticleViewModel viewModel;
                                IntercomArticleActivity.ArticleActivityArguments arguments;
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    viewModel = this.this$0.getViewModel();
                                    arguments = this.this$0.getArguments();
                                    viewModel.fragmentLoaded(arguments.getArticleId());
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }

                        /* compiled from: IntercomArticleActivity.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        /* renamed from: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ IntercomArticleActivity this$0;

                            AnonymousClass2(IntercomArticleActivity intercomArticleActivity) {
                                this.this$0 = intercomArticleActivity;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                if ((i & 11) != 2 || !composer.getSkipping()) {
                                    int i2 = R.drawable.intercom_ic_close;
                                    final IntercomArticleActivity intercomArticleActivity = this.this$0;
                                    IntercomTopBarKt.m11988IntercomTopBarbogVsAg(null, null, new IntercomTopBarIcon(i2, null, 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: INVOKE 
                                          (null androidx.compose.ui.Modifier)
                                          (null java.lang.String)
                                          (wrap:io.intercom.android.sdk.ui.component.IntercomTopBarIcon:0x001c: CONSTRUCTOR 
                                          (r15v2 'i2' int)
                                          (null java.lang.String)
                                          (wrap:kotlin.jvm.functions.Function0:0x0018: CONSTRUCTOR (r0v1 'intercomArticleActivity' io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity A[DONT_INLINE]) A[MD:(io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity):void (m), WRAPPED] call: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$2$$ExternalSyntheticLambda0.<init>(io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity):void type: CONSTRUCTOR)
                                         A[MD:(int, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m), WRAPPED] (LINE:89) call: io.intercom.android.sdk.ui.component.IntercomTopBarIcon.<init>(int, java.lang.String, kotlin.jvm.functions.Function0):void type: CONSTRUCTOR)
                                          (null androidx.compose.ui.Alignment$Horizontal)
                                          (wrap:long:0x0027: INVOKE 
                                          (wrap:io.intercom.android.sdk.ui.theme.IntercomColors:0x0023: INVOKE 
                                          (wrap:io.intercom.android.sdk.ui.theme.IntercomTheme:0x001f: SGET  A[WRAPPED] (LINE:96) io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE io.intercom.android.sdk.ui.theme.IntercomTheme)
                                          (r14v0 'composer' androidx.compose.runtime.Composer)
                                          (wrap:int:0x0021: SGET  A[WRAPPED] io.intercom.android.sdk.ui.theme.IntercomTheme.$stable int)
                                         VIRTUAL call: io.intercom.android.sdk.ui.theme.IntercomTheme.getColors(androidx.compose.runtime.Composer, int):io.intercom.android.sdk.ui.theme.IntercomColors A[MD:(androidx.compose.runtime.Composer, int):io.intercom.android.sdk.ui.theme.IntercomColors (m), WRAPPED] (LINE:96))
                                         VIRTUAL call: io.intercom.android.sdk.ui.theme.IntercomColors.getBackground-0d7_KjU():long A[MD:():long (m), WRAPPED] (LINE:96))
                                          (wrap:long:0x0033: INVOKE 
                                          (wrap:io.intercom.android.sdk.ui.theme.IntercomColors:0x002f: INVOKE 
                                          (wrap:io.intercom.android.sdk.ui.theme.IntercomTheme:0x002b: SGET  A[WRAPPED] (LINE:97) io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE io.intercom.android.sdk.ui.theme.IntercomTheme)
                                          (r14v0 'composer' androidx.compose.runtime.Composer)
                                          (wrap:int:0x002d: SGET  A[WRAPPED] io.intercom.android.sdk.ui.theme.IntercomTheme.$stable int)
                                         VIRTUAL call: io.intercom.android.sdk.ui.theme.IntercomTheme.getColors(androidx.compose.runtime.Composer, int):io.intercom.android.sdk.ui.theme.IntercomColors A[MD:(androidx.compose.runtime.Composer, int):io.intercom.android.sdk.ui.theme.IntercomColors (m), WRAPPED] (LINE:97))
                                         VIRTUAL call: io.intercom.android.sdk.ui.theme.IntercomColors.getPrimaryText-0d7_KjU():long A[MD:():long (m), WRAPPED] (LINE:97))
                                          (null kotlin.jvm.functions.Function0)
                                          (null kotlin.jvm.functions.Function3)
                                          (r14v0 'composer' androidx.compose.runtime.Composer)
                                          (wrap:int:0x0039: ARITH (wrap:int:0x0037: SGET  A[WRAPPED] io.intercom.android.sdk.ui.component.IntercomTopBarIcon.$stable int) << (6 int) A[WRAPPED])
                                          (203 int)
                                         STATIC call: io.intercom.android.sdk.ui.component.IntercomTopBarKt.IntercomTopBar-bogVsAg(androidx.compose.ui.Modifier, java.lang.String, io.intercom.android.sdk.ui.component.IntercomTopBarIcon, androidx.compose.ui.Alignment$Horizontal, long, long, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void A[MD:(androidx.compose.ui.Modifier, java.lang.String, io.intercom.android.sdk.ui.component.IntercomTopBarIcon, androidx.compose.ui.Alignment$Horizontal, long, long, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, int, int):void (m)] (LINE:88) in method: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity.onCreate.1.1.2.invoke(androidx.compose.runtime.Composer, int):void, file: classes8.dex
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
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:782)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 23 more
                                        */
                                    /*
                                        this = this;
                                        r15 = r15 & 11
                                        r0 = 2
                                        if (r15 != r0) goto L10
                                        boolean r15 = r14.getSkipping()
                                        if (r15 != 0) goto Lc
                                        goto L10
                                    Lc:
                                        r14.skipToGroupEnd()
                                        return
                                    L10:
                                        int r15 = io.intercom.android.sdk.ui.R.drawable.intercom_ic_close
                                        io.intercom.android.sdk.ui.component.IntercomTopBarIcon r2 = new io.intercom.android.sdk.ui.component.IntercomTopBarIcon
                                        io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity r0 = r13.this$0
                                        io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$2$$ExternalSyntheticLambda0 r1 = new io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$2$$ExternalSyntheticLambda0
                                        r1.<init>(r0)
                                        r0 = 0
                                        r2.<init>(r15, r0, r1)
                                        io.intercom.android.sdk.ui.theme.IntercomTheme r15 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
                                        int r0 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
                                        io.intercom.android.sdk.ui.theme.IntercomColors r15 = r15.getColors(r14, r0)
                                        long r4 = r15.m12152getBackground0d7_KjU()
                                        io.intercom.android.sdk.ui.theme.IntercomTheme r15 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
                                        int r0 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
                                        io.intercom.android.sdk.ui.theme.IntercomColors r15 = r15.getColors(r14, r0)
                                        long r6 = r15.m12174getPrimaryText0d7_KjU()
                                        int r15 = io.intercom.android.sdk.ui.component.IntercomTopBarIcon.$stable
                                        int r11 = r15 << 6
                                        r12 = 203(0xcb, float:2.84E-43)
                                        r0 = 0
                                        r1 = 0
                                        r3 = 0
                                        r8 = 0
                                        r9 = 0
                                        r10 = r14
                                        io.intercom.android.sdk.ui.component.IntercomTopBarKt.m11988IntercomTopBarbogVsAg(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1.AnonymousClass1.AnonymousClass2.invoke(androidx.compose.runtime.Composer, int):void");
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$0(IntercomArticleActivity this$0) {
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.finish();
                                    return Unit.INSTANCE;
                                }
                            }

                            /* compiled from: IntercomArticleActivity.kt */
                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            /* renamed from: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$3, reason: invalid class name */
                            static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
                                final /* synthetic */ IntercomArticleActivity this$0;

                                AnonymousClass3(IntercomArticleActivity intercomArticleActivity) {
                                    this.this$0 = intercomArticleActivity;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                    invoke(paddingValues, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                    int i2;
                                    ArticleViewModel viewModel;
                                    ErrorState.WithoutCTA withoutCTA;
                                    Composer composer2 = composer;
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i & 14) == 0) {
                                        i2 = i | (composer2.changed(paddingValues) ? 4 : 2);
                                    } else {
                                        i2 = i;
                                    }
                                    if ((i2 & 91) != 18 || !composer2.getSkipping()) {
                                        viewModel = this.this$0.getViewModel();
                                        ArticleViewState articleViewState = (ArticleViewState) SnapshotStateKt.collectAsState(viewModel.getState(), null, composer2, 8, 1).getValue();
                                        if (articleViewState instanceof ArticleViewState.Initial) {
                                            composer2.startReplaceGroup(2087911002);
                                            LoadingScreenKt.LoadingScreen(PaddingKt.padding(Modifier.INSTANCE, paddingValues), io.intercom.android.sdk.R.drawable.intercom_article_webview_loading_state, composer2, 0, 0);
                                            composer2.endReplaceGroup();
                                            return;
                                        }
                                        if (articleViewState instanceof ArticleViewState.Content) {
                                            composer2.startReplaceGroup(2088410288);
                                            Modifier m262backgroundbw27NRU$default = BackgroundKt.m262backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ScrollKt.verticalScroll$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null), 0.0f, 1, null), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12152getBackground0d7_KjU(), null, 2, null);
                                            final IntercomArticleActivity intercomArticleActivity = this.this$0;
                                            ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m262backgroundbw27NRU$default);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m4976constructorimpl = Updater.m4976constructorimpl(composer2);
                                            Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                                            }
                                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            ArticleViewState.Content content = (ArticleViewState.Content) articleViewState;
                                            final String articleUrl = content.getArticleUrl();
                                            final Map mapOf = MapsKt.mapOf(TuplesKt.to("MobileClientDisplayType", "AndroidIntercomHeaderless"), TuplesKt.to("MobileClient", "AndroidIntercomWebView"), TuplesKt.to("MobileClientReactionsHidden", "true"));
                                            AndroidView_androidKt.AndroidView(
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0184: INVOKE 
                                                  (wrap:kotlin.jvm.functions.Function1:0x0177: CONSTRUCTOR 
                                                  (r1v12 'articleUrl' java.lang.String A[DONT_INLINE])
                                                  (r11v4 'intercomArticleActivity' io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity A[DONT_INLINE])
                                                  (r2v15 'mapOf' java.util.Map A[DONT_INLINE])
                                                 A[MD:(java.lang.String, io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity, java.util.Map):void (m), WRAPPED] (LINE:124) call: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$3$$ExternalSyntheticLambda0.<init>(java.lang.String, io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity, java.util.Map):void type: CONSTRUCTOR)
                                                  (null androidx.compose.ui.Modifier)
                                                  (wrap:kotlin.jvm.functions.Function1:0x017d: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$3$$ExternalSyntheticLambda1.<init>():void type: CONSTRUCTOR)
                                                  (r4v0 'composer2' androidx.compose.runtime.Composer)
                                                  (384 int)
                                                  (2 int)
                                                 STATIC call: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void A[MD:<T extends android.view.View>:(kotlin.jvm.functions.Function1<? super android.content.Context, ? extends T extends android.view.View>, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1<? super T extends android.view.View, kotlin.Unit>, androidx.compose.runtime.Composer, int, int):void (m)] (LINE:124) in method: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity.onCreate.1.1.3.invoke(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void, file: classes8.dex
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
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$3$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 35 more
                                                */
                                            /*
                                                Method dump skipped, instructions count: 583
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1.AnonymousClass1.AnonymousClass3.invoke(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final WebView invoke$lambda$7$lambda$2(String articleUrl, IntercomArticleActivity this$0, Map headers, Context it) {
                                            Intrinsics.checkNotNullParameter(articleUrl, "$articleUrl");
                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                            Intrinsics.checkNotNullParameter(headers, "$headers");
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            WebView webView = new WebView(it);
                                            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                            ArticleWebViewClient articleWebViewClient = new ArticleWebViewClient(articleUrl, new IntercomArticleActivity$onCreate$1$1$3$1$1$1$1(this$0, webView), Injector.get().getAppConfigProvider().get().getHelpCenterUrls());
                                            webView.getSettings().setJavaScriptEnabled(true);
                                            webView.setWebViewClient(articleWebViewClient);
                                            this$0.setCookies();
                                            webView.loadUrl(articleUrl, headers);
                                            return webView;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$7$lambda$3(WebView it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$7$lambda$4(IntercomArticleActivity this$0) {
                                            ArticleViewModel viewModel;
                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                            viewModel = this$0.getViewModel();
                                            viewModel.sadReactionTapped();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$7$lambda$5(IntercomArticleActivity this$0) {
                                            ArticleViewModel viewModel;
                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                            viewModel = this$0.getViewModel();
                                            viewModel.neutralReactionTapped();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$7$lambda$6(IntercomArticleActivity this$0) {
                                            ArticleViewModel viewModel;
                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                            viewModel = this$0.getViewModel();
                                            viewModel.happyReactionTapped();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$8(IntercomArticleActivity this$0) {
                                            ArticleViewModel viewModel;
                                            IntercomArticleActivity.ArticleActivityArguments arguments;
                                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                                            viewModel = this$0.getViewModel();
                                            arguments = this$0.getArguments();
                                            viewModel.fragmentLoaded(arguments.getArticleId());
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composer, 54), composer, 3072, 7);
                            } else {
                                composer.skipToGroupEnd();
                            }
                        }
                    }), 1, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void setCookies() {
                    Injector injector = Injector.get();
                    String str = "intercom-session-" + injector.getAppIdentity().appId();
                    String encryptedUserId = injector.getUserIdentity().getEncryptedUserId();
                    Intrinsics.checkNotNullExpressionValue(encryptedUserId, "getEncryptedUserId(...)");
                    CookieManager.getInstance().setCookie(injector.getAppConfigProvider().get().getHelpCenterUrl(), str + '=' + encryptedUserId);
                }

                /* compiled from: IntercomArticleActivity.kt */
                @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity$ArticleActivityArguments;", "", "articleId", "", "metricPlace", "isFromSearchBrowse", "", "shouldHideReactions", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getArticleId", "()Ljava/lang/String;", "getMetricPlace", "()Z", "getShouldHideReactions", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class ArticleActivityArguments {
                    public static final int $stable = 0;
                    private final String articleId;
                    private final boolean isFromSearchBrowse;
                    private final String metricPlace;
                    private final boolean shouldHideReactions;

                    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                    public ArticleActivityArguments(String articleId, String metricPlace) {
                        this(articleId, metricPlace, false, false, 12, null);
                        Intrinsics.checkNotNullParameter(articleId, "articleId");
                        Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
                    }

                    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                    public ArticleActivityArguments(String articleId, String metricPlace, boolean z) {
                        this(articleId, metricPlace, z, false, 8, null);
                        Intrinsics.checkNotNullParameter(articleId, "articleId");
                        Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
                    }

                    public static /* synthetic */ ArticleActivityArguments copy$default(ArticleActivityArguments articleActivityArguments, String str, String str2, boolean z, boolean z2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = articleActivityArguments.articleId;
                        }
                        if ((i & 2) != 0) {
                            str2 = articleActivityArguments.metricPlace;
                        }
                        if ((i & 4) != 0) {
                            z = articleActivityArguments.isFromSearchBrowse;
                        }
                        if ((i & 8) != 0) {
                            z2 = articleActivityArguments.shouldHideReactions;
                        }
                        return articleActivityArguments.copy(str, str2, z, z2);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final String getArticleId() {
                        return this.articleId;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final String getMetricPlace() {
                        return this.metricPlace;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final boolean getIsFromSearchBrowse() {
                        return this.isFromSearchBrowse;
                    }

                    /* renamed from: component4, reason: from getter */
                    public final boolean getShouldHideReactions() {
                        return this.shouldHideReactions;
                    }

                    public final ArticleActivityArguments copy(String articleId, String metricPlace, boolean isFromSearchBrowse, boolean shouldHideReactions) {
                        Intrinsics.checkNotNullParameter(articleId, "articleId");
                        Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
                        return new ArticleActivityArguments(articleId, metricPlace, isFromSearchBrowse, shouldHideReactions);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof ArticleActivityArguments)) {
                            return false;
                        }
                        ArticleActivityArguments articleActivityArguments = (ArticleActivityArguments) other;
                        return Intrinsics.areEqual(this.articleId, articleActivityArguments.articleId) && Intrinsics.areEqual(this.metricPlace, articleActivityArguments.metricPlace) && this.isFromSearchBrowse == articleActivityArguments.isFromSearchBrowse && this.shouldHideReactions == articleActivityArguments.shouldHideReactions;
                    }

                    public int hashCode() {
                        return (((((this.articleId.hashCode() * 31) + this.metricPlace.hashCode()) * 31) + Boolean.hashCode(this.isFromSearchBrowse)) * 31) + Boolean.hashCode(this.shouldHideReactions);
                    }

                    public String toString() {
                        return "ArticleActivityArguments(articleId=" + this.articleId + ", metricPlace=" + this.metricPlace + ", isFromSearchBrowse=" + this.isFromSearchBrowse + ", shouldHideReactions=" + this.shouldHideReactions + ')';
                    }

                    public ArticleActivityArguments(String articleId, String metricPlace, boolean z, boolean z2) {
                        Intrinsics.checkNotNullParameter(articleId, "articleId");
                        Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
                        this.articleId = articleId;
                        this.metricPlace = metricPlace;
                        this.isFromSearchBrowse = z;
                        this.shouldHideReactions = z2;
                    }

                    public /* synthetic */ ArticleActivityArguments(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
                    }

                    public final String getArticleId() {
                        return this.articleId;
                    }

                    public final String getMetricPlace() {
                        return this.metricPlace;
                    }

                    public final boolean isFromSearchBrowse() {
                        return this.isFromSearchBrowse;
                    }

                    public final boolean getShouldHideReactions() {
                        return this.shouldHideReactions;
                    }
                }

                /* compiled from: IntercomArticleActivity.kt */
                @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity$Companion;", "", "<init>", "()V", IntercomArticleActivity.ARTICLE_ID, "", IntercomArticleActivity.METRIC_PLACE, "IS_SEARCH_BROWSE", IntercomArticleActivity.SHOULD_HIDE_REACTIONS, "buildIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "articleActivityArguments", "Lio/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity$ArticleActivityArguments;", "getArguments", SDKConstants.PARAM_INTENT, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    @JvmStatic
                    public final Intent buildIntent(Context context, ArticleActivityArguments articleActivityArguments) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(articleActivityArguments, "articleActivityArguments");
                        Intent intent = new Intent(context, (Class<?>) IntercomArticleActivity.class);
                        intent.setFlags(268435456);
                        intent.putExtra(IntercomArticleActivity.ARTICLE_ID, articleActivityArguments.getArticleId());
                        intent.putExtra(IntercomArticleActivity.METRIC_PLACE, articleActivityArguments.getMetricPlace());
                        intent.putExtra(IntercomArticleActivity.IS_SEARCH_BROWSE, articleActivityArguments.isFromSearchBrowse());
                        intent.putExtra(IntercomArticleActivity.SHOULD_HIDE_REACTIONS, articleActivityArguments.getShouldHideReactions());
                        return intent;
                    }

                    public final ArticleActivityArguments getArguments(Intent intent) {
                        Intrinsics.checkNotNullParameter(intent, "intent");
                        String stringExtra = intent.getStringExtra(IntercomArticleActivity.ARTICLE_ID);
                        if (stringExtra == null) {
                            stringExtra = "";
                        }
                        String stringExtra2 = intent.getStringExtra(IntercomArticleActivity.METRIC_PLACE);
                        return new ArticleActivityArguments(stringExtra, stringExtra2 != null ? stringExtra2 : "", intent.getBooleanExtra(IntercomArticleActivity.IS_SEARCH_BROWSE, false), intent.getBooleanExtra(IntercomArticleActivity.SHOULD_HIDE_REACTIONS, false));
                    }
                }
            }
