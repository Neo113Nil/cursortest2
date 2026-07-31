package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes13.dex */
public final class R3 extends SuspendLambda implements Function2 {
    public S3 a;
    public Iterator b;
    public Ll c;
    public Iterator d;
    public int e;
    public final /* synthetic */ S3 f;
    public final /* synthetic */ ArrayList g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R3(S3 s3, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f = s3;
        this.g = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new R3(this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new R3(this.f, this.g, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:27:0x00c7
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0091 A[Catch: pc -> 0x001a, IllegalArgumentException -> 0x001d, TryCatch #3 {pc -> 0x001a, IllegalArgumentException -> 0x001d, blocks: (B:6:0x0015, B:7:0x0083, B:9:0x0091, B:10:0x00a5), top: B:5:0x0015 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007d -> B:7:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00eb -> B:18:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ed -> B:18:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0048 -> B:18:0x0058). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.R3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
