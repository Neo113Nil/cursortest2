package com.five_corp.ad;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.UUID;

/* loaded from: classes9.dex */
public class FiveAdCustomLayout extends FrameLayout implements FiveAdInterface {
    public static final String p = FiveAdCustomLayout.class.toString();
    public String a;
    public final Context b;
    public final k c;
    public final com.five_corp.ad.internal.hub.ad_instance.e d;
    public final com.five_corp.ad.internal.context.g e;
    public final com.five_corp.ad.internal.r f;
    public final com.five_corp.ad.internal.soundstate.c g;
    public final FrameLayout h;
    public final com.five_corp.ad.internal.hub.global.b i;
    public final Object j;
    public t k;
    public f l;
    public final l m;
    public final int n;
    public boolean o;

    public FiveAdCustomLayout(Context context) {
        super(context);
        this.a = null;
        this.j = new Object();
        this.o = false;
        throw new IllegalArgumentException("please use other constructor.");
    }

    @Nullable
    private f getAdController() {
        f fVar;
        synchronized (this.j) {
            fVar = this.l;
        }
        return fVar;
    }

    @Nullable
    private com.five_corp.ad.internal.ad.custom_layout.c getCustomLayoutConfig() {
        com.five_corp.ad.internal.view.l lVar;
        f adController = getAdController();
        if (adController == null || (lVar = adController.c) == null) {
            return null;
        }
        return lVar.getCustomLayoutConfig();
    }

    @Nullable
    private com.five_corp.ad.internal.context.h getLoadedContext() {
        f adController = getAdController();
        if (adController != null) {
            return adController.l;
        }
        return null;
    }

    @NonNull
    private t getState() {
        t tVar;
        synchronized (this.j) {
            tVar = this.k;
        }
        return tVar;
    }

