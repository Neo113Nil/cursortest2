package com.my.target.nativeads;

import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.b6;
import com.my.target.ce;
import com.my.target.common.BaseAd;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.l2;
import com.my.target.md;
import com.my.target.mi;
import com.my.target.nativeads.banners.NativeAppwallBanner;
import com.my.target.nativeads.views.AppwallAdView;
import com.my.target.od;
import com.my.target.p;
import com.my.target.pd;
import com.my.target.q;
import com.my.target.s;
import com.my.target.sd;
import com.my.target.uh;
import com.my.target.wh;
import com.my.target.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes12.dex */
public final class NativeAppwallAd extends BaseAd {
    private final Context f;
    private final l2 g;
    private final HashMap h;
    private final ArrayList i;
    private AppwallAdListener j;
    private sd k;
    private od l;
    private WeakReference m;
    private String n;
    private int o;
    private int p;
    private int q;
    private boolean r;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface AppwallAdListener {
        void onClick(@NonNull NativeAppwallBanner nativeAppwallBanner, @NonNull NativeAppwallAd nativeAppwallAd);

        void onDismiss(@NonNull NativeAppwallAd nativeAppwallAd);

        void onDisplay(@NonNull NativeAppwallAd nativeAppwallAd);

        void onLoad(@NonNull NativeAppwallAd nativeAppwallAd);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull NativeAppwallAd nativeAppwallAd);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements AppwallAdView.AppwallAdViewListener {
        a() {
        }

        @Override // com.my.target.nativeads.views.AppwallAdView.AppwallAdViewListener
        public void onBannerClick(NativeAppwallBanner nativeAppwallBanner) {
            AppwallAdView appwallAdView;
            NativeAppwallAd.this.handleBannerClick(nativeAppwallBanner);
            WeakReference weakReference = NativeAppwallAd.this.m;
            if (weakReference == null || (appwallAdView = (AppwallAdView) weakReference.get()) == null) {
                return;
            }
            appwallAdView.notifyDataSetChanged();
        }

        @Override // com.my.target.nativeads.views.AppwallAdView.AppwallAdViewListener
        public void onBannersShow(List list) {
            NativeAppwallAd.this.handleBannersShow(list);
        }
    }

    public NativeAppwallAd(int i, @NonNull Context context) {
        super(i, "appwall", context);
        this.g = l2.a(getCustomParams());
        this.h = new HashMap();
        this.i = new ArrayList();
        this.n = "Apps";
        this.o = -12232093;
        this.p = -13220531;
        this.q = -1;
        this.r = false;
        this.f = context;
        this.a.b(0);
        mi.c("Native appwall ad created. Version - " + MyTargetVersion.VERSION);
    }

    public static void loadImageToView(@NonNull ImageData imageData, @NonNull ImageView imageView) {
        b6.b(imageData, imageView);
    }

    void a(sd sdVar, s sVar) {
        if (this.j == null) {
            return;
        }
        if (sdVar == null) {
            q a2 = sVar.a();
            AppwallAdListener appwallAdListener = this.j;
            if (a2 == null) {
                a2 = q.i;
            }
            appwallAdListener.onNoAd(a2, this);
            return;
        }
        this.k = sdVar;
        for (md mdVar : sdVar.c()) {
            NativeAppwallBanner a3 = NativeAppwallBanner.a(mdVar);
            this.i.add(a3);
            this.h.put(a3, mdVar);
        }
        this.j.onLoad(this);
    }

    public void destroy() {
        unregisterAppwallAdView();
        od odVar = this.l;
        if (odVar != null) {
            odVar.a();
            this.l = null;
        }
        this.j = null;
    }

    public void dismiss() {
        od odVar = this.l;
        if (odVar != null) {
            odVar.b();
        }
    }

    @NonNull
    public ArrayList<NativeAppwallBanner> getBanners() {
        return this.i;
    }

    public long getCachePeriod() {
        return this.a.f();
    }

    @Nullable
    public AppwallAdListener getListener() {
        return this.j;
    }

    @NonNull
    public String getTitle() {
        return this.n;
    }

    public int getTitleBackgroundColor() {
        return this.o;
    }

    public int getTitleSupplementaryColor() {
        return this.p;
    }

    public int getTitleTextColor() {
        return this.q;
    }

