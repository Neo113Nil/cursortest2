package io.bidmachine.rendering.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/bidmachine/rendering/model/Image;", "", "Lio/bidmachine/rendering/model/ScaleType;", "scaleType", "Lio/bidmachine/rendering/model/Resource;", "resource", "<init>", "(Lio/bidmachine/rendering/model/ScaleType;Lio/bidmachine/rendering/model/Resource;)V", "a", "Lio/bidmachine/rendering/model/ScaleType;", "getScaleType", "()Lio/bidmachine/rendering/model/ScaleType;", "b", "Lio/bidmachine/rendering/model/Resource;", "getResource", "()Lio/bidmachine/rendering/model/Resource;", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class Image {

    /* renamed from: a, reason: from kotlin metadata */
    private final ScaleType scaleType;

    /* renamed from: b, reason: from kotlin metadata */
    private final Resource resource;

    public Image(@NotNull ScaleType scaleType, @NotNull Resource resource) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        Intrinsics.checkNotNullParameter(resource, "resource");
        this.scaleType = scaleType;
        this.resource = resource;
    }

    @NotNull
    public final Resource getResource() {
        return this.resource;
    }

    @NotNull
    public final ScaleType getScaleType() {
        return this.scaleType;
    }
}
