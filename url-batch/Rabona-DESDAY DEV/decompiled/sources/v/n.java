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
import q.AbstractC0291e;
import r.AbstractC0294a;
import s.C0296a;
import u.AbstractC0318a;

/* loaded from: classes.dex */
public final class n {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4024e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4025f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4026a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4027b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4028c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4024e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4025f = sparseIntArray2;
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

    public static int[] c(C0320a c0320a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c0320a.getContext();
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
            if (i == 0 && c0320a.isInEditMode() && (c0320a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0320a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1263m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1263m.get(trim);
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
    public static C0328i d(Context context, AttributeSet attributeSet, boolean z2) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        C0328i c0328i = new C0328i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? r.f4032c : r.f4030a);
        int[] iArr = d;
        SparseIntArray sparseIntArray = f4024e;
        l lVar = c0328i.f3936b;
        String[] strArr = AbstractC0294a.f3576a;
        m mVar = c0328i.f3938e;
        k kVar = c0328i.f3937c;
        C0329j c0329j = c0328i.d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            C0327h c0327h = new C0327h();
            c0327h.f3926a = new int[10];
            c0327h.f3927b = new int[10];
            c0327h.f3928c = 0;
            c0327h.d = new int[10];
            c0327h.f3929e = new float[10];
            c0327h.f3930f = 0;
            c0327h.f3931g = new int[5];
            c0327h.h = new String[5];
            c0327h.i = 0;
            c0327h.f3932j = new int[4];
            c0327h.f3933k = new boolean[4];
            c0327h.f3934l = 0;
            kVar.getClass();
            c0329j.getClass();
            mVar.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f4025f.get(index)) {
                    case 2:
                        str4 = str5;
                        c0327h.b(2, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3948I));
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
                        c0327h.d(obtainStyledAttributes.getString(index), 5);
                        i3 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        c0327h.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, c0329j.f3943C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        c0327h.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, c0329j.f3944D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        c0327h.b(8, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3949J));
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        c0327h.b(11, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3955P));
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        c0327h.b(12, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3956Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        c0327h.b(13, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3952M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        c0327h.b(14, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3954O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        c0327h.b(15, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3957R));
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        c0327h.b(16, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3953N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        c0327h.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, c0329j.d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        c0327h.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, c0329j.f3973e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        c0327h.a(19, obtainStyledAttributes.getFloat(index, c0329j.f3975f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        c0327h.a(20, obtainStyledAttributes.getFloat(index, c0329j.f3999w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        c0327h.b(21, obtainStyledAttributes.getLayoutDimension(index, c0329j.f3970c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        c0327h.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f4010a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        c0327h.b(23, obtainStyledAttributes.getLayoutDimension(index, c0329j.f3968b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        c0327h.b(24, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        c0327h.b(27, obtainStyledAttributes.getInt(index, c0329j.f3945E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        c0327h.b(28, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3946G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        c0327h.b(31, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3950K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        c0327h.b(34, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3947H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        c0327h.a(37, obtainStyledAttributes.getFloat(index, c0329j.f4000x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c0328i.f3935a);
                        c0328i.f3935a = resourceId;
                        c0327h.b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        c0327h.a(39, obtainStyledAttributes.getFloat(index, c0329j.f3960U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        c0327h.a(40, obtainStyledAttributes.getFloat(index, c0329j.f3959T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        c0327h.b(41, obtainStyledAttributes.getInt(index, c0329j.f3961V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        c0327h.b(42, obtainStyledAttributes.getInt(index, c0329j.f3962W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        c0327h.a(43, obtainStyledAttributes.getFloat(index, lVar.f4012c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        c0327h.c(44, true);
                        c0327h.a(44, obtainStyledAttributes.getDimension(index, mVar.f4023m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        c0327h.a(45, obtainStyledAttributes.getFloat(index, mVar.f4015b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        c0327h.a(46, obtainStyledAttributes.getFloat(index, mVar.f4016c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        c0327h.a(47, obtainStyledAttributes.getFloat(index, mVar.d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        c0327h.a(48, obtainStyledAttributes.getFloat(index, mVar.f4017e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        c0327h.a(49, obtainStyledAttributes.getDimension(index, mVar.f4018f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        c0327h.a(50, obtainStyledAttributes.getDimension(index, mVar.f4019g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        c0327h.a(51, obtainStyledAttributes.getDimension(index, mVar.i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        c0327h.a(52, obtainStyledAttributes.getDimension(index, mVar.f4020j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        c0327h.a(53, obtainStyledAttributes.getDimension(index, mVar.f4021k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        c0327h.b(54, obtainStyledAttributes.getInt(index, c0329j.f3963X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        c0327h.b(55, obtainStyledAttributes.getInt(index, c0329j.f3964Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        c0327h.b(56, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3965Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        c0327h.b(57, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3967a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        c0327h.b(58, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3969b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        c0327h.b(59, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3971c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        c0327h.a(60, obtainStyledAttributes.getFloat(index, mVar.f4014a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        c0327h.b(62, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3941A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        c0327h.a(63, obtainStyledAttributes.getFloat(index, c0329j.f3942B));
                        i3 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        c0327h.b(64, f(obtainStyledAttributes, index, kVar.f4004a));
                        i3 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c0327h.d(obtainStyledAttributes.getString(index), 65);
                        } else {
                            c0327h.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        c0327h.b(66, obtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        c0327h.a(67, obtainStyledAttributes.getFloat(index, kVar.f4007e));
                        i3 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        c0327h.a(68, obtainStyledAttributes.getFloat(index, lVar.d));
                        i3 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        c0327h.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        c0327h.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i3 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        c0327h.b(72, obtainStyledAttributes.getInt(index, c0329j.f3976f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        c0327h.b(73, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3978g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        c0327h.d(obtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        c0327h.c(75, obtainStyledAttributes.getBoolean(index, c0329j.f3989n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        c0327h.b(76, obtainStyledAttributes.getInt(index, kVar.f4006c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        c0327h.d(obtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        c0327h.b(78, obtainStyledAttributes.getInt(index, lVar.f4011b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        c0327h.a(79, obtainStyledAttributes.getFloat(index, kVar.d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        c0327h.c(80, obtainStyledAttributes.getBoolean(index, c0329j.f3985l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        c0327h.c(81, obtainStyledAttributes.getBoolean(index, c0329j.f3987m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        c0327h.b(82, obtainStyledAttributes.getInteger(index, kVar.f4005b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        c0327h.b(83, f(obtainStyledAttributes, index, mVar.h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        c0327h.b(84, obtainStyledAttributes.getInteger(index, kVar.f4009g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        c0327h.a(85, obtainStyledAttributes.getFloat(index, kVar.f4008f));
                        i3 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.i = resourceId2;
                            c0327h.b(89, resourceId2);
                            if (kVar.i != -1) {
                                c0327h.b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.h = string;
                            c0327h.d(string, 90);
                            if (kVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                kVar.i = resourceId3;
                                c0327h.b(89, resourceId3);
                                c0327h.b(88, -2);
                            } else {
                                c0327h.b(88, -1);
                            }
                        } else {
                            c0327h.b(88, obtainStyledAttributes.getInteger(index, kVar.i));
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
                        c0327h.b(93, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3951L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        c0327h.b(94, obtainStyledAttributes.getDimensionPixelSize(index, c0329j.f3958S));
                        i3 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        g(c0327h, obtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i3 = 1;
                        g(c0327h, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        c0327h.b(97, obtainStyledAttributes.getInt(index, c0329j.f3991o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC0318a.f3827s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            c0328i.f3935a = obtainStyledAttributes.getResourceId(index, c0328i.f3935a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        c0327h.c(99, obtainStyledAttributes.getBoolean(index, c0329j.f3977g));
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
                    c0329j.getClass();
                    mVar.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3992p = f(obtainStyledAttributes, index2, c0329j.f3992p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3948I = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3948I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3990o = f(obtainStyledAttributes, index2, c0329j.f3990o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3988n = f(obtainStyledAttributes, index2, c0329j.f3988n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f4001y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3943C = obtainStyledAttributes.getDimensionPixelOffset(index2, c0329j.f3943C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3944D = obtainStyledAttributes.getDimensionPixelOffset(index2, c0329j.f3944D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3949J = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3949J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3998v = f(obtainStyledAttributes, index2, c0329j.f3998v);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3997u = f(obtainStyledAttributes, index2, c0329j.f3997u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3955P = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3955P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3956Q = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3956Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3952M = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3952M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3954O = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3954O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3957R = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3957R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3953N = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3953N);
                        i2 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.d = obtainStyledAttributes.getDimensionPixelOffset(index2, c0329j.d);
                        i2 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3973e = obtainStyledAttributes.getDimensionPixelOffset(index2, c0329j.f3973e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3975f = obtainStyledAttributes.getFloat(index2, c0329j.f3975f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3999w = obtainStyledAttributes.getFloat(index2, c0329j.f3999w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3970c = obtainStyledAttributes.getLayoutDimension(index2, c0329j.f3970c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = obtainStyledAttributes.getInt(index2, lVar.f4010a);
                        lVar.f4010a = i10;
                        lVar.f4010a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3968b = obtainStyledAttributes.getLayoutDimension(index2, c0329j.f3968b);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.F = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.F);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.h = f(obtainStyledAttributes, index2, c0329j.h);
                        i2 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.i = f(obtainStyledAttributes, index2, c0329j.i);
                        i2 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3945E = obtainStyledAttributes.getInt(index2, c0329j.f3945E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3946G = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3946G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3981j = f(obtainStyledAttributes, index2, c0329j.f3981j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3982k = f(obtainStyledAttributes, index2, c0329j.f3982k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3950K = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3950K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3995s = f(obtainStyledAttributes, index2, c0329j.f3995s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3996t = f(obtainStyledAttributes, index2, c0329j.f3996t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3947H = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3947H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3986m = f(obtainStyledAttributes, index2, c0329j.f3986m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3984l = f(obtainStyledAttributes, index2, c0329j.f3984l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f4000x = obtainStyledAttributes.getFloat(index2, c0329j.f4000x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0328i.f3935a = obtainStyledAttributes.getResourceId(index2, c0328i.f3935a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3960U = obtainStyledAttributes.getFloat(index2, c0329j.f3960U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3959T = obtainStyledAttributes.getFloat(index2, c0329j.f3959T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3961V = obtainStyledAttributes.getInt(index2, c0329j.f3961V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3962W = obtainStyledAttributes.getInt(index2, c0329j.f3962W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        lVar.f4012c = obtainStyledAttributes.getFloat(index2, lVar.f4012c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4022l = true;
                        mVar.f4023m = obtainStyledAttributes.getDimension(index2, mVar.f4023m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4015b = obtainStyledAttributes.getFloat(index2, mVar.f4015b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4016c = obtainStyledAttributes.getFloat(index2, mVar.f4016c);
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
                        mVar.f4017e = obtainStyledAttributes.getFloat(index2, mVar.f4017e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4018f = obtainStyledAttributes.getDimension(index2, mVar.f4018f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4019g = obtainStyledAttributes.getDimension(index2, mVar.f4019g);
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
                        mVar.f4020j = obtainStyledAttributes.getDimension(index2, mVar.f4020j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4021k = obtainStyledAttributes.getDimension(index2, mVar.f4021k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3963X = obtainStyledAttributes.getInt(index2, c0329j.f3963X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3964Y = obtainStyledAttributes.getInt(index2, c0329j.f3964Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3965Z = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3965Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3967a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3967a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3969b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3969b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3971c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3971c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4014a = obtainStyledAttributes.getFloat(index2, mVar.f4014a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f4002z = f(obtainStyledAttributes, index2, c0329j.f4002z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3941A = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3941A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        c0329j.f3942B = obtainStyledAttributes.getFloat(index2, c0329j.f3942B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4004a = f(obtainStyledAttributes, index2, kVar.f4004a);
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
                        kVar.f4007e = obtainStyledAttributes.getFloat(index2, kVar.f4007e);
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
                        c0329j.f3972d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        c0329j.f3974e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
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
                        c0329j.f3976f0 = obtainStyledAttributes.getInt(index2, c0329j.f3976f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        c0329j.f3978g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3978g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        c0329j.j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        c0329j.f3989n0 = obtainStyledAttributes.getBoolean(index2, c0329j.f3989n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4006c = obtainStyledAttributes.getInt(index2, kVar.f4006c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        c0329j.f3983k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4011b = obtainStyledAttributes.getInt(index2, lVar.f4011b);
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
                        c0329j.f3985l0 = obtainStyledAttributes.getBoolean(index2, c0329j.f3985l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        c0329j.f3987m0 = obtainStyledAttributes.getBoolean(index2, c0329j.f3987m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4005b = obtainStyledAttributes.getInteger(index2, kVar.f4005b);
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
                        kVar.f4009g = obtainStyledAttributes.getInteger(index2, kVar.f4009g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4008f = obtainStyledAttributes.getFloat(index2, kVar.f4008f);
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
                        c0329j.f3993q = f(obtainStyledAttributes, index2, c0329j.f3993q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        c0329j.f3994r = f(obtainStyledAttributes, index2, c0329j.f3994r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        c0329j.f3951L = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3951L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        c0329j.f3958S = obtainStyledAttributes.getDimensionPixelSize(index2, c0329j.f3958S);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        str2 = str8;
                        g(c0329j, obtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        str2 = str8;
                        g(c0329j, obtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 97:
                        i = indexCount2;
                        str2 = str8;
                        c0329j.f3991o0 = obtainStyledAttributes.getInt(index2, c0329j.f3991o0);
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
            if (c0329j.j0 != null) {
                c0329j.f3980i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c0328i;
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
                    if (obj instanceof C0324e) {
                        C0324e c0324e = (C0324e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0324e).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0324e).height = 0;
                        }
                        h(c0324e, trim2);
                        return;
                    }
                    if (obj instanceof C0329j) {
                        ((C0329j) obj).f4001y = trim2;
                        return;
                    } else {
                        if (obj instanceof C0327h) {
                            ((C0327h) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof C0324e) {
                            C0324e c0324e2 = (C0324e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0324e2).width = 0;
                                c0324e2.f3859H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0324e2).height = 0;
                                c0324e2.f3860I = parseFloat;
                            }
                        } else if (obj instanceof C0329j) {
                            C0329j c0329j = (C0329j) obj;
                            if (i2 == 0) {
                                c0329j.f3968b = 0;
                                c0329j.f3960U = parseFloat;
                            } else {
                                c0329j.f3970c = 0;
                                c0329j.f3959T = parseFloat;
                            }
                        } else if (obj instanceof C0327h) {
                            C0327h c0327h = (C0327h) obj;
                            if (i2 == 0) {
                                c0327h.b(23, 0);
                                c0327h.a(39, parseFloat);
                            } else {
                                c0327h.b(21, 0);
                                c0327h.a(40, parseFloat);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(trim)) {
                            return;
                        }
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof C0324e) {
                            C0324e c0324e3 = (C0324e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c0324e3).width = 0;
                                c0324e3.f3869R = max;
                                c0324e3.f3863L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c0324e3).height = 0;
                                c0324e3.f3870S = max;
                                c0324e3.f3864M = 2;
                            }
                        } else if (obj instanceof C0329j) {
                            C0329j c0329j2 = (C0329j) obj;
                            if (i2 == 0) {
                                c0329j2.f3968b = 0;
                                c0329j2.f3972d0 = max;
                                c0329j2.f3963X = 2;
                            } else {
                                c0329j2.f3970c = 0;
                                c0329j2.f3974e0 = max;
                                c0329j2.f3964Y = 2;
                            }
                        } else if (obj instanceof C0327h) {
                            C0327h c0327h2 = (C0327h) obj;
                            if (i2 == 0) {
                                c0327h2.b(23, 0);
                                c0327h2.b(54, 2);
                            } else {
                                c0327h2.b(21, 0);
                                c0327h2.b(55, 2);
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
            if (!(obj instanceof C0324e)) {
                C0324e c0324e4 = (C0324e) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c0324e4).width = i4;
                    c0324e4.f3874W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c0324e4).height = i4;
                    c0324e4.f3875X = z2;
                    return;
                }
            }
            if (obj instanceof C0329j) {
                C0329j c0329j3 = (C0329j) obj;
                if (i2 == 0) {
                    c0329j3.f3968b = i4;
                    c0329j3.f3985l0 = z2;
                    return;
                } else {
                    c0329j3.f3970c = i4;
                    c0329j3.f3987m0 = z2;
                    return;
                }
            }
            if (obj instanceof C0327h) {
                C0327h c0327h3 = (C0327h) obj;
                if (i2 == 0) {
                    c0327h3.b(23, i4);
                    c0327h3.c(80, z2);
                    return;
                } else {
                    c0327h3.b(21, i4);
                    c0327h3.c(81, z2);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z2 = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof C0324e)) {
        }
    }

    public static void h(C0324e c0324e, String str) {
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
        c0324e.f3858G = str;
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
        HashMap hashMap2 = nVar.f4028c;
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
                if (nVar.f4027b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0328i c0328i = (C0328i) hashMap2.get(Integer.valueOf(id));
                        if (c0328i != null) {
                            if (childAt instanceof C0320a) {
                                C0329j c0329j = c0328i.d;
                                c0329j.f3979h0 = 1;
                                C0320a c0320a = (C0320a) childAt;
                                c0320a.setId(id);
                                c0320a.setType(c0329j.f3976f0);
                                c0320a.setMargin(c0329j.f3978g0);
                                c0320a.setAllowsGoneWidget(c0329j.f3989n0);
                                int[] iArr = c0329j.f3980i0;
                                if (iArr != null) {
                                    c0320a.setReferencedIds(iArr);
                                } else {
                                    String str3 = c0329j.j0;
                                    if (str3 != null) {
                                        int[] c2 = c(c0320a, str3);
                                        c0329j.f3980i0 = c2;
                                        c0320a.setReferencedIds(c2);
                                    }
                                }
                            }
                            C0324e c0324e = (C0324e) childAt.getLayoutParams();
                            c0324e.a();
                            c0328i.a(c0324e);
                            HashMap hashMap3 = c0328i.f3939f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                C0321b c0321b = (C0321b) hashMap3.get(str4);
                                if (c0321b.f3840a) {
                                    hashMap = hashMap3;
                                    str = str4;
                                } else {
                                    hashMap = hashMap3;
                                    str = "set" + str4;
                                }
                                try {
                                    switch (AbstractC0291e.a(c0321b.f3841b)) {
                                        case 0:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0321b.f3842c));
                                            break;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0321b.d));
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0321b.f3845g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i2 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0321b.f3845g);
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
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0321b.f3843e);
                                            i2 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0321b.f3844f));
                                            i2 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0321b.d));
                                            i2 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0321b.f3842c));
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
                            childAt.setLayoutParams(c0324e);
                            l lVar = c0328i.f3936b;
                            if (lVar.f4011b == 0) {
                                childAt.setVisibility(lVar.f4010a);
                            }
                            childAt.setAlpha(lVar.f4012c);
                            m mVar = c0328i.f3938e;
                            childAt.setRotation(mVar.f4014a);
                            childAt.setRotationX(mVar.f4015b);
                            childAt.setRotationY(mVar.f4016c);
                            childAt.setScaleX(mVar.d);
                            childAt.setScaleY(mVar.f4017e);
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
                                if (!Float.isNaN(mVar.f4018f)) {
                                    childAt.setPivotX(mVar.f4018f);
                                }
                                if (!Float.isNaN(mVar.f4019g)) {
                                    childAt.setPivotY(mVar.f4019g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.f4020j);
                            childAt.setTranslationZ(mVar.f4021k);
                            if (mVar.f4022l) {
                                childAt.setElevation(mVar.f4023m);
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
            C0328i c0328i2 = (C0328i) hashMap2.get(num);
            if (c0328i2 != null) {
                C0329j c0329j2 = c0328i2.d;
                if (c0329j2.f3979h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C0320a c0320a2 = new C0320a(context);
                    c0320a2.f3846a = new int[32];
                    c0320a2.f3851g = new HashMap();
                    c0320a2.f3848c = context;
                    C0296a c0296a = new C0296a();
                    c0296a.f3592s0 = 0;
                    c0296a.f3593t0 = true;
                    c0296a.f3594u0 = 0;
                    c0296a.f3595v0 = false;
                    c0320a2.f3839j = c0296a;
                    c0320a2.d = c0296a;
                    c0320a2.i();
                    c0320a2.setVisibility(8);
                    c0320a2.setId(num.intValue());
                    int[] iArr2 = c0329j2.f3980i0;
                    if (iArr2 != null) {
                        c0320a2.setReferencedIds(iArr2);
                    } else {
                        String str5 = c0329j2.j0;
                        if (str5 != null) {
                            int[] c3 = c(c0320a2, str5);
                            c0329j2.f3980i0 = c3;
                            c0320a2.setReferencedIds(c3);
                        }
                    }
                    c0320a2.setType(c0329j2.f3976f0);
                    c0320a2.setMargin(c0329j2.f3978g0);
                    C0324e g2 = ConstraintLayout.g();
                    c0320a2.i();
                    c0328i2.a(g2);
                    constraintLayout.addView(c0320a2, g2);
                }
                if (c0329j2.f3966a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    C0324e g3 = ConstraintLayout.g();
                    c0328i2.a(g3);
                    constraintLayout.addView(pVar, g3);
                }
            }
        }
        for (int i5 = 0; i5 < i4; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof AbstractC0322c) {
                ((AbstractC0322c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f4028c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0324e c0324e = (C0324e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f4027b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C0328i());
            }
            C0328i c0328i = (C0328i) hashMap.get(Integer.valueOf(id));
            if (c0328i != null) {
                HashMap hashMap2 = nVar.f4026a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0321b c0321b = (C0321b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0321b(c0321b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0321b(c0321b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                c0328i.f3939f = hashMap3;
                c0328i.f3935a = id;
                int i2 = c0324e.f3885e;
                C0329j c0329j = c0328i.d;
                c0329j.h = i2;
                c0329j.i = c0324e.f3887f;
                c0329j.f3981j = c0324e.f3889g;
                c0329j.f3982k = c0324e.h;
                c0329j.f3984l = c0324e.i;
                c0329j.f3986m = c0324e.f3893j;
                c0329j.f3988n = c0324e.f3894k;
                c0329j.f3990o = c0324e.f3896l;
                c0329j.f3992p = c0324e.f3898m;
                c0329j.f3993q = c0324e.f3900n;
                c0329j.f3994r = c0324e.f3902o;
                c0329j.f3995s = c0324e.f3908s;
                c0329j.f3996t = c0324e.f3909t;
                c0329j.f3997u = c0324e.f3910u;
                c0329j.f3998v = c0324e.f3911v;
                c0329j.f3999w = c0324e.f3857E;
                c0329j.f4000x = c0324e.F;
                c0329j.f4001y = c0324e.f3858G;
                c0329j.f4002z = c0324e.f3904p;
                c0329j.f3941A = c0324e.f3906q;
                c0329j.f3942B = c0324e.f3907r;
                c0329j.f3943C = c0324e.f3871T;
                c0329j.f3944D = c0324e.f3872U;
                c0329j.f3945E = c0324e.f3873V;
                c0329j.f3975f = c0324e.f3882c;
                c0329j.d = c0324e.f3878a;
                c0329j.f3973e = c0324e.f3880b;
                c0329j.f3968b = ((ViewGroup.MarginLayoutParams) c0324e).width;
                c0329j.f3970c = ((ViewGroup.MarginLayoutParams) c0324e).height;
                c0329j.F = ((ViewGroup.MarginLayoutParams) c0324e).leftMargin;
                c0329j.f3946G = ((ViewGroup.MarginLayoutParams) c0324e).rightMargin;
                c0329j.f3947H = ((ViewGroup.MarginLayoutParams) c0324e).topMargin;
                c0329j.f3948I = ((ViewGroup.MarginLayoutParams) c0324e).bottomMargin;
                c0329j.f3951L = c0324e.f3856D;
                c0329j.f3959T = c0324e.f3860I;
                c0329j.f3960U = c0324e.f3859H;
                c0329j.f3962W = c0324e.f3862K;
                c0329j.f3961V = c0324e.f3861J;
                c0329j.f3985l0 = c0324e.f3874W;
                c0329j.f3987m0 = c0324e.f3875X;
                c0329j.f3963X = c0324e.f3863L;
                c0329j.f3964Y = c0324e.f3864M;
                c0329j.f3965Z = c0324e.f3867P;
                c0329j.f3967a0 = c0324e.f3868Q;
                c0329j.f3969b0 = c0324e.f3865N;
                c0329j.f3971c0 = c0324e.f3866O;
                c0329j.f3972d0 = c0324e.f3869R;
                c0329j.f3974e0 = c0324e.f3870S;
                c0329j.f3983k0 = c0324e.f3876Y;
                c0329j.f3953N = c0324e.f3913x;
                c0329j.f3955P = c0324e.f3915z;
                c0329j.f3952M = c0324e.f3912w;
                c0329j.f3954O = c0324e.f3914y;
                c0329j.f3957R = c0324e.f3853A;
                c0329j.f3956Q = c0324e.f3854B;
                c0329j.f3958S = c0324e.f3855C;
                c0329j.f3991o0 = c0324e.f3877Z;
                c0329j.f3949J = c0324e.getMarginEnd();
                c0329j.f3950K = c0324e.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = c0328i.f3936b;
                lVar.f4010a = visibility;
                lVar.f4012c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = c0328i.f3938e;
                mVar.f4014a = rotation;
                mVar.f4015b = childAt.getRotationX();
                mVar.f4016c = childAt.getRotationY();
                mVar.d = childAt.getScaleX();
                mVar.f4017e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f4018f = pivotX;
                    mVar.f4019g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.f4020j = childAt.getTranslationY();
                mVar.f4021k = childAt.getTranslationZ();
                if (mVar.f4022l) {
                    mVar.f4023m = childAt.getElevation();
                }
                if (childAt instanceof C0320a) {
                    C0320a c0320a = (C0320a) childAt;
                    c0329j.f3989n0 = c0320a.getAllowsGoneWidget();
                    c0329j.f3980i0 = c0320a.getReferencedIds();
                    c0329j.f3976f0 = c0320a.getType();
                    c0329j.f3978g0 = c0320a.getMargin();
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
                    C0328i d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.d.f3966a = true;
                    }
                    this.f4028c.put(Integer.valueOf(d2.f3935a), d2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
