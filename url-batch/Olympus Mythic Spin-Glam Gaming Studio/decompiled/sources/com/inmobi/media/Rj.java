package com.inmobi.media;

import android.widget.ImageView;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes13.dex */
public final class Rj extends ContinuationImpl {
    public List a;
    public ImageView b;
    public Ref$BooleanRef c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Vj e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rj(Vj vj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = vj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((List) null, (ImageView) null, this);
    }
}
