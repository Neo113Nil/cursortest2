package com.my.target.instreamads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.c3;
import com.my.target.common.BaseAd;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.LoudnessMetadata;
import com.my.target.common.models.ShoppableAdsItem;
import com.my.target.common.models.qrcta.QrCta;
import com.my.target.common.models.videomotion.Disclaimer;
import com.my.target.common.models.videomotion.Header;
import com.my.target.common.models.videomotion.VideoMotionData;
import com.my.target.common.models.videomotion.VideoMotionItem;
import com.my.target.dj;
import com.my.target.e7;
import com.my.target.eb;
import com.my.target.f6;
import com.my.target.f7;
import com.my.target.g6;
import com.my.target.g8;
import com.my.target.h8;
import com.my.target.hb;
import com.my.target.hj;
import com.my.target.ib;
import com.my.target.instreamads.postview.InstreamAdPostViewPlayer;
import com.my.target.instreamads.postview.models.CallToActionData;
import com.my.target.instreamads.qrcta.QrCtaPlayer;
import com.my.target.l3;
import com.my.target.l6;
import com.my.target.mi;
import com.my.target.o6;
import com.my.target.p;
import com.my.target.pg;
import com.my.target.q;
import com.my.target.r3;
import com.my.target.rf;
import com.my.target.s;
import com.my.target.t;
import com.my.target.tb;
import com.my.target.ue;
import com.my.target.vb;
import com.my.target.x;
import com.my.target.z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes15.dex */
public final class InstreamAd extends BaseAd {
    private final Context f;
    private final MenuFactory g;
    private final String h;
    public l6 i;
    public f6 j;
    private InstreamAdPlayer k;
    private InstreamAdVideoMotionPlayer l;
    private InstreamAdListener m;
    private int n;
    private boolean o;
    private float[] p;
    private float[] q;
    private float r;
    private float s;
    private QrCtaPlayer t;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class InstreamAdBanner {

        @Nullable
        public final String aboutCompany;

        @Nullable
        public final ImageData adChoicesIcon;

        @NonNull
        public final String advertisingLabel;

        @NonNull
        public final String ageRestrictions;
        public final boolean allowClose;
        public final float allowCloseDelay;
        public final boolean allowPause;

        @Nullable
        public final String bundleId;

        @NotNull
        public final CallToActionData callToActionData;

        @NonNull
        public final List<InstreamAdCompanionBanner> companionBanners;

        @Nullable
        @Deprecated
        public final String ctaText;

        @NonNull
        public final String disclaimer;
        public final float duration;
        public final boolean hasAdChoices;
        public final boolean hasShoppable;

        @NonNull
        public final String id;

        @Nullable
        public final LoudnessMetadata loudnessMetadata;

        @Nullable
        public final String marker;
        public final int postViewDuration;

        @Nullable
        public final List<ShoppableAdsItem> shoppableAdsItems;
        public final int videoHeight;
        public final int videoWidth;

        private InstreamAdBanner(String str, boolean z, float f, float f2, int i, int i2, boolean z2, boolean z3, List list, boolean z4, String str2, String str3, String str4, CallToActionData callToActionData, int i3, ImageData imageData, List list2, String str5, String str6, String str7, LoudnessMetadata loudnessMetadata) {
            this.id = str;
            this.allowClose = z;
            this.allowCloseDelay = f;
            this.duration = f2;
            this.videoHeight = i2;
            this.videoWidth = i;
            this.ctaText = callToActionData.getButtonText();
            this.allowPause = z2;
            this.hasShoppable = z3;
            this.companionBanners = list;
            this.hasAdChoices = z4;
            this.advertisingLabel = str2;
            this.aboutCompany = str3;
            this.marker = str4;
            this.callToActionData = callToActionData;
            this.postViewDuration = i3;
            this.adChoicesIcon = imageData;
            this.shoppableAdsItems = list2;
            this.bundleId = str5;
            this.disclaimer = str6;
            this.ageRestrictions = str7;
            this.loudnessMetadata = loudnessMetadata;
        }

        public static InstreamAdBanner a(z0 z0Var, dj djVar) {
            boolean z;
            ImageData imageData;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < z0Var.c0().size(); i++) {
                arrayList.add(InstreamAdCompanionBanner.a((c3) z0Var.c0().get(i)));
            }
            if (z0Var.a() != null) {
                imageData = z0Var.a().g();
                z = true;
            } else {
                z = false;
                imageData = null;
            }
            pg m0 = z0Var.m0();
            ArrayList arrayList2 = m0 == null ? null : new ArrayList(m0.a());
            l3 d0 = z0Var.d0();
            rf j0 = z0Var.j0();
            QrCta qrCta = j0 != null ? j0.a : null;
            CallToActionData a = d0 != null ? CallToActionData.a(d0.c(), d0.b(), d0.d(), d0.a(), d0.e(), qrCta) : CallToActionData.a(z0Var.l(), null, null, z0Var.j(), null, qrCta);
            ue h0 = z0Var.h0();
            int b = h0 != null ? (int) (h0.b() * 1000.0d) : 0;
            boolean z2 = z0Var instanceof eb;
            return new InstreamAdBanner(z0Var.x(), z0Var.o0(), z0Var.Y(), z0Var.t(), z0Var.R(), z0Var.v(), z0Var.p0(), z0Var.n0() != null, arrayList, z, z0Var.c(), z2 ? ((eb) z0Var).y0() : null, z2 ? ((eb) z0Var).z0() : null, a, b, imageData, arrayList2, z0Var.g(), z0Var.o(), z0Var.d(), djVar.b());
        }

