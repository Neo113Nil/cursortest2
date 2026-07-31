package io.branch.coroutines;

import android.content.Context;
import io.branch.data.InstallReferrerResult;
import io.branch.referral.BranchLogger;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: InstallReferrers.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lio/branch/data/InstallReferrerResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "io.branch.coroutines.InstallReferrersKt$fetchLatestInstallReferrer$2", f = "InstallReferrers.kt", i = {0, 0, 0, 0, 1, 1, 1, 2, 2, 3}, l = {355, 355, 355, 355, 355}, m = "invokeSuspend", n = {"huaweiReferrer", "samsungReferrer", "xiaomiReferrer", "metaReferrer", "samsungReferrer", "xiaomiReferrer", "metaReferrer", "xiaomiReferrer", "metaReferrer", "metaReferrer"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
/* loaded from: classes7.dex */
final class InstallReferrersKt$fetchLatestInstallReferrer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InstallReferrerResult>, Object> {
    final /* synthetic */ Context $context;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstallReferrersKt$fetchLatestInstallReferrer$2(Context context, Continuation<? super InstallReferrersKt$fetchLatestInstallReferrer$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstallReferrersKt$fetchLatestInstallReferrer$2 installReferrersKt$fetchLatestInstallReferrer$2 = new InstallReferrersKt$fetchLatestInstallReferrer$2(this.$context, continuation);
        installReferrersKt$fetchLatestInstallReferrer$2.L$0 = obj;
        return installReferrersKt$fetchLatestInstallReferrer$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InstallReferrerResult> continuation) {
        return ((InstallReferrersKt$fetchLatestInstallReferrer$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Deferred async$default2;
        Deferred async$default3;
        Deferred deferred;
        Deferred async$default4;
        Deferred deferred2;
        Deferred async$default5;
        InstallReferrerResult[] installReferrerResultArr;
        int i;
        Object await;
        Deferred deferred3;
        InstallReferrerResult[] installReferrerResultArr2;
        Deferred deferred4;
        Object await2;
        Deferred deferred5;
        InstallReferrerResult[] installReferrerResultArr3;
        Object await3;
        Deferred deferred6;
        InstallReferrerResult[] installReferrerResultArr4;
        int i2;
        int i3;
        Object await4;
        InstallReferrerResult[] installReferrerResultArr5;
        Object await5;
        int i4;
        InstallReferrerResult[] installReferrerResultArr6;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = this.label;
        int i6 = 2;
        int i7 = 1;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new InstallReferrersKt$fetchLatestInstallReferrer$2$googleReferrer$1(this.$context, null), 3, null);
            async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new InstallReferrersKt$fetchLatestInstallReferrer$2$huaweiReferrer$1(this.$context, null), 3, null);
            async$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new InstallReferrersKt$fetchLatestInstallReferrer$2$samsungReferrer$1(this.$context, null), 3, null);
            deferred = async$default3;
            async$default4 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new InstallReferrersKt$fetchLatestInstallReferrer$2$xiaomiReferrer$1(this.$context, null), 3, null);
            deferred2 = async$default4;
            async$default5 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new InstallReferrersKt$fetchLatestInstallReferrer$2$metaReferrer$1(this.$context, null), 3, null);
            installReferrerResultArr = new InstallReferrerResult[5];
            this.L$0 = async$default2;
            this.L$1 = deferred;
            this.L$2 = deferred2;
            this.L$3 = async$default5;
            this.L$4 = installReferrerResultArr;
            this.L$5 = installReferrerResultArr;
            i = 0;
            this.I$0 = 0;
            this.label = 1;
            await = async$default.await(this);
            if (await != coroutine_suspended) {
                deferred3 = async$default5;
                installReferrerResultArr2 = installReferrerResultArr;
                deferred4 = async$default2;
            }
            return coroutine_suspended;
        }
        if (i5 != 1) {
            if (i5 == 2) {
                i7 = this.I$0;
                InstallReferrerResult[] installReferrerResultArr7 = (InstallReferrerResult[]) this.L$4;
                installReferrerResultArr3 = (InstallReferrerResult[]) this.L$3;
                Deferred deferred7 = (Deferred) this.L$2;
                Deferred deferred8 = (Deferred) this.L$1;
                deferred5 = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                deferred2 = deferred8;
                deferred3 = deferred7;
                installReferrerResultArr = installReferrerResultArr7;
                await2 = obj;
                installReferrerResultArr[i7] = (InstallReferrerResult) await2;
                this.L$0 = deferred2;
                this.L$1 = deferred3;
                this.L$2 = installReferrerResultArr3;
                this.L$3 = installReferrerResultArr3;
                this.L$4 = null;
                this.I$0 = 2;
                this.label = 3;
                await3 = deferred5.await(this);
                if (await3 != coroutine_suspended) {
                    deferred6 = deferred2;
                    installReferrerResultArr4 = installReferrerResultArr3;
                    installReferrerResultArr3[i6] = (InstallReferrerResult) await3;
                    this.L$0 = deferred3;
                    this.L$1 = installReferrerResultArr4;
                    this.L$2 = installReferrerResultArr4;
                    this.L$3 = null;
                    i2 = 3;
                    this.I$0 = 3;
                    i3 = 4;
                    this.label = 4;
                    await4 = deferred6.await(this);
                    if (await4 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i5 == 3) {
                i6 = this.I$0;
                InstallReferrerResult[] installReferrerResultArr8 = (InstallReferrerResult[]) this.L$3;
                installReferrerResultArr4 = (InstallReferrerResult[]) this.L$2;
                Deferred deferred9 = (Deferred) this.L$1;
                deferred6 = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                deferred3 = deferred9;
                installReferrerResultArr3 = installReferrerResultArr8;
                await3 = obj;
                installReferrerResultArr3[i6] = (InstallReferrerResult) await3;
                this.L$0 = deferred3;
                this.L$1 = installReferrerResultArr4;
                this.L$2 = installReferrerResultArr4;
                this.L$3 = null;
                i2 = 3;
                this.I$0 = 3;
                i3 = 4;
                this.label = 4;
                await4 = deferred6.await(this);
                if (await4 != coroutine_suspended) {
                    installReferrerResultArr5 = installReferrerResultArr4;
                    installReferrerResultArr4[i2] = (InstallReferrerResult) await4;
                    this.L$0 = installReferrerResultArr5;
                    this.L$1 = installReferrerResultArr5;
                    this.L$2 = null;
                    this.I$0 = i3;
                    this.label = 5;
                    await5 = deferred3.await(this);
                    if (await5 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i5 != 4) {
                if (i5 == 5) {
                    i4 = this.I$0;
                    installReferrerResultArr6 = (InstallReferrerResult[]) this.L$1;
                    InstallReferrerResult[] installReferrerResultArr9 = (InstallReferrerResult[]) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    installReferrerResultArr5 = installReferrerResultArr9;
                    await5 = obj;
                    installReferrerResultArr6[i4] = (InstallReferrerResult) await5;
                    List listOf = CollectionsKt.listOf((Object[]) installReferrerResultArr5);
                    InstallReferrerResult latestValidReferrerStore = InstallReferrersKt.getLatestValidReferrerStore(listOf);
                    BranchLogger.v("All Install Referrers: " + listOf);
                    BranchLogger.v("Latest Install Referrer: " + latestValidReferrerStore);
                    return latestValidReferrerStore;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = this.I$0;
            InstallReferrerResult[] installReferrerResultArr10 = (InstallReferrerResult[]) this.L$2;
            installReferrerResultArr5 = (InstallReferrerResult[]) this.L$1;
            Deferred deferred10 = (Deferred) this.L$0;
            ResultKt.throwOnFailure(obj);
            i3 = 4;
            i2 = i8;
            deferred3 = deferred10;
            installReferrerResultArr4 = installReferrerResultArr10;
            await4 = obj;
            installReferrerResultArr4[i2] = (InstallReferrerResult) await4;
            this.L$0 = installReferrerResultArr5;
            this.L$1 = installReferrerResultArr5;
            this.L$2 = null;
            this.I$0 = i3;
            this.label = 5;
            await5 = deferred3.await(this);
            if (await5 != coroutine_suspended) {
                i4 = i3;
                installReferrerResultArr6 = installReferrerResultArr5;
                installReferrerResultArr6[i4] = (InstallReferrerResult) await5;
                List listOf2 = CollectionsKt.listOf((Object[]) installReferrerResultArr5);
                InstallReferrerResult latestValidReferrerStore2 = InstallReferrersKt.getLatestValidReferrerStore(listOf2);
                BranchLogger.v("All Install Referrers: " + listOf2);
                BranchLogger.v("Latest Install Referrer: " + latestValidReferrerStore2);
                return latestValidReferrerStore2;
            }
            return coroutine_suspended;
        }
        int i9 = this.I$0;
        installReferrerResultArr2 = (InstallReferrerResult[]) this.L$5;
        installReferrerResultArr = (InstallReferrerResult[]) this.L$4;
        deferred3 = (Deferred) this.L$3;
        Deferred deferred11 = (Deferred) this.L$2;
        Deferred deferred12 = (Deferred) this.L$1;
        deferred4 = (Deferred) this.L$0;
        ResultKt.throwOnFailure(obj);
        deferred2 = deferred11;
        deferred = deferred12;
        i = i9;
        await = obj;
        installReferrerResultArr2[i] = (InstallReferrerResult) await;
        this.L$0 = deferred;
        this.L$1 = deferred2;
        this.L$2 = deferred3;
        this.L$3 = installReferrerResultArr;
        this.L$4 = installReferrerResultArr;
        this.L$5 = null;
        this.I$0 = 1;
        this.label = 2;
        await2 = deferred4.await(this);
        if (await2 != coroutine_suspended) {
            deferred5 = deferred;
            installReferrerResultArr3 = installReferrerResultArr;
            installReferrerResultArr[i7] = (InstallReferrerResult) await2;
            this.L$0 = deferred2;
            this.L$1 = deferred3;
            this.L$2 = installReferrerResultArr3;
            this.L$3 = installReferrerResultArr3;
            this.L$4 = null;
            this.I$0 = 2;
            this.label = 3;
            await3 = deferred5.await(this);
            if (await3 != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
