package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import q.AbstractC0286e;
import r.AbstractC0291a;
import s.C0293a;
import u.AbstractC0315a;

/* loaded from: classes.dex */
public final class n {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4002e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4003f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4004a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4005b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4006c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4002e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4003f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(C0317a c0317a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c0317a.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = q.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && c0317a.isInEditMode() && (c0317a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0317a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1262m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1262m.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:128:0x0600. Please report as an issue. */
    public static C0325i d(Context context, AttributeSet attributeSet, boolean z2) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        C0325i c0325i = new C0325i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? r.f4010c : r.f4008a);
        int[] iArr = d;
        SparseIntArray sparseIntArray = f4002e;
        l lVar = c0325i.f3914b;
        String[] strArr = AbstractC0291a.f3581a;
        m mVar = c0325i.f3916e;
        k kVar = c0325i.f3915c;
        C0326j c0326j = c0325i.d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            C0324h c0324h = new C0324h();
            c0324h.f3904a = new int[10];
            c0324h.f3905b = new int[10];
            c0324h.f3906c = 0;
            c0324h.d = new int[10];
            c0324h.f3907e = new float[10];
            c0324h.f3908f = 0;
            c0324h.f3909g = new int[5];
            c0324h.h = new String[5];
            c0324h.i = 0;
            c0324h.f3910j = new int[4];
            c0324h.f3911k = new boolean[4];
            c0324h.f3912l = 0;
            kVar.getClass();
            c0326j.getClass();
            mVar.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f4003f.get(index)) {
                    case 2:
                        str4 = str5;
                        c0324h.b(2, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3926I));
                        i3 = 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder(str5);
                        str4 = str5;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        i3 = 1;
                        break;
                    case 5:
                        str4 = str5;
                        c0324h.d(obtainStyledAttributes.getString(index), 5);
                        i3 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        c0324h.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, c0326j.f3921C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        c0324h.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, c0326j.f3922D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        c0324h.b(8, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3927J));
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        c0324h.b(11, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3933P));
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        c0324h.b(12, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3934Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        c0324h.b(13, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3930M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        c0324h.b(14, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3932O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        c0324h.b(15, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3935R));
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        c0324h.b(16, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3931N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        c0324h.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, c0326j.d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        c0324h.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, c0326j.f3951e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        c0324h.a(19, obtainStyledAttributes.getFloat(index, c0326j.f3953f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        c0324h.a(20, obtainStyledAttributes.getFloat(index, c0326j.f3977w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        c0324h.b(21, obtainStyledAttributes.getLayoutDimension(index, c0326j.f3948c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        c0324h.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f3988a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        c0324h.b(23, obtainStyledAttributes.getLayoutDimension(index, c0326j.f3946b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        c0324h.b(24, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        c0324h.b(27, obtainStyledAttributes.getInt(index, c0326j.f3923E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        c0324h.b(28, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3924G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        c0324h.b(31, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3928K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        c0324h.b(34, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3925H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        c0324h.a(37, obtainStyledAttributes.getFloat(index, c0326j.f3978x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c0325i.f3913a);
                        c0325i.f3913a = resourceId;
                        c0324h.b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        c0324h.a(39, obtainStyledAttributes.getFloat(index, c0326j.f3938U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        c0324h.a(40, obtainStyledAttributes.getFloat(index, c0326j.f3937T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        c0324h.b(41, obtainStyledAttributes.getInt(index, c0326j.f3939V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        c0324h.b(42, obtainStyledAttributes.getInt(index, c0326j.f3940W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        c0324h.a(43, obtainStyledAttributes.getFloat(index, lVar.f3990c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        c0324h.c(44, true);
                        c0324h.a(44, obtainStyledAttributes.getDimension(index, mVar.f4001m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        c0324h.a(45, obtainStyledAttributes.getFloat(index, mVar.f3993b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        c0324h.a(46, obtainStyledAttributes.getFloat(index, mVar.f3994c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        c0324h.a(47, obtainStyledAttributes.getFloat(index, mVar.d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        c0324h.a(48, obtainStyledAttributes.getFloat(index, mVar.f3995e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        c0324h.a(49, obtainStyledAttributes.getDimension(index, mVar.f3996f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        c0324h.a(50, obtainStyledAttributes.getDimension(index, mVar.f3997g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        c0324h.a(51, obtainStyledAttributes.getDimension(index, mVar.i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        c0324h.a(52, obtainStyledAttributes.getDimension(index, mVar.f3998j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        c0324h.a(53, obtainStyledAttributes.getDimension(index, mVar.f3999k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        c0324h.b(54, obtainStyledAttributes.getInt(index, c0326j.f3941X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        c0324h.b(55, obtainStyledAttributes.getInt(index, c0326j.f3942Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        c0324h.b(56, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3943Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        c0324h.b(57, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3945a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        c0324h.b(58, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3947b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        c0324h.b(59, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3949c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        c0324h.a(60, obtainStyledAttributes.getFloat(index, mVar.f3992a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        c0324h.b(62, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3919A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        c0324h.a(63, obtainStyledAttributes.getFloat(index, c0326j.f3920B));
                        i3 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        c0324h.b(64, f(obtainStyledAttributes, index, kVar.f3982a));
                        i3 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c0324h.d(obtainStyledAttributes.getString(index), 65);
                        } else {
                            c0324h.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        c0324h.b(66, obtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        c0324h.a(67, obtainStyledAttributes.getFloat(index, kVar.f3985e));
                        i3 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        c0324h.a(68, obtainStyledAttributes.getFloat(index, lVar.d));
                        i3 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        c0324h.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        c0324h.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i3 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        c0324h.b(72, obtainStyledAttributes.getInt(index, c0326j.f3954f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        c0324h.b(73, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3956g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        c0324h.d(obtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        c0324h.c(75, obtainStyledAttributes.getBoolean(index, c0326j.f3967n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        c0324h.b(76, obtainStyledAttributes.getInt(index, kVar.f3984c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        c0324h.d(obtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        c0324h.b(78, obtainStyledAttributes.getInt(index, lVar.f3989b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        c0324h.a(79, obtainStyledAttributes.getFloat(index, kVar.d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        c0324h.c(80, obtainStyledAttributes.getBoolean(index, c0326j.f3963l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        c0324h.c(81, obtainStyledAttributes.getBoolean(index, c0326j.f3965m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        c0324h.b(82, obtainStyledAttributes.getInteger(index, kVar.f3983b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        c0324h.b(83, f(obtainStyledAttributes, index, mVar.h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        c0324h.b(84, obtainStyledAttributes.getInteger(index, kVar.f3987g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        c0324h.a(85, obtainStyledAttributes.getFloat(index, kVar.f3986f));
                        i3 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.i = resourceId2;
                            c0324h.b(89, resourceId2);
                            if (kVar.i != -1) {
                                c0324h.b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.h = string;
                            c0324h.d(string, 90);
                            if (kVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                kVar.i = resourceId3;
                                c0324h.b(89, resourceId3);
                                c0324h.b(88, -2);
                            } else {
                                c0324h.b(88, -1);
                            }
                        } else {
                            c0324h.b(88, obtainStyledAttributes.getInteger(index, kVar.i));
                        }
                        i3 = 1;
                        break;
                    case 87:
                        str4 = str5;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        i3 = 1;
                        break;
                    case 93:
                        str4 = str5;
                        c0324h.b(93, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3929L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        c0324h.b(94, obtainStyledAttributes.getDimensionPixelSize(index, c0326j.f3936S));
                        i3 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        g(c0324h, obtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i3 = 1;
                        g(c0324h, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        c0324h.b(97, obtainStyledAttributes.getInt(index, c0326j.f3969o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC0315a.f3809s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            c0325i.f3913a = obtainStyledAttributes.getResourceId(index, c0325i.f3913a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        c0324h.c(99, obtainStyledAttributes.getBoolean(index, c0326j.f3955g));
                        i3 = 1;
                        break;
                }
                i4 += i3;
                indexCount = i5;
                str5 = str4;
            }
        } else {
            String str7 = "CURRENTLY UNSUPPORTED";
            String str8 = "Unknown attribute 0x";
            int i8 = 1;
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            int i9 = 0;
            while (i9 < indexCount2) {
                int index2 = obtainStyledAttributes.getIndex(i9);
                if (index2 != i8 && 23 != index2 && 24 != index2) {
                    kVar.getClass();
                    c0326j.getClass();
                    mVar.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3970p = f(obtainStyledAttributes, index2, c0326j.f3970p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3926I = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3926I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3968o = f(obtainStyledAttributes, index2, c0326j.f3968o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3966n = f(obtainStyledAttributes, index2, c0326j.f3966n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3979y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3921C = obtainStyledAttributes.getDimensionPixelOffset(index2, c0326j.f3921C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3922D = obtainStyledAttributes.getDimensionPixelOffset(index2, c0326j.f3922D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3927J = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3927J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3976v = f(obtainStyledAttributes, index2, c0326j.f3976v);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3975u = f(obtainStyledAttributes, index2, c0326j.f3975u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3933P = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3933P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3934Q = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3934Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3930M = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3930M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3932O = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3932O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3935R = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3935R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3931N = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3931N);
                        i2 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.d = obtainStyledAttributes.getDimensionPixelOffset(index2, c0326j.d);
                        i2 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3951e = obtainStyledAttributes.getDimensionPixelOffset(index2, c0326j.f3951e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3953f = obtainStyledAttributes.getFloat(index2, c0326j.f3953f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3977w = obtainStyledAttributes.getFloat(index2, c0326j.f3977w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3948c = obtainStyledAttributes.getLayoutDimension(index2, c0326j.f3948c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = obtainStyledAttributes.getInt(index2, lVar.f3988a);
                        lVar.f3988a = i10;
                        lVar.f3988a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3946b = obtainStyledAttributes.getLayoutDimension(index2, c0326j.f3946b);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.F = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.F);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.h = f(obtainStyledAttributes, index2, c0326j.h);
                        i2 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.i = f(obtainStyledAttributes, index2, c0326j.i);
                        i2 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3923E = obtainStyledAttributes.getInt(index2, c0326j.f3923E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3924G = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3924G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3959j = f(obtainStyledAttributes, index2, c0326j.f3959j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3960k = f(obtainStyledAttributes, index2, c0326j.f3960k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3928K = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3928K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3973s = f(obtainStyledAttributes, index2, c0326j.f3973s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3974t = f(obtainStyledAttributes, index2, c0326j.f3974t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3925H = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3925H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3964m = f(obtainStyledAttributes, index2, c0326j.f3964m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3962l = f(obtainStyledAttributes, index2, c0326j.f3962l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3978x = obtainStyledAttributes.getFloat(index2, c0326j.f3978x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0325i.f3913a = obtainStyledAttributes.getResourceId(index2, c0325i.f3913a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3938U = obtainStyledAttributes.getFloat(index2, c0326j.f3938U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3937T = obtainStyledAttributes.getFloat(index2, c0326j.f3937T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3939V = obtainStyledAttributes.getInt(index2, c0326j.f3939V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3940W = obtainStyledAttributes.getInt(index2, c0326j.f3940W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        lVar.f3990c = obtainStyledAttributes.getFloat(index2, lVar.f3990c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4000l = true;
                        mVar.f4001m = obtainStyledAttributes.getDimension(index2, mVar.f4001m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f3993b = obtainStyledAttributes.getFloat(index2, mVar.f3993b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f3994c = obtainStyledAttributes.getFloat(index2, mVar.f3994c);
                        i2 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.d = obtainStyledAttributes.getFloat(index2, mVar.d);
                        i2 = 1;
                        break;
                    case 48:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f3995e = obtainStyledAttributes.getFloat(index2, mVar.f3995e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f3996f = obtainStyledAttributes.getDimension(index2, mVar.f3996f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f3997g = obtainStyledAttributes.getDimension(index2, mVar.f3997g);
                        i2 = 1;
                        break;
                    case 51:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.i = obtainStyledAttributes.getDimension(index2, mVar.i);
                        i2 = 1;
                        break;
                    case 52:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f3998j = obtainStyledAttributes.getDimension(index2, mVar.f3998j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f3999k = obtainStyledAttributes.getDimension(index2, mVar.f3999k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3941X = obtainStyledAttributes.getInt(index2, c0326j.f3941X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3942Y = obtainStyledAttributes.getInt(index2, c0326j.f3942Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3943Z = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3943Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3945a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3945a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3947b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3947b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3949c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3949c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f3992a = obtainStyledAttributes.getFloat(index2, mVar.f3992a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3980z = f(obtainStyledAttributes, index2, c0326j.f3980z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3919A = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3919A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0326j.f3920B = obtainStyledAttributes.getFloat(index2, c0326j.f3920B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f3982a = f(obtainStyledAttributes, index2, kVar.f3982a);
                        i2 = 1;
                        break;
                    case 65:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        if (obtainStyledAttributes.peekValue(index2).type != 3) {
                            String str9 = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                            i2 = 1;
                            break;
                        } else {
                            obtainStyledAttributes.getString(index2);
                            kVar.getClass();
                            i2 = 1;
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        obtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 67:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        kVar.f3985e = obtainStyledAttributes.getFloat(index2, kVar.f3985e);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        lVar.d = obtainStyledAttributes.getFloat(index2, lVar.d);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 69:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0326j.f3950d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0326j.f3952e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 71:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        Log.e(str6, str);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 72:
                        i = indexCount2;
                        str2 = str8;
                        c0326j.f3954f0 = obtainStyledAttributes.getInt(index2, c0326j.f3954f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        c0326j.f3956g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3956g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        c0326j.j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        c0326j.f3967n0 = obtainStyledAttributes.getBoolean(index2, c0326j.f3967n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3984c = obtainStyledAttributes.getInt(index2, kVar.f3984c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        c0326j.f3961k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f3989b = obtainStyledAttributes.getInt(index2, lVar.f3989b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 79:
                        i = indexCount2;
                        str2 = str8;
                        kVar.d = obtainStyledAttributes.getFloat(index2, kVar.d);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 80:
                        i = indexCount2;
                        str2 = str8;
                        c0326j.f3963l0 = obtainStyledAttributes.getBoolean(index2, c0326j.f3963l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        c0326j.f3965m0 = obtainStyledAttributes.getBoolean(index2, c0326j.f3965m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3983b = obtainStyledAttributes.getInteger(index2, kVar.f3983b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 83:
                        i = indexCount2;
                        str2 = str8;
                        mVar.h = f(obtainStyledAttributes, index2, mVar.h);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 84:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3987g = obtainStyledAttributes.getInteger(index2, kVar.f3987g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f3986f = obtainStyledAttributes.getFloat(index2, kVar.f3986f);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 86:
                        i = indexCount2;
                        str2 = str8;
                        int i11 = obtainStyledAttributes.peekValue(index2).type;
                        if (i11 == 1) {
                            kVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i11 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            kVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                kVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, kVar.i);
                        }
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 87:
                        i = indexCount2;
                        str2 = str8;
                        Log.w(str6, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str2 = str8;
                        StringBuilder sb2 = new StringBuilder(str2);
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w(str6, sb2.toString());
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 91:
                        i = indexCount2;
                        str2 = str8;
                        c0326j.f3971q = f(obtainStyledAttributes, index2, c0326j.f3971q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        c0326j.f3972r = f(obtainStyledAttributes, index2, c0326j.f3972r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        c0326j.f3929L = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3929L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        c0326j.f3936S = obtainStyledAttributes.getDimensionPixelSize(index2, c0326j.f3936S);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        str2 = str8;
                        g(c0326j, obtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        str2 = str8;
                        g(c0326j, obtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 97:
                        i = indexCount2;
                        str2 = str8;
                        c0326j.f3969o0 = obtainStyledAttributes.getInt(index2, c0326j.f3969o0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                }
                i9 += i2;
                indexCount2 = i;
                str8 = str2;
                String str10 = str;
                i8 = i2;
                str6 = str3;
                str7 = str10;
            }
            if (c0326j.j0 != null) {
                c0326j.f3958i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c0325i;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z2 = true;
        int i4 = 0;
        if (i3 == 3) {
            String string = typedArray.getString(i);
            if (string == null) {
                return;
            }
            int indexOf = string.indexOf(61);
            int length = string.length();
            if (indexOf <= 0 || indexOf >= length - 1) {
                return;
            }
            String substring = string.substring(0, indexOf);
            String substring2 = string.substring(indexOf + 1);
            if (substring2.length() > 0) {
                String trim = substring.trim();
                String trim2 = substring2.trim();
                if ("ratio".equalsIgnoreCase(trim)) {
                    if (obj instanceof C0321e) {
                        C0321e c0321e = (C0321e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0321e).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0321e).height = 0;
                        }
                        h(c0321e, trim2);
                        return;
                    }
                    if (obj instanceof C0326j) {
                        ((C0326j) obj).f3979y = trim2;
                        return;
                    } else {
                        if (obj instanceof C0324h) {
                            ((C0324h) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof C0321e) {
                            C0321e c0321e2 = (C0321e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0321e2).width = 0;
                                c0321e2.f3837H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0321e2).height = 0;
                                c0321e2.f3838I = parseFloat;
                            }
                        } else if (obj instanceof C0326j) {
                            C0326j c0326j = (C0326j) obj;
                            if (i2 == 0) {
                                c0326j.f3946b = 0;
                                c0326j.f3938U = parseFloat;
                            } else {
                                c0326j.f3948c = 0;
                                c0326j.f3937T = parseFloat;
                            }
                        } else if (obj instanceof C0324h) {
                            C0324h c0324h = (C0324h) obj;
                            if (i2 == 0) {
                                c0324h.b(23, 0);
                                c0324h.a(39, parseFloat);
                            } else {
                                c0324h.b(21, 0);
                                c0324h.a(40, parseFloat);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(trim)) {
                            return;
                        }
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof C0321e) {
                            C0321e c0321e3 = (C0321e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0321e3).width = 0;
                                c0321e3.f3847R = max;
                                c0321e3.f3841L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0321e3).height = 0;
                                c0321e3.f3848S = max;
                                c0321e3.f3842M = 2;
                            }
                        } else if (obj instanceof C0326j) {
                            C0326j c0326j2 = (C0326j) obj;
                            if (i2 == 0) {
                                c0326j2.f3946b = 0;
                                c0326j2.f3950d0 = max;
                                c0326j2.f3941X = 2;
                            } else {
                                c0326j2.f3948c = 0;
                                c0326j2.f3952e0 = max;
                                c0326j2.f3942Y = 2;
                            }
                        } else if (obj instanceof C0324h) {
                            C0324h c0324h2 = (C0324h) obj;
                            if (i2 == 0) {
                                c0324h2.b(23, 0);
                                c0324h2.b(54, 2);
                            } else {
                                c0324h2.b(21, 0);
                                c0324h2.b(55, 2);
                            }
                        }
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i3 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                i4 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z2 = false;
            }
            if (!(obj instanceof C0321e)) {
                C0321e c0321e4 = (C0321e) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c0321e4).width = i4;
                    c0321e4.f3852W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c0321e4).height = i4;
                    c0321e4.f3853X = z2;
                    return;
                }
            }
            if (obj instanceof C0326j) {
                C0326j c0326j3 = (C0326j) obj;
                if (i2 == 0) {
                    c0326j3.f3946b = i4;
                    c0326j3.f3963l0 = z2;
                    return;
                } else {
                    c0326j3.f3948c = i4;
                    c0326j3.f3965m0 = z2;
                    return;
                }
            }
            if (obj instanceof C0324h) {
                C0324h c0324h3 = (C0324h) obj;
                if (i2 == 0) {
                    c0324h3.b(23, i4);
                    c0324h3.c(80, z2);
                    return;
                } else {
                    c0324h3.b(21, i4);
                    c0324h3.c(81, z2);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z2 = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof C0321e)) {
        }
    }

    public static void h(C0321e c0321e, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c0321e.f3836G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        String str;
        int i2;
        String str2;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = nVar.f4006c;
        HashSet hashSet = new HashSet(hashMap2.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str2 = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str2 = "UNKNOWN";
                }
                sb.append(str2);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (nVar.f4005b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0325i c0325i = (C0325i) hashMap2.get(Integer.valueOf(id));
                        if (c0325i != null) {
                            if (childAt instanceof C0317a) {
                                C0326j c0326j = c0325i.d;
                                c0326j.f3957h0 = 1;
                                C0317a c0317a = (C0317a) childAt;
                                c0317a.setId(id);
                                c0317a.setType(c0326j.f3954f0);
                                c0317a.setMargin(c0326j.f3956g0);
                                c0317a.setAllowsGoneWidget(c0326j.f3967n0);
                                int[] iArr = c0326j.f3958i0;
                                if (iArr != null) {
                                    c0317a.setReferencedIds(iArr);
                                } else {
                                    String str3 = c0326j.j0;
                                    if (str3 != null) {
                                        int[] c2 = c(c0317a, str3);
                                        c0326j.f3958i0 = c2;
                                        c0317a.setReferencedIds(c2);
                                    }
                                }
                            }
                            C0321e c0321e = (C0321e) childAt.getLayoutParams();
                            c0321e.a();
                            c0325i.a(c0321e);
                            HashMap hashMap3 = c0325i.f3917f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                C0318b c0318b = (C0318b) hashMap3.get(str4);
                                if (c0318b.f3818a) {
                                    hashMap = hashMap3;
                                    str = str4;
                                } else {
                                    hashMap = hashMap3;
                                    str = "set" + str4;
                                }
                                try {
                                    switch (AbstractC0286e.a(c0318b.f3819b)) {
                                        case 0:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0318b.f3820c));
                                            break;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0318b.d));
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0318b.f3823g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i2 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0318b.f3823g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                hashMap3 = hashMap;
                                                childCount = i2;
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
                                                hashMap3 = hashMap;
                                                childCount = i2;
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                hashMap3 = hashMap;
                                                childCount = i2;
                                            }
                                        case 4:
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0318b.f3821e);
                                            i2 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0318b.f3822f));
                                            i2 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0318b.d));
                                            i2 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0318b.f3820c));
                                            i2 = childCount;
                                            break;
                                        default:
                                            i2 = childCount;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    i2 = childCount;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    i2 = childCount;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    i2 = childCount;
                                }
                                hashMap3 = hashMap;
                                childCount = i2;
                            }
                            i = childCount;
                            childAt.setLayoutParams(c0321e);
                            l lVar = c0325i.f3914b;
                            if (lVar.f3989b == 0) {
                                childAt.setVisibility(lVar.f3988a);
                            }
                            childAt.setAlpha(lVar.f3990c);
                            m mVar = c0325i.f3916e;
                            childAt.setRotation(mVar.f3992a);
                            childAt.setRotationX(mVar.f3993b);
                            childAt.setRotationY(mVar.f3994c);
                            childAt.setScaleX(mVar.d);
                            childAt.setScaleY(mVar.f3995e);
                            if (mVar.h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f3996f)) {
                                    childAt.setPivotX(mVar.f3996f);
                                }
                                if (!Float.isNaN(mVar.f3997g)) {
                                    childAt.setPivotY(mVar.f3997g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.f3998j);
                            childAt.setTranslationZ(mVar.f3999k);
                            if (mVar.f4000l) {
                                childAt.setElevation(mVar.f4001m);
                            }
                        }
                    } else {
                        i = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i3++;
                    nVar = this;
                    childCount = i;
                }
            }
            i = childCount;
            i3++;
            nVar = this;
            childCount = i;
        }
        int i4 = childCount;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0325i c0325i2 = (C0325i) hashMap2.get(num);
            if (c0325i2 != null) {
                C0326j c0326j2 = c0325i2.d;
                if (c0326j2.f3957h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C0317a c0317a2 = new C0317a(context);
                    c0317a2.f3824a = new int[32];
                    c0317a2.f3829g = new HashMap();
                    c0317a2.f3826c = context;
                    C0293a c0293a = new C0293a();
                    c0293a.f3597s0 = 0;
                    c0293a.f3598t0 = true;
                    c0293a.f3599u0 = 0;
                    c0293a.f3600v0 = false;
                    c0317a2.f3817j = c0293a;
                    c0317a2.d = c0293a;
                    c0317a2.i();
                    c0317a2.setVisibility(8);
                    c0317a2.setId(num.intValue());
                    int[] iArr2 = c0326j2.f3958i0;
                    if (iArr2 != null) {
                        c0317a2.setReferencedIds(iArr2);
                    } else {
                        String str5 = c0326j2.j0;
                        if (str5 != null) {
                            int[] c3 = c(c0317a2, str5);
                            c0326j2.f3958i0 = c3;
                            c0317a2.setReferencedIds(c3);
                        }
                    }
                    c0317a2.setType(c0326j2.f3954f0);
                    c0317a2.setMargin(c0326j2.f3956g0);
                    C0321e g2 = ConstraintLayout.g();
                    c0317a2.i();
                    c0325i2.a(g2);
                    constraintLayout.addView(c0317a2, g2);
                }
                if (c0326j2.f3944a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    C0321e g3 = ConstraintLayout.g();
                    c0325i2.a(g3);
                    constraintLayout.addView(pVar, g3);
                }
            }
        }
        for (int i5 = 0; i5 < i4; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof AbstractC0319c) {
                ((AbstractC0319c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f4006c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0321e c0321e = (C0321e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f4005b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C0325i());
            }
            C0325i c0325i = (C0325i) hashMap.get(Integer.valueOf(id));
            if (c0325i != null) {
                HashMap hashMap2 = nVar.f4004a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0318b c0318b = (C0318b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0318b(c0318b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0318b(c0318b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                c0325i.f3917f = hashMap3;
                c0325i.f3913a = id;
                int i2 = c0321e.f3863e;
                C0326j c0326j = c0325i.d;
                c0326j.h = i2;
                c0326j.i = c0321e.f3865f;
                c0326j.f3959j = c0321e.f3867g;
                c0326j.f3960k = c0321e.h;
                c0326j.f3962l = c0321e.i;
                c0326j.f3964m = c0321e.f3871j;
                c0326j.f3966n = c0321e.f3872k;
                c0326j.f3968o = c0321e.f3874l;
                c0326j.f3970p = c0321e.f3876m;
                c0326j.f3971q = c0321e.f3878n;
                c0326j.f3972r = c0321e.f3880o;
                c0326j.f3973s = c0321e.f3886s;
                c0326j.f3974t = c0321e.f3887t;
                c0326j.f3975u = c0321e.f3888u;
                c0326j.f3976v = c0321e.f3889v;
                c0326j.f3977w = c0321e.f3835E;
                c0326j.f3978x = c0321e.F;
                c0326j.f3979y = c0321e.f3836G;
                c0326j.f3980z = c0321e.f3882p;
                c0326j.f3919A = c0321e.f3884q;
                c0326j.f3920B = c0321e.f3885r;
                c0326j.f3921C = c0321e.f3849T;
                c0326j.f3922D = c0321e.f3850U;
                c0326j.f3923E = c0321e.f3851V;
                c0326j.f3953f = c0321e.f3860c;
                c0326j.d = c0321e.f3856a;
                c0326j.f3951e = c0321e.f3858b;
                c0326j.f3946b = ((ViewGroup.MarginLayoutParams) c0321e).width;
                c0326j.f3948c = ((ViewGroup.MarginLayoutParams) c0321e).height;
                c0326j.F = ((ViewGroup.MarginLayoutParams) c0321e).leftMargin;
                c0326j.f3924G = ((ViewGroup.MarginLayoutParams) c0321e).rightMargin;
                c0326j.f3925H = ((ViewGroup.MarginLayoutParams) c0321e).topMargin;
                c0326j.f3926I = ((ViewGroup.MarginLayoutParams) c0321e).bottomMargin;
                c0326j.f3929L = c0321e.f3834D;
                c0326j.f3937T = c0321e.f3838I;
                c0326j.f3938U = c0321e.f3837H;
                c0326j.f3940W = c0321e.f3840K;
                c0326j.f3939V = c0321e.f3839J;
                c0326j.f3963l0 = c0321e.f3852W;
                c0326j.f3965m0 = c0321e.f3853X;
                c0326j.f3941X = c0321e.f3841L;
                c0326j.f3942Y = c0321e.f3842M;
                c0326j.f3943Z = c0321e.f3845P;
                c0326j.f3945a0 = c0321e.f3846Q;
                c0326j.f3947b0 = c0321e.f3843N;
                c0326j.f3949c0 = c0321e.f3844O;
                c0326j.f3950d0 = c0321e.f3847R;
                c0326j.f3952e0 = c0321e.f3848S;
                c0326j.f3961k0 = c0321e.f3854Y;
                c0326j.f3931N = c0321e.f3891x;
                c0326j.f3933P = c0321e.f3893z;
                c0326j.f3930M = c0321e.f3890w;
                c0326j.f3932O = c0321e.f3892y;
                c0326j.f3935R = c0321e.f3831A;
                c0326j.f3934Q = c0321e.f3832B;
                c0326j.f3936S = c0321e.f3833C;
                c0326j.f3969o0 = c0321e.f3855Z;
                c0326j.f3927J = c0321e.getMarginEnd();
                c0326j.f3928K = c0321e.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = c0325i.f3914b;
                lVar.f3988a = visibility;
                lVar.f3990c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = c0325i.f3916e;
                mVar.f3992a = rotation;
                mVar.f3993b = childAt.getRotationX();
                mVar.f3994c = childAt.getRotationY();
                mVar.d = childAt.getScaleX();
                mVar.f3995e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f3996f = pivotX;
                    mVar.f3997g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.f3998j = childAt.getTranslationY();
                mVar.f3999k = childAt.getTranslationZ();
                if (mVar.f4000l) {
                    mVar.f4001m = childAt.getElevation();
                }
                if (childAt instanceof C0317a) {
                    C0317a c0317a = (C0317a) childAt;
                    c0326j.f3967n0 = c0317a.getAllowsGoneWidget();
                    c0326j.f3958i0 = c0317a.getReferencedIds();
                    c0326j.f3954f0 = c0317a.getType();
                    c0326j.f3956g0 = c0317a.getMargin();
                }
            }
            i++;
            nVar = this;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0325i d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.d.f3944a = true;
                    }
                    this.f4006c.put(Integer.valueOf(d2.f3913a), d2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
