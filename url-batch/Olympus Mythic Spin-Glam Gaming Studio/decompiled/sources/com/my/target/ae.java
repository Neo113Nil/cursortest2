package com.my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.my.target.nativeads.NativeAdViewBinder;
import com.my.target.nativeads.NativeBannerAdViewBinder;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.nativeads.views.PromoCardRecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes12.dex */
public class ae {
    WeakReference b;
    List c;
    WeakReference d;
    WeakReference e;
    WeakReference f;
    WeakReference g;
    WeakReference h;
    WeakReference i;
    WeakReference j;
    WeakReference k;
    WeakReference l;
    WeakReference m;
    WeakReference n;
    WeakReference o;
    WeakReference p;
    final List a = new ArrayList();
    boolean q = false;

    ae() {
    }

    public void a(View view) {
        this.f = new WeakReference(view);
    }

    public View b() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View c() {
        WeakReference weakReference = this.i;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View d() {
        WeakReference weakReference = this.j;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public List e() {
        if (this.c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            arrayList.add((View) ((WeakReference) it.next()).get());
        }
        return arrayList;
    }

    public Context f() {
        ViewGroup o = o();
        if (o != null) {
            return o.getContext();
        }
        return null;
    }

    public View g() {
        WeakReference weakReference = this.h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View h() {
        WeakReference weakReference = this.k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View i() {
        WeakReference weakReference = this.l;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View j() {
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public IconAdView k() {
        WeakReference weakReference = this.e;
        if (weakReference != null) {
            return (IconAdView) weakReference.get();
        }
        return null;
    }

    public MediaAdView l() {
        WeakReference weakReference = this.d;
        if (weakReference != null) {
            return (MediaAdView) weakReference.get();
        }
        return null;
    }

    public List m() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add((View) ((WeakReference) it.next()).get());
        }
        return arrayList;
    }

    public com.my.target.core.ui.views.nativeslider.c n() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (com.my.target.core.ui.views.nativeslider.c) weakReference.get();
        }
        return null;
    }

    public ViewGroup o() {
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            return (ViewGroup) weakReference.get();
        }
        return null;
    }

    public View p() {
        WeakReference weakReference = this.p;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View q() {
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View r() {
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public boolean s() {
        return this.c == null || this.q;
    }

    public void a() {
        List list = this.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((WeakReference) it.next()).clear();
            }
            this.c.clear();
            this.c = null;
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((WeakReference) it2.next()).clear();
        }
        this.a.clear();
        WeakReference weakReference = this.i;
        if (weakReference != null) {
            weakReference.clear();
            this.i = null;
        }
        WeakReference weakReference2 = this.j;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.j = null;
        }
        WeakReference weakReference3 = this.h;
        if (weakReference3 != null) {
            weakReference3.clear();
            this.h = null;
        }
        WeakReference weakReference4 = this.k;
        if (weakReference4 != null) {
            weakReference4.clear();
            this.k = null;
        }
        WeakReference weakReference5 = this.l;
        if (weakReference5 != null) {
            weakReference5.clear();
            this.l = null;
        }
        WeakReference weakReference6 = this.m;
        if (weakReference6 != null) {
            weakReference6.clear();
            this.m = null;
        }
        WeakReference weakReference7 = this.e;
        if (weakReference7 != null) {
            weakReference7.clear();
            this.e = null;
        }
        WeakReference weakReference8 = this.p;
        if (weakReference8 != null) {
            weakReference8.clear();
            this.p = null;
        }
        WeakReference weakReference9 = this.n;
        if (weakReference9 != null) {
            weakReference9.clear();
            this.n = null;
        }
        WeakReference weakReference10 = this.o;
        if (weakReference10 != null) {
            weakReference10.clear();
            this.o = null;
        }
        WeakReference weakReference11 = this.d;
        if (weakReference11 != null) {
            weakReference11.clear();
            this.d = null;
        }
        WeakReference weakReference12 = this.g;
        if (weakReference12 != null) {
            weakReference12.clear();
            this.g = null;
        }
        WeakReference weakReference13 = this.b;
        if (weakReference13 != null) {
            weakReference13.clear();
            this.b = null;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class a {
        private ViewGroup a;
        private NativeAdViewBinder b;
        private NativeBannerAdViewBinder c;
        private MediaAdView d;
        private List e;
        private int f = 0;

        public ae a() {
            NativeBannerAdViewBinder nativeBannerAdViewBinder;
            NativeAdViewBinder nativeAdViewBinder;
            NativeBannerAdViewBinder nativeBannerAdViewBinder2;
            NativeAdViewBinder nativeAdViewBinder2;
            ae aeVar = new ae();
            if (this.e != null) {
                aeVar.c = new ArrayList();
                for (View view : this.e) {
                    if (view != null) {
                        aeVar.c.add(new WeakReference(view));
                        if (view instanceof MediaAdView) {
                            aeVar.q = true;
                        }
                    }
                }
            }
            int i = this.f;
            if (i != 0) {
                ViewGroup rootAdBannerView = i == 1 ? this.a : (i != 2 || (nativeAdViewBinder = this.b) == null) ? (i != 3 || (nativeBannerAdViewBinder = this.c) == null) ? null : nativeBannerAdViewBinder.getRootAdBannerView() : nativeAdViewBinder.getRootAdView();
                if (rootAdBannerView == null) {
                    mi.c("NativeViewsHolderBuilder: can't init root ad view");
                    return aeVar;
                }
                aeVar.b = new WeakReference(rootAdBannerView);
                List a = a(rootAdBannerView);
                int i2 = this.f;
                if (i2 == 1) {
                    a(aeVar, a);
                    return aeVar;
                }
                if (i2 == 2 && (nativeAdViewBinder2 = this.b) != null) {
                    a(aeVar, nativeAdViewBinder2, a);
                    return aeVar;
                }
                if (i2 == 3 && (nativeBannerAdViewBinder2 = this.c) != null) {
                    a(aeVar, nativeBannerAdViewBinder2, a);
                }
            }
            return aeVar;
        }

        public a b(ViewGroup viewGroup) {
            this.f = 1;
            this.a = viewGroup;
            return this;
        }

        private void a(ae aeVar, NativeBannerAdViewBinder nativeBannerAdViewBinder, List list) {
            View advertisingView = nativeBannerAdViewBinder.getAdvertisingView();
            if (advertisingView != null) {
                aeVar.i = new WeakReference(advertisingView);
                list.remove(advertisingView);
            }
            View ageRestrictionView = nativeBannerAdViewBinder.getAgeRestrictionView();
            if (ageRestrictionView != null) {
                aeVar.j = new WeakReference(ageRestrictionView);
                list.remove(ageRestrictionView);
            }
            View ctaView = nativeBannerAdViewBinder.getCtaView();
            if (ctaView != null) {
                aeVar.h = new WeakReference(ctaView);
                list.remove(ctaView);
            }
            View disclaimerView = nativeBannerAdViewBinder.getDisclaimerView();
            if (disclaimerView != null) {
                aeVar.l = new WeakReference(disclaimerView);
                list.remove(disclaimerView);
            }
            View starsRatingView = nativeBannerAdViewBinder.getStarsRatingView();
            if (starsRatingView != null) {
                aeVar.p = new WeakReference(starsRatingView);
                list.remove(starsRatingView);
            }
            View titleView = nativeBannerAdViewBinder.getTitleView();
            if (titleView != null) {
                aeVar.n = new WeakReference(titleView);
                list.remove(titleView);
            }
            View domainView = nativeBannerAdViewBinder.getDomainView();
            if (domainView != null) {
                aeVar.m = new WeakReference(domainView);
                list.remove(domainView);
            }
            View votesView = nativeBannerAdViewBinder.getVotesView();
            if (votesView != null) {
                aeVar.o = new WeakReference(votesView);
                list.remove(votesView);
            }
            View adChoicesView = nativeBannerAdViewBinder.getAdChoicesView();
            if (adChoicesView != null) {
                aeVar.f = new WeakReference(adChoicesView);
                list.remove(adChoicesView);
            }
            IconAdView iconView = nativeBannerAdViewBinder.getIconView();
            aeVar.e = new WeakReference(iconView);
            list.remove(iconView);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aeVar.a.add(new WeakReference((View) it.next()));
            }
        }

        private void a(ae aeVar, NativeAdViewBinder nativeAdViewBinder, List list) {
            View advertisingView = nativeAdViewBinder.getAdvertisingView();
            if (advertisingView != null) {
                aeVar.i = new WeakReference(advertisingView);
                list.remove(advertisingView);
            }
            View ageRestrictionView = nativeAdViewBinder.getAgeRestrictionView();
            if (ageRestrictionView != null) {
                aeVar.j = new WeakReference(ageRestrictionView);
                list.remove(ageRestrictionView);
            }
            View ctaView = nativeAdViewBinder.getCtaView();
            if (ctaView != null) {
                aeVar.h = new WeakReference(ctaView);
                list.remove(ctaView);
            }
            View descriptionView = nativeAdViewBinder.getDescriptionView();
            if (descriptionView != null) {
                aeVar.k = new WeakReference(descriptionView);
                list.remove(descriptionView);
            }
            View disclaimerView = nativeAdViewBinder.getDisclaimerView();
            if (disclaimerView != null) {
                aeVar.l = new WeakReference(disclaimerView);
                list.remove(disclaimerView);
            }
            View domainOrCategoryView = nativeAdViewBinder.getDomainOrCategoryView();
            if (domainOrCategoryView != null) {
                aeVar.m = new WeakReference(domainOrCategoryView);
                list.remove(domainOrCategoryView);
            }
            PromoCardRecyclerView promoCardRecyclerView = nativeAdViewBinder.getPromoCardRecyclerView();
            if (promoCardRecyclerView != null) {
                aeVar.g = new WeakReference(promoCardRecyclerView);
                list.remove(promoCardRecyclerView);
            }
            View starsRatingView = nativeAdViewBinder.getStarsRatingView();
            if (starsRatingView != null) {
                aeVar.p = new WeakReference(starsRatingView);
                list.remove(starsRatingView);
            }
            View titleView = nativeAdViewBinder.getTitleView();
            if (titleView != null) {
                aeVar.n = new WeakReference(titleView);
                list.remove(titleView);
            }
            View votesView = nativeAdViewBinder.getVotesView();
            if (votesView != null) {
                aeVar.o = new WeakReference(votesView);
                list.remove(votesView);
            }
            View adChoicesView = nativeAdViewBinder.getAdChoicesView();
            if (adChoicesView != null) {
                aeVar.f = new WeakReference(adChoicesView);
                list.remove(adChoicesView);
            }
            MediaAdView mediaAdView = nativeAdViewBinder.getMediaAdView();
            if (mediaAdView != null) {
                aeVar.d = new WeakReference(mediaAdView);
                list.remove(mediaAdView);
            }
            IconAdView iconView = nativeAdViewBinder.getIconView();
            aeVar.e = new WeakReference(iconView);
            list.remove(iconView);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aeVar.a.add(new WeakReference((View) it.next()));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void a(ae aeVar, List list) {
            if (this.d != null) {
                aeVar.d = new WeakReference(this.d);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view instanceof IconAdView) {
                    aeVar.e = new WeakReference((IconAdView) view);
                } else if (view instanceof m) {
                    aeVar.f = new WeakReference(view);
                } else if (view instanceof PromoCardRecyclerView) {
                    aeVar.g = new WeakReference((com.my.target.core.ui.views.nativeslider.c) view);
                } else if (view instanceof MediaAdView) {
                    if (aeVar.d == null) {
                        aeVar.d = new WeakReference((MediaAdView) view);
                    }
                } else if (R.id.nativeads_advertising == view.getId()) {
                    aeVar.i = new WeakReference(view);
                } else if (R.id.nativeads_title == view.getId()) {
                    aeVar.n = new WeakReference(view);
                } else if (R.id.nativeads_description == view.getId()) {
                    aeVar.k = new WeakReference(view);
                } else if (R.id.nativeads_rating == view.getId()) {
                    aeVar.p = new WeakReference(view);
                } else if (R.id.nativeads_domain == view.getId()) {
                    aeVar.m = new WeakReference(view);
                } else if (R.id.nativeads_age_restrictions == view.getId()) {
                    aeVar.j = new WeakReference(view);
                } else if (R.id.nativeads_disclaimer == view.getId()) {
                    aeVar.l = new WeakReference(view);
                } else if (R.id.nativeads_call_to_action == view.getId()) {
                    aeVar.h = new WeakReference((Button) view);
                } else if (R.id.nativeads_votes == view.getId()) {
                    aeVar.o = new WeakReference(view);
                } else {
                    aeVar.a.add(new WeakReference(view));
                }
            }
        }

        public a a(List list) {
            this.e = list;
            return this;
        }

        public a a(NativeAdViewBinder nativeAdViewBinder) {
            this.f = 2;
            this.b = nativeAdViewBinder;
            return this;
        }

        public a a(NativeBannerAdViewBinder nativeBannerAdViewBinder) {
            this.f = 3;
            this.c = nativeBannerAdViewBinder;
            return this;
        }

        public a a(MediaAdView mediaAdView) {
            this.d = mediaAdView;
            return this;
        }

        private List a(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof IconAdView) {
                    arrayList.add(childAt);
                } else if (childAt instanceof PromoCardRecyclerView) {
                    arrayList.add(childAt);
                } else if (childAt instanceof MediaAdView) {
                    arrayList.add(childAt);
                } else if (childAt instanceof ViewGroup) {
                    arrayList.addAll(a((ViewGroup) childAt));
                } else {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }
    }
}
