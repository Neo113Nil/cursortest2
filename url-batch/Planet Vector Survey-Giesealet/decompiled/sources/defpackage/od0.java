package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.text.LineBreakConfig;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vectorharbor.planetvectorsurvey.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class od0 {
    public static final void a(final boolean z, final qu quVar, ih ihVar, final int i) {
        qh qhVar = (qh) ihVar;
        qhVar.W(-642000585);
        int i2 = 2;
        int i3 = (qhVar.g(z) ? 4 : 2) | i | (qhVar.h(quVar) ? 32 : 16);
        if (qhVar.N(i3 & 1, (i3 & 19) != 18)) {
            Object obj = (g90) qhVar.j(o30.a);
            if (obj == null) {
                qhVar.V(950836184);
                View view = (View) qhVar.j(AndroidCompositionLocals_androidKt.f);
                view.getClass();
                while (true) {
                    if (view == null) {
                        obj = null;
                        break;
                    }
                    Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                    g90 g90Var = tag instanceof g90 ? (g90) tag : null;
                    if (g90Var != null) {
                        obj = g90Var;
                        break;
                    } else {
                        Object k = ud0.k(view);
                        view = k instanceof View ? (View) k : null;
                    }
                }
                qhVar.q(false);
            } else {
                qhVar.V(950834231);
                qhVar.q(false);
            }
            if (obj == null) {
                qhVar.V(1512740606);
                obj = (fb0) qhVar.j(p30.a);
                if (obj == null) {
                    qhVar.V(1208426157);
                    View view2 = (View) qhVar.j(AndroidCompositionLocals_androidKt.f);
                    view2.getClass();
                    while (true) {
                        if (view2 == null) {
                            obj = null;
                            break;
                        }
                        Object tag2 = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                        fb0 fb0Var = tag2 instanceof fb0 ? (fb0) tag2 : null;
                        if (fb0Var != null) {
                            obj = fb0Var;
                            break;
                        } else {
                            Object k2 = ud0.k(view2);
                            view2 = k2 instanceof View ? (View) k2 : null;
                        }
                    }
                    qhVar.q(false);
                } else {
                    qhVar.V(1208423708);
                    qhVar.q(false);
                }
                if (obj == null) {
                    qhVar.V(1208428160);
                    Object obj2 = (Context) qhVar.j(AndroidCompositionLocals_androidKt.b);
                    while (true) {
                        if (!(obj2 instanceof ContextWrapper)) {
                            obj2 = null;
                            break;
                        } else if (obj2 instanceof fb0) {
                            break;
                        } else {
                            obj2 = ((ContextWrapper) obj2).getBaseContext();
                        }
                    }
                    obj = (fb0) obj2;
                    qhVar.q(false);
                } else {
                    qhVar.V(1208423789);
                    qhVar.q(false);
                }
                qhVar.q(false);
            } else {
                qhVar.V(1512737723);
                qhVar.q(false);
            }
            if (obj == null) {
                g8.s("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean f = qhVar.f(obj);
            Object K = qhVar.K();
            y7 y7Var = hh.a;
            if (f || K == y7Var) {
                g90 g90Var2 = obj instanceof g90 ? (g90) obj : null;
                f90 navigationEventDispatcher = g90Var2 != null ? g90Var2.getNavigationEventDispatcher() : null;
                fb0 fb0Var2 = obj instanceof fb0 ? (fb0) obj : null;
                K = new a9(navigationEventDispatcher, fb0Var2 != null ? fb0Var2.getOnBackPressedDispatcher() : null);
                qhVar.e0(K);
            }
            a9 a9Var = (a9) K;
            Object K2 = qhVar.K();
            if (K2 == y7Var) {
                K2 = mz.z(qhVar);
                qhVar.e0(K2);
            }
            bk bkVar = (bk) K2;
            long j = qhVar.R;
            boolean f2 = qhVar.f(a9Var) | qhVar.e(j);
            Object K3 = qhVar.K();
            if (f2 || K3 == y7Var) {
                K3 = new ug(bkVar, new ih0(j, obj));
                qhVar.e0(K3);
            }
            final ug ugVar = (ug) K3;
            qhVar.V(-348514256);
            boolean h = qhVar.h(ugVar) | qhVar.h(quVar);
            Object K4 = qhVar.K();
            if (h || K4 == y7Var) {
                K4 = new f8(3, ugVar, quVar);
                qhVar.e0(K4);
            }
            mz.p((bu) K4, qhVar);
            Boolean valueOf = Boolean.valueOf(z);
            int i4 = i3 & 14;
            boolean h2 = (i4 == 4) | qhVar.h(ugVar);
            Object K5 = qhVar.K();
            if (h2 || K5 == y7Var) {
                K5 = new mu() { // from class: jh0
                    @Override // defpackage.mu
                    public final Object c(Object obj3) {
                        ug ugVar2 = ug.this;
                        ugVar2.e(z);
                        return new lh0((r20) obj3, ugVar2);
                    }
                };
                qhVar.e0(K5);
            }
            mz.m(valueOf, ugVar, null, (mu) K5, qhVar, i4);
            boolean h3 = qhVar.h(a9Var) | qhVar.h(ugVar);
            Object K6 = qhVar.K();
            if (h3 || K6 == y7Var) {
                K6 = new aw(i2, a9Var, ugVar);
                qhVar.e0(K6);
            }
            mz.i(a9Var, ugVar, (mu) K6, qhVar);
            qhVar.q(false);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new qu(z, quVar, i) { // from class: kh0
                public final /* synthetic */ boolean d;
                public final /* synthetic */ qu e;

                @Override // defpackage.qu
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int v = yc0.v(1);
                    od0.a(this.d, this.e, (ih) obj3, v);
                    return ky0.a;
                }
            };
        }
    }

    public static final zi0 b(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new zi0(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final long c(int i, int i2) {
        if (i < 0 || i2 < 0) {
            dy.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = xv0.c;
        return j;
    }

    public static final boolean d(zi0 zi0Var, zi0 zi0Var2, zi0 zi0Var3, int i) {
        float f;
        float f2;
        boolean e = e(i, zi0Var3, zi0Var);
        float f3 = zi0Var3.b;
        float f4 = zi0Var3.d;
        float f5 = zi0Var3.a;
        float f6 = zi0Var3.c;
        float f7 = zi0Var.d;
        float f8 = zi0Var.b;
        float f9 = zi0Var.c;
        float f10 = zi0Var.a;
        if (!e && e(i, zi0Var2, zi0Var)) {
            if (i == 3) {
                if (f10 < f6) {
                    return true;
                }
            } else if (i == 4) {
                if (f9 > f5) {
                    return true;
                }
            } else if (i == 5) {
                if (f8 < f4) {
                    return true;
                }
            } else if (i != 6) {
                g8.s("This function should only be used for 2-D focus search");
            } else if (f7 > f3) {
                return true;
            }
            if (i == 3 || i == 4) {
                return true;
            }
            if (i == 3) {
                f = f10 - zi0Var2.c;
            } else if (i == 4) {
                f = zi0Var2.a - f9;
            } else if (i == 5) {
                f = f8 - zi0Var2.d;
            } else {
                if (i != 6) {
                    g8.s("This function should only be used for 2-D focus search");
                    return false;
                }
                f = zi0Var2.b - f7;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (i == 3) {
                f2 = f10 - f5;
            } else if (i == 4) {
                f2 = f6 - f9;
            } else if (i == 5) {
                f2 = f8 - f3;
            } else {
                if (i != 6) {
                    g8.s("This function should only be used for 2-D focus search");
                    return false;
                }
                f2 = f4 - f7;
            }
            if (f2 < 1.0f) {
                f2 = 1.0f;
            }
            if (f < f2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean e(int i, zi0 zi0Var, zi0 zi0Var2) {
        if (i == 3 || i == 4) {
            if (zi0Var.d > zi0Var2.b && zi0Var.b < zi0Var2.d) {
                return true;
            }
        } else {
            if (i != 5 && i != 6) {
                g8.s("This function should only be used for 2-D focus search");
                return false;
            }
            if (zi0Var.c > zi0Var2.a && zi0Var.a < zi0Var2.c) {
                return true;
            }
        }
        return false;
    }

    public static final int f(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void g(ts tsVar, l70 l70Var) {
        if (!tsVar.d.q) {
            cy.b("visitChildren called on an unattached node");
        }
        l70 l70Var2 = new l70(new t50[16]);
        t50 t50Var = tsVar.d;
        t50 t50Var2 = t50Var.i;
        if (t50Var2 == null) {
            nz.h(l70Var2, t50Var);
        } else {
            l70Var2.b(t50Var2);
        }
        while (true) {
            int i = l70Var2.f;
            if (i == 0) {
                return;
            }
            t50 t50Var3 = (t50) l70Var2.j(i - 1);
            if ((t50Var3.g & 1024) == 0) {
                nz.h(l70Var2, t50Var3);
            } else {
                while (true) {
                    if (t50Var3 == null) {
                        break;
                    }
                    if ((t50Var3.f & 1024) != 0) {
                        l70 l70Var3 = null;
                        while (t50Var3 != null) {
                            if (t50Var3 instanceof ts) {
                                ts tsVar2 = (ts) t50Var3;
                                if (tsVar2.q && !nz.a0(tsVar2).N) {
                                    if (tsVar2.k0().a) {
                                        l70Var.b(tsVar2);
                                    } else {
                                        g(tsVar2, l70Var);
                                    }
                                }
                            } else if ((t50Var3.f & 1024) != 0 && (t50Var3 instanceof ol)) {
                                int i2 = 0;
                                for (t50 t50Var4 = ((ol) t50Var3).s; t50Var4 != null; t50Var4 = t50Var4.i) {
                                    if ((t50Var4.f & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            t50Var3 = t50Var4;
                                        } else {
                                            if (l70Var3 == null) {
                                                l70Var3 = new l70(new t50[16]);
                                            }
                                            if (t50Var3 != null) {
                                                l70Var3.b(t50Var3);
                                                t50Var3 = null;
                                            }
                                            l70Var3.b(t50Var4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            t50Var3 = nz.j(l70Var3);
                        }
                    } else {
                        t50Var3 = t50Var3.i;
                    }
                }
            }
        }
    }

    public static StaticLayout h(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        if (i2 < 0) {
            dy.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            dy.a("invalid end value");
        }
        if (i3 < 0) {
            dy.a("invalid maxLines value");
        }
        if (i < 0) {
            dy.a("invalid width value");
        }
        if (i4 < 0) {
            dy.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            obtain.setJustificationMode(i5);
        }
        if (i10 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            lineBreakStyle = x0.a().setLineBreakStyle(i7);
            lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i8);
            build = lineBreakWordStyle.build();
            obtain.setLineBreakConfig(build);
        }
        if (i10 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static final ts i(l70 l70Var, zi0 zi0Var, int i) {
        zi0 d;
        ts tsVar = null;
        if (i == 3) {
            d = zi0Var.d((zi0Var.c - zi0Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            d = zi0Var.d(-((zi0Var.c - zi0Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            d = zi0Var.d(0.0f, (zi0Var.d - zi0Var.b) + 1.0f);
        } else {
            if (i != 6) {
                g8.s("This function should only be used for 2-D focus search");
                return null;
            }
            d = zi0Var.d(0.0f, -((zi0Var.d - zi0Var.b) + 1.0f));
        }
        Object[] objArr = l70Var.d;
        int i2 = l70Var.f;
        for (int i3 = 0; i3 < i2; i3++) {
            ts tsVar2 = (ts) objArr[i3];
            if (nz.H(tsVar2)) {
                zi0 w = nz.w(tsVar2);
                if (m(w, d, zi0Var, i)) {
                    tsVar = tsVar2;
                    d = w;
                }
            }
        }
        return tsVar;
    }

    public static final boolean j(ts tsVar, int i, mu muVar) {
        zi0 zi0Var;
        l70 l70Var = new l70(new ts[16]);
        g(tsVar, l70Var);
        int i2 = l70Var.f;
        if (i2 <= 1) {
            ts tsVar2 = (ts) (i2 == 0 ? null : l70Var.d[0]);
            if (tsVar2 != null) {
                return ((Boolean) muVar.c(tsVar2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                zi0 w = nz.w(tsVar);
                float f = w.a;
                float f2 = w.b;
                zi0Var = new zi0(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    g8.s("This function should only be used for 2-D focus search");
                    return false;
                }
                zi0 w2 = nz.w(tsVar);
                float f3 = w2.c;
                float f4 = w2.d;
                zi0Var = new zi0(f3, f4, f3, f4);
            }
            ts i3 = i(l70Var, zi0Var, i);
            if (i3 != null) {
                return ((Boolean) muVar.c(i3)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean k(int i, y5 y5Var, ts tsVar, zi0 zi0Var) {
        if (s(i, y5Var, tsVar, zi0Var)) {
            return true;
        }
        ts tsVar2 = ((ks) ((f3) nz.b0(tsVar)).getFocusOwner()).h;
        nk.J(tsVar);
        return false;
    }

    public static final int l(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean m(zi0 zi0Var, zi0 zi0Var2, zi0 zi0Var3, int i) {
        if (!n(i, zi0Var, zi0Var3)) {
            return false;
        }
        if (n(i, zi0Var2, zi0Var3) && !d(zi0Var3, zi0Var, zi0Var2, i)) {
            return !d(zi0Var3, zi0Var2, zi0Var, i) && o(i, zi0Var3, zi0Var) < o(i, zi0Var3, zi0Var2);
        }
        return true;
    }

    public static final boolean n(int i, zi0 zi0Var, zi0 zi0Var2) {
        float f = zi0Var.b;
        float f2 = zi0Var.d;
        float f3 = zi0Var.a;
        float f4 = zi0Var.c;
        if (i == 3) {
            float f5 = zi0Var2.c;
            float f6 = zi0Var2.a;
            if ((f5 > f4 || f6 >= f4) && f6 > f3) {
                return true;
            }
        } else if (i == 4) {
            float f7 = zi0Var2.a;
            float f8 = zi0Var2.c;
            if ((f7 < f3 || f8 <= f3) && f8 < f4) {
                return true;
            }
        } else if (i == 5) {
            float f9 = zi0Var2.d;
            float f10 = zi0Var2.b;
            if ((f9 > f2 || f10 >= f2) && f10 > f) {
                return true;
            }
        } else {
            if (i != 6) {
                g8.s("This function should only be used for 2-D focus search");
                return false;
            }
            float f11 = zi0Var2.b;
            float f12 = zi0Var2.d;
            if ((f11 < f || f12 <= f) && f12 < f2) {
                return true;
            }
        }
        return false;
    }

    public static final long o(int i, zi0 zi0Var, zi0 zi0Var2) {
        float f;
        float f2;
        float f3 = zi0Var2.b;
        float f4 = zi0Var2.d;
        float f5 = zi0Var2.a;
        float f6 = zi0Var2.c;
        if (i == 3) {
            f = zi0Var.a - f6;
        } else if (i == 4) {
            f = f5 - zi0Var.c;
        } else if (i == 5) {
            f = zi0Var.b - f4;
        } else {
            if (i != 6) {
                g8.s("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = f3 - zi0Var.d;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        long j = (long) f;
        if (i == 3 || i == 4) {
            float f7 = zi0Var.b;
            f2 = (((zi0Var.d - f7) / 2.0f) + f7) - (((f4 - f3) / 2.0f) + f3);
        } else {
            if (i != 5 && i != 6) {
                g8.s("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = zi0Var.a;
            f2 = (((zi0Var.c - f8) / 2.0f) + f8) - (((f6 - f5) / 2.0f) + f5);
        }
        long j2 = (long) f2;
        return (j2 * j2) + (13 * j * j);
    }

    public static jq0 p(qu quVar) {
        jq0 jq0Var = new jq0();
        jq0Var.f = d31.p(jq0Var, jq0Var, quVar);
        return jq0Var;
    }

    public static e40 q(cm0 cm0Var, int i, int i2, int i3, int i4, int i5, f40 f40Var, List list, yf0[] yf0VarArr, int i6) {
        int[] iArr;
        String str;
        float f;
        String str2;
        long j;
        String str3;
        long j2;
        int i7;
        cm0 cm0Var2;
        int i8;
        int g;
        int i9;
        String str4;
        int i10;
        String str5;
        int i11;
        float f2;
        boolean z;
        int i12;
        float f3;
        int i13;
        List list2 = list;
        int i14 = i6;
        long j3 = i5;
        int[] iArr2 = new int[i14];
        float f4 = 0.0f;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i15 >= i14) {
                break;
            }
            b50 b50Var = (b50) list2.get(i15);
            int i20 = i15;
            Object f5 = b50Var.f();
            int i21 = i18;
            dm0 dm0Var = f5 instanceof dm0 ? (dm0) f5 : null;
            float f6 = dm0Var != null ? dm0Var.a : 0.0f;
            if (f6 > 0.0f) {
                f4 += f6;
                i16++;
                i18 = i21;
            } else {
                int i22 = i3 - i17;
                yf0 yf0Var = yf0VarArr[i20];
                if (yf0Var == null) {
                    i13 = i22;
                    f3 = f4;
                    yf0Var = b50Var.d(cm0Var.b(0, i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i13 < 0 ? 0 : i13, i4, false));
                } else {
                    f3 = f4;
                    i13 = i22;
                }
                int e = cm0Var.e(yf0Var);
                int c = cm0Var.c(yf0Var);
                iArr2[i20] = e;
                int i23 = i13 - e;
                if (i23 < 0) {
                    i23 = 0;
                }
                int min = Math.min(i5, i23);
                i17 += e + min;
                i19 = Math.max(i19, c);
                yf0VarArr[i20] = yf0Var;
                i18 = min;
                f4 = f3;
            }
            i15 = i20 + 1;
        }
        float f7 = f4;
        int i24 = i18;
        int i25 = i19;
        if (i16 == 0) {
            i17 -= i24;
            cm0Var2 = cm0Var;
            iArr = iArr2;
            i7 = i25;
            g = 0;
            i8 = 0;
        } else {
            int i26 = i3 != Integer.MAX_VALUE ? i3 : i;
            long j4 = (i16 - 1) * j3;
            iArr = iArr2;
            long j5 = (i26 - i17) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f8 = j5 / f7;
            long j6 = j5;
            int i27 = 0;
            while (true) {
                str = "weightedSize ";
                f = f8;
                str2 = "arrangementSpacingTotal ";
                j = j5;
                str3 = "fixedSpace ";
                j2 = j4;
                if (i27 >= i14) {
                    break;
                }
                int i28 = i27;
                Object f9 = ((b50) list2.get(i27)).f();
                dm0 dm0Var2 = f9 instanceof dm0 ? (dm0) f9 : null;
                float f10 = dm0Var2 != null ? dm0Var2.a : 0.0f;
                float f11 = f * f10;
                try {
                    j6 -= Math.round(f11);
                    i27 = i28 + 1;
                    list2 = list;
                    i14 = i6;
                    f8 = f;
                    j5 = j;
                    j4 = j2;
                } catch (IllegalArgumentException e2) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i3 + "mainAxisMin " + i + "targetSpace " + i26 + "arrangementSpacingPx " + j3 + "weightChildrenCount " + i16 + "fixedSpace " + i17 + "arrangementSpacingTotal " + j2 + "remainingToTarget " + j + "totalWeight " + f7 + "weightUnitSpace " + f + "itemWeight " + f10 + str + f11).initCause(e2);
                }
            }
            i7 = i25;
            int i29 = 0;
            int i30 = 0;
            while (i29 < i6) {
                if (yf0VarArr[i29] == null) {
                    i9 = i29;
                    b50 b50Var2 = (b50) list.get(i29);
                    Object f12 = b50Var2.f();
                    str5 = str2;
                    dm0 dm0Var3 = f12 instanceof dm0 ? (dm0) f12 : null;
                    float f13 = dm0Var3 != null ? dm0Var3.a : 0.0f;
                    if (f13 <= 0.0f) {
                        g8.s("All weights <= 0 should have placeables");
                        return null;
                    }
                    float f14 = f13;
                    int signum = Long.signum(j6);
                    int i31 = i16;
                    i10 = i17;
                    j6 -= signum;
                    float f15 = f * f14;
                    int max = Math.max(0, Math.round(f15) + signum);
                    if (dm0Var3 != null) {
                        try {
                            z = dm0Var3.b;
                        } catch (IllegalArgumentException e3) {
                            e = e3;
                            str4 = str3;
                            f2 = f15;
                            throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i3 + "mainAxisMin " + i + "targetSpace " + i26 + "arrangementSpacingPx " + j3 + "weightChildrenCount " + i31 + str4 + i10 + str5 + j2 + "remainingToTarget " + j + "totalWeight " + f7 + "weightUnitSpace " + f + "weight " + f14 + str + f2 + "crossAxisDesiredSize nullremainderUnit " + signum + "childMainAxisSize " + max).initCause(e);
                        }
                    } else {
                        z = true;
                    }
                    try {
                        if (z && max != Integer.MAX_VALUE) {
                            i12 = max;
                            str4 = str3;
                            f2 = f15;
                            yf0 d = b50Var2.d(cm0Var.b(i12, max, i4, true));
                            int e4 = cm0Var.e(d);
                            int c2 = cm0Var.c(d);
                            iArr[i9] = e4;
                            i30 += e4;
                            int max2 = Math.max(i7, c2);
                            yf0VarArr[i9] = d;
                            i7 = max2;
                            i11 = i31;
                        }
                        yf0 d2 = b50Var2.d(cm0Var.b(i12, max, i4, true));
                        int e42 = cm0Var.e(d2);
                        int c22 = cm0Var.c(d2);
                        iArr[i9] = e42;
                        i30 += e42;
                        int max22 = Math.max(i7, c22);
                        yf0VarArr[i9] = d2;
                        i7 = max22;
                        i11 = i31;
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                        throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i3 + "mainAxisMin " + i + "targetSpace " + i26 + "arrangementSpacingPx " + j3 + "weightChildrenCount " + i31 + str4 + i10 + str5 + j2 + "remainingToTarget " + j + "totalWeight " + f7 + "weightUnitSpace " + f + "weight " + f14 + str + f2 + "crossAxisDesiredSize nullremainderUnit " + signum + "childMainAxisSize " + max).initCause(e);
                    }
                    i12 = 0;
                    str4 = str3;
                    f2 = f15;
                } else {
                    i9 = i29;
                    str4 = str3;
                    i10 = i17;
                    str5 = str2;
                    i11 = i16;
                }
                i29 = i9 + 1;
                str = str;
                i16 = i11;
                str2 = str5;
                i17 = i10;
                str3 = str4;
            }
            cm0Var2 = cm0Var;
            i8 = 0;
            g = rg0.g((int) (i30 + j2), 0, i3 - i17);
        }
        int i32 = g + i17;
        if (i32 < 0) {
            i32 = i8;
        }
        int max3 = Math.max(i32, i);
        int max4 = Math.max(i7, Math.max(i2, i8));
        int[] iArr3 = new int[i6];
        for (int i33 = i8; i33 < i6; i33++) {
            iArr3[i33] = i8;
        }
        cm0Var2.d(max3, f40Var, iArr, iArr3);
        return cm0Var2.a(yf0VarArr, f40Var, iArr3, max3, max4);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final md0 r(int i, qh qhVar) {
        TypedValue typedValue;
        int i2;
        boolean z;
        long j;
        int i3;
        int eventType;
        XmlResourceParser xmlResourceParser;
        int i4;
        int i5;
        int i6;
        int i7;
        TypedArray obtainStyledAttributes;
        int i8;
        TypedArray obtainStyledAttributes2;
        int i9;
        int i10;
        Shader shader;
        int i11;
        px0 ks0Var;
        ColorStateList colorStateList;
        Context context = (Context) qhVar.j(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) qhVar.j(AndroidCompositionLocals_androidKt.c);
        rk0 rk0Var = (rk0) qhVar.j(AndroidCompositionLocals_androidKt.e);
        synchronized (rk0Var) {
            typedValue = (TypedValue) rk0Var.a.b(i);
            i2 = 1;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                p60 p60Var = rk0Var.a;
                int d = p60Var.d(i);
                Object[] objArr = p60Var.c;
                Object obj = objArr[d];
                p60Var.b[d] = i;
                objArr[d] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            if (charSequence instanceof String ? ((String) charSequence).endsWith(".xml") : tt0.x(charSequence, charSequence.length() - 4, ".xml", 0, 4, false)) {
                z = true;
                if (z) {
                    qhVar.V(-1771631096);
                    boolean f = qhVar.f(context.getTheme()) | qhVar.f(charSequence) | qhVar.d(i);
                    Object K = qhVar.K();
                    if (f || K == hh.a) {
                        try {
                            Drawable drawable = resources.getDrawable(i, null);
                            drawable.getClass();
                            K = new x4(((BitmapDrawable) drawable).getBitmap());
                            qhVar.e0(K);
                        } catch (Exception e) {
                            throw new kf("Error attempting to load resource: " + ((Object) charSequence), e);
                        }
                    }
                    p9 p9Var = new p9((x4) K);
                    qhVar.q(false);
                    return p9Var;
                }
                qhVar.V(-1771786530);
                Resources.Theme theme = context.getTheme();
                int i12 = typedValue.changingConfigurations;
                dx dxVar = (dx) qhVar.j(AndroidCompositionLocals_androidKt.d);
                cx cxVar = new cx(theme, i);
                WeakReference weakReference = (WeakReference) dxVar.a.get(cxVar);
                bx bxVar = weakReference != null ? (bx) weakReference.get() : null;
                if (bxVar == null) {
                    XmlResourceParser xml = resources.getXml(i);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (!nz.l(xml.getName(), "vector")) {
                        g8.r("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                        return null;
                    }
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    t5 t5Var = new t5(xml);
                    int[] iArr = nk.a;
                    TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
                    t5Var.c(obtainAttributes.getChangingConfigurations());
                    boolean z2 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) ? false : obtainAttributes.getBoolean(5, false);
                    t5Var.c(obtainAttributes.getChangingConfigurations());
                    float b = t5Var.b(obtainAttributes, "viewportWidth", 7, 0.0f);
                    float b2 = t5Var.b(obtainAttributes, "viewportHeight", 8, 0.0f);
                    if (b <= 0.0f) {
                        throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                    }
                    if (b2 <= 0.0f) {
                        throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                    }
                    int i13 = 3;
                    float dimension = obtainAttributes.getDimension(3, 0.0f);
                    t5Var.c(obtainAttributes.getChangingConfigurations());
                    float dimension2 = obtainAttributes.getDimension(2, 0.0f);
                    t5Var.c(obtainAttributes.getChangingConfigurations());
                    if (obtainAttributes.hasValue(1)) {
                        TypedValue typedValue2 = new TypedValue();
                        obtainAttributes.getValue(1, typedValue2);
                        if (typedValue2.type == 2) {
                            j = ge.g;
                        } else {
                            if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                                TypedValue typedValue3 = new TypedValue();
                                obtainAttributes.getValue(1, typedValue3);
                                int i14 = typedValue3.type;
                                if (i14 == 2) {
                                    throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                                }
                                if (i14 < 28 || i14 > 31) {
                                    Resources resources2 = obtainAttributes.getResources();
                                    int resourceId = obtainAttributes.getResourceId(1, 0);
                                    ThreadLocal threadLocal = re.a;
                                    try {
                                        colorStateList = re.a(resources2, resources2.getXml(resourceId), theme);
                                    } catch (Exception e2) {
                                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                                    }
                                } else {
                                    colorStateList = ColorStateList.valueOf(typedValue3.data);
                                }
                                t5Var.c(obtainAttributes.getChangingConfigurations());
                                j = colorStateList == null ? d31.c(colorStateList.getDefaultColor()) : ge.g;
                            }
                            colorStateList = null;
                            t5Var.c(obtainAttributes.getChangingConfigurations());
                            if (colorStateList == null) {
                            }
                        }
                    } else {
                        j = ge.g;
                    }
                    int i15 = obtainAttributes.getInt(6, -1);
                    t5Var.c(obtainAttributes.getChangingConfigurations());
                    if (i15 != -1) {
                        if (i15 == 3) {
                            i3 = 3;
                        } else if (i15 != 5) {
                            if (i15 != 9) {
                                switch (i15) {
                                    case 14:
                                        i3 = 13;
                                        break;
                                    case 15:
                                        i3 = 14;
                                        break;
                                    case 16:
                                        i3 = 12;
                                        break;
                                }
                            } else {
                                i3 = 9;
                            }
                        }
                        float f2 = dimension / resources.getDisplayMetrics().density;
                        float f3 = dimension2 / resources.getDisplayMetrics().density;
                        obtainAttributes.recycle();
                        zw zwVar = new zw(f2, f3, b, b2, j, i3, z2, 1);
                        int i16 = 0;
                        while (xml.getEventType() != i2 && (xml.getDepth() >= i2 || xml.getEventType() != i13)) {
                            List list = wp.d;
                            XmlPullParser xmlPullParser = t5Var.a;
                            int i17 = i2;
                            z1 z1Var = t5Var.c;
                            eventType = xmlPullParser.getEventType();
                            int i18 = i12;
                            if (eventType != 2) {
                                String name = xmlPullParser.getName();
                                if (name != null) {
                                    int hashCode = name.hashCode();
                                    if (hashCode != -1649314686) {
                                        xmlResourceParser = xml;
                                        if (hashCode != 3433509) {
                                            if (hashCode == 98629247 && name.equals("group")) {
                                                int[] iArr2 = nk.b;
                                                TypedArray obtainAttributes2 = theme == null ? resources.obtainAttributes(asAttributeSet, iArr2) : theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                                                t5Var.c(obtainAttributes2.getChangingConfigurations());
                                                float b3 = t5Var.b(obtainAttributes2, "rotation", 5, 0.0f);
                                                float f4 = obtainAttributes2.getFloat(i17, 0.0f);
                                                t5Var.c(obtainAttributes2.getChangingConfigurations());
                                                float f5 = obtainAttributes2.getFloat(2, 0.0f);
                                                t5Var.c(obtainAttributes2.getChangingConfigurations());
                                                float b4 = t5Var.b(obtainAttributes2, "scaleX", 3, 1.0f);
                                                float b5 = t5Var.b(obtainAttributes2, "scaleY", 4, 1.0f);
                                                float b6 = t5Var.b(obtainAttributes2, "translateX", 6, 0.0f);
                                                float b7 = t5Var.b(obtainAttributes2, "translateY", 7, 0.0f);
                                                String string = obtainAttributes2.getString(0);
                                                t5Var.c(obtainAttributes2.getChangingConfigurations());
                                                String str = string == null ? "" : string;
                                                obtainAttributes2.recycle();
                                                int i19 = fz0.a;
                                                if (zwVar.k) {
                                                    cy.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                }
                                                zwVar.i.add(new yw(str, b3, f4, f5, b4, b5, b6, b7, list, 512));
                                                i5 = 1;
                                            }
                                        } else if (name.equals("path")) {
                                            int[] iArr3 = nk.c;
                                            if (theme == null) {
                                                obtainStyledAttributes2 = resources.obtainAttributes(asAttributeSet, iArr3);
                                                i8 = 0;
                                            } else {
                                                i8 = 0;
                                                obtainStyledAttributes2 = theme.obtainStyledAttributes(asAttributeSet, iArr3, 0, 0);
                                            }
                                            t5Var.c(obtainStyledAttributes2.getChangingConfigurations());
                                            if ((xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null ? 1 : i8) == 0) {
                                                g8.r("No path data available");
                                                return null;
                                            }
                                            String string2 = obtainStyledAttributes2.getString(i8);
                                            t5Var.c(obtainStyledAttributes2.getChangingConfigurations());
                                            String str2 = string2 == null ? "" : string2;
                                            String string3 = obtainStyledAttributes2.getString(2);
                                            t5Var.c(obtainStyledAttributes2.getChangingConfigurations());
                                            if (string3 == null) {
                                                int i20 = fz0.a;
                                            } else {
                                                list = z1.a(z1Var, string3);
                                            }
                                            List list2 = list;
                                            a7 a = t5Var.a(obtainStyledAttributes2, theme, "fillColor", 1);
                                            float b8 = t5Var.b(obtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                            int i21 = !ud0.m(t5Var.a, "strokeLineCap") ? -1 : obtainStyledAttributes2.getInt(8, -1);
                                            t5Var.c(obtainStyledAttributes2.getChangingConfigurations());
                                            if (i21 != 0) {
                                                if (i21 != 1) {
                                                    i9 = 2;
                                                    if (i21 == 2) {
                                                        i10 = 2;
                                                    }
                                                } else {
                                                    i9 = 2;
                                                    i10 = 1;
                                                }
                                                int i22 = ud0.m(t5Var.a, "strokeLineJoin") ? -1 : obtainStyledAttributes2.getInt(9, -1);
                                                t5Var.c(obtainStyledAttributes2.getChangingConfigurations());
                                                int i23 = i22 == 0 ? i22 != 1 ? i9 : 1 : 0;
                                                float b9 = t5Var.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 1.0f);
                                                a7 a2 = t5Var.a(obtainStyledAttributes2, theme, "strokeColor", 3);
                                                float b10 = t5Var.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                float b11 = t5Var.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                float b12 = t5Var.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                float b13 = t5Var.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                float b14 = t5Var.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                int i24 = ud0.m(t5Var.a, "fillType") ? 0 : obtainStyledAttributes2.getInt(13, 0);
                                                t5Var.c(obtainStyledAttributes2.getChangingConfigurations());
                                                obtainStyledAttributes2.recycle();
                                                shader = (Shader) a.c;
                                                int i25 = a.b;
                                                if (shader == null && i25 == 0) {
                                                    i11 = i16;
                                                    ks0Var = null;
                                                } else if (shader == null) {
                                                    ks0Var = new za(shader);
                                                    i11 = i16;
                                                } else {
                                                    i11 = i16;
                                                    ks0Var = new ks0(d31.c(i25));
                                                }
                                                Shader shader2 = (Shader) a2.c;
                                                int i26 = a2.b;
                                                px0 zaVar = (shader2 == null && i26 == 0) ? null : shader2 != null ? new za(shader2) : new ks0(d31.c(i26));
                                                int i27 = i24 != 0 ? 0 : 1;
                                                if (zwVar.k) {
                                                    cy.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                }
                                                ((yw) zwVar.i.get(r0.size() - 1)).j.add(new iz0(str2, list2, i27, ks0Var, b8, zaVar, b10, b11, i10, i23, b9, b14, b12, b13));
                                                i16 = i11;
                                                i5 = 1;
                                            } else {
                                                i9 = 2;
                                            }
                                            i10 = 0;
                                            if (ud0.m(t5Var.a, "strokeLineJoin")) {
                                            }
                                            t5Var.c(obtainStyledAttributes2.getChangingConfigurations());
                                            if (i22 == 0) {
                                            }
                                            float b92 = t5Var.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 1.0f);
                                            a7 a22 = t5Var.a(obtainStyledAttributes2, theme, "strokeColor", 3);
                                            float b102 = t5Var.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                            float b112 = t5Var.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                            float b122 = t5Var.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                            float b132 = t5Var.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                            float b142 = t5Var.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                            if (ud0.m(t5Var.a, "fillType")) {
                                            }
                                            t5Var.c(obtainStyledAttributes2.getChangingConfigurations());
                                            obtainStyledAttributes2.recycle();
                                            shader = (Shader) a.c;
                                            int i252 = a.b;
                                            if (shader == null) {
                                                i11 = i16;
                                                ks0Var = null;
                                                Shader shader22 = (Shader) a22.c;
                                                int i262 = a22.b;
                                                if (shader22 == null) {
                                                    if (i24 != 0) {
                                                    }
                                                    if (zwVar.k) {
                                                    }
                                                    ((yw) zwVar.i.get(r0.size() - 1)).j.add(new iz0(str2, list2, i27, ks0Var, b8, zaVar, b102, b112, i10, i23, b92, b142, b122, b132));
                                                    i16 = i11;
                                                    i5 = 1;
                                                }
                                                if (i24 != 0) {
                                                }
                                                if (zwVar.k) {
                                                }
                                                ((yw) zwVar.i.get(r0.size() - 1)).j.add(new iz0(str2, list2, i27, ks0Var, b8, zaVar, b102, b112, i10, i23, b92, b142, b122, b132));
                                                i16 = i11;
                                                i5 = 1;
                                            }
                                            if (shader == null) {
                                            }
                                            Shader shader222 = (Shader) a22.c;
                                            int i2622 = a22.b;
                                            if (shader222 == null) {
                                            }
                                            if (i24 != 0) {
                                            }
                                            if (zwVar.k) {
                                            }
                                            ((yw) zwVar.i.get(r0.size() - 1)).j.add(new iz0(str2, list2, i27, ks0Var, b8, zaVar, b102, b112, i10, i23, b92, b142, b122, b132));
                                            i16 = i11;
                                            i5 = 1;
                                        } else {
                                            i4 = i16;
                                            i5 = 1;
                                            i6 = 3;
                                            i16 = i4;
                                            xmlResourceParser.next();
                                            i2 = i5;
                                            i12 = i18;
                                            i13 = i6;
                                            xml = xmlResourceParser;
                                        }
                                        i6 = 3;
                                        xmlResourceParser.next();
                                        i2 = i5;
                                        i12 = i18;
                                        i13 = i6;
                                        xml = xmlResourceParser;
                                    } else {
                                        xmlResourceParser = xml;
                                        i4 = i16;
                                        i6 = 3;
                                        if (name.equals("clip-path")) {
                                            int[] iArr4 = nk.d;
                                            if (theme == null) {
                                                obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr4);
                                                i7 = 0;
                                            } else {
                                                i7 = 0;
                                                obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr4, 0, 0);
                                            }
                                            t5Var.c(obtainStyledAttributes.getChangingConfigurations());
                                            String string4 = obtainStyledAttributes.getString(i7);
                                            t5Var.c(obtainStyledAttributes.getChangingConfigurations());
                                            String str3 = string4 == null ? "" : string4;
                                            i5 = 1;
                                            String string5 = obtainStyledAttributes.getString(1);
                                            t5Var.c(obtainStyledAttributes.getChangingConfigurations());
                                            if (string5 == null) {
                                                int i28 = fz0.a;
                                            } else {
                                                list = z1.a(z1Var, string5);
                                            }
                                            List list3 = list;
                                            obtainStyledAttributes.recycle();
                                            if (zwVar.k) {
                                                cy.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            }
                                            zwVar.i.add(new yw(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list3, 512));
                                            i16 = i4 + 1;
                                            xmlResourceParser.next();
                                            i2 = i5;
                                            i12 = i18;
                                            i13 = i6;
                                            xml = xmlResourceParser;
                                        } else {
                                            i5 = 1;
                                            i16 = i4;
                                            xmlResourceParser.next();
                                            i2 = i5;
                                            i12 = i18;
                                            i13 = i6;
                                            xml = xmlResourceParser;
                                        }
                                    }
                                } else {
                                    xmlResourceParser = xml;
                                }
                                i4 = i16;
                                i5 = i17;
                                i6 = 3;
                                i16 = i4;
                                xmlResourceParser.next();
                                i2 = i5;
                                i12 = i18;
                                i13 = i6;
                                xml = xmlResourceParser;
                            } else if (eventType == i13 && "group".equals(xmlPullParser.getName())) {
                                int i29 = i16 + 1;
                                int i30 = 0;
                                while (i30 < i29) {
                                    ArrayList arrayList = zwVar.i;
                                    if (zwVar.k) {
                                        cy.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    yw ywVar = (yw) arrayList.remove(arrayList.size() - 1);
                                    ((yw) arrayList.get(arrayList.size() - 1)).j.add(new ez0(ywVar.a, ywVar.b, ywVar.c, ywVar.d, ywVar.e, ywVar.f, ywVar.g, ywVar.h, ywVar.i, ywVar.j));
                                    i30++;
                                    i13 = 3;
                                }
                                i6 = i13;
                                xmlResourceParser = xml;
                                i5 = i17;
                                i16 = 0;
                                xmlResourceParser.next();
                                i2 = i5;
                                i12 = i18;
                                i13 = i6;
                                xml = xmlResourceParser;
                            } else {
                                i6 = i13;
                                xmlResourceParser = xml;
                                i4 = i16;
                                i5 = i17;
                                i16 = i4;
                                xmlResourceParser.next();
                                i2 = i5;
                                i12 = i18;
                                i13 = i6;
                                xml = xmlResourceParser;
                            }
                        }
                        bxVar = new bx(zwVar.a(), i12 | t5Var.b);
                        dxVar.a.put(cxVar, new WeakReference(bxVar));
                    }
                    i3 = 5;
                    float f22 = dimension / resources.getDisplayMetrics().density;
                    float f32 = dimension2 / resources.getDisplayMetrics().density;
                    obtainAttributes.recycle();
                    zw zwVar2 = new zw(f22, f32, b, b2, j, i3, z2, 1);
                    int i162 = 0;
                    while (xml.getEventType() != i2) {
                        List list4 = wp.d;
                        XmlPullParser xmlPullParser2 = t5Var.a;
                        int i172 = i2;
                        z1 z1Var2 = t5Var.c;
                        eventType = xmlPullParser2.getEventType();
                        int i182 = i12;
                        if (eventType != 2) {
                        }
                    }
                    bxVar = new bx(zwVar2.a(), i12 | t5Var.b);
                    dxVar.a.put(cxVar, new WeakReference(bxVar));
                }
                hz0 s = ze0.s(bxVar.a, qhVar);
                qhVar.q(false);
                return s;
            }
        }
        z = false;
        if (z) {
        }
    }

    public static final boolean s(int i, y5 y5Var, ts tsVar, zi0 zi0Var) {
        ts i2;
        l70 l70Var = new l70(new ts[16]);
        if (!tsVar.d.q) {
            cy.b("visitChildren called on an unattached node");
        }
        l70 l70Var2 = new l70(new t50[16]);
        t50 t50Var = tsVar.d;
        t50 t50Var2 = t50Var.i;
        if (t50Var2 == null) {
            nz.h(l70Var2, t50Var);
        } else {
            l70Var2.b(t50Var2);
        }
        while (true) {
            int i3 = l70Var2.f;
            if (i3 == 0) {
                break;
            }
            t50 t50Var3 = (t50) l70Var2.j(i3 - 1);
            if ((t50Var3.g & 1024) == 0) {
                nz.h(l70Var2, t50Var3);
            } else {
                while (true) {
                    if (t50Var3 == null) {
                        break;
                    }
                    if ((t50Var3.f & 1024) != 0) {
                        l70 l70Var3 = null;
                        while (t50Var3 != null) {
                            if (t50Var3 instanceof ts) {
                                ts tsVar2 = (ts) t50Var3;
                                if (tsVar2.q) {
                                    l70Var.b(tsVar2);
                                }
                            } else if ((t50Var3.f & 1024) != 0 && (t50Var3 instanceof ol)) {
                                int i4 = 0;
                                for (t50 t50Var4 = ((ol) t50Var3).s; t50Var4 != null; t50Var4 = t50Var4.i) {
                                    if ((t50Var4.f & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            t50Var3 = t50Var4;
                                        } else {
                                            if (l70Var3 == null) {
                                                l70Var3 = new l70(new t50[16]);
                                            }
                                            if (t50Var3 != null) {
                                                l70Var3.b(t50Var3);
                                                t50Var3 = null;
                                            }
                                            l70Var3.b(t50Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            t50Var3 = nz.j(l70Var3);
                        }
                    } else {
                        t50Var3 = t50Var3.i;
                    }
                }
            }
        }
        while (l70Var.f != 0 && (i2 = i(l70Var, zi0Var, i)) != null) {
            if (i2.k0().a) {
                return ((Boolean) y5Var.c(i2)).booleanValue();
            }
            if (k(i, y5Var, i2, zi0Var)) {
                return true;
            }
            l70Var.i(i2);
        }
        return false;
    }

    public static final Boolean v(int i, y5 y5Var, ts tsVar, zi0 zi0Var) {
        int ordinal = tsVar.l0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ts B = nz.B(tsVar);
                if (B == null) {
                    g8.s("ActiveParent must have a focusedChild");
                    return null;
                }
                int ordinal2 = B.l0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean v = v(i, y5Var, B, zi0Var);
                        if (!nz.l(v, Boolean.FALSE)) {
                            return v;
                        }
                        if (zi0Var == null) {
                            if (B.l0() != rs.e) {
                                g8.s("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            ts v2 = nz.v(B);
                            if (v2 == null) {
                                g8.s("ActiveParent must have a focusedChild");
                                return null;
                            }
                            zi0Var = nz.w(v2);
                        }
                        return Boolean.valueOf(k(i, y5Var, tsVar, zi0Var));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            g8.c();
                            return null;
                        }
                        g8.s("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (zi0Var == null) {
                    zi0Var = nz.w(B);
                }
                return Boolean.valueOf(k(i, y5Var, tsVar, zi0Var));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return tsVar.k0().a ? (Boolean) y5Var.c(tsVar) : zi0Var == null ? Boolean.valueOf(j(tsVar, i, y5Var)) : Boolean.valueOf(s(i, y5Var, tsVar, zi0Var));
                }
                g8.c();
                return null;
            }
        }
        return Boolean.valueOf(j(tsVar, i, y5Var));
    }

    public static final k01 w(ld ldVar, r01 r01Var, hk hkVar, ih ihVar) {
        p01 i;
        if (r01Var instanceof fw) {
            q01 viewModelStore = r01Var.getViewModelStore();
            n01 defaultViewModelProviderFactory = ((fw) r01Var).getDefaultViewModelProviderFactory();
            viewModelStore.getClass();
            defaultViewModelProviderFactory.getClass();
            hkVar.getClass();
            i = new p01(viewModelStore, defaultViewModelProviderFactory, hkVar);
        } else {
            i = pg0.i(r01Var, null, 6);
        }
        return i.i(ldVar);
    }

    public static final void x(rp0 rp0Var, int i, ao0 ao0Var) {
        rp0 rp0Var2;
        l70 l70Var = new l70(new rp0[16]);
        List i2 = rp0Var.i(false, false);
        while (true) {
            l70Var.d(i2, l70Var.f);
            while (true) {
                int i3 = l70Var.f;
                if (i3 == 0) {
                    return;
                }
                rp0Var2 = (rp0) l70Var.j(i3 - 1);
                boolean I = nz.I(rp0Var2);
                np0 np0Var = rp0Var2.d;
                a70 a70Var = np0Var.d;
                if (!I && !a70Var.c(vp0.i)) {
                    ea0 d = rp0Var2.d();
                    if (d == null) {
                        throw y6.u("Expected semantics node to have a coordinator.");
                    }
                    fz I2 = a50.I(mz.t(d));
                    if (I2.a < I2.c && I2.b < I2.d) {
                        Object g = np0Var.d.g(mp0.e);
                        if (g == null) {
                            g = null;
                        }
                        qu quVar = (qu) g;
                        Object g2 = a70Var.g(vp0.u);
                        zn0 zn0Var = (zn0) (g2 != null ? g2 : null);
                        if (quVar != null && zn0Var != null && ((Number) zn0Var.b.a()).floatValue() > 0.0f) {
                            int i4 = i + 1;
                            ao0Var.c(new bo0(rp0Var2, i4, I2, d));
                            x(rp0Var2, i4, ao0Var);
                        }
                    }
                }
            }
            i2 = rp0Var2.i(false, false);
        }
    }

    public abstract void u(boolean z);

    public void t(boolean z) {
    }
}
