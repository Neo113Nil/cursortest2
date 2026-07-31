package com.five_corp.ad.internal.layouter;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.five_corp.ad.internal.view.H;
import com.five_corp.ad.internal.view.l;
import com.five_corp.ad.internal.view.m;
import com.five_corp.ad.internal.view.u;
import com.five_corp.ad.internal.y;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class f implements c {
    public final FrameLayout a;
    public final Activity b;
    public final e c;
    public final y d;
    public final com.five_corp.ad.internal.cache.f e;
    public final HashSet f = new HashSet();
    public final l g;
    public ImageView h;
    public final com.five_corp.ad.internal.fullscreen.c i;
    public final com.five_corp.ad.internal.hub.ad_instance.e j;

    static {
        f.class.toString();
    }

    public f(m mVar, Activity activity, y yVar, com.five_corp.ad.internal.hub.ad_instance.e eVar, u uVar, com.five_corp.ad.internal.context.h hVar, e eVar2, com.five_corp.ad.internal.fullscreen.c cVar, com.five_corp.ad.internal.viewability.a aVar, i iVar) {
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        this.b = activity;
        this.c = eVar2;
        this.d = yVar;
        this.i = cVar;
        this.g = new l(activity, eVar, uVar, this, hVar, null, aVar, eVar2.d, iVar);
        this.h = new ImageView(activity);
        this.e = hVar.g;
        this.j = eVar;
        mVar.addView(frameLayout);
        Drawable a = k.a(hVar.b, activity.getResources(), eVar);
        if (a != null) {
            View frameLayout2 = new FrameLayout(activity);
            frameLayout2.setClickable(false);
            frameLayout2.setFocusable(false);
            frameLayout2.setBackground(a);
            mVar.addView(frameLayout2);
        }
    }

    public final FrameLayout.LayoutParams a(int i, int i2) {
        com.five_corp.ad.internal.ad.custom_layout.c customLayoutConfig = this.g.getCustomLayoutConfig();
        return customLayoutConfig == null ? new FrameLayout.LayoutParams(0, 0) : customLayoutConfig.b * i < customLayoutConfig.a * i2 ? new FrameLayout.LayoutParams(i, (customLayoutConfig.b * i) / customLayoutConfig.a, 17) : new FrameLayout.LayoutParams((customLayoutConfig.a * i2) / customLayoutConfig.b, i2, 17);
    }

    @Override // com.five_corp.ad.internal.layouter.c
    public final void c() {
        this.i.i.i();
    }

    @Override // com.five_corp.ad.internal.layouter.c
    public final void d() {
        com.five_corp.ad.f fVar;
        com.five_corp.ad.internal.fullscreen.c cVar;
        com.five_corp.ad.internal.fullscreen.c cVar2 = this.i;
        if (cVar2.m.get() || (cVar = (fVar = cVar2.i).w) == null) {
            return;
        }
        cVar.c();
        int currentPositionMs = fVar.h.getCurrentPositionMs();
        fVar.h.e();
        fVar.o.p(currentPositionMs, fVar.u);
    }

    @Override // com.five_corp.ad.internal.layouter.c
    public final void e() {
        com.five_corp.ad.internal.fullscreen.c cVar = this.i;
        boolean booleanValue = this.c.a.booleanValue();
        cVar.f.a(com.five_corp.ad.internal.logger.b.a("PLAY_IN_FULLSCREEN feature is currently not supported (ResizableFullScreen)."));
        if (cVar.m.get()) {
            return;
        }
        com.five_corp.ad.f fVar = cVar.i;
        if (fVar.w != null) {
            fVar.m();
            if (booleanValue) {
                fVar.d.post(new com.five_corp.ad.c(fVar));
            }
        }
    }

    public final /* synthetic */ void a(View view) {
        try {
            this.j.a();
        } catch (Throwable th) {
            this.j.a(com.five_corp.ad.internal.logger.b.a(th));
        }
    }

    @Override // com.five_corp.ad.internal.layouter.c
    public final void a() {
        com.five_corp.ad.internal.fullscreen.c cVar = this.i;
        boolean booleanValue = this.c.a.booleanValue();
        if (cVar.m.get()) {
            return;
        }
        com.five_corp.ad.f fVar = cVar.i;
        if (fVar.w != null) {
            fVar.m();
            if (booleanValue) {
                fVar.d.post(new com.five_corp.ad.c(fVar));
            }
        }
    }

    @Override // com.five_corp.ad.internal.layouter.c
    public final void a(com.five_corp.ad.internal.l lVar) {
        com.five_corp.ad.f fVar = this.i.i;
        fVar.a(fVar.h.getCurrentPositionMs(), lVar);
    }

    public final void a(int i) {
        View view;
        int i2;
        double d;
        double d2;
        int i3;
        com.five_corp.ad.internal.ad.h hVar;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            H.a((View) it.next());
        }
        this.f.clear();
        com.five_corp.ad.internal.ad.fullscreen.e eVar = this.c.b;
        if (eVar != null) {
            Activity activity = this.b;
            com.five_corp.ad.internal.cache.f fVar = this.e;
            com.five_corp.ad.internal.ad.fullscreen.a aVar = eVar.c;
            int a = com.five_corp.ad.e.a(aVar.a);
            if (a != 0) {
                if (a == 1 && (hVar = aVar.c) != null) {
                    view = fVar.a(activity, hVar);
                }
                view = null;
            } else {
                com.five_corp.ad.internal.ad.fullscreen.d dVar = aVar.b;
                if (dVar != null) {
                    TextView textView = new TextView(activity);
                    textView.setText(dVar.b);
                    textView.setTextColor(H.a(dVar.c));
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(H.a(dVar.a));
                    gradientDrawable.setCornerRadius(5.0f);
                    gradientDrawable.setStroke(1, H.a(dVar.c));
                    H.a(textView, gradientDrawable);
                    textView.setGravity(17);
                    view = textView;
                }
                view = null;
            }
            if (view != null) {
                view.setOnClickListener(new View.OnClickListener() { // from class: com.five_corp.ad.internal.layouter.f$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        f.this.a(view2);
                    }
                });
                com.five_corp.ad.internal.ad.fullscreen.c cVar = eVar.b;
                int i4 = eVar.a;
                if (this.d.a.getResources().getConfiguration().orientation == 1) {
                    i2 = (int) (i * cVar.a);
                    d = i2;
                    d2 = cVar.b;
                } else {
                    i2 = (int) (i * cVar.c);
                    d = i2;
                    d2 = cVar.d;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, (int) (d * d2));
                switch (com.five_corp.ad.e.a(i4)) {
                    case 1:
                        i3 = 51;
                        layoutParams.gravity = i3;
                        break;
                    case 2:
                        i3 = 53;
                        layoutParams.gravity = i3;
                        break;
                    case 3:
                        i3 = 83;
                        layoutParams.gravity = i3;
                        break;
                    case 4:
                        i3 = 85;
                        layoutParams.gravity = i3;
                        break;
                    case 5:
                        i3 = 49;
                        layoutParams.gravity = i3;
                        break;
                    case 6:
                        i3 = 19;
                        layoutParams.gravity = i3;
                        break;
                    case 7:
                        layoutParams.gravity = 17;
                        break;
                    case 8:
                        i3 = 21;
                        layoutParams.gravity = i3;
                        break;
                    case 9:
                        i3 = 81;
                        layoutParams.gravity = i3;
                        break;
                }
                this.f.add(view);
                view.setLayoutParams(layoutParams);
                this.a.addView(view);
            }
        }
    }
}
