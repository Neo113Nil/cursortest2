package com.google.android.recaptcha.internal;

import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes4.dex */
public final class zzfa implements zzey {
    private final Lazy zza;

    public zzfa() {
        int i = zzav.zza;
        this.zza = LazyKt.lazy(zzez.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzey
    public final zzsc zza(String str, zzto zztoVar) throws zzbd {
        zzbd zzbdVar;
        zzew zzewVar = null;
        try {
            try {
                zzewVar = ((zzex) this.zza.getValue()).zza(str);
                zzewVar.zzc();
                zzewVar.zze(zztoVar.zzd());
                zzsc zzscVar = (zzsc) zzewVar.zza(zzsc.zzi());
                zzewVar.zzd();
                return zzscVar;
            } catch (zzbd e) {
                if (zzewVar == null) {
                    throw e;
                }
                if (!Intrinsics.areEqual(e.zza(), zzba.zzau)) {
                    throw e;
                }
                try {
                    zzbdVar = zzbc.zza(zztu.zzg(zzewVar.zzb().getErrorStream()).zzi());
                } catch (Exception e2) {
                    zzbdVar = new zzbd(zzbb.zzc, zzba.zzG, e2.getMessage());
                }
                throw zzbdVar;
            } catch (Exception e3) {
                throw new zzbd(zzbb.zzc, zzba.zzF, e3.getMessage());
            }
        } catch (Throwable th) {
            if (zzewVar != null) {
                zzewVar.zzd();
            }
            throw th;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzey
    public final String zzb(String str) throws zzbd {
        try {
            try {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
                Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    throw new zzbd(zzbb.zzc, new zzba(httpURLConnection.getResponseCode()), null);
                }
                try {
                    return TextStreamsKt.readText(Intrinsics.areEqual("gzip", httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream()));
                } catch (Exception unused) {
                    throw new zzbd(zzbb.zzc, zzba.zzP, null);
                }
            } catch (Exception unused2) {
                throw new zzbd(zzbb.zzc, zzba.zzO, null);
            }
        } catch (Exception unused3) {
            throw new zzbd(zzbb.zzb, zzba.zzN, null);
        }
    }
}
