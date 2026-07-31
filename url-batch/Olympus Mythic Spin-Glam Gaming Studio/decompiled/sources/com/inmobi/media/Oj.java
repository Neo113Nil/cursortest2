package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.common.model.AdVerification;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Oj extends E6 {
    public final Rc c;
    public final String d;
    public final NativeImage e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oj(Rc nativeAdUnitComponent, AbstractC3984f1 adSessionManager) {
        super(nativeAdUnitComponent, adSessionManager);
        NativeMedia media;
        NativeMedia media2;
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        this.c = nativeAdUnitComponent;
        JsonAssetObject assetsObject = nativeAdUnitComponent.b.getAssetsObject();
        NativeImage nativeImage = null;
        this.d = (assetsObject == null || (media2 = assetsObject.getMedia()) == null) ? null : media2.getType();
        JsonAssetObject assetsObject2 = nativeAdUnitComponent.b.getAssetsObject();
        if (assetsObject2 != null && (media = assetsObject2.getMedia()) != null) {
            nativeImage = media.getImage();
        }
        this.e = nativeImage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x013c, code lost:
    
        if (r11 != r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x013e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0106, code lost:
    
        if (r11 == r1) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012f A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:11:0x002d, B:12:0x013f, B:20:0x0129, B:22:0x012f, B:23:0x0136), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    @Override // com.inmobi.media.E6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        Nj nj;
        int i;
        List list;
        OmSdkInfo omsdkInfo;
        List<AdVerification> adVerifications;
        InterfaceC4466x9 a;
        try {
            if (continuation instanceof Nj) {
                nj = (Nj) continuation;
                int i2 = nj.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nj.c = i2 - Integer.MIN_VALUE;
                    Object obj = nj.a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = nj.c;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC4466x9 a2 = a();
                        if (a2 != null) {
                            ((C4493y9) a2).a("StaticExperienceLoader", "load called - mediaType: " + this.d);
                        }
                        if (!Intrinsics.areEqual(this.d, "static")) {
                            InterfaceC4466x9 a3 = a();
                            if (a3 != null) {
                                ((C4493y9) a3).b("StaticExperienceLoader", "Invalid Media Type - expected STATIC, got: " + this.d);
                            }
                            return new J6();
                        }
                        if (this.e == null) {
                            InterfaceC4466x9 a4 = a();
                            if (a4 != null) {
                                ((C4493y9) a4).b("StaticExperienceLoader", "Invalid Native Image - nativeImage is null");
                            }
                            return new H6((short) 2361);
                        }
                        nj.c = 1;
                        MetaInfo metaInfo = this.c.a.b.d;
                        if (metaInfo == null || (omsdkInfo = metaInfo.getOmsdkInfo()) == null || (adVerifications = omsdkInfo.getAdVerifications()) == null) {
                            list = 0;
                        } else {
                            list = new ArrayList(CollectionsKt.collectionSizeOrDefault(adVerifications, 10));
                            for (AdVerification adVerification : adVerifications) {
                                list.add(new Nf(adVerification.getVendor(), adVerification.getVerificationParams(), adVerification.getJavascriptResource()));
                            }
                        }
                        if (list == 0) {
                            list = CollectionsKt.emptyList();
                        }
                        Object a5 = a(list, nj);
                        if (a5 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a5 = Unit.INSTANCE;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return new I6((MediaView) obj, null);
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Wj wj = new Wj(this.e.getAssets(), new C3923ck(this.c.a.b));
                    C4496yc c4496yc = (C4496yc) this.c.g.getValue();
                    a = a();
                    if (a != null) {
                        ((C4493y9) a).a("StaticExperienceLoader", "load - loading static experience via MediaViewManager");
                    }
                    nj.c = 2;
                    obj = c4496yc.a(wj, nj);
                }
            }
            if (i != 0) {
            }
            Wj wj2 = new Wj(this.e.getAssets(), new C3923ck(this.c.a.b));
            C4496yc c4496yc2 = (C4496yc) this.c.g.getValue();
            a = a();
            if (a != null) {
            }
            nj.c = 2;
            obj = c4496yc2.a(wj2, nj);
        } catch (Exception e) {
            InterfaceC4466x9 a6 = a();
            if (a6 != null) {
                ((C4493y9) a6).b("StaticExperienceLoader", "load - exception during media view load: " + e.getMessage());
            }
            return a(e);
        }
        nj = new Nj(this, (ContinuationImpl) continuation);
        Object obj2 = nj.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nj.c;
    }

    public final K6 a(Exception exc) {
        NativeImage nativeImage = this.e;
        if (nativeImage != null && nativeImage.getRequired()) {
            InterfaceC4466x9 a = a();
            if (a != null) {
                ((C4493y9) a).b("StaticExperienceLoader", "Static Load Failure: " + exc);
            }
            return new H6((short) 2362);
        }
        return new J6();
    }
}
