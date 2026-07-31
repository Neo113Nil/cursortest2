package sg.bigo.ads.z;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.api.AdIconView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.api.core.r;

/* loaded from: classes15.dex */
public final class c extends sg.bigo.ads.y.b implements sg.bigo.ads.bj.g {
    public boolean I;
    public boolean J;

    public c(@NonNull sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        this.I = false;
        this.J = false;
    }

    @Override // sg.bigo.ads.d.c
    @NonNull
    public final sg.bigo.ads.df.b a(r rVar, sg.bigo.ads.df.e[] eVarArr, sg.bigo.ads.df.e[] eVarArr2, sg.bigo.ads.df.e[] eVarArr3, sg.bigo.ads.df.e[] eVarArr4) {
        return new sg.bigo.ads.df.a(rVar, eVarArr, eVarArr2, eVarArr3, eVarArr4, sg.bigo.ads.da.b.c(this.b.a, this));
    }

    @Override // sg.bigo.ads.bj.g
    public final void a(int i, @NonNull String str, @Nullable sg.bigo.ads.bj.f fVar) {
        this.J = true;
    }

    @Override // sg.bigo.ads.bj.g
    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
        String str = fVar.e;
        this.I = true;
    }

    @Override // sg.bigo.ads.y.b
    public final void a(@NonNull d.a<NativeAd> aVar, int i) {
        aVar.a(this);
    }

    @Override // sg.bigo.ads.y.b
    public final boolean a(@NonNull ViewGroup viewGroup, View view, int i) {
        sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) f();
        if (view != null && aVar != null) {
            view.setTag(1);
            if (sg.bigo.ads.y.b.a(viewGroup, view)) {
                o.a aD = aVar.aD();
                if (aD != null) {
                    String c = aD.c();
                    if (k.a.n().a(9) && URLUtil.isHttpUrl(c)) {
                        sg.bigo.ads.da.b.a(aVar, 3000, 10220, "Invalid http url: ".concat(String.valueOf(c)));
                    } else if (view instanceof ImageView) {
                        sg.bigo.ads.bj.b bVar = new sg.bigo.ads.bj.b((ImageView) view, (byte) 0);
                        bVar.a(this);
                        bVar.a(sg.bigo.ads.bp.e.i(), aD.c(), aVar.am());
                    } else if (view instanceof AdIconView) {
                        ((AdIconView) view).a(sg.bigo.ads.bp.e.i(), aD.c(), aVar.am(), this);
                    }
                }
                sg.bigo.ads.y.a.a(viewGroup, view, i, this, this.H);
                return true;
            }
        }
        return false;
    }
}
