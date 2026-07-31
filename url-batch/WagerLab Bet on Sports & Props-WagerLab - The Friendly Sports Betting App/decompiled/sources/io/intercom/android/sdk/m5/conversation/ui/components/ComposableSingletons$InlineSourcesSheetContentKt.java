package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.exifinterface.media.ExifInterface;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Source;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: InlineSourcesSheetContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$InlineSourcesSheetContentKt {
    public static final ComposableSingletons$InlineSourcesSheetContentKt INSTANCE = new ComposableSingletons$InlineSourcesSheetContentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f184lambda1 = ComposableLambdaKt.composableLambdaInstance(-402572306, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$InlineSourcesSheetContentKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                InlineSourcesSheetContentKt.InlineSourcesSheetContent(CollectionsKt.listOf(new InlineSource("", "article", "1", "http://www.developer.intercom.com", "Your pay as you go bill explained")), CollectionsKt.listOf((Object[]) new Source[]{new Source("1", "article", "Your pay as you go bill explained", "http://www.developer.intercom.com"), new Source(ExifInterface.GPS_MEASUREMENT_2D, "external", "External article", "http://www.google.com/lol")}), null, composer, 0, 4);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f185lambda2 = ComposableLambdaKt.composableLambdaInstance(-1732890285, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$InlineSourcesSheetContentKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3409SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$InlineSourcesSheetContentKt.INSTANCE.m11248getLambda1$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11248getLambda1$intercom_sdk_base_release() {
        return f184lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11249getLambda2$intercom_sdk_base_release() {
        return f185lambda2;
    }
}
