package com.five_corp.ad.internal.beacon;

import com.five_corp.ad.internal.context.s;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class a {
    public final com.five_corp.ad.internal.context.g a;
    public final com.five_corp.ad.internal.context.f b;
    public final com.five_corp.ad.internal.ad.a c;
    public final com.five_corp.ad.internal.tracking_data.a d;
    public final int e;
    public final com.five_corp.ad.internal.soundstate.a f;
    public final f g;
    public final long h;
    public final long i;
    public final double j;
    public com.five_corp.ad.internal.ad.beacon.a k;
    public HashMap l;

    public a(com.five_corp.ad.internal.context.h hVar, int i, com.five_corp.ad.internal.soundstate.a aVar, long j, double d) {
        long j2;
        com.five_corp.ad.internal.ad.a aVar2 = hVar.a;
        s sVar = hVar.c;
        com.five_corp.ad.internal.tracking_data.a aVar3 = sVar.d;
        com.five_corp.ad.internal.context.g gVar = sVar.a;
        com.five_corp.ad.internal.context.f fVar = hVar.e;
        f fVar2 = hVar.h;
        synchronized (hVar) {
            j2 = hVar.i;
        }
        this.d = aVar3;
        this.a = gVar;
        this.b = fVar;
        this.c = aVar2;
        this.e = i;
        this.f = aVar;
        this.g = fVar2;
        this.h = j;
        this.i = j2;
        this.j = d;
    }
}
