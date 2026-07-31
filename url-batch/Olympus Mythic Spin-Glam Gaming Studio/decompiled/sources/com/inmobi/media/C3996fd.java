package com.inmobi.media;

import android.webkit.URLUtil;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.inmobi.media.ads.network.inmobiJson.model.MainLink;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: com.inmobi.media.fd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3996fd {
    public final C4444wd a;
    public final InterfaceC3958e3 b;
    public final L4 c;
    public final C3864ad d;
    public final C3968ed e;
    public final InterfaceC4466x9 f;

    public C3996fd(C4444wd nativeLandingPageHandler, InterfaceC3958e3 clickSession, L4 contextualDataHandler, C3864ad nativeBeaconProcessor, C3968ed nativeClickModel, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(nativeLandingPageHandler, "nativeLandingPageHandler");
        Intrinsics.checkNotNullParameter(clickSession, "clickSession");
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeClickModel, "nativeClickModel");
        this.a = nativeLandingPageHandler;
        this.b = clickSession;
        this.c = contextualDataHandler;
        this.d = nativeBeaconProcessor;
        this.e = nativeClickModel;
        this.f = interfaceC4466x9;
    }

    public final void a(short s) {
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("NativeClickProcessor", "onAssetClickEvent: assetType=" + ((int) s));
        }
        if (s == 7) {
            InterfaceC4466x9 interfaceC4466x92 = this.f;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a("NativeClickProcessor", "Processing AD_CHOICE asset click");
            }
            a();
            return;
        }
        InterfaceC4466x9 interfaceC4466x93 = this.f;
        if (interfaceC4466x93 != null) {
            ((C4493y9) interfaceC4466x93).a("NativeClickProcessor", "Processing native asset click, tracking user interaction");
        }
        this.c.f();
        ((AbstractC3984f1) this.b).a(InteractionType.CLICK);
        b(s);
    }

    public final void b(short s) {
        List list;
        C3968ed c3968ed = this.e;
        Kl kl = c3968ed.a;
        ArrayList arrayList = null;
        String str = kl != null ? kl.a : null;
        List a = AbstractC3942dd.a(c3968ed);
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("NativeClickProcessor", "processNativeAssetClick: assetId=" + ((int) s) + ", VAST clickThroughUrl=" + str + ", VAST trackers count=" + a.size());
        }
        if (!O3.a(str)) {
            InterfaceC4466x9 interfaceC4466x92 = this.f;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a("NativeClickProcessor", "VAST URL is not a network URL, using response asset click URL");
            }
            C3968ed c3968ed2 = this.e;
            Intrinsics.checkNotNullParameter(c3968ed2, "<this>");
            Xc xc = (Xc) c3968ed2.b.a.get(Short.valueOf(s));
            String str2 = xc != null ? xc.a : null;
            C3968ed c3968ed3 = this.e;
            Intrinsics.checkNotNullParameter(c3968ed3, "<this>");
            Xc xc2 = (Xc) c3968ed3.b.a.get(Short.valueOf(s));
            if (xc2 != null && (list = xc2.b) != null) {
                arrayList = H4.a("click", list);
            }
            List emptyList = arrayList == null ? CollectionsKt.emptyList() : arrayList;
            InterfaceC4466x9 interfaceC4466x93 = this.f;
            if (interfaceC4466x93 != null) {
                ((C4493y9) interfaceC4466x93).a("NativeClickProcessor", "Response asset URL=" + str2 + ", trackers count=" + emptyList.size());
            }
            str = str2;
            a = emptyList;
        }
        a((short) 0, str, a);
    }

    public final void a(AbstractC4233oc mediaEvent) {
        Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            String simpleName = Reflection.getOrCreateKotlinClass(mediaEvent.getClass()).getSimpleName();
            Intrinsics.checkNotNullParameter(mediaEvent, "<this>");
            ((C4493y9) interfaceC4466x9).a("NativeClickProcessor", "processIfMediaClickEvent: mediaEvent type=" + simpleName + ", isClickEvent=" + ((mediaEvent instanceof Hj) || (mediaEvent instanceof C4217nm) || (mediaEvent instanceof Y3)));
        }
        Intrinsics.checkNotNullParameter(mediaEvent, "<this>");
        boolean z = mediaEvent instanceof Hj;
        if (z || (mediaEvent instanceof C4217nm) || (mediaEvent instanceof Y3)) {
            InterfaceC4466x9 interfaceC4466x92 = this.f;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a("NativeClickProcessor", "Media click event detected, tracking user interaction");
            }
            this.c.f();
            ((AbstractC3984f1) this.b).a(InteractionType.CLICK);
            if (z) {
                InterfaceC4466x9 interfaceC4466x93 = this.f;
                if (interfaceC4466x93 != null) {
                    ((C4493y9) interfaceC4466x93).a("NativeClickProcessor", "Processing StaticClick event");
                }
                a((Hj) mediaEvent);
                return;
            }
            if (mediaEvent instanceof C4217nm) {
                InterfaceC4466x9 interfaceC4466x94 = this.f;
                if (interfaceC4466x94 != null) {
                    ((C4493y9) interfaceC4466x94).a("NativeClickProcessor", "Processing VideoClick event");
                }
                b();
                return;
            }
            if (mediaEvent instanceof Y3) {
                InterfaceC4466x9 interfaceC4466x95 = this.f;
                if (interfaceC4466x95 != null) {
                    ((C4493y9) interfaceC4466x95).a("NativeClickProcessor", "Processing CompanionClick event");
                }
                a((Y3) mediaEvent);
                return;
            }
            InterfaceC4466x9 interfaceC4466x96 = this.f;
            if (interfaceC4466x96 != null) {
                ((C4493y9) interfaceC4466x96).a("NativeClickProcessor", "Unknown media event type, ignoring");
            }
        }
    }

    public final void b() {
        C3968ed c3968ed = this.e;
        Kl kl = c3968ed.a;
        String str = kl != null ? kl.a : null;
        List a = AbstractC3942dd.a(c3968ed);
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("NativeClickProcessor", "processVideoClickEvent: VAST clickThroughUrl=" + str + ", trackers count=" + a.size());
        }
        a((short) 0, str, a);
    }

    public final void a() {
        C3968ed c3968ed = this.e;
        Intrinsics.checkNotNullParameter(c3968ed, "<this>");
        Xc xc = (Xc) c3968ed.b.a.get((short) 7);
        String str = xc != null ? xc.a : null;
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("NativeClickProcessor", "processAdChoiceAssetClick: url=" + str + ", isNetworkUrl=" + (str != null ? Boolean.valueOf(URLUtil.isNetworkUrl(str)) : null));
        }
        if (str != null && URLUtil.isNetworkUrl(str)) {
            this.a.b(str, null);
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.f;
        if (interfaceC4466x92 != null) {
            ((C4493y9) interfaceC4466x92).a("NativeClickProcessor", "AdChoice URL is null or not a network URL, skipping");
        }
    }

    public final void a(Hj hj) {
        C3968ed c3968ed = this.e;
        Kl kl = c3968ed.a;
        String str = kl != null ? kl.a : null;
        List a = AbstractC3942dd.a(c3968ed);
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("NativeClickProcessor", "processStaticClickEvent: VAST clickThroughUrl=" + str);
        }
        List list = a;
        if (!O3.a(str)) {
            InterfaceC4466x9 interfaceC4466x92 = this.f;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a("NativeClickProcessor", "VAST URL is not a network URL, using static click URL");
            }
            str = hj.a;
            ArrayList arrayList = hj.b;
            InterfaceC4466x9 interfaceC4466x93 = this.f;
            list = arrayList;
            if (interfaceC4466x93 != null) {
                ((C4493y9) interfaceC4466x93).a("NativeClickProcessor", "Static click URL=" + str + ", trackers count=" + arrayList.size());
                list = arrayList;
            }
        }
        a((short) 0, str, list);
    }

    public final void a(Y3 y3) {
        Kl kl = this.e.a;
        String str = kl != null ? kl.a : null;
        ArrayList arrayList = y3.a;
        boolean isEmpty = arrayList.isEmpty();
        List list = arrayList;
        if (isEmpty) {
            list = AbstractC3942dd.a(this.e);
        }
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("NativeClickProcessor", "processCompanionClick: VAST clickThroughUrl=" + str + ", companion trackers count=" + y3.a.size() + ", using VAST trackers=" + y3.a.isEmpty());
        }
        a((short) 1, str, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(short s, String str, List list) {
        InterfaceC4466x9 interfaceC4466x9 = this.f;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("NativeClickProcessor", "processAssetData: assetType=" + ((int) s) + ", url=" + str + ", assetTrackers count=" + list.size());
        }
        C3968ed c3968ed = this.e;
        Intrinsics.checkNotNullParameter(c3968ed, "<this>");
        ArrayList a = H4.a("click", c3968ed.b.c);
        List plus = CollectionsKt.plus((Collection) list, (Iterable) a);
        InterfaceC4466x9 interfaceC4466x92 = this.f;
        if (interfaceC4466x92 != null) {
            ((C4493y9) interfaceC4466x92).a("NativeClickProcessor", "Response click trackers count=" + a.size() + ", combined trackers count=" + plus.size());
        }
        if (O3.a(str)) {
            a = plus;
        } else {
            InterfaceC4466x9 interfaceC4466x93 = this.f;
            if (interfaceC4466x93 != null) {
                ((C4493y9) interfaceC4466x93).a("NativeClickProcessor", "URL is not a network URL, using main link from response");
            }
            MainLink mainLink = this.e.b.b;
            str = mainLink != null ? mainLink.getUrl() : null;
            MainLink mainLink2 = this.e.b.b;
            r4 = mainLink2 != null ? mainLink2.getFallbackUrl() : null;
            InterfaceC4466x9 interfaceC4466x94 = this.f;
            if (interfaceC4466x94 != null) {
                ((C4493y9) interfaceC4466x94).a("NativeClickProcessor", "Main link URL=" + str + ", fallbackUrl=" + r4);
            }
        }
        if (str == null) {
            InterfaceC4466x9 interfaceC4466x95 = this.f;
            if (interfaceC4466x95 != null) {
                ((C4493y9) interfaceC4466x95).a("NativeClickProcessor", "Final URL is null, skipping click processing");
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x96 = this.f;
        if (interfaceC4466x96 != null) {
            ((C4493y9) interfaceC4466x96).a("NativeClickProcessor", "Handling click: finalUrl=" + str + ", fallbackUrl=" + r4 + ", firing " + a.size() + " beacons");
        }
        this.a.b(str, r4);
        this.d.a(s, a);
    }
}
