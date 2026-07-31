package com.five_corp.ad;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.five_corp.ad.FiveAdNative;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes12.dex */
public class FiveAdNative implements FiveAdInterface {
    public final Context a;
    public final k b;
    public final com.five_corp.ad.internal.hub.ad_instance.e c;
    public final com.five_corp.ad.internal.context.g d;
    public final com.five_corp.ad.internal.r e;
    public final com.five_corp.ad.internal.soundstate.c f;
    public final FrameLayout g;
    public final com.five_corp.ad.internal.hub.global.b h;
    public final Object i;
    public t j;
    public f k;
    public final s l;
    public final NativeMainView m;
    public final Handler n;
    public String o;

    public interface LoadImageCallback {
        void onImageLoad(@Nullable Bitmap bitmap);
    }

    public FiveAdNative(Context context, k kVar, com.five_corp.ad.internal.context.h hVar, int i) {
        int i2;
        int i3;
        this.i = new Object();
        this.a = context;
        this.b = kVar;
        com.five_corp.ad.internal.hub.ad_instance.e eVar = new com.five_corp.ad.internal.hub.ad_instance.e();
        this.c = eVar;
        this.d = hVar.c.a;
        com.five_corp.ad.internal.r rVar = new com.five_corp.ad.internal.r(this, eVar);
        this.e = rVar;
        rVar.e();
        com.five_corp.ad.internal.soundstate.c cVar = new com.five_corp.ad.internal.soundstate.c(kVar.i.a());
        this.f = cVar;
        com.five_corp.ad.internal.hub.global.b bVar = kVar.a;
        this.h = bVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        this.j = t.c;
        s sVar = new s(this);
        this.l = sVar;
        this.k = f.a(context, kVar, frameLayout, rVar, cVar, hVar, bVar, eVar);
        NativeMainView nativeMainView = new NativeMainView(context, frameLayout, kVar.a, i);
        this.m = nativeMainView;
        com.five_corp.ad.internal.ad.custom_layout.c cVar2 = hVar.d.b;
        if (cVar2 != null && (i2 = cVar2.a) > 0 && (i3 = cVar2.b) > 0) {
            nativeMainView.setConfigHeightToWidthRatio(i3 / i2);
        }
        this.n = new Handler(Looper.getMainLooper());
        eVar.h.add(sVar);
        eVar.i.add(sVar);
    }

    public static /* synthetic */ void c(LoadImageCallback loadImageCallback) {
        Log.e("com.five_corp.ad.FiveAdNative", "You can use `loadInformationIconImageAsync` after ad is loaded.");
        loadImageCallback.onImageLoad(null);
    }

    public final f a() {
        f fVar;
        synchronized (this.i) {
            fVar = this.k;
        }
        return fVar;
    }

