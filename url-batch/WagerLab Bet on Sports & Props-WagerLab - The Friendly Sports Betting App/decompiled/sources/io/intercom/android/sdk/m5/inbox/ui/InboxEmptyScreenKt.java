package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.EmptyStateKt;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import io.intercom.android.sdk.m5.home.data.IconType;
import io.intercom.android.sdk.models.ActionType;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InboxEmptyScreen.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\u0010"}, d2 = {"InboxEmptyScreen", "", "emptyState", "Lio/intercom/android/sdk/models/EmptyState;", "showActionButton", "", "onActionButtonClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lio/intercom/android/sdk/models/EmptyState;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EmptyScreenMessagePreview", "(Landroidx/compose/runtime/Composer;I)V", "EmptyScreenHelpPreview", "EmptyScreenWithoutActionPreview", "EmptyScreenBotPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InboxEmptyScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyScreenBotPreview$lambda$4(int i, Composer composer, int i2) {
        EmptyScreenBotPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyScreenHelpPreview$lambda$2(int i, Composer composer, int i2) {
        EmptyScreenHelpPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyScreenMessagePreview$lambda$1(int i, Composer composer, int i2) {
        EmptyScreenMessagePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyScreenWithoutActionPreview$lambda$3(int i, Composer composer, int i2) {
        EmptyScreenWithoutActionPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InboxEmptyScreen$lambda$0(EmptyState emptyState, boolean z, Function0 onActionButtonClick, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(emptyState, "$emptyState");
        Intrinsics.checkNotNullParameter(onActionButtonClick, "$onActionButtonClick");
        InboxEmptyScreen(emptyState, z, onActionButtonClick, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void InboxEmptyScreen(final EmptyState emptyState, final boolean z, final Function0<Unit> onActionButtonClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        Intrinsics.checkNotNullParameter(onActionButtonClick, "onActionButtonClick");
        Composer startRestartGroup = composer.startRestartGroup(-727293785);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(emptyState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(onActionButtonClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            EmptyStateKt.EmptyState(emptyState.getTitle(), modifier3, emptyState.getText(), Integer.valueOf(R.drawable.intercom_messages_icon), ComposableLambdaKt.rememberComposableLambda(2045450098, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt$InboxEmptyScreen$1

                /* compiled from: InboxEmptyScreen.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                    static {
                        int[] iArr = new int[IconType.values().length];
                        try {
                            iArr[IconType.TEAMMATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[IconType.BOT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[IconType.FIN.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[IconType.FACE_PILE.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                        int[] iArr2 = new int[ActionType.values().length];
                        try {
                            iArr2[ActionType.MESSAGE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr2[ActionType.HELP.ordinal()] = 2;
                        } catch (NoSuchFieldError unused6) {
                        }
                        $EnumSwitchMapping$1 = iArr2;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    Integer valueOf;
                    if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                        if (z) {
                            int i6 = WhenMappings.$EnumSwitchMapping$1[emptyState.getAction().getType().ordinal()];
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    composer2.startReplaceGroup(1738020481);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(1738038509);
                                IntercomPrimaryButtonKt.IntercomPrimaryButton(emptyState.getAction().getLabel(), null, Integer.valueOf(R.drawable.intercom_article_book_icon), onActionButtonClick, composer2, 0, 2);
                                composer2.endReplaceGroup();
                                return;
                            }
                            composer2.startReplaceGroup(1738022382);
                            String label = emptyState.getAction().getLabel();
                            IconType icon = emptyState.getAction().getIcon();
                            int i7 = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
                            if (i7 == 1) {
                                valueOf = Integer.valueOf(R.drawable.intercom_send_message_icon);
                            } else {
                                valueOf = (i7 == 2 || i7 == 3 || i7 == 4) ? Integer.valueOf(R.drawable.intercom_conversation_card_question) : null;
                            }
                            IntercomPrimaryButtonKt.IntercomPrimaryButton(label, null, valueOf, onActionButtonClick, composer2, 0, 2);
                            composer2.endReplaceGroup();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, ((i3 >> 6) & 112) | 24576, 0);
            modifier2 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InboxEmptyScreen$lambda$0;
                    InboxEmptyScreen$lambda$0 = InboxEmptyScreenKt.InboxEmptyScreen$lambda$0(EmptyState.this, z, onActionButtonClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return InboxEmptyScreen$lambda$0;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void EmptyScreenMessagePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1317218099);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m11586getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit EmptyScreenMessagePreview$lambda$1;
                    EmptyScreenMessagePreview$lambda$1 = InboxEmptyScreenKt.EmptyScreenMessagePreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return EmptyScreenMessagePreview$lambda$1;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void EmptyScreenHelpPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1522245405);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m11588getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit EmptyScreenHelpPreview$lambda$2;
                    EmptyScreenHelpPreview$lambda$2 = InboxEmptyScreenKt.EmptyScreenHelpPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return EmptyScreenHelpPreview$lambda$2;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void EmptyScreenWithoutActionPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-132232118);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m11590getLambda6$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit EmptyScreenWithoutActionPreview$lambda$3;
                    EmptyScreenWithoutActionPreview$lambda$3 = InboxEmptyScreenKt.EmptyScreenWithoutActionPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return EmptyScreenWithoutActionPreview$lambda$3;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void EmptyScreenBotPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(862447475);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m11592getLambda8$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit EmptyScreenBotPreview$lambda$4;
                    EmptyScreenBotPreview$lambda$4 = InboxEmptyScreenKt.EmptyScreenBotPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return EmptyScreenBotPreview$lambda$4;
                }
            });
        }
    }
}
