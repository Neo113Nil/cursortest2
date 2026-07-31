package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.ironsource.B5;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public class zzauv extends zzats {
    private final Object zza;

    @Nullable
    @GuardedBy
    private final zzatx zzb;

    public zzauv(int i, String str, zzatx zzatxVar, @Nullable zzatw zzatwVar) {
        super(i, str, zzatwVar);
        this.zza = new Object();
        this.zzb = zzatxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzats
    protected final zzaty zzr(zzato zzatoVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzatoVar.zzb;
            Map map = zzatoVar.zzc;
            String str3 = C.ISO88591_NAME;
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals(B5.N)) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzatoVar.zzb);
        }
        return zzaty.zza(str, zzaup.zza(zzatoVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzats
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzs(String str) {
        zzatx zzatxVar;
        synchronized (this.zza) {
            zzatxVar = this.zzb;
        }
        zzatxVar.zza(str);
    }
}
