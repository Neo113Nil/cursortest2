package sg.bigo.ads.z;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes15.dex */
public final class a extends sg.bigo.ads.y.b {
    public a(@NonNull sg.bigo.ads.api.core.g gVar) {
        super(gVar);
    }

    @Override // sg.bigo.ads.y.b
    public final void a(@NonNull ViewGroup viewGroup, MediaView mediaView, @Nullable View view, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list, int i, @Nullable View... viewArr) {
        super.a(viewGroup, mediaView, view, adOptionsView, list, i, viewArr);
        v.a(this.c, ((sg.bigo.ads.y.b) this).B);
    }

    @Override // sg.bigo.ads.y.b
    public final void a(@Nullable MediaView mediaView) {
        super.a(mediaView);
    }

    @Override // sg.bigo.ads.y.b
    public final boolean a(@NonNull ViewGroup viewGroup, View view, int i) {
        sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) f();
        if (view == null || aVar == null) {
            return false;
        }
        view.setTag(1);
        sg.bigo.ads.y.b.a(viewGroup, view);
        sg.bigo.ads.y.a.a(viewGroup, view, i, this, this.H);
        return true;
    }

    @Override // sg.bigo.ads.y.b, sg.bigo.ads.d.c
    public final void h() {
        if (((sg.bigo.ads.y.b) this).z > 0) {
            a("attach_render_cost", Long.valueOf(SystemClock.elapsedRealtime() - ((sg.bigo.ads.y.b) this).z));
        }
        super.h();
    }

    @Override // sg.bigo.ads.d.c
    public final String j() {
        View view = this.c;
        return view == null ? "" : view.getWidth() > this.c.getHeight() * 2 ? "320x50" : "300x250";
    }
}
