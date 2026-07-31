package sg.bigo.ads.y;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.adsession.media.InteractionType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.ai.j;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.an.i;
import sg.bigo.ads.api.AdIconView;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.NativeAdView;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.bj.g;
import sg.bigo.ads.cj.l;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.core.adview.h;
import sg.bigo.ads.cv.c;
import sg.bigo.ads.d.d;

/* loaded from: classes14.dex */
public class b extends d<NativeAd, sg.bigo.ads.cp.a> implements NativeAd, h {
    protected InterfaceC1920b A;
    protected final View.OnAttachStateChangeListener B;

    @Nullable
    protected sg.bigo.ads.cv.b C;
    protected ViewGroup D;
    public MediaView E;
    protected g F;
    protected a G;
    public int H;
    private long I;
    private sg.bigo.ads.common.view.c J;
    private int K;
    private final Map<Integer, Integer> L;
    private WeakReference<Activity> O;
    private boolean P;
    protected long z;

    public interface a {
        void a();
    }

    /* renamed from: sg.bigo.ads.y.b$b, reason: collision with other inner class name */
    public interface InterfaceC1920b {
        void a();

        void b();
    }

    public b(@NonNull sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        this.z = -1L;
        this.I = -1L;
        this.B = new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.y.b.1
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                b.this.z = SystemClock.elapsedRealtime();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                b.this.I = SystemClock.elapsedRealtime();
                view.removeOnAttachStateChangeListener(this);
            }
        };
        this.F = null;
        this.G = null;
        this.H = 0;
        this.L = new HashMap();
        this.P = false;
    }

    private boolean G() {
        int y = ((sg.bigo.ads.cp.a) f()).y();
        return y == 1 || y == 15 || y == 16 || y == 17 || y == 18 || this.s == 2;
    }

    private boolean a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            a(2001, "NativeAdView cannot be null.");
            return false;
        }
        if (isExpired()) {
            b(2000, 1, "The ad is expired.");
            return false;
        }
        if (!this.i) {
            return true;
        }
        b(2000, 1, "The ad is destroyed.");
        return false;
    }

    protected static boolean a(ViewGroup viewGroup, View view) {
        Object tag = view.getTag();
        return (tag == null || viewGroup.findViewWithTag(tag) == null) ? false : true;
    }

    protected void B() {
        InterfaceC1920b interfaceC1920b = this.A;
        if (interfaceC1920b != null) {
            interfaceC1920b.a();
        }
    }

    protected final void C() {
        InterfaceC1920b interfaceC1920b = this.A;
        if (interfaceC1920b != null) {
            interfaceC1920b.b();
        }
    }

    public final sg.bigo.ads.common.view.c D() {
        sg.bigo.ads.common.view.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        String str = this.X.f;
        if (r.a((CharSequence) str)) {
            return null;
        }
        sg.bigo.ads.common.view.c cVar2 = new sg.bigo.ads.common.view.c(this.b.f, str);
        this.J = cVar2;
        return cVar2;
    }

    protected List<sg.bigo.ads.cv.a> E() {
        return sg.bigo.ads.y.a.a(((sg.bigo.ads.cp.a) f()).H());
    }

    protected boolean F() {
        return false;
    }

    public final void a(int i) {
        ((sg.bigo.ads.cp.a) f()).f(i);
        this.s = i;
    }

    @Override // sg.bigo.ads.core.adview.h
    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        i iVar = new i();
        iVar.b = new Point(i, i2);
        iVar.a = new Point(i3, i4);
        b(iVar, i5, i6);
    }

    @Override // sg.bigo.ads.d.c
    public void a(Point point, int i, int i2, @NonNull sg.bigo.ads.api.core.e eVar) {
        super.a(point, i, i2, eVar);
        a aVar = this.G;
        if (aVar != null) {
            aVar.a();
        }
    }

    @CallSuper
    protected void a(@NonNull ViewGroup viewGroup, MediaView mediaView, @Nullable View view, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list, int i, @Nullable View... viewArr) {
        View[] viewArr2;
        View view2;
        sg.bigo.ads.cv.c cVar;
        View[] viewArr3;
        this.D = viewGroup;
        viewGroup.setTag(11);
        sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) f();
        if (aVar.y() != 2) {
            sg.bigo.ads.common.view.c cVar2 = this.J;
            if (cVar2 != null) {
                cVar2.bringToFront();
            } else {
                sg.bigo.ads.common.view.c.a(this.b.e, viewGroup, D());
            }
        }
        if (D() != null) {
            View[] viewArr4 = {this.J};
            if (viewArr == null || viewArr.length == 0) {
                viewArr3 = viewArr4;
            } else {
                viewArr3 = (View[]) Arrays.copyOf(viewArr, viewArr.length + 1);
                System.arraycopy(viewArr4, 0, viewArr3, viewArr.length, 1);
            }
            view2 = view;
            viewArr2 = viewArr3;
        } else {
            viewArr2 = viewArr;
            view2 = view;
        }
        int i2 = a(viewGroup, view2, i) ? 5 : 1;
        if (adOptionsView != null) {
            adOptionsView.setTag(4);
            if (a(viewGroup, adOptionsView)) {
                adOptionsView.a(aVar, aVar.m());
                i2 |= 8;
            }
        }
        if (mediaView != null) {
            mediaView.setTag(5);
            if (a(viewGroup, mediaView)) {
                a(mediaView);
                sg.bigo.ads.y.a.a(viewGroup, mediaView, i, this, this.H);
                i2 |= 2;
                this.E = mediaView;
            }
        }
        for (View view3 : sg.bigo.ads.y.a.b(list)) {
            if (view3 != null) {
                sg.bigo.ads.y.a.a(viewGroup, view3, i, this, this.H);
            }
        }
        cVar = c.a.a;
        this.C = cVar.a(E(), F(), this.D, ((sg.bigo.ads.cp.a) f()).aw(), ((sg.bigo.ads.cp.a) f()).ax(), viewArr2);
        a("render_style", Integer.valueOf(i2));
        v();
        this.c = viewGroup;
        d.a.a(((sg.bigo.ads.d.d) this).y);
    }

    public void a(@NonNull ViewGroup viewGroup, MediaView mediaView, @Nullable ImageView imageView, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list, int i, @Nullable View... viewArr) {
        a(viewGroup, mediaView, (View) imageView, adOptionsView, list, i, viewArr);
    }

    @Override // sg.bigo.ads.d.c, sg.bigo.ads.aj.d
    public final void a(@NonNull d.a<NativeAd> aVar) {
        super.a(aVar);
        a(aVar, this.b.b.e());
    }

    public void a(@NonNull final d.a<NativeAd> aVar, int i) {
        B();
        final sg.bigo.ads.cp.a aVar2 = (sg.bigo.ads.cp.a) f();
        final String bb = aVar2.bb();
        if (r.a((CharSequence) bb)) {
            aVar.a(this, 1027, 1300, "Missing media image.");
            return;
        }
        if (k.a.n().a(9) && URLUtil.isHttpUrl(bb)) {
            aVar.a(this, 1028, 1305, "Invalid http url");
            sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) aVar2, bb, "Invalid http url", 0L, 0L, 1, "", false, (String) null, (String) null, (String) null);
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (i == 0) {
            sg.bigo.ads.bj.e.a(this.b.e, bb, aVar2.am(), new g() { // from class: sg.bigo.ads.y.b.2
                @Override // sg.bigo.ads.bj.g
                public final void a(int i2, @NonNull String str, @Nullable sg.bigo.ads.bj.f fVar) {
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    if (fVar != null) {
                        String str6 = fVar.b;
                        str2 = str6;
                        str3 = fVar.f;
                        str4 = fVar.g;
                        str5 = fVar.h;
                    } else {
                        str2 = null;
                        str3 = null;
                        str4 = null;
                        str5 = null;
                    }
                    aVar2.c(str2);
                    sg.bigo.ads.cp.a aVar3 = aVar2;
                    if (aVar3 instanceof l) {
                        ((l) aVar3).K = fVar;
                    }
                    aVar.a(b.this, 1029, i2, "Failed to download media image: ".concat(String.valueOf(str)));
                    sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) aVar2, bb, str, SystemClock.elapsedRealtime() - elapsedRealtime, 0L, 1, str2, false, str3, str4, str5);
                }

                @Override // sg.bigo.ads.bj.g
                public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
                    aVar2.c(fVar.b);
                    n nVar = new n();
                    nVar.a = bitmap.getWidth();
                    nVar.b = bitmap.getHeight();
                    nVar.d = fVar.c;
                    aVar2.a(nVar);
                    b.this.a(bitmap, 2);
                    b.this.a("is_cache", Boolean.valueOf(fVar.a != 1));
                    sg.bigo.ads.cp.a aVar3 = aVar2;
                    if (aVar3 instanceof l) {
                        ((l) aVar3).K = fVar;
                    }
                    aVar.a(b.this);
                    sg.bigo.ads.da.b.a(aVar2, bb, fVar.a, SystemClock.elapsedRealtime() - elapsedRealtime, fVar.c, fVar.b, fVar.f, fVar.g, fVar.h, "");
                }
            });
            return;
        }
        if (i == 1) {
            sg.bigo.ads.bj.e.a(this.b.e, bb, aVar2.am(), new g() { // from class: sg.bigo.ads.y.b.3
                @Override // sg.bigo.ads.bj.g
                public final void a(int i2, @NonNull String str, @Nullable sg.bigo.ads.bj.f fVar) {
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    if (fVar != null) {
                        String str6 = fVar.b;
                        str2 = str6;
                        str3 = fVar.f;
                        str4 = fVar.g;
                        str5 = fVar.h;
                    } else {
                        str2 = null;
                        str3 = null;
                        str4 = null;
                        str5 = null;
                    }
                    aVar2.c(str2);
                    sg.bigo.ads.cp.a aVar3 = aVar2;
                    if (aVar3 instanceof l) {
                        ((l) aVar3).K = fVar;
                    }
                    sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) aVar3, bb, str, SystemClock.elapsedRealtime() - elapsedRealtime, 0L, 1, str2, false, str3, str4, str5);
                }

                @Override // sg.bigo.ads.bj.g
                public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
                    aVar2.c(fVar.b);
                    n nVar = new n();
                    nVar.a = bitmap.getWidth();
                    nVar.b = bitmap.getHeight();
                    nVar.d = fVar.c;
                    aVar2.a(nVar);
                    b.this.a(bitmap, 2);
                    sg.bigo.ads.cp.a aVar3 = aVar2;
                    if (aVar3 instanceof l) {
                        ((l) aVar3).K = fVar;
                    }
                    sg.bigo.ads.da.b.a(aVar3, bb, fVar.a, SystemClock.elapsedRealtime() - elapsedRealtime, fVar.c, fVar.b, fVar.f, fVar.g, fVar.h, "");
                }
            });
        }
        aVar.a(this);
    }

    @Override // sg.bigo.ads.core.adview.h
    public final void a(i iVar, int i, int i2) {
        b(iVar, i, i2);
    }

    protected void a(@Nullable MediaView mediaView) {
        if (mediaView == null) {
            return;
        }
        final sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) f();
        if (this.b.b.e() == 2) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.F = new g() { // from class: sg.bigo.ads.y.b.4
                @Override // sg.bigo.ads.bj.g
                public final void a(int i, @NonNull String str, @Nullable sg.bigo.ads.bj.f fVar) {
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    if (fVar != null) {
                        String str6 = fVar.b;
                        String str7 = fVar.f;
                        String str8 = fVar.g;
                        str5 = fVar.h;
                        str2 = str6;
                        str3 = str7;
                        str4 = str8;
                    } else {
                        str2 = null;
                        str3 = null;
                        str4 = null;
                        str5 = null;
                    }
                    sg.bigo.ads.cp.a aVar2 = aVar;
                    sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) aVar2, aVar2.bb(), str, SystemClock.elapsedRealtime() - elapsedRealtime, 0L, 1, str2, false, str3, str4, str5);
                }

                @Override // sg.bigo.ads.bj.g
                public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
                    sg.bigo.ads.cp.a aVar2 = aVar;
                    sg.bigo.ads.da.b.a(aVar2, aVar2.bb(), fVar.a, SystemClock.elapsedRealtime() - elapsedRealtime, fVar.c, fVar.b, fVar.f, fVar.g, fVar.h, "");
                }
            };
        }
        mediaView.a(aVar, this.F);
        if (k.a.n().a(28)) {
            mediaView.setOnAdClickListener(new h() { // from class: sg.bigo.ads.y.b.5
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
                }

                @Override // sg.bigo.ads.core.adview.h
                public final void a(i iVar, int i, int i2) {
                    b.this.a(iVar, i, i2);
                }
            });
        }
    }

    public final void a(a aVar) {
        this.G = aVar;
    }

    public final void a(InterfaceC1920b interfaceC1920b) {
        this.A = interfaceC1920b;
    }

    public void a(boolean z) {
        this.P = z;
    }

    protected boolean a(@NonNull ViewGroup viewGroup, View view, int i) {
        sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) f();
        if (view != null && aVar != null) {
            view.setTag(1);
            if (a(viewGroup, view)) {
                o.a aD = aVar.aD();
                if (aD != null) {
                    String c = aD.c();
                    if (k.a.n().a(9) && URLUtil.isHttpUrl(c)) {
                        sg.bigo.ads.da.b.a(aVar, 3000, 10220, "Invalid http url: ".concat(String.valueOf(c)));
                    } else if (view instanceof ImageView) {
                        new sg.bigo.ads.bj.b((ImageView) view, (byte) 0).a(null, aD.c(), aVar.am());
                    } else if (view instanceof AdIconView) {
                        ((AdIconView) view).a(aD.c(), aVar.am());
                    }
                }
                sg.bigo.ads.y.a.a(viewGroup, view, i, this, this.H);
                return true;
            }
        }
        return false;
    }

    public void b(Activity activity) {
        this.O = new WeakReference<>(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void b(i iVar, int i, int i2) {
        Activity activity;
        Activity activity2;
        sg.bigo.ads.cp.a aVar;
        b bVar;
        i iVar2;
        int i3;
        String str;
        String str2;
        if (y()) {
            str2 = "Styleable landing page is opened, ignore the click action.";
        } else {
            if (this.x) {
                sg.bigo.ads.cp.a aVar2 = (sg.bigo.ads.cp.a) f();
                WeakReference<Activity> weakReference = this.O;
                if (weakReference == null || (activity = weakReference.get()) == null) {
                    activity = null;
                } else {
                    c(1);
                }
                if (activity == null) {
                    j jVar = k.a;
                    if (this.P) {
                        if (jVar != null && jVar.n().a(16)) {
                            activity = sg.bigo.ads.at.b.b();
                            if (activity == null) {
                                str = "Interstitial/Reward Video/Splash native ad failed to get activity context.";
                                sg.bigo.ads.bn.a.a(0, "NativeStaticAdImpl", str);
                            }
                            c(2);
                        }
                    } else if (jVar != null && jVar.n().a(17)) {
                        try {
                            Activity a2 = sg.bigo.ads.common.utils.d.a(this.D);
                            if (a2 != null) {
                                try {
                                    c(3);
                                } catch (Exception unused) {
                                }
                                activity = a2;
                            }
                        } catch (Exception unused2) {
                        }
                        if (activity == null) {
                            activity = sg.bigo.ads.at.b.b();
                            if (activity == null) {
                                str = "Native ad failed to get activity context.";
                                sg.bigo.ads.bn.a.a(0, "NativeStaticAdImpl", str);
                            }
                            c(2);
                        }
                    }
                }
                if (activity == null) {
                    activity = this.b.e;
                }
                boolean z = this instanceof sg.bigo.ads.aj.f;
                boolean z2 = !z && aVar2.a(16);
                ViewGroup viewGroup = this.D;
                Activity a3 = viewGroup != null ? sg.bigo.ads.common.utils.d.a(viewGroup) : null;
                sg.bigo.ads.ai.e g = aVar2.g();
                sg.bigo.ads.api.core.e eVar = new sg.bigo.ads.api.core.e();
                if (g.c() != 0) {
                    sg.bigo.ads.controller.landing.d.a(activity, this);
                    eVar.m = 1;
                    iVar2 = iVar;
                    activity2 = a3;
                    aVar = aVar2;
                    i3 = i2;
                    bVar = this;
                } else {
                    b.InterfaceC1839b O = aVar2.O();
                    String a4 = O.a();
                    if (z) {
                        ((sg.bigo.ads.aj.f) this).M();
                    }
                    activity2 = a3;
                    aVar = aVar2;
                    eVar = sg.bigo.ads.controller.landing.d.a(activity, a3, O.c(), O.b(), sg.bigo.ads.controller.landing.d.a(a4, aVar2.bw(), aVar2.bx(), i, i2), O.h(), aVar2.a(2), O.d(), O.e(), this, aVar2.as(), z2, i2, aVar2.a(64));
                    eVar.m = 0;
                    bVar = this;
                    iVar2 = iVar;
                    i3 = i2;
                }
                bVar.a(iVar2, i3, i, eVar);
                sg.bigo.ads.cv.b bVar2 = bVar.C;
                if (bVar2 != null) {
                    bVar2.a(InteractionType.CLICK);
                }
                if (eVar.b() >= 0 && G()) {
                    bVar.a(eVar.d);
                    sg.bigo.ads.controller.landing.d.a(activity2, (sg.bigo.ads.d.c) bVar);
                }
                if (eVar.a == 6) {
                    eVar.l = aVar.O().h();
                    sg.bigo.ads.controller.landing.d.a(sg.bigo.ads.common.utils.d.a(bVar.D), aVar, eVar, bVar);
                    return;
                }
                return;
            }
            str2 = "ignore the click action.";
        }
        sg.bigo.ads.bn.a.a(0, "NativeStaticAdImpl", str2);
    }

    public final void d(int i) {
        this.L.put(Integer.valueOf(this.K), Integer.valueOf(this.o));
        this.K = i;
        Integer num = this.L.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.o = num.intValue();
    }

    @Override // sg.bigo.ads.d.d, sg.bigo.ads.d.c
    public void destroyInMainThread() {
        super.destroyInMainThread();
        sg.bigo.ads.cv.b bVar = this.C;
        if (bVar != null) {
            bVar.b();
        }
        this.c = null;
        this.D = null;
        MediaView mediaView = this.E;
        if (mediaView != null) {
            mediaView.c();
            this.E = null;
        }
        sg.bigo.ads.common.view.c cVar = this.J;
        if (cVar != null) {
            v.b(cVar);
            this.J = null;
        }
        this.F = null;
        this.G = null;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getAdvertiser() {
        return ((sg.bigo.ads.cp.a) f()).j();
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getCallToAction() {
        return ((sg.bigo.ads.cp.a) f()).v();
    }

    @Nullable
    public String getCreativeId() {
        sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) f();
        return aVar != null ? aVar.A() : "";
    }

    @Override // sg.bigo.ads.api.NativeAd
    public NativeAd.CreativeType getCreativeType() {
        return NativeAd.CreativeType.IMAGE;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getDescription() {
        return ((sg.bigo.ads.cp.a) f()).u();
    }

    @Override // sg.bigo.ads.api.NativeAd
    public float getMediaContentAspectRatio() {
        if (sg.bigo.ads.y.a.a(this).a()) {
            return (r0.getWidth() * 1.0f) / r0.getHeight();
        }
        return 0.0f;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public b.d getPopPage() {
        return ((sg.bigo.ads.cp.a) f()).r();
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getSponsored() {
        return ((sg.bigo.ads.cp.a) f()).av();
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getTitle() {
        return ((sg.bigo.ads.cp.a) f()).t();
    }

    @Override // sg.bigo.ads.api.NativeAd
    @Nullable
    public VideoController getVideoController() {
        return null;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public String getWarning() {
        b.e C = ((sg.bigo.ads.cp.a) f()).C();
        return C != null ? C.c() : "";
    }

    @Override // sg.bigo.ads.d.c
    public void h() {
        super.h();
        sg.bigo.ads.cv.b bVar = this.C;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // sg.bigo.ads.api.NativeAd
    public boolean hasIcon() {
        o.a aD = ((sg.bigo.ads.cp.a) f()).aD();
        return (aD == null || r.a((CharSequence) aD.c())) ? false : true;
    }

    @Override // sg.bigo.ads.api.NativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, @Nullable MediaView mediaView, @Nullable ImageView imageView, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list) {
        if (a(viewGroup)) {
            a(viewGroup, mediaView, (View) imageView, adOptionsView, list, 1, null);
        }
    }

    @Override // sg.bigo.ads.api.NativeAd
    public void registerViewForInteraction(NativeAdView nativeAdView, @Nullable MediaView mediaView, @Nullable AdIconView adIconView, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list) {
        if (a(nativeAdView)) {
            a(nativeAdView, mediaView, adIconView, adOptionsView, list, 1, null);
        }
    }
}
