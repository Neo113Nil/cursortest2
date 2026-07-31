package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.my.target.ae;
import com.my.target.common.ExternalClickHandler;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.listeners.HtmlCustomEventListener;
import com.my.target.common.listeners.HtmlInteractionListener;
import com.my.target.common.listeners.HtmlInteractiveProgressListener;
import com.my.target.common.listeners.HtmlLoadingListener;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.lb;
import com.my.target.mediation.AdChoicesClickHandler;
import com.my.target.mediation.AdNetworkConfig;
import com.my.target.mediation.ClickHandler;
import com.my.target.mediation.MediationAdapter;
import com.my.target.mediation.MediationNativeAdAdapter;
import com.my.target.mediation.MediationNativeAdConfig;
import com.my.target.mediation.MyTargetNativeAdAdapter;
import com.my.target.nativeads.NativeAd;
import com.my.target.nativeads.NativeAdViewBinder;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.tb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes.dex */
public class nb extends lb implements q5, NativeAd.NativeAdChoicesOptionListener {
    final NativeAd k;
    private final MenuFactory l;
    NativePromoBanner m;
    private WeakReference n;
    private WeakReference o;
    private WeakReference p;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements MediationNativeAdAdapter.MediationNativeAdListener {
        private final kb a;

        a(kb kbVar) {
            this.a = kbVar;
        }

        private boolean a() {
            return (this.a.j() || "0".equals(this.a.c().get("lg"))) ? false : true;
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void closeIfAutomaticallyDisabled(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = nb.this.k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return;
            }
            adChoicesOptionListener.closeIfAutomaticallyDisabled(nb.this.k);
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onAdChoicesIconLoad(ImageData imageData, boolean z, MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdChoicesListener adChoicesListener;
            nb nbVar = nb.this;
            if (nbVar.d == mediationNativeAdAdapter && (adChoicesListener = nbVar.k.getAdChoicesListener()) != null) {
                String b = this.a.b();
                if (z) {
                    mi.a("MediationNativeAdEngine: AdChoices icon from" + b + " ad network loaded successfully");
                } else {
                    mi.a("MediationNativeAdEngine: AdChoices icon from" + b + " hasn't loaded");
                }
                adChoicesListener.onAdChoicesIconLoad(imageData, z, nb.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onClick(MediationNativeAdAdapter mediationNativeAdAdapter) {
            if (nb.this.d != mediationNativeAdAdapter) {
                return;
            }
            wh.b(this.a.h(), "click", 2);
            NativeAd.NativeAdListener listener = nb.this.k.getListener();
            if (listener != null) {
                try {
                    listener.onClick(null, nb.this.k);
                } catch (AbstractMethodError e) {
                    if (e.getStackTrace().length == new Exception().getStackTrace().length) {
                        listener.onClick(nb.this.k);
                    }
                }
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onCloseAutomatically(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = nb.this.k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return;
            }
            adChoicesOptionListener.onCloseAutomatically(nb.this.k);
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onLoad(NativePromoBanner nativePromoBanner, MediationNativeAdAdapter mediationNativeAdAdapter) {
            if (nb.this.d != mediationNativeAdAdapter) {
                return;
            }
            String b = this.a.b();
            mi.a("MediationNativeAdEngine: Data from " + b + " ad network loaded successfully");
            Context j = nb.this.j();
            if (a() && j != null) {
                cd.b(b, nativePromoBanner, j);
            }
            nb.this.a(this.a, true);
            nb nbVar = nb.this;
            nbVar.m = nativePromoBanner;
            NativeAd.NativeAdListener listener = nbVar.k.getListener();
            if (listener != null) {
                listener.onLoad(nativePromoBanner, nb.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, MediationNativeAdAdapter mediationNativeAdAdapter) {
            if (nb.this.d != mediationNativeAdAdapter) {
                return;
            }
            mi.a("MediationNativeAdEngine: No data from " + this.a.b() + " ad network - " + iAdLoadingError);
            nb.this.a(this.a, false);
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onShow(MediationNativeAdAdapter mediationNativeAdAdapter) {
            if (nb.this.d != mediationNativeAdAdapter) {
                return;
            }
            wh.b(this.a.h(), "show", 1);
            NativeAd.NativeAdListener listener = nb.this.k.getListener();
            if (listener != null) {
                listener.onShow(nb.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onVideoComplete(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdListener listener;
            nb nbVar = nb.this;
            if (nbVar.d == mediationNativeAdAdapter && (listener = nbVar.k.getListener()) != null) {
                listener.onVideoComplete(nb.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onVideoPause(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdListener listener;
            nb nbVar = nb.this;
            if (nbVar.d == mediationNativeAdAdapter && (listener = nbVar.k.getListener()) != null) {
                listener.onVideoPause(nb.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public void onVideoPlay(MediationNativeAdAdapter mediationNativeAdAdapter) {
            NativeAd.NativeAdListener listener;
            nb nbVar = nb.this;
            if (nbVar.d == mediationNativeAdAdapter && (listener = nbVar.k.getListener()) != null) {
                listener.onVideoPlay(nb.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeAdAdapter.MediationNativeAdListener
        public boolean shouldCloseAutomatically() {
            NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = nb.this.k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return true;
            }
            return adChoicesOptionListener.shouldCloseAutomatically();
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class b extends lb.a implements MediationNativeAdConfig {
        private final int h;
        private final int i;
        private final MenuFactory j;

        private b(String str, String str2, Map map, int i, int i2, MyTargetPrivacy myTargetPrivacy, int i3, int i4, AdNetworkConfig adNetworkConfig, MenuFactory menuFactory) {
            super(str, str2, map, i, i2, myTargetPrivacy, adNetworkConfig);
            this.h = i3;
            this.i = i4;
            this.j = menuFactory;
        }

        public static b a(String str, String str2, Map map, int i, int i2, MyTargetPrivacy myTargetPrivacy, int i3, int i4, AdNetworkConfig adNetworkConfig, MenuFactory menuFactory) {
            return new b(str, str2, map, i, i2, myTargetPrivacy, i3, i4, adNetworkConfig, menuFactory);
        }

        @Override // com.my.target.mediation.MediationNativeAdConfig
        public int getAdChoicesPlacement() {
            return this.i;
        }

        @Override // com.my.target.mediation.MediationNativeAdConfig
        public int getCachePolicy() {
            return this.h;
        }

        @Override // com.my.target.mediation.MediationNativeAdConfig
        public MenuFactory getMenuFactory() {
            return this.j;
        }

        @Override // com.my.target.mediation.MediationNativeAdConfig
        public boolean isAutoLoadImages() {
            int i = this.h;
            return i == 0 || i == 1;
        }

        @Override // com.my.target.mediation.MediationNativeAdConfig
        public boolean isAutoLoadVideo() {
            int i = this.h;
            return i == 0 || i == 2;
        }
    }

    private nb(NativeAd nativeAd, jb jbVar, n nVar, tb.a aVar, MenuFactory menuFactory) {
        super(jbVar, nVar, aVar);
        this.k = nativeAd;
        this.l = menuFactory;
    }

    private void b(ImageData imageData, fh fhVar) {
        fhVar.setImageData(imageData);
        if (imageData == null || imageData.getBitmap() != null) {
            return;
        }
        b6.b(imageData, fhVar);
    }

    @Override // com.my.target.q5
    public void a(long j) {
    }

    @Override // com.my.target.q5
    public void a(ExternalClickHandler externalClickHandler) {
    }

    @Override // com.my.target.q5
    public void a(HtmlCustomEventListener htmlCustomEventListener) {
    }

    @Override // com.my.target.q5
    public void a(HtmlInteractionListener htmlInteractionListener) {
    }

    @Override // com.my.target.q5
    public void a(HtmlInteractiveProgressListener htmlInteractiveProgressListener) {
    }

    @Override // com.my.target.q5
    public void a(HtmlLoadingListener htmlLoadingListener) {
    }

    @Override // com.my.target.q5
    public void a(NativeAd.CollageItemsShowHandler collageItemsShowHandler) {
    }

    @Override // com.my.target.q5
    public NativeAd.NativeAdVideoPlayer c() {
        return null;
    }

    @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
    public void closeIfAutomaticallyDisabled(NativeAd nativeAd) {
        NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = this.k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return;
        }
        adChoicesOptionListener.closeIfAutomaticallyDisabled(this.k);
    }

    @Override // com.my.target.q5
    public boolean e() {
        return false;
    }

    @Override // com.my.target.q5
    public void f() {
    }

    @Override // com.my.target.q5
    public NativePromoBanner g() {
        return this.m;
    }

    @Override // com.my.target.lb
    void h() {
        NativeAd.NativeAdListener listener = this.k.getListener();
        if (listener != null) {
            listener.onNoAd(q.v, this.k);
        }
    }

    @Override // com.my.target.q5
    public void handleAdChoicesClick(Context context) {
        MediationAdapter mediationAdapter = this.d;
        if (mediationAdapter instanceof AdChoicesClickHandler) {
            ((AdChoicesClickHandler) mediationAdapter).handleAdChoicesClick(context);
        }
    }

    @Override // com.my.target.q5
    public void handleClick(boolean z, View view) {
        MediationAdapter mediationAdapter = this.d;
        if (mediationAdapter instanceof ClickHandler) {
            ((ClickHandler) mediationAdapter).handleClick(z, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.my.target.lb
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public MediationNativeAdAdapter i() {
        return new MyTargetNativeAdAdapter();
    }

    @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
    public void onCloseAutomatically(NativeAd nativeAd) {
        NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = this.k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return;
        }
        adChoicesOptionListener.onCloseAutomatically(this.k);
    }

    @Override // com.my.target.q5
    public void registerView(NativeAdViewBinder nativeAdViewBinder, List list, int i) {
        a(null, nativeAdViewBinder, list, i, null, true);
    }

    @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
    public boolean shouldCloseAutomatically() {
        NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = this.k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return true;
        }
        return adChoicesOptionListener.shouldCloseAutomatically();
    }

    @Override // com.my.target.q5
    public void unregisterView() {
        if (this.d == null) {
            mi.b("MediationNativeAdEngine error: can't unregister view, adapter is not set");
            return;
        }
        WeakReference weakReference = this.o;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            this.o.clear();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        WeakReference weakReference2 = this.n;
        MediaAdView mediaAdView = weakReference2 != null ? (MediaAdView) weakReference2.get() : null;
        if (mediaAdView != null) {
            this.n.clear();
            NativePromoBanner nativePromoBanner = this.m;
            a(nativePromoBanner != null ? nativePromoBanner.getImage() : null, (fh) mediaAdView.getImageView());
            mediaAdView.setPlaceHolderDimension(0, 0);
        }
        WeakReference weakReference3 = this.p;
        IconAdView iconAdView = weakReference3 != null ? (IconAdView) weakReference3.get() : null;
        if (iconAdView != null) {
            this.p.clear();
            NativePromoBanner nativePromoBanner2 = this.m;
            a(nativePromoBanner2 != null ? nativePromoBanner2.getIcon() : null, (fh) iconAdView.getImageView());
        }
        this.o = null;
        this.n = null;
        try {
            ((MediationNativeAdAdapter) this.d).unregisterView();
        } catch (Throwable th) {
            mi.b("MediationNativeAdEngine error: " + th);
        }
    }

    public static final nb a(NativeAd nativeAd, jb jbVar, n nVar, tb.a aVar, MenuFactory menuFactory) {
        return new nb(nativeAd, jbVar, nVar, aVar, menuFactory);
    }

    @Override // com.my.target.q5
    public void a(NativeAd.NativeAdMediaListener nativeAdMediaListener) {
        mi.a("MediationNativeAdEngine: NativeAdMediaListener is not currently supported for mediation");
    }

    @Override // com.my.target.q5
    public void a(View view, List list, int i, MediaAdView mediaAdView) {
        a(view, null, list, i, mediaAdView, false);
    }

    private void a(View view, NativeAdViewBinder nativeAdViewBinder, List list, int i, MediaAdView mediaAdView, boolean z) {
        ArrayList arrayList;
        ae a2;
        if (z && nativeAdViewBinder == null) {
            mi.b("MediationNativeAdEngine error: wrong args for using nativeAdViewBinder");
            return;
        }
        if (!z && view == null) {
            mi.b("MediationNativeAdEngine error: wrong args for using viewGroup like adView");
            return;
        }
        if (this.d == null) {
            mi.b("MediationNativeAdEngine error: can't register view, adapter is not set");
            return;
        }
        if (this.m == null) {
            mi.b("MediationNativeAdEngine error: can't register view, banner is null or not loaded yet");
            return;
        }
        unregisterView();
        View view2 = null;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view3 = (View) it.next();
                if (view3 != null) {
                    arrayList.add(view3);
                }
            }
        } else {
            arrayList = null;
        }
        if (!(this.d instanceof MyTargetNativeAdAdapter) && (z || (view instanceof ViewGroup))) {
            if (z) {
                a2 = new ae.a().a(nativeAdViewBinder).a();
            } else {
                a2 = new ae.a().b((ViewGroup) view).a(mediaAdView).a();
            }
            MediaAdView l = a2.l();
            if (l != null) {
                this.n = new WeakReference(l);
                try {
                    Context f = a2.f();
                    if (f != null) {
                        view2 = ((MediationNativeAdAdapter) this.d).getMediaView(f);
                    }
                } catch (Throwable th) {
                    mi.b("MediationNativeAdEngine error: " + th);
                }
                View view4 = view2;
                if (view4 != null) {
                    this.o = new WeakReference(view4);
                }
                a(l, view4, this.m.getImage(), this.m.hasVideo(), arrayList);
            }
            IconAdView k = a2.k();
            ImageData icon = this.m.getIcon();
            if (k != null && icon != null) {
                this.p = new WeakReference(k);
                b(icon, (fh) k.getImageView());
            }
        }
        try {
            if (z) {
                ((MediationNativeAdAdapter) this.d).registerView(nativeAdViewBinder, arrayList, i);
            } else {
                ((MediationNativeAdAdapter) this.d).registerView(view, arrayList, i);
            }
        } catch (Throwable th2) {
            mi.b("MediationNativeAdEngine error: " + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.my.target.lb
    public void a(MediationNativeAdAdapter mediationNativeAdAdapter, kb kbVar, Context context) {
        b a2 = b.a(kbVar.e(), kbVar.d(), kbVar.c(), this.a.h().getAge(), this.a.h().getGender(), MyTargetPrivacy.currentPrivacy(), this.a.g(), this.k.getAdChoicesPlacement(), TextUtils.isEmpty(this.h) ? null : this.a.a(this.h), this.l);
        if (mediationNativeAdAdapter instanceof MyTargetNativeAdAdapter) {
            x g = kbVar.g();
            if (g instanceof hd) {
                ((MyTargetNativeAdAdapter) mediationNativeAdAdapter).a((hd) g);
            }
        }
        try {
            mediationNativeAdAdapter.load(a2, new a(kbVar), context);
        } catch (Throwable th) {
            mi.b("MediationNativeAdEngine error: " + th);
        }
    }

    @Override // com.my.target.lb
    boolean a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationNativeAdAdapter;
    }

    private void a(ImageData imageData, fh fhVar) {
        if (imageData != null) {
            b6.a(imageData, fhVar);
        }
        fhVar.setImageData(null);
    }

    private void a(MediaAdView mediaAdView, View view, ImageData imageData, boolean z, List list) {
        int indexOf;
        if (imageData == null && !z) {
            mediaAdView.setPlaceHolderDimension(0, 0);
        } else if (imageData != null && imageData.getWidth() > 0 && imageData.getHeight() > 0) {
            mediaAdView.setPlaceHolderDimension(imageData.getWidth(), imageData.getHeight());
        } else {
            mediaAdView.setPlaceHolderDimension(16, 10);
        }
        if (view != null) {
            mi.a("MediationNativeAdEngine: Got MediaView from adapter");
            mediaAdView.addView(view);
            if (list == null || (indexOf = list.indexOf(mediaAdView)) < 0) {
                return;
            }
            list.remove(indexOf);
            list.add(view);
            return;
        }
        b(imageData, (fh) mediaAdView.getImageView());
    }
}
