package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpandedTeamPresenceLayout.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$ExpandedTeamPresenceLayoutKt {
    public static final ComposableSingletons$ExpandedTeamPresenceLayoutKt INSTANCE = new ComposableSingletons$ExpandedTeamPresenceLayoutKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f240lambda1 = ComposableLambdaKt.composableLambdaInstance(1003438967, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                List listOf = CollectionsKt.listOf((Object[]) new Header.Expanded.Body[]{new Header.Expanded.Body(Header.Expanded.Style.PARAGRAPH, "Hi there! I'm a member of the Intercom team. How can I help you today?", "#000000"), new Header.Expanded.Body(Header.Expanded.Style.PARAGRAPH, "I'm here to answer any questions you have about Intercom.", "#000000")});
                AvatarType avatarType = AvatarType.FACEPILE;
                Avatar create = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "F");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                Avatar create2 = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "SK");
                Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
                Avatar create3 = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "RH");
                Intrinsics.checkNotNullExpressionValue(create3, "create(...)");
                ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(new ExpandedTeamPresenceState("SDKTestApp", listOf, avatarType, CollectionsKt.listOf((Object[]) new AvatarWrapper[]{new AvatarWrapper(create, false, 2, null), new AvatarWrapper(create2, false, 2, null), new AvatarWrapper(create3, false, 2, null)}), CollectionsKt.emptyList(), CollectionsKt.listOf(new Header.Expanded.SocialAccount("twitter", "https://twitter.com/intercom", "https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "intercom")), false), null, composer, 8, 2);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f241lambda2 = ComposableLambdaKt.composableLambdaInstance(-1374619086, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3409SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m11401getLambda1$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f242lambda3 = ComposableLambdaKt.composableLambdaInstance(1317404560, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                List listOf = CollectionsKt.listOf((Object[]) new Header.Expanded.Body[]{new Header.Expanded.Body(Header.Expanded.Style.PARAGRAPH, "Hi there! I'm a member of the Intercom team. How can I help you today?", "#000000"), new Header.Expanded.Body(Header.Expanded.Style.PARAGRAPH, "I'm here to answer any questions you have about Intercom.", "#000000")});
                AvatarType avatarType = AvatarType.LAYERED_BUBBLES;
                Avatar create = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "F");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(new ExpandedTeamPresenceState("SDKTestApp", listOf, avatarType, CollectionsKt.listOf(new AvatarWrapper(create, false, 2, null)), CollectionsKt.listOf(new Header.Expanded.Footer(Header.Expanded.Style.PARAGRAPH, "Powered by Intercom", null, new AvatarDetails(AvatarType.LAYERED_BUBBLES, CollectionsKt.listOf((Object[]) new Avatar.Builder[]{new Avatar.Builder().withImageUrl("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064").withInitials("SK"), new Avatar.Builder().withImageUrl("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064").withInitials("RH")})))), CollectionsKt.listOf(new Header.Expanded.SocialAccount("twitter", "https://twitter.com/intercom", "https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "intercom")), false), null, composer, 8, 2);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f243lambda4 = ComposableLambdaKt.composableLambdaInstance(2104929077, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3409SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m11403getLambda3$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f244lambda5 = ComposableLambdaKt.composableLambdaInstance(1099388065, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                List listOf = CollectionsKt.listOf((Object[]) new Header.Expanded.Body[]{new Header.Expanded.Body(Header.Expanded.Style.PARAGRAPH, "Hi there! I'm a member of the Intercom team. How can I help you today?", "#000000"), new Header.Expanded.Body(Header.Expanded.Style.PARAGRAPH, "I'm here to answer any questions you have about Intercom.", "#000000")});
                AvatarType avatarType = AvatarType.LAYERED_BUBBLES;
                Avatar create = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "SK");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(new ExpandedTeamPresenceState("SDKTestApp", listOf, avatarType, CollectionsKt.listOf(new AvatarWrapper(create, false, 2, null)), CollectionsKt.emptyList(), CollectionsKt.emptyList(), true), null, composer, 8, 2);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f245lambda6 = ComposableLambdaKt.composableLambdaInstance(-257155684, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3409SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m11405getLambda5$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11401getLambda1$intercom_sdk_base_release() {
        return f240lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11402getLambda2$intercom_sdk_base_release() {
        return f241lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11403getLambda3$intercom_sdk_base_release() {
        return f242lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11404getLambda4$intercom_sdk_base_release() {
        return f243lambda4;
    }

    /* renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11405getLambda5$intercom_sdk_base_release() {
        return f244lambda5;
    }

    /* renamed from: getLambda-6$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11406getLambda6$intercom_sdk_base_release() {
        return f245lambda6;
    }
}
