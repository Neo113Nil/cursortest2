package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ml, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5522ml {
    public final Cdo a;
    public final InterfaceC5512mb b;

    public C5522ml(C5582p3 c5582p3, C5340fk c5340fk) {
        this.a = c5582p3;
        this.b = c5340fk;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Si a(long j, C5848z9 c5848z9, List list, C5804xh c5804xh, int i, C5311eh c5311eh) {
        C5822y9 c5822y9;
        int i2;
        C5562o9 c5562o9;
        boolean z = true;
        ArrayList arrayList = new ArrayList();
        int i3 = c5311eh.a;
        int i4 = c5311eh.b;
        Integer num = c5311eh.c;
        Iterator it = list.iterator();
        int i5 = i4;
        C5449k0 c5449k0 = null;
        int i6 = i3;
        Integer num2 = num;
        while (it.hasNext()) {
            ContentValues contentValues = (ContentValues) it.next();
            if (i5 >= 100) {
                break;
            }
            C5381h9 c5381h9 = new C5381h9(contentValues);
            try {
                EnumC5798xb enumC5798xb = c5381h9.h;
                if (enumC5798xb != null) {
                    c5562o9 = (C5562o9) AbstractC5465kg.d.get(enumC5798xb);
                } else {
                    Map map = AbstractC5465kg.a;
                    c5562o9 = null;
                }
                if (c5562o9 == null) {
                    c5562o9 = C5562o9.i;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                c5822y9 = c5562o9.a(c5381h9, c5804xh);
            } catch (Throwable th2) {
                th = th2;
                this.b.reportError("protobuf_serialization_error", th);
                c5822y9 = null;
                if (c5822y9 == null) {
                }
                i5++;
            }
            if (c5822y9 == null) {
                String str = c5381h9.u;
                C5449k0 c5449k02 = new C5449k0(str, c5381h9.v);
                if (c5449k0 != null) {
                    if (!Intrinsics.areEqual(c5449k0, c5449k02)) {
                        break;
                    }
                } else {
                    if (num2 == null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            Iterator<String> keys = jSONObject.keys();
                            i2 = 0;
                            while (keys.hasNext()) {
                                String next = keys.next();
                                try {
                                    C5666s9 c5666s9 = new C5666s9();
                                    c5666s9.a = next;
                                    c5666s9.b = jSONObject.getString(next);
                                    i2 += CodedOutputByteBufferNano.computeMessageSize(7, c5666s9);
                                } catch (Throwable unused) {
                                }
                            }
                        } catch (Throwable unused2) {
                            i2 = 0;
                        }
                        num2 = Integer.valueOf(i2);
                        i6 += i2;
                    }
                    c5449k0 = c5449k02;
                }
                byte[] bArr = (byte[]) this.a.a(c5822y9.e);
                byte[] bArr2 = c5822y9.e;
                if (bArr2 != bArr) {
                    c5822y9.i = ((bArr2 != null ? bArr2.length : 0) - (bArr != null ? bArr.length : 0)) + c5822y9.i;
                    c5822y9.e = bArr;
                }
                i6 += CodedOutputByteBufferNano.computeMessageSize(3, c5822y9);
                if (arrayList.isEmpty() && i == 0) {
                    if (i6 >= 1048576) {
                        break;
                    }
                    arrayList.add(c5822y9);
                } else {
                    if (i6 >= 250880) {
                        break;
                    }
                    arrayList.add(c5822y9);
                }
            }
            i5++;
        }
        z = false;
        if (arrayList.isEmpty()) {
            return null;
        }
        A9 a9 = new A9();
        a9.a = j;
        a9.b = c5848z9;
        a9.c = (C5822y9[]) arrayList.toArray(new C5822y9[0]);
        return new Si(a9, c5449k0, z, i6, i5, num2);
    }
}
