package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.vm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4427vm extends E6 {
    public final Rc c;
    public final String d;
    public final NativeVideo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4427vm(Rc nativeAdUnitComponent, AbstractC3984f1 adSessionManager) {
        super(nativeAdUnitComponent, adSessionManager);
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        this.c = nativeAdUnitComponent;
        JsonAssetObject assetsObject = nativeAdUnitComponent.b.getAssetsObject();
        NativeMedia media = assetsObject != null ? assetsObject.getMedia() : null;
        this.d = media != null ? media.getType() : null;
        this.e = media != null ? media.getVideo() : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0150, code lost:
    
        if (a(r7, r2) == r3) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00ca, code lost:
    
        if (r1 == r3) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.inmobi.media.E6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        C4347sm c4347sm;
        int i;
        Pl pl;
        List<TrackingInfo> emptyList;
        NativeVideo video;
        if (continuation instanceof C4347sm) {
            c4347sm = (C4347sm) continuation;
            int i2 = c4347sm.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4347sm.d = i2 - Integer.MIN_VALUE;
                Object obj = c4347sm.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4347sm.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC4466x9 a = a();
                    if (a != null) {
                        ((C4493y9) a).a("VideoExperienceLoader", "load called - mediaType: " + this.d);
                    }
                    if (!Intrinsics.areEqual(this.d, "video")) {
                        InterfaceC4466x9 a2 = a();
                        if (a2 != null) {
                            ((C4493y9) a2).b("VideoExperienceLoader", "Invalid Media Type - expected VIDEO, got: " + this.d);
                        }
                        return new J6();
                    }
                    NativeVideo nativeVideo = this.e;
                    if (nativeVideo == null) {
                        InterfaceC4466x9 a3 = a();
                        if (a3 != null) {
                            ((C4493y9) a3).b("VideoExperienceLoader", "Invalid Native Video - nativeVideo is null");
                        }
                        return new H6((short) 2361);
                    }
                    ArrayList a4 = H4.a("error", nativeVideo.getTrackers());
                    String vastTag = this.e.getVastTag();
                    c4347sm.d = 1;
                    obj = a(vastTag, a4, c4347sm);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        pl = c4347sm.a;
                        ResultKt.throwOnFailure(obj);
                        String str = pl.a;
                        String str2 = pl.b;
                        int a5 = AbstractC4085im.a(pl.e);
                        ArrayList arrayList = pl.c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (!(((Je) next) instanceof Nf)) {
                                arrayList2.add(next);
                            }
                        }
                        Jl vastBeaconData = new Jl(str, str2, a5, arrayList2);
                        String str3 = pl.e;
                        ArrayList arrayList3 = pl.f;
                        ArrayList arrayList4 = pl.g;
                        AdConfig.VastVideoConfig vastVideo = this.c.a.b.a.b.getVastVideo();
                        VideoExperience experience = this.e.getExperience();
                        C4274q1 c4274q1 = this.c.a.b.a;
                        C4270pn c4270pn = new C4270pn(c4274q1.a.g, experience, c4274q1.b.getNative());
                        Rc rc = this.c;
                        Intrinsics.checkNotNullParameter(rc, "<this>");
                        Intrinsics.checkNotNullParameter(vastBeaconData, "vastBeaconData");
                        C3903c0 c3903c0 = rc.a.a.d;
                        Intrinsics.checkNotNullParameter(rc, "<this>");
                        JsonAssetObject assetsObject = rc.b.getAssetsObject();
                        NativeMedia media = assetsObject != null ? assetsObject.getMedia() : null;
                        if (media == null || (video = media.getVideo()) == null || (emptyList = video.getTrackers()) == null) {
                            emptyList = CollectionsKt.emptyList();
                        }
                        Om om = new Om(str3, arrayList3, arrayList4, vastVideo, c4270pn, new C4163lm(vastBeaconData, c3903c0, new Fn(emptyList)), new Pn(this.c.a.b), new C3933d4(this.c.a.b));
                        c4347sm.a = null;
                        c4347sm.d = 3;
                        Object a6 = a(vastBeaconData, om, c4347sm);
                        return a6 == coroutine_suspended ? coroutine_suspended : a6;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                pl = (Pl) obj;
                if (pl != null) {
                    NativeVideo nativeVideo2 = this.e;
                    if (!(nativeVideo2 != null ? nativeVideo2.getRequired() : false)) {
                        return new J6();
                    }
                    InterfaceC4466x9 a7 = a();
                    if (a7 != null) {
                        ((C4493y9) a7).b("VideoExperienceLoader", "Vast Parse Failure - Video Required");
                    }
                    return new H6((short) 2360);
                }
                Rc rc2 = this.c;
                String str4 = pl.d;
                ArrayList arrayList5 = pl.c;
                ArrayList arrayList6 = new ArrayList();
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (Intrinsics.areEqual(((Je) next2).b, "click")) {
                        arrayList6.add(next2);
                    }
                }
                rc2.e = new Kl(str4, arrayList6);
                ArrayList arrayList7 = pl.c;
                ArrayList arrayList8 = new ArrayList();
                Iterator it3 = arrayList7.iterator();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    if (next3 instanceof Nf) {
                        arrayList8.add(next3);
                    }
                }
                c4347sm.a = pl;
                c4347sm.d = 2;
            }
        }
        c4347sm = new C4347sm(this, (ContinuationImpl) continuation);
        Object obj2 = c4347sm.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4347sm.d;
        if (i != 0) {
        }
        pl = (Pl) obj2;
        if (pl != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ArrayList arrayList, ContinuationImpl continuationImpl) {
        C4401um c4401um;
        int i;
        try {
            if (continuationImpl instanceof C4401um) {
                c4401um = (C4401um) continuationImpl;
                int i2 = c4401um.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c4401um.c = i2 - Integer.MIN_VALUE;
                    Object obj = c4401um.a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c4401um.c;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC4466x9 a = a();
                        if (a != null) {
                            ((C4493y9) a).a("VideoExperienceLoader", "parseVastTag - processing VAST tag with " + arrayList.size() + " error URLs");
                        }
                        C4059hm c4059hm = C4059hm.a;
                        C4456x c4456x = this.c.a;
                        c4401um.c = 1;
                        obj = c4059hm.a(str, c4456x, arrayList, c4401um);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (Pl) obj;
                }
            }
            if (i != 0) {
            }
            return (Pl) obj;
        } catch (Sl e) {
            InterfaceC4466x9 a2 = a();
            if (a2 == null) {
                return null;
            }
            ((C4493y9) a2).b("VideoExperienceLoader", "parseVastTag - VAST parse exception: " + e.getMessage());
            return null;
        }
        c4401um = new C4401um(this, continuationImpl);
        Object obj2 = c4401um.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4401um.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Jl jl, Om om, ContinuationImpl continuationImpl) {
        C4374tm c4374tm;
        int i;
        try {
            if (continuationImpl instanceof C4374tm) {
                c4374tm = (C4374tm) continuationImpl;
                int i2 = c4374tm.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c4374tm.d = i2 - Integer.MIN_VALUE;
                    Object obj = c4374tm.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c4374tm.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        C4496yc c4496yc = (C4496yc) this.c.g.getValue();
                        InterfaceC4466x9 a = a();
                        if (a != null) {
                            ((C4493y9) a).a("VideoExperienceLoader", "onPrepareExperienceModelSuccess - loading video experience");
                        }
                        c4374tm.a = jl;
                        c4374tm.d = 1;
                        obj = c4496yc.a(om, c4374tm);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jl = c4374tm.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    return new I6((MediaView) obj, jl);
                }
            }
            if (i != 0) {
            }
            return new I6((MediaView) obj, jl);
        } catch (Exception e) {
            InterfaceC4466x9 a2 = a();
            if (a2 != null) {
                ((C4493y9) a2).b("VideoExperienceLoader", "onPrepareExperienceModelSuccess - exception during media load: " + e.getMessage());
            }
            return a(e, jl);
        }
        c4374tm = new C4374tm(this, continuationImpl);
        Object obj2 = c4374tm.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4374tm.d;
    }

    public final K6 a(Exception exc, Jl jl) {
        NativeVideo nativeVideo = this.e;
        if (nativeVideo != null ? nativeVideo.getRequired() : false) {
            InterfaceC4466x9 a = a();
            if (a != null) {
                ((C4493y9) a).b("VideoExperienceLoader", "Media Load Failure: " + exc);
            }
            return new H6((short) 2362);
        }
        return new J6(jl);
    }
}
