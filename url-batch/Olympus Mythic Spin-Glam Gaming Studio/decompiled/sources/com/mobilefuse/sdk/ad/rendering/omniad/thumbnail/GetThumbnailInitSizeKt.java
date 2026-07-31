package com.mobilefuse.sdk.ad.rendering.omniad.thumbnail;

import android.graphics.Point;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GetThumbnailInitSize.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"getThumbnailInitSize", "Landroid/graphics/Point;", "defaultSize", "admSize", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes12.dex */
public final class GetThumbnailInitSizeKt {
    @NotNull
    public static final Point getThumbnailInitSize(@NotNull Point defaultSize, @NotNull Point admSize) {
        Either errorResult;
        Object obj;
        Intrinsics.checkNotNullParameter(defaultSize, "defaultSize");
        Intrinsics.checkNotNullParameter(admSize, "admSize");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
        } catch (Throwable th) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (admSize.x <= 1 || admSize.y <= 1 || Intrinsics.areEqual(admSize, defaultSize)) {
            return defaultSize;
        }
        int max = Math.max(defaultSize.x, defaultSize.y);
        float f = admSize.x / admSize.y;
        Point point = new Point();
        if (f > 1) {
            point.x = max;
            point.y = (int) (max / f);
        } else {
            point.x = (int) (max * f);
            point.y = max;
        }
        errorResult = new SuccessResult(point);
        if (errorResult instanceof ErrorResult) {
            obj = defaultSize;
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = ((SuccessResult) errorResult).getValue();
        }
        return (Point) obj;
    }
}