    public final void a(int i, int i2) {
        com.five_corp.ad.internal.ad.custom_layout.c customLayoutConfig = getCustomLayoutConfig();
        if (customLayoutConfig == null) {
            return;
        }
        if (customLayoutConfig.a * i2 < customLayoutConfig.b * i) {
            this.h.setLayoutParams(new FrameLayout.LayoutParams((customLayoutConfig.a * i2) / customLayoutConfig.b, i2, 17));
        } else {
            this.h.setLayoutParams(new FrameLayout.LayoutParams(i, (customLayoutConfig.b * i) / customLayoutConfig.a, 17));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.five_corp.ad", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public void enableSound(boolean z) {
        this.g.a(z);
    }

    @NonNull
    @Deprecated
    public String getAdvertiserName() {
        String str;
        com.five_corp.ad.internal.context.h loadedContext = getLoadedContext();
        return (loadedContext == null || (str = loadedContext.a.n) == null) ? "" : str;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    @NonNull
    public CreativeType getCreativeType() {
        f adController = getAdController();
        return adController != null ? adController.l.a.a : CreativeType.NOT_LOADED;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    @Nullable
    public String getFiveAdTag() {
        return this.a;
    }

    public int getLogicalHeight() {
        if (this.o) {
            return getHeight();
        }
        int i = this.n;
        com.five_corp.ad.internal.ad.custom_layout.c customLayoutConfig = getCustomLayoutConfig();
        if (getState() != t.c || customLayoutConfig == null) {
            return 0;
        }
        return (i * customLayoutConfig.b) / customLayoutConfig.a;
    }

    public int getLogicalWidth() {
        return this.o ? getWidth() : this.n;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    @NonNull
    public String getSlotId() {
        return this.e.b;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public boolean isSoundEnabled() {
        return this.g.a().a();
    }

    @Deprecated
    public void loadAdAsync() {
        boolean z;
        synchronized (this.j) {
            try {
                if (this.k == t.a) {
                    this.k = t.b;
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.c.f.a(this.e, com.five_corp.ad.internal.context.f.CUSTOM_LAYOUT, this.g.a(), this.m);
        } else {
            this.d.a(FiveAdErrorCode.INVALID_STATE);
            Log.e(p, "Invalid state, loadAdAsync is ignored.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        try {
            i3 = this.n;
            i4 = 0;
        } catch (Throwable th) {
            this.i.a(com.five_corp.ad.internal.logger.b.a(th));
        }
        if (i3 <= 0) {
            if (View.MeasureSpec.getMode(i) == 0) {
                int size = View.MeasureSpec.getSize(i2);
                com.five_corp.ad.internal.ad.custom_layout.c customLayoutConfig = getCustomLayoutConfig();
                if (getState() == t.c && customLayoutConfig != null) {
                    i4 = (size * customLayoutConfig.a) / customLayoutConfig.b;
                }
                i = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (View.MeasureSpec.getMode(i2) == 0) {
                int size2 = View.MeasureSpec.getSize(i);
                com.five_corp.ad.internal.ad.custom_layout.c customLayoutConfig2 = getCustomLayoutConfig();
                if (getState() == t.c && customLayoutConfig2 != null) {
                    i4 = (size2 * customLayoutConfig2.b) / customLayoutConfig2.a;
                }
            }
            a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            super.onMeasure(i, i2);
        }
        i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int i5 = this.n;
        com.five_corp.ad.internal.ad.custom_layout.c customLayoutConfig3 = getCustomLayoutConfig();
        if (getState() == t.c && customLayoutConfig3 != null) {
            i4 = (i5 * customLayoutConfig3.b) / customLayoutConfig3.a;
        }
        i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    public void registerFriendlyObstructionView(@NonNull View view) {
        f adController = getAdController();
        if (adController == null) {
            Log.e(p, "You can call `registerFriendlyObstructionView` after ad is loaded.");
            return;
        }
        com.five_corp.ad.internal.context.h hVar = adController.l;
        if (hVar.e == com.five_corp.ad.internal.context.f.NATIVE || hVar.c.c.f) {
            adController.i.c(view);
        } else {
            Log.e("com.five_corp.ad.f", "`registerFriendlyObstructionView` is not allowed.");
        }
    }

    public void setEventListener(@NonNull FiveAdCustomLayoutEventListener fiveAdCustomLayoutEventListener) {
        com.five_corp.ad.internal.r rVar = this.f;
        rVar.c.set(new com.five_corp.ad.internal.b(fiveAdCustomLayoutEventListener, this));
        com.five_corp.ad.internal.r rVar2 = this.f;
        rVar2.e.set(com.five_corp.ad.internal.i.a(fiveAdCustomLayoutEventListener, this));
    }

    @Override // com.five_corp.ad.FiveAdInterface
    public void setFiveAdTag(@NonNull String str) {
        this.a = str;
    }

    @Override // com.five_corp.ad.FiveAdInterface
    @Deprecated
    public void setLoadListener(@NonNull FiveAdLoadListener fiveAdLoadListener) {
        this.f.b.set(fiveAdLoadListener);
    }

    public FiveAdCustomLayout(Context context, k kVar, com.five_corp.ad.internal.context.h hVar, int i) {
        super(context);
        this.a = null;
        this.j = new Object();
        this.o = false;
        this.c = kVar;
        com.five_corp.ad.internal.hub.ad_instance.e eVar = new com.five_corp.ad.internal.hub.ad_instance.e();
        this.d = eVar;
        this.b = context;
        this.e = hVar.c.a;
        com.five_corp.ad.internal.r rVar = new com.five_corp.ad.internal.r(this, eVar);
        this.f = rVar;
        rVar.e();
        com.five_corp.ad.internal.soundstate.c cVar = new com.five_corp.ad.internal.soundstate.c(kVar.i.a());
        this.g = cVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        com.five_corp.ad.internal.hub.global.b bVar = kVar.a;
        this.i = bVar;
        this.k = t.c;
        l lVar = new l(this);
        this.m = lVar;
        this.l = f.a(context, kVar, frameLayout, rVar, cVar, hVar, bVar, eVar);
        this.n = i;
        addView(frameLayout);
        eVar.h.add(lVar);
        eVar.i.add(lVar);
    }

    @Deprecated
    public FiveAdCustomLayout(Context context, String str) {
        this(context, str, 0);
    }

    @Deprecated
    public FiveAdCustomLayout(Context context, String str, int i) {
        super(context);
        this.a = null;
        this.j = new Object();
        this.o = false;
        k a = AdLoader.a();
        this.c = a;
        com.five_corp.ad.internal.hub.ad_instance.e eVar = new com.five_corp.ad.internal.hub.ad_instance.e();
        this.d = eVar;
        this.b = context;
        com.five_corp.ad.internal.context.d dVar = a.e;
        dVar.getClass();
        String uuid = UUID.randomUUID().toString();
        String str2 = dVar.a.appId;
        this.e = new com.five_corp.ad.internal.context.g(uuid, str);
        com.five_corp.ad.internal.r rVar = new com.five_corp.ad.internal.r(this, eVar);
        this.f = rVar;
        rVar.e();
        this.g = new com.five_corp.ad.internal.soundstate.c(a.i.a());
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        this.i = a.a;
        this.k = t.a;
        l lVar = new l(this);
        this.m = lVar;
        this.l = null;
        this.n = i;
        addView(frameLayout);
        eVar.h.add(lVar);
        eVar.i.add(lVar);
    }
}
