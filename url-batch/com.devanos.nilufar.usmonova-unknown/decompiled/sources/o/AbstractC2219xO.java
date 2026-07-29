package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.xO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2219xO {
    public AbstractC2219xO() {
        new ConcurrentHashMap();
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case 10:
                objArr[0] = "subtype";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final C2287yQ b(C0027Ay c0027Ay, boolean z) {
        TC tc = (TC) c0027Ay.u.f;
        InterfaceC0725ah interfaceC0725ah = null;
        if ((tc.d & 8) != 0) {
            loop0: while (true) {
                if (tc == null) {
                    break;
                }
                if ((tc.c & 8) != 0) {
                    for (InterfaceC0725ah interfaceC0725ah2 = tc; interfaceC0725ah2 != null; interfaceC0725ah2 = null) {
                        if (interfaceC0725ah2 instanceof InterfaceC2155wQ) {
                            interfaceC0725ah = interfaceC0725ah2;
                            break loop0;
                        }
                    }
                }
                if ((tc.d & 8) == 0) {
                    break;
                }
                tc = tc.f;
            }
        }
        AbstractC0048Bt.k(interfaceC0725ah);
        TC tc2 = ((TC) ((InterfaceC2155wQ) interfaceC0725ah)).b;
        C2023uQ i = c0027Ay.i();
        AbstractC0048Bt.k(i);
        return new C2287yQ(tc2, z, c0027Ay, i);
    }

    public static void c(Appendable appendable, Object obj, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(appendable, "<this>");
        if (interfaceC2114vp != null) {
            appendable.append((CharSequence) interfaceC2114vp.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static float d(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static void e(Context context, InterfaceC1402l00 interfaceC1402l00) {
        Rect rect;
        C1142h10 b;
        WindowMetrics maximumWindowMetrics;
        Activity m = m(context);
        if (m != null) {
            InterfaceC1668p10.a.getClass();
            int i = C1734q10.b;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                maximumWindowMetrics = ((WindowManager) m.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                AbstractC0048Bt.m(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = m.getSystemService("window");
                AbstractC0048Bt.l(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                AbstractC0048Bt.m(defaultDisplay, Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i2 < 30) {
                b = (i2 >= 30 ? new Y00() : i2 >= 29 ? new X00() : new W00()).b();
                AbstractC0048Bt.m(b, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i2 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                b = C2037ue.a.a(m);
            }
            int i3 = rect.left;
            int i4 = rect.top;
            int i5 = rect.right;
            int i6 = rect.bottom;
            if (i3 > i5) {
                throw new IllegalArgumentException(AbstractC1888sN.g(i3, i5, "Left must be less than or equal to right, left: ", ", right: ").toString());
            }
            if (i4 > i6) {
                throw new IllegalArgumentException(AbstractC1888sN.g(i4, i6, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
            }
            AbstractC0048Bt.n(b, "_windowInsetsCompat");
            ((C0862cn) interfaceC1402l00).a.updateDisplayMetrics(0, new Rect(i3, i4, i5, i6).width(), new Rect(i3, i4, i5, i6).height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static float j(float f, float f2, float f3, float f4) {
        return (f * f4) - (f2 * f3);
    }

    public static final YD k() {
        C0950e6 c0950e6 = AbstractC2355zS.b;
        YD yd = (YD) c0950e6.get();
        if (yd != null) {
            return yd;
        }
        YD yd2 = new YD(new C1509md[0]);
        c0950e6.O(yd2);
        return yd2;
    }

    public static Activity m(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final InterfaceC2155wQ n(C0027Ay c0027Ay) {
        TC tc = (TC) c0027Ay.u.f;
        Object obj = null;
        if ((tc.d & 8) != 0) {
            loop0: while (true) {
                if (tc == null) {
                    break;
                }
                if ((tc.c & 8) != 0) {
                    for (TC tc2 = tc; tc2 != null; tc2 = null) {
                        if ((tc2 instanceof InterfaceC2155wQ) && ((InterfaceC2155wQ) tc2).g()) {
                            obj = tc2;
                            break loop0;
                        }
                    }
                }
                if ((tc.d & 8) == 0) {
                    break;
                }
                tc = tc.f;
            }
        }
        return (InterfaceC2155wQ) obj;
    }

    public static final long o(double d) {
        return s(4294967296L, (float) d);
    }

    public static final long p(int i) {
        return s(4294967296L, i);
    }

    public static final boolean q(long j) {
        C1896sV[] c1896sVArr = C1830rV.b;
        return (j & 1095216660480L) == 0;
    }

    public static C2278yH r(Object obj) {
        C1623oL c1623oL = C1623oL.n;
        int i = X1.b;
        return new C2278yH(obj, c1623oL);
    }

    public static final long s(long j, float f) {
        long floatToIntBits = j | (Float.floatToIntBits(f) & 4294967295L);
        C1896sV[] c1896sVArr = C1830rV.b;
        return floatToIntBits;
    }

    public static final C0244Jh t(AbstractC2325z00 abstractC2325z00) {
        AbstractC0048Bt.n(abstractC2325z00, "<this>");
        C0244Jh c0244Jh = (C0244Jh) AbstractC0671Zt.d.get(abstractC2325z00);
        return c0244Jh == null ? AbstractC0270Kh.f(abstractC2325z00) : c0244Jh;
    }

    public abstract Typeface f(Context context, C1192ho c1192ho, Resources resources, int i);

    public abstract Typeface g(Context context, C1718po[] c1718poArr, int i);

    public Typeface h(Context context, InputStream inputStream) {
        File g = PO.g(context);
        if (g == null) {
            return null;
        }
        try {
            if (PO.d(g, inputStream)) {
                return Typeface.createFromFile(g.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            g.delete();
        }
    }

    public Typeface i(Context context, Resources resources, int i, String str, int i2) {
        File g = PO.g(context);
        if (g == null) {
            return null;
        }
        try {
            if (PO.c(g, resources, i)) {
                return Typeface.createFromFile(g.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            g.delete();
        }
    }

    public C1718po l(C1718po[] c1718poArr, int i) {
        new GU(3);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C1718po c1718po = null;
        int i3 = Integer.MAX_VALUE;
        for (C1718po c1718po2 : c1718poArr) {
            int abs = (Math.abs(c1718po2.c - i2) * 2) + (c1718po2.d == z ? 0 : 1);
            if (c1718po == null || i3 > abs) {
                c1718po = c1718po2;
                i3 = abs;
            }
        }
        return c1718po;
    }
}
