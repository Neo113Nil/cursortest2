package io.intercom.android.sdk.utilities.coil;

import android.graphics.Bitmap;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import coil.size.Size;
import coil.transform.RoundedCornersTransformation;
import coil.transform.Transformation;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AvatarShapeTransformation.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/utilities/coil/AvatarShapeTransformation;", "Lcoil/transform/Transformation;", "avatarShape", "Lio/intercom/android/sdk/m5/components/avatar/AvatarShape;", "<init>", "(Lio/intercom/android/sdk/m5/components/avatar/AvatarShape;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", ViewProps.TRANSFORM, "Landroid/graphics/Bitmap;", MetricTracker.Object.INPUT, "size", "Lcoil/size/Size;", "(Landroid/graphics/Bitmap;Lcoil/size/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AvatarShapeTransformation implements Transformation {
    public static final int $stable = 0;
    private final AvatarShape avatarShape;

    public AvatarShapeTransformation(AvatarShape avatarShape) {
        Intrinsics.checkNotNullParameter(avatarShape, "avatarShape");
        this.avatarShape = avatarShape;
    }

    @Override // coil.transform.Transformation
    public String getCacheKey() {
        return this.avatarShape.name() + getClass().getName();
    }

    @Override // coil.transform.Transformation
    public Object transform(Bitmap bitmap, Size size, Continuation<? super Bitmap> continuation) {
        RoundedCornerShape composeShape = AvatarIconKt.getComposeShape(this.avatarShape);
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        long m5473constructorimpl = androidx.compose.ui.geometry.Size.m5473constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        Density Density$default = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        return new RoundedCornersTransformation(composeShape.getTopStart().mo1193toPxTmRCtEA(m5473constructorimpl, Density$default), composeShape.getTopEnd().mo1193toPxTmRCtEA(m5473constructorimpl, Density$default), composeShape.getBottomStart().mo1193toPxTmRCtEA(m5473constructorimpl, Density$default), composeShape.getBottomEnd().mo1193toPxTmRCtEA(m5473constructorimpl, Density$default)).transform(bitmap, size, continuation);
    }
}
