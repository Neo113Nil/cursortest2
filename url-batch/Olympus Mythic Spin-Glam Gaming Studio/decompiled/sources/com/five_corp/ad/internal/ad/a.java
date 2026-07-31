package com.five_corp.ad.internal.ad;

import com.five_corp.ad.CreativeType;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class a {
    public final String A;
    public final ArrayList B;
    public final c C;
    public final CreativeType a;
    public final String b;
    public final Long c;
    public final int d;
    public final d e;
    public final g f;
    public final String g;
    public final h h;
    public final Long i;
    public final h j;
    public final h k;
    public final h l;
    public final com.five_corp.ad.internal.ad.information_icon.e m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final ArrayList s;
    public final ArrayList t;
    public final ArrayList u;
    public final com.five_corp.ad.internal.ad.beacon.j v;
    public final com.five_corp.ad.internal.ad.beacon.f w;
    public final com.five_corp.ad.internal.ad.beacon.f x;
    public final ArrayList y;
    public final j z;

    public a(CreativeType creativeType, String str, Long l, int i, d dVar, g gVar, String str2, h hVar, Long l2, h hVar2, h hVar3, h hVar4, com.five_corp.ad.internal.ad.information_icon.e eVar, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, com.five_corp.ad.internal.ad.beacon.j jVar, com.five_corp.ad.internal.ad.beacon.f fVar, com.five_corp.ad.internal.ad.beacon.f fVar2, ArrayList arrayList4, j jVar2, String str8, ArrayList arrayList5, c cVar) {
        this.a = creativeType;
        this.b = str;
        this.c = l;
        this.d = i;
        this.e = dVar;
        this.f = gVar;
        this.g = str2;
        this.h = hVar;
        this.i = l2;
        this.j = hVar2;
        this.k = hVar3;
        this.l = hVar4;
        this.m = eVar;
        this.n = str3;
        this.o = str4;
        this.p = str5;
        this.q = str6;
        this.r = str7;
        this.s = arrayList;
        this.t = arrayList2;
        this.u = arrayList3;
        this.v = jVar;
        this.w = fVar;
        this.x = fVar2;
        this.y = arrayList4;
        this.z = jVar2;
        this.A = str8;
        this.B = arrayList5;
        this.C = cVar;
    }

    public static com.five_corp.ad.internal.ad.format_config.a a(a aVar, String str) {
        if (aVar != null && str != null) {
            Iterator it = aVar.s.iterator();
            Integer num = null;
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (str.equals(iVar.a)) {
                    num = Integer.valueOf(iVar.b);
                }
            }
            if (num == null) {
                return null;
            }
            Iterator it2 = aVar.t.iterator();
            while (it2.hasNext()) {
                com.five_corp.ad.internal.ad.format_config.a aVar2 = (com.five_corp.ad.internal.ad.format_config.a) it2.next();
                if (num.equals(Integer.valueOf(aVar2.a))) {
                    return aVar2;
                }
            }
        }
        return null;
    }
}
