package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes4.dex */
public final class zzv extends zze {
    private final zzek zza;
    private final List zzb;
    private zzle zzc;
    private final Map zzd;

    public /* synthetic */ zzv(Context context, zzek zzekVar, zzbi zzbiVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        zzek zza = zzekVar.zza();
        CoroutineScope zzc = zzbiVar.zzc();
        List listOf = CollectionsKt.listOf((Object[]) new zzy[]{new zzab(zzekVar.zza()), new zzp(zzekVar.zza()), new zzm(zzekVar.zza(), context.getContentResolver()), new zzn(zzekVar.zza()), new zzae(zza, context, zzc, new zzan(context, zzc, zza, IntegrityManagerFactory.createStandard(context), 28800000L), new zzbs(GoogleApiAvailabilityLight.getInstance()))});
        this.zza = zzekVar;
        this.zzb = listOf;
        this.zzd = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzsi zzq(String str) {
        LinkedHashMap emptyMap;
        List list = (List) this.zzd.remove(str);
        if (list != null) {
            List<zzaa> list2 = list;
            emptyMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
            for (zzaa zzaaVar : list2) {
                emptyMap.put(Integer.valueOf(zzaaVar.zzb()), zzaaVar);
            }
        } else {
            emptyMap = MapsKt.emptyMap();
        }
        zzsz zzs = zzs(emptyMap, str);
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        zzsf zzf2 = zzsg.zzf();
        byte[] zzd = zzs.zzd();
        zzf2.zze(zzkh.zzh().zzi(zzd, 0, zzd.length));
        zzf.zzf(zzf2);
        return (zzsi) zzf.zzk();
    }

    private final zzsx zzr(zzaa zzaaVar) {
        zzle zzleVar;
        zzsv zzf = zzsx.zzf();
        zzf.zzq(3);
        if (zzaaVar instanceof zzx) {
            zzti zza = ((zzx) zzaaVar).zza();
            zzle zzleVar2 = this.zzc;
            zzleVar = zzleVar2 != null ? zzleVar2 : null;
            byte[] zzd = zza.zzd();
            zzf.zzf(zzcf.zza(zzkh.zzh().zzi(zzd, 0, zzd.length), zzleVar));
        } else {
            if (!(zzaaVar instanceof zzw)) {
                throw new NoWhenBranchMatchedException();
            }
            zzte zza2 = ((zzw) zzaaVar).zza();
            zzle zzleVar3 = this.zzc;
            zzleVar = zzleVar3 != null ? zzleVar3 : null;
            byte[] zzd2 = zza2.zzd();
            zzf.zze(zzcf.zza(zzkh.zzh().zzi(zzd2, 0, zzd2.length), zzleVar));
        }
        return (zzsx) zzf.zzk();
    }

    private final zzsz zzs(Map map, String str) {
        zzsy zzf = zzsz.zzf();
        zzf.zzq(str);
        List list = this.zzb;
        ArrayList<zzy> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zzy) obj).zzf()) {
                arrayList.add(obj);
            }
        }
        for (zzy zzyVar : arrayList) {
            if (!map.containsKey(Integer.valueOf(zzyVar.zza()))) {
                int zza = zzyVar.zza();
                zztd zzf2 = zzte.zzf();
                zzf2.zzf(zza);
                zzf2.zzr(13);
                zzf2.zzq(27);
                zzf.zzf(zzr(new zzw(zza, (zzte) zzf2.zzk())));
            }
        }
        Collection values = map.values();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList2.add(zzr((zzaa) it.next()));
        }
        zzf.zze(arrayList2);
        return (zzsz) zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzen zza(String str) {
        zzek zzekVar = this.zza;
        zzekVar.zzc(str);
        return zzekVar.zzf(35);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzen zzb() {
        zzek zzekVar = this.zza;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(34);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzd(String str, Continuation continuation) {
        return zzq(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object zzf(String str, Continuation continuation) {
        zzq zzqVar;
        int i;
        if (continuation instanceof zzq) {
            zzqVar = (zzq) continuation;
            int i2 = zzqVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzqVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzqVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzqVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzs zzsVar = new zzs(this, str, null);
                    zzqVar.zzc = 1;
                    obj = CoroutineScopeKt.coroutineScope(zzsVar, zzqVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        zzqVar = new zzq(this, continuation);
        Object obj2 = zzqVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzqVar.zzc;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object zzh(zzsc zzscVar, Continuation continuation) {
        zzt zztVar;
        int i;
        if (continuation instanceof zzt) {
            zztVar = (zzt) continuation;
            int i2 = zztVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zztVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zztVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zztVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzu zzuVar = new zzu(zzscVar, this, null);
                    zztVar.zzc = 1;
                    obj = CoroutineScopeKt.coroutineScope(zzuVar, zztVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        zztVar = new zzt(this, continuation);
        Object obj2 = zztVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zztVar.zzc;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final void zzk(zzsr zzsrVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzy) it.next()).zze(zzsrVar);
        }
    }

    public final Map zzo() {
        return this.zzd;
    }
}
