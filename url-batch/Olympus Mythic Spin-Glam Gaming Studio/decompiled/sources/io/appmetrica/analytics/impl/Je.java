package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class Je implements InterfaceC5717u8 {
    public final Ne a;
    public final A3 b;
    public final Sa c;
    public final C5310eg d;

    public Je() {
        this(new Ne(), new A3(), new Sa(100), new C5310eg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Qi> fromModel(@NonNull Ie ie) {
        Qi qi;
        N8 n8 = new N8();
        n8.a = ie.a;
        n8.f = new C8();
        Ke ke = ie.b;
        A8 a8 = new A8();
        a8.a = StringUtils.getUTF8Bytes(ke.a);
        C5318eo a = this.c.a(ke.b);
        a8.b = StringUtils.getUTF8Bytes((String) a.a);
        a8.e = ke.c.size();
        Map<String, String> map = ke.d;
        if (map != null) {
            qi = this.a.fromModel(map);
            a8.c = (E8) qi.a;
        } else {
            qi = null;
        }
        n8.f.a = a8;
        C5609q3 c5609q3 = new C5609q3(C5609q3.b(a, qi));
        List list = ke.c;
        ArrayList arrayList = new ArrayList();
        this.d.getClass();
        int computeInt32Size = n8.a != new N8().a ? CodedOutputByteBufferNano.computeInt32Size(1, n8.a) : 0;
        M8 m8 = n8.b;
        if (m8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, m8);
        }
        K8 k8 = n8.c;
        if (k8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, k8);
        }
        L8 l8 = n8.d;
        int i = 4;
        if (l8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, l8);
        }
        C5769w8 c5769w8 = n8.e;
        if (c5769w8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c5769w8);
        }
        C8 c8 = n8.f;
        if (c8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c8);
        }
        ArrayList arrayList2 = new ArrayList();
        N8 n82 = new N8();
        n82.a = n8.a;
        C8 c82 = new C8();
        n82.f = c82;
        c82.a = new A8();
        A8 a82 = n82.f.a;
        A8 a83 = n8.f.a;
        a82.b = a83.b;
        a82.a = a83.a;
        a82.e = a83.e;
        a82.c = a83.c;
        int i2 = 0;
        C5609q3 c5609q32 = c5609q3;
        int i3 = computeInt32Size;
        while (i2 < list.size()) {
            B3 b3 = (B3) list.get(i2);
            B8 b8 = new B8();
            b8.a = i2;
            Qi fromModel = this.b.fromModel(b3);
            b8.b = (C5795x8) fromModel.a;
            fromModel.b.getBytesTruncated();
            Qi qi2 = new Qi(b8, fromModel);
            C5310eg c5310eg = this.d;
            B8 b82 = (B8) qi2.a;
            c5310eg.getClass();
            int computeTagSize = CodedOutputByteBufferNano.computeTagSize(i);
            int computeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(b82);
            int computeRawVarint32Size = computeTagSize + computeMessageSizeNoTag + ((computeMessageSizeNoTag & (-128)) == 0 ? 0 : CodedOutputByteBufferNano.computeRawVarint32Size(computeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i3 + computeRawVarint32Size > 204800) {
                n82.f.a.d = (B8[]) arrayList2.toArray(new B8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Qi(n82, c5609q32));
                N8 n83 = new N8();
                n83.a = n8.a;
                C8 c83 = new C8();
                n83.f = c83;
                c83.a = new A8();
                A8 a84 = n83.f.a;
                A8 a85 = n8.f.a;
                a84.b = a85.b;
                a84.a = a85.a;
                a84.e = a85.e;
                a84.c = a85.c;
                c5609q32 = c5609q3;
                i3 = computeInt32Size;
                n82 = n83;
                arrayList2 = arrayList3;
            }
            arrayList2.add((B8) qi2.a);
            c5609q32 = new C5609q3(C5609q3.b(c5609q32, qi2.b));
            i3 += computeRawVarint32Size;
            i2++;
            i = 4;
        }
        n82.f.a.d = (B8[]) arrayList2.toArray(new B8[arrayList2.size()]);
        arrayList.add(new Qi(n82, c5609q32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Je(Ne ne, A3 a3, Sa sa, C5310eg c5310eg) {
        this.a = ne;
        this.b = a3;
        this.c = sa;
        this.d = c5310eg;
    }

    @NonNull
    public final Ie a(@NonNull List<Qi> list) {
        throw new UnsupportedOperationException();
    }
}
