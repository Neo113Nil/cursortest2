package com.techno_world.pencil.sketch.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.Log;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public class Conve {
    private static final String TAG = "Blur";

    public static Bitmap fastblur(Context context, Bitmap bitmap, int i) {
        int[] iArr;
        int i2 = i;
        if (Build.VERSION.SDK_INT > 16) {
            Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
            RenderScript create = RenderScript.create(context);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            create2.setRadius(i2);
            create2.setInput(createFromBitmap);
            create2.forEach(createTyped);
            createTyped.copyTo(copy);
            return copy;
        }
        Bitmap copy2 = bitmap.copy(bitmap.getConfig(), true);
        if (i2 < 1) {
            return null;
        }
        int width = copy2.getWidth();
        int height = copy2.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        Log.e("pix", width + " " + height + " " + i3);
        copy2.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width + (-1);
        int i5 = height + (-1);
        int i6 = i2 + i2 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i7 = (i6 + 1) >> 1;
        int i8 = i7 * i7;
        int i9 = i8 * 256;
        int[] iArr7 = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr7[i10] = i10 / i8;
        }
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) int.class, i6, 3);
        int i11 = i2 + 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < height) {
            int i15 = i3;
            int i16 = height;
            int i17 = -i2;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i17 <= i2) {
                int i27 = i5;
                int[] iArr9 = iArr6;
                int i28 = iArr2[i13 + Math.min(i4, Math.max(i17, 0))];
                int[] iArr10 = iArr8[i17 + i2];
                iArr10[0] = (i28 & 16711680) >> 16;
                iArr10[1] = (i28 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr10[2] = i28 & 255;
                int abs = i11 - Math.abs(i17);
                i18 += iArr10[0] * abs;
                i19 += iArr10[1] * abs;
                i20 += iArr10[2] * abs;
                if (i17 > 0) {
                    i24 += iArr10[0];
                    i25 += iArr10[1];
                    i26 += iArr10[2];
                } else {
                    i21 += iArr10[0];
                    i22 += iArr10[1];
                    i23 += iArr10[2];
                }
                i17++;
                i5 = i27;
                iArr6 = iArr9;
            }
            int i29 = i5;
            int[] iArr11 = iArr6;
            int i30 = i2;
            int i31 = 0;
            while (i31 < width) {
                iArr3[i13] = iArr7[i18];
                iArr4[i13] = iArr7[i19];
                iArr5[i13] = iArr7[i20];
                int i32 = i18 - i21;
                int i33 = i19 - i22;
                int i34 = i20 - i23;
                int[] iArr12 = iArr8[((i30 - i2) + i6) % i6];
                int i35 = i21 - iArr12[0];
                int i36 = i22 - iArr12[1];
                int i37 = i23 - iArr12[2];
                if (i12 == 0) {
                    iArr = iArr7;
                    iArr11[i31] = Math.min(i31 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i38 = iArr2[i14 + iArr11[i31]];
                iArr12[0] = (i38 & 16711680) >> 16;
                iArr12[1] = (i38 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr12[2] = i38 & 255;
                int i39 = i24 + iArr12[0];
                int i40 = i25 + iArr12[1];
                int i41 = i26 + iArr12[2];
                i18 = i32 + i39;
                i19 = i33 + i40;
                i20 = i34 + i41;
                i30 = (i30 + 1) % i6;
                int[] iArr13 = iArr8[i30 % i6];
                i21 = i35 + iArr13[0];
                i22 = i36 + iArr13[1];
                i23 = i37 + iArr13[2];
                i24 = i39 - iArr13[0];
                i25 = i40 - iArr13[1];
                i26 = i41 - iArr13[2];
                i13++;
                i31++;
                iArr7 = iArr;
            }
            i14 += width;
            i12++;
            i3 = i15;
            height = i16;
            i5 = i29;
            iArr6 = iArr11;
        }
        int[] iArr14 = iArr7;
        int i42 = i5;
        int[] iArr15 = iArr6;
        int i43 = height;
        int i44 = i3;
        int i45 = 0;
        while (i45 < width) {
            int i46 = -i2;
            int i47 = i6;
            int[] iArr16 = iArr2;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = i46;
            int i56 = i46 * width;
            int i57 = 0;
            int i58 = 0;
            while (i55 <= i2) {
                int i59 = width;
                int max = Math.max(0, i56) + i45;
                int[] iArr17 = iArr8[i55 + i2];
                iArr17[0] = iArr3[max];
                iArr17[1] = iArr4[max];
                iArr17[2] = iArr5[max];
                int abs2 = i11 - Math.abs(i55);
                i57 += iArr3[max] * abs2;
                i58 += iArr4[max] * abs2;
                i48 += iArr5[max] * abs2;
                if (i55 > 0) {
                    i52 += iArr17[0];
                    i53 += iArr17[1];
                    i54 += iArr17[2];
                } else {
                    i49 += iArr17[0];
                    i50 += iArr17[1];
                    i51 += iArr17[2];
                }
                int i60 = i42;
                if (i55 < i60) {
                    i56 += i59;
                }
                i55++;
                i42 = i60;
                width = i59;
            }
            int i61 = width;
            int i62 = i42;
            int i63 = i2;
            int i64 = i45;
            int i65 = i48;
            int i66 = i43;
            int i67 = i58;
            int i68 = i57;
            int i69 = 0;
            while (i69 < i66) {
                iArr16[i64] = (iArr16[i64] & ViewCompat.MEASURED_STATE_MASK) | (iArr14[i68] << 16) | (iArr14[i67] << 8) | iArr14[i65];
                int i70 = i68 - i49;
                int i71 = i67 - i50;
                int i72 = i65 - i51;
                int[] iArr18 = iArr8[((i63 - i2) + i47) % i47];
                int i73 = i49 - iArr18[0];
                int i74 = i50 - iArr18[1];
                int i75 = i51 - iArr18[2];
                if (i45 == 0) {
                    iArr15[i69] = Math.min(i69 + i11, i62) * i61;
                }
                int i76 = iArr15[i69] + i45;
                iArr18[0] = iArr3[i76];
                iArr18[1] = iArr4[i76];
                iArr18[2] = iArr5[i76];
                int i77 = i52 + iArr18[0];
                int i78 = i53 + iArr18[1];
                int i79 = i54 + iArr18[2];
                i68 = i70 + i77;
                i67 = i71 + i78;
                i65 = i72 + i79;
                i63 = (i63 + 1) % i47;
                int[] iArr19 = iArr8[i63];
                i49 = i73 + iArr19[0];
                i50 = i74 + iArr19[1];
                i51 = i75 + iArr19[2];
                i52 = i77 - iArr19[0];
                i53 = i78 - iArr19[1];
                i54 = i79 - iArr19[2];
                i64 += i61;
                i69++;
                i2 = i;
            }
            i45++;
            i2 = i;
            i42 = i62;
            i43 = i66;
            i6 = i47;
            iArr2 = iArr16;
            width = i61;
        }
        int i80 = width;
        int[] iArr20 = iArr2;
        int i81 = i43;
        Log.e("pix", i80 + " " + i81 + " " + i44);
        copy2.setPixels(iArr20, 0, i80, 0, 0, i80, i81);
        return copy2;
    }
}
