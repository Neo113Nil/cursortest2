package o;

import android.view.RenderNode;

/* renamed from: o.nN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1559nN {
    public static final C1559nN a = new C1559nN();

    public final int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i) {
        renderNode.setAmbientShadowColor(i);
    }

    public final void d(RenderNode renderNode, int i) {
        renderNode.setSpotShadowColor(i);
    }
}
