package expo.modules.devmenu.compose.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RippleNode.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J!\u0010\u0017\u001a\u00020\u0012*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lexpo/modules/devmenu/compose/ripple/StateLayer;", "", "bounded", "", "rippleAlpha", "Lkotlin/Function0;", "Lexpo/modules/devmenu/compose/ripple/RippleAlpha;", "<init>", "(ZLkotlin/jvm/functions/Function0;)V", "animatedAlpha", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "interactions", "", "Landroidx/compose/foundation/interaction/Interaction;", "currentInteraction", "handleInteraction", "", "interaction", "scope", "Lkotlinx/coroutines/CoroutineScope;", "handleInteraction$expo_dev_menu_release", "drawStateLayer", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "radius", "color", "Landroidx/compose/ui/graphics/Color;", "drawStateLayer-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class StateLayer {
    private final Animatable<Float, AnimationVector1D> animatedAlpha;
    private final boolean bounded;
    private Interaction currentInteraction;
    private final List<Interaction> interactions;
    private final Function0<RippleAlpha> rippleAlpha;

    public StateLayer(boolean z, Function0<RippleAlpha> rippleAlpha) {
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        this.bounded = z;
        this.rippleAlpha = rippleAlpha;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.interactions = new ArrayList();
    }

    public final void handleInteraction$expo_dev_menu_release(Interaction interaction, CoroutineScope scope) {
        AnimationSpec outgoingStateLayerAnimationSpecFor;
        float draggedAlpha;
        AnimationSpec incomingStateLayerAnimationSpecFor;
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        boolean z = interaction instanceof HoverInteraction.Enter;
        if (z) {
            this.interactions.add(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            this.interactions.remove(((HoverInteraction.Exit) interaction).getEnter());
        } else if (interaction instanceof FocusInteraction.Focus) {
            this.interactions.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            this.interactions.remove(((FocusInteraction.Unfocus) interaction).getFocus());
        } else if (interaction instanceof DragInteraction.Start) {
            this.interactions.add(interaction);
        } else if (interaction instanceof DragInteraction.Stop) {
            this.interactions.remove(((DragInteraction.Stop) interaction).getStart());
        } else if (!(interaction instanceof DragInteraction.Cancel)) {
            return;
        } else {
            this.interactions.remove(((DragInteraction.Cancel) interaction).getStart());
        }
        Interaction interaction2 = (Interaction) CollectionsKt.lastOrNull((List) this.interactions);
        if (Intrinsics.areEqual(this.currentInteraction, interaction2)) {
            return;
        }
        if (interaction2 == null) {
            outgoingStateLayerAnimationSpecFor = RippleNodeKt.outgoingStateLayerAnimationSpecFor(this.currentInteraction);
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new StateLayer$handleInteraction$2(this, outgoingStateLayerAnimationSpecFor, null), 3, null);
        } else {
            RippleAlpha invoke = this.rippleAlpha.invoke();
            if (z) {
                draggedAlpha = invoke.getHoveredAlpha();
            } else if (interaction instanceof FocusInteraction.Focus) {
                draggedAlpha = invoke.getFocusedAlpha();
            } else {
                draggedAlpha = interaction instanceof DragInteraction.Start ? invoke.getDraggedAlpha() : 0.0f;
            }
            incomingStateLayerAnimationSpecFor = RippleNodeKt.incomingStateLayerAnimationSpecFor(interaction2);
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new StateLayer$handleInteraction$1(this, draggedAlpha, incomingStateLayerAnimationSpecFor, null), 3, null);
        }
        this.currentInteraction = interaction2;
    }

    /* renamed from: drawStateLayer-mxwnekA, reason: not valid java name */
    public final void m10842drawStateLayermxwnekA(DrawScope drawStateLayer, float f, long j) {
        long j2;
        Intrinsics.checkNotNullParameter(drawStateLayer, "$this$drawStateLayer");
        float floatValue = this.animatedAlpha.getValue().floatValue();
        if (floatValue <= 0.0f) {
            return;
        }
        long m5656copywmQWz5c$default = Color.m5656copywmQWz5c$default(j, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            DrawScope.m6217drawCircleVaOC9Bg$default(drawStateLayer, m5656copywmQWz5c$default, f, 0L, 0.0f, null, null, 0, 124, null);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (drawStateLayer.mo6236getSizeNHjbRc() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawStateLayer.mo6236getSizeNHjbRc() & 4294967295L));
        int m5646getIntersectrtfAjoo = ClipOp.INSTANCE.m5646getIntersectrtfAjoo();
        DrawContext drawContext = drawStateLayer.getDrawContext();
        long mo6157getSizeNHjbRc = drawContext.mo6157getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6160clipRectN_I0leg(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, m5646getIntersectrtfAjoo);
            try {
                DrawScope.m6217drawCircleVaOC9Bg$default(drawStateLayer, m5656copywmQWz5c$default, f, 0L, 0.0f, null, null, 0, 124, null);
                drawContext.getCanvas().restore();
                drawContext.mo6158setSizeuvyYCjk(mo6157getSizeNHjbRc);
            } catch (Throwable th) {
                th = th;
                j2 = mo6157getSizeNHjbRc;
                drawContext.getCanvas().restore();
                drawContext.mo6158setSizeuvyYCjk(j2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j2 = mo6157getSizeNHjbRc;
        }
    }
}
