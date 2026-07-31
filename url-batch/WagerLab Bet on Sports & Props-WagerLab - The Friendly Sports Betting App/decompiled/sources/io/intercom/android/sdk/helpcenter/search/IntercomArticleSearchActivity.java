package io.intercom.android.sdk.helpcenter.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.databinding.IntercomActivityArticleSearchBinding;
import io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: IntercomArticleSearchActivity.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 &2\u00020\u0001:\u0002&'B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0002JQ\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001f2\u0018\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0004\u0012\u00020\u00150!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00150!H\u0003¢\u0006\u0002\u0010%R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity;", "Lio/intercom/android/sdk/helpcenter/IntercomHelpCenterBaseActivity;", "<init>", "()V", "_binding", "Lio/intercom/android/sdk/databinding/IntercomActivityArticleSearchBinding;", "binding", "getBinding", "()Lio/intercom/android/sdk/databinding/IntercomActivityArticleSearchBinding;", "viewModel", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel;", "getViewModel", "()Lio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "args", "Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity$ArticleSearchArgs;", "getArgs", "()Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity$ArticleSearchArgs;", "args$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupInsets", "onBackPressed", "subscribeToStates", "SearchScreenContent", "articleSearchState", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "onBackClick", "Lkotlin/Function0;", "onTextChanged", "Lkotlin/Function1;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "onArticleClicked", "(Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Companion", "ArticleSearchArgs", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomArticleSearchActivity extends IntercomHelpCenterBaseActivity {
    private static final String IS_FROM_SEARCH_BROWSE = "IS_SEARCH_BROWSE";
    private IntercomActivityArticleSearchBinding _binding;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ArticleSearchViewModel viewModel_delegate$lambda$0;
            viewModel_delegate$lambda$0 = IntercomArticleSearchActivity.viewModel_delegate$lambda$0(IntercomArticleSearchActivity.this);
            return viewModel_delegate$lambda$0;
        }
    });

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final Lazy args = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            IntercomArticleSearchActivity.ArticleSearchArgs args_delegate$lambda$1;
            args_delegate$lambda$1 = IntercomArticleSearchActivity.args_delegate$lambda$1(IntercomArticleSearchActivity.this);
            return args_delegate$lambda$1;
        }
    });

    /* compiled from: IntercomArticleSearchActivity.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchScreenContent$lambda$3(IntercomArticleSearchActivity tmp0_rcvr, ArticleSearchState articleSearchState, Function0 onBackClick, Function1 onTextChanged, Function1 onArticleClicked, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(tmp0_rcvr, "$tmp0_rcvr");
        Intrinsics.checkNotNullParameter(articleSearchState, "$articleSearchState");
        Intrinsics.checkNotNullParameter(onBackClick, "$onBackClick");
        Intrinsics.checkNotNullParameter(onTextChanged, "$onTextChanged");
        Intrinsics.checkNotNullParameter(onArticleClicked, "$onArticleClicked");
        tmp0_rcvr.SearchScreenContent(articleSearchState, onBackClick, onTextChanged, onArticleClicked, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @JvmStatic
    public static final Intent buildIntent(Context context, boolean z) {
        return INSTANCE.buildIntent(context, z);
    }

    private final IntercomActivityArticleSearchBinding getBinding() {
        IntercomActivityArticleSearchBinding intercomActivityArticleSearchBinding = this._binding;
        if (intercomActivityArticleSearchBinding != null) {
            return intercomActivityArticleSearchBinding;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArticleSearchViewModel getViewModel() {
        return (ArticleSearchViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleSearchViewModel viewModel_delegate$lambda$0(IntercomArticleSearchActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
        Intrinsics.checkNotNullExpressionValue(helpCenterApi, "getHelpCenterApi(...)");
        return ArticleSearchViewModel.INSTANCE.create(this$0, helpCenterApi, this$0.getArgs().isFromSearchBrowse());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleSearchArgs args_delegate$lambda$1(IntercomArticleSearchActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Companion companion = INSTANCE;
        Intent intent = this$0.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.getArguments(intent);
    }

    private final ArticleSearchArgs getArgs() {
        return (ArticleSearchArgs) this.args.getValue();
    }

    @Override // io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this._binding = IntercomActivityArticleSearchBinding.inflate(getLayoutInflater());
        setContentView(getBinding().getRoot());
        setupInsets();
        subscribeToStates();
        overridePendingTransition(R.anim.intercom_fade_in, R.anim.intercom_donothing);
    }

    private final void setupInsets() {
        EdgeToEdge.enable$default(this, null, null, 3, null);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        int i = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        boolean z = false;
        if (i != 1) {
            if (i == 2) {
                z = true;
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        insetsController.setAppearanceLightStatusBars(z);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.intercom_donothing, R.anim.intercom_fade_out);
    }

    /* compiled from: IntercomArticleSearchActivity.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity$Companion;", "", "<init>", "()V", "IS_FROM_SEARCH_BROWSE", "", "buildIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "isFromSearchBrowse", "", "getArguments", "Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity$ArticleSearchArgs;", SDKConstants.PARAM_INTENT, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent buildIntent(Context context, boolean isFromSearchBrowse) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) IntercomArticleSearchActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(IntercomArticleSearchActivity.IS_FROM_SEARCH_BROWSE, isFromSearchBrowse);
            return intent;
        }

        public final ArticleSearchArgs getArguments(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return new ArticleSearchArgs(intent.getBooleanExtra(IntercomArticleSearchActivity.IS_FROM_SEARCH_BROWSE, false));
        }
    }

    /* compiled from: IntercomArticleSearchActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u000b\u001a\u00020\fH×\u0001J\t\u0010\r\u001a\u00020\u000eH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity$ArticleSearchArgs;", "", "isFromSearchBrowse", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ArticleSearchArgs {
        public static final int $stable = 0;
        private final boolean isFromSearchBrowse;

        public ArticleSearchArgs() {
            this(false, 1, null);
        }

        public static /* synthetic */ ArticleSearchArgs copy$default(ArticleSearchArgs articleSearchArgs, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = articleSearchArgs.isFromSearchBrowse;
            }
            return articleSearchArgs.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        public final ArticleSearchArgs copy(boolean isFromSearchBrowse) {
            return new ArticleSearchArgs(isFromSearchBrowse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ArticleSearchArgs) && this.isFromSearchBrowse == ((ArticleSearchArgs) other).isFromSearchBrowse;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFromSearchBrowse);
        }

        public String toString() {
            return "ArticleSearchArgs(isFromSearchBrowse=" + this.isFromSearchBrowse + ')';
        }

        public ArticleSearchArgs(boolean z) {
            this.isFromSearchBrowse = z;
        }

        public /* synthetic */ ArticleSearchArgs(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }
    }

    private final void subscribeToStates() {
        getBinding().articleSearchComposeView.setContent(ComposableLambdaKt.composableLambdaInstance(-779899693, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$subscribeToStates$1

            /* compiled from: IntercomArticleSearchActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$subscribeToStates$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ IntercomArticleSearchActivity this$0;

                AnonymousClass1(IntercomArticleSearchActivity intercomArticleSearchActivity) {
                    this.this$0 = intercomArticleSearchActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ArticleSearchViewModel viewModel;
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        viewModel = this.this$0.getViewModel();
                        State collectAsState = SnapshotStateKt.collectAsState(viewModel.getState(), null, composer, 8, 1);
                        IntercomArticleSearchActivity intercomArticleSearchActivity = this.this$0;
                        ArticleSearchState articleSearchState = (ArticleSearchState) collectAsState.getValue();
                        final IntercomArticleSearchActivity intercomArticleSearchActivity2 = this.this$0;
                        Function0 function0 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002f: CONSTRUCTOR (r2v1 'function0' kotlin.jvm.functions.Function0) = 
                              (r9v7 'intercomArticleSearchActivity2' io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity A[DONT_INLINE])
                             A[DECLARE_VAR, MD:(io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity):void (m)] call: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$subscribeToStates$1$1$$ExternalSyntheticLambda0.<init>(io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity):void type: CONSTRUCTOR in method: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$subscribeToStates$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes8.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$subscribeToStates$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 23 more
                            */
                        /*
                            this = this;
                            r9 = r9 & 11
                            r0 = 2
                            if (r9 != r0) goto L10
                            boolean r9 = r8.getSkipping()
                            if (r9 != 0) goto Lc
                            goto L10
                        Lc:
                            r8.skipToGroupEnd()
                            return
                        L10:
                            io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity r9 = r7.this$0
                            io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel r9 = io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity.access$getViewModel(r9)
                            kotlinx.coroutines.flow.StateFlow r9 = r9.getState()
                            r0 = 8
                            r1 = 1
                            r2 = 0
                            androidx.compose.runtime.State r9 = androidx.compose.runtime.SnapshotStateKt.collectAsState(r9, r2, r8, r0, r1)
                            io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity r0 = r7.this$0
                            java.lang.Object r9 = r9.getValue()
                            r1 = r9
                            io.intercom.android.sdk.helpcenter.search.ArticleSearchState r1 = (io.intercom.android.sdk.helpcenter.search.ArticleSearchState) r1
                            io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity r9 = r7.this$0
                            io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$subscribeToStates$1$1$$ExternalSyntheticLambda0 r2 = new io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$subscribeToStates$1$1$$ExternalSyntheticLambda0
                            r2.<init>(r9)
                            io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity r9 = r7.this$0
                            io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$subscribeToStates$1$1$$ExternalSyntheticLambda1 r3 = new io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$subscribeToStates$1$1$$ExternalSyntheticLambda1
                            r3.<init>(r9)
                            io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity r9 = r7.this$0
                            io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$subscribeToStates$1$1$$ExternalSyntheticLambda2 r4 = new io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$subscribeToStates$1$1$$ExternalSyntheticLambda2
                            r4.<init>(r9)
                            r6 = 32768(0x8000, float:4.5918E-41)
                            r5 = r8
                            io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity.access$SearchScreenContent(r0, r1, r2, r3, r4, r5, r6)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$subscribeToStates$1.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$0(IntercomArticleSearchActivity this$0) {
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.onBackPressed();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1(IntercomArticleSearchActivity this$0, MutableStateFlow textFlow) {
                        ArticleSearchViewModel viewModel;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(textFlow, "textFlow");
                        viewModel = this$0.getViewModel();
                        viewModel.searchForArticles(textFlow);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2(IntercomArticleSearchActivity this$0, String it) {
                        ArticleSearchViewModel viewModel;
                        ArticleSearchViewModel viewModel2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        viewModel = this$0.getViewModel();
                        viewModel.addTeammateHelpRow();
                        viewModel2 = this$0.getViewModel();
                        viewModel2.sendClickOnSearchResultMetric();
                        this$0.startActivity(IntercomArticleActivity.INSTANCE.buildIntent(this$0, new IntercomArticleActivity.ArticleActivityArguments(it, "search_results", false, false, 12, null)));
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                        Intrinsics.checkNotNullExpressionValue(appConfig, "get(...)");
                        ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, ComposableLambdaKt.rememberComposableLambda(-1191058574, true, new AnonymousClass1(IntercomArticleSearchActivity.this), composer, 54), composer, 56);
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void SearchScreenContent(final ArticleSearchState articleSearchState, final Function0<Unit> function0, final Function1<? super MutableStateFlow<String>, Unit> function1, final Function1<? super String, Unit> function12, Composer composer, final int i) {
            int i2;
            Composer composer2;
            Composer startRestartGroup = composer.startRestartGroup(865873108);
            if ((i & 14) == 0) {
                i2 = (startRestartGroup.changed(articleSearchState) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 112) == 0) {
                i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            if ((i & 7168) == 0) {
                i2 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
            }
            if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
                composer2 = startRestartGroup;
                ScaffoldKt.m3198ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-1018273896, true, new IntercomArticleSearchActivity$SearchScreenContent$1(function0, function1), startRestartGroup, 54), null, null, null, 0, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12152getBackground0d7_KjU(), 0L, null, ComposableLambdaKt.rememberComposableLambda(955713763, true, new IntercomArticleSearchActivity$SearchScreenContent$2(articleSearchState, function12), startRestartGroup, 54), composer2, 805306416, 445);
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit SearchScreenContent$lambda$3;
                        SearchScreenContent$lambda$3 = IntercomArticleSearchActivity.SearchScreenContent$lambda$3(IntercomArticleSearchActivity.this, articleSearchState, function0, function1, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                        return SearchScreenContent$lambda$3;
                    }
                });
            }
        }
    }
