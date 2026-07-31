package sg.bigo.ads.ad.interstitial;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.AutoNextLineLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* loaded from: classes10.dex */
public final class q {

    @NonNull
    final d A;

    @NonNull
    final e B;
    c C;

    @Nullable
    private final f F;

    @Nullable
    private Runnable G;

    @Nullable
    private Runnable H;

    @Nullable
    private View I;
    private int M;
    private long N;
    private boolean O;

    @Nullable
    private Runnable P;
    final Context a;

    @NonNull
    final sg.bigo.ads.y.b b;

    @Nullable
    final sg.bigo.ads.api.core.b c;

    @Nullable
    final sg.bigo.ads.ai.o d;

    @Nullable
    Runnable e;

    @Nullable
    FrameLayout f;

    @Nullable
    FrameLayout g;

    @Nullable
    AlertDialog h;
    boolean o;
    boolean p;
    int q;
    long s;
    List<Integer> t;
    long u;

    @Nullable
    Runnable v;

    @Nullable
    Runnable w;

    @Nullable
    Runnable x;

    @NonNull
    final a z;
    public boolean i = true;
    private boolean J = false;
    boolean j = false;
    private boolean K = false;
    boolean k = false;
    boolean l = false;
    boolean m = false;
    boolean n = false;
    int r = 0;
    private long L = -1;

    @NonNull
    private final List<Runnable> Q = new ArrayList();

    @NonNull
    public final b y = new b();
    boolean D = false;
    int E = 0;

    @SuppressLint({"ClickableViewAccessibility"})
    static class a {
        int a;
        boolean b;
        boolean c;
        boolean d;
        boolean e;
        int f;
        boolean g;
        int h;
        boolean i;
        int j;
        float k;
        float l;

        @Nullable
        View m;

        @Nullable
        View n;

        @Nullable
        View o;

        @Nullable
        q p;

        @NonNull
        final Map<View, sg.bigo.ads.core.adview.h> q;

        @NonNull
        final sg.bigo.ads.core.adview.h r;

        private a() {
            this.a = 0;
            this.q = new HashMap();
            this.r = new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.q.a.1
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
                }

