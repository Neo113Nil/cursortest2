package com.composables.core;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: FocusRingIndication.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/composables/core/FocusRingIndicationNodeFactory;", "Landroidx/compose/foundation/IndicationNodeFactory;", "ringColor", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "Landroidx/compose/ui/unit/Dp;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "cornerRadius", "<init>", "(JFLandroidx/compose/foundation/layout/PaddingValues;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "F", "create", "Landroidx/compose/ui/node/DelegatableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "hashCode", "", "equals", "", "other", "", "FocusRingIndicationInstance", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FocusRingIndicationNodeFactory implements IndicationNodeFactory {
    public static final int $stable = 0;
    private final float cornerRadius;
    private final PaddingValues paddingValues;
    private final long ringColor;
    private final float strokeWidth;

    public /* synthetic */ FocusRingIndicationNodeFactory(long j, float f, PaddingValues paddingValues, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, paddingValues, f2);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public boolean equals(Object other) {
        return other == this;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public int hashCode() {
        return -1;
    }

    private FocusRingIndicationNodeFactory(long j, float f, PaddingValues paddingValues, float f2) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.ringColor = j;
        this.strokeWidth = f;
        this.paddingValues = paddingValues;
        this.cornerRadius = f2;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public DelegatableNode create(InteractionSource interactionSource) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        return new FocusRingIndicationInstance(interactionSource, this.ringColor, this.strokeWidth, this.paddingValues, this.cornerRadius, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FocusRingIndication.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\f\u0010\u0014\u001a\u00020\u0013*\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/composables/core/FocusRingIndicationNodeFactory$FocusRingIndicationInstance;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "ringColor", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "Landroidx/compose/ui/unit/Dp;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "cornerRadius", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;JFLandroidx/compose/foundation/layout/PaddingValues;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "F", "isFocused", "", "onAttach", "", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class FocusRingIndicationInstance extends Modifier.Node implements DrawModifierNode {
        private final float cornerRadius;
        private final InteractionSource interactionSource;
        private boolean isFocused;
        private final PaddingValues paddingValues;
        private final long ringColor;
        private final float strokeWidth;

        public /* synthetic */ FocusRingIndicationInstance(InteractionSource interactionSource, long j, float f, PaddingValues paddingValues, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(interactionSource, j, f, paddingValues, f2);
        }

        private FocusRingIndicationInstance(InteractionSource interactionSource, long j, float f, PaddingValues paddingValues, float f2) {
            Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            this.interactionSource = interactionSource;
            this.ringColor = j;
            this.strokeWidth = f;
            this.paddingValues = paddingValues;
            this.cornerRadius = f2;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            super.onAttach();
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new FocusRingIndicationNodeFactory$FocusRingIndicationInstance$onAttach$1(this, null), 3, null);
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public void draw(ContentDrawScope contentDrawScope) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
            contentDrawScope.drawContent();
            if (this.isFocused) {
                float f = contentDrawScope.mo424toPx0680j_4(this.cornerRadius);
                long m5367constructorimpl = CornerRadius.m5367constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                float f2 = contentDrawScope.mo424toPx0680j_4(this.strokeWidth);
                float f3 = contentDrawScope.mo424toPx0680j_4(this.paddingValues.getTop());
                float f4 = contentDrawScope.mo424toPx0680j_4(this.paddingValues.getBottom());
                float f5 = contentDrawScope.mo424toPx0680j_4(PaddingKt.calculateStartPadding(this.paddingValues, contentDrawScope.getLayoutDirection()));
                float intBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo6236getSizeNHjbRc() >> 32)) + f5 + contentDrawScope.mo424toPx0680j_4(PaddingKt.calculateEndPadding(this.paddingValues, contentDrawScope.getLayoutDirection()));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo6236getSizeNHjbRc() & 4294967295L)) + f3 + f4;
                long m5473constructorimpl = Size.m5473constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
                long m5405constructorimpl = Offset.m5405constructorimpl((Float.floatToRawIntBits(-f3) & 4294967295L) | (Float.floatToRawIntBits(-f5) << 32));
                Path Path = AndroidPath_androidKt.Path();
                Path.addRoundRect$default(Path, RoundRectKt.m5468RoundRectsniSvfs(RectKt.m5453Recttz77jQw(m5405constructorimpl, m5473constructorimpl), m5367constructorimpl), null, 2, null);
                DrawScope.m6226drawPathLG529CI$default(contentDrawScope, Path, this.ringColor, 0.0f, new Stroke(f2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
            }
        }
    }
}
