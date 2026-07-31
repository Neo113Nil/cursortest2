package io.bidmachine.rendering.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/bidmachine/rendering/model/ColorPlaceholderSource;", "Lio/bidmachine/rendering/model/PlaceholderSource;", "Lio/bidmachine/rendering/model/Color;", "color", "<init>", "(Lio/bidmachine/rendering/model/Color;)V", "a", "Lio/bidmachine/rendering/model/Color;", "getColor", "()Lio/bidmachine/rendering/model/Color;", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ColorPlaceholderSource implements PlaceholderSource {

    /* renamed from: a, reason: from kotlin metadata */
    private final Color color;

    public ColorPlaceholderSource(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.color = color;
    }

    @NotNull
    public final Color getColor() {
        return this.color;
    }
}
