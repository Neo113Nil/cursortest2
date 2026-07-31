package com.moloco.sdk.internal.bidtoken;

import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.m;
import com.moloco.sdk.internal.x;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@StabilityInferred
/* loaded from: classes9.dex */
public final class c implements b {
    public static final int a = 0;

    @DebugMetadata(c = "com.moloco.sdk.internal.bidtoken.VersionPrefixedJWTokenParser$invoke$2", f = "VersionPrefixedJWTokenParser.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                byte[] decode = Base64.decode((String) StringsKt.split$default((CharSequence) StringsKt.split$default((CharSequence) this.b, new char[]{':'}, false, 0, 6, (Object) null).get(1), new String[]{"."}, false, 0, 6, (Object) null).get(1), 0);
                Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
                return new x.b(new com.moloco.sdk.internal.bidtoken.a(new JSONObject(StringsKt.decodeToString(decode)).getLong("exp")));
            } catch (Exception e) {
                return new x.a(new m(e.toString(), -1));
            }
        }
    }

    @Override // com.moloco.sdk.internal.bidtoken.b
    @Nullable
    public Object a(@NotNull String str, @NotNull Continuation continuation) {
        CoroutineContext coroutineContext;
        coroutineContext = d.a;
        return BuildersKt.withContext(coroutineContext, new a(str, null), continuation);
    }
}
