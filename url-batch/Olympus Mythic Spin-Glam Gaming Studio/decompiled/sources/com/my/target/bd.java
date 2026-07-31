package com.my.target;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.my.target.common.listeners.HtmlCustomEventListener;
import com.my.target.common.listeners.HtmlInteractionListener;
import com.my.target.common.listeners.HtmlInteractiveProgressListener;
import com.my.target.common.listeners.HtmlLoadingListener;
import com.my.target.common.views.Html5View;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.wh;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes10.dex */
public final class bd {
    private final int a;
    private final int b;
    private WeakReference c;
    private d d;
    private WeakReference e;
    private final ad f;
    private final pj g;
    private HtmlInteractionListener h;
    private HtmlLoadingListener i;
    private HtmlInteractiveProgressListener j;
    private HtmlCustomEventListener k;
    private long l;
    private final Html5View.WebViewClickListener m = new a();

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a extends Html5View.WebViewClickListener {
        a() {
        }

        @Override // com.my.target.common.views.Html5View.WebViewClickListener
        public void onCtaClick() {
            WeakReference weakReference;
            bd bdVar = bd.this;
            d dVar = bdVar.d;
            if (dVar == null || (weakReference = bdVar.c) == null) {
                return;
            }
            dVar.a(bdVar.f, (View) weakReference.get());
        }

        @Override // com.my.target.common.views.Html5View.WebViewClickListener
        public void onUrlClick(String str) {
            WeakReference weakReference;
            bd bdVar = bd.this;
            d dVar = bdVar.d;
            if (dVar == null || (weakReference = bdVar.c) == null) {
                return;
            }
            dVar.a(bdVar.f, str, (View) weakReference.get());
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private class b extends HtmlInteractiveProgressListener {
        private final HtmlInteractiveProgressListener a;

        public b(HtmlInteractiveProgressListener htmlInteractiveProgressListener) {
            this.a = htmlInteractiveProgressListener;
        }

        @Override // com.my.target.common.listeners.HtmlInteractiveProgressListener
        public void onInteractiveFinished() {
            this.a.onInteractiveFinished();
        }

        @Override // com.my.target.common.listeners.HtmlInteractiveProgressListener
        public void onInteractiveStarted() {
            this.a.onInteractiveStarted();
            wh.b(bd.this.f.H(), "interactiveStarted", 999);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private class c extends HtmlLoadingListener {
        private final HtmlLoadingListener a;

        public c(HtmlLoadingListener htmlLoadingListener) {
            this.a = htmlLoadingListener;
        }

        @Override // com.my.target.common.listeners.HtmlLoadingListener
        public void onError(WebView webView, HtmlLoadingListener.Error error, String str) {
            String str2 = "NativeAdHtmlController: Content JS error - " + error.getDescription();
            ad adVar = bd.this.f;
            if (adVar != null) {
                adVar.f().a(999, 3009, str2);
            }
            mi.a(str2);
            this.a.onError(webView, error, str);
        }

        @Override // com.my.target.common.listeners.HtmlLoadingListener
        public void onPageFinished(WebView webView, String str) {
            this.a.onPageFinished(webView, str);
        }

        @Override // com.my.target.common.listeners.HtmlLoadingListener
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.a.onPageStarted(webView, str, bitmap);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface d {
        void a(ad adVar, View view);

        void a(ad adVar, String str, View view);
    }

    private bd(ad adVar, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.f = adVar;
        this.g = pj.a(adVar.P(), adVar.H(), (wh.c) null);
    }

    public static bd a(ad adVar, int i, int i2) {
        return new bd(adVar, i, i2);
    }

    public void b() {
        Html5View html5View;
        WeakReference weakReference = this.c;
        if (weakReference == null || (html5View = (Html5View) weakReference.get()) == null) {
            return;
        }
        html5View.reloadHtmlContent();
    }

    public void c() {
        MediaAdView mediaAdView;
        this.g.e();
        WeakReference weakReference = this.e;
        if (weakReference == null || this.c == null || (mediaAdView = (MediaAdView) weakReference.get()) == null) {
            return;
        }
        this.e.clear();
        Html5View html5View = (Html5View) this.c.get();
        if (html5View == null) {
            return;
        }
        this.c.clear();
        mediaAdView.removeView(html5View);
    }

    public void a(d dVar) {
        this.d = dVar;
    }

    public void a(HtmlInteractionListener htmlInteractionListener) {
        Html5View html5View;
        this.h = htmlInteractionListener;
        WeakReference weakReference = this.c;
        if (weakReference == null || htmlInteractionListener == null || (html5View = (Html5View) weakReference.get()) == null) {
            return;
        }
        html5View.setHtmlInteractionListener(htmlInteractionListener);
    }

    public void a(HtmlLoadingListener htmlLoadingListener) {
        Html5View html5View;
        c cVar = htmlLoadingListener != null ? new c(htmlLoadingListener) : null;
        this.i = cVar;
        WeakReference weakReference = this.c;
        if (weakReference == null || cVar == null || (html5View = (Html5View) weakReference.get()) == null) {
            return;
        }
        html5View.setHtmlLoadingListener(cVar);
    }

    public void a(HtmlInteractiveProgressListener htmlInteractiveProgressListener) {
        Html5View html5View;
        b bVar = htmlInteractiveProgressListener != null ? new b(htmlInteractiveProgressListener) : null;
        this.j = bVar;
        WeakReference weakReference = this.c;
        if (weakReference == null || bVar == null || (html5View = (Html5View) weakReference.get()) == null) {
            return;
        }
        html5View.setHtmlInteractiveProgressListener(bVar);
    }

    public void a(HtmlCustomEventListener htmlCustomEventListener) {
        Html5View html5View;
        this.k = htmlCustomEventListener;
        WeakReference weakReference = this.c;
        if (weakReference == null || htmlCustomEventListener == null || (html5View = (Html5View) weakReference.get()) == null) {
            return;
        }
        html5View.setHtmlCustomEventListener(htmlCustomEventListener);
    }

    public void a(MediaAdView mediaAdView) {
        this.e = new WeakReference(mediaAdView);
        Html5View html5View = new Html5View(mediaAdView.getContext());
        this.c = new WeakReference(html5View);
        html5View.setWebViewClickListener(this.m);
        HtmlInteractionListener htmlInteractionListener = this.h;
        if (htmlInteractionListener != null) {
            html5View.setHtmlInteractionListener(htmlInteractionListener);
        }
        HtmlLoadingListener htmlLoadingListener = this.i;
        if (htmlLoadingListener != null) {
            html5View.setHtmlLoadingListener(htmlLoadingListener);
        }
        HtmlInteractiveProgressListener htmlInteractiveProgressListener = this.j;
        if (htmlInteractiveProgressListener != null) {
            html5View.setHtmlInteractiveProgressListener(htmlInteractiveProgressListener);
        }
        HtmlCustomEventListener htmlCustomEventListener = this.k;
        if (htmlCustomEventListener != null) {
            html5View.setHtmlCustomEventListener(htmlCustomEventListener);
        }
        html5View.setLoadingTimeoutMillis(this.l);
        html5View.setWebViewBackgroundColor(mediaAdView.getHtml5ViewBackgroundColor());
        html5View.setData(this.f.X());
        if (mediaAdView.getMediaAspectRatio() == 0.0f) {
            mediaAdView.setPlaceHolderDimension(this.a, this.b);
        }
        mediaAdView.addView(html5View, new ViewGroup.LayoutParams(-1, -1));
        this.g.b(mediaAdView);
    }

    public void a(long j) {
        Html5View html5View;
        this.l = j;
        WeakReference weakReference = this.c;
        if (weakReference == null || (html5View = (Html5View) weakReference.get()) == null) {
            return;
        }
        html5View.setLoadingTimeoutMillis(j);
    }

    public boolean a() {
        Html5View html5View;
        WeakReference weakReference = this.c;
        if (weakReference == null || (html5View = (Html5View) weakReference.get()) == null) {
            return false;
        }
        return html5View.getIsLoaded();
    }
}
