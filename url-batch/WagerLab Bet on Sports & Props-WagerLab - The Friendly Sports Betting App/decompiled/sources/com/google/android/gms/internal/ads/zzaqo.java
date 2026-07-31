package com.google.android.gms.internal.ads;

import expo.modules.notifications.serverregistration.InstallationId;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.codec.CharEncoding;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public abstract class zzaqo implements zzaqp {
    private static final Logger zzb = Logger.getLogger(zzaqo.class.getName());
    final ThreadLocal zza = new zzaqn(this);

    public abstract zzaqs zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final zzaqs zzb(zzhpj zzhpjVar, zzaqt zzaqtVar) throws IOException {
        int zza;
        long zzb2;
        long zzc = zzhpjVar.zzc();
        ThreadLocal threadLocal = this.zza;
        ((ByteBuffer) threadLocal.get()).rewind().limit(8);
        do {
            zza = zzhpjVar.zza((ByteBuffer) threadLocal.get());
            if (zza == 8) {
                ((ByteBuffer) threadLocal.get()).rewind();
                long zza2 = zzaqr.zza((ByteBuffer) threadLocal.get());
                byte[] bArr = null;
                if (zza2 < 8 && zza2 > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(zza2);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) threadLocal.get()).get(bArr2);
                try {
                    String str = new String(bArr2, CharEncoding.ISO_8859_1);
                    if (zza2 == 1) {
                        ThreadLocal threadLocal2 = this.zza;
                        ((ByteBuffer) threadLocal2.get()).limit(16);
                        zzhpjVar.zza((ByteBuffer) threadLocal2.get());
                        ((ByteBuffer) threadLocal2.get()).position(8);
                        zzb2 = zzaqr.zzd((ByteBuffer) threadLocal2.get()) - 16;
                    } else {
                        zzb2 = zza2 == 0 ? zzhpjVar.zzb() - zzhpjVar.zzc() : zza2 - 8;
                    }
                    if (InstallationId.LEGACY_PREFERENCES_UUID_KEY.equals(str)) {
                        ThreadLocal threadLocal3 = this.zza;
                        ((ByteBuffer) threadLocal3.get()).limit(((ByteBuffer) threadLocal3.get()).limit() + 16);
                        zzhpjVar.zza((ByteBuffer) threadLocal3.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) threadLocal3.get()).position() - 16; position < ((ByteBuffer) threadLocal3.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) threadLocal3.get()).position() - 16)] = ((ByteBuffer) threadLocal3.get()).get(position);
                        }
                        zzb2 -= 16;
                    }
                    long j = zzb2;
                    zzaqs zza3 = zza(str, bArr, zzaqtVar instanceof zzaqs ? ((zzaqs) zzaqtVar).zza() : "");
                    ThreadLocal threadLocal4 = this.zza;
                    ((ByteBuffer) threadLocal4.get()).rewind();
                    zza3.zzb(zzhpjVar, (ByteBuffer) threadLocal4.get(), j, this);
                    return zza3;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (zza >= 0);
        zzhpjVar.zzd(zzc);
        throw new EOFException();
    }
}
