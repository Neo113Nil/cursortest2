package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.facebook.share.internal.ShareConstants;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuickReplies.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a9\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0006H\u0001¢\u0006\u0002\u0010\u000e\u001a9\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0006H\u0001¢\u0006\u0002\u0010\u000e\u001a/\u0010\u0013\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0006H\u0001¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"QuickReplies", "", "quickReplies", "", "Lio/intercom/android/sdk/m5/conversation/ui/components/row/QuickReply;", "onQuickReplyClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ReplyOptions", "replyOptions", "Lio/intercom/android/sdk/models/ReplyOption;", "onReplyClicked", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ComposerSuggestions", ShareConstants.WEB_DIALOG_PARAM_SUGGESTIONS, "Lio/intercom/android/sdk/m5/conversation/states/ReplySuggestion;", "onSuggestionClick", "AnimatedQuickReplies", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "QuickRepliesPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QuickRepliesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedQuickReplies$lambda$14(List replyOptions, Function1 onReplyClicked, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(replyOptions, "$replyOptions");
        Intrinsics.checkNotNullParameter(onReplyClicked, "$onReplyClicked");
        AnimatedQuickReplies(replyOptions, onReplyClicked, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposerSuggestions$lambda$10(Modifier modifier, List suggestions, Function1 onSuggestionClick, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(suggestions, "$suggestions");
        Intrinsics.checkNotNullParameter(onSuggestionClick, "$onSuggestionClick");
        ComposerSuggestions(modifier, suggestions, onSuggestionClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickReplies$lambda$0(List quickReplies, Function1 onQuickReplyClick, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(quickReplies, "$quickReplies");
        Intrinsics.checkNotNullParameter(onQuickReplyClick, "$onQuickReplyClick");
        QuickReplies(quickReplies, onQuickReplyClick, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickRepliesPreview$lambda$15(int i, Composer composer, int i2) {
        QuickRepliesPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReplyOptions$lambda$5(Modifier modifier, List replyOptions, Function1 onReplyClicked, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(replyOptions, "$replyOptions");
        Intrinsics.checkNotNullParameter(onReplyClicked, "$onReplyClicked");
        ReplyOptions(modifier, replyOptions, onReplyClicked, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void QuickReplies(final List<QuickReply> quickReplies, final Function1<? super QuickReply, Unit> onQuickReplyClick, Modifier modifier, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(quickReplies, "quickReplies");
        Intrinsics.checkNotNullParameter(onQuickReplyClick, "onQuickReplyClick");
        Composer startRestartGroup = composer.startRestartGroup(368433331);
        if ((i2 & 4) != 0) {
            modifier = Modifier.INSTANCE;
        }
        float f = 8;
        FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Arrangement.INSTANCE.m697spacedByD5KLDUw(Dp.m8401constructorimpl(f), Alignment.INSTANCE.getEnd()), Arrangement.INSTANCE.m698spacedByD5KLDUw(Dp.m8401constructorimpl(f), Alignment.INSTANCE.getBottom()), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-458232018, true, new QuickRepliesKt$QuickReplies$1(quickReplies, onQuickReplyClick), startRestartGroup, 54), startRestartGroup, 1573296, 56);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier2 = modifier;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit QuickReplies$lambda$0;
                    QuickReplies$lambda$0 = QuickRepliesKt.QuickReplies$lambda$0(quickReplies, onQuickReplyClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return QuickReplies$lambda$0;
                }
            });
        }
    }

    public static final void ReplyOptions(Modifier modifier, final List<ReplyOption> replyOptions, final Function1<? super ReplyOption, Unit> onReplyClicked, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(replyOptions, "replyOptions");
        Intrinsics.checkNotNullParameter(onReplyClicked, "onReplyClicked");
        Composer startRestartGroup = composer.startRestartGroup(-1003293676);
        final Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        List<ReplyOption> list = replyOptions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ReplyOption replyOption : list) {
            arrayList.add(new QuickReply(replyOption.getUuid(), replyOption.getText()));
        }
        QuickReplies(arrayList, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ReplyOptions$lambda$4;
                ReplyOptions$lambda$4 = QuickRepliesKt.ReplyOptions$lambda$4(replyOptions, onReplyClicked, (QuickReply) obj);
                return ReplyOptions$lambda$4;
            }
        }, modifier2, startRestartGroup, ((i << 6) & 896) | 8, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ReplyOptions$lambda$5;
                    ReplyOptions$lambda$5 = QuickRepliesKt.ReplyOptions$lambda$5(Modifier.this, replyOptions, onReplyClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ReplyOptions$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReplyOptions$lambda$4(List replyOptions, Function1 onReplyClicked, QuickReply quickReply) {
        Object obj;
        Intrinsics.checkNotNullParameter(replyOptions, "$replyOptions");
        Intrinsics.checkNotNullParameter(onReplyClicked, "$onReplyClicked");
        Intrinsics.checkNotNullParameter(quickReply, "quickReply");
        Iterator it = replyOptions.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ReplyOption) obj).getUuid(), quickReply.getId())) {
                break;
            }
        }
        ReplyOption replyOption = (ReplyOption) obj;
        if (replyOption != null) {
            onReplyClicked.invoke(replyOption);
        }
        return Unit.INSTANCE;
    }

    public static final void ComposerSuggestions(Modifier modifier, final List<ReplySuggestion> suggestions, final Function1<? super ReplySuggestion, Unit> onSuggestionClick, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(onSuggestionClick, "onSuggestionClick");
        Composer startRestartGroup = composer.startRestartGroup(-719570861);
        final Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        List<ReplySuggestion> list = suggestions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ReplySuggestion replySuggestion : list) {
            arrayList.add(new QuickReply(replySuggestion.getId(), replySuggestion.getText()));
        }
        QuickReplies(arrayList, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ComposerSuggestions$lambda$9;
                ComposerSuggestions$lambda$9 = QuickRepliesKt.ComposerSuggestions$lambda$9(suggestions, onSuggestionClick, (QuickReply) obj);
                return ComposerSuggestions$lambda$9;
            }
        }, modifier2, startRestartGroup, ((i << 6) & 896) | 8, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ComposerSuggestions$lambda$10;
                    ComposerSuggestions$lambda$10 = QuickRepliesKt.ComposerSuggestions$lambda$10(Modifier.this, suggestions, onSuggestionClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ComposerSuggestions$lambda$10;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposerSuggestions$lambda$9(List suggestions, Function1 onSuggestionClick, QuickReply quickReply) {
        Object obj;
        Intrinsics.checkNotNullParameter(suggestions, "$suggestions");
        Intrinsics.checkNotNullParameter(onSuggestionClick, "$onSuggestionClick");
        Intrinsics.checkNotNullParameter(quickReply, "quickReply");
        Iterator it = suggestions.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ReplySuggestion) obj).getId(), quickReply.getId())) {
                break;
            }
        }
        ReplySuggestion replySuggestion = (ReplySuggestion) obj;
        if (replySuggestion != null) {
            onSuggestionClick.invoke(replySuggestion);
        }
        return Unit.INSTANCE;
    }

    public static final void AnimatedQuickReplies(final List<ReplyOption> replyOptions, final Function1<? super ReplyOption, Unit> onReplyClicked, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(replyOptions, "replyOptions");
        Intrinsics.checkNotNullParameter(onReplyClicked, "onReplyClicked");
        Composer startRestartGroup = composer.startRestartGroup(-2072519615);
        startRestartGroup.startReplaceGroup(-407350720);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Object obj = rememberedValue;
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            MutableTransitionState mutableTransitionState = new MutableTransitionState(false);
            mutableTransitionState.setTargetState$animation_core(true);
            startRestartGroup.updateRememberedValue(mutableTransitionState);
            obj = mutableTransitionState;
        }
        startRestartGroup.endReplaceGroup();
        AnimatedVisibilityKt.AnimatedVisibility((MutableTransitionState<Boolean>) obj, (Modifier) null, EnterExitTransitionKt.slideInVertically$default(null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int AnimatedQuickReplies$lambda$13;
                AnimatedQuickReplies$lambda$13 = QuickRepliesKt.AnimatedQuickReplies$lambda$13(((Integer) obj2).intValue());
                return Integer.valueOf(AnimatedQuickReplies$lambda$13);
            }
        }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(992499481, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$AnimatedQuickReplies$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                invoke(animatedVisibilityScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                float f = 16;
                QuickRepliesKt.ReplyOptions(PaddingKt.m841paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8401constructorimpl(f), 0.0f, Dp.m8401constructorimpl(f), 0.0f, 10, null), replyOptions, onReplyClicked, composer2, 70, 0);
            }
        }, startRestartGroup, 54), startRestartGroup, MutableTransitionState.$stable | 200064, 18);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit AnimatedQuickReplies$lambda$14;
                    AnimatedQuickReplies$lambda$14 = QuickRepliesKt.AnimatedQuickReplies$lambda$14(replyOptions, onReplyClicked, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return AnimatedQuickReplies$lambda$14;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AnimatedQuickReplies$lambda$13(int i) {
        return i / 2;
    }

    @IntercomPreviews
    public static final void QuickRepliesPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1503246755);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$QuickRepliesKt.INSTANCE.m11415getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit QuickRepliesPreview$lambda$15;
                    QuickRepliesPreview$lambda$15 = QuickRepliesKt.QuickRepliesPreview$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                    return QuickRepliesPreview$lambda$15;
                }
            });
        }
    }
}
