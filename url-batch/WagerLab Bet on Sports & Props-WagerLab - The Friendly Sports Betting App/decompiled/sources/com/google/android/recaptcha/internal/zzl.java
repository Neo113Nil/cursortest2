package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes4.dex */
public final class zzl {
    private final List zza;
    private zzek zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ zzl(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List emptyList = CollectionsKt.emptyList();
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) emptyList.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }

    private final void zzh(zze... zzeVarArr) {
        CollectionsKt.addAll(this.zza, zzeVarArr);
    }

    public final Object zzb(String str, long j, Continuation continuation) {
        return CoroutineScopeKt.coroutineScope(new zzh(this, str, j, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(long j, zzsc zzscVar, zzek zzekVar, Continuation continuation) {
        zzi zziVar;
        int i;
        if (continuation instanceof zzi) {
            zziVar = (zzi) continuation;
            int i2 = zziVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zziVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zziVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zziVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzk zzkVar = new zzk(this, zzekVar, j, zzscVar, null);
                    zziVar.zzc = 1;
                    obj = CoroutineScopeKt.coroutineScope(zzkVar, zziVar);
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
        zziVar = new zzi(this, continuation);
        Object obj2 = zziVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zziVar.zzc;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zzf(zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }
}
