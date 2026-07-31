package io.bidmachine.rendering.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/bidmachine/rendering/model/Color;", "", "Lio/bidmachine/rendering/model/ColorSource;", "source", "", "isContextBased", "<init>", "(Lio/bidmachine/rendering/model/ColorSource;Z)V", "a", "Lio/bidmachine/rendering/model/ColorSource;", "getSource", "()Lio/bidmachine/rendering/model/ColorSource;", "b", "Z", "()Z", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class Color {

    /* renamed from: a, reason: from kotlin metadata */
    private final ColorSource source;

    /* renamed from: b, reason: from kotlin metadata */
    private final boolean isContextBased;

    public Color(@NotNull ColorSource source, boolean z) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.isContextBased = z;
    }

    @NotNull
    public final ColorSource getSource() {
        return this.source;
    }

    /* renamed from: isContextBased, reason: from getter */
    public final boolean getIsContextBased() {
        return this.isContextBased;
    }

    public /* synthetic */ Color(ColorSource colorSource, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSource, (i & 2) != 0 ? false : z);
    }
}