        @NonNull
        public String toString() {
            return "InstreamAdBanner{duration=" + this.duration + ", allowClose=" + this.allowClose + ", allowCloseDelay=" + this.allowCloseDelay + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", hasAdChoices=" + this.hasAdChoices + ", allowPause=" + this.allowPause + ", hasShoppable=" + this.hasShoppable + ", id='" + this.id + "', advertisingLabel='" + this.advertisingLabel + "', companionBanners=" + this.companionBanners + ", aboutCompany=" + this.aboutCompany + ", marker=" + this.marker + ", callToActionData='" + this.callToActionData + "', postViewDuration='" + this.postViewDuration + "', bundleId='" + this.bundleId + "', disclaimer='" + this.disclaimer + "', ageRestrictions='" + this.ageRestrictions + "', adChoicesIcon=" + this.adChoicesIcon + ", shoppableAdsItems=" + this.shoppableAdsItems + '}';
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class InstreamAdCompanionBanner {

        @Nullable
        public final String adSlotID;

        @Nullable
        public final String apiFramework;
        public final int assetHeight;
        public final int assetWidth;

        @Nullable
        public final String bundleId;
        public final int expandedHeight;
        public final int expandedWidth;
        public final int height;

        @Nullable
        public final String htmlResource;

        @Nullable
        public final String iframeResource;
        public final boolean isClickable;

        @Nullable
        public final String required;

        @Nullable
        public final String staticResource;
        public final int width;

        private InstreamAdCompanionBanner(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.width = i;
            this.height = i2;
            this.assetWidth = i3;
            this.assetHeight = i4;
            this.expandedWidth = i5;
            this.expandedHeight = i6;
            this.isClickable = z;
            this.staticResource = str;
            this.iframeResource = str2;
            this.htmlResource = str3;
            this.apiFramework = str4;
            this.adSlotID = str5;
            this.required = str6;
            this.bundleId = str7;
        }

        public static InstreamAdCompanionBanner a(c3 c3Var) {
            return new InstreamAdCompanionBanner(c3Var.R(), c3Var.v(), c3Var.a0(), c3Var.Z(), c3Var.c0(), c3Var.b0(), !TextUtils.isEmpty(c3Var.L()), c3Var.g0(), c3Var.e0(), c3Var.d0(), c3Var.Y(), c3Var.X(), c3Var.f0(), c3Var.g());
        }

        @NonNull
        public String toString() {
            return "InstreamAdCompanionBanner{width=" + this.width + ", height=" + this.height + ", assetWidth=" + this.assetWidth + ", assetHeight=" + this.assetHeight + ", expandedWidth=" + this.expandedWidth + ", expandedHeight=" + this.expandedHeight + ", isClickable=" + this.isClickable + ", staticResource='" + this.staticResource + "', iframeResource='" + this.iframeResource + "', htmlResource='" + this.htmlResource + "', apiFramework='" + this.apiFramework + "', adSlotID='" + this.adSlotID + "', required='" + this.required + "', bundleId='" + this.bundleId + "'}";
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface InstreamAdListener {
        void onBannerComplete(@NonNull InstreamAd instreamAd, @NonNull InstreamAdBanner instreamAdBanner);

        void onBannerPause(@NonNull InstreamAd instreamAd, @NonNull InstreamAdBanner instreamAdBanner);

        void onBannerResume(@NonNull InstreamAd instreamAd, @NonNull InstreamAdBanner instreamAdBanner);

        void onBannerShouldClose();

        void onBannerStart(@NonNull InstreamAd instreamAd, @NonNull InstreamAdBanner instreamAdBanner);

        void onBannerTimeLeftChange(float f, float f2, @NonNull InstreamAd instreamAd);

        void onComplete(@NonNull String str, @NonNull InstreamAd instreamAd);

        void onError(@NonNull String str, @NonNull InstreamAd instreamAd);

        void onLoad(@NonNull InstreamAd instreamAd);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull InstreamAd instreamAd);

        void onPostViewComplete();

        void onPostViewStart();

        void onVideoMotionBannerComplete(@NonNull InstreamAd instreamAd, @NonNull InstreamAdVideoMotionBanner instreamAdVideoMotionBanner);

        void onVideoMotionBannerShouldClose(@NonNull InstreamAd instreamAd, @NonNull InstreamAdVideoMotionBanner instreamAdVideoMotionBanner);

        void onVideoMotionBannerStart(@NonNull InstreamAd instreamAd, @NonNull InstreamAdVideoMotionBanner instreamAdVideoMotionBanner);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class InstreamAdVideoMotionBanner {

        @Nullable
        public final ImageData adChoicesIcon;
        public final boolean allowClose;
        public final float allowCloseDelay;

        @Nullable
        public final String bundleId;
        public final float duration;
        public final boolean hasAdChoices;

        @NonNull
        public final String id;

        @NonNull
        public final VideoMotionData videoMotionData;

        private InstreamAdVideoMotionBanner(String str, boolean z, float f, float f2, boolean z2, ImageData imageData, VideoMotionData videoMotionData, String str2) {
            this.id = str;
            this.allowClose = z;
            this.allowCloseDelay = f;
            this.duration = f2;
            this.hasAdChoices = z2;
            this.adChoicesIcon = imageData;
            this.videoMotionData = videoMotionData;
            this.bundleId = str2;
        }

        public static InstreamAdVideoMotionBanner a(hj hjVar) {
            boolean z;
            ImageData imageData;
            if (hjVar.a() != null) {
                z = true;
                imageData = hjVar.a().g();
            } else {
                z = false;
                imageData = null;
            }
            boolean z2 = z;
            g8 C0 = hjVar.C0();
            if (C0 == null) {
                mi.a("InstreamAdVideoMotionBanner: internalVideoMotionData is null");
                return null;
            }
            f7 f7Var = C0.a;
            Header header = new Header(f7Var.a, f7Var.b, f7Var.c, f7Var.d, f7Var.e);
            List<h8> list = C0.b;
            ArrayList arrayList = new ArrayList();
            for (h8 h8Var : list) {
                arrayList.add(new VideoMotionItem(h8Var.a, h8Var.g, h8Var.h, h8Var.b, h8Var.c, h8Var.d, h8Var.e));
            }
            e7 e7Var = C0.c;
            return new InstreamAdVideoMotionBanner(hjVar.x(), hjVar.o0(), hjVar.Y(), hjVar.t(), z2, imageData, new VideoMotionData(header, arrayList, e7Var != null ? new Disclaimer(e7Var.a) : null), hjVar.g());
        }

        @NonNull
        public String toString() {
            return "InstreamAdVideoMotionBanner{duration=" + this.duration + ", allowClose=" + this.allowClose + ", allowCloseDelay=" + this.allowCloseDelay + ", hasAdChoices=" + this.hasAdChoices + ", id='" + this.id + "', videoMotionData=" + this.videoMotionData + ", adChoicesIcon=" + this.adChoicesIcon + ", bundleId='" + this.bundleId + "'}";
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface SectionPrepareCallback {
        @AnyThread
        void onPrepareResult(@NonNull String str, float f, @Nullable IAdLoadingError iAdLoadingError, @NonNull InstreamAd instreamAd);
    }

    public InstreamAd(int i, @NonNull Context context) {
        this(i, new r3(), context);
    }

    void a(l6 l6Var, s sVar) {
        if (this.m == null) {
            return;
        }
        q a = sVar.a();
        if (l6Var == null) {
            InstreamAdListener instreamAdListener = this.m;
            if (a == null) {
                a = q.o;
            }
            instreamAdListener.onNoAd(a, this);
            return;
        }
        if (!l6Var.d()) {
            InstreamAdListener instreamAdListener2 = this.m;
            if (a == null) {
                a = q.r;
            }
            instreamAdListener2.onNoAd(a, this);
            return;
        }
        this.i = l6Var;
        f6 a2 = f6.a(this, l6Var, this.a, this.b, this.g);
        this.j = a2;
        a2.a(this.n);
        this.j.a(this.s);
        InstreamAdPlayer instreamAdPlayer = this.k;
        if (instreamAdPlayer != null) {
            this.j.a(instreamAdPlayer);
        }
        InstreamAdVideoMotionPlayer instreamAdVideoMotionPlayer = this.l;
        if (instreamAdVideoMotionPlayer != null) {
            this.j.a(instreamAdVideoMotionPlayer);
        }
        configureMidpoints(this.r, this.q);
        setQrCtaPlayer(this.t);
        this.m.onLoad(this);
    }

    public void configureMidpoints(float f) {
        configureMidpoints(f, null);
    }

    public void configureMidpointsPercents(float f, @Nullable float[] fArr) {
        if (fArr == null) {
            configureMidpoints(f);
        } else {
            configureMidpoints(f, ib.a(f, fArr));
        }
    }

    public void destroy() {
        this.m = null;
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.a();
        }
    }

    @Nullable
    public InstreamAdListener getListener() {
        return this.m;
    }

    public int getLoadingTimeout() {
        return this.n;
    }

    @NonNull
    public float[] getMidPoints() {
        float[] fArr = this.p;
        return fArr == null ? new float[0] : (float[]) fArr.clone();
    }

    @Nullable
    public InstreamAdPlayer getPlayer() {
        return this.k;
    }

    @Nullable
    public View getShoppableView(@NonNull Context context) {
        f6 f6Var = this.j;
        if (f6Var == null) {
            return null;
        }
        return f6Var.a(context);
    }

    public int getVideoQuality() {
        return this.a.l();
    }

    @NonNull
    public List<String> getVideoSectionNames() {
        if (this.i == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList c = this.i.c();
        if (c.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        int size = c.size();
        int i = 0;
        while (i < size) {
            Object obj = c.get(i);
            i++;
            hb hbVar = (hb) obj;
            if (hbVar.i()) {
                arrayList.add(hbVar.h());
            }
        }
        return arrayList;
    }

    public float getVolume() {
        f6 f6Var = this.j;
        return f6Var != null ? f6Var.e() : this.s;
    }

    public void handleAdChoicesClick(@NonNull Context context) {
        f6 f6Var = this.j;
        if (f6Var == null) {
            return;
        }
        f6Var.b(context);
    }

    public void handleClick() {
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.f();
        }
    }

    public void handleCompanionClick(@NonNull InstreamAdCompanionBanner instreamAdCompanionBanner) {
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.b(instreamAdCompanionBanner);
        }
    }

    public void handleCompanionShow(@NonNull InstreamAdCompanionBanner instreamAdCompanionBanner) {
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.c(instreamAdCompanionBanner);
        }
    }

    public boolean isFullscreen() {
        return this.o;
    }

    public boolean isShoppablePresented() {
        f6 f6Var = this.j;
        if (f6Var != null) {
            return f6Var.g();
        }
        return false;
    }

    public void load() {
        if (isLoadCalled()) {
            mi.a("InstreamAd: Doesn't support multiple load");
            this.a.a().a(0, 1);
            a((l6) null, s.a(q.t));
        } else {
            t a = this.h != null ? t.a(this.d, UUID.randomUUID().toString(), 2, vb.b()) : t.a(this.d, this.a.j(), 2, vb.b());
            this.a.a(a);
            a.b(0, 0);
            tb a2 = this.b.a();
            String str = this.h;
            (str != null ? g6.a(this.a, this.b, str) : g6.a(this.a, this.b, this.n)).a(new p.b() { // from class: com.my.target.instreamads.InstreamAd$$ExternalSyntheticLambda0
                @Override // com.my.target.p.b
                public final void a(x xVar, s sVar) {
                    InstreamAd.this.a((l6) xVar, sVar);
                }
            }).a(a2, this.f);
        }
    }

    public void pause() {
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.h();
        }
    }

    public void prepareMidroll(float f, @NonNull SectionPrepareCallback sectionPrepareCallback) {
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.a(f, sectionPrepareCallback);
        } else {
            mi.a("InstreamAd: Unable to start ad: not loaded yet");
            sectionPrepareCallback.onPrepareResult("midroll", f, q.u, this);
        }
    }

    public void preparePauseroll(@NonNull SectionPrepareCallback sectionPrepareCallback) {
        a("pauseroll", sectionPrepareCallback);
    }

    public void preparePostroll(@NonNull SectionPrepareCallback sectionPrepareCallback) {
        a("postroll", sectionPrepareCallback);
    }

    public void resume() {
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.j();
        }
    }

