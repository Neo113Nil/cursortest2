package yads;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ak3 extends ek3 {
    public final t8 c;
    public final yj3 d;
    public final b72 e;
    public final xj3 f;
    public final n62 g;
    public wj3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak3(yu2 yu2Var, q72 q72Var, ii3 ii3Var, v3 v3Var, t8 t8Var, t41 t41Var, s62 s62Var, x32 x32Var, sz1 sz1Var, ri2 ri2Var, bz2 bz2Var) {
        super(q72Var);
        yj3 yj3Var = new yj3();
        this.c = t8Var;
        this.d = yj3Var;
        this.e = new b72(q72Var.getContext(), this, ii3Var, v3Var, yu2Var, t8Var, t41Var, s62Var, x32Var, ri2Var, bz2Var);
        ((nt3) yu2Var).getClass();
        this.f = new xj3(new zt3());
        this.g = sz1Var.a;
        t41Var.a.add(yj3Var);
    }

    @Override // yads.ek3
    public final void a(View view) {
        q72 q72Var = (q72) view;
        b72 b72Var = this.e;
        y62 y62Var = b72Var.e;
        if (y62Var != null) {
            me2 me2Var = y62Var.m;
            if (me2Var != null) {
                me2Var.b.stop();
                dl1 dl1Var = q72Var.c.b;
                if (dl1Var != null) {
                    CheckBox muteControl = dl1Var.getMuteControl();
                    if (muteControl != null) {
                        muteControl.setOnClickListener(null);
                        muteControl.setVisibility(8);
                    }
                    ProgressBar videoProgress = dl1Var.getVideoProgress();
                    if (videoProgress != null) {
                        videoProgress.setProgress(0);
                        videoProgress.setVisibility(8);
                    }
                    TextView countDownProgress = dl1Var.getCountDownProgress();
                    if (countDownProgress != null) {
                        countDownProgress.setText("");
                        countDownProgress.setVisibility(8);
                    }
                }
            }
            y62Var.h.b(q72Var);
        }
        w32 w32Var = b72Var.f;
        if (w32Var != null) {
            b72Var.a.a.remove(w32Var);
            b72Var.f = null;
        }
        q72Var.setOnAttachStateChangeListener(null);
        q72Var.setVisibility(8);
        q72Var.setOnClickListener(null);
        q72Var.setOnTouchListener(null);
        q72Var.setSelected(false);
    }

    @Override // yads.ek3
    public final void b(View view, Object obj) {
        zo0 zo0Var;
        q31 q31Var;
        q72 q72Var = (q72) view;
        de3 de3Var = (de3) obj;
        we3 we3Var = (we3) CollectionsKt.first(de3Var.a);
        wj3 a = this.f.a(q72Var.getContext(), we3Var, zf3.e);
        this.h = a;
        this.d.a = a;
        n62 n62Var = this.g;
        Context context = q72Var.getContext();
        t8 t8Var = this.c;
        n62Var.getClass();
        String str = we3Var.f;
        boolean a2 = tq0.a(context, sq0.c);
        v62[] v62VarArr = v62.b;
        if (Intrinsics.areEqual("first_video_preloading_strategy", t8Var.v) && a2) {
            eu0 eu0Var = n62Var.c;
            synchronized (eu0Var.d) {
                try {
                    y52 y52Var = eu0Var.b;
                    zj0 zj0Var = (zj0) y52Var.b.getValue();
                    if (zj0Var != null) {
                        zj0Var.c++;
                        zj0Var.a.obtainMessage(7, str).sendToTarget();
                    }
                    y52Var.c.remove(str);
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            n62Var.b.a(str);
        }
        b72 b72Var = this.e;
        u52 u52Var = b72Var.d;
        we3 we3Var2 = (we3) CollectionsKt.first(de3Var.a);
        zo0 a3 = u52Var.b.a.a(we3Var2);
        if (a3 == null || a3.j) {
            je0 je0Var = u52Var.a;
            sn0 sn0Var = new sn0(je0Var.d, je0Var.a, je0Var.b, je0Var.c);
            tf1 tf1Var = sn0Var.d;
            bu2 bu2Var = sn0Var.e;
            de0 de0Var = null;
            yd2 yd2Var = bu2Var != null ? bu2Var.O0 : null;
            tf1Var.getClass();
            if (yd2Var != null) {
                Integer num = yd2Var.a;
                int intValue = num != null ? num.intValue() : 50000;
                Integer num2 = yd2Var.b;
                int intValue2 = num2 != null ? num2.intValue() : 50000;
                Integer num3 = yd2Var.c;
                int intValue3 = num3 != null ? num3.intValue() : 2500;
                Integer num4 = yd2Var.d;
                int intValue4 = num4 != null ? num4.intValue() : 5000;
                de0.a(intValue3, 0, "bufferForPlaybackMs", "0");
                de0.a(intValue4, 0, "bufferForPlaybackAfterRebufferMs", "0");
                de0.a(intValue, intValue3, "minBufferMs", "bufferForPlaybackMs");
                de0.a(intValue, intValue4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                de0.a(intValue2, intValue, "maxBufferMs", "minBufferMs");
                Integer num5 = yd2Var.e;
                de0Var = new de0(new ub0(), intValue, intValue2, intValue3, intValue4, num5 != null ? num5.intValue() : -1, true);
            }
            pn0 pn0Var = new pn0(sn0Var.f);
            ve0 ve0Var = new ve0(sn0Var.f);
            ve0Var.d = true;
            pn0 c = pn0Var.c(ve0Var);
            if (de0Var != null) {
                c.b(de0Var);
            }
            if (c.r) {
                throw new IllegalStateException();
            }
            c.r = true;
            zo0 zo0Var2 = new zo0(new xn0(c), new an1(sn0Var.f), new ti3(sn0Var.f, sn0Var.a, sn0Var.b, sn0Var.c));
            u52Var.b.a.a(we3Var2, zo0Var2);
            zo0Var = zo0Var2;
        } else {
            zo0Var = a3;
        }
        Context context2 = q72Var.getContext();
        z62 z62Var = b72Var.b;
        zo0 zo0Var3 = zo0Var;
        y62 y62Var = new y62(context2, z62Var.e, z62Var.d, zo0Var, de3Var, z62Var.b, z62Var.a, new sf3(z62Var.c, z62Var.e), a, z62Var.f, z62Var.g, z62Var.h, z62Var.i);
        b72Var.e = y62Var;
        r52 r52Var = y62Var.f;
        ii3 ii3Var = y62Var.a;
        r52Var.getClass();
        Double d = ii3Var.d;
        r52Var.b.a.a((float) (d != null ? d.doubleValue() : 0.0d));
        gj3 gj3Var = ii3Var.a;
        zo0 zo0Var4 = r52Var.a;
        if (!zo0Var4.j) {
            dj3 dj3Var = zo0Var4.e;
            dj3Var.e = gj3Var;
            dj3Var.b();
        }
        y62Var.h.a(q72Var);
        mi3 mi3Var = q72Var.a;
        nj2 nj2Var = y62Var.g;
        nj2Var.getClass();
        ImageView imageView = mi3Var.b;
        ProgressBar progressBar = mi3Var.a;
        if (imageView == null || (q31Var = nj2Var.a.c) == null) {
            progressBar.setVisibility(0);
        } else {
            nj2Var.b.a(q31Var, new mj2(imageView, progressBar));
        }
        y62Var.a(y62Var.j);
        w32 w32Var = new w32(zo0Var3);
        b72Var.f = w32Var;
        x32 x32Var = b72Var.a;
        x32Var.a.add(w32Var);
        if (x32Var.b) {
            zo0Var3.a();
        }
        q72Var.setOnAttachStateChangeListener(new z52(zo0Var3, q72Var));
    }

    @Override // yads.ek3
    public final void a(ph phVar, hk3 hk3Var, Object obj) {
        q72 q72Var;
        de3 de3Var = (de3) obj;
        q72 q72Var2 = (q72) b();
        if (q72Var2 != null) {
            hk3Var.a(q72Var2, phVar);
            if (de3Var == null || this.h == null) {
                return;
            }
            we3 we3Var = (we3) CollectionsKt.first(de3Var.a);
            hk3Var.a(phVar, new mh3(q72Var2, we3Var.a));
            b72 b72Var = this.e;
            b72Var.c.getClass();
            int i = ((t62) we3Var.d).c;
            q72Var2.setAspectRatio(i != 0 ? r5.b / i : 1.7777778f);
            y62 y62Var = b72Var.e;
            if (y62Var == null || (q72Var = (q72) y62Var.b.b()) == null) {
                return;
            }
            q72Var.setClickable(false);
        }
    }

    @Override // yads.ek3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }

    @Override // yads.ek3
    public final void a() {
        wj3 wj3Var = this.h;
        if (wj3Var != null) {
            wj3Var.k();
        }
        this.d.a = null;
    }
}
