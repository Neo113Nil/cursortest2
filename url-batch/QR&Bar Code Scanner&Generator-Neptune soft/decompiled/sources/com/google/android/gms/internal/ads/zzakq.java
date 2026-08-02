package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzakq implements zzakc {
    private final Map zza = new HashMap();
    private final zzajp zzb;
    private final BlockingQueue zzc;
    private final zzaju zzd;

    zzakq(zzajp zzajpVar, BlockingQueue blockingQueue, zzaju zzajuVar, byte[] bArr) {
        this.zzd = zzajuVar;
        this.zzb = zzajpVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzakc
    public final synchronized void zza(zzakd zzakdVar) {
        String zzj = zzakdVar.zzj();
        List list = (List) this.zza.remove(zzj);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (zzakp.zzb) {
            zzakp.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzj);
        }
        zzakd zzakdVar2 = (zzakd) list.remove(0);
        this.zza.put(zzj, list);
        zzakdVar2.zzu(this);
        try {
            this.zzc.put(zzakdVar2);
        } catch (InterruptedException e) {
            zzakp.zzb("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.zzb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakc
    public final void zzb(zzakd zzakdVar, zzakj zzakjVar) {
        List list;
        zzajm zzajmVar = zzakjVar.zzb;
        if (zzajmVar == null || zzajmVar.zza(System.currentTimeMillis())) {
            zza(zzakdVar);
            return;
        }
        String zzj = zzakdVar.zzj();
        synchronized (this) {
            list = (List) this.zza.remove(zzj);
        }
        if (list != null) {
            if (zzakp.zzb) {
                zzakp.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zzb((zzakd) it.next(), zzakjVar, null);
            }
        }
    }

    final synchronized boolean zzc(zzakd zzakdVar) {
        String zzj = zzakdVar.zzj();
        if (!this.zza.containsKey(zzj)) {
            this.zza.put(zzj, null);
            zzakdVar.zzu(this);
            if (zzakp.zzb) {
                zzakp.zza("new request, sending to network %s", zzj);
            }
            return false;
        }
        List list = (List) this.zza.get(zzj);
        if (list == null) {
            list = new ArrayList();
        }
        zzakdVar.zzm("waiting-for-response");
        list.add(zzakdVar);
        this.zza.put(zzj, list);
        if (zzakp.zzb) {
            zzakp.zza("Request for cacheKey=%s is in flight, putting on hold.", zzj);
        }
        return true;
    }
}
