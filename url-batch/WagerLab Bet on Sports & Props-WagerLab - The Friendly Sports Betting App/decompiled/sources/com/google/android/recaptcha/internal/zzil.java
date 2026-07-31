package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.1 */
/* loaded from: classes4.dex */
final class zzil extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzil(zzja zzjaVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzjaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzil(this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzil) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
    
        ((android.webkit.WebView) r7).setWebViewClient(new com.google.android.recaptcha.internal.zzik(r6.zzc));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008a, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (r7 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r7 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r7 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r1 != 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0060, code lost:
    
        ((android.webkit.WebView) r7).addJavascriptInterface(r6.zzc.zzq(), "RN");
        r6.zzb = 4;
        r7 = r6.zzc.zzw(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0077, code lost:
    
        if (r7 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008b, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzb;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.zzb = 1;
            obj = this.zzc.zzw(this);
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i != 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            ((WebView) obj).getSettings().setJavaScriptEnabled(true);
            this.zza = null;
            this.zzb = 3;
            obj = this.zzc.zzw(this);
        }
        ((WebView) obj).removeJavascriptInterface("RN");
        zzja zzjaVar = this.zzc;
        this.zza = zzjaVar;
        this.zzb = 2;
        obj = zzjaVar.zzw(this);
    }
}
