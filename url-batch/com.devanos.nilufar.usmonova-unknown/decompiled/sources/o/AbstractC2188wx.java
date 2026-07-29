package o;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* renamed from: o.wx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2188wx {
    public static final void a(int i, View view, ViewGroup viewGroup) {
        AbstractC0048Bt.n(view, "view");
        AbstractC0048Bt.n(viewGroup, "container");
        int v = AbstractC1888sN.v(i);
        if (v == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (AbstractC0588Wo.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (v == 1) {
            if (AbstractC0588Wo.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (AbstractC0588Wo.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (v == 2) {
            if (AbstractC0588Wo.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (v != 3) {
            return;
        }
        if (AbstractC0588Wo.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int b(String str) {
        String str2;
        for (int i : AbstractC1888sN.x(2)) {
            if (i == 1) {
                str2 = "Brightness.light";
            } else {
                if (i != 2) {
                    throw null;
                }
                str2 = "Brightness.dark";
            }
            if (str2.equals(str)) {
                return i;
            }
        }
        throw new NoSuchFieldException(AbstractC1888sN.s("No such Brightness: ", str));
    }

    public static int c(String str) {
        for (int i : AbstractC1888sN.x(8)) {
            String str2 = null;
            switch (i) {
                case 1:
                    break;
                case 2:
                    str2 = "HapticFeedbackType.lightImpact";
                    break;
                case 3:
                    str2 = "HapticFeedbackType.mediumImpact";
                    break;
                case 4:
                    str2 = "HapticFeedbackType.heavyImpact";
                    break;
                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    str2 = "HapticFeedbackType.selectionClick";
                    break;
                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "HapticFeedbackType.successNotification";
                    break;
                case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "HapticFeedbackType.warningNotification";
                    break;
                case 8:
                    str2 = "HapticFeedbackType.errorNotification";
                    break;
                default:
                    throw null;
            }
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return i;
            }
        }
        throw new NoSuchFieldException(AbstractC1888sN.s("No such HapticFeedbackType: ", str));
    }

    public static int d(String str) {
        String str2;
        for (int i : AbstractC1888sN.x(3)) {
            if (i == 1) {
                str2 = "SystemSoundType.click";
            } else if (i == 2) {
                str2 = "SystemSoundType.tick";
            } else {
                if (i != 3) {
                    throw null;
                }
                str2 = "SystemSoundType.alert";
            }
            if (str2.equals(str)) {
                return i;
            }
        }
        throw new NoSuchFieldException(AbstractC1888sN.s("No such SoundType: ", str));
    }

    public static int e(int i, int i2, int i3) {
        return C0627Yb.Z(i) + i2 + i3;
    }

    public static int f(int i, int i2, int i3, int i4) {
        return C0627Yb.a0(i) + i2 + i3 + i4;
    }

    public static String g(int i, String str) {
        return str + i;
    }

    public static String h(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder i(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static InterfaceC2253xw j(String str, String str2, VM vm) {
        return vm.e(new JD(str, str2));
    }

    public static void k(int i, int i2, int i3, int i4, int i5) {
        PX.f(i);
        PX.f(i2);
        PX.f(i3);
        PX.f(i4);
        PX.f(i5);
    }

    public static void l(long j, StringBuilder sb, String str) {
        sb.append((Object) C1114gc.g(j));
        sb.append(str);
    }

    public static /* synthetic */ void m(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ String n(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "Idle" : "LookaheadLayingOut" : "LayingOut" : "LookaheadMeasuring" : "Measuring";
    }

    public static /* synthetic */ String o(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "OUT_VARIANCE" : "IN_VARIANCE" : "INVARIANT";
    }
}
