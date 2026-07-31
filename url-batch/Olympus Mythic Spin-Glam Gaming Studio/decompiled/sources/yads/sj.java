package yads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.util.Base64;
import android.util.Pair;
import com.ironsource.X3;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class sj {
    public static final sj c = new sj(new int[]{2}, 8);
    public static final sj d = new sj(new int[]{2, 5, 6}, 8);
    public static final zm2 e;
    public final int[] a;
    public final int b;

    static {
        m41 a = new m41(4).a(5, 6).a(17, 6).a(7, 6).a(18, 6).a(6, 8).a(8, 8).a(14, 8);
        e = zm2.a(a.b, a.a);
    }

    public sj(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.a = new int[0];
        }
        this.b = i;
    }

    public static sj a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i = sb3.a;
        if (i >= 17) {
            byte[] decode = Base64.decode("QW1hem9u", 0);
            Charset charset = Charsets.UTF_8;
            String str = new String(decode, charset);
            String str2 = sb3.c;
            if ((str.equals(str2) || new String(Base64.decode("WGlhb21p", 0), charset).equals(str2)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                return d;
            }
        }
        return (i < 29 || (!sb3.c(context) && (i < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) ? (registerReceiver == null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? c : new sj(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new sj(rj.a(), 8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj)) {
            return false;
        }
        sj sjVar = (sj) obj;
        return Arrays.equals(this.a, sjVar.a) && this.b == sjVar.b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", supportedEncodings=" + Arrays.toString(this.a) + X3.j.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        if (r7 != 5) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair a(jw0 jw0Var) {
        int a;
        String str = jw0Var.m;
        str.getClass();
        int a2 = vt1.a(str, jw0Var.j);
        zm2 zm2Var = e;
        if (!zm2Var.containsKey(Integer.valueOf(a2))) {
            return null;
        }
        int i = 6;
        if (a2 == 18 && Arrays.binarySearch(this.a, 18) < 0) {
            a2 = 6;
        } else if (a2 == 8 && Arrays.binarySearch(this.a, 8) < 0) {
            a2 = 7;
        }
        if (Arrays.binarySearch(this.a, a2) < 0) {
            return null;
        }
        int i2 = jw0Var.z;
        if (i2 != -1 && a2 != 18) {
            if (i2 > this.b) {
                return null;
            }
        } else {
            int i3 = jw0Var.A;
            if (i3 == -1) {
                i3 = 48000;
            }
            if (sb3.a >= 29) {
                i2 = rj.a(a2, i3);
            } else {
                Object obj = zm2Var.get(Integer.valueOf(a2));
                i2 = ((Integer) (obj != null ? obj : 0)).intValue();
            }
        }
        int i4 = sb3.a;
        if (i4 <= 28) {
            if (i2 == 7) {
                i = 8;
            } else if (i2 != 3) {
                if (i2 != 4) {
                }
            }
            if (i4 <= 26 && tk2.d.a().equals(sb3.b) && i == 1) {
                i = 2;
            }
            a = sb3.a(i);
            if (a != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(a2), Integer.valueOf(a));
        }
        i = i2;
        if (i4 <= 26) {
            i = 2;
        }
        a = sb3.a(i);
        if (a != 0) {
        }
    }
}
