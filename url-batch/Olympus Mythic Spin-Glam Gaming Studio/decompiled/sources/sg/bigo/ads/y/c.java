package sg.bigo.ads.y;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.adsession.media.MediaEvents;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.an.i;
import sg.bigo.ads.an.o;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.bj.g;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.core.player.b;
import sg.bigo.ads.cv.b;
import sg.bigo.ads.dh.a;
import sg.bigo.ads.dh.j;
import sg.bigo.ads.dh.l;
import sg.bigo.ads.dh.n;
import sg.bigo.ads.dh.p;
import sg.bigo.ads.y.f;

/* loaded from: classes.dex */
public class c extends sg.bigo.ads.y.b {

    @Nullable
    public sg.bigo.ads.core.player.c I;

    @Nullable
    public p J;
    public boolean K;
    public b L;
    private b.a O;
    private Pair<Boolean, Boolean> P;
    private AtomicBoolean Q;
    private final a R;
    private f S;
    private boolean T;
    private final sg.bigo.ads.dk.c ad;

    /* renamed from: sg.bigo.ads.y.c$4, reason: invalid class name */
    final class AnonymousClass4 implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ d.a b;
        final /* synthetic */ sg.bigo.ads.cp.a c;
        final /* synthetic */ sg.bigo.ads.api.core.b d;

