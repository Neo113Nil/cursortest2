package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class VW implements C2K {
    public static VW A01;
    public static byte[] A02;
    public static String[] A03 = {"F9VPCRzHFTAYh6WHGcx0Jd90Enb3hSh2", "fH8nu2kqsRdgHbOq", "0ARAQCTuMPQjF7tJb0MjvB18yGPry4Qu", "N48QVONPfFEZdhqNPTKHT8FFB7x206Ht", "sPSH6DBrw2hyfCGwQm6LEVZ2ITL2jpSj", "gRA8laRbRDS4iSEHtkOaasMfi52gbS0", "x", "ATQcDE"};
    public static final String A04;
    public final LinkedHashMap<String, C0489Iu> A00 = new LinkedHashMap<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{19, 4, Ascii.US, Ascii.NAK, Ascii.GS, Ascii.DC4, Ascii.SO, Ascii.DC4, 9, 5, 3, 16, 2, Ascii.SO, Ascii.SUB, Ascii.DC4, 8, 66, 99, 117, 114, 116, 105, Byte.MAX_VALUE, 99, 98, 38, 71, 98, 38, 84, 83, 85, 88, 70, 67, 88, 78, 67, 88, 76, 66, 94};
    }

    static {
        A02();
        A04 = VW.class.getSimpleName();
    }

    public static VW A00() {
        VW vw = A01;
        if (A03[3].charAt(18) != 'K') {
            throw new RuntimeException();
        }
        A03[1] = "1qA3QfWMYYAsctqz";
        if (vw == null) {
            A01 = new VW();
        }
        VW vw2 = A01;
        String[] strArr = A03;
        if (strArr[5].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A03[3] = "jddXnAGVDmATkeoPPEKFEO5X5Iu6IeIG";
        return vw2;
    }

    public final AnonymousClass23 A03(String str) {
        C0489Iu adRecord = this.A00.get(str);
        if (adRecord != null) {
            return adRecord.A00;
        }
        return null;
    }

    public final C0489Iu A04(String str) {
        return this.A00.get(str);
    }

    public final C0489Iu A05(String str, Messenger messenger, String str2) {
        C0489Iu c0489Iu = new C0489Iu(str, messenger, str2);
        this.A00.put(str, c0489Iu);
        return c0489Iu;
    }

    public final void A06() {
        Iterator<Map.Entry<String, C0489Iu>> it = this.A00.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, C0489Iu> next = it.next();
            if (A03[0].charAt(11) == 'O') {
                throw new RuntimeException();
            }
            A03[1] = "vlvRe5nph1i3Qvfj";
            AnonymousClass23 anonymousClass23 = next.getValue().A00;
            if (anonymousClass23 != null) {
                anonymousClass23.destroy();
            }
            it.remove();
        }
    }

    public final void A07(int i, String str, Bundle bundle, Messenger messenger) {
        try {
            Message obtain = Message.obtain((Handler) null, i);
            if (str != null) {
                obtain.getData().putString(A01(30, 13, 6), str);
            }
            if (bundle != null) {
                obtain.getData().putBundle(A01(0, 17, 80), bundle);
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            if (str != null) {
                A08(str);
            }
        }
    }

    public final void A08(String str) {
        C0489Iu c0489Iu = this.A00.get(str);
        if (c0489Iu != null && c0489Iu.A00 != null) {
            String str2 = A01(17, 13, 7) + str;
            c0489Iu.A00.destroy();
            this.A00.remove(str);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C2K
    public final void ACJ(int i, String str, Bundle bundle) {
        C0489Iu adRecord = A04(str);
        if (adRecord != null) {
            A07(i, str, bundle, adRecord.A01);
        }
        Iterator<Map.Entry<String, C0489Iu>> it = this.A00.entrySet().iterator();
        while (it.hasNext()) {
            C0489Iu value = it.next().getValue();
            try {
                value.A01.send(Message.obtain((Handler) null, 3));
            } catch (RemoteException unused) {
                A08(value.A02);
            }
        }
    }
}
