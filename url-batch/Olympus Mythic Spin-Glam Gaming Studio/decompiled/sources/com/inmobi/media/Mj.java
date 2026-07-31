package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.URLUtil;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes11.dex */
public final class Mj extends AbstractC3881b4 {
    public final Context a;
    public final C4493y9 b;
    public final String c;

    public Mj(Context context, C4493y9 c4493y9) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = c4493y9;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.c = "Static-Companion-" + uuid;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r13, r14, r0) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r15 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Mj mj, String str, C3897bk c3897bk, ContinuationImpl continuationImpl) {
        Jj jj;
        int i;
        mj.getClass();
        if (continuationImpl instanceof Jj) {
            jj = (Jj) continuationImpl;
            int i2 = jj.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jj.e = i2 - Integer.MIN_VALUE;
                Object obj = jj.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = jj.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    Lj lj = new Lj(mj, null);
                    jj.a = str;
                    jj.b = c3897bk;
                    jj.e = 1;
                    obj = BuildersKt.withContext(main, lj, jj);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    c3897bk = jj.b;
                    str = jj.a;
                    ResultKt.throwOnFailure(obj);
                }
                String str2 = str;
                C3897bk c3897bk2 = c3897bk;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                Kj kj = new Kj(c3897bk2, mj, str2, (Bitmap.Config) obj, null);
                jj.a = null;
                jj.b = null;
                jj.e = 2;
            }
        }
        jj = new Jj(mj, continuationImpl);
        Object obj2 = jj.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jj.e;
        if (i != 0) {
        }
        String str22 = str;
        C3897bk c3897bk22 = c3897bk;
        CoroutineDispatcher io22 = Dispatchers.getIO();
        Kj kj2 = new Kj(c3897bk22, mj, str22, (Bitmap.Config) obj2, null);
        jj.a = null;
        jj.b = null;
        jj.e = 2;
    }

    public final Object a(Qi qi, R3 r3) {
        if (URLUtil.isNetworkUrl(qi.a)) {
            return BuildersKt.withContext(Dispatchers.getMain(), new Ij(this, qi, null), r3);
        }
        throw new C4259pc("Companion Invalid Resource Error");
    }
}
