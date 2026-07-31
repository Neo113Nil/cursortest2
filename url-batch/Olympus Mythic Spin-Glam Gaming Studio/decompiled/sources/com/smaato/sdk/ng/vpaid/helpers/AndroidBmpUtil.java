package com.smaato.sdk.ng.vpaid.helpers;

import android.graphics.Bitmap;
import com.safedk.android.internal.partials.SmaatoFilesBridge;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class AndroidBmpUtil {
    private final int a = 4;
    private final int b = 3;

    private boolean a(int i, int i2) {
        return i2 > 0 && i2 % (i - 1) == 0;
    }

    private byte[] b(int i) throws IOException {
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >> 8), (byte) ((i & 16711680) >> 16)};
    }

    private byte[] c(int i) throws IOException {
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >> 8), (byte) ((16711680 & i) >> 16), (byte) ((i & (-16777216)) >> 24)};
    }

    public boolean save(Bitmap bitmap, String str) {
        int i;
        boolean z;
        byte[] bArr;
        if (bitmap == null || str == null) {
            return false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (a(width)) {
            i = 4 - (width % 4);
            int i2 = i * 3;
            byte[] bArr2 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                bArr2[i3] = -1;
            }
            bArr = bArr2;
            z = true;
        } else {
            i = 0;
            z = false;
            bArr = null;
        }
        int i4 = width * height;
        int[] iArr = new int[i4];
        int i5 = (i4 * 3) + (i * height * 3);
        int i6 = i5 + 54;
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        ByteBuffer allocate = ByteBuffer.allocate(i6);
        try {
            allocate.put((byte) 66);
            allocate.put((byte) 77);
            allocate.put(c(i6));
            allocate.put(a((short) 0));
            allocate.put(a((short) 0));
            allocate.put(c(54));
            allocate.put(c(40));
            allocate.put(c(width));
            allocate.put(c(height));
            allocate.put(a((short) 1));
            allocate.put(a((short) 24));
            allocate.put(c(0));
            allocate.put(c(i5));
            allocate.put(c(0));
            allocate.put(c(0));
            allocate.put(c(0));
            allocate.put(c(0));
            while (height > 0) {
                int i7 = height * width;
                for (int i8 = (height - 1) * width; i8 < i7; i8++) {
                    allocate.put(b(iArr[i8]));
                    if (z && a(width, i8)) {
                        allocate.put(bArr);
                    }
                }
                height--;
            }
            FileOutputStream fileOutputStreamCtor = SmaatoFilesBridge.fileOutputStreamCtor(str);
            fileOutputStreamCtor.write(allocate.array());
            fileOutputStreamCtor.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean a(int i) {
        return i % 4 > 0;
    }

    private byte[] a(short s) throws IOException {
        return new byte[]{(byte) (s & 255), (byte) ((s & 65280) >> 8)};
    }
}