                @Override // sg.bigo.ads.core.adview.h
                public final void a(sg.bigo.ads.an.i iVar, int i, int i2) {
                }
            };
        }

        /* synthetic */ a(byte b) {
            this();
        }

        static /* synthetic */ View a(a aVar, View view, float f, float f2) {
            ArrayList arrayList = new ArrayList();
            aVar.a(view, f, f2, 0, new int[2], arrayList);
            if (arrayList.size() > 0) {
                return arrayList.get(arrayList.size() - 1);
            }
            return null;
        }

        private void a(View view, float f, float f2, int i, @NonNull int[] iArr, @NonNull List<View> list) {
            if (i > 10) {
                return;
            }
            int i2 = i + 1;
            if (view == null) {
                return;
            }
            view.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            if (f > i3 && f < i3 + view.getWidth() && f2 > i4 && f2 < i4 + view.getHeight() && (view.getTag() instanceof Integer) && this.q.containsKey(view)) {
                list.add(view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    a(viewGroup.getChildAt(i5), f, f2, i2, iArr, list);
                }
            }
        }

        private void a(final sg.bigo.ads.y.b bVar, @NonNull final View view, final int i) {
            final int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            view.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.interstitial.q.a.2
                boolean a;
                int b;
                int c;
                final /* synthetic */ int h = 11;

                private View a(float f) {
                    a aVar = a.this;
                    if (f < aVar.h) {
                        return aVar.n;
                    }
                    if (aVar.f <= 0 || f <= aVar.j - r1) {
                        return null;
                    }
                    return aVar.o;
                }

                /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
                
                    if (r17.i.m == r7) goto L41;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x00ec, code lost:
                
                    r4 = r17.i;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
                
                    if (r7 != r4.n) goto L49;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
                
                    r7 = r2;
                    r8 = r5;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x00f8, code lost:
                
                    if (r4.i == false) goto L46;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x00fa, code lost:
                
                    r9 = r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x00fe, code lost:
                
                    r4 = r4.a(r8, r9);
                    r8 = r17.i.i;
                    r8 = 24;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x0108, code lost:
                
                    r14 = r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x0142, code lost:
                
                    if (r7 == null) goto L77;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x0144, code lost:
                
                    if (r4 != null) goto L65;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x0146, code lost:
                
                    r4 = r17.i.r;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x014a, code lost:
                
                    r8 = r4;
                    r4 = new int[2];
                    r5 = r18;
                    r5.getLocationOnScreen(r4);
                    r7 = r2;
                    r9 = (int) r19.getX();
                    r10 = (int) r19.getY();
                    r11 = r17.i;
                    r12 = ((int) r11.k) - r4[0];
                    r11 = ((int) r11.l) - r4[1];
                    r13 = r17.h;
                    r4 = 0;
                    r12 = r11;
                    r11 = r12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x0176, code lost:
                
                    if (r4 >= 100) goto L85;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x017e, code lost:
                
                    if ((r5.getParent() instanceof android.view.ViewGroup) == false) goto L86;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x0180, code lost:
                
                    r4 = r4 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x0182, code lost:
                
                    if (r5 == r7) goto L83;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x0186, code lost:
                
                    if ((r5 instanceof sg.bigo.ads.api.NativeAdView) != false) goto L84;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x0188, code lost:
                
                    r9 = r9 + r5.getLeft();
                    r11 = r11 + r5.getLeft();
                    r10 = r10 + r5.getTop();
                    r12 = r12 + r5.getTop();
                    r5 = (android.view.View) r5.getParent();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x01a3, code lost:
                
                    if (r8 == null) goto L77;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x01a5, code lost:
                
                    r8.a(r9, r10, r11, r12, r13, r14);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x00fc, code lost:
                
                    r9 = r4.r;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x010c, code lost:
                
                    if (r7 != r4.o) goto L56;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:64:0x010e, code lost:
                
                    r7 = r2;
                    r8 = r5;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:65:0x0114, code lost:
                
                    if (r4.g == false) goto L54;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x0116, code lost:
                
                    r9 = r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:67:0x011a, code lost:
                
                    r4 = r4.a(r8, r9);
                    r8 = r17.i.g;
                    r8 = 25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x0118, code lost:
                
                    r9 = r4.r;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:69:0x0125, code lost:
                
                    if (r7 == null) goto L61;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x0127, code lost:
                
                    r4 = r4.q.get(r7);
                    r8 = r7.getTag();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:71:0x0135, code lost:
                
                    if ((r8 instanceof java.lang.Integer) == false) goto L60;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x0137, code lost:
                
                    r8 = ((java.lang.Integer) r8).intValue();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x013e, code lost:
                
                    r14 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:74:0x0140, code lost:
                
                    r4 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:0x00e7, code lost:
                
                    if (java.lang.Math.abs(r6 - r17.i.l) < r4) goto L41;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:84:0x00ea, code lost:
                
                    if (r7 != null) goto L41;
                 */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    if (motionEvent.getActionMasked() == 0) {
                        a.this.k = motionEvent.getRawX();
                        a.this.l = motionEvent.getRawY();
                        this.b = view.getScrollX();
                        this.c = view.getScrollY();
                        this.a = false;
                        a aVar = a.this;
                        aVar.m = a(aVar.l);
                        a aVar2 = a.this;
                        if (aVar2.m == null) {
                            aVar2.m = a.a(aVar2, view, motionEvent.getRawX(), motionEvent.getRawY());
                        }
                        return !view.isScrollContainer();
                    }
                    if (motionEvent.getActionMasked() == 2) {
                        if (i == 3 && (Math.abs(motionEvent.getRawX() - a.this.k) >= scaledTouchSlop || Math.abs(motionEvent.getRawY() - a.this.l) >= scaledTouchSlop)) {
                            this.a = true;
                        }
                    } else if (motionEvent.getActionMasked() == 1) {
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        View a = a(rawY);
                        if (a == null) {
                            a = a.a(a.this, view, motionEvent.getRawX(), motionEvent.getRawY());
                        }
                        int i2 = i;
                        if (i2 != 2) {
                            if (i2 == 3) {
                                a aVar3 = a.this;
                                if (aVar3.m == a) {
                                    if (!this.a) {
                                        if (Math.abs(rawX - aVar3.k) < scaledTouchSlop) {
                                        }
                                    }
                                }
                                if (Math.abs(rawX - a.this.k) < scaledTouchSlop && Math.abs(rawY - a.this.l) < scaledTouchSlop) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            });
        }

        private void a(sg.bigo.ads.y.b bVar, @NonNull View view, @NonNull View view2, sg.bigo.ads.core.adview.h hVar, int i) {
            if (hVar == null) {
                view2.setOnTouchListener(null);
            } else {
                a(bVar, view, i);
            }
        }

        final sg.bigo.ads.core.adview.h a(final sg.bigo.ads.y.b bVar, sg.bigo.ads.core.adview.h hVar) {
            return hVar == bVar ? new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.q.a.3
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
                    a.this.p.m = true;
                    bVar.a(i, i2, i3, i4, i5, i6);
                }

                @Override // sg.bigo.ads.core.adview.h
                public final void a(sg.bigo.ads.an.i iVar, int i, int i2) {
                    a.this.p.m = true;
                    bVar.a(iVar, i, i2);
                }
            } : hVar;
        }

        final void a(sg.bigo.ads.y.b bVar, @NonNull View view, @NonNull View view2, int i, @Nullable sg.bigo.ads.core.adview.h hVar) {
            view.getTag();
            view.setTag(R.id.content, "TouchView");
            view2.setTag(Integer.valueOf(i));
            if (hVar != null) {
                this.q.put(view2, hVar);
            }
            a(bVar, view, view2, hVar, this.a);
        }
    }

    public class b {
        boolean a = false;

        public b() {
        }

        private void b(Runnable runnable) {
            q.b(q.this);
            sg.bigo.ads.bh.d.a(2, runnable);
        }

        public final boolean a() {
            q qVar = q.this;
            if (qVar.i && !this.a) {
                this.a = true;
                Runnable runnable = qVar.w;
                if (runnable != null) {
                    b(runnable);
                    return true;
                }
            }
            return false;
        }

        public final boolean a(@Nullable Runnable runnable) {
            Runnable runnable2;
            q qVar = q.this;
            if (qVar.i && !this.a) {
                this.a = true;
                Runnable runnable3 = qVar.w;
                if (runnable3 == null && (runnable2 = qVar.v) != null) {
                    sg.bigo.ads.bh.d.a(runnable2);
                    q qVar2 = q.this;
                    runnable3 = qVar2.v;
                    qVar2.w = runnable3;
                }
                if (runnable3 != null) {
                    q.this.x = runnable;
                    b(runnable3);
                    return true;
                }
            }
            return false;
        }
    }

    public interface c {
        boolean a(Runnable runnable);
    }

    static class d {
        int a;
        int b;
        int c;

        private d() {
        }

        /* synthetic */ d(byte b) {
            this();
        }
    }

    static class e {
        long a;
        boolean b;
        private boolean c;
        private final Map<Integer, Long> d;

        private e() {
            this.d = new HashMap();
        }

        /* synthetic */ e(byte b) {
            this();
        }

        public static int a(int i, boolean z) {
            if (i == 1) {
                return z ? 2 : 1;
            }
            if (i == 2) {
                return 4;
            }
            if (i == 3) {
                return 3;
            }
            if (i == 4) {
                return 5;
            }
            return i == 5 ? 6 : 0;
        }

        private static int a(@NonNull String str, int i) {
            return (str + i).hashCode();
        }

        public final void a(sg.bigo.ads.api.core.b bVar, int i, String str, int i2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int a = a(str, i2);
            if (this.d.get(Integer.valueOf(a)) == null) {
                this.d.put(Integer.valueOf(a), Long.valueOf(SystemClock.elapsedRealtime()));
                sg.bigo.ads.da.b.a(bVar, a(i, false), 1, String.valueOf(a), 0L, false, 0, (String) null);
            }
        }

        public final void a(sg.bigo.ads.api.core.b bVar, int i, String str, int i2, int i3, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int a = a(str, i2);
            Long l = this.d.get(Integer.valueOf(a));
            if (l == null) {
                return;
            }
            sg.bigo.ads.da.b.a(bVar, a(i, false), 6, String.valueOf(a), SystemClock.elapsedRealtime() - l.longValue(), true, i3, str2);
        }

        public final void a(sg.bigo.ads.api.core.b bVar, boolean z, int i, String str) {
            if (this.c || this.a <= 0) {
                return;
            }
            this.c = true;
            sg.bigo.ads.da.b.a(bVar, a(1, z), 4, (String) null, SystemClock.elapsedRealtime() - this.a, true, i, str);
        }

        public final void b(sg.bigo.ads.api.core.b bVar, int i, String str, int i2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int a = a(str, i2);
            Long l = this.d.get(Integer.valueOf(a));
            if (l == null) {
                return;
            }
            sg.bigo.ads.da.b.a(bVar, a(i, false), 5, String.valueOf(a), SystemClock.elapsedRealtime() - l.longValue(), false, 0, (String) null);
        }
    }

    public q(Context context, @NonNull sg.bigo.ads.y.b bVar, sg.bigo.ads.api.core.b bVar2, sg.bigo.ads.ai.o oVar, boolean z, f fVar, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        byte b2 = 0;
        this.o = false;
        this.z = new a(b2);
        this.A = new d(b2);
        this.B = new e(b2);
        this.a = context;
        this.b = bVar;
        this.c = bVar2;
        this.F = fVar;
        this.d = oVar;
        this.o = z;
        this.e = runnable;
        this.G = runnable2;
        this.H = runnable3;
    }

    public static int a(@Nullable sg.bigo.ads.ai.o oVar) {
        return sg.bigo.ads.k.a.a(oVar, "layer.webview_force_time", "layer.webview_force_time_new");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v57, types: [sg.bigo.ads.core.adview.h] */
    /* JADX WARN: Type inference failed for: r0v60, types: [sg.bigo.ads.core.adview.h] */
    /* JADX WARN: Type inference failed for: r0v63, types: [sg.bigo.ads.core.adview.h] */
    /* JADX WARN: Type inference failed for: r0v72, types: [sg.bigo.ads.core.adview.h] */
    /* JADX WARN: Type inference failed for: r47v0, types: [sg.bigo.ads.ad.interstitial.q] */
    @Nullable
    private View a(Context context, sg.bigo.ads.y.b bVar, final sg.bigo.ads.api.core.b bVar2, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String[] strArr;
        String[] strArr2;
        int i;
        int i2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        View view;
        String str5;
        int i3;
        String str6;
        String str7;
        String[] strArr3;
        TextView textView8;
        String str8;
        int i4;
        final String str9;
        TextView textView9;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        TextView textView13;
        View findViewById;
        o.a aD;
        String o = bVar2.o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        b.d r = bVar2.r();
        if (r != null) {
            str = r.a();
            str2 = r.b();
            str3 = r.c();
            String f = r.f();
            String[] e2 = r.e();
            strArr2 = r.d();
            strArr = e2;
            str4 = f;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            strArr = null;
            strArr2 = null;
        }
        boolean z2 = bVar2 instanceof sg.bigo.ads.cp.a;
        if (z2) {
            sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) bVar2;
            if ((TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) && (aD = aVar.aD()) != null) {
                str = aD.c();
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = aVar.t();
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = aVar.u();
            }
            if (TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) {
                if (aVar.aZ()) {
                    str = sg.bigo.ads.an.o.b(context, aVar.aV());
                } else {
                    String bb = aVar.bb();
                    if (!TextUtils.isEmpty(bb) && URLUtil.isNetworkUrl(bb)) {
                        str = bb;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = sg.bigo.ads.common.utils.a.a(context, R.string.bigo_ad_title_default, new Object[0]);
        }
        String str10 = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = sg.bigo.ads.common.utils.a.a(context, R.string.bigo_ad_description_default, new Object[0]);
        }
        String str11 = str3;
        String c2 = (TextUtils.isEmpty(null) || sg.bigo.ads.common.utils.r.a() < 4.0f) ? sg.bigo.ads.y.e.c(o) : null;
        String b2 = TextUtils.isEmpty(null) ? sg.bigo.ads.y.e.b(o) : null;
        String a2 = TextUtils.isEmpty(null) ? sg.bigo.ads.y.e.a(o) : null;
        try {
            if (!this.o) {
                i = R.layout.bigo_ad_layout_interstitial_mid_page_native_view;
            } else if (z) {
                i = R.layout.bigo_ad_layout_interstitial_mid_page_native_view_landscape;
            } else {
                f fVar = this.F;
                i = (fVar == null || !fVar.d) ? R.layout.bigo_ad_layout_interstitial_mid_page_native_fallback_view_landscape : R.layout.bigo_ad_layout_interstitial_mid_page_native_fallback_view_download_info_landscape;
            }
            View a3 = sg.bigo.ads.common.utils.a.a(context, i, null, false);
            View findViewById2 = a3 == null ? null : a3.findViewById(R.id.inter_mid_native_view);
            if (findViewById2 == null) {
                return a3;
            }
            final AdImageView adImageView = (AdImageView) findViewById2.findViewById(R.id.inter_iv_icon);
            TextView textView14 = (TextView) findViewById2.findViewById(R.id.inter_tv_title);
            TextView textView15 = (TextView) findViewById2.findViewById(R.id.inter_tv_desc);
            TextView textView16 = (TextView) findViewById2.findViewById(R.id.inter_tv_desc_below);
            TextView textView17 = (TextView) findViewById2.findViewById(R.id.inter_tv_company_name);
            View findViewById3 = findViewById2.findViewById(R.id.inter_ll_start_rate);
            TextView textView18 = (TextView) findViewById2.findViewById(R.id.inter_tv_start_rate);
            TextView textView19 = (TextView) findViewById2.findViewById(R.id.inter_tv_comment);
            TextView textView20 = (TextView) findViewById2.findViewById(R.id.inter_tv_download_num);
            View findViewById4 = findViewById2.findViewById(R.id.inter_tv_download_num_desc);
            TextView textView21 = (TextView) findViewById2.findViewById(R.id.inter_tv_age);
            View findViewById5 = findViewById2.findViewById(R.id.inter_iv_age);
            View findViewById6 = findViewById2.findViewById(R.id.bigo_ad_btn_cta);
            View findViewById7 = findViewById2.findViewById(R.id.bigo_ad_btn_cta_inner);
            View findViewById8 = findViewById2.findViewById(R.id.inter_tv_gp_info_extra_about);
            View findViewById9 = findViewById2.findViewById(R.id.inter_iv_gp_info_extra_arrow);
            ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.inter_ll_media);
            AutoNextLineLinearLayout autoNextLineLinearLayout = (AutoNextLineLinearLayout) findViewById2.findViewById(R.id.inter_fbl_genre);
            RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) findViewById2.findViewById(R.id.inter_fl_icon);
            String str12 = b2;
            String str13 = a2;
            if (roundedFrameLayout != null) {
                roundedFrameLayout.setStrokeWidth(sg.bigo.ads.common.utils.f.a(context, 1));
                roundedFrameLayout.setStrokeColor(sg.bigo.ads.common.utils.r.b("#05000000", -7829368));
            }
            int a4 = s.a(bVar, this.A.c, null);
            if (!z || (findViewById = findViewById2.findViewById(R.id.inter_ll_native_extra)) == null) {
                i2 = a4;
            } else {
                i2 = a4;
                findViewById.setVisibility(0);
            }
            if (TextUtils.isEmpty(str) || adImageView == null) {
                textView = textView15;
                textView2 = textView16;
                textView3 = textView17;
                textView4 = textView18;
                textView5 = textView19;
                textView6 = textView20;
                textView7 = textView21;
                view = findViewById7;
                str5 = str12;
                i3 = i2;
                str6 = c2;
                str7 = str11;
                strArr3 = strArr2;
                textView8 = textView14;
                str8 = str13;
            } else {
                adImageView.setIconTag(true);
                adImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                adImageView.setBackgroundColor(sg.bigo.ads.common.utils.r.b("#FFE1E1E6", -7829368));
                adImageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_icon_default_only_icon));
                final ArrayList arrayList = new ArrayList();
                sg.bigo.ads.bj.g gVar = new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ad.interstitial.q.4
                    @Override // sg.bigo.ads.bj.g
                    public final void a(int i5, @NonNull String str14, @Nullable sg.bigo.ads.bj.f fVar2) {
                    }

                    @Override // sg.bigo.ads.bj.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar2) {
                        adImageView.setBackground(null);
                    }
                };
                adImageView.a(gVar);
                arrayList.add(gVar);
                a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        arrayList.clear();
                        adImageView.a();
                    }
                });
                adImageView.a(str, bVar2.am());
                textView2 = textView16;
                textView3 = textView17;
                textView4 = textView18;
                textView5 = textView19;
                textView6 = textView20;
                textView7 = textView21;
                view = findViewById7;
                i3 = i2;
                textView = textView15;
                str8 = str13;
                strArr3 = strArr2;
                textView8 = textView14;
                str5 = str12;
                str6 = c2;
                str7 = str11;
                a(findViewById2, adImageView, 1, bVar, bVar);
            }
            if (!TextUtils.isEmpty(str10) && textView8 != null) {
                textView8.setText(str10);
                a(findViewById2, textView8, 2, bVar, bVar);
            }
            if (!TextUtils.isEmpty(str7)) {
                TextView textView22 = textView;
                String str14 = str7;
                if (textView22 != null) {
                    textView22.setText(str14);
                    a(findViewById2, textView22, 6, bVar, bVar);
                }
                if (z && (textView13 = textView2) != null) {
                    textView13.setText(str14);
                    a(findViewById2, textView13, 6, bVar, bVar);
                }
            }
            if (TextUtils.isEmpty(str4) || (textView12 = textView3) == null) {
                i4 = i3;
            } else {
                textView12.setVisibility(0);
                textView12.setText(str4);
                i4 = i3;
                textView12.setTextColor(i4);
                a(findViewById2, textView12, 26, bVar, bVar);
            }
            if (!TextUtils.isEmpty(str6) && (textView11 = textView4) != null) {
                textView11.setText(str6);
                a(findViewById2, textView11, 26, bVar, bVar);
            }
            if (findViewById3 != null) {
                a(findViewById2, findViewById3, 26, bVar, bVar);
            }
            if (!TextUtils.isEmpty(str5) && str5 != null) {
                TextView textView23 = textView5;
                textView23.setText(str5 + " " + sg.bigo.ads.common.utils.a.a(context, R.string.bigo_ad_comment_num_text, new Object[0]));
                a(findViewById2, textView23, 26, bVar, bVar);
            }
            if (!TextUtils.isEmpty(str8) && (textView10 = textView6) != null) {
                textView10.setText(str8);
                a(findViewById2, textView10, 26, bVar, bVar);
            }
            if (findViewById4 != null) {
                a(findViewById2, findViewById4, 26, bVar, bVar);
            }
            if (!TextUtils.isEmpty("Everyone") && (textView9 = textView7) != null) {
                textView9.setText("Everyone");
                a(findViewById2, textView9, 26, bVar, bVar);
            }
            if (findViewById5 != null) {
                a(findViewById2, findViewById5, 26, bVar, bVar);
            }
            if (findViewById6 != null) {
                View view2 = view;
                if (view2 != null) {
                    view2.setBackgroundColor(i4);
                }
                a(findViewById2, findViewById6, 7, bVar, bVar);
            }
            if (z && strArr != null && strArr.length > 0 && viewGroup != null) {
                a(context, viewGroup, bVar, bVar2, strArr);
            }
            if (!z && z2) {
                RoundedFrameLayout roundedFrameLayout2 = (RoundedFrameLayout) findViewById2.findViewById(R.id.inter_ll_fallback_media);
                boolean z3 = false;
                if (roundedFrameLayout2 != null) {
                    roundedFrameLayout2.setVisibility(0);
                }
                final AdImageView adImageView2 = (AdImageView) findViewById2.findViewById(R.id.inter_iv_fallback_media);
                if (adImageView2 != null) {
                    sg.bigo.ads.cp.a aVar2 = (sg.bigo.ads.cp.a) bVar2;
                    String bb2 = aVar2.bb();
                    if (TextUtils.isEmpty(bb2) || !URLUtil.isNetworkUrl(bb2)) {
                        if (aVar2.aZ()) {
                            String b3 = sg.bigo.ads.an.o.b(context, aVar2.aV());
                            if (!TextUtils.isEmpty(b3)) {
                                str9 = b3;
                                z3 = true;
                            }
                        }
                        str9 = null;
                    } else {
                        str9 = bb2;
                    }
                    if (!TextUtils.isEmpty(str9)) {
                        final ArrayList arrayList2 = new ArrayList();
                        if (!z3) {
                            this.B.a(bVar2, 4, str9, -1);
                        }
                        sg.bigo.ads.bj.g gVar2 = new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ad.interstitial.q.6
                            @Override // sg.bigo.ads.bj.g
                            public final void a(int i5, @NonNull String str15, @Nullable sg.bigo.ads.bj.f fVar2) {
                                q.this.B.a(bVar2, 4, str9, -1, i5, str15);
                            }

                            @Override // sg.bigo.ads.bj.g
                            public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar2) {
                                q.this.B.b(bVar2, 4, str9, -1);
                            }
                        };
                        adImageView2.a(gVar2);
                        arrayList2.add(gVar2);
                        a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.7
                            @Override // java.lang.Runnable
                            public final void run() {
                                arrayList2.clear();
                                adImageView2.a();
                            }
                        });
                        roundedFrameLayout2.setStrokeWidth(sg.bigo.ads.common.utils.f.a(context, 1));
                        roundedFrameLayout2.setStrokeColor(sg.bigo.ads.common.utils.r.b("#08000000", -7829368));
                        adImageView2.a(str9, bVar2.am());
                        a aVar3 = this.z;
                        a(findViewById2, adImageView2, 5, bVar, aVar3.c ? bVar : aVar3.r);
                    }
                }
            }
            if (strArr3 != null) {
                String[] strArr4 = strArr3;
                if (strArr4.length > 0 && autoNextLineLinearLayout != null) {
                    a(context, findViewById2, bVar, autoNextLineLinearLayout, strArr4);
                }
            }
            if (findViewById8 != null) {
                a aVar4 = this.z;
                a(findViewById2, findViewById8, 27, bVar, aVar4.b ? bVar : aVar4.r);
            }
            if (findViewById9 != null) {
                a aVar5 = this.z;
                a(findViewById2, findViewById9, 27, bVar, aVar5.b ? bVar : aVar5.r);
            }
            a aVar6 = this.z;
            a(findViewById2, findViewById2, 18, bVar, aVar6.b ? bVar : aVar6.r);
            return a3;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NonNull
    private FrameLayout a(@NonNull Context context, @NonNull View view, boolean z) {
        int i;
        FrameLayout frameLayout = new FrameLayout(context);
        int i2 = this.A.b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, z ? -1 : -2);
        if (i2 == 1) {
            int a2 = sg.bigo.ads.common.utils.f.a(context, 10);
            layoutParams.topMargin = a2;
            layoutParams.bottomMargin = a2;
            layoutParams.leftMargin = a2;
            layoutParams.rightMargin = a2;
            i = 17;
        } else {
            layoutParams.topMargin = sg.bigo.ads.common.utils.f.a(context, 40);
            i = 80;
        }
        layoutParams.gravity = i;
        frameLayout.addView(view, layoutParams);
        String str = this.b.T().f;
        if (sg.bigo.ads.common.utils.r.b((CharSequence) str)) {
            sg.bigo.ads.common.view.c.a(context, frameLayout, new sg.bigo.ads.common.view.c(context, str));
        }
        return frameLayout;
    }

    @NonNull
    private static LinearLayout a(Context context, View view, int i) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(sg.bigo.ads.common.utils.r.b("#F0F3F4", -7829368));
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.bigo_ad_btn_close);
        imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_ic_close_gray_light));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.f.a(context, 24), sg.bigo.ads.common.utils.f.a(context, 24), 21);
        layoutParams.rightMargin = sg.bigo.ads.common.utils.f.a(context, 20);
        frameLayout.addView(imageView, layoutParams);
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.f.a(context, 48)));
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, i));
        return linearLayout;
    }

    private void a(@NonNull Context context, View view, sg.bigo.ads.y.b bVar, @NonNull AutoNextLineLinearLayout autoNextLineLinearLayout, @NonNull String[] strArr) {
        for (String str : strArr) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    TextView textView = new TextView(context);
                    textView.setText(str);
                    textView.setTextColor(sg.bigo.ads.common.utils.r.b("#5F6367", -7829368));
                    textView.setTextSize(13.0f);
                    textView.setPadding(sg.bigo.ads.common.utils.f.a(context, 12), sg.bigo.ads.common.utils.f.a(context, 5), sg.bigo.ads.common.utils.f.a(context, 12), sg.bigo.ads.common.utils.f.a(context, 5));
                    textView.setGravity(17);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(-1);
                    gradientDrawable.setStroke(sg.bigo.ads.common.utils.f.a(context, 1), sg.bigo.ads.common.utils.r.b("#DBDDE0", -7829368));
                    gradientDrawable.setCornerRadius(sg.bigo.ads.common.utils.f.a(context, 14));
                    textView.setBackground(gradientDrawable);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, sg.bigo.ads.common.utils.f.a(context, 28));
                    layoutParams.topMargin = sg.bigo.ads.common.utils.f.a(context, 12);
                    layoutParams.rightMargin = sg.bigo.ads.common.utils.f.a(context, 12);
                    a(view, textView, 27, bVar, bVar);
                    autoNextLineLinearLayout.addView(textView, layoutParams);
                }
            } catch (Exception unused) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [sg.bigo.ads.core.adview.h] */
    /* JADX WARN: Type inference failed for: r0v3, types: [sg.bigo.ads.core.adview.h] */
    /* JADX WARN: Type inference failed for: r18v0, types: [sg.bigo.ads.ad.interstitial.q] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.view.ViewGroup] */
    private void a(@NonNull Context context, ViewGroup viewGroup, sg.bigo.ads.y.b bVar, @NonNull final sg.bigo.ads.api.core.b bVar2, @NonNull String[] strArr) {
        String[] strArr2;
        ?? r6;
        String[] strArr3 = strArr;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        final ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < strArr3.length) {
            final String str = strArr3[i];
            if (TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) {
                strArr2 = strArr3;
                r6 = linearLayout;
            } else {
                final int a2 = sg.bigo.ads.common.utils.f.a(context, 200);
                final RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
                roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.f.a(context, 4));
                roundedFrameLayout.setStrokeWidth(sg.bigo.ads.common.utils.f.a(context, 1));
                roundedFrameLayout.setStrokeColor(sg.bigo.ads.common.utils.r.b("#08000000", -7829368));
                final AdImageView adImageView = new AdImageView(context);
                adImageView.setBackgroundColor(sg.bigo.ads.common.utils.r.b("#FFE1E1E6", -7829368));
                adImageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_icon_default_only_icon));
                this.B.a(bVar2, 2, str, i);
                LinearLayout linearLayout2 = linearLayout;
                final int i2 = i;
                sg.bigo.ads.bj.g gVar = new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ad.interstitial.q.8
                    @Override // sg.bigo.ads.bj.g
                    public final void a(int i3, @NonNull String str2, @Nullable sg.bigo.ads.bj.f fVar) {
                        q.this.B.a(bVar2, 2, str, i2, i3, str2);
                    }

                    @Override // sg.bigo.ads.bj.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
                        ViewGroup.LayoutParams layoutParams;
                        adImageView.setBackground(null);
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        if (width > 0 && height > 0 && (layoutParams = roundedFrameLayout.getLayoutParams()) != null) {
                            layoutParams.width = (width * a2) / height;
                        }
                        adImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        q.this.B.b(bVar2, 2, str, i2);
                    }
                };
                adImageView.a(gVar);
                arrayList.add(gVar);
                a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        adImageView.a();
                    }
                });
                adImageView.a(str, bVar2.am());
                roundedFrameLayout.addView(adImageView, new FrameLayout.LayoutParams(-1, -1));
                a aVar = this.z;
                a(viewGroup, roundedFrameLayout, 5, bVar, aVar.c ? bVar : aVar.r);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(sg.bigo.ads.common.utils.f.a(context, 100), a2);
                layoutParams.leftMargin = i == 0 ? sg.bigo.ads.common.utils.f.a(context, 20) : sg.bigo.ads.common.utils.f.a(context, 12);
                strArr2 = strArr;
                if (i + 1 == strArr2.length) {
                    layoutParams.rightMargin = sg.bigo.ads.common.utils.f.a(context, 20);
                }
                r6 = linearLayout2;
                r6.addView(roundedFrameLayout, layoutParams);
            }
            a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.10
                @Override // java.lang.Runnable
                public final void run() {
                    arrayList.clear();
                }
            });
            i++;
            strArr3 = strArr2;
            linearLayout = r6;
        }
        LinearLayout linearLayout3 = linearLayout;
        a aVar2 = this.z;
        a(viewGroup, viewGroup, 18, bVar, aVar2.d ? bVar : aVar2.r);
        viewGroup.addView(linearLayout3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull View view, @NonNull View view2, int i, @NonNull sg.bigo.ads.y.b bVar, @Nullable sg.bigo.ads.core.adview.h hVar) {
        a aVar = this.z;
        aVar.a(bVar, view, view2, i, aVar.a(bVar, hVar));
    }

    private void a(@NonNull Runnable runnable) {
        this.Q.add(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x01f2 A[LOOP:0: B:2:0x0009->B:31:0x01f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ef A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void a(q qVar, final Context context, final sg.bigo.ads.y.b bVar, final sg.bigo.ads.api.core.b bVar2) {
        int i;
        q qVar2;
        String[] e2;
        String str;
        boolean z;
        sg.bigo.ads.dm.e a2;
        String str2;
        q qVar3 = qVar;
        int i2 = 0;
        while (!qVar3.J) {
            if (i2 > 10) {
                qVar3.a(bVar2);
                return;
            }
            int i3 = qVar3.M;
            List<Integer> list = qVar3.t;
            if (list == null || i3 >= list.size()) {
                qVar3.a(bVar2);
                return;
            }
            Integer num = list.get(i3);
            qVar3.M++;
            int intValue = num.intValue();
            View view = null;
            if (intValue == 1) {
                String p = bVar2.p();
                if (TextUtils.isEmpty(p) || !URLUtil.isNetworkUrl(p)) {
                    p = null;
                }
                if (TextUtils.isEmpty(p)) {
                    String o = bVar2.o();
                    if (!TextUtils.isEmpty(o)) {
                        str = "https://play.google.com/store/apps/details?id=".concat(String.valueOf(o));
                        z = true;
                        if (!TextUtils.isEmpty(str) || (a2 = sg.bigo.ads.dm.e.a(context)) == null) {
                            i = i2;
                        } else {
                            qVar.a(a2, a2, 28, bVar, bVar);
                            final boolean z2 = z;
                            a2.setWebViewClient(new sg.bigo.ads.dm.d() { // from class: sg.bigo.ads.ad.interstitial.q.13
                                boolean a = false;

                                @Override // sg.bigo.ads.dm.d
                                public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                                    sg.bigo.ads.da.b.a(3002, 10105, "[MidPage] The render process was gone.");
                                    if (this.a) {
                                        return;
                                    }
                                    this.a = true;
                                    q.a(q.this, context, bVar, bVar2, 1);
                                    q.this.B.a(bVar2, z2, -1, "onRenderProcessGone");
                                }

                                @Override // sg.bigo.ads.dm.d, android.webkit.WebViewClient
                                public final void onPageFinished(WebView webView, String str3) {
                                    super.onPageFinished(webView, str3);
                                    if (this.a) {
                                        return;
                                    }
                                    this.a = true;
                                    q.this.a(1, z2);
                                    e eVar = q.this.B;
                                    sg.bigo.ads.api.core.b bVar3 = bVar2;
                                    boolean z3 = z2;
                                    if (eVar.b || eVar.a <= 0) {
                                        return;
                                    }
                                    eVar.b = true;
                                    sg.bigo.ads.da.b.a(bVar3, e.a(1, z3), 3, (String) null, SystemClock.elapsedRealtime() - eVar.a, false, 0, (String) null);
                                }

                                @Override // android.webkit.WebViewClient
                                public final void onPageStarted(WebView webView, String str3, Bitmap bitmap) {
                                    super.onPageStarted(webView, str3, bitmap);
                                }

                                @Override // sg.bigo.ads.dm.d, android.webkit.WebViewClient
                                public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                                    String charSequence;
                                    e eVar;
                                    sg.bigo.ads.api.core.b bVar3;
                                    int i4;
                                    boolean z3;
                                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                                    if (this.a) {
                                        return;
                                    }
                                    this.a = true;
                                    q.a(q.this, context, bVar, bVar2, 1);
                                    if (webResourceError == null) {
                                        eVar = q.this.B;
                                        bVar3 = bVar2;
                                        z3 = z2;
                                        i4 = -1;
                                        charSequence = "onReceivedError";
                                    } else {
                                        CharSequence description = webResourceError.getDescription();
                                        e eVar2 = q.this.B;
                                        sg.bigo.ads.api.core.b bVar4 = bVar2;
                                        boolean z4 = z2;
                                        int errorCode = webResourceError.getErrorCode();
                                        charSequence = description == null ? POBCommonConstants.NULL_VALUE : description.toString();
                                        eVar = eVar2;
                                        bVar3 = bVar4;
                                        i4 = errorCode;
                                        z3 = z4;
                                    }
                                    eVar.a(bVar3, z3, i4, charSequence);
                                }

                                @Override // android.webkit.WebViewClient
                                public final boolean shouldOverrideUrlLoading(WebView webView, String str3) {
                                    return true;
                                }
                            });
                            e eVar = qVar3.B;
                            if (eVar.a <= 0) {
                                eVar.a = SystemClock.elapsedRealtime();
                                i = i2;
                                str2 = str;
                                sg.bigo.ads.da.b.a(bVar2, e.a(1, z), 1, (String) null, 0L, false, 0, (String) null);
                            } else {
                                i = i2;
                                str2 = str;
                            }
                            a2.loadUrl(str2);
                            view = a(context, a2, -2);
                        }
                    }
                }
                str = p;
                z = false;
                if (TextUtils.isEmpty(str)) {
                }
                i = i2;
            } else {
                i = i2;
                if (intValue == 2) {
                    b.d r = bVar2.r();
                    if (r != null && (e2 = r.e()) != null && e2.length > 0 && (view = qVar3.a(context, bVar, bVar2, true)) != null) {
                        qVar3.a(2, false);
                    }
                } else {
                    if (intValue == 3) {
                        final String q = bVar2.q();
                        if (!TextUtils.isEmpty(q) && URLUtil.isNetworkUrl(q)) {
                            final ImageView imageView = new ImageView(context);
                            FrameLayout frameLayout = new FrameLayout(context);
                            frameLayout.setBackgroundColor(-1);
                            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1, 17));
                            RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
                            roundedFrameLayout.setId(R.id.bigo_ad_btn_close);
                            roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.f.a(context, 12));
                            View view2 = new View(context);
                            view2.setBackgroundColor(sg.bigo.ads.common.utils.r.b("#33000000", -7829368));
                            roundedFrameLayout.addView(view2, new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.f.a(context, 24), sg.bigo.ads.common.utils.f.a(context, 24), 17));
                            ImageView imageView2 = new ImageView(context);
                            imageView2.setBackground(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_ic_close));
                            roundedFrameLayout.addView(imageView2, new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.f.a(context, 12), sg.bigo.ads.common.utils.f.a(context, 12), 17));
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.f.a(context, 24), sg.bigo.ads.common.utils.f.a(context, 24), 53);
                            layoutParams.topMargin = sg.bigo.ads.common.utils.f.a(context, 18);
                            layoutParams.rightMargin = sg.bigo.ads.common.utils.f.a(context, 22);
                            frameLayout.addView(roundedFrameLayout, layoutParams);
                            final FrameLayout b2 = qVar3.b(context, frameLayout, true);
                            final FrameLayout frameLayout2 = new FrameLayout(context);
                            frameLayout2.addView(b2, new FrameLayout.LayoutParams(-1, -2, qVar3.A.b != 1 ? 80 : 17));
                            qVar3.B.a(bVar2, 3, q, 100);
                            sg.bigo.ads.bj.e.a(bVar.b.e, q, bVar2.am(), new sg.bigo.ads.bj.g() { // from class: sg.bigo.ads.ad.interstitial.q.11
                                @Override // sg.bigo.ads.bj.g
                                public final void a(int i4, @NonNull String str3, @Nullable sg.bigo.ads.bj.f fVar) {
                                    q.a(q.this, context, bVar, bVar2, 2);
                                    q.this.B.a(bVar2, 3, q, 100, i4, str3);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r13v2, types: [sg.bigo.ads.core.adview.h] */
                                /* JADX WARN: Type inference failed for: r13v4, types: [sg.bigo.ads.core.adview.h] */
                                @Override // sg.bigo.ads.bj.g
                                public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
                                    final int width = bitmap.getWidth();
                                    final int height = bitmap.getHeight();
                                    frameLayout2.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.11.1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i4;
                                            int i5;
                                            int width2 = frameLayout2.getWidth();
                                            int height2 = frameLayout2.getHeight();
                                            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                                            if (width2 <= 0 || height2 <= 0 || (i4 = width) <= 0 || (i5 = height) <= 0) {
                                                layoutParams2.width = -1;
                                                layoutParams2.height = -1;
                                                return;
                                            }
                                            if ((i4 * 1.0f) / i5 > (width2 * 1.0f) / height2) {
                                                layoutParams2.width = width2;
                                                layoutParams2.height = (width2 * i5) / i4;
                                            } else {
                                                layoutParams2.width = (i4 * height2) / i5;
                                                layoutParams2.height = height2;
                                            }
                                            imageView.requestLayout();
                                        }
                                    });
                                    imageView.setImageBitmap(bitmap);
                                    q qVar4 = q.this;
                                    FrameLayout frameLayout3 = b2;
                                    ImageView imageView3 = imageView;
                                    sg.bigo.ads.y.b bVar3 = bVar;
                                    a aVar = qVar4.z;
                                    qVar4.a(frameLayout3, imageView3, 5, bVar3, aVar.c ? bVar3 : aVar.r);
                                    q qVar5 = q.this;
                                    FrameLayout frameLayout4 = b2;
                                    sg.bigo.ads.y.b bVar4 = bVar;
                                    a aVar2 = qVar5.z;
                                    qVar5.a(frameLayout4, frameLayout4, 18, bVar4, aVar2.d ? bVar4 : aVar2.r);
                                    q.this.a(3, false);
                                    q.this.B.b(bVar2, 3, q, 100);
                                }
                            });
                            qVar2 = qVar;
                            view = frameLayout2;
                        }
                        qVar2 = qVar;
                    } else {
                        if (intValue == 4) {
                            qVar2 = qVar;
                            view = qVar2.a(context, bVar, bVar2, false);
                            if (view != null) {
                                qVar2.a(4, false);
                            }
                        }
                        qVar2 = qVar;
                    }
                    if (view == null) {
                        qVar2.I = view;
                        return;
                    } else {
                        i2 = i + 1;
                        qVar3 = qVar2;
                    }
                }
            }
            qVar2 = qVar3;
            if (view == null) {
            }
        }
    }

    static /* synthetic */ void a(q qVar, final Context context, final sg.bigo.ads.y.b bVar, final sg.bigo.ads.api.core.b bVar2, int i) {
        qVar.r = i;
        sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.15
            @Override // java.lang.Runnable
            public final void run() {
                q.a(q.this, context, bVar, bVar2);
            }
        });
    }

    @UiThread
    private void a(sg.bigo.ads.api.core.b bVar) {
        this.j = true;
        sg.bigo.ads.da.b.a(bVar, "0", e.a(this.q, this.p), this.r);
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [sg.bigo.ads.core.adview.h] */
    /* JADX WARN: Type inference failed for: r0v12, types: [sg.bigo.ads.core.adview.h] */
    static /* synthetic */ boolean a(q qVar) {
        String str;
        final Context context = qVar.a;
        final sg.bigo.ads.y.b bVar = qVar.b;
        final sg.bigo.ads.api.core.b bVar2 = qVar.c;
        if (qVar.a(context, bVar, bVar2, qVar.d)) {
            final int i = qVar.q;
            final boolean z = qVar.p;
            View view = qVar.I;
            boolean z2 = qVar.J;
            boolean z3 = qVar.j;
            if (z2 && view != null) {
                if (qVar.i()) {
                    boolean z4 = qVar.q == 3;
                    final FrameLayout a2 = qVar.a(context, qVar.b(context, view, z4), z4);
                    qVar.K = true;
                    if (bVar2 instanceof sg.bigo.ads.cp.a) {
                        ((sg.bigo.ads.cp.a) bVar2).g(e.a(i, z));
                    }
                    sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.18
                        @Override // java.lang.Runnable
                        public final void run() {
                            q qVar2 = q.this;
                            Context context2 = context;
                            sg.bigo.ads.y.b bVar3 = bVar;
                            sg.bigo.ads.api.core.b bVar4 = bVar2;
                            FrameLayout frameLayout = a2;
                            if (!qVar2.l) {
                                qVar2.a(context2, bVar3, bVar4, frameLayout);
                                qVar2.f = frameLayout;
                                return;
                            }
                            FrameLayout frameLayout2 = qVar2.g;
                            if (frameLayout2 != null) {
                                frameLayout2.removeAllViews();
                                qVar2.a(frameLayout);
                                frameLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                            }
                            qVar2.f = frameLayout2;
                            qVar2.l = false;
                            if ((bVar4 instanceof sg.bigo.ads.cp.a) && qVar2.s == 0) {
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                qVar2.s = elapsedRealtime;
                                ((sg.bigo.ads.cp.a) bVar4).b(elapsedRealtime);
                            }
                            sg.bigo.ads.da.b.a(bVar4, "1", e.a(qVar2.q, qVar2.p), qVar2.r);
                        }
                    });
                }
                return true;
            }
            if (z3) {
                str = "Failed to show mid page due to unavailable.";
            } else {
                if (!z2 && view != null) {
                    if (qVar.i()) {
                        final FrameLayout frameLayout = new FrameLayout(context);
                        View a3 = sg.bigo.ads.common.utils.a.a(context, qVar.o ? R.layout.bigo_ad_layout_interstitial_mid_page_loading_view_landscape : R.layout.bigo_ad_layout_interstitial_mid_page_loading_view, null, false);
                        if (a3 != null) {
                            qVar.l = true;
                            FrameLayout a4 = qVar.a(context, (View) qVar.b(context, a(context, a3, -1), true), true);
                            frameLayout.addView(a4, new FrameLayout.LayoutParams(-1, -1));
                            a aVar = qVar.z;
                            qVar.a(a3, a3, 18, bVar, aVar.b ? bVar : aVar.r);
                            a aVar2 = qVar.z;
                            qVar.a(a4, a4, 18, bVar, aVar2.b ? bVar : aVar2.r);
                            qVar.g = frameLayout;
                            if (bVar2 instanceof sg.bigo.ads.cp.a) {
                                ((sg.bigo.ads.cp.a) bVar2).g(6);
                            }
                            qVar.q = 5;
                            sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.21
                                @Override // java.lang.Runnable
                                public final void run() {
                                    q.this.a(context, bVar, bVar2, frameLayout);
                                }
                            });
                        }
                    }
                    return true;
                }
                str = "Failed to show mid page due to unknown reason.";
            }
            sg.bigo.ads.bn.a.a(0, "InterstitialMidPageRenderer", str);
        }
        return false;
    }

    @NonNull
    private FrameLayout b(@NonNull Context context, @NonNull View view, boolean z) {
        int i = this.A.b;
        RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
        if (i == 1) {
            roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.f.a(context, 12));
        } else {
            roundedFrameLayout.a(sg.bigo.ads.common.utils.f.a(context, 12), sg.bigo.ads.common.utils.f.a(context, 12), sg.bigo.ads.common.utils.f.a(context, 0), sg.bigo.ads.common.utils.f.a(context, 0));
        }
        roundedFrameLayout.addView(view, new FrameLayout.LayoutParams(-1, z ? -1 : -2));
        return roundedFrameLayout;
    }

    static /* synthetic */ void b(q qVar) {
        qVar.v = null;
        qVar.w = null;
    }

    private void h() {
        Runnable runnable;
        if (this.y.a) {
            if ((this.K || this.l) && this.n && (runnable = this.H) != null) {
                runnable.run();
                this.H = null;
            }
        }
    }

    private boolean i() {
        return (!this.i || this.K || this.k) ? false : true;
    }

    final void a() {
        if (this.P != null || this.L <= 0) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.12
            @Override // java.lang.Runnable
            public final void run() {
                q qVar = q.this;
                qVar.j = true;
                qVar.g();
            }
        };
        this.P = runnable;
        sg.bigo.ads.bh.d.a(2, runnable, this.L);
    }

    final void a(int i, boolean z) {
        this.J = true;
        this.q = i;
        this.p = z;
        if (this.l) {
            sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.14
                @Override // java.lang.Runnable
                public final void run() {
                    q.a(q.this);
                }
            });
        }
    }

    final void a(long j) {
        Runnable runnable = this.v;
        this.N = SystemClock.elapsedRealtime();
        sg.bigo.ads.bh.d.a(runnable);
        sg.bigo.ads.bh.d.a(2, runnable, j);
    }

    @UiThread
    final void a(@NonNull final Context context, @NonNull final sg.bigo.ads.y.b bVar, final sg.bigo.ads.api.core.b bVar2, @NonNull final FrameLayout frameLayout) {
        Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.22
            @Override // java.lang.Runnable
            public final void run() {
                q qVar = q.this;
                qVar.D = false;
                boolean a2 = qVar.a(frameLayout);
                if (bVar2 instanceof sg.bigo.ads.cp.a) {
                    q qVar2 = q.this;
                    if (qVar2.s == 0) {
                        qVar2.s = SystemClock.elapsedRealtime();
                        ((sg.bigo.ads.cp.a) bVar2).b(q.this.s);
                    }
                }
                sg.bigo.ads.api.core.b bVar3 = bVar2;
                q qVar3 = q.this;
                sg.bigo.ads.da.b.a(bVar3, "1", e.a(qVar3.q, qVar3.p), q.this.r);
                Context context2 = context;
                if (context2 instanceof Activity) {
                    Activity activity = (Activity) context2;
                    if (activity.isFinishing() || activity.isDestroyed()) {
                        return;
                    }
                }
                AlertDialog create = new AlertDialog.Builder(context).setCancelable(!a2).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: sg.bigo.ads.ad.interstitial.q.22.1
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        q qVar4 = q.this;
                        qVar4.k = true;
                        qVar4.l = false;
                    }
                }).create();
                create.requestWindowFeature(1);
                create.show();
                Window window = create.getWindow();
                window.getDecorView().setPadding(0, 0, 0, 0);
                window.setGravity(17);
                window.setContentView(frameLayout);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.height = -1;
                window.setAttributes(attributes);
                q.this.h = create;
                frameLayout.setVisibility(4);
                frameLayout.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.22.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass22 anonymousClass22 = AnonymousClass22.this;
                        int i = q.this.A.b;
                        frameLayout.setVisibility(0);
                        if (i == 1) {
                            sg.bigo.ads.ad.interstitial.c.d(frameLayout);
                        } else {
                            sg.bigo.ads.ad.interstitial.c.a(frameLayout, 400L, new b.d());
                        }
                    }
                });
                q qVar4 = q.this;
                Runnable runnable2 = qVar4.e;
                if (runnable2 != null) {
                    runnable2.run();
                    qVar4.e = null;
                    qVar4.n = true;
                }
            }
        };
        c cVar = this.C;
        if (cVar != null) {
            this.D = cVar.a(runnable);
        } else {
            runnable.run();
        }
    }

    final boolean a(Context context, sg.bigo.ads.y.b bVar, sg.bigo.ads.api.core.b bVar2, sg.bigo.ads.ai.o oVar) {
        return (context == null || bVar == null || bVar2 == null || oVar == null || this.K) ? false : true;
    }

    @UiThread
    final boolean a(@NonNull FrameLayout frameLayout) {
        int i;
        final View findViewById = frameLayout.findViewById(R.id.bigo_ad_btn_cta);
        if (findViewById != null && this.z.e) {
            sg.bigo.ads.ad.interstitial.c.e(findViewById);
            a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.2
                @Override // java.lang.Runnable
                public final void run() {
                    findViewById.clearAnimation();
                }
            });
        }
        final View findViewById2 = frameLayout.findViewById(R.id.bigo_ad_btn_close);
        if (findViewById2 == null) {
            return false;
        }
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.q.19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.this.d();
            }
        });
        sg.bigo.ads.ai.o oVar = this.d;
        if (oVar != null) {
            i = oVar.a("mid_page.force_staying_time");
            if (i < 0 || i > 5) {
                i = 3;
            }
        } else {
            i = 0;
        }
        if (i == 0) {
            findViewById2.setVisibility(0);
            return true;
        }
        findViewById2.setVisibility(4);
        sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.20
            @Override // java.lang.Runnable
            public final void run() {
                findViewById2.setVisibility(0);
            }
        }, i * 1000);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((-1) == r6.E) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z;
        sg.bigo.ads.ai.o oVar = this.d;
        if (oVar != null) {
            z = true;
            if (oVar.a("endpage.is_endpage", 1) == 0) {
                if (!this.d.c("layer.is_show_layer")) {
                }
            }
        }
        z = false;
        if (this.m && !z) {
            sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.16
                @Override // java.lang.Runnable
                public final void run() {
                    q.this.e();
                }
            });
        } else {
            if (!this.O || this.u <= 0 || this.v == null) {
                return;
            }
            this.O = false;
            a(this.u);
        }
    }

    public final void c() {
        Runnable runnable = this.v;
        if (this.O || this.u <= 0 || runnable == null) {
            return;
        }
        this.O = true;
        sg.bigo.ads.bh.d.a(runnable);
        this.u -= SystemClock.elapsedRealtime() - this.N;
    }

    public final void d() {
        int i = this.A.b;
        final FrameLayout frameLayout = this.l ? this.g : this.f;
        if (frameLayout == null) {
            e();
            return;
        }
        b.d dVar = new b.d() { // from class: sg.bigo.ads.ad.interstitial.q.17
            @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                frameLayout.clearAnimation();
                frameLayout.setVisibility(8);
                q.this.e();
            }
        };
        if (i == 1) {
            sg.bigo.ads.ad.interstitial.c.c(frameLayout, dVar);
        } else {
            sg.bigo.ads.ad.interstitial.c.b(frameLayout, dVar);
        }
    }

    final void e() {
        AlertDialog alertDialog = this.h;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.h = null;
            f();
            h();
        }
        g();
    }

    final void f() {
        Runnable runnable;
        if (!this.n || (runnable = this.G) == null) {
            return;
        }
        runnable.run();
        this.e = null;
    }

    final void g() {
        Iterator<Runnable> it = this.Q.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.Q.clear();
        Runnable runnable = this.v;
        if (runnable != null) {
            sg.bigo.ads.bh.d.a(runnable);
        }
        Runnable runnable2 = this.P;
        if (runnable2 != null) {
            sg.bigo.ads.bh.d.a(runnable2);
        }
        this.v = null;
        this.w = null;
        this.k = true;
        this.f = null;
    }
}
