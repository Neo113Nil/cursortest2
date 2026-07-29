package o;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes.dex */
public final class LZ extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    public /* synthetic */ LZ(int i) {
        this.a = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.a) {
            case 0:
                if ((view instanceof OZ) && (outline2 = ((OZ) view).l) != null) {
                    outline.set(outline2);
                    break;
                }
                break;
            default:
                AbstractC0048Bt.l(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                Outline b = ((NZ) view).l.b();
                AbstractC0048Bt.k(b);
                outline.set(b);
                break;
        }
    }
}
