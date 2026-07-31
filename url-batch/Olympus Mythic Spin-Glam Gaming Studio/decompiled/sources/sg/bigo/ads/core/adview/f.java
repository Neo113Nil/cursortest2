package sg.bigo.ads.core.adview;

import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.B5;
import com.pubmatic.sdk.common.POBCommonConstants;
import io.bidmachine.util.MimeTypes;
import java.io.File;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.an.i;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.core.player.d;
import sg.bigo.ads.dh.p;

/* loaded from: classes11.dex */
public final class f extends c implements MediaView.a {
    public sg.bigo.ads.cz.f b;
    public AdImageView c;
    public Boolean d;
    public Boolean e;

    @Nullable
    public VideoController f;
    public boolean g;
    public sg.bigo.ads.dm.e h;
    public h i;
    private boolean j;

    static class a implements VideoController {

        @NonNull
        private final sg.bigo.ads.cz.f a;

        @Nullable
        private VideoController.VideoLifeCallback b;

        @Nullable
        private VideoController.d c;

        @Nullable
        private VideoController.c d;

        @Nullable
        private VideoController.a e;

        a(@NonNull sg.bigo.ads.cz.f fVar) {
            this.a = fVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final VideoController.a getBackupLoadCallback() {
            return this.e;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final VideoController.c getLoadHTMLCallback() {
            return this.d;
        }

        @Override // sg.bigo.ads.api.VideoController
        @Nullable
        public final VideoController.d getProgressChangeListener() {
            return this.c;
        }

        @Override // sg.bigo.ads.api.VideoController
        @Nullable
        public final VideoController.VideoLifeCallback getVideoLifeCallback() {
            return this.b;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final boolean isMuted() {
            sg.bigo.ads.core.player.d unused;
            unused = d.a.a;
            return this.a.c();
        }

        @Override // sg.bigo.ads.api.VideoController
        public final boolean isPaused() {
            sg.bigo.ads.core.player.d unused;
            unused = d.a.a;
            return this.a.getPlayStatus() == 3;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final boolean isPlaying() {
            sg.bigo.ads.core.player.d unused;
            unused = d.a.a;
            return this.a.r();
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void mute(boolean z) {
            sg.bigo.ads.core.player.d unused;
            unused = d.a.a;
            this.a.setMute(z);
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void notifyBackupResourceReady() {
            sg.bigo.ads.core.player.d unused;
            unused = d.a.a;
            sg.bigo.ads.cz.f fVar = this.a;
            if (fVar instanceof sg.bigo.ads.cz.e) {
                ((sg.bigo.ads.cz.e) fVar).l();
            }
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void notifyPlayViewRegister() {
            sg.bigo.ads.core.player.d dVar;
            dVar = d.a.a;
            dVar.a(this.a);
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void notifyResourceReady() {
            sg.bigo.ads.core.player.d unused;
            unused = d.a.a;
            sg.bigo.ads.cz.f fVar = this.a;
            if (fVar instanceof sg.bigo.ads.cz.e) {
                ((sg.bigo.ads.cz.e) fVar).m();
            }
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void pause() {
            sg.bigo.ads.core.player.d unused;
            unused = d.a.a;
            this.a.s();
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void play() {
            sg.bigo.ads.core.player.d unused;
            unused = d.a.a;
            this.a.e(true);
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setBackupLoadCallback(VideoController.a aVar) {
            this.e = aVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setLoadHTMLCallback(VideoController.c cVar) {
            this.d = cVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setNeedPauseWhenVisiblePercentEqual(boolean z) {
            sg.bigo.ads.cz.f fVar = this.a;
            if (fVar != null) {
                fVar.setNeedPauseWhenVisiblePercentEqual(z);
            }
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setProgressChangeListener(VideoController.d dVar) {
            this.c = dVar;
        }

        @Override // sg.bigo.ads.api.VideoController
        public final void setVideoLifeCallback(VideoController.VideoLifeCallback videoLifeCallback) {
            this.b = videoLifeCallback;
        }
    }

    class b implements View.OnTouchListener {
        private float c;
        private float d;
        private boolean b = false;
        private final i e = new i();

        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            h hVar;
            if (motionEvent.getActionMasked() == 0) {
                this.b = true;
                this.c = motionEvent.getX();
                this.d = motionEvent.getY();
                this.e.a = new Point((int) this.c, (int) this.d);
            } else if (motionEvent.getActionMasked() == 1) {
                if (this.b) {
                    this.b = false;
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    this.e.b = new Point(x, y);
                    if (f.this.a(x, y) && (hVar = f.this.i) != null) {
                        hVar.a(this.e, 1, 5);
                    }
                }
            } else if (motionEvent.getAction() == 3) {
                this.b = false;
            }
            return true;
        }
    }

    public f(@NonNull sg.bigo.ads.api.a<?> aVar) {
        super(aVar);
        this.b = null;
        this.c = null;
        Boolean bool = Boolean.TRUE;
        this.d = bool;
        this.e = bool;
        this.j = true;
        this.g = true;
    }

    private boolean b(int i, int i2) {
        AdImageView adImageView = this.c;
        if (adImageView != null) {
            return v.a(i, i2, adImageView);
        }
        sg.bigo.ads.cz.f fVar = this.b;
        if (fVar != null) {
            return v.a(i, i2, fVar);
        }
        sg.bigo.ads.dm.e eVar = this.h;
        if (eVar != null) {
            return v.a(i, i2, eVar);
        }
        return false;
    }

    @Override // sg.bigo.ads.core.adview.c
    protected final void a(View view) {
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        }
        v.a(view, this.a, null, -1);
    }

    public final void a(String str) {
        sg.bigo.ads.cz.e eVar = new sg.bigo.ads.cz.e(this.a.getContext(), 0, 0, sg.bigo.ads.ak.b.b(1), null);
        eVar.setClickable(this.j);
        a(eVar);
        eVar.setPlayInfo$505cff1c(str);
        this.f = new a(eVar);
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NonNull o oVar, @Nullable sg.bigo.ads.bj.g gVar) {
        AdImageView adImageView;
        ImageView.ScaleType scaleType;
        AdImageView adImageView2;
        FrameLayout.LayoutParams layoutParams;
        String bb = oVar.bb();
        if (k.a.n().a(9) && URLUtil.isHttpUrl(bb) && gVar != null) {
            gVar.a(1305, "Invalid http url", null);
            return;
        }
        sg.bigo.ads.ak.b b2 = sg.bigo.ads.ak.b.b(oVar.y());
        if (this.c == null) {
            this.c = new AdImageView(this.a.getContext());
        }
        int i = b2.a;
        if (i != 1) {
            if (i == 2) {
                adImageView = this.c;
                scaleType = ImageView.ScaleType.CENTER_CROP;
                adImageView.setScaleType(scaleType);
                a(this.c);
                this.c.a(gVar);
                this.c.a(bb, oVar.am());
                String bg = oVar.bg();
                if (k.a.n().a(28)) {
                }
                this.c.setBlurBorder(this.g);
            }
            if (i != 3) {
                if (i == 4) {
                    adImageView2 = this.c;
                    layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
                }
                a(this.c);
                this.c.a(gVar);
                this.c.a(bb, oVar.am());
                String bg2 = oVar.bg();
                if (k.a.n().a(28) || !(MimeTypes.IMAGE_GIF.equalsIgnoreCase(bg2) || "image/webp".equalsIgnoreCase(bg2))) {
                    this.c.setBlurBorder(this.g);
                }
                Pair<Boolean, String> a2 = AdImageView.a(this.a.getContext(), bb);
                if (this.h == null) {
                    sg.bigo.ads.dm.e a3 = sg.bigo.ads.dm.e.a(this.a.getContext());
                    this.h = a3;
                    if (a3 != null) {
                        a3.setOnTouchListener(new b());
                        this.h.setVerticalScrollBarEnabled(false);
                        this.h.setHorizontalScrollBarEnabled(false);
                        this.h.getSettings().setAllowFileAccess(true);
                        this.h.setWebViewClient(new sg.bigo.ads.dm.d() { // from class: sg.bigo.ads.core.adview.f.1
                            @Override // sg.bigo.ads.dm.d
                            public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                            }

                            @Override // sg.bigo.ads.dm.d, android.webkit.WebViewClient
                            public final void onPageFinished(WebView webView, String str) {
                                super.onPageFinished(webView, str);
                                try {
                                    f fVar = f.this;
                                    v.a(fVar.h, fVar.a, new FrameLayout.LayoutParams(-1, -1, 17), -1);
                                } catch (Throwable unused) {
                                }
                            }
                        });
                        this.h.setWebChromeClient(new sg.bigo.ads.dm.c() { // from class: sg.bigo.ads.core.adview.f.2
                        });
                    }
                }
                if (((Boolean) a2.first).booleanValue() && !TextUtils.isEmpty((CharSequence) a2.second)) {
                    bb = new File((String) a2.second).toURI().toString();
                }
                this.h.loadDataWithBaseURL(null, "<!DOCTYPE html><html><head><meta name='viewport' content='width=device-width, height=device-height, initial-scale=1.0'/><style>html, body {  margin:0;  padding:0;  width:100%;  height:100%;  background:transparent;}body {  display:flex;  justify-content:center;  align-items:center;}img {  max-width:100%;  max-height:100%;  width:auto;  height:auto;  object-fit:contain;}</style></head><body><img src='" + bb + "' /></body></html>", POBCommonConstants.CONTENT_TYPE_HTML, B5.O, null);
                return;
            }
            adImageView2 = this.c;
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
            adImageView2.setLayoutParams(layoutParams);
        }
        adImageView = this.c;
        scaleType = ImageView.ScaleType.FIT_CENTER;
        adImageView.setScaleType(scaleType);
        a(this.c);
        this.c.a(gVar);
        this.c.a(bb, oVar.am());
        String bg22 = oVar.bg();
        if (k.a.n().a(28)) {
        }
        this.c.setBlurBorder(this.g);
    }

    public final void a(@NonNull sg.bigo.ads.cp.a aVar, @NonNull p pVar, sg.bigo.ads.dk.c cVar) {
        int i;
        sg.bigo.ads.ak.b b2 = sg.bigo.ads.ak.b.b(aVar.y());
        n bd = aVar.bd();
        int i2 = pVar.x;
        int i3 = pVar.w;
        if (bd != null && bd.c > 0) {
            int i4 = bd.a;
            if (i4 > 0) {
                i2 = i4;
            }
            int i5 = bd.b;
            if (i5 > 0) {
                i = i5;
                sg.bigo.ads.cz.e eVar = new sg.bigo.ads.cz.e(this.a.getContext(), i2, i, b2, aVar);
                eVar.setClickable(this.j);
                a(eVar);
                eVar.setPlayInfo$505cff1c(aVar.c(this.a.getContext()));
                eVar.setOnEventListener(cVar);
                this.f = new a(eVar);
                this.b = eVar;
            }
        }
        i = i3;
        sg.bigo.ads.cz.e eVar2 = new sg.bigo.ads.cz.e(this.a.getContext(), i2, i, b2, aVar);
        eVar2.setClickable(this.j);
        a(eVar2);
        eVar2.setPlayInfo$505cff1c(aVar.c(this.a.getContext()));
        eVar2.setOnEventListener(cVar);
        this.f = new a(eVar2);
        this.b = eVar2;
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final void a(sg.bigo.ads.cz.b bVar) {
        sg.bigo.ads.cz.f fVar = this.b;
        if (fVar instanceof sg.bigo.ads.cz.e) {
            ((sg.bigo.ads.cz.e) fVar).setIVideoPlayerViewListener(bVar);
        }
    }

    public final void a(@NonNull sg.bigo.ads.cz.d dVar) {
        dVar.setVPAIDClickable(this.j);
        a((View) dVar);
        this.f = new a(dVar);
        this.b = dVar;
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final void a(boolean z) {
        sg.bigo.ads.cz.f fVar = this.b;
        if (fVar != null) {
            fVar.setClickable(z);
        } else {
            this.j = z;
        }
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final boolean a() {
        sg.bigo.ads.cz.f fVar = this.b;
        return fVar != null ? fVar.isClickable() : this.j;
    }

    @Override // sg.bigo.ads.core.adview.c
    public final boolean a(int i, int i2) {
        int i3;
        boolean b2 = b(i, i2);
        if ((super.a(i, i2) && (b(i, i2) ^ true)) && this.d.booleanValue()) {
            i3 = 9;
        } else {
            if (!b2 || !this.e.booleanValue()) {
                return false;
            }
            i3 = 5;
        }
        a(i3);
        return true;
    }

    @Override // sg.bigo.ads.api.MediaView.a
    public final void b() {
        sg.bigo.ads.cz.f fVar = this.b;
        if (fVar != null) {
            fVar.performClick();
        }
    }

    public final int c() {
        AdImageView adImageView = this.c;
        if (adImageView == null || adImageView.getDrawable() == null) {
            return 0;
        }
        return this.c.getDrawable().getIntrinsicHeight();
    }

    public final int d() {
        AdImageView adImageView = this.c;
        if (adImageView == null || adImageView.getDrawable() == null) {
            return 0;
        }
        return this.c.getDrawable().getIntrinsicWidth();
    }
}
