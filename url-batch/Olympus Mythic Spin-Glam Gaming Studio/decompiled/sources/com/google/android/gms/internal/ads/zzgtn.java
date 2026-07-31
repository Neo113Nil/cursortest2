package com.google.android.gms.internal.ads;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final /* synthetic */ class zzgtn extends FunctionReferenceImpl implements Function2 {
    public static final zzgtn zza = new zzgtn();

    zzgtn() {
        super(2, zzgtp.class, "lockWithoutOwner", "lockWithoutOwner(Lkotlinx/coroutines/sync/Mutex;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object zzd;
        zzd = zzgtp.zzd((Mutex) obj, (Continuation) obj2);
        return zzd;
    }
}