    public final com.five_corp.ad.internal.context.h b() {
        f a = a();
        if (a != null) {
            return a.l;
        }
        return null;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public void enableSound(boolean z) {
        this.f.a(z);
    }

    @NonNull
    public View getAdMainView() {
        return this.m;
    }

    @NonNull
    public String getAdTitle() {
        String str;
        com.five_corp.ad.internal.context.h b = b();
        return (b == null || (str = b.a.o) == null) ? "" : str;
    }

    @NonNull
    public String getAdvertiserName() {
        String str;
        com.five_corp.ad.internal.context.h b = b();
        return (b == null || (str = b.a.n) == null) ? "" : str;
    }

    @NonNull
    public String getButtonText() {
        String str;
        com.five_corp.ad.internal.context.h b = b();
        return (b == null || (str = b.a.p) == null) ? "" : str;
    }

    public int getContentViewLogicalHeight() {
        return this.m.getLogicalHeight();
    }

    public int getContentViewLogicalWidth() {
        return this.m.getLogicalWidth();
    }

    @Override // com.five_corp.ad.FiveAdInterface
    @NonNull
    public CreativeType getCreativeType() {
        f a = a();
        return a != null ? a.l.a.a : CreativeType.NOT_LOADED;
    }

    @NonNull
    public String getDescriptionText() {
        String str;
        com.five_corp.ad.internal.context.h b = b();
        return (b == null || (str = b.a.q) == null) ? "" : str;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    @Nullable
    public String getFiveAdTag() {
        return this.o;
    }

    @NonNull
    public String getLongDescriptionText() {
        String str;
        com.five_corp.ad.internal.context.h b = b();
        return (b == null || (str = b.a.r) == null) ? "" : str;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    @NonNull
    public String getSlotId() {
        return this.d.b;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public boolean isSoundEnabled() {
        return this.f.a().a();
    }

    @Deprecated
    public void loadAdAsync() {
        boolean z;
        synchronized (this.i) {
            try {
                if (this.j == t.a) {
                    this.j = t.b;
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.b.f.a(this.d, com.five_corp.ad.internal.context.f.NATIVE, this.f.a(), this.l);
        } else {
            this.c.a(FiveAdErrorCode.INVALID_STATE);
            Log.e("com.five_corp.ad.FiveAdNative", "Invalid state, loadAdAsync is ignored.");
        }
    }

    public void loadIconImageAsync(@NonNull final LoadImageCallback loadImageCallback) {
        com.five_corp.ad.internal.context.h b = b();
        if (b == null) {
            this.n.post(new Runnable() { // from class: com.five_corp.ad.FiveAdNative$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    FiveAdNative.a(FiveAdNative.LoadImageCallback.this);
                }
            });
            return;
        }
        com.five_corp.ad.internal.ad.h hVar = b.a.k;
        if (hVar == null) {
            this.n.post(new Runnable() { // from class: com.five_corp.ad.FiveAdNative$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    FiveAdNative.LoadImageCallback.this.onImageLoad(null);
                }
            });
        } else {
            b.g.a(hVar, new o(loadImageCallback));
        }
    }

    public void loadInformationIconImageAsync(@NonNull final LoadImageCallback loadImageCallback) {
        com.five_corp.ad.internal.context.h b = b();
        if (b == null) {
            this.n.post(new Runnable() { // from class: com.five_corp.ad.FiveAdNative$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    FiveAdNative.c(FiveAdNative.LoadImageCallback.this);
                }
            });
            return;
        }
        com.five_corp.ad.internal.ad.h hVar = b.a.l;
        if (hVar == null) {
            this.n.post(new Runnable() { // from class: com.five_corp.ad.FiveAdNative$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    FiveAdNative.LoadImageCallback.this.onImageLoad(null);
                }
            });
        } else {
            b.g.a(hVar, new p(loadImageCallback));
        }
    }

    public void registerFriendlyObstructionView(@NonNull View view) {
        f a = a();
        if (a == null) {
            Log.e("com.five_corp.ad.FiveAdNative", "You can call `registerFriendlyObstructionView` after ad is loaded.");
            return;
        }
        com.five_corp.ad.internal.context.h hVar = a.l;
        if (hVar.e == com.five_corp.ad.internal.context.f.NATIVE || hVar.c.c.f) {
            a.i.c(view);
        } else {
            Log.e("com.five_corp.ad.f", "`registerFriendlyObstructionView` is not allowed.");
        }
    }

    public void registerViews(@NonNull View view, @Nullable View view2, @NonNull List<View> list) {
        f a = a();
        if (a == null) {
            Log.e("com.five_corp.ad.FiveAdNative", "You can call `registerViews` after ad is loaded.");
            return;
        }
        a.i.e = view;
        if (view2 != null) {
            view2.setOnClickListener(new q(a));
        }
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(new ViewOnClickListenerC3849r(a));
        }
    }

    public void setEventListener(@NonNull FiveAdNativeEventListener fiveAdNativeEventListener) {
        com.five_corp.ad.internal.r rVar = this.e;
        rVar.c.set(new com.five_corp.ad.internal.e(fiveAdNativeEventListener, this));
        com.five_corp.ad.internal.r rVar2 = this.e;
        rVar2.e.set(com.five_corp.ad.internal.i.a(fiveAdNativeEventListener, this));
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public void setFiveAdTag(@NonNull String str) {
        this.o = str;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    @Deprecated
    public void setLoadListener(FiveAdLoadListener fiveAdLoadListener) {
        this.e.b.set(fiveAdLoadListener);
    }

    public static /* synthetic */ void a(LoadImageCallback loadImageCallback) {
        Log.e("com.five_corp.ad.FiveAdNative", "You can use `loadIconImageAsync` after ad is loaded.");
        loadImageCallback.onImageLoad(null);
    }

    @Deprecated
    public FiveAdNative(Context context, String str) {
        this(context, str, 0);
    }

    @Deprecated
    public FiveAdNative(Context context, String str, int i) {
        this.i = new Object();
        this.a = context;
        k a = AdLoader.a();
        this.b = a;
        com.five_corp.ad.internal.hub.ad_instance.e eVar = new com.five_corp.ad.internal.hub.ad_instance.e();
        this.c = eVar;
        com.five_corp.ad.internal.context.d dVar = a.e;
        dVar.getClass();
        String uuid = UUID.randomUUID().toString();
        String str2 = dVar.a.appId;
        this.d = new com.five_corp.ad.internal.context.g(uuid, str);
        com.five_corp.ad.internal.r rVar = new com.five_corp.ad.internal.r(this, eVar);
        this.e = rVar;
        rVar.e();
        this.f = new com.five_corp.ad.internal.soundstate.c(a.i.a());
        this.h = a.a;
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        this.j = t.a;
        s sVar = new s(this);
        this.l = sVar;
        this.k = null;
        this.m = new NativeMainView(context, frameLayout, a.a, i);
        this.n = new Handler(Looper.getMainLooper());
        eVar.h.add(sVar);
        eVar.i.add(sVar);
    }
}
