package g;

import K.T;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* renamed from: g.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098G extends A.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2176e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I f2177f;

    public /* synthetic */ C0098G(I i, int i2) {
        this.f2176e = i2;
        this.f2177f = i;
    }

    @Override // K.d0
    public final void a() {
        View view;
        I i = this.f2177f;
        switch (this.f2176e) {
            case 0:
                if (i.f2195o && (view = i.f2189g) != null) {
                    view.setTranslationY(RecyclerView.f1570A0);
                    i.d.setTranslationY(RecyclerView.f1570A0);
                }
                i.d.setVisibility(8);
                i.d.setTransitioning(false);
                i.f2199s = null;
                B.j jVar = i.f2191k;
                if (jVar != null) {
                    jVar.D(i.f2190j);
                    i.f2190j = null;
                    i.f2191k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = i.f2186c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = T.f372a;
                    K.F.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                i.f2199s = null;
                i.d.requestLayout();
                break;
        }
    }
}
