package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.common.base.Ascii;
import io.intercom.android.sdk.models.Participant;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.msgpack.core.MessagePack;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfoc {
    protected static final byte[] zza = {Base64.padSymbol, 122, Ascii.DC2, 35, 1, -102, -93, -99, -98, MessagePack.Code.FIXSTR_PREFIX, -29, 67, 106, -73, MessagePack.Code.NIL, -119, 107, -5, 79, -74, 121, -12, MessagePack.Code.MAP16, 95, -25, MessagePack.Code.FALSE, Utf8.REPLACEMENT_BYTE, 50, 108, -113, -103, 74};
    protected static final byte[] zzb = {-110, -13, MessagePack.Code.MAP16, 70, -83, 43, 97, Ascii.NAK, MessagePack.Code.FIXEXT1, Ascii.DLE, MessagePack.Code.FLOAT32, -125, -28, MessagePack.Code.EXT8, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};
    private final byte[] zzc = zzb;
    private final byte[] zzd = zza;

    public final boolean zza(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] zza2 = zzaon.zza(file.getAbsolutePath());
            if (zza2.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] digest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(zza2[0][0].getEncoded());
            if (Arrays.equals(this.zzd, digest)) {
                return true;
            }
            return !Participant.USER_TYPE.equals(Build.TYPE) && Arrays.equals(this.zzc, digest);
        } catch (zzaok e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException e2) {
            e = e2;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e3) {
            e = e3;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
