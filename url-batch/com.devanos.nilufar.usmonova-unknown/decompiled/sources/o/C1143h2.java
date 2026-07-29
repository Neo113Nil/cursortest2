package o;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.util.Arrays;

/* renamed from: o.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1143h2 implements ZY {
    public int h;
    public Object i;

    public /* synthetic */ C1143h2(int i, Object obj) {
        this.i = obj;
        this.h = i;
    }

    public void b(long j) {
        if (e(j)) {
            return;
        }
        int i = this.h;
        long[] jArr = (long[]) this.i;
        if (i >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            this.i = copyOf;
        }
        ((long[]) this.i)[i] = j;
        if (i >= this.h) {
            this.h = i + 1;
        }
    }

    public C0441Qx c(Float f, int i) {
        C0441Qx c0441Qx = new C0441Qx(f, AbstractC0012Aj.a);
        ((C2340zD) this.i).h(i, c0441Qx);
        return c0441Qx;
    }

    @Override // o.ZY
    public int d() {
        return 0;
    }

    public boolean e(long j) {
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.i)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    @Override // o.YY
    public V3 f(long j, V3 v3, V3 v32, V3 v33) {
        return ((C0950e6) this.i).f(j, v3, v32, v33);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC1209i2 g() {
        C0880d2 c0880d2 = (C0880d2) this.i;
        DialogInterfaceC1209i2 dialogInterfaceC1209i2 = new DialogInterfaceC1209i2(c0880d2.a, this.h);
        View view = c0880d2.e;
        C1077g2 c1077g2 = dialogInterfaceC1209i2.m;
        if (view != null) {
            c1077g2.n = view;
        } else {
            CharSequence charSequence = c0880d2.d;
            if (charSequence != null) {
                c1077g2.d = charSequence;
                TextView textView = c1077g2.l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0880d2.c;
            if (drawable != null) {
                c1077g2.j = drawable;
                ImageView imageView = c1077g2.k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c1077g2.k.setImageDrawable(drawable);
                }
            }
        }
        if (c0880d2.g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0880d2.b.inflate(c1077g2.r, (ViewGroup) null);
            int i = c0880d2.i ? c1077g2.s : c1077g2.t;
            Object obj = c0880d2.g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C1011f2(c0880d2.a, i, R.id.text1, null);
            }
            c1077g2.f166o = r7;
            c1077g2.p = c0880d2.j;
            if (c0880d2.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0814c2(c0880d2, c1077g2));
            }
            if (c0880d2.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c1077g2.e = alertController$RecycleListView;
        }
        dialogInterfaceC1209i2.setCancelable(true);
        dialogInterfaceC1209i2.setCanceledOnTouchOutside(true);
        dialogInterfaceC1209i2.setOnCancelListener(null);
        dialogInterfaceC1209i2.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0891dC dialogInterfaceOnKeyListenerC0891dC = c0880d2.f;
        if (dialogInterfaceOnKeyListenerC0891dC != null) {
            dialogInterfaceC1209i2.setOnKeyListener(dialogInterfaceOnKeyListenerC0891dC);
        }
        return dialogInterfaceC1209i2;
    }

    public void h(int i) {
        int i2 = this.h;
        if (i < i2) {
            int i3 = i2 - 1;
            while (i < i3) {
                long[] jArr = (long[]) this.i;
                int i4 = i + 1;
                jArr[i] = jArr[i4];
                i = i4;
            }
            this.h--;
        }
    }

    @Override // o.ZY
    public int i() {
        return this.h;
    }

    @Override // o.YY
    public V3 j(long j, V3 v3, V3 v32, V3 v33) {
        return ((C0950e6) this.i).j(j, v3, v32, v33);
    }

    public void k(float f) {
        ((Paint) this.i).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void l(int i) {
        if (this.h == i) {
            return;
        }
        this.h = i;
        Paint paint = (Paint) this.i;
        if (Build.VERSION.SDK_INT >= 29) {
            X10.a.a(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER));
        }
    }

    public void m(int i) {
        ((Paint) this.i).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public /* synthetic */ C1143h2(Object[] objArr, int i) {
        this.h = i;
        this.i = objArr;
    }

    public C1143h2(C0162Gd c0162Gd, int i) {
        AbstractC1473m3.n(c0162Gd);
        this.i = c0162Gd;
        this.h = i;
    }

    public C1143h2(Context context) {
        int f = DialogInterfaceC1209i2.f(context, 0);
        this.i = new C0880d2(new ContextThemeWrapper(context, DialogInterfaceC1209i2.f(context, f)));
        this.h = f;
    }

    public C1143h2() {
        this.h = 300;
        C2340zD c2340zD = AbstractC0999et.a;
        this.i = new C2340zD();
    }

    public C1143h2(int i, InterfaceC2372zj interfaceC2372zj) {
        this.h = i;
        this.i = new C0950e6(new C2177wm(i, interfaceC2372zj));
    }
}
