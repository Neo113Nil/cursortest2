package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.common.base.Ascii;
import okio.Utf8;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
final class zzhld {
    static /* synthetic */ boolean zza(byte b) {
        return b >= 0;
    }

    static /* synthetic */ boolean zzb(byte b) {
        return b < -32;
    }

    static /* synthetic */ boolean zzc(byte b) {
        return b < -16;
    }

    static /* synthetic */ void zzd(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || zzg(b2)) {
            throw new zzhiw("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b & Ascii.US) << 6) | (b2 & Utf8.REPLACEMENT_BYTE));
    }

    static /* synthetic */ void zzf(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (zzg(b2) || (((b << Ascii.FS) + (b2 + 112)) >> 30) != 0 || zzg(b3) || zzg(b4)) {
            throw new zzhiw("Protocol message had invalid UTF-8.");
        }
        int i2 = ((b & 7) << 18) | ((b2 & Utf8.REPLACEMENT_BYTE) << 12) | ((b3 & Utf8.REPLACEMENT_BYTE) << 6) | (b4 & Utf8.REPLACEMENT_BYTE);
        cArr[i] = (char) ((i2 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        cArr[i + 1] = (char) ((i2 & AnalyticsListener.EVENT_DRM_KEYS_LOADED) + Utf8.LOG_SURROGATE_HEADER);
    }

    private static boolean zzg(byte b) {
        return b > -65;
    }

    static /* synthetic */ void zze(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!zzg(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!zzg(b3)) {
                cArr[i] = (char) (((b & Ascii.SI) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                return;
            }
        }
        throw new zzhiw("Protocol message had invalid UTF-8.");
    }
}
