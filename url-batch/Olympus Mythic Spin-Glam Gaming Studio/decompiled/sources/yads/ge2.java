package yads;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdInfo;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes4.dex */
public final class ge2 {
    public final Context a;

    public ge2(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, ContinuationImpl continuationImpl) {
        be2 be2Var;
        int i;
        AppSetIdInfo appSetIdInfo;
        String id;
        try {
            if (continuationImpl instanceof be2) {
                be2Var = (be2) continuationImpl;
                int i2 = be2Var.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    be2Var.d = i2 - Integer.MIN_VALUE;
                    Object obj = be2Var.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = be2Var.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ee2 ee2Var = new ee2(this, null);
                        be2Var.d = 1;
                        obj = TimeoutKt.withTimeoutOrNull(j, ee2Var, be2Var);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    appSetIdInfo = (AppSetIdInfo) obj;
                    if (appSetIdInfo == null && (id = appSetIdInfo.getId()) != null) {
                        if (StringsKt.isBlank(id)) {
                            return null;
                        }
                        return id;
                    }
                }
            }
            if (i != 0) {
            }
            appSetIdInfo = (AppSetIdInfo) obj;
            return appSetIdInfo == null ? null : null;
        } catch (Throwable unused) {
            return null;
        }
        be2Var = new be2(this, continuationImpl);
        Object obj2 = be2Var.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = be2Var.d;
    }
}
