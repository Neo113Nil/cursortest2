package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.my.target.ae;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.lb;
import com.my.target.mediation.AdChoicesClickHandler;
import com.my.target.mediation.AdNetworkConfig;
import com.my.target.mediation.ClickHandler;
import com.my.target.mediation.MediationAdapter;
import com.my.target.mediation.MediationNativeBannerAdAdapter;
import com.my.target.mediation.MediationNativeBannerAdConfig;
import com.my.target.mediation.MyTargetNativeBannerAdAdapter;
import com.my.target.nativeads.NativeBannerAd;
import com.my.target.nativeads.NativeBannerAdViewBinder;
import com.my.target.nativeads.banners.NativeBanner;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.tb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes13.dex */
public class ob extends lb implements r5, NativeBannerAd.NativeBannerAdChoicesOptionListener {
    final NativeBannerAd k;
    private final MenuFactory l;
    NativeBanner m;
    private WeakReference n;
    private WeakReference o;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements MediationNativeBannerAdAdapter.MediationNativeBannerAdListener {
        private final kb a;

        a(kb kbVar) {
            this.a = kbVar;
        }

        private boolean a() {
            return (this.a.j() || "0".equals(this.a.c().get("lg"))) ? false : true;
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void closeIfAutomaticallyDisabled(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = ob.this.k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return;
            }
            adChoicesOptionListener.closeIfAutomaticallyDisabled(ob.this.k);
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onAdChoicesIconLoad(ImageData imageData, boolean z, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            NativeBannerAd.NativeBannerAdChoicesListener adChoicesListener = ob.this.k.getAdChoicesListener();
            if (adChoicesListener == null) {
                return;
            }
            String b = this.a.b();
            if (z) {
                mi.a("MediationNativeBannerAdEngine: AdChoices icon from" + b + " ad network loaded successfully");
            } else {
                mi.a("MediationNativeBannerAdEngine: AdChoices icon from" + b + " hasn't loaded");
            }
            adChoicesListener.onAdChoicesIconLoad(imageData, z, ob.this.k);
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onClick(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            if (ob.this.d != mediationNativeBannerAdAdapter) {
                return;
            }
            wh.b(this.a.h(), "click", 2);
            NativeBannerAd.NativeBannerAdListener listener = ob.this.k.getListener();
            if (listener != null) {
                listener.onClick(ob.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onCloseAutomatically(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = ob.this.k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return;
            }
            adChoicesOptionListener.onCloseAutomatically(ob.this.k);
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onLoad(NativeBanner nativeBanner, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            if (ob.this.d != mediationNativeBannerAdAdapter) {
                return;
            }
            String b = this.a.b();
            mi.a("MediationNativeBannerAdEngine: Data from " + b + " ad network loaded successfully");
            Context j = ob.this.j();
            if (a() && j != null) {
                cd.b(b, nativeBanner, j);
            }
            ob.this.a(this.a, true);
            ob obVar = ob.this;
            obVar.m = nativeBanner;
            NativeBannerAd.NativeBannerAdListener listener = obVar.k.getListener();
            if (listener != null) {
                listener.onLoad(nativeBanner, ob.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            if (ob.this.d != mediationNativeBannerAdAdapter) {
                return;
            }
            mi.a("MediationNativeBannerAdEngine: No data from " + this.a.b() + " ad network - " + iAdLoadingError);
            ob.this.a(this.a, false);
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public void onShow(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter) {
            if (ob.this.d != mediationNativeBannerAdAdapter) {
                return;
            }
            wh.b(this.a.h(), "show", 1);
            NativeBannerAd.NativeBannerAdListener listener = ob.this.k.getListener();
            if (listener != null) {
                listener.onShow(ob.this.k);
            }
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdAdapter.MediationNativeBannerAdListener
        public boolean shouldCloseAutomatically() {
            NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = ob.this.k.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                return true;
            }
            return adChoicesOptionListener.shouldCloseAutomatically();
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class b extends lb.a implements MediationNativeBannerAdConfig {
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

        @Override // com.my.target.mediation.MediationNativeBannerAdConfig
        public int getAdChoicesPlacement() {
            return this.i;
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdConfig
        public int getCachePolicy() {
            return this.h;
        }

        @Override // com.my.target.mediation.MediationNativeBannerAdConfig
        public MenuFactory getMenuFactory() {
            return this.j;
        }
    }

    private ob(NativeBannerAd nativeBannerAd, jb jbVar, n nVar, tb.a aVar, MenuFactory menuFactory) {
        super(jbVar, nVar, aVar);
        this.k = nativeBannerAd;
        this.l = menuFactory;
    }

    @Override // com.my.target.r5
    public NativeBanner b() {
        return this.m;
    }

    @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
    public void closeIfAutomaticallyDisabled(NativeBannerAd nativeBannerAd) {
        NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = this.k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return;
        }
        adChoicesOptionListener.closeIfAutomaticallyDisabled(this.k);
    }

    @Override // com.my.target.lb
    void h() {
        NativeBannerAd.NativeBannerAdListener listener = this.k.getListener();
        if (listener != null) {
            listener.onNoAd(q.v, this.k);
        }
    }

    @Override // com.my.target.r5
    public void handleAdChoicesClick(Context context) {
        MediationAdapter mediationAdapter = this.d;
        if (mediationAdapter instanceof AdChoicesClickHandler) {
            ((AdChoicesClickHandler) mediationAdapter).handleAdChoicesClick(context);
        }
    }

    @Override // com.my.target.r5
    public void handleClick(boolean z, View view) {
        MediationAdapter mediationAdapter = this.d;
        if (mediationAdapter instanceof ClickHandler) {
            ((ClickHandler) mediationAdapter).handleClick(z, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.my.target.lb
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public MediationNativeBannerAdAdapter i() {
        return new MyTargetNativeBannerAdAdapter();
    }

    @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
    public void onCloseAutomatically(NativeBannerAd nativeBannerAd) {
        NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = this.k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return;
        }
        adChoicesOptionListener.onCloseAutomatically(this.k);
    }

    @Override // com.my.target.r5
    public void registerView(View view, List list, int i) {
        a(view, (NativeBannerAdViewBinder) null, list, i, false);
    }

    @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
    public boolean shouldCloseAutomatically() {
        NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = this.k.getAdChoicesOptionListener();
        if (adChoicesOptionListener == null) {
            return true;
        }
        return adChoicesOptionListener.shouldCloseAutomatically();
    }

    @Override // com.my.target.r5
    public void unregisterView() {
        if (this.d == null) {
            mi.b("MediationNativeBannerAdEngine error: can't unregister view, adapter is not set");
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
        IconAdView iconAdView = weakReference2 != null ? (IconAdView) weakReference2.get() : null;
        if (iconAdView != null) {
            this.n.clear();
            NativeBanner nativeBanner = this.m;
            a(nativeBanner != null ? nativeBanner.getIcon() : null, (fh) iconAdView.getImageView());
        }
        this.o = null;
        this.n = null;
        try {
            ((MediationNativeBannerAdAdapter) this.d).unregisterView();
        } catch (Throwable th) {
            mi.b("MediationNativeBannerAdEngine error: " + th);
        }
    }

    public static ob a(NativeBannerAd nativeBannerAd, jb jbVar, n nVar, tb.a aVar, MenuFactory menuFactory) {
        return new ob(nativeBannerAd, jbVar, nVar, aVar, menuFactory);
    }

    private void b(ImageData imageData, fh fhVar) {
        fhVar.setImageData(imageData);
        if (imageData == null || imageData.getBitmap() != null) {
            return;
        }
        b6.b(imageData, fhVar);
    }

    @Override // com.my.target.r5
    public void registerView(NativeBannerAdViewBinder nativeBannerAdViewBinder, List list, int i) {
        a((View) null, nativeBannerAdViewBinder, list, i, true);
    }

    @Override // com.my.target.r5
    public void a(NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener) {
        mi.a("MediationNativeBannerAdEngine: NativeBannerAdMediaListener is not currently supported for mediation");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(View view, NativeBannerAdViewBinder nativeBannerAdViewBinder, List list, int i, boolean z) {
        ae a2;
        View view2;
        Context f;
        if (z && nativeBannerAdViewBinder == 0) {
            mi.b("MediationNativeBannerAdEngine error: wrong args for using nativeBannerAdViewBinder");
            return;
        }
        if (!z && view == null) {
            mi.b("MediationNativeBannerAdEngine error: wrong args for using viewGroup like adView");
            return;
        }
        if (this.d == null) {
            mi.b("MediationNativeBannerAdEngine error: Can't register view, adapter is not set");
            return;
        }
        if (this.m == null) {
            mi.b("MediationNativeBannerAdEngine error: Can't register view, banner is null or not loaded yet");
            return;
        }
        unregisterView();
        List<View> arrayList = list != null ? new ArrayList<>(list) : Collections.EMPTY_LIST;
        if (!(this.d instanceof MyTargetNativeBannerAdAdapter) && (z || (view instanceof ViewGroup))) {
            if (z) {
                a2 = new ae.a().a(nativeBannerAdViewBinder).a();
            } else {
                a2 = new ae.a().b((ViewGroup) view).a();
            }
            IconAdView k = a2.k();
            if (k != null) {
                this.n = new WeakReference(k);
                try {
                    f = a2.f();
                } catch (Throwable th) {
                    mi.b("MediationNativeBannerAdEngine: Error - " + th);
                }
                if (f != null) {
                    view2 = ((MediationNativeBannerAdAdapter) this.d).getIconView(f);
                    if (view2 != null) {
                        this.o = new WeakReference(view2);
                    }
                    a(k, view2, this.m.getIcon(), arrayList);
                }
                view2 = null;
                if (view2 != null) {
                }
                a(k, view2, this.m.getIcon(), arrayList);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("MediationNativeBannerAdEngine: IconView component not found in ");
                if (z) {
                    view = nativeBannerAdViewBinder;
                }
                sb.append(view);
                sb.append(". It's required");
                mi.b(sb.toString());
                return;
            }
        }
        try {
            if (z) {
                ((MediationNativeBannerAdAdapter) this.d).registerView(nativeBannerAdViewBinder, arrayList, i);
            } else {
                ((MediationNativeBannerAdAdapter) this.d).registerView(view, arrayList, i);
            }
        } catch (Throwable th2) {
            mi.b("MediationNativeBannerAdEngine: Error - " + th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.my.target.lb
    public void a(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter, kb kbVar, Context context) {
        b a2 = b.a(kbVar.e(), kbVar.d(), kbVar.c(), this.a.h().getAge(), this.a.h().getGender(), MyTargetPrivacy.currentPrivacy(), this.a.g(), this.k.getAdChoicesPlacement(), TextUtils.isEmpty(this.h) ? null : this.a.a(this.h), this.l);
        if (mediationNativeBannerAdAdapter instanceof MyTargetNativeBannerAdAdapter) {
            x g = kbVar.g();
            if (g instanceof hd) {
                ((MyTargetNativeBannerAdAdapter) mediationNativeBannerAdAdapter).a((hd) g);
            }
        }
        try {
            mediationNativeBannerAdAdapter.load(a2, new a(kbVar), context);
        } catch (Throwable th) {
            mi.b("MediationNativeBannerAdEngine error: " + th);
        }
    }

    @Override // com.my.target.lb
    boolean a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationNativeBannerAdAdapter;
    }

    private void a(ImageData imageData, fh fhVar) {
        if (imageData != null) {
            b6.a(imageData, fhVar);
        }
        fhVar.setImageData(null);
    }

    private void a(IconAdView iconAdView, View view, ImageData imageData, List list) {
        if (imageData == null) {
            iconAdView.setPlaceHolderDimension(0, 0);
        } else if (imageData.getWidth() > 0 && imageData.getHeight() > 0) {
            iconAdView.setPlaceHolderDimension(imageData.getWidth(), imageData.getHeight());
        } else {
            iconAdView.setPlaceHolderDimension(1, 1);
        }
        if (view != null) {
            mi.a("MediationNativeBannerAdEngine: Got IconView from adapter");
            iconAdView.addView(view);
            int indexOf = list.indexOf(iconAdView);
            if (indexOf >= 0) {
                list.remove(indexOf);
                list.add(view);
                return;
            }
            return;
        }
        b(imageData, (fh) iconAdView.getImageView());
    }
}
