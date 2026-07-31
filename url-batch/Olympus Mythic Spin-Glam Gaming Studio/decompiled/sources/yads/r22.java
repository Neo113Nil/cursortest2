package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.internal.NativeProtocol;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdAssets;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes3.dex */
public final class r22 implements MediatedNativeAdapterListener {
    public static final /* synthetic */ KProperty[] q = {ra.a(r22.class, "nativeAdLoadManager", "getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", 0), ra.a(r22.class, "adQualityVerifierController", "getAdQualityVerifierController()Lcom/monetization/ads/base/quality/AdQualityVerifierController;", 0)};
    public final t8 a;
    public final yu2 b;
    public final wn1 c;
    public final co1 d;
    public final dp1 e;
    public final s41 f;
    public final Context g;
    public final qm2 h;
    public final qm2 i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final z21 l;
    public final cp1 m;
    public final jo1 n;
    public final xp1 o;
    public boolean p;

    public r22(Context context, t8 t8Var, yu2 yu2Var, x02 x02Var, km kmVar, wn1 wn1Var) {
        co1 co1Var = new co1();
        dp1 dp1Var = new dp1();
        s41 s41Var = new s41(wn1Var);
        this.a = t8Var;
        this.b = yu2Var;
        this.c = wn1Var;
        this.d = co1Var;
        this.e = dp1Var;
        this.f = s41Var;
        Context a = pz.a(context);
        this.g = a;
        this.h = new qm2(x02Var);
        this.i = new qm2(kmVar.d);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.j = linkedHashMap;
        this.k = new LinkedHashMap();
        z21 z21Var = new z21(a);
        this.l = z21Var;
        cp1 cp1Var = new cp1(a);
        this.m = cp1Var;
        this.n = new jo1(a, z21Var, cp1Var);
        this.o = new xp1(a, wn1Var, linkedHashMap);
    }

