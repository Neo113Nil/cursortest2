package com.meta.analytics.dsp.uinode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.2o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01042o {
    public static C01042o A05;
    public static byte[] A06;
    public static final Object A07;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<C01032n>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<C01032n>> A03 = new HashMap<>();
    public final ArrayList<C01022m> A02 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{-116, -116, -78, -43, -40, -32, -47, -34, -116, -48, -43, -48, -116, -38, -37, -32, -116, -39, -51, -32, -49, -44, -90, -116, -111, -111, -73, -38, -35, -27, -42, -29, -111, -34, -46, -27, -44, -39, -42, -43, -110, -111, -111, -34, -46, -27, -44, -39, -82, -95, -23, -102, -23, -32, -102, -29, -24, -18, -33, -24, -18, -102, 126, -47, -63, -58, -61, -53, -61, 126, -88, -54, -37, -48, -42, -43, -121, -45, -48, -38, -37, -95, -121, Ascii.ESC, 62, 50, 48, 59, 17, 65, 62, 48, 51, 50, 48, 66, 67, Ascii.FS, 48, Base64.padSymbol, 48, 54, 52, 65, -51, -31, -12, -29, -24, -23, -18, -25, -96, -31, -25, -31, -23, -18, -13, -12, -96, -26, -23, -20, -12, -27, -14, -96, -80, -61, -47, -51, -54, -44, -57, -52, -59, 126, -46, -41, -50, -61, 126, -19, -17, 0, -11, -5, -6, -3, -5, Ascii.SO, -1, 1, 9, Ascii.FF, 19, 9, 6, Ascii.EM, 6, Ascii.GS, 34, Ascii.EM, Ascii.SO, -53, -60, -63, -60, -59, -51, -60, 118, -56, -69, -73, -55, -59, -60};
    }

    static {
        A03();
        A07 = new Object();
    }

    public C01042o(Context context) {
        this.A00 = context;
        final Looper mainLooper = context.getMainLooper();
        this.A01 = new Handler(mainLooper) { // from class: com.facebook.ads.redexgen.X.2l
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        C01042o.this.A02();
                        break;
                    default:
                        super.handleMessage(message);
                        break;
                }
            }
        };
    }

    public static C01042o A00(Context context) {
        C01042o c01042o;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new C01042o(context.getApplicationContext());
            }
            c01042o = A05;
        }
        return c01042o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Incorrect condition in loop: B:10:0x001c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A02() {
        C01022m[] c01022mArr;
        while (true) {
            synchronized (this.A04) {
                int size = this.A02.size();
                if (size > 0) {
                    c01022mArr = new C01022m[size];
                    this.A02.toArray(c01022mArr);
                    this.A02.clear();
                } else {
                    return;
                }
            }
            for (C01022m c01022m : c01022mArr) {
                int j = c01022m.A01.size();
                for (int nbr = 0; nbr < j; nbr++) {
                    C01032n c01032n = c01022m.A01.get(nbr);
                    if (!c01032n.A01) {
                        c01032n.A02.onReceive(this.A00, c01022m.A00);
                    }
                }
            }
        }
    }

    public final void A05(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<C01032n> remove = this.A04.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                C01032n c01032n = remove.get(size);
                c01032n.A01 = true;
                for (int j = 0; j < c01032n.A03.countActions(); j++) {
                    String action = c01032n.A03.getAction(j);
                    ArrayList<C01032n> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        int i = arrayList.size();
                        for (int i2 = i - 1; i2 >= 0; i2--) {
                            C01032n c01032n2 = arrayList.get(i2);
                            if (c01032n2.A02 == broadcastReceiver) {
                                c01032n2.A01 = true;
                                arrayList.remove(i2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            C01032n c01032n = new C01032n(intentFilter, broadcastReceiver);
            ArrayList<C01032n> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c01032n);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<C01032n> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(c01032n);
            }
        }
    }

    public final boolean A07(Intent intent) {
        String A01;
        synchronized (this.A04) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String action2 = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean debug = (intent.getFlags() & 8) != 0;
            if (debug) {
                StringBuilder sb = new StringBuilder();
                String type = A01(128, 15, 14);
                StringBuilder append = sb.append(type).append(resolveTypeIfNeeded);
                String type2 = A01(62, 8, 14);
                StringBuilder append2 = append.append(type2).append(action2);
                String type3 = A01(51, 11, 42);
                append2.append(type3).append(intent).toString();
            }
            HashMap<String, ArrayList<C01032n>> hashMap = this.A03;
            String type4 = intent.getAction();
            ArrayList<C01032n> arrayList = hashMap.get(type4);
            if (arrayList != null) {
                if (debug) {
                    StringBuilder sb2 = new StringBuilder();
                    String type5 = A01(70, 13, 23);
                    sb2.append(type5).append(arrayList).toString();
                }
                ArrayList arrayList2 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    C01032n c01032n = arrayList.get(i);
                    if (debug) {
                        StringBuilder sb3 = new StringBuilder();
                        String type6 = A01(104, 24, 48);
                        sb3.append(type6).append(c01032n.A03).toString();
                    }
                    if (!c01032n.A00) {
                        int match = c01032n.A03.match(action, resolveTypeIfNeeded, action2, data, categories, A01(83, 21, 127));
                        if (match >= 0) {
                            if (debug) {
                                String str = A01(24, 27, 33) + Integer.toHexString(match);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c01032n);
                            c01032n.A00 = true;
                        } else if (debug) {
                            switch (match) {
                                case -4:
                                    A01 = A01(Opcodes.FCMPL, 8, 74);
                                    break;
                                case -3:
                                    A01 = A01(Opcodes.D2L, 6, 60);
                                    break;
                                case -2:
                                    A01 = A01(157, 4, 85);
                                    break;
                                case -1:
                                    A01 = A01(Opcodes.IF_ICMPLT, 4, 89);
                                    break;
                                default:
                                    A01 = A01(Opcodes.IF_ACMPEQ, 14, 6);
                                    break;
                            }
                            String str2 = A01(0, 24, 28) + A01;
                        }
                    }
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((C01032n) arrayList2.get(i2)).A00 = false;
                    }
                    this.A02.add(new C01022m(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
