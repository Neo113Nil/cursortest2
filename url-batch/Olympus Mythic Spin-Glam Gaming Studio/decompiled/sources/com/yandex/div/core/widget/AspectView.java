package com.yandex.div.core.widget;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: AspectView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bR\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/widget/AspectView;", "", "aspectRatio", "", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AspectView {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final float DEFAULT_ASPECT_RATIO = 0.0f;

    float getAspectRatio();

    void setAspectRatio(float f);

    /* compiled from: AspectView.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0000¢\u0006\u0002\b\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/widget/AspectView$Companion;", "", "()V", "DEFAULT_ASPECT_RATIO", "", "aspectRatioProperty", "Lkotlin/properties/ReadWriteProperty;", "Landroid/view/View;", "aspectRatioProperty$div_release", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final float DEFAULT_ASPECT_RATIO = 0.0f;

        private Companion() {
        }

        @NotNull
        public final ReadWriteProperty aspectRatioProperty$div_release() {
            return ViewsKt.dimensionAffecting(Float.valueOf(0.0f), new Function1() { // from class: com.yandex.div.core.widget.AspectView$Companion$aspectRatioProperty$1
                @NotNull
                public final Float invoke(float f) {
                    return Float.valueOf(RangesKt.coerceAtLeast(f, 0.0f));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).floatValue());
                }
            });
        }
    }
}
