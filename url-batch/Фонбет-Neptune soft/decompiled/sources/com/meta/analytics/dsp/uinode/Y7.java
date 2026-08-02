package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class Y7 implements AC {
    public static byte[] A04;
    public final int A00;
    public final long A01;
    public final Context A02;
    public final InterfaceC0311Bc<FrameworkMediaCrypto> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 84);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{113, 80, 83, 84, 64, 89, 65, 103, 80, 91, 81, 80, 71, 80, 71, 70, 115, 84, 86, 65, 90, 71, 76, Byte.MAX_VALUE, 72, 72, 85, 72, Ascii.SUB, 83, 84, 73, 78, 91, 84, 78, 83, 91, 78, 83, 84, 93, Ascii.SUB, 124, 124, 87, 74, 95, 93, Ascii.SUB, 95, 66, 78, 95, 84, 73, 83, 85, 84, 60, Ascii.VT, Ascii.VT, Ascii.SYN, Ascii.VT, 89, 16, Ascii.ETB, 10, Ascii.CR, Ascii.CAN, Ascii.ETB, Ascii.CR, 16, Ascii.CAN, Ascii.CR, 16, Ascii.ETB, Ascii.RS, 89, 63, 53, 56, 58, 89, Ascii.FS, 1, Ascii.CR, Ascii.FS, Ascii.ETB, 10, 16, Ascii.SYN, Ascii.ETB, 59, Ascii.FF, Ascii.FF, 17, Ascii.FF, 94, Ascii.ETB, 16, Ascii.CR, 10, Ascii.US, 16, 10, Ascii.ETB, Ascii.US, 10, Ascii.ETB, 16, Ascii.EM, 94, 49, Ascii.SO, Ascii.VT, Ascii.CR, 94, Ascii.ESC, 6, 10, Ascii.ESC, 16, Ascii.CR, Ascii.ETB, 17, 16, Ascii.CAN, 47, 47, 50, 47, 125, 52, 51, 46, 41, 60, 51, 41, 52, 60, 41, 52, 51, 58, 125, Ascii.VT, Ascii.CR, 100, 125, 56, 37, 41, 56, 51, 46, 52, 50, 51, 93, 126, 112, 117, 116, 117, 49, 87, 119, 124, 97, 116, 118, 80, 100, 117, 120, 126, 67, 116, Byte.MAX_VALUE, 117, 116, 99, 116, 99, 63, 81, 114, 124, 121, 120, 121, Base64.padSymbol, 81, 116, Byte.MAX_VALUE, 123, 113, 124, 126, 92, 104, 121, 116, 114, 79, 120, 115, 121, 120, 111, 120, 111, 51, 45, Ascii.SO, 0, 5, 4, 5, 65, 45, 8, 3, Ascii.SO, 17, Ascii.DC4, Ascii.DC2, 32, Ascii.DC4, 5, 8, Ascii.SO, 51, 4, Ascii.SI, 5, 4, 19, 4, 19, 79, 54, Ascii.NAK, Ascii.ESC, Ascii.RS, Ascii.US, Ascii.RS, 90, 54, 19, Ascii.CAN, Ascii.FF, 10, 2, 44, 19, Ascii.RS, Ascii.US, Ascii.NAK, 40, Ascii.US, Ascii.DC4, Ascii.RS, Ascii.US, 8, Ascii.US, 8, 84, 75, 71, 69, 6, 78, 73, 75, 77, 74, 71, 71, 67, 6, 73, 76, 91, 6, 65, 70, 92, 77, 90, 70, 73, 68, 6, 77, 80, 71, 88, 68, 73, 81, 77, 90, Ascii.SUB, 6, 77, 80, 92, 6, 78, 78, 69, 88, 77, 79, 6, 110, 78, 69, 88, 77, 79, 105, 93, 76, 65, 71, 122, 77, 70, 76, 77, 90, 77, 90, 84, 88, 90, Ascii.EM, 81, 86, 84, 82, 85, 88, 88, 92, Ascii.EM, 86, 83, 68, Ascii.EM, 94, 89, 67, 82, 69, 89, 86, 91, Ascii.EM, 82, 79, 88, 71, 91, 86, 78, 82, 69, 5, Ascii.EM, 82, 79, 67, Ascii.EM, 81, 91, 86, 84, Ascii.EM, 123, 94, 85, 81, 91, 86, 84, 118, 66, 83, 94, 88, 101, 82, 89, 83, 82, 69, 82, 69, 87, 91, 89, Ascii.SUB, 82, 85, 87, 81, 86, 91, 91, 95, Ascii.SUB, 85, 80, 71, Ascii.SUB, 93, 90, 64, 81, 70, 90, 85, 88, Ascii.SUB, 81, 76, 91, 68, 88, 85, 77, 81, 70, 6, Ascii.SUB, 81, 76, 64, Ascii.SUB, 91, 68, 65, 71, Ascii.SUB, 120, 93, 86, 91, 68, 65, 71, 117, 65, 80, 93, 91, 102, 81, 90, 80, 81, 70, 81, 70, 60, 48, 50, 113, 57, 62, 60, 58, Base64.padSymbol, 48, 48, 52, 113, 62, 59, 44, 113, 54, 49, 43, 58, 45, 49, 62, 51, 113, 58, 39, 48, 47, 51, 62, 38, 58, 45, 109, 113, 58, 39, 43, 113, 41, 47, 102, 113, 19, 54, Base64.padSymbol, 41, 47, 39, 9, 54, 59, 58, 48, Ascii.CR, 58, 49, 59, 58, 45, 58, 45};
    }

    public Y7(Context context) {
        this(context, 0);
    }

    public Y7(Context context, int i) {
        this(context, null, i, 5000L);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Deprecated
    public Y7(Context context, InterfaceC0311Bc<FrameworkMediaCrypto> interfaceC0311Bc, int i, long j) {
        this.A02 = context;
        this.A00 = i;
        this.A01 = j;
        this.A03 = interfaceC0311Bc;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    private final void A02(Context context, InterfaceC0311Bc<FrameworkMediaCrypto> interfaceC0311Bc, long j, Handler handler, InterfaceC0474Id interfaceC0474Id, int extensionRendererIndex, ArrayList<Y5> arrayList) {
        Class<?> cls;
        Class<?> clazz;
        Class<?> clazz2;
        Class<?> clazz3;
        arrayList.add(new C3F(context, DM.A00, j, interfaceC0311Bc, false, handler, interfaceC0474Id, 50));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            try {
                cls = Class.forName(A00(469, 64, 11));
                clazz = Boolean.TYPE;
                clazz2 = Long.TYPE;
                clazz3 = Integer.TYPE;
            } catch (Exception e) {
                e = e;
            }
            try {
                arrayList.add(size, (Y5) cls.getConstructor(clazz, clazz2, Handler.class, InterfaceC0474Id.class, clazz3).newInstance(true, Long.valueOf(j), handler, interfaceC0474Id, 50));
                Log.i(A00(0, 23, 97), A00(243, 27, 46));
            } catch (Exception e2) {
                e = e2;
                throw new RuntimeException(A00(127, 33, 9), e);
            }
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    private final void A03(Context context, InterfaceC0311Bc<FrameworkMediaCrypto> interfaceC0311Bc, InterfaceC0284Ab[] interfaceC0284AbArr, Handler handler, InterfaceC0292Aj interfaceC0292Aj, int i, ArrayList<Y5> arrayList) {
        int extensionRendererIndex;
        int i2;
        String A00 = A00(0, 23, 97);
        arrayList.add(new C3G(context, DM.A00, interfaceC0311Bc, false, handler, interfaceC0292Aj, AU.A00(context), interfaceC0284AbArr));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            extensionRendererIndex = size + 1;
            try {
                arrayList.add(size, (Y5) Class.forName(A00(TypedValues.CycleType.TYPE_ALPHA, 66, 96)).getConstructor(Handler.class, InterfaceC0292Aj.class, InterfaceC0284Ab[].class).newInstance(handler, interfaceC0292Aj, interfaceC0284AbArr));
                Log.i(A00, A00(215, 28, 53));
            } catch (ClassNotFoundException unused) {
                size = extensionRendererIndex;
                extensionRendererIndex = size;
                i2 = extensionRendererIndex + 1;
                arrayList.add(extensionRendererIndex, (Y5) Class.forName(A00(337, 66, 99)).getConstructor(Handler.class, InterfaceC0292Aj.class, InterfaceC0284Ab[].class).newInstance(handler, interfaceC0292Aj, interfaceC0284AbArr));
                Log.i(A00, A00(Opcodes.NEW, 28, 73));
                try {
                    try {
                        arrayList.add(i2, (Y5) Class.forName(A00(270, 67, 124)).getConstructor(Handler.class, InterfaceC0292Aj.class, InterfaceC0284Ab[].class).newInstance(handler, interfaceC0292Aj, interfaceC0284AbArr));
                        Log.i(A00, A00(Opcodes.IF_ICMPNE, 27, 69));
                    } catch (Exception e) {
                        e = e;
                        throw new RuntimeException(A00(23, 36, 110), e);
                    }
                } catch (ClassNotFoundException unused2) {
                    return;
                }
            } catch (Exception e2) {
                e = e2;
                throw new RuntimeException(A00(93, 34, 42), e);
            }
        } catch (ClassNotFoundException unused3) {
        } catch (Exception e3) {
            e = e3;
        }
        try {
            i2 = extensionRendererIndex + 1;
        } catch (ClassNotFoundException unused4) {
        } catch (Exception e4) {
            e = e4;
        }
        try {
            try {
                arrayList.add(extensionRendererIndex, (Y5) Class.forName(A00(337, 66, 99)).getConstructor(Handler.class, InterfaceC0292Aj.class, InterfaceC0284Ab[].class).newInstance(handler, interfaceC0292Aj, interfaceC0284AbArr));
                Log.i(A00, A00(Opcodes.NEW, 28, 73));
            } catch (ClassNotFoundException unused5) {
                extensionRendererIndex = i2;
                i2 = extensionRendererIndex;
                arrayList.add(i2, (Y5) Class.forName(A00(270, 67, 124)).getConstructor(Handler.class, InterfaceC0292Aj.class, InterfaceC0284Ab[].class).newInstance(handler, interfaceC0292Aj, interfaceC0284AbArr));
                Log.i(A00, A00(Opcodes.IF_ICMPNE, 27, 69));
            } catch (Exception e5) {
                e = e5;
                throw new RuntimeException(A00(59, 34, 45), e);
            }
            arrayList.add(i2, (Y5) Class.forName(A00(270, 67, 124)).getConstructor(Handler.class, InterfaceC0292Aj.class, InterfaceC0284Ab[].class).newInstance(handler, interfaceC0292Aj, interfaceC0284AbArr));
            Log.i(A00, A00(Opcodes.IF_ICMPNE, 27, 69));
        } catch (Exception e6) {
            e = e6;
        }
    }

    private final void A04(Context context, DZ dz, Looper looper, int i, ArrayList<Y5> arrayList) {
        arrayList.add(new C6W(dz, looper));
    }

    private final void A05(Context context, InterfaceC0412Fr interfaceC0412Fr, Looper looper, int i, ArrayList<Y5> arrayList) {
        arrayList.add(new AnonymousClass63(interfaceC0412Fr, looper));
    }

    private final InterfaceC0284Ab[] A06() {
        return new InterfaceC0284Ab[0];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Override // com.meta.analytics.dsp.uinode.AC
    public final Y5[] A4l(Handler handler, InterfaceC0474Id interfaceC0474Id, InterfaceC0292Aj interfaceC0292Aj, InterfaceC0412Fr interfaceC0412Fr, DZ dz, InterfaceC0311Bc<FrameworkMediaCrypto> interfaceC0311Bc) {
        InterfaceC0311Bc<FrameworkMediaCrypto> interfaceC0311Bc2 = interfaceC0311Bc;
        if (interfaceC0311Bc2 == null) {
            interfaceC0311Bc2 = null;
        }
        ArrayList<Y5> arrayList = new ArrayList<>();
        A02(this.A02, interfaceC0311Bc2, this.A01, handler, interfaceC0474Id, this.A00, arrayList);
        A03(this.A02, interfaceC0311Bc2, A06(), handler, interfaceC0292Aj, this.A00, arrayList);
        A05(this.A02, interfaceC0412Fr, handler.getLooper(), this.A00, arrayList);
        A04(this.A02, dz, handler.getLooper(), this.A00, arrayList);
        return (Y5[]) arrayList.toArray(new Y5[arrayList.size()]);
    }
}
