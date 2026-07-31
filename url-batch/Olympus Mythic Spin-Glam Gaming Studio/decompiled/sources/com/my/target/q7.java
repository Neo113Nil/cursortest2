package com.my.target;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.common.CustomParams;
import com.my.target.internal.api.internalnativead.ExternalNavigationRouter;
import com.my.target.internal.api.internalnativead.InternalNativeAdController;
import com.my.target.internal.api.internalnativead.InternalNativeAdMultiPartController;
import com.my.target.internal.api.internalnativead.InternalNativeAdSinglePartController;
import com.my.target.internal.api.internalnativead.binders.InternalCardViewProvider;
import com.my.target.internal.api.internalnativead.binders.InternalHtmlViewBinder;
import com.my.target.internal.api.internalnativead.binders.InternalNativeAdBinder;
import com.my.target.internal.api.internalnativead.binders.InternalNativeAdVideoPlayerProvider;
import com.my.target.internal.api.internalnativead.medialoader.Cancellable;
import com.my.target.internal.api.internalnativead.medialoader.InternalNativeMediaLoader;
import com.my.target.internal.api.internalnativead.medialoader.MediaLoaderListener;
import com.my.target.internal.api.internalnativead.models.InternalImageData;
import com.my.target.internal.api.internalnativead.models.InternalNativeAdCard;
import com.my.target.internal.api.internalnativead.models.InternalNativeBanner;
import com.my.target.internal.api.internalnativead.models.adchoices.InternalNativeAdMenuAction;
import com.my.target.internal.api.internalnativead.webform.InternalWebFormClient;
import com.my.target.j7;
import com.my.target.l2;
import com.my.target.m2;
import com.my.target.pj;
import com.my.target.q7;
import com.my.target.wh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class q7 implements InternalNativeAdController, InternalNativeAdSinglePartController, InternalNativeAdMultiPartController {
    private final zf a = zf.a(30);
    private final InternalNativeBanner b;
    private final j7 c;
    private final InternalNativeMediaLoader d;
    private final n7 e;
    private final Map f;
    private final c g;
    private final wj h;
    private final ld i;
    private final b j;
    private final oe k;
    private final tj l;
    private final w1 m;
    private final InternalNativeAdController.Listener n;
    private final pj o;
    private ExternalNavigationRouter p;
    private InternalWebFormClient q;
    private InternalNativeAdVideoPlayerProvider r;
    private WeakReference s;
    private WeakReference t;
    private WeakReference u;
    private boolean v;
    private boolean w;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q7 q7Var = q7.this;
            InternalNativeAdVideoPlayerProvider internalNativeAdVideoPlayerProvider = q7Var.r;
            if (internalNativeAdVideoPlayerProvider == null) {
                return;
            }
            oe oeVar = q7Var.k;
            if (oeVar != null) {
                oeVar.a(internalNativeAdVideoPlayerProvider.getProgress(), internalNativeAdVideoPlayerProvider.getDuration());
            }
            tj tjVar = q7.this.l;
            if (tjVar != null) {
                tjVar.a(internalNativeAdVideoPlayerProvider.getTrackingAdVideoView());
                tjVar.a(internalNativeAdVideoPlayerProvider.getProgress(), internalNativeAdVideoPlayerProvider.getDuration());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static class c {
        private final InternalNativeBanner a;
        private final Map b;
        private final zf c = zf.e;
        private final Runnable d = new Runnable() { // from class: com.my.target.q7$c$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                q7.c.this.e();
            }
        };
        private boolean e = false;
        private final HashMap f = new HashMap();

        c(Map map, InternalNativeBanner internalNativeBanner) {
            this.b = map;
            this.a = internalNativeBanner;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            if (!this.e) {
                this.c.b(this.d);
                return;
            }
            int i = 0;
            for (WeakReference weakReference : this.b.keySet()) {
                if (weakReference != null && weakReference.get() != null) {
                    View view = (View) weakReference.get();
                    Rect rect = new Rect();
                    boolean b = wj.b(view);
                    view.getGlobalVisibleRect(rect);
                    i += b ? 0 : rect.height() * rect.width();
                }
            }
            this.f.put(Integer.valueOf(i), Long.valueOf(SystemClock.uptimeMillis()));
            mi.b("ViewSizeTracker", "View Sizes Tick " + this.a.getId());
            if (v4.a(i, 0.0f) != 1) {
                d();
            }
        }

        boolean a() {
            return this.e;
        }

        HashMap b() {
            return this.f;
        }

        void c() {
            if (this.e) {
                return;
            }
            mi.b("ViewSizeTracker", "Start tracking of view sizes " + this.a.getId());
            this.e = true;
            this.f.clear();
            this.c.a(this.d);
        }

        void d() {
            if (this.e) {
                this.e = false;
                this.f.clear();
                this.c.b(this.d);
                mi.b("ViewSizeTracker", "Stop tracking of view sizes " + this.a.getId());
            }
        }
    }

    private q7(InternalNativeBanner internalNativeBanner, InternalNativeMediaLoader internalNativeMediaLoader, InternalNativeAdController.Listener listener) {
        wh.c cVar;
        HashMap hashMap = new HashMap();
        this.f = hashMap;
        this.s = new WeakReference(null);
        this.t = new WeakReference(null);
        this.u = new WeakReference(null);
        this.v = false;
        this.w = false;
        this.b = internalNativeBanner;
        j7 a2 = ((v7) internalNativeBanner).a();
        this.c = a2;
        this.g = new c(hashMap, internalNativeBanner);
        this.d = internalNativeMediaLoader;
        this.n = listener;
        if (a2.X() != null) {
            final w1 b2 = w1.b();
            this.m = b2;
            Objects.requireNonNull(b2);
            cVar = new wh.c() { // from class: com.my.target.q7$$ExternalSyntheticLambda4
                @Override // com.my.target.wh.c
                public final void a() {
                    w1.this.a();
                }
            };
        } else {
            this.m = null;
            cVar = null;
        }
        CustomParams h = a2.Y().h();
        this.e = n7.a(h, this.p, this.q, new m2(h), "IntrNativeAdCtrlImpl");
        wj a3 = wj.a(a2.P(), a2.H(), true, cVar, a2.i0());
        this.h = a3;
        th H = a2.H();
        this.i = ld.a(H.a(1), H.a(2), a2.f(), a2.i0());
        this.j = new b();
        a3.a(new a(listener));
        j7.c Z = a2.Z();
        this.o = Z != null ? pj.a(Z.P(), Z.H(), (wh.c) null) : null;
        j7.d b0 = a2.b0();
        if (b0 != null) {
            this.k = oe.a(b0.H(), b0.t());
            this.l = tj.a(b0.H(), new wh.c() { // from class: com.my.target.q7$$ExternalSyntheticLambda5
                @Override // com.my.target.wh.c
                public final void a() {
                    q7.this.a();
                }
            });
        } else {
            this.k = null;
            this.l = null;
        }
    }

    public static q7 a(InternalNativeBanner internalNativeBanner, InternalNativeMediaLoader internalNativeMediaLoader, InternalNativeAdController.Listener listener) {
        return new q7(internalNativeBanner, internalNativeMediaLoader, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.v) {
            return;
        }
        HashMap hashMap = new HashMap(this.g.b());
        this.g.d();
        this.v = true;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f.keySet().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = (ViewGroup) ((WeakReference) it.next()).get();
            if (viewGroup != null) {
                arrayList.add(viewGroup);
            }
        }
        mi.b("IntrNativeAdCtrlImpl", "Start tracking");
        this.h.a(arrayList, hashMap, this.c);
        if (this.o != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.u.get();
            if (viewGroup2 != null) {
                this.o.b(viewGroup2);
            } else {
                mi.c("IntrNativeAdCtrlImpl", "html-view is not found in InternalNativeAdBinder.getInternalHtmlViewBinder()");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.v) {
            mi.b("IntrNativeAdCtrlImpl", "Stop tracking");
            this.v = false;
            this.h.c();
            if (!this.f.isEmpty()) {
                this.g.c();
            }
            pj pjVar = this.o;
            if (pjVar != null) {
                pjVar.e();
            }
            w1 w1Var = this.m;
            if (w1Var != null) {
                w1Var.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void f(View view) {
        InternalNativeAdController.Listener listener = this.n;
        if (listener != null) {
            listener.onClickTracked(this.b, view);
        }
    }

    public void b() {
        Iterator it = new HashSet(this.f.keySet()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = (ViewGroup) ((WeakReference) it.next()).get();
            if (viewGroup != null) {
                c(viewGroup);
            }
        }
    }

    public void completeSurvey(List list, InternalNativeAdController.OnSurveySentListener onSurveySentListener) {
        b8 h0 = this.c.h0();
        if (h0 == null) {
            mi.c("IntrNativeAdCtrlImpl", "Survey object is null");
        } else {
            u7.b(h0.b(), list, h0.a(), onSurveySentListener);
        }
    }

    public InternalNativeBanner getBanner() {
        return this.b;
    }

    public void handleAdChoiceClick(InternalNativeAdMenuAction internalNativeAdMenuAction) {
        if (internalNativeAdMenuAction instanceof s7) {
            Iterator it = this.f.keySet().iterator();
            Context context = null;
            while (it.hasNext()) {
                ViewGroup viewGroup = (ViewGroup) ((WeakReference) it.next()).get();
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
            }
            if (context == null) {
                return;
            }
            s7 s7Var = (s7) internalNativeAdMenuAction;
            String c2 = s7Var.c();
            if (!TextUtils.isEmpty(c2)) {
                wh.a(c2);
            }
            if ("copy".equals(s7Var.getType())) {
                String b2 = s7Var.b();
                if (b2 != null) {
                    ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copied id", b2));
                    return;
                }
                return;
            }
            String a2 = s7Var.a();
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            a7.a(a2, context);
        }
    }

    public void handleCardClick(View view, InternalNativeAdCard internalNativeAdCard, String str) {
        mi.b("IntrNativeAdCtrlImpl", "Click on card received");
        if (internalNativeAdCard instanceof l7) {
            a(((l7) internalNativeAdCard).a(), view, str);
        } else {
            mi.b("IntrNativeAdCtrlImpl", "Click on card failed, unknown instance of cardData");
        }
    }

    public void handleClick(View view, String str) {
        mi.b("IntrNativeAdCtrlImpl", "Handling a click target: " + str);
        a(this.c, view, str);
    }

    public void handleHtmlClick(String str, final View view) {
        mi.b("IntrNativeAdCtrlImpl", "Click on html received");
        j7.c Z = this.c.Z();
        if (Z == null) {
            mi.b("IntrNativeAdCtrlImpl", "Click on html failed, adHtml is null");
            return;
        }
        if (str != null) {
            this.e.a(str, this.c, view.getContext(), new l2.c() { // from class: com.my.target.q7$$ExternalSyntheticLambda1
                @Override // com.my.target.l2.c
                public final void c() {
                    q7.this.f(view);
                }
            });
        }
        wh.b(Z.H(), "click", 2);
    }

    public Cancellable load(InternalNativeBanner internalNativeBanner, InternalImageData internalImageData, MediaLoaderListener mediaLoaderListener) {
        return this.d.load(internalNativeBanner, internalImageData, mediaLoaderListener);
    }

    public void notifyCustomStat(String str) {
        mi.b("IntrNativeAdCtrlImpl", "Handling a custom stat: " + str);
        wh.a(this.c.H().b(str), 999);
    }

    public void notifySurveyClick(View view) {
        if (this.w) {
            return;
        }
        wh.b(this.c.H(), "click", 2);
        f(view);
        this.w = true;
    }

    public void onAdVideoFullscreenChanged(boolean z) {
        oe oeVar = this.k;
        if (oeVar != null) {
            oeVar.a(z);
        }
    }

    public void onAdVideoPlaybackCompleted() {
        oe oeVar = this.k;
        if (oeVar != null) {
            oeVar.f();
        }
    }

    public void onAdVideoPlaybackError(int i) {
        oe oeVar = this.k;
        if (oeVar == null) {
            return;
        }
        if (i == 1) {
            oeVar.k();
        } else {
            oeVar.j();
        }
    }

    public void onAdVideoPlaybackPaused() {
        oe oeVar = this.k;
        if (oeVar != null) {
            oeVar.i();
        }
    }

    public void onAdVideoPlaybackResumed() {
        oe oeVar = this.k;
        if (oeVar != null) {
            oeVar.l();
        }
    }

    public void onAdVideoPlaybackStarted() {
    }

    public void onAdVideoVolumeChanged(boolean z) {
        oe oeVar = this.k;
        if (oeVar != null) {
            oeVar.b(z);
        }
    }

    public void register(InternalNativeAdBinder internalNativeAdBinder) {
        a(null, internalNativeAdBinder, true, true);
    }

    public void registerCard(InternalCardViewProvider internalCardViewProvider, InternalNativeAdCard internalNativeAdCard) {
        if (this.m != null && (internalNativeAdCard instanceof l7)) {
            this.m.a(internalCardViewProvider.getCardView(), ((l7) internalNativeAdCard).a());
        }
    }

    public void registerViewHolder(RecyclerView recyclerView, InternalNativeAdBinder internalNativeAdBinder, boolean z, boolean z2) {
        a(recyclerView, internalNativeAdBinder, z, z2);
    }

    public void setExternalNavigationRouter(ExternalNavigationRouter externalNavigationRouter) {
        this.p = externalNavigationRouter;
        this.e.a(externalNavigationRouter);
    }

    public void setWebFormClient(InternalWebFormClient internalWebFormClient) {
        this.q = internalWebFormClient;
        this.e.a(internalWebFormClient);
    }

    public void startTrackingAdVideo(InternalNativeAdVideoPlayerProvider internalNativeAdVideoPlayerProvider) {
        if (this.k != null && internalNativeAdVideoPlayerProvider.getTrackingAdVideoView() != null) {
            this.k.a(internalNativeAdVideoPlayerProvider.getTrackingAdVideoView().getContext());
        }
        this.r = internalNativeAdVideoPlayerProvider;
        this.a.a(this.j);
    }

    public void stopTrackingAdVideo() {
        this.a.b(this.j);
    }

    public void unregister(InternalNativeAdBinder internalNativeAdBinder) {
        mi.b("IntrNativeAdCtrlImpl", "Unregister ViewHolder");
        c(internalNativeAdBinder.getRootView());
        if (this.f.isEmpty()) {
            this.g.d();
        }
    }

    public void unregisterCard(InternalNativeAdCard internalNativeAdCard) {
        if (this.m != null && (internalNativeAdCard instanceof l7)) {
            this.m.a(((l7) internalNativeAdCard).a());
        }
    }

    private void a(View view, InternalNativeAdBinder internalNativeAdBinder, boolean z, boolean z2) {
        ViewGroup rootView = internalNativeAdBinder.getRootView();
        if (this.f.containsKey(a(rootView))) {
            mi.b("IntrNativeAdCtrlImpl", "Second register for view in use");
            return;
        }
        InternalHtmlViewBinder internalHtmlViewBinder = internalNativeAdBinder.getInternalHtmlViewBinder();
        this.u = new WeakReference(internalHtmlViewBinder == null ? null : internalHtmlViewBinder.getHtmlView());
        WeakReference weakReference = new WeakReference(rootView);
        this.f.put(weakReference, internalNativeAdBinder);
        if (this.s.get() == null && z) {
            this.s = weakReference;
        }
        if (this.t.get() == null && z2) {
            this.t = weakReference;
        }
        if (this.v) {
            this.h.a(rootView);
            mi.b("IntrNativeAdCtrlImpl", "Register ViewHolder: Added to the views");
        } else if (this.s.get() == null || this.t.get() == null) {
            int i = 0;
            for (WeakReference weakReference2 : this.f.keySet()) {
                i += (weakReference2 == null || weakReference2.get() == null) ? 0 : ((ViewGroup) weakReference2.get()).getHeight();
            }
            int height = view != null ? view.getHeight() : 0;
            if (height <= 0 || i < height * 0.95d) {
                mi.b("IntrNativeAdCtrlImpl", "ViewHolder is registered but nothing happen");
                if (!this.g.a()) {
                    this.g.c();
                }
            } else {
                a((View) rootView);
                mi.b("IntrNativeAdCtrlImpl", "Register ViewHolder is big enough: Started tracking");
            }
        } else {
            a((View) rootView);
            mi.b("IntrNativeAdCtrlImpl", "Register ViewHolder is fully bound: Started tracking");
        }
        this.i.a(rootView, (View) null);
    }

    public void handleClick(View view, int i) {
        mi.b("IntrNativeAdCtrlImpl", "Handling a click target: " + i);
        a(this.c, view, i);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a extends pj.a {
        final /* synthetic */ InternalNativeAdController.Listener a;

        a(InternalNativeAdController.Listener listener) {
            this.a = listener;
        }

        @Override // com.my.target.pj.a
        public void a(boolean z) {
            super.a(z);
            if (z) {
                return;
            }
            mi.b("IntrNativeAdCtrlImpl", "Banner is not visible");
            q7.this.d();
        }

        @Override // com.my.target.pj.a
        public void b() {
            InternalNativeAdController.Listener listener = this.a;
            if (listener != null) {
                listener.onBannerShow(q7.this.b);
            }
        }

        @Override // com.my.target.pj.a
        public void a() {
            super.a();
            q7.this.a();
        }
    }

    public boolean b(ViewGroup viewGroup) {
        return a(viewGroup) != null;
    }

    public void handleCardClick(View view, InternalNativeAdCard internalNativeAdCard, int i) {
        mi.b("IntrNativeAdCtrlImpl", "Click on card received");
        if (internalNativeAdCard instanceof l7) {
            a(((l7) internalNativeAdCard).a(), view, i);
        } else {
            mi.b("IntrNativeAdCtrlImpl", "Click on card failed, unknown instance of cardData");
        }
    }

    private void c(ViewGroup viewGroup) {
        WeakReference a2 = a(viewGroup);
        if (a2 != null) {
            mi.b("IntrNativeAdCtrlImpl", "Release ViewHolder");
            this.f.remove(a2);
            WeakReference weakReference = this.s;
            if (weakReference == a2) {
                weakReference.clear();
            }
            WeakReference weakReference2 = this.t;
            if (weakReference2 == a2) {
                weakReference2.clear();
            }
            this.h.c(viewGroup);
        }
        this.i.e();
    }

    public void handleAdChoiceClick(InternalNativeAdMenuAction internalNativeAdMenuAction, Context context) {
        if (internalNativeAdMenuAction instanceof s7) {
            s7 s7Var = (s7) internalNativeAdMenuAction;
            String c2 = s7Var.c();
            if (!TextUtils.isEmpty(c2)) {
                wh.a(c2);
            }
            if ("copy".equals(s7Var.getType())) {
                String b2 = s7Var.b();
                if (b2 != null) {
                    ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copied id", b2));
                    return;
                }
                return;
            }
            String a2 = s7Var.a();
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            a7.a(a2, context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        InternalNativeAdController.Listener listener = this.n;
        if (listener != null) {
            listener.onImpressionTracked(this.b);
        }
    }

    private void a(View view) {
        view.postDelayed(new Runnable() { // from class: com.my.target.q7$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                q7.this.c();
            }
        }, 50L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void a(com.my.target.b bVar, final View view, String str) {
        int i;
        o2 a2;
        o2 a3;
        String str2;
        str.getClass();
        switch (str) {
            case "DEFAULT":
            case "RATING":
            case "BACKGROUND":
            case "AGE_RESTRICTIONS":
            case "ICON":
            case "IMAGE":
            case "TITLE":
            case "VIDEO":
            case "VOTES":
            case "APP_CATEGORY":
            case "DESCRIPTION":
            case "ADVERTISING_LABEL":
            case "DOMAIN":
                i = 1;
                break;
            case "CTA":
                i = 2;
                break;
            default:
                mi.b("IntrNativeAdCtrlImpl", "Unknown click target: " + str);
                return;
        }
        Context context = view.getContext();
        switch (str) {
            case "RATING":
                a2 = a(4);
                a3 = a2;
                break;
            case "BACKGROUND":
                a2 = a(11);
                a3 = a2;
                break;
            case "AGE_RESTRICTIONS":
                a2 = a(7);
                a3 = a2;
                break;
            case "CTA":
                a2 = a(6);
                a3 = a2;
                break;
            case "ICON":
                a3 = a(2);
                break;
            case "IMAGE":
                a2 = a(3);
                a3 = a2;
                break;
            case "TITLE":
                a2 = a(0);
                a3 = a2;
                break;
            case "VIDEO":
                a2 = a(13);
                a3 = a2;
                break;
            case "VOTES":
                a2 = a(5);
                a3 = a2;
                break;
            case "APP_CATEGORY":
                a2 = a(10);
                a3 = a2;
                break;
            case "DESCRIPTION":
                a2 = a(1);
                a3 = a2;
                break;
            case "ADVERTISING_LABEL":
                a2 = a(8);
                a3 = a2;
                break;
            case "DOMAIN":
                a2 = a(9);
                a3 = a2;
                break;
            default:
                mi.b("IntrNativeAdCtrlImpl", "Unknown click target: " + str);
                a2 = s2.a(r2.a("Unknown ClickTarget: " + str));
                a3 = a2;
                break;
        }
        if ((bVar instanceof j7.a) && bVar.L() != null && context != null && !this.c.e().a()) {
            HashMap hashMap = new HashMap();
            if (a3 != null && a3.a()) {
                hashMap.put("click_target", String.valueOf(a3.c()));
            }
            th H = this.c.H();
            if (i == 2) {
                str2 = "ctaClick";
            } else {
                str2 = "click";
            }
            wh.a(H, str2, hashMap, 2);
        }
        if (bVar.e().b()) {
            this.e.a(bVar, a3, new m2.a() { // from class: com.my.target.q7$$ExternalSyntheticLambda2
                @Override // com.my.target.m2.a
                public final void c() {
                    q7.this.b(view);
                }
            }, context);
        } else {
            this.e.a(bVar, new l2.c() { // from class: com.my.target.q7$$ExternalSyntheticLambda3
                @Override // com.my.target.l2.c
                public final void c() {
                    q7.this.c(view);
                }
            }, i, a3, context);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(com.my.target.b bVar, final View view, int i) {
        int i2;
        String str;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
                i2 = 1;
                break;
            case 6:
                i2 = 2;
                break;
            case 12:
            default:
                mi.b("IntrNativeAdCtrlImpl", "Unknown click target: " + i);
                i2 = 1;
                break;
        }
        Context context = view.getContext();
        o2 a2 = a(i);
        if ((bVar instanceof j7.a) && bVar.L() != null && context != null && !this.c.e().a()) {
            HashMap hashMap = new HashMap();
            if (a2 != null && a2.a()) {
                hashMap.put("click_target", String.valueOf(a2.c()));
            }
            th H = this.c.H();
            if (i2 == 2) {
                str = "ctaClick";
            } else {
                str = "click";
            }
            wh.a(H, str, hashMap, 2);
        }
        if (bVar.e().b()) {
            this.e.a(bVar, a2, new m2.a() { // from class: com.my.target.q7$$ExternalSyntheticLambda6
                @Override // com.my.target.m2.a
                public final void c() {
                    q7.this.d(view);
                }
            }, context);
        } else {
            this.e.a(bVar, new l2.c() { // from class: com.my.target.q7$$ExternalSyntheticLambda7
                @Override // com.my.target.l2.c
                public final void c() {
                    q7.this.e(view);
                }
            }, i2, a2, context);
        }
    }

    private o2 a(int i) {
        n2 a2;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
                a2 = p2.a(i);
                break;
            case 12:
            default:
                mi.b("IntrNativeAdCtrlImpl", "Unknown click target: " + i);
                a2 = r2.a("Unknown ClickTarget: " + i);
                break;
        }
        o2 a3 = s2.a(a2);
        if (a3 != null) {
            a3.a(true);
        }
        return a3;
    }

    private WeakReference a(ViewGroup viewGroup) {
        for (WeakReference weakReference : this.f.keySet()) {
            if (viewGroup == weakReference.get()) {
                return weakReference;
            }
        }
        return null;
    }
}
