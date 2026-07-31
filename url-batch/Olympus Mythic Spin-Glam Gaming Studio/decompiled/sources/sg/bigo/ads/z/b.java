package sg.bigo.ads.z;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.dh.k;
import sg.bigo.ads.y.b;

/* loaded from: classes15.dex */
public final class b extends sg.bigo.ads.y.c {
    private a O;
    private d.a<NativeAd> P;
    private boolean Q;
    private boolean R;
    private boolean S;

    public b(@NonNull sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        this.Q = false;
        this.R = false;
        this.S = false;
        this.O = new a(gVar);
    }

    static /* synthetic */ void a(b bVar) {
        bVar.Q = true;
        if (!bVar.S || bVar.R || bVar.i) {
            return;
        }
        sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.z.b.2
            @Override // java.lang.Runnable
            public final void run() {
                if (((sg.bigo.ads.y.b) b.this).E != null) {
                    b.d(b.this);
                    b.this.O.a(((sg.bigo.ads.y.b) b.this).E);
                }
            }
        });
    }

    static /* synthetic */ void b(b bVar) {
        bVar.R = true;
        if (!bVar.S || bVar.i) {
            return;
        }
        sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.z.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b.d(b.this);
                if (((sg.bigo.ads.y.c) b.this).J == null || ((sg.bigo.ads.y.b) b.this).E == null) {
                    return;
                }
                b bVar2 = b.this;
                b.super.a(((sg.bigo.ads.y.b) bVar2).E);
            }
        });
    }

    static /* synthetic */ void d(b bVar) {
        MediaView mediaView = ((sg.bigo.ads.y.b) bVar).E;
        if (mediaView != null) {
            View findViewWithTag = mediaView.findViewWithTag("blur_image_view");
            ((sg.bigo.ads.y.b) bVar).E.removeAllViews();
            if (findViewWithTag != null) {
                v.a(findViewWithTag, ((sg.bigo.ads.y.b) bVar).E, null, 0);
            }
        }
    }

    @Override // sg.bigo.ads.y.b
    public final void B() {
        this.O.a(this.P, 0);
        b.InterfaceC1920b interfaceC1920b = ((sg.bigo.ads.y.b) this).A;
        if (interfaceC1920b != null) {
            interfaceC1920b.a();
        }
    }

    @Override // sg.bigo.ads.y.c
    @NonNull
    public final k J() {
        return new k(0, 1);
    }

    @Override // sg.bigo.ads.d.d, sg.bigo.ads.d.c
    public final void a() {
        super.a();
        this.O.a();
    }

    @Override // sg.bigo.ads.y.b
    public final void a(@NonNull ViewGroup viewGroup, MediaView mediaView, @Nullable View view, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list, int i, @Nullable View... viewArr) {
        super.a(viewGroup, mediaView, view, adOptionsView, list, i, viewArr);
        this.S = true;
        mediaView.setMediaAreaClickable(true);
        mediaView.b().a(false);
        v.a(this.c, ((sg.bigo.ads.y.b) this).B);
    }

    @Override // sg.bigo.ads.y.c, sg.bigo.ads.y.b
    public final void a(@NonNull final d.a<NativeAd> aVar, int i) {
        d.a<NativeAd> aVar2 = new d.a<NativeAd>() { // from class: sg.bigo.ads.z.b.1
            @Override // sg.bigo.ads.aj.d.a
            public final /* synthetic */ void a(NativeAd nativeAd) {
                NativeAd nativeAd2 = nativeAd;
                aVar.a(nativeAd2);
                if (nativeAd2 instanceof a) {
                    b.a(b.this);
                } else if (nativeAd2 instanceof b) {
                    b.b(b.this);
                }
            }

            @Override // sg.bigo.ads.aj.d.a
            public final /* bridge */ /* synthetic */ void a(NativeAd nativeAd, int i2, int i3, String str) {
                aVar.a(nativeAd, i2, i3, str);
            }

            @Override // sg.bigo.ads.aj.d.a
            public final /* bridge */ /* synthetic */ void a(NativeAd nativeAd, boolean z, int i2, int i3, String str, boolean z2) {
            }
        };
        this.P = aVar2;
        super.a(aVar2, i);
    }

    @Override // sg.bigo.ads.y.c, sg.bigo.ads.y.b
    public final void a(@Nullable final MediaView mediaView) {
        if (mediaView == null) {
            return;
        }
        if (this.R && ((sg.bigo.ads.y.c) this).J != null) {
            sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.z.b.4
                @Override // java.lang.Runnable
                public final void run() {
                    mediaView.removeAllViews();
                    b.super.a(mediaView);
                }
            });
        } else if (this.Q) {
            sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.z.b.5
                @Override // java.lang.Runnable
                public final void run() {
                    mediaView.removeAllViews();
                    b.this.O.a(mediaView);
                }
            });
        }
    }

    @Override // sg.bigo.ads.y.c, sg.bigo.ads.y.b, sg.bigo.ads.d.c
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