    public void setFullscreen(boolean z) {
        this.o = z;
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.a(z);
        }
    }

    public void setListener(@Nullable InstreamAdListener instreamAdListener) {
        this.m = instreamAdListener;
    }

    public void setLoadingTimeout(int i) {
        if (i < 5) {
            mi.a("InstreamAd: Unable to set ad loading timeout < 5, set to 5 seconds");
            this.n = 5;
        } else {
            mi.a("InstreamAd: Ad loading timeout set to " + i + " seconds");
            this.n = i;
        }
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.a(this.n);
        }
    }

    public void setPlayer(@Nullable InstreamAdPlayer instreamAdPlayer) {
        this.k = instreamAdPlayer;
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.a(instreamAdPlayer);
        }
    }

    public void setPostViewPlayer(@Nullable InstreamAdPostViewPlayer instreamAdPostViewPlayer) {
        f6 f6Var = this.j;
        if (f6Var == null) {
            return;
        }
        f6Var.a(instreamAdPostViewPlayer);
    }

    public void setQrCtaPlayer(@Nullable QrCtaPlayer qrCtaPlayer) {
        this.t = qrCtaPlayer;
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.a(qrCtaPlayer);
        }
    }

    public void setShoppablePresented(boolean z) {
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.b(z);
        }
    }

    public void setVideoMotionPlayer(@Nullable InstreamAdVideoMotionPlayer instreamAdVideoMotionPlayer) {
        if (instreamAdVideoMotionPlayer == null) {
            return;
        }
        this.l = instreamAdVideoMotionPlayer;
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.a(instreamAdVideoMotionPlayer);
        }
    }

    public void setVideoQuality(int i) {
        this.a.d(i);
    }

    public void setVolume(float f) {
        if (Float.compare(f, 0.0f) < 0 || Float.compare(f, 1.0f) > 0) {
            mi.a("InstreamAd: Unable to set volume" + f + ", volume must be in range [0..1]");
            return;
        }
        this.s = f;
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.a(f);
        }
    }

    public void shoppableAdsItemClick(@NonNull String str) {
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.a(str);
        }
    }

    public void shoppableAdsItemShow(@NonNull String str) {
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.b(str);
        }
    }

    public void skip() {
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.k();
        }
    }

    public void skipBanner() {
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.l();
        }
    }

    public void startMidroll(float f) {
        f6 f6Var = this.j;
        if (f6Var == null) {
            mi.a("InstreamAd: Unable to start ad: not loaded yet");
        } else if (f6Var.d() == null) {
            mi.a("InstreamAd: Unable to start ad: player has not set");
        } else {
            this.j.b(f);
        }
    }

    public void startPauseroll() {
        a("pauseroll");
    }

    public void startPostroll() {
        a("postroll");
    }

    public void startPreroll() {
        a("preroll");
    }

    public void stop() {
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.m();
        }
    }

    public void swapPlayer(@Nullable InstreamAdPlayer instreamAdPlayer) {
        this.k = instreamAdPlayer;
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.b(instreamAdPlayer);
        }
    }

    public void useDefaultPlayer() {
        useDefaultPlayer(true);
    }

    public InstreamAd(int i, @NonNull MenuFactory menuFactory, @NonNull Context context) {
        super(i, "instreamads", context);
        this.n = 10;
        this.s = 1.0f;
        this.t = null;
        this.f = context;
        this.g = menuFactory;
        this.h = null;
        mi.c("Instream ad created with slotId. Version - " + MyTargetVersion.VERSION);
    }

    public void configureMidpoints(float f, @Nullable float[] fArr) {
        hb a;
        if (f <= 0.0f) {
            mi.a("InstreamAd: Midpoints are not configured, duration is not set or <= zero");
            return;
        }
        if (this.p != null) {
            mi.a("InstreamAd: Midpoints already configured");
            return;
        }
        this.q = fArr;
        this.r = f;
        l6 l6Var = this.i;
        if (l6Var == null || (a = l6Var.a("midroll")) == null) {
            return;
        }
        float[] a2 = ib.a(a, this.q, f);
        this.p = a2;
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.a(a2);
        }
    }

    public void useDefaultPlayer(boolean z) {
        o6 o6Var = new o6(this.f);
        o6Var.setUseExoPlayer(z);
        setPlayer(o6Var);
    }

    public void handleCompanionClick(@NonNull InstreamAdCompanionBanner instreamAdCompanionBanner, @NonNull Context context) {
        f6 f6Var = this.j;
        if (f6Var != null) {
            f6Var.a(instreamAdCompanionBanner, context);
        }
    }

    private void a(String str) {
        f6 f6Var = this.j;
        if (f6Var == null) {
            mi.a("InstreamAd: Unable to start ad - not loaded yet");
        } else if (f6Var.d() == null) {
            mi.a("InstreamAd: Unable to start ad - player has not set");
        } else {
            this.j.c(str);
        }
    }

    public InstreamAd(@NonNull String str, @NonNull Context context) {
        this(str, new r3(), context);
    }

    public InstreamAd(@NonNull String str, @NonNull MenuFactory menuFactory, @NonNull Context context) {
        super(0, "instreamads", context);
        this.n = 10;
        this.s = 1.0f;
        this.t = null;
        this.f = context;
        this.g = menuFactory;
        this.h = str;
        mi.c("Instream ad created with json. Version - " + MyTargetVersion.VERSION);
    }

    private void a(String str, SectionPrepareCallback sectionPrepareCallback) {
        f6 f6Var = this.j;
        if (f6Var == null) {
            mi.a("InstreamAd: Unable to start ad - not loaded yet");
            sectionPrepareCallback.onPrepareResult(str, -1.0f, q.u, this);
        } else {
            f6Var.a(str, sectionPrepareCallback);
        }
    }
}
