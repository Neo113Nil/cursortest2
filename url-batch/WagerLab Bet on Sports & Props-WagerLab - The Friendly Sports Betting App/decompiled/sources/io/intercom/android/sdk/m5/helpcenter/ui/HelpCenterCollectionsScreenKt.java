package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState;
import io.intercom.android.sdk.m5.helpcenter.ui.components.BrowseAllHelpTopicsComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelpCenterCollectionsScreen.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\n\u001a(\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\bH\u0002¨\u0006\u000f"}, d2 = {"HelpCenterCollectionsScreen", "", "viewModel", "Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;", "collectionIds", "", "", "onCollectionClick", "Lkotlin/Function1;", "onAutoNavigateToCollection", "(Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "helpCenterCollectionItems", "Landroidx/compose/foundation/lazy/LazyListScope;", "state", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Content;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HelpCenterCollectionsScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterCollectionsScreen$lambda$2(HelpCenterViewModel viewModel, List collectionIds, Function1 onCollectionClick, Function1 onAutoNavigateToCollection, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(collectionIds, "$collectionIds");
        Intrinsics.checkNotNullParameter(onCollectionClick, "$onCollectionClick");
        Intrinsics.checkNotNullParameter(onAutoNavigateToCollection, "$onAutoNavigateToCollection");
        HelpCenterCollectionsScreen(viewModel, collectionIds, onCollectionClick, onAutoNavigateToCollection, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HelpCenterCollectionsScreen(final HelpCenterViewModel viewModel, final List<String> collectionIds, final Function1<? super String, Unit> onCollectionClick, final Function1<? super String, Unit> onAutoNavigateToCollection, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(collectionIds, "collectionIds");
        Intrinsics.checkNotNullParameter(onCollectionClick, "onCollectionClick");
        Intrinsics.checkNotNullParameter(onAutoNavigateToCollection, "onAutoNavigateToCollection");
        Composer startRestartGroup = composer.startRestartGroup(-1836627764);
        EffectsKt.LaunchedEffect("", new HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$1(viewModel, collectionIds, null), startRestartGroup, 70);
        EffectsKt.LaunchedEffect("", new HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2(viewModel, onAutoNavigateToCollection, null), startRestartGroup, 70);
        boolean z = true;
        final State collectAsState = SnapshotStateKt.collectAsState(viewModel.getCollectionsState(), null, startRestartGroup, 8, 1);
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(2138903112);
        boolean changed = startRestartGroup.changed(collectAsState);
        if ((((i & 896) ^ 384) <= 256 || !startRestartGroup.changed(onCollectionClick)) && (i & 384) != 256) {
            z = false;
        }
        boolean z2 = changed | z;
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit HelpCenterCollectionsScreen$lambda$1$lambda$0;
                    HelpCenterCollectionsScreen$lambda$1$lambda$0 = HelpCenterCollectionsScreenKt.HelpCenterCollectionsScreen$lambda$1$lambda$0(State.this, onCollectionClick, (LazyListScope) obj);
                    return HelpCenterCollectionsScreen$lambda$1$lambda$0;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceGroup();
        LazyDslKt.LazyColumn(fillMaxSize$default, null, null, false, null, centerHorizontally, null, false, null, (Function1) rememberedValue, startRestartGroup, 196614, 478);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HelpCenterCollectionsScreen$lambda$2;
                    HelpCenterCollectionsScreen$lambda$2 = HelpCenterCollectionsScreenKt.HelpCenterCollectionsScreen$lambda$2(HelpCenterViewModel.this, collectionIds, onCollectionClick, onAutoNavigateToCollection, i, (Composer) obj, ((Integer) obj2).intValue());
                    return HelpCenterCollectionsScreen$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterCollectionsScreen$lambda$1$lambda$0(State state, Function1 onCollectionClick, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(onCollectionClick, "$onCollectionClick");
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final CollectionsUiState collectionsUiState = (CollectionsUiState) state.getValue();
        if (Intrinsics.areEqual(collectionsUiState, CollectionsUiState.Initial.INSTANCE) || Intrinsics.areEqual(collectionsUiState, CollectionsUiState.Loading.INSTANCE)) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$HelpCenterCollectionsScreenKt.INSTANCE.m11475getLambda1$intercom_sdk_base_release(), 3, null);
        } else if (collectionsUiState instanceof CollectionsUiState.Error) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2086280874, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$3$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 14) == 0) {
                        i |= composer.changed(item) ? 4 : 2;
                    }
                    if ((i & 91) != 18 || !composer.getSkipping()) {
                        HelpCenterErrorScreenKt.HelpCenterErrorScreen(((CollectionsUiState.Error) CollectionsUiState.this).getErrorState(), LazyItemScope.fillParentMaxHeight$default(item, Modifier.INSTANCE, 0.0f, 1, null), composer, 0, 0);
                    } else {
                        composer.skipToGroupEnd();
                    }
                }
            }), 3, null);
        } else {
            if (!(collectionsUiState instanceof CollectionsUiState.Content)) {
                throw new NoWhenBranchMatchedException();
            }
            CollectionsUiState.Content content = (CollectionsUiState.Content) collectionsUiState;
            if (content.getCollections().isEmpty()) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$HelpCenterCollectionsScreenKt.INSTANCE.m11476getLambda2$intercom_sdk_base_release(), 3, null);
            } else {
                helpCenterCollectionItems(LazyColumn, content, onCollectionClick);
            }
        }
        return Unit.INSTANCE;
    }

    private static final void helpCenterCollectionItems(LazyListScope lazyListScope, final CollectionsUiState.Content content, final Function1<? super String, Unit> function1) {
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-464708772, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$helpCenterCollectionItems$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                String obj;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                List<CollectionsRow> collections = CollectionsUiState.Content.this.getCollections();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : collections) {
                    if (!(((CollectionsRow) obj2) instanceof CollectionsRow.SendMessageRow)) {
                        arrayList.add(obj2);
                    }
                }
                int size = arrayList.size();
                if (size == 1) {
                    composer.startReplaceGroup(765329843);
                    obj = StringResources_androidKt.stringResource(R.string.intercom_single_collection, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(765428144);
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = composer.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    obj = Phrase.from((Context) consume, R.string.intercom_multiple_collections).put("total_collection", size).format().toString();
                    composer.endReplaceGroup();
                }
                TextKt.m3581TextNvy7gAk(obj, PaddingKt.m837padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8401constructorimpl(16)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType04SemiBold(), composer, 48, 0, 131068);
                IntercomDividerKt.IntercomDivider(null, composer, 0, 1);
            }
        }), 3, null);
        final List<CollectionsRow> collections = content.getCollections();
        lazyListScope.items(collections.size(), null, new Function1<Integer, Object>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                collections.get(i);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$3
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "CN(it)214@10668L26:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2039820996, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                CollectionsRow collectionsRow = (CollectionsRow) collections.get(i);
                composer.startReplaceGroup(766027716);
                if (Intrinsics.areEqual(collectionsRow, CollectionsRow.FullHelpCenterRow.INSTANCE)) {
                    composer.startReplaceGroup(766073285);
                    BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponent(PaddingKt.m841paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8401constructorimpl(24), 0.0f, 0.0f, 13, null), composer, 6, 0);
                    composer.endReplaceGroup();
                } else if (collectionsRow instanceof CollectionsRow.SendMessageRow) {
                    composer.startReplaceGroup(766223604);
                    TeamPresenceComponentKt.TeamPresenceComponent(((CollectionsRow.SendMessageRow) collectionsRow).getTeamPresenceState(), false, null, composer, 48, 4);
                    composer.endReplaceGroup();
                } else if (collectionsRow instanceof CollectionsRow.CollectionRow) {
                    composer.startReplaceGroup(766388896);
                    CollectionRowComponentKt.CollectionRowComponent(((CollectionsRow.CollectionRow) collectionsRow).getRowData(), function1, null, composer, 0, 4);
                    composer.endReplaceGroup();
                } else {
                    if (!Intrinsics.areEqual(collectionsRow, CollectionsRow.BrowseAllHelpTopicsAsListRow.INSTANCE)) {
                        composer.startReplaceGroup(-390931425);
                        composer.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(766553072);
                    BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsAsItem(null, composer, 0, 1);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }
}
