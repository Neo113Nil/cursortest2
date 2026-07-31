package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.Bundle;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes12.dex */
public class e extends c {
    protected static final String aq = "network_name";
    protected static final String ar = "ad_format";
    protected static final String as = "BANNER";
    protected static final String at = "MREC";
    public static final String au = "NATIVE";
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int aa;
    boolean ab;
    public String ac;
    boolean ad;
    boolean ae;
    ScheduledFuture<?> af;
    WeakReference<Activity> ag;
    boolean ah;
    boolean ai;
    long aj;
    long ak;
    float al;
    String am;
    public BannerFinder.a an;
    String ao;
    String ap;
    protected d av;

    public e(String[] strArr, String str, int i, String str2, Bundle bundle, String str3) {
        this(strArr, str, i, str2, bundle, str3, BrandSafetyUtils.AdType.BANNER);
    }

    public e(String str, long j) {
        this(str, j, BrandSafetyUtils.AdType.BANNER);
    }

    protected e(String[] strArr, String str, int i, String str2, Bundle bundle, String str3, BrandSafetyUtils.AdType adType) {
        super(strArr, i, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED, adType);
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = 0;
        this.ab = false;
        this.ac = "";
        this.ad = false;
        this.ae = false;
        this.ah = false;
        this.ai = false;
        this.aj = 0L;
        this.ak = 0L;
        this.al = 0.0f;
        this.am = null;
        this.an = null;
        this.ao = null;
        this.ap = null;
        this.av = null;
        this.am = str2;
        if (str3 != null) {
            this.L = str3;
        }
    }

    public e(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        this(str, str2, str3, screenShotOrientation, str4, str5, BrandSafetyUtils.AdType.BANNER);
    }

    protected e(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5, BrandSafetyUtils.AdType adType) {
        super(str, str2, str3, screenShotOrientation, str4, adType);
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = 0;
        this.ab = false;
        this.ac = "";
        this.ad = false;
        this.ae = false;
        this.ah = false;
        this.ai = false;
        this.aj = 0L;
        this.ak = 0L;
        this.al = 0.0f;
        this.am = null;
        this.an = null;
        this.ao = null;
        this.ap = null;
        this.av = null;
        this.q = str5;
    }

    protected e(String str, long j, BrandSafetyUtils.AdType adType) {
        super(str, j, adType);
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = 0;
        this.ab = false;
        this.ac = "";
        this.ad = false;
        this.ae = false;
        this.ah = false;
        this.ai = false;
        this.aj = 0L;
        this.ak = 0L;
        this.al = 0.0f;
        this.am = null;
        this.an = null;
        this.ao = null;
        this.ap = null;
        this.av = null;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public String toString() {
        k m = m();
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" webView: ");
        sb.append(this.K);
        sb.append(" isActive: ");
        sb.append(this.ab);
        sb.append(" hash: ");
        sb.append(m != null ? m.a : null);
        sb.append(" url: ");
        sb.append(e());
        sb.append(" isClicked: ");
        sb.append(d());
        sb.append(" touch timestamp: ");
        sb.append(v());
        sb.append(" activity address: ");
        sb.append(this.B);
        sb.append(" activity class name: ");
        sb.append(this.C);
        sb.append(" filename: ");
        sb.append(m != null ? m.b : null);
        sb.append(" type: ");
        sb.append(this.p);
        sb.append(", eventId: ");
        sb.append(this.L);
        sb.append(", requestNoSamplingReceived: ");
        sb.append(this.O);
        sb.append(", onVideoCompletedEventHasBeenTriggered: ");
        sb.append(i() != null ? Boolean.valueOf(i().k) : POBCommonConstants.NULL_VALUE);
        return sb.toString();
    }

    public boolean H() {
        if (this.A != null && this.A.containsKey("network_name")) {
            return this.A.getString("network_name").contains("NATIVE");
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void f(boolean z) {
        super.f(z);
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = 0;
        this.ab = false;
        this.ac = "";
        this.ad = false;
        this.ae = false;
        this.ai = false;
        if (z) {
            this.al = 0.0f;
        }
        this.am = null;
        this.T = false;
        BannerFinder.a aVar = this.an;
        if (aVar != null && aVar.d != null) {
            this.an.d.cancel(false);
        }
        this.an = null;
        this.ag = null;
        this.V = false;
        this.ao = null;
        this.ap = null;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void C() {
        super.C();
        this.v = null;
        this.ag = null;
        this.am = null;
        this.ab = false;
        this.ah = false;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public void a(d dVar, Bundle bundle, int i) {
        super.a(dVar, bundle, i);
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        String[] a = b.a(foregroundActivity);
        if (foregroundActivity != null) {
            this.C = a[0];
            this.B = a[1];
        }
        this.v = CreativeInfoManager.c(bundle.getString("network_name"));
        this.ag = new WeakReference<>(BannerFinder.a(bundle));
        this.am = BrandSafetyUtils.c().name().toLowerCase();
        this.ab = true;
        this.ah = true;
    }

    public boolean I() {
        if (this.A != null && this.A.containsKey("ad_format")) {
            return this.A.getString("ad_format").equals("MREC");
        }
        return false;
    }
}
