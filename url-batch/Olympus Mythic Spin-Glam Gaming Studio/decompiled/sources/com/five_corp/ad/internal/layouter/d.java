package com.five_corp.ad.internal.layouter;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.five_corp.ad.internal.view.H;
import com.five_corp.ad.internal.view.InterfaceC3846f;
import com.five_corp.ad.internal.view.ViewOnTouchListenerC3847g;
import com.five_corp.ad.internal.view.l;
import com.five_corp.ad.internal.view.p;
import com.five_corp.ad.internal.view.u;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d implements h {
    public final a a;
    public final Context b;
    public final com.five_corp.ad.internal.hub.ad_instance.e c;
    public final HashMap d = new HashMap();
    public final u e;
    public com.five_corp.ad.internal.ad.custom_layout.c f;
    public final c g;
    public int h;
    public int i;
    public final com.five_corp.ad.internal.context.h j;
    public final com.five_corp.ad.internal.viewability.a k;
    public g l;

    public d(l lVar, Context context, com.five_corp.ad.internal.hub.ad_instance.e eVar, u uVar, c cVar, com.five_corp.ad.internal.context.h hVar, String str, com.five_corp.ad.internal.viewability.a aVar, com.five_corp.ad.internal.ad.custom_layout.c cVar2, i iVar) {
        a aVar2 = new a(this, context);
        this.a = aVar2;
        this.b = context;
        new Handler(Looper.getMainLooper());
        this.c = eVar;
        this.e = uVar;
        this.g = cVar;
        this.j = hVar;
        this.k = aVar;
        this.f = cVar2;
        iVar.a.add(this);
        this.l = iVar.b;
        lVar.addView(aVar2);
        Drawable a = k.a(str, context.getResources(), eVar);
        if (a != null) {
            View frameLayout = new FrameLayout(context);
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            frameLayout.setBackground(a);
            lVar.addView(frameLayout);
        }
    }

    public final void a(com.five_corp.ad.internal.ad.custom_layout.c cVar) {
        this.a.isInLayout();
        this.f = cVar;
        Iterator it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            H.a((View) ((Map.Entry) it.next()).getValue());
        }
        this.d.clear();
    }

    public final void b(float f, float f2) {
        com.five_corp.ad.internal.soundstate.a aVar;
        ArrayList arrayList;
        com.five_corp.ad.internal.ad.custom_layout.a a = a(f, f2);
        if (a != null) {
            switch (com.five_corp.ad.e.a(a.a)) {
                case 1:
                    Iterator it = this.c.c.iterator();
                    while (it.hasNext()) {
                        ((com.five_corp.ad.f) ((com.five_corp.ad.internal.hub.ad_instance.g) it.next())).h.f();
                    }
                    return;
                case 2:
                    this.g.a();
                    return;
                case 3:
                    this.g.e();
                    return;
                case 4:
                    Iterator it2 = this.c.d.iterator();
                    while (it2.hasNext()) {
                        com.five_corp.ad.internal.soundstate.c cVar = ((com.five_corp.ad.f) ((com.five_corp.ad.internal.hub.ad_instance.h) it2.next())).n;
                        boolean a2 = cVar.a().a();
                        synchronized (cVar.a) {
                            com.five_corp.ad.internal.soundstate.a aVar2 = cVar.b;
                            aVar = new com.five_corp.ad.internal.soundstate.a(!a2 ? 2 : 3, aVar2.b, aVar2.c, aVar2.d);
                            cVar.b = aVar;
                            arrayList = new ArrayList(cVar.c);
                        }
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            ((com.five_corp.ad.f) ((com.five_corp.ad.internal.soundstate.b) it3.next())).b(aVar);
                        }
                    }
                    return;
                case 5:
                    this.g.d();
                    return;
                case 6:
                    this.c.a();
                    return;
                case 7:
                    String str = a.h;
                    if (str != null) {
                        this.c.a(str);
                        return;
                    }
                    return;
                case 8:
                    this.g.c();
                    return;
                default:
                    return;
            }
        }
    }

    public final com.five_corp.ad.internal.ad.custom_layout.a a(float f, float f2) {
        double width = this.a.getWidth() / this.f.a;
        double height = this.a.getHeight();
        double d = height / r4.b;
        Iterator it = this.f.d.iterator();
        com.five_corp.ad.internal.ad.custom_layout.a aVar = null;
        while (it.hasNext()) {
            com.five_corp.ad.internal.ad.custom_layout.a aVar2 = (com.five_corp.ad.internal.ad.custom_layout.a) it.next();
            if (a(this.l, aVar2.g)) {
                double d2 = f;
                if (aVar2.b * width <= d2 && d2 <= (r7 + aVar2.e) * width) {
                    double d3 = f2;
                    if (aVar2.c * d <= d3 && d3 <= (r7 + aVar2.f) * d && (aVar == null || aVar.d < aVar2.d)) {
                        aVar = aVar2;
                    }
                }
            }
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r6.e != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0048, code lost:
    
        if (r6.e == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0055, code lost:
    
        if (r6.e == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(g gVar, com.five_corp.ad.internal.ad.custom_layout.b bVar) {
        boolean z;
        if (bVar == null) {
            return true;
        }
        com.five_corp.ad.internal.ad.custom_layout.l lVar = bVar.a;
        int a = com.five_corp.ad.e.a(lVar.a);
        if (a != 0) {
            if (a == 1) {
                z = gVar.e;
            } else if (a == 2) {
                z = !gVar.e;
            } else if (a != 3) {
                if (a == 4) {
                    Integer num = lVar.b;
                    if (num != null) {
                        if (num.intValue() <= gVar.a) {
                        }
                    }
                }
                z = false;
            } else {
                Integer num2 = lVar.b;
                if (num2 != null) {
                    if (lVar.c != null) {
                        int intValue = num2.intValue();
                        int i = gVar.a;
                        if (intValue <= i) {
                            if (i < lVar.c.intValue()) {
                            }
                        }
                    } else if (num2.intValue() > gVar.a) {
                    }
                }
                z = false;
            }
            if (z) {
                int a2 = com.five_corp.ad.e.a(bVar.b);
                if (a2 != 0 ? a2 != 1 ? a2 != 2 ? false : !gVar.f : gVar.f : true) {
                    int a3 = com.five_corp.ad.e.a(bVar.c);
                    if (a3 != 0 ? a3 != 1 ? a3 != 2 ? false : !gVar.g : gVar.g : true) {
                        return true;
                    }
                }
            }
            return false;
        }
        z = true;
        if (z) {
        }
        return false;
    }

    public final void a() {
        this.a.getParent();
        this.a.setClickable(true);
        this.a.setOnTouchListener(new ViewOnTouchListenerC3847g(this.b, new InterfaceC3846f() { // from class: com.five_corp.ad.internal.layouter.d$$ExternalSyntheticLambda0
            @Override // com.five_corp.ad.internal.view.InterfaceC3846f
            public final void a(float f, float f2) {
                d.this.b(f, f2);
            }
        }, this.c));
        this.a.setBackgroundColor(0);
        if (this.e.getParent() != this.a) {
            H.a(this.e);
            this.a.addView(this.e);
            a(this.a.getWidth(), this.a.getHeight());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0217  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, int i2) {
        boolean z;
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        int i3;
        if (i == 0 || i2 == 0) {
            return;
        }
        com.five_corp.ad.internal.ad.custom_layout.c cVar = this.f;
        Collections.sort(cVar.c, new b());
        Iterator it = cVar.c.iterator();
        ?? r4 = 0;
        int i4 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            com.five_corp.ad.internal.ad.custom_layout.e eVar = (com.five_corp.ad.internal.ad.custom_layout.e) it.next();
            View view = (View) this.d.get(eVar);
            if (a(this.l, eVar.g)) {
                if (view == null) {
                    view = view;
                    switch (com.five_corp.ad.e.a(eVar.a.a)) {
                        case 0:
                            com.five_corp.ad.internal.ad.custom_layout.h hVar = eVar.a.b;
                            view = view;
                            if (hVar != null) {
                                String replace = hVar.a.replace("<br>", "\n");
                                int a = com.five_corp.ad.e.a(hVar.d);
                                if (a == 0) {
                                    i3 = 17;
                                } else if (a == 1) {
                                    i3 = 8388611;
                                } else {
                                    if (a != 2) {
                                        int i5 = hVar.d;
                                        throw new RuntimeException("Unsupported gravity ".concat(i5 != 1 ? i5 != 2 ? i5 != 3 ? POBCommonConstants.NULL_VALUE : "END" : POBOMSDKLogConstants.MSG_OMSDK_START_EVENT : "CENTER"));
                                    }
                                    i3 = 8388613;
                                }
                                Context context = this.b;
                                String str = hVar.b;
                                String str2 = hVar.c;
                                boolean z3 = hVar.e;
                                boolean z4 = hVar.f;
                                TextView textView = new TextView(context);
                                textView.setText(replace);
                                textView.setTextColor(H.a(str));
                                if (z4) {
                                    textView.setTypeface(Typeface.DEFAULT_BOLD);
                                }
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setColor(H.a(str2));
                                gradientDrawable.setCornerRadius(5.0f);
                                if (z3) {
                                    gradientDrawable.setStroke(1, H.a(str));
                                }
                                H.a(textView, gradientDrawable);
                                textView.setGravity(i3);
                                view = textView;
                            }
                            if (view != null && eVar.a.a != 3) {
                                this.d.put(eVar, view);
                                this.k.c(view);
                                break;
                            }
                            break;
                        case 1:
                            com.five_corp.ad.internal.ad.h hVar2 = eVar.a.c;
                            view = view;
                            if (hVar2 != null) {
                                com.five_corp.ad.internal.cache.b a2 = this.j.g.a(this.b, hVar2);
                                a2.setScaleType(ImageView.ScaleType.FIT_XY);
                                view = a2;
                            }
                            if (view != null) {
                                this.d.put(eVar, view);
                                this.k.c(view);
                                break;
                            }
                            break;
                        case 2:
                            view = view;
                            if (this.e.getParent() == this.a) {
                                view = this.e;
                            }
                            if (view != null) {
                            }
                            break;
                        case 3:
                            com.five_corp.ad.internal.ad.custom_layout.j jVar = eVar.a.d;
                            view = view;
                            if (jVar != null) {
                                WebView webView = new WebView(this.b);
                                p.a(webView, this.j.f, jVar, this);
                                webView.setVerticalScrollBarEnabled(r4);
                                webView.setHorizontalScrollBarEnabled(r4);
                                webView.setBackgroundColor(r4);
                                webView.setVisibility(r4);
                                view = webView;
                            }
                            if (view != null) {
                            }
                            break;
                        case 4:
                            view = view;
                            if (eVar.a.e != null) {
                                view = new com.five_corp.ad.internal.view.k(this.b, this.j.g, eVar.a.e);
                            }
                            if (view != null) {
                            }
                            break;
                        case 5:
                            view = view;
                            if (eVar.a.f != null) {
                                view = new com.five_corp.ad.internal.view.i(this.b, eVar.a.f, this.c);
                            }
                            if (view != null) {
                            }
                            break;
                        case 6:
                            com.five_corp.ad.internal.context.h hVar3 = this.j;
                            com.five_corp.ad.internal.ad.h hVar4 = hVar3.a.l;
                            view = view;
                            if (hVar4 != null) {
                                view = hVar3.g.a(this.b, hVar4);
                            }
                            if (view != null) {
                            }
                            break;
                        default:
                            if (view != null) {
                            }
                            break;
                    }
                }
                if (view != null) {
                    int i6 = (eVar.e * i) / cVar.a;
                    com.five_corp.ad.internal.ad.custom_layout.d dVar = eVar.a;
                    if (dVar.a == 1) {
                        TextView textView2 = (TextView) view;
                        com.five_corp.ad.internal.ad.custom_layout.h hVar5 = dVar.b;
                        if (hVar5 != null) {
                            Float valueOf = hVar5.g != null ? Float.valueOf((r9.intValue() * i) / cVar.a) : null;
                            if (valueOf != null) {
                                z = false;
                                textView2.setTextSize(0, valueOf.floatValue());
                                layoutParams = new FrameLayout.LayoutParams(i6, (eVar.f * i2) / cVar.b);
                                layoutParams.leftMargin = (eVar.b * i) / cVar.a;
                                layoutParams.topMargin = (eVar.c * i2) / cVar.b;
                                if (eVar.a.a != 3) {
                                    ViewParent parent = view.getParent();
                                    a aVar = this.a;
                                    if (parent != aVar) {
                                        aVar.addView(view, layoutParams);
                                        i4++;
                                    }
                                }
                                layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
                                if (layoutParams.width == layoutParams2.width || layoutParams.height != layoutParams2.height || layoutParams.leftMargin != layoutParams2.leftMargin || layoutParams.topMargin != layoutParams2.topMargin) {
                                    view.setLayoutParams(layoutParams);
                                }
                                if (!z2 && this.a.indexOfChild(view) != i4) {
                                    z2 = true;
                                }
                                if (z2) {
                                    this.a.bringChildToFront(view);
                                }
                                i4++;
                            }
                        }
                    }
                    z = false;
                    layoutParams = new FrameLayout.LayoutParams(i6, (eVar.f * i2) / cVar.b);
                    layoutParams.leftMargin = (eVar.b * i) / cVar.a;
                    layoutParams.topMargin = (eVar.c * i2) / cVar.b;
                    if (eVar.a.a != 3) {
                    }
                    layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
                    if (layoutParams.width == layoutParams2.width) {
                    }
                    view.setLayoutParams(layoutParams);
                    if (!z2) {
                        z2 = true;
                    }
                    if (z2) {
                    }
                    i4++;
                }
                z = false;
            } else {
                H.a(view);
                z = r4;
            }
            r4 = z;
        }
    }
}
