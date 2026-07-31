package com.inmobi.media;

import android.net.Network;
import android.os.SystemClock;
import com.inmobi.media.core.config.models.AdConfig;
import java.net.InetAddress;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.h5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4042h5 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Network a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4042h5(Network network, Continuation continuation) {
        super(2, continuation);
        this.a = network;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4042h5(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4042h5(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:2|3)|(3:7|(1:9)(1:23)|(6:11|12|13|14|15|16))|24|13|14|15|16|(2:(1:21)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r1 = com.inmobi.media.AbstractC3861aa.a;
        com.inmobi.media.AbstractC3861aa.a(new com.inmobi.media.Q2(r0));
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        AdConfig.CustomNetworkValidation a;
        String urlDomain;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            try {
                a = C4068i5.a();
            } catch (Exception unused) {
            }
            if (a != null && (urlDomain = a.getUrlDomain()) != null) {
                if (urlDomain.length() <= 0) {
                    urlDomain = null;
                }
                if (urlDomain != null) {
                    z = !Intrinsics.areEqual(InetAddress.getByName(urlDomain).toString(), "");
                    C4068i5.b = z;
                    C4068i5.a = this.a;
                    C4068i5.c = SystemClock.elapsedRealtime();
                    Network network = C4068i5.a;
                    C4068i5.e.set(false);
                    return Unit.INSTANCE;
                }
            }
            z = false;
            C4068i5.b = z;
            C4068i5.a = this.a;
            C4068i5.c = SystemClock.elapsedRealtime();
            Network network2 = C4068i5.a;
            C4068i5.e.set(false);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            C4068i5.e.set(false);
            throw th;
        }
    }
}