        AnonymousClass4(int i, d.a aVar, sg.bigo.ads.cp.a aVar2, sg.bigo.ads.api.core.b bVar) {
            this.a = i;
            this.b = aVar;
            this.c = aVar2;
            this.d = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.a != 0) {
                c.this.C();
                this.b.a(c.this, 1006, this.a, "Invalid media video.");
                return;
            }
            c.this.B();
            c cVar = c.this;
            p pVar = cVar.J;
            if (!c.a(cVar, (int) ((pVar != null ? pVar.s : 0L) / 1000))) {
                this.b.a(c.this, 1032, 1402, "Invalid video duration.");
                return;
            }
            c.this.O = new b.a() { // from class: sg.bigo.ads.y.c.4.1
                @Override // sg.bigo.ads.core.player.b.a
                public final void a() {
                    if (c.this.Q.get() || AnonymousClass4.this.c.bp() == 3 || AnonymousClass4.this.c.bq() != null) {
                        return;
                    }
                    c.this.Q.set(true);
                    final Pair<Boolean, Boolean> G = c.this.G();
                    ArrayList arrayList = new ArrayList();
                    if (((Boolean) G.first).booleanValue()) {
                        arrayList.add(AnonymousClass4.this.c.bE().b);
                    }
                    String bb = ((sg.bigo.ads.cp.a) c.this.f()).bb();
                    if (!TextUtils.isEmpty(bb) && URLUtil.isNetworkUrl(bb)) {
                        arrayList.add(AnonymousClass4.this.c.bb());
                    }
                    if (arrayList.size() == 0 && !((Boolean) G.second).booleanValue()) {
                        AnonymousClass4.this.c.l(0);
                        return;
                    }
                    AnonymousClass4.this.c.l(3);
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    sg.bigo.ads.bj.e.a(c.this.b.e, arrayList, anonymousClass4.c.am(), new g() { // from class: sg.bigo.ads.y.c.4.1.1
                        @Override // sg.bigo.ads.bj.g
                        public final void a(int i, @NonNull String str, @Nullable sg.bigo.ads.bj.f fVar) {
                            AnonymousClass4.this.c.l(1);
                            if (((Boolean) G.second).booleanValue()) {
                                VideoController videoController = c.this.getVideoController();
                                if (videoController == null || videoController.getLoadHTMLCallback() == null) {
                                    AnonymousClass4.this.c.bs();
                                } else {
                                    videoController.getLoadHTMLCallback().a();
                                }
                            }
                        }

                        @Override // sg.bigo.ads.bj.g
                        public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
                            AnonymousClass4.this.c.l(2);
                            AnonymousClass4.this.c.a(new Pair<>(bitmap, fVar.e));
                            VideoController videoController = c.this.getVideoController();
                            if (videoController != null) {
                                videoController.notifyBackupResourceReady();
                            }
                        }
                    });
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(int i) {
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    c cVar2 = c.this;
                    sg.bigo.ads.cp.a aVar = anonymousClass4.c;
                    if (!cVar2.L() && !cVar2.M && aVar != null && aVar.aZ()) {
                        cVar2.M = true;
                        sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.y.d.1
                            final /* synthetic */ sg.bigo.ads.cp.a a;

                            AnonymousClass1(sg.bigo.ads.cp.a aVar2) {
                                r2 = aVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    String b = o.b(d.this.b.e, r2.aV());
                                    if (TextUtils.isEmpty(b)) {
                                        return;
                                    }
                                    File file = new File(URI.create(b));
                                    if (!file.exists() || file.length() <= 0) {
                                        return;
                                    }
                                    Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                                    d.this.A = sg.bigo.ads.bv.b.a(decodeFile);
                                } catch (Throwable unused) {
                                }
                            }
                        });
                    }
                    c.this.a("is_cache", Boolean.valueOf(i == 0));
                    AnonymousClass4.this.c.bi();
                    c.a(c.this);
                    c cVar3 = c.this;
                    if (cVar3.e || cVar3.f) {
                        return;
                    }
                    c.b(cVar3, i);
                    if (k.a.n().a(29)) {
                        sg.bigo.ads.core.player.b.a().a((sg.bigo.ads.api.core.o) c.this.f(), ((sg.bigo.ads.cp.a) c.this.f()).aY());
                    }
                    AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                    anonymousClass42.b.a(c.this);
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(String str, sg.bigo.ads.ay.a aVar) {
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    c cVar2 = c.this;
                    if (cVar2.e || cVar2.f) {
                        return;
                    }
                    anonymousClass4.c.h(2);
                    if (AnonymousClass4.this.d.y() != 1) {
                        AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                        anonymousClass42.b.a(c.this, aVar.d(), 1033, 10202, "video download failed and no backup creative resource.", true);
                    } else if (AnonymousClass4.this.c.bq() == null && !aVar.d()) {
                        sg.bigo.ads.da.b.a(AnonymousClass4.this.c, aVar.b, str, 0L, aVar.g / 1024, 2, "video", aVar.p, (String) null, (String) null, (String) null);
                        AnonymousClass4 anonymousClass43 = AnonymousClass4.this;
                        anonymousClass43.b.a(c.this, 1033, 10202, "video download failed and no backup creative resource.");
                    } else {
                        if (k.a.n().a(29)) {
                            sg.bigo.ads.core.player.b.a().a((sg.bigo.ads.api.core.o) c.this.f(), ((sg.bigo.ads.cp.a) c.this.f()).aY());
                        }
                        AnonymousClass4 anonymousClass44 = AnonymousClass4.this;
                        anonymousClass44.b.a(c.this);
                    }
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void b(int i) {
                    sg.bigo.ads.cp.a aVar;
                    int i2;
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    c cVar2 = c.this;
                    if (cVar2.e || cVar2.f) {
                        return;
                    }
                    if (anonymousClass4.c.aW()) {
                        aVar = AnonymousClass4.this.c;
                        i2 = 3;
                    } else {
                        aVar = AnonymousClass4.this.c;
                        i2 = 4;
                    }
                    aVar.h(i2);
                    AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                    anonymousClass42.b.a(c.this, IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, i, "Failed to download media video.");
                }
            };
            sg.bigo.ads.core.player.b a = sg.bigo.ads.core.player.b.a();
            c cVar2 = c.this;
            a.a(cVar2.b.e, this.c, cVar2.O);
        }
    }

    class a implements AdInteractionListener {

        @Nullable
        AdInteractionListener a;

        a() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClicked() {
            AdInteractionListener adInteractionListener = this.a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClicked();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdClosed() {
            AdInteractionListener adInteractionListener = this.a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdClosed();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdError(@NonNull AdError adError) {
            if (this.a != null) {
                if (adError.getCode() == 2002 && c.this.p()) {
                    return;
                }
                this.a.onAdError(adError);
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdImpression() {
            AdInteractionListener adInteractionListener = this.a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdImpression();
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public final void onAdOpened() {
            AdInteractionListener adInteractionListener = this.a;
            if (adInteractionListener != null) {
                adInteractionListener.onAdOpened();
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public c(@NonNull sg.bigo.ads.api.core.g gVar) {
        super(gVar);
        this.Q = new AtomicBoolean(false);
        this.R = new a();
        this.ad = new sg.bigo.ads.dk.c() { // from class: sg.bigo.ads.y.c.1
            @Override // sg.bigo.ads.dk.c
            public final void a(String str, @Nullable Object obj, @Nullable int[] iArr) {
                c.a(c.this, str, obj, iArr);
            }

            @Override // sg.bigo.ads.dk.c
            public final void a(String str, @Nullable int[] iArr) {
                c.a(c.this, str, iArr);
            }
        };
    }

    static /* synthetic */ int a(c cVar, String str) {
        if (r.a((CharSequence) str)) {
            return 10074;
        }
        sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) cVar.f();
        sg.bigo.ads.dh.k J = cVar.J();
        p a2 = J.a(cVar.b.e, str);
        int i = J.a;
        String str2 = J.c;
        long j = J.b;
        if (k.a.n().a(9) && URLUtil.isHttpUrl(str2)) {
            sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) aVar, i, str2, j, 10076, "Invalid http url");
            return 10076;
        }
        if (a2 != null && a2.n != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2.n.c.hashCode());
            a2.o = sb.toString();
            cVar.T = false;
            cVar.I = new sg.bigo.ads.core.player.c(cVar.b.e, a2, cVar.d);
            aVar.a(a2);
            cVar.J = a2;
            cVar.G();
            sg.bigo.ads.da.b.a(aVar, i, j);
            return 0;
        }
        sg.bigo.ads.dh.e eVar = J.d;
        List<n> list = J.e;
        if (eVar == null) {
            return 10075;
        }
        int i2 = eVar.a;
        if (i2 != 10062) {
        }
        Context context = cVar.b.e;
        sg.bigo.ads.dh.f fVar = sg.bigo.ads.dh.f.XML_PARSING_ERROR;
        sg.bigo.ads.core.player.c.a(context, list);
        sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) aVar, i, str2, j, i2, eVar.b);
        return i2;
    }

    static /* synthetic */ void a(c cVar) {
        VideoController videoController = cVar.getVideoController();
        if (videoController != null) {
            videoController.notifyResourceReady();
        }
    }

    static /* synthetic */ void a(c cVar, String str, Object obj, int[] iArr) {
        sg.bigo.ads.cp.a aVar;
        aVar = (sg.bigo.ads.cp.a) cVar.f();
        str.hashCode();
        switch (str) {
            case "AdLoaded":
                if (cVar.S != null) {
                    if (k.a.n().a(29)) {
                        sg.bigo.ads.core.player.b.a().a((sg.bigo.ads.api.core.o) cVar.f(), ((sg.bigo.ads.cp.a) cVar.f()).aY());
                    }
                    f fVar = cVar.S;
                    d.a<T> aVar2 = fVar.e;
                    if (aVar2 != 0) {
                        aVar2.a(fVar.a);
                        break;
                    }
                }
                break;
            case "AdVideoThirdQuartile":
                sg.bigo.ads.core.player.c cVar2 = cVar.I;
                if (cVar2 != null) {
                    Iterator<Integer> it = cVar2.j.iterator();
                    while (it.hasNext()) {
                        int intValue = it.next().intValue();
                        if (75 >= intValue) {
                            if (intValue == 75) {
                                sg.bigo.ads.cv.b bVar = cVar2.f;
                                if (bVar != null) {
                                    bVar.a(b.EnumC1884b.c);
                                }
                                intValue = 5;
                            }
                            sg.bigo.ads.core.player.c.a(aVar, intValue);
                            it.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVideoMidpoint":
                sg.bigo.ads.core.player.c cVar3 = cVar.I;
                if (cVar3 != null) {
                    Iterator<Integer> it2 = cVar3.j.iterator();
                    while (it2.hasNext()) {
                        int intValue2 = it2.next().intValue();
                        if (50 >= intValue2) {
                            if (intValue2 == 50) {
                                sg.bigo.ads.cv.b bVar2 = cVar3.f;
                                if (bVar2 != null) {
                                    bVar2.a(b.EnumC1884b.b);
                                }
                                intValue2 = 4;
                            }
                            sg.bigo.ads.core.player.c.a(aVar, intValue2);
                            it2.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVideoFirstQuartile":
                sg.bigo.ads.core.player.c cVar4 = cVar.I;
                if (cVar4 != null) {
                    Iterator<Integer> it3 = cVar4.j.iterator();
                    while (it3.hasNext()) {
                        int intValue3 = it3.next().intValue();
                        if (25 >= intValue3) {
                            if (intValue3 == 25) {
                                sg.bigo.ads.cv.b bVar3 = cVar4.f;
                                if (bVar3 != null) {
                                    bVar3.a(b.EnumC1884b.a);
                                }
                                intValue3 = 3;
                            }
                            sg.bigo.ads.core.player.c.a(aVar, intValue3);
                            it3.remove();
                        }
                    }
                    break;
                }
                break;
            case "AdVPAIDClickThru":
                if (iArr != null && iArr.length > 0) {
                    cVar.b(obj instanceof i ? (i) obj : null, 12, 5);
                    break;
                }
                break;
            case "AdError":
                f fVar2 = cVar.S;
                if (fVar2 != null) {
                    String str2 = obj instanceof String ? (String) obj : "VPAID error";
                    d.a<T> aVar3 = fVar2.e;
                    if (aVar3 != 0) {
                        aVar3.a(fVar2.a, 1006, 10222, str2);
                        break;
                    }
                }
                break;
            case "AdVPAIDImpression":
                f fVar3 = cVar.S;
                if (fVar3 != null && fVar3.a()) {
                    super.a_();
                    break;
                }
                break;
            case "AdVideoStart":
                sg.bigo.ads.core.player.c cVar5 = cVar.I;
                if (cVar5 != null) {
                    Iterator<Integer> it4 = cVar5.j.iterator();
                    while (it4.hasNext()) {
                        int intValue4 = it4.next().intValue();
                        if (intValue4 <= 0) {
                            if (intValue4 == 0) {
                                sg.bigo.ads.cv.b bVar4 = cVar5.f;
                                if (bVar4 != null) {
                                    bVar4.a(cVar5.a.s, cVar5.g ? 0.0f : 1.0f);
                                }
                                intValue4 = 2;
                            }
                            sg.bigo.ads.core.player.c.a(aVar, intValue4);
                            it4.remove();
                        }
                    }
                    break;
                }
                break;
        }
    }

    static /* synthetic */ void a(c cVar, String str, int[] iArr) {
        VideoController videoController;
        VideoController.VideoLifeCallback videoLifeCallback;
        VideoController.d dVar;
        VideoController.a aVar;
        sg.bigo.ads.cp.a aVar2;
        videoController = cVar.getVideoController();
        if (videoController != null) {
            videoLifeCallback = videoController.getVideoLifeCallback();
            dVar = videoController.getProgressChangeListener();
            aVar = videoController.getBackupLoadCallback();
        } else {
            videoLifeCallback = null;
            dVar = null;
            aVar = null;
        }
        aVar2 = (sg.bigo.ads.cp.a) cVar.f();
        str.hashCode();
        switch (str) {
            case "AdClosed":
                sg.bigo.ads.core.player.c cVar2 = cVar.I;
                if (cVar2 != null) {
                    cVar2.a(cVar2.a.e, "va_close");
                    break;
                }
                break;
            case "AdBackupImgReady":
                if (aVar != null) {
                    aVar.i(((iArr == null || iArr.length <= 0) ? 0 : iArr[0]) != 0);
                    break;
                }
                break;
            case "AdLoaded":
                sg.bigo.ads.core.player.c cVar3 = cVar.I;
                if (cVar3 != null) {
                    cVar3.c = true;
                    break;
                }
                break;
            case "AdVideoBuffered":
                if (videoLifeCallback instanceof VideoController.b) {
                    ((VideoController.b) videoLifeCallback).b();
                    break;
                }
                break;
            case "AdVideoComplete":
                if (videoLifeCallback != null) {
                    videoLifeCallback.onVideoEnd();
                }
                sg.bigo.ads.core.player.c cVar4 = cVar.I;
                if (cVar4 != null) {
                    cVar4.a(cVar4.a.d, "va_comp");
                    cVar4.a(cVar4.a.b, "va_prog1");
                    cVar4.a(cVar4.a.c, "va_prog2");
                    if (!cVar4.i) {
                        cVar4.i = true;
                        sg.bigo.ads.core.player.c.a(aVar2, 6);
                        sg.bigo.ads.cv.b bVar = cVar4.f;
                        if (bVar != null) {
                            bVar.a(b.EnumC1884b.d);
                        }
                    }
                }
                if (cVar.e(aVar2.y()) && videoController != null) {
                    videoController.play();
                    break;
                }
                break;
            case "AdVolumeChange":
                if (iArr != null && iArr.length > 0) {
                    int i = iArr[0];
                    if (videoLifeCallback != null) {
                        videoLifeCallback.onMuteChange(i == 0);
                    }
                    sg.bigo.ads.core.player.c cVar5 = cVar.I;
                    if (cVar5 != null) {
                        sg.bigo.ads.core.player.c.a(aVar2, i == 0 ? 7 : 17);
                        p pVar = cVar5.a;
                        if (pVar != null) {
                            Iterator<j> it = pVar.g.iterator();
                            while (it.hasNext()) {
                                j next = it.next();
                                if ((i == 0 && next.a) || (i == 100 && !next.a)) {
                                    cVar5.a(next, "va_mst");
                                    it.remove();
                                }
                            }
                        }
                        cVar5.g = i / 100 == 0;
                        sg.bigo.ads.cv.b bVar2 = cVar5.f;
                        if (bVar2 != null) {
                            float f = i / 100.0f;
                            MediaEvents mediaEvents = bVar2.a;
                            if (mediaEvents != null && bVar2.b) {
                                mediaEvents.volumeChange(f);
                                bVar2.a("video volume change: ".concat(String.valueOf(f)));
                                break;
                            }
                        }
                    }
                }
                break;
            case "AdSkipped":
                sg.bigo.ads.core.player.c cVar6 = cVar.I;
                if (cVar6 != null) {
                    cVar6.a(cVar6.a.f, "va_skip");
                    sg.bigo.ads.cv.b bVar3 = cVar6.f;
                    if (bVar3 != null) {
                        bVar3.b(b.a.e);
                        break;
                    }
                }
                break;
            case "AdError":
            case "AdVideoTooLate":
                sg.bigo.ads.core.player.c cVar7 = cVar.I;
                if (cVar7 != null) {
                    String str2 = sg.bigo.ads.dh.f.GENERAL_LINEAR_AD_ERROR.g;
                    ArrayList<n> arrayList = cVar7.a.k;
                    if (arrayList != null) {
                        Iterator<n> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            n next2 = it2.next();
                            String str3 = next2.b;
                            if (r.a((CharSequence) str3) || (next2.c && !next2.d)) {
                                sg.bigo.ads.bn.a.a(0, "VASTController", "invalidate tracking url or is tracked");
                            } else {
                                String a2 = sg.bigo.ads.core.player.c.a(str3);
                                String a3 = r.a((CharSequence) a2) ? "" : r.a(a2, "[ERRORCODE]", str2, false);
                                next2.c = true;
                                if (!r.a((CharSequence) a3)) {
                                    cVar7.e.a(cVar7.h, "va_err", a3, "bigoad", next2.e);
                                }
                            }
                            it2.remove();
                        }
                    }
                    sg.bigo.ads.core.player.c.a(aVar2, 16);
                    if (iArr != null) {
                        super.a(2002, 0, "Video error: " + iArr[0], false);
                        b bVar4 = cVar.L;
                        if (bVar4 != null) {
                            bVar4.a("Video error: " + iArr[0]);
                            break;
                        }
                    }
                }
                break;
            case "AdVideoPaused":
                if (videoLifeCallback != null) {
                    videoLifeCallback.onVideoPause();
                }
                sg.bigo.ads.core.player.c cVar8 = cVar.I;
                if (cVar8 != null) {
                    cVar8.d = true;
                    Iterator<n> it3 = cVar8.a.h.iterator();
                    while (it3.hasNext()) {
                        cVar8.a(it3.next(), "va_pau");
                    }
                    sg.bigo.ads.cv.b bVar5 = cVar8.f;
                    if (bVar5 != null) {
                        bVar5.b(b.a.a);
                        break;
                    }
                }
                break;
            case "AdVideoStart":
                if (videoLifeCallback != null) {
                    videoLifeCallback.onVideoStart();
                    break;
                }
                break;
            case "AdVideoBuffering":
                if (videoLifeCallback instanceof VideoController.b) {
                    ((VideoController.b) videoLifeCallback).a();
                    break;
                }
                break;
            case "AdVideoPlaying":
                if (videoLifeCallback != null) {
                    videoLifeCallback.onVideoPlay();
                }
                sg.bigo.ads.core.player.c cVar9 = cVar.I;
                if (cVar9 != null && cVar9.d) {
                    cVar9.d = false;
                    Iterator<n> it4 = cVar9.a.i.iterator();
                    while (it4.hasNext()) {
                        cVar9.a(it4.next(), "va_res");
                    }
                    sg.bigo.ads.cv.b bVar6 = cVar9.f;
                    if (bVar6 != null) {
                        bVar6.b(b.a.b);
                        break;
                    }
                }
                break;
            case "AdRemainingTimeChange":
                if (iArr != null && iArr.length > 2) {
                    sg.bigo.ads.core.player.c cVar10 = cVar.I;
                    if (cVar10 != null && iArr.length > 2) {
                        int i2 = iArr[0];
                        int i3 = iArr[2];
                        Iterator<l> it5 = cVar10.a.b.iterator();
                        while (it5.hasNext()) {
                            l next3 = it5.next();
                            if (i3 >= next3.a) {
                                cVar10.a(next3, "va_prog1");
                                it5.remove();
                            }
                        }
                        Iterator<sg.bigo.ads.dh.c> it6 = cVar10.a.c.iterator();
                        while (it6.hasNext()) {
                            sg.bigo.ads.dh.c next4 = it6.next();
                            if (i2 >= next4.a) {
                                cVar10.a(next4, "va_prog2");
                                it6.remove();
                            }
                        }
                        Iterator<Integer> it7 = cVar10.k.iterator();
                        while (it7.hasNext()) {
                            int intValue = it7.next().intValue();
                            if (i2 >= intValue) {
                                if (intValue == 2000) {
                                    intValue = 11;
                                } else if (intValue == 3000) {
                                    intValue = 12;
                                } else if (intValue == 5000) {
                                    intValue = 13;
                                } else if (intValue == 8000) {
                                    intValue = 14;
                                } else if (intValue == 10000) {
                                    intValue = 15;
                                }
                                sg.bigo.ads.core.player.c.a(aVar2, intValue);
                                it7.remove();
                            }
                        }
                        Iterator<Integer> it8 = cVar10.j.iterator();
                        while (it8.hasNext()) {
                            int intValue2 = it8.next().intValue();
                            if (i3 >= intValue2) {
                                if (intValue2 == 0) {
                                    sg.bigo.ads.cv.b bVar7 = cVar10.f;
                                    if (bVar7 != null) {
                                        bVar7.a(cVar10.a.s, cVar10.g ? 0.0f : 1.0f);
                                    }
                                    intValue2 = 2;
                                } else if (intValue2 == 25) {
                                    sg.bigo.ads.cv.b bVar8 = cVar10.f;
                                    if (bVar8 != null) {
                                        bVar8.a(b.EnumC1884b.a);
                                    }
                                    intValue2 = 3;
                                } else if (intValue2 == 50) {
                                    sg.bigo.ads.cv.b bVar9 = cVar10.f;
                                    if (bVar9 != null) {
                                        bVar9.a(b.EnumC1884b.b);
                                    }
                                    intValue2 = 4;
                                } else if (intValue2 == 75) {
                                    sg.bigo.ads.cv.b bVar10 = cVar10.f;
                                    if (bVar10 != null) {
                                        bVar10.a(b.EnumC1884b.c);
                                    }
                                    intValue2 = 5;
                                }
                                sg.bigo.ads.core.player.c.a(aVar2, intValue2);
                                it8.remove();
                            }
                        }
                    }
                    if (dVar != null) {
                        dVar.a(iArr[0], iArr[1]);
                        break;
                    }
                }
                break;
        }
    }

    static /* synthetic */ boolean a(c cVar, int i) {
        return ((sg.bigo.ads.cp.a) cVar.f()).y() != 4 || i >= 5;
    }

    static /* synthetic */ void b(c cVar, int i) {
        ((sg.bigo.ads.cp.a) cVar.f()).h(i != 0 ? i != 1 ? i != 2 ? 0 : 3 : 4 : 1);
    }

    @Override // sg.bigo.ads.y.b
    protected final List<sg.bigo.ads.cv.a> E() {
        List<sg.bigo.ads.cv.a> list;
        p pVar = this.J;
        return (pVar == null || (list = pVar.C) == null || list.size() <= 0) ? super.E() : list;
    }

    @Override // sg.bigo.ads.y.b
    protected final boolean F() {
        return ((sg.bigo.ads.cp.a) f()).aZ();
    }

    public final Pair<Boolean, Boolean> G() {
        boolean z;
        sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) f();
        Pair<Boolean, Boolean> pair = this.P;
        if (pair != null) {
            return pair;
        }
        p pVar = this.J;
        boolean z2 = false;
        if (pVar != null) {
            z = false;
            for (sg.bigo.ads.dh.a aVar2 : pVar.A) {
                if (aVar2 != null) {
                    a.C1889a a2 = sg.bigo.ads.dh.a.a(aVar2.b);
                    if (!z2 && a2 != null && a2.a()) {
                        aVar.a(a2);
                        z2 = true;
                    }
                    a.C1889a a3 = sg.bigo.ads.dh.a.a(aVar2.a);
                    if (!z && a3 != null && a3.a()) {
                        aVar.b(a3);
                        z = true;
                    }
                }
            }
        } else {
            z = false;
        }
        Pair<Boolean, Boolean> pair2 = new Pair<>(Boolean.valueOf(z2), Boolean.valueOf(z));
        this.P = pair2;
        return pair2;
    }

    @NonNull
    protected sg.bigo.ads.dh.k J() {
        int g = this.b.b.g();
        sg.bigo.ads.ai.j jVar = k.a;
        return new sg.bigo.ads.dh.k(g, (jVar == null || jVar.r() == null) ? 0 : jVar.r().a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.y.b, sg.bigo.ads.d.c
    public final void a(Point point, int i, int i2, @NonNull sg.bigo.ads.api.core.e eVar) {
        super.a(point, i, i2, eVar);
        sg.bigo.ads.core.player.c cVar = this.I;
        if (cVar != 0) {
            cVar.a(f(), i2, i);
        }
    }

    @Override // sg.bigo.ads.y.b
    public final void a(@NonNull ViewGroup viewGroup, MediaView mediaView, @Nullable ImageView imageView, @Nullable AdOptionsView adOptionsView, @Nullable List<View> list, int i, @Nullable View... viewArr) {
        super.a(viewGroup, mediaView, imageView, adOptionsView, list, i, viewArr);
        j_();
    }

    @Override // sg.bigo.ads.y.b
    public void a(@NonNull final d.a<NativeAd> aVar, int i) {
        sg.bigo.ads.ai.l n;
        final sg.bigo.ads.api.core.b bVar = this.b.a;
        if (!(bVar instanceof sg.bigo.ads.cp.a)) {
            aVar.a(this, 1030, 1400, "NativeVideo with invalid AdData class type.");
            return;
        }
        o.c aG = ((sg.bigo.ads.cp.a) bVar).aG();
        if (aG == null) {
            aVar.a(this, 1031, 1401, "Missing media video.");
            return;
        }
        final String c = aG.c();
        sg.bigo.ads.ai.j jVar = k.a;
        if (jVar == null || (n = jVar.n()) == null || !n.a(14)) {
            sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.y.c.3
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(aVar, bVar, c.a(c.this, c), false);
                }
            });
        } else {
            sg.bigo.ads.bp.e.f().execute(new Runnable() { // from class: sg.bigo.ads.y.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(aVar, bVar, c.a(c.this, c), true);
                }
            });
        }
    }

    protected void a(@NonNull d.a<NativeAd> aVar, @NonNull sg.bigo.ads.api.core.b bVar, int i, boolean z) {
        sg.bigo.ads.ai.o e;
        sg.bigo.ads.cp.a aVar2 = (sg.bigo.ads.cp.a) f();
        if (!aVar2.ba()) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(i, aVar, aVar2, bVar);
            if (z) {
                sg.bigo.ads.bh.d.a(1, anonymousClass4);
                return;
            } else {
                anonymousClass4.run();
                return;
            }
        }
        this.ac.a = aVar2.bG();
        f fVar = new f(this.b.e, this.ad, aVar2, this.J, aVar, this);
        this.S = fVar;
        int y = fVar.c.y();
        if (y == 1 || y == 2 || !(y == 3 || y == 4 || (y == 12 ? !((e = fVar.c.e()) == null || 6 != e.a("video_play_page.ad_component_layout", 1)) : y == 20))) {
            fVar.e.a(fVar.a, 1006, 10066, "Failed to support VPAID.");
            return;
        }
        f.AnonymousClass1 anonymousClass1 = new f.AnonymousClass1(i);
        if (z) {
            sg.bigo.ads.bh.d.a(1, anonymousClass1);
        } else {
            anonymousClass1.run();
        }
    }

    @Override // sg.bigo.ads.y.b
    public void a(@Nullable MediaView mediaView) {
        f fVar;
        if (this.J == null || mediaView == null) {
            return;
        }
        sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) f();
        if (!aVar.ba() || (fVar = this.S) == null) {
            mediaView.a(aVar, this.J, this.ad);
            a(mediaView.getVideoController(), this.b.b.i());
            return;
        }
        boolean i = this.b.b.i();
        if (fVar.d != null) {
            mediaView.a(fVar.h);
            VideoController videoController = mediaView.getVideoController();
            if (videoController != null) {
                videoController.mute(i);
            }
        }
    }

    protected void a(VideoController videoController, boolean z) {
        if (videoController != null) {
            videoController.mute(z);
        }
    }

    @Override // sg.bigo.ads.d.c
    public final void a_() {
        f fVar = this.S;
        if (fVar == null || !fVar.a()) {
            super.a_();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.d.c
    public final void b(@Nullable Point point, int i, int i2, @NonNull sg.bigo.ads.api.core.e eVar) {
        super.b(point, i, i2, eVar);
        sg.bigo.ads.core.player.c cVar = this.I;
        if (cVar != 0) {
            cVar.a(f(), i2, i);
        }
    }

    @Override // sg.bigo.ads.y.b, sg.bigo.ads.d.d, sg.bigo.ads.d.c
    public void destroyInMainThread() {
        VideoController videoController = getVideoController();
        if (videoController != null) {
            videoController.setVideoLifeCallback(null);
        }
        sg.bigo.ads.core.player.b a2 = sg.bigo.ads.core.player.b.a();
        a2.d.remove((sg.bigo.ads.api.core.o) f());
        super.destroyInMainThread();
        sg.bigo.ads.core.player.c cVar = this.I;
        if (cVar != null) {
            if (cVar.c && !cVar.b) {
                cVar.b = true;
            }
            p pVar = cVar.a;
            if (pVar != null) {
                Iterator<n> it = pVar.l.iterator();
                while (it.hasNext()) {
                    cVar.a(it.next(), "va_des");
                }
            }
            cVar.f = null;
        }
        f fVar = this.S;
        if (fVar != null) {
            sg.bigo.ads.cz.d dVar = fVar.h;
            if (dVar != null) {
                v.b(dVar);
                fVar.h.d();
                fVar.h = null;
            }
            fVar.a = null;
            fVar.c = null;
            fVar.g = null;
            fVar.d = null;
            this.S = null;
        }
        this.O = null;
    }

    protected boolean e(int i) {
        return (sg.bigo.ads.api.core.a.e(i) && this.b.b.h()) || (this instanceof sg.bigo.ads.z.b) || this.K;
    }

    @Override // sg.bigo.ads.y.b, sg.bigo.ads.api.NativeAd
    public NativeAd.CreativeType getCreativeType() {
        return NativeAd.CreativeType.VIDEO;
    }

    @Override // sg.bigo.ads.y.b, sg.bigo.ads.api.NativeAd
    @Nullable
    public VideoController getVideoController() {
        MediaView mediaView = ((sg.bigo.ads.y.b) this).E;
        if (mediaView != null) {
            return mediaView.getVideoController();
        }
        return null;
    }

    @Override // sg.bigo.ads.y.b, sg.bigo.ads.d.c
    public void h() {
        super.h();
        sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) f();
        sg.bigo.ads.core.player.c cVar = this.I;
        if (cVar != null) {
            if (!cVar.b) {
                cVar.b = true;
            }
            sg.bigo.ads.core.player.c.a(aVar, 1);
            Iterator<n> it = cVar.a.a.iterator();
            while (it.hasNext()) {
                cVar.a(it.next(), "va_show", aVar, -1, -1);
            }
        }
    }

    protected final void j_() {
        sg.bigo.ads.core.player.c cVar = this.I;
        if (cVar == null || this.T) {
            return;
        }
        this.T = true;
        cVar.f = ((sg.bigo.ads.y.b) this).C;
    }

    @Override // sg.bigo.ads.d.c, sg.bigo.ads.api.Ad
    @CallSuper
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        super.setAdInteractionListener(this.R);
        this.R.a = adInteractionListener;
    }
}
