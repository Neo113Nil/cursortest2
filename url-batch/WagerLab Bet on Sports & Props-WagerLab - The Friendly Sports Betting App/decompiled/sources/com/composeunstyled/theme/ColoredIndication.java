package com.composeunstyled.theme;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: Indication.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/composeunstyled/theme/ColoredIndication;", "Landroidx/compose/foundation/IndicationNodeFactory;", "hoveredColor", "Landroidx/compose/ui/graphics/Color;", "pressedColor", "focusedColor", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "create", "Landroidx/compose/ui/node/DelegatableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "hashCode", "", "equals", "", "other", "", "ColoredIndicationInstance", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ColoredIndication implements IndicationNodeFactory {
    public static final int $stable = 0;
    private final long focusedColor;
    private final long hoveredColor;
    private final long pressedColor;

    public /* synthetic */ ColoredIndication(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public boolean equals(Object other) {
        return other == this;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public int hashCode() {
        return -1;
    }

    private ColoredIndication(long j, long j2, long j3) {
        this.hoveredColor = j;
        this.pressedColor = j2;
        this.focusedColor = j3;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public DelegatableNode create(InteractionSource interactionSource) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        return new ColoredIndicationInstance(interactionSource, this.hoveredColor, this.pressedColor, this.focusedColor, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Indication.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/composeunstyled/theme/ColoredIndication$ColoredIndicationInstance;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "hoveredColor", "Landroidx/compose/ui/graphics/Color;", "pressedColor", "focusedColor", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "isPressed", "", "isHovered", "isFocused", "onAttach", "", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class ColoredIndicationInstance extends Modifier.Node implements DrawModifierNode {
        private final long focusedColor;
        private final long hoveredColor;
        private final InteractionSource interactionSource;
        private boolean isFocused;
        private boolean isHovered;
        private boolean isPressed;
        private final long pressedColor;

        public /* synthetic */ ColoredIndicationInstance(InteractionSource interactionSource, long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
            this(interactionSource, j, j2, j3);
        }

        private ColoredIndicationInstance(InteractionSource interactionSource, long j, long j2, long j3) {
            Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
            this.interactionSource = interactionSource;
            this.hoveredColor = j;
            this.pressedColor = j2;
            this.focusedColor = j3;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new ColoredIndication$ColoredIndicationInstance$onAttach$1(this, null), 3, null);
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public void draw(ContentDrawScope contentDrawScope) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
            contentDrawScope.drawContent();
            if (this.isPressed) {
                DrawScope.m6230drawRectnJ9OG0$default(contentDrawScope, this.pressedColor, 0L, contentDrawScope.mo6236getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            }
            if (this.isHovered) {
                DrawScope.m6230drawRectnJ9OG0$default(contentDrawScope, this.hoveredColor, 0L, contentDrawScope.mo6236getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            }
            if (this.isFocused) {
                DrawScope.m6230drawRectnJ9OG0$default(contentDrawScope, this.focusedColor, 0L, contentDrawScope.mo6236getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            }
        }
    }
}
