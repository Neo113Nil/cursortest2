package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelpCenterScreen.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a=\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"HelpCenterScreen", "", "viewModel", "Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;", "collectionIds", "", "", "onCloseClick", "Lkotlin/Function0;", "navIcon", "", "(Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;Ljava/util/List;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)V", "HelpCenterNavGraph", "navController", "Landroidx/navigation/NavHostController;", HelpCenterScreenKt.START_DESTINATION, "modifier", "Landroidx/compose/ui/Modifier;", "(Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;Landroidx/navigation/NavHostController;Ljava/lang/String;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "START_DESTINATION", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HelpCenterScreenKt {
    private static final String START_DESTINATION = "startDestination";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterNavGraph$lambda$4(HelpCenterViewModel viewModel, NavHostController navController, String startDestination, List collectionIds, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(startDestination, "$startDestination");
        Intrinsics.checkNotNullParameter(collectionIds, "$collectionIds");
        HelpCenterNavGraph(viewModel, navController, startDestination, collectionIds, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterScreen$lambda$0(HelpCenterViewModel viewModel, List collectionIds, Function0 onCloseClick, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(collectionIds, "$collectionIds");
        Intrinsics.checkNotNullParameter(onCloseClick, "$onCloseClick");
        HelpCenterScreen(viewModel, collectionIds, onCloseClick, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void HelpCenterScreen(final HelpCenterViewModel viewModel, final List<String> collectionIds, final Function0<Unit> onCloseClick, final int i, Composer composer, final int i2) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(collectionIds, "collectionIds");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer startRestartGroup = composer.startRestartGroup(1421214035);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        CompositionLocalKt.CompositionLocalProvider(localContext.provides(viewModel.localizedContext((Context) consume)), ComposableLambdaKt.rememberComposableLambda(-267860845, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterScreen$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    final NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer2, 8);
                    ProvidableCompositionLocal<Context> localContext3 = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = composer2.consume(localContext3);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Context context = (Context) consume2;
                    Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12152getBackground0d7_KjU(), null, 2, null), WindowInsets_androidKt.getDisplayCutout(WindowInsets.INSTANCE, composer2, 8));
                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1261102927, true, new AnonymousClass1(rememberNavController, i, viewModel, onCloseClick, context), composer2, 54);
                    final List<String> list = collectionIds;
                    final HelpCenterViewModel helpCenterViewModel = viewModel;
                    ScaffoldKt.m3198ScaffoldTvnljyQ(windowInsetsPadding, rememberComposableLambda, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(900356900, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterScreen$1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i4) {
                            String str;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i4 & 14) == 0) {
                                i4 |= composer3.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i4 & 91) != 18 || !composer3.getSkipping()) {
                                if (list.size() == 1) {
                                    str = "COLLECTION_DETAILS";
                                } else {
                                    str = "COLLECTIONS";
                                }
                                HelpCenterScreenKt.HelpCenterNavGraph(helpCenterViewModel, rememberNavController, str, list, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 4168, 0);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composer2, 54), composer2, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                    return;
                }
                composer2.skipToGroupEnd();
            }

            /* compiled from: HelpCenterScreen.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterScreen$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ Context $context;
                final /* synthetic */ NavHostController $navController;
                final /* synthetic */ int $navIcon;
                final /* synthetic */ Function0<Unit> $onCloseClick;
                final /* synthetic */ HelpCenterViewModel $viewModel;

                AnonymousClass1(NavHostController navHostController, int i, HelpCenterViewModel helpCenterViewModel, Function0<Unit> function0, Context context) {
                    this.$navController = navHostController;
                    this.$navIcon = i;
                    this.$viewModel = helpCenterViewModel;
                    this.$onCloseClick = function0;
                    this.$context = context;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    int i2;
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        final NavHostController navHostController = this.$navController;
                        final Function0<Unit> function0 = this.$onCloseClick;
                        Function0 function02 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0016: CONSTRUCTOR (r1v0 'function02' kotlin.jvm.functions.Function0) = 
                              (r10v2 'navHostController' androidx.navigation.NavHostController A[DONT_INLINE])
                              (r0v1 'function0' kotlin.jvm.functions.Function0<kotlin.Unit> A[DONT_INLINE])
                             A[DECLARE_VAR, MD:(androidx.navigation.NavHostController, kotlin.jvm.functions.Function0):void (m)] call: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterScreen$1$1$$ExternalSyntheticLambda0.<init>(androidx.navigation.NavHostController, kotlin.jvm.functions.Function0):void type: CONSTRUCTOR in method: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterScreen$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes8.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterScreen$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
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
                            androidx.navigation.NavHostController r10 = r8.$navController
                            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r8.$onCloseClick
                            io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterScreen$1$1$$ExternalSyntheticLambda0 r1 = new io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterScreen$1$1$$ExternalSyntheticLambda0
                            r1.<init>(r10, r0)
                            android.content.Context r10 = r8.$context
                            io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterScreen$1$1$$ExternalSyntheticLambda1 r2 = new io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterScreen$1$1$$ExternalSyntheticLambda1
                            r2.<init>(r10)
                            androidx.navigation.NavHostController r10 = r8.$navController
                            androidx.navigation.NavBackStackEntry r10 = r10.getPreviousBackStackEntry()
                            if (r10 != 0) goto L2b
                            int r10 = r8.$navIcon
                            goto L2d
                        L2b:
                            int r10 = io.intercom.android.sdk.ui.R.drawable.intercom_ic_back
                        L2d:
                            r3 = r10
                            io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel r10 = r8.$viewModel
                            io.intercom.android.sdk.ui.common.StringProvider r4 = r10.getScreenTitle()
                            int r10 = io.intercom.android.sdk.ui.common.StringProvider.$stable
                            int r6 = r10 << 9
                            r7 = 0
                            r5 = r9
                            io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt.HelpCenterTopBar(r1, r2, r3, r4, r5, r6, r7)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterScreen$1.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$0(NavHostController navController, Function0 onCloseClick) {
                        Intrinsics.checkNotNullParameter(navController, "$navController");
                        Intrinsics.checkNotNullParameter(onCloseClick, "$onCloseClick");
                        if (navController.getPreviousBackStackEntry() == null) {
                            onCloseClick.invoke();
                        } else {
                            navController.navigateUp();
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1(Context context) {
                        Intrinsics.checkNotNullParameter(context, "$context");
                        context.startActivity(IntercomArticleSearchActivity.INSTANCE.buildIntent(context, false));
                        return Unit.INSTANCE;
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit HelpCenterScreen$lambda$0;
                        HelpCenterScreen$lambda$0 = HelpCenterScreenKt.HelpCenterScreen$lambda$0(HelpCenterViewModel.this, collectionIds, onCloseClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return HelpCenterScreen$lambda$0;
                    }
                });
            }
        }

        public static final void HelpCenterNavGraph(final HelpCenterViewModel viewModel, final NavHostController navController, final String startDestination, final List<String> collectionIds, Modifier modifier, Composer composer, final int i, final int i2) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(navController, "navController");
            Intrinsics.checkNotNullParameter(startDestination, "startDestination");
            Intrinsics.checkNotNullParameter(collectionIds, "collectionIds");
            Composer startRestartGroup = composer.startRestartGroup(686627856);
            Modifier modifier2 = (i2 & 16) != 0 ? Modifier.INSTANCE : modifier;
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context = (Context) consume;
            final Modifier modifier3 = modifier2;
            NavHostKt.NavHost(navController, startDestination, modifier3, null, null, null, null, null, null, null, new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit HelpCenterNavGraph$lambda$3;
                    HelpCenterNavGraph$lambda$3 = HelpCenterScreenKt.HelpCenterNavGraph$lambda$3(HelpCenterViewModel.this, collectionIds, navController, context, (NavGraphBuilder) obj);
                    return HelpCenterNavGraph$lambda$3;
                }
            }, startRestartGroup, ((i >> 3) & 112) | 8 | ((i >> 6) & 896), 0, 1016);
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit HelpCenterNavGraph$lambda$4;
                        HelpCenterNavGraph$lambda$4 = HelpCenterScreenKt.HelpCenterNavGraph$lambda$4(HelpCenterViewModel.this, navController, startDestination, collectionIds, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return HelpCenterNavGraph$lambda$4;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit HelpCenterNavGraph$lambda$3(HelpCenterViewModel viewModel, List collectionIds, NavHostController navController, Context context, NavGraphBuilder NavHost) {
            Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
            Intrinsics.checkNotNullParameter(collectionIds, "$collectionIds");
            Intrinsics.checkNotNullParameter(navController, "$navController");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
            NavGraphBuilderKt.composable$default(NavHost, "COLLECTIONS", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1869047411, true, new HelpCenterScreenKt$HelpCenterNavGraph$1$1(viewModel, collectionIds, navController)), 254, (Object) null);
            NavGraphBuilderKt.composable$default(NavHost, "COLLECTION_DETAILS/{id}?startDestination={startDestination}", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument("id", new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit HelpCenterNavGraph$lambda$3$lambda$1;
                    HelpCenterNavGraph$lambda$3$lambda$1 = HelpCenterScreenKt.HelpCenterNavGraph$lambda$3$lambda$1((NavArgumentBuilder) obj);
                    return HelpCenterNavGraph$lambda$3$lambda$1;
                }
            }), NamedNavArgumentKt.navArgument(START_DESTINATION, new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit HelpCenterNavGraph$lambda$3$lambda$2;
                    HelpCenterNavGraph$lambda$3$lambda$2 = HelpCenterScreenKt.HelpCenterNavGraph$lambda$3$lambda$2((NavArgumentBuilder) obj);
                    return HelpCenterNavGraph$lambda$3$lambda$2;
                }
            })}), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(2018839094, true, new HelpCenterScreenKt$HelpCenterNavGraph$1$4(viewModel, context, navController)), 252, (Object) null);
            NavGraphBuilderKt.composable$default(NavHost, "COLLECTION_DETAILS", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-157077227, true, new HelpCenterScreenKt$HelpCenterNavGraph$1$5(viewModel, collectionIds, context, navController)), 254, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit HelpCenterNavGraph$lambda$3$lambda$1(NavArgumentBuilder navArgument) {
            Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
            navArgument.setType(NavType.StringType);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit HelpCenterNavGraph$lambda$3$lambda$2(NavArgumentBuilder navArgument) {
            Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
            navArgument.setType(NavType.BoolType);
            navArgument.setDefaultValue(false);
            return Unit.INSTANCE;
        }
    }
