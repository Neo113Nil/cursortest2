package com.my.target.instreamads;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.c3;
import com.my.target.common.BaseAd;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.LoudnessMetadata;
import com.my.target.common.models.ShareButtonData;
import com.my.target.eb;
import com.my.target.hb;
import com.my.target.ib;
import com.my.target.l6;
import com.my.target.mi;
import com.my.target.p;
import com.my.target.p6;
import com.my.target.q;
import com.my.target.q0;
import com.my.target.q6;
import com.my.target.r3;
import com.my.target.s;
import com.my.target.tb;
import com.my.target.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes12.dex */
public final class InstreamAudioAd extends BaseAd {
    private final Context f;
    private final MenuFactory g;
    private final String h;
    public l6 i;
    public p6 j;
    private InstreamAudioAdPlayer k;
    private InstreamAudioAdListener l;
    private int m;
    private float n;
    private float[] o;
    private float[] p;
    private float q;
    private AudioSectionInfo r;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class AudioSectionInfo {
        public final int bannersCount;
        public final boolean hasMediaContent;

        @NonNull
        public final String name;

        private AudioSectionInfo(String str, boolean z, int i) {
            this.name = str;
            this.hasMediaContent = z;
            this.bannersCount = i;
        }

        public static AudioSectionInfo a(String str, boolean z, int i) {
            return new AudioSectionInfo(str, z, i);
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
    public static final class InstreamAudioAdBanner {

        @Nullable
        public final ImageData adChoicesIcon;

        @Nullable
        public final String adText;

        @NonNull
        public final String advertisingLabel;
        public final boolean allowPause;
        public final boolean allowSeek;
        public final boolean allowSkip;
        public final boolean allowTrackChange;

        @Nullable
        public final String bundleId;

        @NonNull
        public final List<InstreamAdCompanionBanner> companionBanners;
        public final float duration;
        public final boolean hasAdChoices;

        @Nullable
        public final LoudnessMetadata loudnessMetadata;

        @NonNull
        public final ArrayList<ShareButtonData> shareButtonDatas;

        private InstreamAudioAdBanner(boolean z, boolean z2, boolean z3, float f, String str, boolean z4, ArrayList arrayList, List list, boolean z5, String str2, ImageData imageData, String str3, LoudnessMetadata loudnessMetadata) {
            this.allowSeek = z;
            this.allowSkip = z2;
            this.allowPause = z4;
            this.allowTrackChange = z3;
            this.duration = f;
            this.adText = str;
            this.shareButtonDatas = arrayList;
            this.companionBanners = list;
            this.hasAdChoices = z5;
            this.advertisingLabel = str2;
            this.adChoicesIcon = imageData;
            this.bundleId = str3;
            this.loudnessMetadata = loudnessMetadata;
        }

        public static InstreamAudioAdBanner a(eb ebVar) {
            ImageData imageData;
            ArrayList arrayList = new ArrayList();
            ArrayList c0 = ebVar.c0();
            int size = c0.size();
            boolean z = false;
            int i = 0;
            while (i < size) {
                Object obj = c0.get(i);
                i++;
                arrayList.add(InstreamAdCompanionBanner.a((c3) obj));
            }
            if (ebVar.a() != null) {
                z = true;
                imageData = ebVar.a().g();
            } else {
                imageData = null;
            }
            return new InstreamAudioAdBanner(ebVar.r0(), ebVar.s0(), ebVar.t0(), ebVar.t(), ebVar.X(), ebVar.p0(), ebVar.l0(), arrayList, z, ebVar.c(), imageData, ebVar.g(), ebVar.A0() != null ? ((q0) ebVar.A0()).b() : null);
        }

        @NonNull
        public String toString() {
            return "InstreamAudioAdBanner{duration=" + this.duration + ", allowSeek=" + this.allowSeek + ", allowPause=" + this.allowPause + ", allowSkip=" + this.allowSkip + ", allowTrackChange=" + this.allowTrackChange + ", hasAdChoices=" + this.hasAdChoices + ", adChoicesIcon=" + this.adChoicesIcon + ", adText='" + this.adText + "', bundleId='" + this.bundleId + "', shareButtonDatas=" + this.shareButtonDatas + ", companionBanners=" + this.companionBanners + ", advertisingLabel='" + this.advertisingLabel + "', loudnessMetadata=" + this.loudnessMetadata + '}';
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface InstreamAudioAdListener {
        void onBannerComplete(@NonNull InstreamAudioAd instreamAudioAd, @NonNull InstreamAudioAdBanner instreamAudioAdBanner);

        void onBannerShouldClose(@NonNull InstreamAudioAd instreamAudioAd, @NonNull InstreamAudioAdBanner instreamAudioAdBanner);

        void onBannerStart(@NonNull InstreamAudioAd instreamAudioAd, @NonNull InstreamAudioAdBanner instreamAudioAdBanner);

        void onBannerTimeLeftChange(float f, float f2, @NonNull InstreamAudioAd instreamAudioAd);

        void onComplete(@NonNull String str, @NonNull InstreamAudioAd instreamAudioAd);

        void onError(@NonNull String str, @NonNull InstreamAudioAd instreamAudioAd);

        void onLoad(@NonNull InstreamAudioAd instreamAudioAd);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull InstreamAudioAd instreamAudioAd);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a(String str, float f, IAdLoadingError iAdLoadingError, InstreamAudioAd instreamAudioAd);
    }

    public InstreamAudioAd(int i, @NonNull Context context) {
        this(i, new r3(), context);
    }

    void a(l6 l6Var, s sVar) {
        if (this.l == null) {
            return;
        }
        q a2 = sVar.a();
        if (l6Var == null) {
            InstreamAudioAdListener instreamAudioAdListener = this.l;
            if (a2 == null) {
                a2 = q.o;
            }
            instreamAudioAdListener.onNoAd(a2, this);
            return;
        }
        if (!l6Var.d()) {
            InstreamAudioAdListener instreamAudioAdListener2 = this.l;
            if (a2 == null) {
                a2 = q.r;
            }
            instreamAudioAdListener2.onNoAd(a2, this);
            return;
        }
        this.i = l6Var;
        p6 a3 = p6.a(this, l6Var, this.a, this.b, this.g);
        this.j = a3;
        a3.a(this.m);
        this.j.a(this.n);
        InstreamAudioAdPlayer instreamAudioAdPlayer = this.k;
        if (instreamAudioAdPlayer != null) {
            this.j.a(instreamAudioAdPlayer);
        }
        configureMidpoints(this.q, this.p);
        a(this.l);
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
        this.l = null;
        p6 p6Var = this.j;
        if (p6Var != null) {
            p6Var.a();
        }
    }

    @NonNull
    public List<String> getAudioSectionNames() {
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

    @Nullable
    public InstreamAudioAdBanner getCurrentBanner() {
        p6 p6Var = this.j;
        if (p6Var != null) {
            return p6Var.b();
        }
        return null;
    }

    @Nullable
    public InstreamAudioAdListener getListener() {
        return this.l;
    }

    public int getLoadingTimeout() {
        return this.m;
    }

    @NonNull
    public float[] getMidPoints() {
        float[] fArr = this.o;
        return fArr == null ? new float[0] : (float[]) fArr.clone();
    }

    @Nullable
    public InstreamAudioAdPlayer getPlayer() {
        return this.k;
    }

    @Nullable
    public AudioSectionInfo getPrerollSectionInfo() {
        return this.r;
    }

    public float getVolume() {
        p6 p6Var = this.j;
        return p6Var != null ? p6Var.d() : this.n;
    }

    public void handleAdChoicesClick(@NonNull Context context) {
        p6 p6Var = this.j;
        if (p6Var == null) {
            return;
        }
        p6Var.a(context);
    }

    public void handleClick() {
        p6 p6Var = this.j;
        if (p6Var != null) {
            p6Var.e();
        }
    }

    public void handleCompanionClick(@NonNull InstreamAdCompanionBanner instreamAdCompanionBanner) {
        p6 p6Var = this.j;
        if (p6Var != null) {
            p6Var.b(instreamAdCompanionBanner);
        }
    }

    public void handleCompanionShow(@NonNull InstreamAdCompanionBanner instreamAdCompanionBanner) {
        p6 p6Var = this.j;
        if (p6Var != null) {
            p6Var.c(instreamAdCompanionBanner);
        }
    }

    public void load() {
        if (isLoadCalled()) {
            mi.a("InstreamAudioAd: Doesn't support multiple load");
            a((l6) null, s.a(q.t));
        } else {
            tb a2 = this.b.a();
            String str = this.h;
            (str != null ? q6.a(this.a, this.b, str) : q6.a(this.a, this.b, this.m)).a(new p.b() { // from class: com.my.target.instreamads.InstreamAudioAd$$ExternalSyntheticLambda0
                @Override // com.my.target.p.b
                public final void a(x xVar, s sVar) {
                    InstreamAudioAd.this.a((l6) xVar, sVar);
                }
            }).a(a2, this.f);
        }
    }

    public void pause() {
        p6 p6Var = this.j;
        if (p6Var != null) {
            p6Var.f();
        }
    }

    public void resume() {
        p6 p6Var = this.j;
        if (p6Var != null) {
            p6Var.h();
        }
    }

    public void setListener(@Nullable InstreamAudioAdListener instreamAudioAdListener) {
        this.l = instreamAudioAdListener;
    }

    public void setLoadingTimeout(int i) {
        if (i < 5) {
            mi.a("InstreamAudioAd: Unable to set ad loading timeout < 5, set to 5 seconds");
            this.m = 5;
        } else {
            mi.a("InstreamAudioAd: Ad loading timeout set to " + i + " seconds");
            this.m = i;
        }
        p6 p6Var = this.j;
        if (p6Var != null) {
            p6Var.a(this.m);
        }
    }

    public void setPlayer(@Nullable InstreamAudioAdPlayer instreamAudioAdPlayer) {
        this.k = instreamAudioAdPlayer;
        p6 p6Var = this.j;
        if (p6Var != null) {
            p6Var.a(instreamAudioAdPlayer);
        }
    }

    public void setVolume(float f) {
        if (Float.compare(f, 0.0f) < 0 || Float.compare(f, 1.0f) > 0) {
            mi.a("InstreamAudioAd: Unable to set volume" + f + ", volume must be in range [0..1]");
            return;
        }
        this.n = f;
        p6 p6Var = this.j;
        if (p6Var != null) {
            p6Var.a(f);
        }
    }

    public void skip() {
        p6 p6Var = this.j;
        if (p6Var != null) {
            p6Var.i();
        }
    }

    public void skipBanner() {
        p6 p6Var = this.j;
        if (p6Var != null) {
            p6Var.j();
        }
    }

    public void startMidroll(float f) {
        p6 p6Var = this.j;
        if (p6Var == null) {
            mi.a("InstreamAudioAd: Unable to start ad – not loaded yet");
        } else if (p6Var.c() == null) {
            mi.a("InstreamAudioAd: Unable to start ad – player has not set");
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
        p6 p6Var = this.j;
        if (p6Var != null) {
            p6Var.k();
        }
    }

    public InstreamAudioAd(int i, @NonNull MenuFactory menuFactory, @NonNull Context context) {
        super(i, "instreamaudioads", context);
        this.m = 10;
        this.n = 1.0f;
        this.f = context;
        this.g = menuFactory;
        this.h = null;
        mi.c("Instream audio ad created with slotId. Version - " + MyTargetVersion.VERSION);
    }

    public void configureMidpoints(float f, @Nullable float[] fArr) {
        hb a2;
        if (f <= 0.0f) {
            mi.a("InstreamAudioAd: Midpoints are not configured, duration is not set or <= zero");
            return;
        }
        if (this.o != null) {
            mi.a("InstreamAudioAd: Midpoints already configured");
            return;
        }
        this.p = fArr;
        this.q = f;
        l6 l6Var = this.i;
        if (l6Var == null || (a2 = l6Var.a("midroll")) == null) {
            return;
        }
        float[] a3 = ib.a(a2, this.p, f);
        this.o = a3;
        p6 p6Var = this.j;
        if (p6Var != null) {
            p6Var.a(a3);
        }
    }

    public void handleCompanionClick(@NonNull InstreamAdCompanionBanner instreamAdCompanionBanner, @NonNull Context context) {
        p6 p6Var = this.j;
        if (p6Var != null) {
            p6Var.a(instreamAdCompanionBanner, context);
        }
    }

    private void a(final InstreamAudioAdListener instreamAudioAdListener) {
        if (instreamAudioAdListener == null) {
            return;
        }
        a("preroll", new a() { // from class: com.my.target.instreamads.InstreamAudioAd$$ExternalSyntheticLambda1
            @Override // com.my.target.instreamads.InstreamAudioAd.a
            public final void a(String str, float f, IAdLoadingError iAdLoadingError, InstreamAudioAd instreamAudioAd) {
                InstreamAudioAd.this.a(instreamAudioAdListener, str, f, iAdLoadingError, instreamAudioAd);
            }
        });
    }

    public InstreamAudioAd(@NonNull String str, @NonNull Context context) {
        this(str, new r3(), context);
    }

    public InstreamAudioAd(@NonNull String str, @NonNull MenuFactory menuFactory, @NonNull Context context) {
        super(0, "instreamaudioads", context);
        this.m = 10;
        this.n = 1.0f;
        this.f = context;
        this.g = menuFactory;
        this.h = str;
        mi.c("Instream audio ad created with json. Version - " + MyTargetVersion.VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InstreamAudioAdListener instreamAudioAdListener, String str, float f, IAdLoadingError iAdLoadingError, InstreamAudioAd instreamAudioAd) {
        l6 l6Var = instreamAudioAd.i;
        hb a2 = l6Var != null ? l6Var.a(str) : null;
        if (a2 == null) {
            instreamAudioAdListener.onError(q.w.b, instreamAudioAd);
            return;
        }
        if (iAdLoadingError != null && iAdLoadingError.getCode() != 2001 && iAdLoadingError.getCode() != 3003) {
            instreamAudioAdListener.onError(iAdLoadingError.getMessage(), instreamAudioAd);
        } else {
            this.r = AudioSectionInfo.a(a2.h(), a2.j(), a2.a());
            instreamAudioAdListener.onLoad(instreamAudioAd);
        }
    }

    private void a(String str) {
        p6 p6Var = this.j;
        if (p6Var == null) {
            mi.a("InstreamAudioAd: Unable to start ad – not loaded yet");
        } else if (p6Var.c() == null) {
            mi.a("InstreamAudioAd: Unable to start ad – player has not set");
        } else {
            this.j.a(str);
        }
    }

    private void a(String str, a aVar) {
        p6 p6Var = this.j;
        if (p6Var == null) {
            mi.a("InstreamAudioAd: Unable to start ad - not loaded yet");
            aVar.a(str, -1.0f, q.u, this);
        } else {
            p6Var.a(str, aVar);
        }
    }
}
