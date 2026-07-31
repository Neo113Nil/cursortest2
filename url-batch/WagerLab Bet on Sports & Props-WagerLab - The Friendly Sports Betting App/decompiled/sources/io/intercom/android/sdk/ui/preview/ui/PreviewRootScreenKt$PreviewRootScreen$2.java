package io.intercom.android.sdk.ui.preview.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.content.ContextCompat;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PreviewRootScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class PreviewRootScreenKt$PreviewRootScreen$2 implements Function3<PaddingValues, Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function0<Unit> $onBackCLick;
    final /* synthetic */ Function1<IntercomPreviewFile, Unit> $onDeleteClick;
    final /* synthetic */ Function1<List<? extends Uri>, Unit> $onSendClick;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $permissionLauncher;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ PreviewUiState $state;
    final /* synthetic */ PreviewViewModel $viewModel;

    /* JADX WARN: Multi-variable type inference failed */
    PreviewRootScreenKt$PreviewRootScreen$2(PreviewUiState previewUiState, Function0<Unit> function0, PagerState pagerState, Function1<? super IntercomPreviewFile, Unit> function1, Function1<? super List<? extends Uri>, Unit> function12, Context context, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher, PreviewViewModel previewViewModel, CoroutineScope coroutineScope) {
        this.$state = previewUiState;
        this.$onBackCLick = function0;
        this.$pagerState = pagerState;
        this.$onDeleteClick = function1;
        this.$onSendClick = function12;
        this.$context = context;
        this.$permissionLauncher = managedActivityResultLauncher;
        this.$viewModel = previewViewModel;
        this.$scope = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues it, Composer composer, int i) {
        int i2;
        String confirmationText;
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(it) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            Modifier.Companion companion = Modifier.INSTANCE;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composer);
            float calculateStartPadding = PaddingKt.calculateStartPadding(it, (LayoutDirection) consume);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m840paddingqDBjuR0(companion, calculateStartPadding, it.getTop(), PaddingKt.calculateEndPadding(it, (LayoutDirection) consume2), it.getBottom()), 0.0f, 1, null);
            final PreviewUiState previewUiState = this.$state;
            Function0<Unit> function0 = this.$onBackCLick;
            final PagerState pagerState = this.$pagerState;
            final Function1<IntercomPreviewFile, Unit> function1 = this.$onDeleteClick;
            final Function1<List<? extends Uri>, Unit> function12 = this.$onSendClick;
            final Context context = this.$context;
            final ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher = this.$permissionLauncher;
            final PreviewViewModel previewViewModel = this.$viewModel;
            final CoroutineScope coroutineScope = this.$scope;
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
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
            Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            PreviewTopBarKt.PreviewTopBar(null, previewUiState.getShowDeleteAction(), previewUiState.getShowSendAction(), previewUiState.getShowDownloadAction(), function0, new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$PreviewRootScreen$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$7$lambda$0;
                    invoke$lambda$7$lambda$0 = PreviewRootScreenKt$PreviewRootScreen$2.invoke$lambda$7$lambda$0(Function1.this, previewUiState);
                    return invoke$lambda$7$lambda$0;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$PreviewRootScreen$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$7$lambda$2;
                    invoke$lambda$7$lambda$2 = PreviewRootScreenKt$PreviewRootScreen$2.invoke$lambda$7$lambda$2(Function1.this, previewUiState);
                    return invoke$lambda$7$lambda$2;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$PreviewRootScreen$2$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$7$lambda$3;
                    invoke$lambda$7$lambda$3 = PreviewRootScreenKt$PreviewRootScreen$2.invoke$lambda$7$lambda$3(context, managedActivityResultLauncher, previewViewModel, previewUiState);
                    return invoke$lambda$7$lambda$3;
                }
            }, composer, 0, 1);
            PagerKt.m1141HorizontalPager8jOkeI(pagerState, ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-816981083, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$PreviewRootScreen$2$1$4
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer2, Integer num2) {
                    invoke(pagerScope, num.intValue(), composer2, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PagerScope HorizontalPager, int i3, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                    PreviewUriKt.PreviewUri(Modifier.INSTANCE, PreviewUiState.this.getFiles().get(i3), composer2, 70, 0);
                }
            }, composer, 54), composer, 0, 24576, 16380);
            composer.startReplaceGroup(1884493226);
            if (previewUiState.getFiles().size() > 1 || ((confirmationText = previewUiState.getConfirmationText()) != null && !StringsKt.isBlank(confirmationText))) {
                PreviewBottomBarKt.PreviewBottomBar(Modifier.INSTANCE, previewUiState, new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$PreviewRootScreen$2$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$7$lambda$4;
                        invoke$lambda$7$lambda$4 = PreviewRootScreenKt$PreviewRootScreen$2.invoke$lambda$7$lambda$4(CoroutineScope.this, pagerState, ((Integer) obj).intValue());
                        return invoke$lambda$7$lambda$4;
                    }
                }, new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$PreviewRootScreen$2$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$7$lambda$6;
                        invoke$lambda$7$lambda$6 = PreviewRootScreenKt$PreviewRootScreen$2.invoke$lambda$7$lambda$6(Function1.this, previewUiState);
                        return invoke$lambda$7$lambda$6;
                    }
                }, composer, 70, 0);
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$0(Function1 onDeleteClick, PreviewUiState state) {
        Intrinsics.checkNotNullParameter(onDeleteClick, "$onDeleteClick");
        Intrinsics.checkNotNullParameter(state, "$state");
        onDeleteClick.invoke(state.getFiles().get(state.getCurrentPage()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$2(Function1 onSendClick, PreviewUiState state) {
        Intrinsics.checkNotNullParameter(onSendClick, "$onSendClick");
        Intrinsics.checkNotNullParameter(state, "$state");
        List<IntercomPreviewFile> files = state.getFiles();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(files, 10));
        Iterator<T> it = files.iterator();
        while (it.hasNext()) {
            arrayList.add(((IntercomPreviewFile) it.next()).getUri());
        }
        onSendClick.invoke(arrayList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$3(Context context, ManagedActivityResultLauncher permissionLauncher, PreviewViewModel previewViewModel, PreviewUiState state) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(permissionLauncher, "$permissionLauncher");
        Intrinsics.checkNotNullParameter(state, "$state");
        if (Build.VERSION.SDK_INT >= 29) {
            PreviewRootScreenKt.PreviewRootScreen$saveFile(previewViewModel, state, context);
        } else if (ContextCompat.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            PreviewRootScreenKt.PreviewRootScreen$saveFile(previewViewModel, state, context);
        } else {
            permissionLauncher.launch("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(Function1 onSendClick, PreviewUiState state) {
        Intrinsics.checkNotNullParameter(onSendClick, "$onSendClick");
        Intrinsics.checkNotNullParameter(state, "$state");
        List<IntercomPreviewFile> files = state.getFiles();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(files, 10));
        Iterator<T> it = files.iterator();
        while (it.hasNext()) {
            arrayList.add(((IntercomPreviewFile) it.next()).getUri());
        }
        onSendClick.invoke(arrayList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$4(CoroutineScope scope, PagerState pagerState, int i) {
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(pagerState, "$pagerState");
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new PreviewRootScreenKt$PreviewRootScreen$2$1$5$1(pagerState, i, null), 3, null);
        return Unit.INSTANCE;
    }
}
