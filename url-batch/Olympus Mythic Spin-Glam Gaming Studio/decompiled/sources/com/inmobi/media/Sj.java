package com.inmobi.media;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.squareup.picasso.Picasso;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes13.dex */
public final class Sj extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Vj c;
    public final /* synthetic */ Ref$BooleanRef d;
    public final /* synthetic */ ImageView e;
    public final /* synthetic */ Bitmap.Config f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sj(List list, Vj vj, Ref$BooleanRef ref$BooleanRef, ImageView imageView, Bitmap.Config config, Continuation continuation) {
        super(2, continuation);
        this.b = list;
        this.c = vj;
        this.d = ref$BooleanRef;
        this.e = imageView;
        this.f = config;
    }

    public static final void a(Vj vj, ImageView imageView, Pair pair) {
        C4493y9 c4493y9 = vj.e;
        if (c4493y9 != null) {
            c4493y9.a("StaticExperienceManager", "loadImagesIntoImageView - setting bitmap to ImageView");
        }
        vj.a(imageView, (Image) pair.getSecond());
        imageView.setImageBitmap((Bitmap) pair.getFirst());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Sj sj = new Sj(this.b, this.c, this.d, this.e, this.f, continuation);
        sj.a = obj;
        return sj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Sj) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final Pair pair;
        Object m8023constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = this.b;
        Vj vj = this.c;
        Bitmap.Config config = this.f;
        Ref$BooleanRef ref$BooleanRef = this.d;
        Iterator it = list.iterator();
        do {
            pair = null;
            if (!it.hasNext()) {
                break;
            }
            Image image = (Image) it.next();
            C4493y9 c4493y9 = vj.e;
            if (c4493y9 != null) {
                c4493y9.a("StaticExperienceManager", "loadImagesIntoImageView - trying to load image from URL: " + image.getUrl());
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                Picasso picasso = C4027gg.a;
                m8023constructorimpl = Result.m8023constructorimpl(C4027gg.b(vj.a).load(image.getUrl()).tag(vj.f).transform(new C3893bg(config)).get());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
            if (m8026exceptionOrNullimpl != null) {
                C4493y9 c4493y92 = vj.e;
                if (c4493y92 != null) {
                    c4493y92.a("StaticExperienceManager", "Bitmap Failure " + image.getUrl() + " " + m8026exceptionOrNullimpl.getMessage());
                }
                if (m8026exceptionOrNullimpl instanceof C4205nb) {
                    ref$BooleanRef.element = true;
                }
            }
            if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                m8023constructorimpl = null;
            }
            Bitmap bitmap = (Bitmap) m8023constructorimpl;
            if (bitmap != null) {
                pair = new Pair(bitmap, image);
            }
        } while (pair == null);
        if (pair != null) {
            final ImageView imageView = this.e;
            final Vj vj2 = this.c;
            return Boxing.boxBoolean(imageView.post(new Runnable() { // from class: com.inmobi.media.Sj$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Sj.a(Vj.this, imageView, pair);
                }
            }));
        }
        C4493y9 c4493y93 = this.c.e;
        if (c4493y93 != null) {
            c4493y93.b("StaticExperienceManager", "Bitmap Load Failure - no images could be loaded");
        }
        Vj vj3 = this.c;
        boolean z = this.d.element;
        vj3.getClass();
        short s = z ? (short) 81 : (short) 82;
        Map mutableMap = MapsKt.toMutableMap(Hk.a(vj3.c.b.a));
        mutableMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("MainImageLoadFailure", mutableMap, EnumC4530zk.a);
        throw new C4285qc();
    }
}
