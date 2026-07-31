package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.paging.compose.LazyPagingItems;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketsScreen.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a3\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"TicketsScreen", "", "uiState", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "onBackButtonClick", "Lkotlin/Function0;", "onTicketClick", "Lkotlin/Function1;", "", "navIcon", "", "(Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;II)V", "TicketsScreenContent", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Content;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", ViewProps.ON_CLICK, "(Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Content;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TicketsScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsScreen$lambda$1(TicketsScreenUiState uiState, Function0 onBackButtonClick, Function1 function1, int i, int i2, int i3, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(uiState, "$uiState");
        Intrinsics.checkNotNullParameter(onBackButtonClick, "$onBackButtonClick");
        TicketsScreen(uiState, onBackButtonClick, function1, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsScreenContent$lambda$4(TicketsScreenUiState.Content uiState, PaddingValues paddingValues, Function1 function1, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(uiState, "$uiState");
        Intrinsics.checkNotNullParameter(paddingValues, "$paddingValues");
        TicketsScreenContent(uiState, paddingValues, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsScreen$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TicketsScreen(final TicketsScreenUiState uiState, final Function0<Unit> onBackButtonClick, Function1<? super String, Unit> function1, final int i, Composer composer, final int i2, final int i3) {
        int i4;
        Function1<? super String, Unit> function12;
        final Function1<? super String, Unit> function13;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(onBackButtonClick, "onBackButtonClick");
        Composer startRestartGroup = composer.startRestartGroup(-1552213693);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(uiState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(onBackButtonClick) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            function12 = function1;
            i4 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i4 |= startRestartGroup.changed(i) ? 2048 : 1024;
            }
            if ((i4 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                function13 = i5 == 0 ? new Function1() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TicketsScreen$lambda$0;
                        TicketsScreen$lambda$0 = TicketsScreenKt.TicketsScreen$lambda$0((String) obj);
                        return TicketsScreen$lambda$0;
                    }
                } : function12;
                composer2 = startRestartGroup;
                ScaffoldKt.m3198ScaffoldTvnljyQ(TestTagKt.testTag(WindowInsetsPaddingKt.windowInsetsPadding(BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12152getBackground0d7_KjU(), null, 2, null), WindowInsets_androidKt.getDisplayCutout(WindowInsets.INSTANCE, startRestartGroup, 8)), "tickets_screen"), ComposableLambdaKt.rememberComposableLambda(-1473942521, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreen$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                            TopActionBarKt.m11189TopActionBarNpQZenA(null, TicketsScreenUiState.this.getScreenLabel(), null, null, null, onBackButtonClick, Integer.valueOf(i), false, IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m12164getHeader0d7_KjU(), IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m12171getOnHeader0d7_KjU(), 0L, null, null, composer3, 0, 0, 7325);
                        } else {
                            composer3.skipToGroupEnd();
                        }
                    }
                }, startRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1690440366, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreen$3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 14) == 0) {
                            i6 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i6 & 91) != 18 || !composer3.getSkipping()) {
                            TicketsScreenUiState ticketsScreenUiState = TicketsScreenUiState.this;
                            if (ticketsScreenUiState instanceof TicketsScreenUiState.Content) {
                                composer3.startReplaceGroup(1161791623);
                                TicketsScreenKt.TicketsScreenContent((TicketsScreenUiState.Content) TicketsScreenUiState.this, paddingValues, function13, composer3, LazyPagingItems.$stable | ((i6 << 3) & 112), 0);
                                composer3.endReplaceGroup();
                                return;
                            }
                            if (ticketsScreenUiState instanceof TicketsScreenUiState.Empty) {
                                composer3.startReplaceGroup(1161993371);
                                TicketsEmptyScreenKt.TicketsEmptyScreen(((TicketsScreenUiState.Empty) TicketsScreenUiState.this).getEmptyState(), PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                                composer3.endReplaceGroup();
                                return;
                            } else if (ticketsScreenUiState instanceof TicketsScreenUiState.Error) {
                                composer3.startReplaceGroup(1162175744);
                                TicketsErrorScreenKt.TicketsErrorScreen(((TicketsScreenUiState.Error) TicketsScreenUiState.this).getErrorState(), PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                                composer3.endReplaceGroup();
                                return;
                            } else {
                                if (!(ticketsScreenUiState instanceof TicketsScreenUiState.Initial) && !(ticketsScreenUiState instanceof TicketsScreenUiState.Loading)) {
                                    composer3.startReplaceGroup(2115686198);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(2115705652);
                                TicketsLoadingScreenKt.TicketsLoadingScreen(PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                                composer3.endReplaceGroup();
                                return;
                            }
                        }
                        composer3.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), composer2, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
                function13 = function12;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit TicketsScreen$lambda$1;
                        TicketsScreen$lambda$1 = TicketsScreenKt.TicketsScreen$lambda$1(TicketsScreenUiState.this, onBackButtonClick, function13, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return TicketsScreen$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if ((i3 & 8) == 0) {
        }
        if ((i4 & 5851) == 1170) {
        }
        if (i5 == 0) {
        }
        composer2 = startRestartGroup;
        ScaffoldKt.m3198ScaffoldTvnljyQ(TestTagKt.testTag(WindowInsetsPaddingKt.windowInsetsPadding(BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12152getBackground0d7_KjU(), null, 2, null), WindowInsets_androidKt.getDisplayCutout(WindowInsets.INSTANCE, startRestartGroup, 8)), "tickets_screen"), ComposableLambdaKt.rememberComposableLambda(-1473942521, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreen$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i6) {
                if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                    TopActionBarKt.m11189TopActionBarNpQZenA(null, TicketsScreenUiState.this.getScreenLabel(), null, null, null, onBackButtonClick, Integer.valueOf(i), false, IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m12164getHeader0d7_KjU(), IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m12171getOnHeader0d7_KjU(), 0L, null, null, composer3, 0, 0, 7325);
                } else {
                    composer3.skipToGroupEnd();
                }
            }
        }, startRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1690440366, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreen$3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                invoke(paddingValues, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                if ((i6 & 14) == 0) {
                    i6 |= composer3.changed(paddingValues) ? 4 : 2;
                }
                if ((i6 & 91) != 18 || !composer3.getSkipping()) {
                    TicketsScreenUiState ticketsScreenUiState = TicketsScreenUiState.this;
                    if (ticketsScreenUiState instanceof TicketsScreenUiState.Content) {
                        composer3.startReplaceGroup(1161791623);
                        TicketsScreenKt.TicketsScreenContent((TicketsScreenUiState.Content) TicketsScreenUiState.this, paddingValues, function13, composer3, LazyPagingItems.$stable | ((i6 << 3) & 112), 0);
                        composer3.endReplaceGroup();
                        return;
                    }
                    if (ticketsScreenUiState instanceof TicketsScreenUiState.Empty) {
                        composer3.startReplaceGroup(1161993371);
                        TicketsEmptyScreenKt.TicketsEmptyScreen(((TicketsScreenUiState.Empty) TicketsScreenUiState.this).getEmptyState(), PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                        composer3.endReplaceGroup();
                        return;
                    } else if (ticketsScreenUiState instanceof TicketsScreenUiState.Error) {
                        composer3.startReplaceGroup(1162175744);
                        TicketsErrorScreenKt.TicketsErrorScreen(((TicketsScreenUiState.Error) TicketsScreenUiState.this).getErrorState(), PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                        composer3.endReplaceGroup();
                        return;
                    } else {
                        if (!(ticketsScreenUiState instanceof TicketsScreenUiState.Initial) && !(ticketsScreenUiState instanceof TicketsScreenUiState.Loading)) {
                            composer3.startReplaceGroup(2115686198);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(2115705652);
                        TicketsLoadingScreenKt.TicketsLoadingScreen(PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                        composer3.endReplaceGroup();
                        return;
                    }
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), composer2, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsScreenContent$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TicketsScreenContent(final TicketsScreenUiState.Content uiState, final PaddingValues paddingValues, Function1<? super String, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super String, Unit> function12;
        final Function1<? super String, Unit> function13;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Composer startRestartGroup = composer.startRestartGroup(-1912868973);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(uiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(paddingValues) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                final Function1<? super String, Unit> function14 = i4 == 0 ? new Function1() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TicketsScreenContent$lambda$2;
                        TicketsScreenContent$lambda$2 = TicketsScreenKt.TicketsScreenContent$lambda$2((String) obj);
                        return TicketsScreenContent$lambda$2;
                    }
                } : function12;
                LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, paddingValues, false, null, null, null, false, null, new Function1() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TicketsScreenContent$lambda$3;
                        TicketsScreenContent$lambda$3 = TicketsScreenKt.TicketsScreenContent$lambda$3(TicketsScreenUiState.Content.this, function14, (LazyListScope) obj);
                        return TicketsScreenContent$lambda$3;
                    }
                }, startRestartGroup, ((i3 << 3) & 896) | 6, TypedValues.PositionType.TYPE_PERCENT_X);
                function13 = function14;
            } else {
                startRestartGroup.skipToGroupEnd();
                function13 = function12;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit TicketsScreenContent$lambda$4;
                        TicketsScreenContent$lambda$4 = TicketsScreenKt.TicketsScreenContent$lambda$4(TicketsScreenUiState.Content.this, paddingValues, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return TicketsScreenContent$lambda$4;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if ((i3 & 731) == 146) {
        }
        if (i4 == 0) {
        }
        LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, paddingValues, false, null, null, null, false, null, new Function1() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TicketsScreenContent$lambda$3;
                TicketsScreenContent$lambda$3 = TicketsScreenKt.TicketsScreenContent$lambda$3(TicketsScreenUiState.Content.this, function14, (LazyListScope) obj);
                return TicketsScreenContent$lambda$3;
            }
        }, startRestartGroup, ((i3 << 3) & 896) | 6, TypedValues.PositionType.TYPE_PERCENT_X);
        function13 = function14;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketsScreenContent$lambda$3(TicketsScreenUiState.Content uiState, Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(uiState, "$uiState");
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.items$default(LazyColumn, uiState.getLazyPagingTickets().getItemCount(), null, null, ComposableLambdaKt.composableLambdaInstance(264752689, true, new TicketsScreenKt$TicketsScreenContent$2$1(uiState, function1)), 6, null);
        final ErrorState errorState = uiState.getErrorState();
        if (errorState != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1511938327, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreenContent$2$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 81) != 16 || !composer.getSkipping()) {
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m839paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m8401constructorimpl(16), 1, null), 0.0f, 1, null);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        final ErrorState errorState2 = ErrorState.this;
                        ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        Composer m4976constructorimpl = Updater.m4976constructorimpl(composer);
                        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                        }
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                        ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor2);
                        } else {
                            composer.useNode();
                        }
                        Composer m4976constructorimpl2 = Updater.m4976constructorimpl(composer);
                        Updater.m4983setimpl(m4976constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                            m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                        }
                        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        TextKt.m3581TextNvy7gAk(StringResources_androidKt.stringResource(errorState2.getMessageResId(), composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
                        composer.startReplaceGroup(-309108390);
                        if (errorState2 instanceof ErrorState.WithCTA) {
                            ButtonKt.TextButton(((ErrorState.WithCTA) errorState2).getOnCtaClick(), null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-774229187, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreenContent$2$2$1$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                    invoke(rowScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope TextButton, Composer composer2, int i2) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                                        TextKt.m3581TextNvy7gAk(StringResources_androidKt.stringResource(((ErrorState.WithCTA) ErrorState.this).getCtaResId(), composer2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04(), composer2, 0, 0, 131070);
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                }
                            }, composer, 54), composer, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
                        }
                        composer.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }), 3, null);
        }
        if (uiState.isLoadingMore()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$TicketsScreenKt.INSTANCE.m11932getLambda1$intercom_sdk_base_release(), 3, null);
        }
        return Unit.INSTANCE;
    }
}