    public void handleBannerClick(@NonNull NativeAppwallBanner nativeAppwallBanner) {
        md mdVar = (md) this.h.get(nativeAppwallBanner);
        if (mdVar == null) {
            mi.a("NativeAppwallAd: Unable to handle banner click - no internal banner for id " + nativeAppwallBanner.getId());
            return;
        }
        this.g.a(mdVar, 1, getWebFormClient(), this.f);
        if (this.k != null) {
            nativeAppwallBanner.setHasNotification(false);
            ce.a(this.k, this.a).a(mdVar, false);
        }
        AppwallAdListener appwallAdListener = this.j;
        if (appwallAdListener != null) {
            appwallAdListener.onClick(nativeAppwallBanner, this);
        }
    }

    public void handleBannerShow(@NonNull NativeAppwallBanner nativeAppwallBanner) {
        md mdVar = (md) this.h.get(nativeAppwallBanner);
        if (mdVar != null) {
            wh.b(mdVar.H(), "playbackStarted", 1);
            return;
        }
        mi.a("NativeAppwallAd: Unable to handle banner show - no internal banner for id " + nativeAppwallBanner.getId());
    }

    public void handleBannersShow(@NonNull List<NativeAppwallBanner> list) {
        ArrayList arrayList = new ArrayList();
        for (NativeAppwallBanner nativeAppwallBanner : list) {
            md mdVar = (md) this.h.get(nativeAppwallBanner);
            if (mdVar != null) {
                mi.a("NativeAppwallAd: Ad shown, banner Id = " + nativeAppwallBanner.getId());
                uh b = mdVar.H().b("playbackStarted");
                if (!b.c.isEmpty()) {
                    arrayList.add(b);
                }
            } else {
                mi.a("NativeAppwallAd: Unable to handle banner show - no internal banner for id " + nativeAppwallBanner.getId());
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wh.a((uh) obj, 1);
        }
    }

    public boolean hasNotifications() {
        Iterator it = this.h.keySet().iterator();
        while (it.hasNext()) {
            if (((NativeAppwallBanner) it.next()).isHasNotification()) {
                return true;
            }
        }
        return false;
    }

    public boolean isAutoLoadImages() {
        int g = this.a.g();
        return g == 0 || g == 1;
    }

    public boolean isHideStatusBarInDialog() {
        return this.r;
    }

    public void load() {
        if (isLoadCalled()) {
            mi.a("NativeAppwallAd: Appwall ad doesn't support multiple load");
            a(null, s.a(q.t));
        } else {
            pd.a(this.a, this.b).a(new p.b() { // from class: com.my.target.nativeads.NativeAppwallAd$$ExternalSyntheticLambda0
                @Override // com.my.target.p.b
                public final void a(x xVar, s sVar) {
                    NativeAppwallAd.this.a((sd) xVar, sVar);
                }
            }).a(this.b.a(), this.f);
        }
    }

    @Nullable
    public String prepareBannerClickLink(@NonNull NativeAppwallBanner nativeAppwallBanner) {
        md mdVar = (md) this.h.get(nativeAppwallBanner);
        if (mdVar != null) {
            wh.b(mdVar.H(), "click", 2);
            sd sdVar = this.k;
            if (sdVar != null) {
                ce.a(sdVar, this.a).a(mdVar, false);
            }
            return mdVar.L();
        }
        mi.a("NativeAppwallAd: Unable to handle banner click - no internal banner for id " + nativeAppwallBanner.getId());
        return null;
    }

    public void registerAppwallAdView(@NonNull AppwallAdView appwallAdView) {
        unregisterAppwallAdView();
        this.m = new WeakReference(appwallAdView);
        appwallAdView.setAppwallAdViewListener(new a());
    }

    public void setAutoLoadImages(boolean z) {
        this.a.b(0);
    }

    public void setCachePeriod(long j) {
        this.a.a(j);
    }

    public void setHideStatusBarInDialog(boolean z) {
        this.r = z;
    }

    public void setListener(@Nullable AppwallAdListener appwallAdListener) {
        this.j = appwallAdListener;
    }

    public void setTitle(@NonNull String str) {
        this.n = str;
    }

    public void setTitleBackgroundColor(int i) {
        this.o = i;
    }

    public void setTitleSupplementaryColor(int i) {
        this.p = i;
    }

    public void setTitleTextColor(int i) {
        this.q = i;
    }

    public void show() {
        if (this.k == null || this.i.size() <= 0) {
            mi.c("Native appwall ad show - no ad");
            return;
        }
        if (this.l == null) {
            this.l = od.a(this);
        }
        this.l.a(this.f);
    }

    public void unregisterAppwallAdView() {
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            AppwallAdView appwallAdView = (AppwallAdView) weakReference.get();
            if (appwallAdView != null) {
                appwallAdView.setAppwallAdViewListener(null);
            }
            this.m.clear();
            this.m = null;
        }
    }
}
