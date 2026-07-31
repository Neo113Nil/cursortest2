package io.intercom.android.sdk.m5.conversation.ui.components.row;

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
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.EventLabelSegment;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventRow.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"EventRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "labelSegments", "", "Lio/intercom/android/sdk/m5/conversation/states/EventLabelSegment;", "avatar", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;Landroidx/compose/runtime/Composer;II)V", "ParticipantAddedRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EventRowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventRow$lambda$1(Modifier modifier, List labelSegments, AvatarWrapper avatar, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(labelSegments, "$labelSegments");
        Intrinsics.checkNotNullParameter(avatar, "$avatar");
        EventRow(modifier, labelSegments, avatar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ParticipantAddedRowPreview$lambda$2(int i, Composer composer, int i2) {
        ParticipantAddedRowPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void EventRow(Modifier modifier, final List<EventLabelSegment> labelSegments, final AvatarWrapper avatar, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(labelSegments, "labelSegments");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Composer startRestartGroup = composer.startRestartGroup(150762908);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        float f = 6;
        FlowLayoutKt.FlowRow(PaddingKt.m839paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Dp.m8401constructorimpl(16), 0.0f, 2, null), Arrangement.INSTANCE.m697spacedByD5KLDUw(Dp.m8401constructorimpl(f), Alignment.INSTANCE.getCenterHorizontally()), Arrangement.INSTANCE.m698spacedByD5KLDUw(Dp.m8401constructorimpl(f), Alignment.INSTANCE.getCenterVertically()), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(639828375, true, new EventRowKt$EventRow$1(Dp.m8401constructorimpl(20), avatar, "Event: " + CollectionsKt.joinToString$default(labelSegments, "", null, null, 0, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence EventRow$lambda$0;
                EventRow$lambda$0 = EventRowKt.EventRow$lambda$0((EventLabelSegment) obj);
                return EventRow$lambda$0;
            }
        }, 30, null), IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5(), labelSegments), startRestartGroup, 54), startRestartGroup, 1573296, 56);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit EventRow$lambda$1;
                    EventRow$lambda$1 = EventRowKt.EventRow$lambda$1(Modifier.this, labelSegments, avatar, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return EventRow$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence EventRow$lambda$0(EventLabelSegment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }

    @IntercomPreviews
    private static final void ParticipantAddedRowPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(524974868);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$EventRowKt.INSTANCE.m11400getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ParticipantAddedRowPreview$lambda$2;
                    ParticipantAddedRowPreview$lambda$2 = EventRowKt.ParticipantAddedRowPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ParticipantAddedRowPreview$lambda$2;
                }
            });
        }
    }
}
