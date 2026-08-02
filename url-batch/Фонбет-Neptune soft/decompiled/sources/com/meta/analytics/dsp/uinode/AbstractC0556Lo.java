package com.meta.analytics.dsp.uinode;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.Layout;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Lo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0556Lo {
    public static byte[] A00;
    public static String[] A01 = {"T9yeGAB86XK0vsZmNpfh4sIozppRZOgX", "Zi2TG3AXo50avc5D0Zq9wx", "JqBKj5K49VPZ3Gy9qBscEl", "4Ni4MdhmG8L", "r65r3", "RNCTQQIFlAbprT7c08Eivsd0jPtRWtbK", "BqjiC5lxzxq0feSMCCnGMnwMzT1DFPOJ", "3asmvLId1fZdr9gBLrqbDNcfpMudytXC"};
    public static final int A02;
    public static final int A03;
    public static final ConcurrentHashMap<Integer, Integer> A04;
    public static final AtomicInteger A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static int A03(TextView textView) {
        Layout layout;
        int lineCount;
        if (textView == null || textView.getLayout() == null || (lineCount = (layout = textView.getLayout()).getLineCount()) <= 0) {
            return 0;
        }
        double ellipsisCount = layout.getEllipsisCount(lineCount - 1);
        return (int) Math.ceil(ellipsisCount / (textView.getText().length() - ellipsisCount));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Drawable A09(int i, int i2, int i3, int i4) {
        return Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(ColorStateList.valueOf(i2), A06(i, i4), A07(i3, i4)) : A0A(i, i2, i4);
    }

    public static String A0D(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A00 = new byte[]{-24, -26, -15, -15, -22, -9, -39, -2, -11, -22, Ascii.NAK, Ascii.RS, Ascii.ESC, Ascii.NAK, Ascii.GS, 17, 37, 33, 39, 36, Ascii.NAK, Ascii.ETB, 58, Base64.padSymbol, 64, 72, 57, 70, 57, 56, 51, 55, 64, Base64.padSymbol, 55, 63, 51, 56, 57, 64, 53, 77, 51, 65, 71, 46, 51, 57, 42, 55, 56, 57, 46, 57, 46, 38, 49, 33, 43, Ascii.ETB, Ascii.ESC, 42, Ascii.GS, Ascii.EM, 44, 33, 46, Ascii.GS, Ascii.ETB, Ascii.EM, 43, Ascii.ETB, Ascii.ESC, 44, Ascii.EM, Ascii.ETB, 46, -22, -11, -24, -6, -28, -11, -25, -24, -25, -30, -7, -20, -25, -24, -14, -8, -26, -13, -8, -78, -8, -22, -9, -18, -21, -78, -14, -22, -23, -18, -6, -14, -52, -59, -64, -56, -52, -68, -96, -69, -33, -35, -49, -36, -51, -42, -45, -51, -43};
    }

    static {
        A0E();
        A03 = AbstractC01052p.A01(-1, 0);
        A02 = AbstractC01052p.A01(-16777216, 115);
        A05 = new AtomicInteger(1);
        A04 = new ConcurrentHashMap<>();
    }

    public static int A00() {
        AtomicInteger atomicInteger;
        int newValue;
        int result;
        do {
            atomicInteger = A05;
            newValue = atomicInteger.get();
            result = newValue + 1;
            if (result > 16777215) {
                result = 1;
            }
        } while (!atomicInteger.compareAndSet(newValue, result));
        return newValue;
    }

    public static int A01(int i) {
        return (int) TypedValue.applyDimension(2, i, LD.A03);
    }

    public static int A02(int i) {
        if (A0b(i)) {
            return AbstractC01052p.A02(i, -1, 0.4f);
        }
        return AbstractC01052p.A02(i, -16777216, 0.2f);
    }

    public static int A04(TextView textView, int i) {
        int lineHeightTitle = A03(textView);
        int lines = 0;
        int extraLinesRequired = textView.getLineHeight();
        while (i > extraLinesRequired && lines < lineHeightTitle) {
            lines++;
            i -= extraLinesRequired;
        }
        return lines;
    }

    public static Drawable A05(int i, int i2) {
        return A08(i, A02(i), i2);
    }

    public static Drawable A06(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(i2);
        return gradientDrawable;
    }

    public static Drawable A07(int i, int i2) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, i2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    public static Drawable A08(int i, int i2, int i3) {
        return A09(i, i2, i, i3);
    }

    public static StateListDrawable A0A(int i, int i2, int i3) {
        return A0B(new int[][]{new int[]{R.attr.state_pressed}, new int[0]}, new int[]{i2, i}, i3);
    }

    public static StateListDrawable A0B(int[][] iArr, int[] iArr2, int i) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(iArr2[i2]);
            gradientDrawable.setCornerRadius(i);
            stateListDrawable.addState(iArr[i2], gradientDrawable);
        }
        return stateListDrawable;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TextView A0C(ViewGroup viewGroup) {
        for (int i = 0; i < i; i++) {
            View v = viewGroup.getChildAt(i);
            if (v instanceof TextView) {
                return (TextView) v;
            }
            if (v instanceof ViewGroup) {
                A0C((ViewGroup) v);
            }
        }
        return null;
    }

    public static void A0F(int i, View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i / 3);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration((i / 3) * 2);
        scaleAnimation2.setInterpolator(new BounceInterpolator());
        scaleAnimation.setAnimationListener(new C0778Uc(view, scaleAnimation2));
        view.startAnimation(scaleAnimation);
    }

    public static void A0G(int i, View view) {
        Integer viewId = A04.get(Integer.valueOf(i));
        if (viewId != null) {
            view.setId(viewId.intValue());
        } else {
            A0K(view);
        }
    }

    public static void A0H(View view) {
        A0N(view, 8);
    }

    public static void A0I(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            A0T((ViewGroup) parent);
        }
    }

    public static void A0J(View view) {
        ViewGroup parent;
        if (view != null && (parent = (ViewGroup) view.getParent()) != null) {
            parent.removeView(view);
        }
    }

    public static void A0K(View view) {
        if (view == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            view.setId(View.generateViewId());
        } else {
            view.setId(A00());
        }
    }

    public static void A0L(View view) {
        A0N(view, 0);
    }

    public static void A0M(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(new ColorDrawable(i));
        } else {
            view.setBackgroundDrawable(new ColorDrawable(i));
        }
    }

    public static void A0N(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public static void A0O(View view, int i, int i2) {
        A0S(view, A08(i, A02(i), i2));
    }

    public static void A0P(View view, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A03, A02});
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setStroke(i2, i3);
        A0S(view, gradientDrawable);
    }

    public static void A0Q(View view, int i, int i2, int i3) {
        A0S(view, A09(i, A02(i), i2, i3));
    }

    public static void A0R(View view, Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A03, A02});
        gradientDrawable.setCornerRadius(0.0f);
        A0S(view, gradientDrawable);
    }

    public static void A0S(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void A0T(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT > 19) {
            A0U(viewGroup, 200);
        }
    }

    public static void A0U(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT > 19) {
            A0W(viewGroup, new AutoTransition(), i);
        }
    }

    public static void A0V(ViewGroup viewGroup, Transition transition) {
        if (Build.VERSION.SDK_INT > 19) {
            A0W(viewGroup, transition, 200);
        }
    }

    public static void A0W(ViewGroup viewGroup, Transition transition, int i) {
        transition.setDuration(i);
        transition.setInterpolator(new AccelerateDecelerateInterpolator());
        TransitionManager.beginDelayedTransition(viewGroup, transition);
    }

    public static void A0X(TextView textView, boolean z, int i) {
        Typeface typeface;
        if (z) {
            typeface = Build.VERSION.SDK_INT >= 21 ? Typeface.create(A0D(92, 17, 46), 0) : Typeface.create(Typeface.SANS_SERIF, 1);
        } else {
            Typeface typeface2 = Typeface.SANS_SERIF;
            typeface = Typeface.create(typeface2, 0);
        }
        textView.setTypeface(typeface);
        textView.setTextSize(2, i);
    }

    public static void A0Y(Toast toast, String str, int i, int i2, int i3) {
        if (toast == null) {
            return;
        }
        toast.setGravity(i, i2, i3);
        TextView A0C = A0C((ViewGroup) toast.getView());
        if (A0C != null) {
            A0C.setText(str);
            A0C.setGravity(17);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r3.equals(A0D(45, 12, 110)) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r3.equals(A0D(45, 8, 48)) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0Z(Map<String, String> map, AbstractC0992b5 abstractC0992b5) {
        char c;
        if (abstractC0992b5 == null) {
            return;
        }
        String A0P = abstractC0992b5.A0P();
        switch (A0P.hashCode()) {
            case -1364000502:
                if (A0P.equals(A0D(78, 14, 44))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 604727084:
                String[] strArr = A01;
                if (strArr[6].charAt(11) == strArr[7].charAt(11)) {
                    String[] strArr2 = A01;
                    strArr2[0] = "RlCCOSKS3krO76Z8d8aans18JsIjD59L";
                    strArr2[5] = "r3TWBb0uAOb49M7fooTivsHeogrthYcU";
                    break;
                } else {
                    A01[4] = "QpMMj";
                    break;
                }
            default:
                c = 65535;
                break;
        }
        String[] strArr3 = A01;
        if (strArr3[0].charAt(21) != strArr3[5].charAt(21)) {
            throw new RuntimeException();
        }
        String[] strArr4 = A01;
        strArr4[0] = "n4EWq8cbMgSrFIIPy3PtZs3ykG3gLNVv";
        strArr4[5] = "w61oSRwyzhyXZmY3tLRPvspfZwiCeo8H";
        String A0D = A0D(0, 10, 46);
        switch (c) {
            case 0:
                map.put(A0D, AdPlacementType.INTERSTITIAL.name());
                break;
            case 1:
                map.put(A0D, AdPlacementType.REWARDED_VIDEO.name());
                break;
        }
        map.put(A0D(109, 8, 0), abstractC0992b5.A0K());
        map.put(A0D(57, 21, 97), String.valueOf(abstractC0992b5.A0l()));
        map.put(A0D(22, 23, 125), String.valueOf(abstractC0992b5.A0H()));
    }

    public static void A0a(View... viewArr) {
        for (View view : viewArr) {
            A0J(view);
        }
    }

    public static boolean A0b(int i) {
        return AbstractC01052p.A00(i) < 0.5d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0c(EnumC00450g enumC00450g, Map<String, String> extraData) {
        boolean z;
        String str = extraData.get(A0D(10, 12, 91));
        if (str != null) {
            String clickSource = A0D(117, 9, 19);
            if (!clickSource.equals(str)) {
                z = true;
                return !z && (enumC00450g == EnumC00450g.A07);
            }
        }
        z = false;
        if (z) {
        }
    }

    public static boolean A0d(C0889Yn c0889Yn, EnumC00450g enumC00450g) {
        return enumC00450g == EnumC00450g.A07 && C0478Ih.A2N(c0889Yn);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0e(C0889Yn c0889Yn, EnumC00450g enumC00450g, Map<String, String> extraData) {
        boolean z;
        String str = extraData.get(A0D(57, 21, 97));
        if (str != null) {
            String creativeAsCtaExtras = Boolean.TRUE.toString();
            if (str.equals(creativeAsCtaExtras)) {
                z = true;
                if (z) {
                    boolean hasCreativeAsCtaFlag = A0d(c0889Yn, enumC00450g);
                    String[] strArr = A01;
                    if (strArr[6].charAt(11) == strArr[7].charAt(11)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A01;
                    strArr2[1] = "u8VsnBmPWVphPllKxtlQdK";
                    strArr2[2] = "HE77zV2Ng27gpeh0j3drVs";
                    if (hasCreativeAsCtaFlag || A0c(enumC00450g, extraData)) {
                        return true;
                    }
                }
                return false;
            }
        }
        z = false;
        if (z) {
        }
        return false;
    }
}
