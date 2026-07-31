package com.moloco.sdk.internal.services;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class D implements w {
    public static final int b = 8;

    @NotNull
    public final SharedPreferences a;

    @DebugMetadata(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$getBoolean$2", f = "DataStoreService.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return D.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!D.this.a.contains(this.c)) {
                return null;
            }
            try {
                return Boxing.boxBoolean(D.this.a.getBoolean(this.c, false));
            } catch (ClassCastException unused) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.c, null, false, 12, null);
                return null;
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$getDouble$2", f = "DataStoreService.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return D.this.new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!D.this.a.contains(this.c)) {
                return null;
            }
            try {
                String string = D.this.a.getString(this.c, "0");
                if (string != null) {
                    return Boxing.boxDouble(Double.parseDouble(string));
                }
                return null;
            } catch (ClassCastException e) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.c, e, false, 8, null);
                return null;
            } catch (NumberFormatException e2) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.c, e2, false, 8, null);
                return null;
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$getFloat$2", f = "DataStoreService.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return D.this.new c(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!D.this.a.contains(this.c)) {
                return null;
            }
            try {
                return Boxing.boxFloat(D.this.a.getFloat(this.c, 0.0f));
            } catch (ClassCastException unused) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.c, null, false, 12, null);
                return null;
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$getInt$2", f = "DataStoreService.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Continuation continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return D.this.new d(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!D.this.a.contains(this.c)) {
                return null;
            }
            try {
                return Boxing.boxInt(D.this.a.getInt(this.c, 0));
            } catch (ClassCastException unused) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.c, null, false, 12, null);
                return null;
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$getLong$2", f = "DataStoreService.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Continuation continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return D.this.new e(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!D.this.a.contains(this.c)) {
                return null;
            }
            try {
                String string = D.this.a.getString(this.c, "0");
                if (string != null) {
                    return Boxing.boxLong(Long.parseLong(string));
                }
                return null;
            } catch (ClassCastException e) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.c, e, false, 8, null);
                return null;
            } catch (NumberFormatException e2) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.c, e2, false, 8, null);
                return null;
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$getString$2", f = "DataStoreService.kt", l = {}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Continuation continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return D.this.new f(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!D.this.a.contains(this.c)) {
                return null;
            }
            try {
                return D.this.a.getString(this.c, "");
            } catch (ClassCastException unused) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: " + this.c, null, false, 12, null);
                return null;
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$removeKey$2", f = "DataStoreService.kt", l = {}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Continuation continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return D.this.new g(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            D.this.a.edit().remove(this.c).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.PreferencesDataStoreServiceImpl$set$2", f = "DataStoreService.kt", l = {}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ T b;
        public final /* synthetic */ D c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(T t, D d, String str, Continuation continuation) {
            super(2, continuation);
            this.b = t;
            this.c = d;
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.b, this.c, this.d, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            T t = this.b;
            if (t instanceof Integer) {
                this.c.a.edit().putInt(this.d, ((Number) this.b).intValue()).apply();
            } else if (t instanceof String) {
                this.c.a.edit().putString(this.d, (String) this.b).apply();
            } else if (t instanceof Float) {
                this.c.a.edit().putFloat(this.d, ((Number) this.b).floatValue()).apply();
            } else if (t instanceof Boolean) {
                this.c.a.edit().putBoolean(this.d, ((Boolean) this.b).booleanValue()).apply();
            } else if (t instanceof Double) {
                this.c.a.edit().putString(this.d, String.valueOf(((Number) this.b).doubleValue())).apply();
            } else if (t instanceof Long) {
                this.c.a.edit().putString(this.d, String.valueOf(((Number) this.b).longValue())).apply();
            } else {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type: " + this.b + " for key: " + this.d, null, false, 12, null);
            }
            return Unit.INSTANCE;
        }
    }

    public D(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.a = sharedPreferences;
    }

    @Override // com.moloco.sdk.internal.services.w
    @Nullable
    public Object b(@NotNull String str, @NotNull Continuation continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new b(str, null), continuation);
    }

    @Override // com.moloco.sdk.internal.services.w
    @Nullable
    public Object c(@NotNull String str, @NotNull Continuation continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new c(str, null), continuation);
    }

    @Override // com.moloco.sdk.internal.services.w
    @Nullable
    public Object d(@NotNull String str, @NotNull Continuation continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new f(str, null), continuation);
    }

    @Override // com.moloco.sdk.internal.services.w
    @Nullable
    public Object e(@NotNull String str, @NotNull Continuation continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new d(str, null), continuation);
    }

    @Override // com.moloco.sdk.internal.services.w
    @Nullable
    public Object f(@NotNull String str, @NotNull Continuation continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new a(str, null), continuation);
    }

    @Override // com.moloco.sdk.internal.services.w
    @Nullable
    public Object g(@NotNull String str, @NotNull Continuation continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new e(str, null), continuation);
    }

    @Override // com.moloco.sdk.internal.services.w
    @Nullable
    public Object a(@NotNull String str, @NotNull Continuation continuation) {
        Object withContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new g(str, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.internal.services.w
    @Nullable
    public <T> Object a(@NotNull String str, T t, @NotNull Continuation continuation) {
        Object withContext = BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new h(t, this, str, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
