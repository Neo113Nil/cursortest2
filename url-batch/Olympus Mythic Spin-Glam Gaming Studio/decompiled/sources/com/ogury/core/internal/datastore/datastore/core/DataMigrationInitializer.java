package com.ogury.core.internal.datastore.datastore.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ogury/core/internal/datastore/datastore/core/DataMigrationInitializer;", "T", "", "()V", "Companion", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DataMigrationInitializer<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u000f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ogury/core/internal/datastore/datastore/core/DataMigrationInitializer$Companion;", "", "<init>", "()V", "T", "", "Lcom/ogury/core/internal/datastore/datastore/core/DataMigration;", "migrations", "Lcom/ogury/core/internal/datastore/datastore/core/InitializerApi;", "api", "", "runMigrations", "(Ljava/util/List;Lcom/ogury/core/internal/datastore/datastore/core/InitializerApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "getInitializer", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0086 -> B:13:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0089 -> B:13:0x0069). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final <T> Object runMigrations(List<? extends DataMigration<T>> list, InitializerApi<T> initializerApi, Continuation continuation) {
            DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
            int i;
            List list2;
            Ref$ObjectRef ref$ObjectRef;
            Iterator<T> it;
            Throwable th;
            if (continuation instanceof DataMigrationInitializer$Companion$runMigrations$1) {
                dataMigrationInitializer$Companion$runMigrations$1 = (DataMigrationInitializer$Companion$runMigrations$1) continuation;
                int i2 = dataMigrationInitializer$Companion$runMigrations$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dataMigrationInitializer$Companion$runMigrations$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = dataMigrationInitializer$Companion$runMigrations$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataMigrationInitializer$Companion$runMigrations$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ArrayList arrayList = new ArrayList();
                        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(list, arrayList, null);
                        dataMigrationInitializer$Companion$runMigrations$1.L$0 = arrayList;
                        dataMigrationInitializer$Companion$runMigrations$1.label = 1;
                        if (initializerApi.updateData(dataMigrationInitializer$Companion$runMigrations$2, dataMigrationInitializer$Companion$runMigrations$1) != coroutine_suspended) {
                            list2 = arrayList;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) dataMigrationInitializer$Companion$runMigrations$1.L$1;
                        ref$ObjectRef = (Ref$ObjectRef) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable 
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                            	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:369)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:332)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            */
                        /*
                            this = this;
                            boolean r0 = r9 instanceof com.ogury.core.internal.datastore.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                            if (r0 == 0) goto L13
                            r0 = r9
                            com.ogury.core.internal.datastore.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = (com.ogury.core.internal.datastore.datastore.core.DataMigrationInitializer$Companion$runMigrations$1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.ogury.core.internal.datastore.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = new com.ogury.core.internal.datastore.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                            r0.<init>(r6, r9)
                        L18:
                            java.lang.Object r9 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.label
                            r3 = 2
                            r4 = 1
                            if (r2 == 0) goto L46
                            if (r2 == r4) goto L3e
                            if (r2 != r3) goto L36
                            java.lang.Object r7 = r0.L$1
                            java.util.Iterator r7 = (java.util.Iterator) r7
                            java.lang.Object r8 = r0.L$0
                            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref$ObjectRef) r8
                            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L34
                            goto L69
                        L34:
                            r9 = move-exception
                            goto L82
                        L36:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r8)
                            throw r7
                        L3e:
                            java.lang.Object r7 = r0.L$0
                            java.util.List r7 = (java.util.List) r7
                            kotlin.ResultKt.throwOnFailure(r9)
                            goto L60
                        L46:
                            kotlin.ResultKt.throwOnFailure(r9)
                            java.util.ArrayList r9 = new java.util.ArrayList
                            r9.<init>()
                            com.ogury.core.internal.datastore.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r2 = new com.ogury.core.internal.datastore.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
                            r5 = 0
                            r2.<init>(r7, r9, r5)
                            r0.L$0 = r9
                            r0.label = r4
                            java.lang.Object r7 = r8.updateData(r2, r0)
                            if (r7 != r1) goto L5f
                            goto L81
                        L5f:
                            r7 = r9
                        L60:
                            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
                            r8.<init>()
                            java.util.Iterator r7 = r7.iterator()
                        L69:
                            boolean r9 = r7.hasNext()
                            if (r9 == 0) goto L92
                            java.lang.Object r9 = r7.next()
                            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
                            r0.L$0 = r8     // Catch: java.lang.Throwable -> L34
                            r0.L$1 = r7     // Catch: java.lang.Throwable -> L34
                            r0.label = r3     // Catch: java.lang.Throwable -> L34
                            java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                            if (r9 != r1) goto L69
                        L81:
                            return r1
                        L82:
                            T r2 = r8.element
                            if (r2 != 0) goto L89
                            r8.element = r9
                            goto L69
                        L89:
                            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                            java.lang.Throwable r2 = (java.lang.Throwable) r2
                            kotlin.ExceptionsKt.addSuppressed(r2, r9)
                            goto L69
                        L92:
                            T r7 = r8.element
                            java.lang.Throwable r7 = (java.lang.Throwable) r7
                            if (r7 != 0) goto L9b
                            kotlin.Unit r7 = kotlin.Unit.INSTANCE
                            return r7
                        L9b:
                            throw r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ogury.core.internal.datastore.datastore.core.DataMigrationInitializer.Companion.runMigrations(java.util.List, com.ogury.core.internal.datastore.datastore.core.InitializerApi, kotlin.coroutines.Continuation):java.lang.Object");
                    }

                    @NotNull
                    public final <T> Function2 getInitializer(@NotNull List<? extends DataMigration<T>> migrations) {
                        Intrinsics.checkNotNullParameter(migrations, "migrations");
                        return new DataMigrationInitializer$Companion$getInitializer$1(migrations, null);
                    }

                    private Companion() {
                    }
                }
            }
