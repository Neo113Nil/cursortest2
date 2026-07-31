package io.bidmachine.rendering.internal.animation;

import io.bidmachine.rendering.model.ElementLayoutParams;
import io.bidmachine.rendering.model.SideType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public abstract class g {
    public static final SideType a(ElementLayoutParams elementLayoutParams) {
        Intrinsics.checkNotNullParameter(elementLayoutParams, "<this>");
        if (elementLayoutParams.getLeftSideBindParams() != null) {
            return elementLayoutParams.getLeftSideBindParams().getTargetSideType();
        }
        if (elementLayoutParams.getRightSideBindParams() != null) {
            return elementLayoutParams.getRightSideBindParams().getTargetSideType();
        }
        if (elementLayoutParams.getCenterXSideBindParams() != null) {
            return elementLayoutParams.getCenterXSideBindParams().getTargetSideType();
        }
        return null;
    }

    public static final SideType b(ElementLayoutParams elementLayoutParams) {
        Intrinsics.checkNotNullParameter(elementLayoutParams, "<this>");
        if (elementLayoutParams.getTopSideBindParams() != null) {
            return elementLayoutParams.getTopSideBindParams().getTargetSideType();
        }
        if (elementLayoutParams.getBottomSideBindParams() != null) {
            return elementLayoutParams.getBottomSideBindParams().getTargetSideType();
        }
        if (elementLayoutParams.getCenterYSideBindParams() != null) {
            return elementLayoutParams.getCenterYSideBindParams().getTargetSideType();
        }
        return null;
    }
}