    public final void a(final MediatedNativeAd mediatedNativeAd, dq2 dq2Var) {
        Bitmap bitmap;
        qm2 qm2Var = this.h;
        KProperty[] kPropertyArr = q;
        KProperty kProperty = kPropertyArr[0];
        final x02 x02Var = (x02) qm2Var.a.get();
        qm2 qm2Var2 = this.i;
        KProperty kProperty2 = kPropertyArr[1];
        final r7 r7Var = (r7) qm2Var2.a.get();
        if (x02Var == null || r7Var == null) {
            return;
        }
        this.j.put("native_ad_type", dq2Var.b);
        this.c.c(this.j);
        this.k.putAll(MapsKt.mapOf(TuplesKt.to("title", mediatedNativeAd.getMediatedNativeAdAssets().getTitle())));
        this.e.getClass();
        MediatedNativeAdAssets mediatedNativeAdAssets = mediatedNativeAd.getMediatedNativeAdAssets();
        List<MediatedNativeAdImage> listOfNotNull = CollectionsKt.listOfNotNull((Object[]) new MediatedNativeAdImage[]{mediatedNativeAdAssets.getFavicon(), mediatedNativeAdAssets.getIcon(), mediatedNativeAdAssets.getImage()});
        this.m.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MediatedNativeAdImage mediatedNativeAdImage : listOfNotNull) {
            Drawable drawable = mediatedNativeAdImage.getDrawable();
            String url = mediatedNativeAdImage.getUrl();
            if (drawable != null && url.length() > 0) {
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                } else {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    if (intrinsicWidth <= 0) {
                        intrinsicWidth = 128;
                    }
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight > 0 ? intrinsicHeight : 128, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    bitmap = createBitmap;
                }
                if (bitmap != null) {
                    linkedHashMap.put(url, bitmap);
                }
            }
        }
        z21 z21Var = this.l;
        z21Var.getClass();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((k92) z21Var.c.getValue()).c.a((String) entry.getKey(), (Bitmap) entry.getValue());
        }
        jo1 jo1Var = this.n;
        ho1 ho1Var = new ho1() { // from class: yads.r22$$ExternalSyntheticLambda0
            @Override // yads.ho1
            public final void a(t8 t8Var) {
                r22.a(MediatedNativeAd.this, this, r7Var, x02Var, t8Var);
            }
        };
        cp1 cp1Var = jo1Var.b;
        cp1Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MediatedNativeAdImage mediatedNativeAdImage2 : listOfNotNull) {
            String url2 = mediatedNativeAdImage2.getUrl();
            int width = mediatedNativeAdImage2.getWidth();
            int height = mediatedNativeAdImage2.getHeight();
            if (url2.length() > 0 && (width <= 0 || height <= 0)) {
                Point point = cp1Var.a;
                linkedHashSet.add(new q31(point.x, point.y, url2, null, 120));
            }
        }
        jo1Var.a.a(linkedHashSet, new io1(jo1Var, mediatedNativeAd, dq2Var, ho1Var));
    }

    public final void b(MediatedNativeAd mediatedNativeAd, dq2 dq2Var) {
        MediatedAdapterInfo b;
        qm2 qm2Var = this.h;
        KProperty kProperty = q[0];
        x02 x02Var = (x02) qm2Var.a.get();
        if (x02Var != null) {
            tn1 tn1Var = this.c.o;
            String str = null;
            MediatedAdObject a = tn1Var != null ? tn1Var.c.a() : null;
            if (a == null) {
                boolean z = ob1.a;
                a(mediatedNativeAd, dq2Var);
                return;
            }
            tn1 tn1Var2 = this.c.o;
            if (tn1Var2 != null && (b = tn1Var2.c.b()) != null) {
                str = b.getNetworkName();
            }
            BuildersKt__Builders_commonKt.launch$default(x02Var.e, null, null, new vm(x02Var, a.getAd(), str, a.getInfo(), this.c.o, new q22(this), new p22(this, mediatedNativeAd, dq2Var), null), 3, null);
        }
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdClicked() {
        qm2 qm2Var = this.i;
        KProperty kProperty = q[1];
        r7 r7Var = (r7) qm2Var.a.get();
        if (r7Var != null && r7Var.b()) {
            ((y7) r7Var.h.getValue()).onAdClicked();
        }
        for (i02 i02Var : this.d.a.keySet()) {
            i02Var.a.b();
            i02Var.b.f.c();
        }
        this.c.a(this.j);
        a(this.g, fo2.r);
        for (i02 i02Var2 : this.d.a.keySet()) {
            i02Var2.getClass();
            boolean z = ob1.a;
            i02Var2.b.f.a();
        }
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdClosed() {
        for (i02 i02Var : this.d.a.keySet()) {
            i02Var.b.f.b.a(f1.d);
            i02Var.a.a();
        }
        qm2 qm2Var = this.i;
        KProperty kProperty = q[1];
        r7 r7Var = (r7) qm2Var.a.get();
        if (r7Var == null || !r7Var.b()) {
            return;
        }
        ((y7) r7Var.h.getValue()).onAdClosed();
        r7Var.a();
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdFailedToLoad(MediatedAdRequestError mediatedAdRequestError) {
        qm2 qm2Var = this.h;
        KProperty kProperty = q[0];
        if (((x02) qm2Var.a.get()) != null) {
            int code = mediatedAdRequestError.getCode();
            String description = mediatedAdRequestError.getDescription();
            mediatedAdRequestError.getDescription();
            wn1 wn1Var = this.c;
            wn1Var.a();
            wn1Var.b();
            wn1Var.a(wn1Var.n, MapsKt.mutableMapOf(TuplesKt.to("status", "error"), TuplesKt.to("error_code", Integer.valueOf(code)), TuplesKt.to(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION, description)));
            Context context = wn1Var.n;
            wn1Var.a(context);
            wn1Var.a(context, this);
        }
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdImpression() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.c.b(this.j);
        a(this.g, fo2.n);
        y4 a = this.f.a();
        Iterator it = this.d.a.keySet().iterator();
        while (it.hasNext()) {
            ((i02) it.next()).a.a(a);
        }
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdOpened() {
        for (i02 i02Var : this.d.a.keySet()) {
            i02Var.a.b();
            i02Var.b.f.b.b(f1.d);
        }
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAppInstallAdLoaded(MediatedNativeAd mediatedNativeAd) {
        b(mediatedNativeAd, dq2.d);
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onContentAdLoaded(MediatedNativeAd mediatedNativeAd) {
        b(mediatedNativeAd, dq2.c);
    }

    public final void a(Context context, fo2 fo2Var) {
        LinkedHashMap linkedHashMap = this.j;
        if (!TypeIntrinsics.isMutableMap(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        linkedHashMap2.put("event_type", fo2Var.b);
        LinkedHashMap linkedHashMap3 = this.k;
        if (linkedHashMap3 == null) {
            linkedHashMap2.put("ad_info", "undefined");
        } else {
            linkedHashMap2.put("ad_info", linkedHashMap3);
        }
        List list = this.a.h;
        if (list != null && (!list.isEmpty())) {
            linkedHashMap2.put("active_experiments", list);
        }
        Map map = this.a.u;
        if (map != null) {
            linkedHashMap2.putAll(map);
        }
        wn1 wn1Var = this.c;
        tn1 tn1Var = wn1Var.o;
        if (tn1Var != null) {
            er1 er1Var = tn1Var.b;
            String networkName = tn1Var.c.b().getNetworkName();
            so1 so1Var = wn1Var.f;
            so1Var.getClass();
            so1Var.a(context, fo2.q, er1Var, networkName, linkedHashMap2);
        }
    }

    public static final void a(MediatedNativeAd mediatedNativeAd, final r22 r22Var, r7 r7Var, x02 x02Var, t8 t8Var) {
        nq1 nq1Var = new nq1(mediatedNativeAd, r22Var.o, r7Var);
        l02 l02Var = new l02(new do1(r22Var.a, r22Var.c.o), new bo1(new ao1() { // from class: yads.r22$$ExternalSyntheticLambda1
            @Override // yads.ao1
            public final void a(i02 i02Var) {
                r22.a(r22.this, i02Var);
            }
        }, r22Var.b), nq1Var, new gp1(), new mq1());
        if (x02Var.r == l5.b) {
            return;
        }
        s12 s12Var = (s12) t8Var.t;
        zz1 zz1Var = x02Var.D;
        BuildersKt__Builders_commonKt.launch$default(zz1Var.d, null, null, new yz1(zz1Var, t8Var, s12Var, l02Var, x02Var.E, null), 3, null);
    }

    public static final void a(r22 r22Var, i02 i02Var) {
        r22Var.d.a.put(i02Var, null);
    }
}
