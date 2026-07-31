package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.profileinstaller.ProfileVerifier;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.inbox.InboxViewModel;
import io.intercom.android.sdk.m5.inbox.states.InboxUiState;
import io.intercom.android.sdk.models.ActionType;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EmptyState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InboxScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class InboxScreenKt$InboxScreen$5 implements Function3<PaddingValues, Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onBrowseHelpCenterButtonClick;
    final /* synthetic */ Function0<Unit> $onSendMessageButtonClick;
    final /* synthetic */ InboxUiState $uiState;
    final /* synthetic */ InboxViewModel $viewModel;

    InboxScreenKt$InboxScreen$5(InboxUiState inboxUiState, InboxViewModel inboxViewModel, Function0<Unit> function0, Function0<Unit> function02) {
        this.$uiState = inboxUiState;
        this.$viewModel = inboxViewModel;
        this.$onSendMessageButtonClick = function0;
        this.$onBrowseHelpCenterButtonClick = function02;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            Modifier consumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            final InboxUiState inboxUiState = this.$uiState;
            final InboxViewModel inboxViewModel = this.$viewModel;
            final Function0<Unit> function0 = this.$onSendMessageButtonClick;
            final Function0<Unit> function02 = this.$onBrowseHelpCenterButtonClick;
            LazyDslKt.LazyColumn(consumeWindowInsets, null, paddingValues, false, null, centerHorizontally, null, false, null, new Function1() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$2;
                    invoke$lambda$2 = InboxScreenKt$InboxScreen$5.invoke$lambda$2(InboxUiState.this, inboxViewModel, function0, function02, (LazyListScope) obj);
                    return invoke$lambda$2;
                }
            }, composer, ((i2 << 6) & 896) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 474);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(final InboxUiState uiState, final InboxViewModel viewModel, final Function0 onSendMessageButtonClick, final Function0 onBrowseHelpCenterButtonClick, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(uiState, "$uiState");
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(onSendMessageButtonClick, "$onSendMessageButtonClick");
        Intrinsics.checkNotNullParameter(onBrowseHelpCenterButtonClick, "$onBrowseHelpCenterButtonClick");
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (uiState instanceof InboxUiState.Content) {
            InboxUiState.Content content = (InboxUiState.Content) uiState;
            InboxContentScreenItemsKt.inboxContentScreenItems(LazyColumn, content.getInboxConversations(), new Function1() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$5$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$2$lambda$0;
                    invoke$lambda$2$lambda$0 = InboxScreenKt$InboxScreen$5.invoke$lambda$2$lambda$0(InboxViewModel.this, (Conversation) obj);
                    return invoke$lambda$2$lambda$0;
                }
            });
            final ErrorState errorState = content.getErrorState();
            if (errorState != null) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-61243482, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$5$1$2$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i & 81) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                        } else {
                            InboxScreenKt.InboxErrorRow(ErrorState.this, composer, 0);
                        }
                    }
                }), 3, null);
            }
            if (content.getIsLoadingMore()) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$InboxScreenKt.INSTANCE.m11598getLambda2$intercom_sdk_base_release(), 3, null);
            }
        } else if (uiState instanceof InboxUiState.Empty) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2100853483, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$5$1$3

                /* compiled from: InboxScreen.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[ActionType.values().length];
                        try {
                            iArr[ActionType.MESSAGE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[ActionType.HELP.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Function0<Unit> function0;
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 14) == 0) {
                        i |= composer.changed(item) ? 4 : 2;
                    }
                    if ((i & 91) != 18 || !composer.getSkipping()) {
                        EmptyState emptyState = ((InboxUiState.Empty) InboxUiState.this).getEmptyState();
                        boolean showActionButton = ((InboxUiState.Empty) InboxUiState.this).getShowActionButton();
                        int i2 = WhenMappings.$EnumSwitchMapping$0[((InboxUiState.Empty) InboxUiState.this).getEmptyState().getAction().getType().ordinal()];
                        if (i2 == 1) {
                            function0 = onSendMessageButtonClick;
                        } else {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            function0 = onBrowseHelpCenterButtonClick;
                        }
                        InboxEmptyScreenKt.InboxEmptyScreen(emptyState, showActionButton, function0, LazyItemScope.fillParentMaxHeight$default(item, Modifier.INSTANCE, 0.0f, 1, null), composer, 0, 0);
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }), 3, null);
        } else if (uiState instanceof InboxUiState.Error) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1129146582, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$5$1$4
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
                        InboxErrorScreenKt.InboxErrorScreen(((InboxUiState.Error) InboxUiState.this).getErrorState(), LazyItemScope.fillParentMaxHeight$default(item, Modifier.INSTANCE, 0.0f, 1, null), composer, 0, 0);
                    } else {
                        composer.skipToGroupEnd();
                    }
                }
            }), 3, null);
        } else if ((uiState instanceof InboxUiState.Initial) || (uiState instanceof InboxUiState.Loading)) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$InboxScreenKt.INSTANCE.m11599getLambda3$intercom_sdk_base_release(), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$0(InboxViewModel viewModel, Conversation conversation) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        viewModel.onConversationClick(conversation);
        return Unit.INSTANCE;
    }
}
